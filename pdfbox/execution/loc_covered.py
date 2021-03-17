from bs4 import BeautifulSoup
from pathlib import Path
import os
import pandas as pd
import re

# Set path of the module in which to look for test classes
module_loc = "/home/user/dev/revision/pdfbox/fontbox"
test_files_loc = module_loc + "/src/test/java/"
jacoco_exec_loc = module_loc + "/target/jacoco.exec"
jacoco_report_loc = module_loc + "/target/jacoco-report/"
generated_html_loc = jacoco_report_loc + "index.html"
output_csv_loc = module_loc + "/unit-test-loc.csv"

# Set jacococli.jar location
jacococli_jar_loc = "/home/user/dev/jacoco/lib/jacococli.jar"

# Set all classfiles and sourcefiles for project
classfiles = "--classfiles /home/user/dev/revision/pdfbox/fontbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/pdfbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/examples/target/classes/org --classfiles /home/user/dev/revision/pdfbox/tools/target/classes/org --classfiles /home/user/dev/revision/pdfbox/preflight/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/debugger/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/xmpbox/target/classes/org/"
sourcefiles = "--sourcefiles /home/user/dev/revision/pdfbox/fontbox/src/main/java --sourcefiles /home/user/dev/revision/pdfbox/pdfbox/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/examples/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/tools/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/preflight/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/debugger/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/xmpbox/src/main/java/"

# Go to module location and mvn clean
def clean_module():
  print("Cleaning...")
  os.system("mvn clean")

# Find all test files in the module
def find_test_files():
  print("Finding all tests in {}...".format(test_files_loc))
  test_files = []
  for path in Path(test_files_loc).rglob('*.java'):
    # Find files with "test" and without "pankti" in their name
    if ("Test".lower() in path.name.lower() and "pankti" not in path.name.lower()):
      test_files.append(path)
  print("Number of test files found: {}".format(len(test_files)))
  return test_files

# Find test methods in each test file
def create_test_df(test_files):
  all_test_data = []
  for i in range(len(test_files)):
    with open(test_files[i], "r") as f:
      for line in f:
        # find lines with *test*(*)
        if (re.search(r'\w*test\w*\((.)*\)', line)):
          dict1 = {}
          method = re.search(r'\w*test\w*', line).group(0)
          dict1.update(file_loc = test_files[i], test_class = test_files[i].name.replace(".java", ""), test_method = method)
          all_test_data.append(dict1)
  df = pd.DataFrame(all_test_data)
  print("Shape of generated dataframe: {}".format(df.shape))
  print("Total number of test methods found: {}".format(df.shape[0]))
  return df

# Run test for each test method, this should also create jacoco.exec in target/
def run_test(test_class, test_method):
  print("Running {}#{}...".format(test_class, test_method))
  test_command = "mvn -Dtest={}#{} test".format(test_class, test_method)
  os.system(test_command)

# Generate jacoco html report
def generate_jacoco_report():
  jacoco_command = "java -jar {} report {} {} {} --html {}".format(jacococli_jar_loc, jacoco_exec_loc, classfiles, sourcefiles, jacoco_report_loc)
  print("Generating JaCoCo report...")
  os.system(jacoco_command)

# Parse generated html report and calculate LOC covered
def parse_jacoco_report():
  with open(generated_html_loc) as fp:
    soup = BeautifulSoup(fp, 'html.parser')
  total_row = soup.tfoot.tr
  missed_lines = int(total_row.contents[7].contents[0].replace(',',''))
  total_lines = int(total_row.contents[8].contents[0].replace(',',''))
  return (total_lines - missed_lines)

def main():
  os.chdir(module_loc)
  clean_module()
  test_files = find_test_files()
  df = create_test_df(test_files)
  coverage = []
  for index, row in df.iterrows():
    run_test(row['test_class'], row['test_method'])
    # Wait 5 seconds
    os.system("sleep 5")
    generate_jacoco_report()
    loc_covered = parse_jacoco_report()
    print("LOC covered by {}#{}: {}".format(row['test_class'], row['test_method'], loc_covered))
    coverage.append(loc_covered)
    # Remove existing jacoco.exec file to isolate results
    clean_module()
  df['loc_covered'] = coverage
  # Save output to CSV file
  df.to_csv(output_csv_loc, index=False)

if __name__ == "__main__":
  main()
