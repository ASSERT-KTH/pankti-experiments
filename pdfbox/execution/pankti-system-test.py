from bs4 import BeautifulSoup
from pathlib import Path
import os
import pandas as pd
import re
import sys

# Set path of the module in which to run tests
module_loc = "/home/user/dev/revision/dspot-experiments/pdfbox/pdfbox"

"""
For pankti to work, ensure that you have the 
pankti-instrument jar added to /path/to/glowroot/plugins/
and the path to the glowroot jar added to pom like so

<plugin>
  <artifactId>maven-surefire-plugin</artifactId>
  <version>x.xx.x</version>
  <configuration>
    <argLine>-javaagent:/path/to/glowroot/glowroot.jar (-otherargs...)</argLine>
  </configuration>
</plugin>

(If the project has multiple modules, add this configuration to all modules
whose pom includes maven-surefire-plugin.
If not, add this configuration for maven-surefire-plugin in the parent pom.)
"""

# mvn clean the module
def clean_module():
  print("Cleaning...")
  os.system("mvn clean")

# Run the selected test method and collect object profiles (default: /tmp/pankti-object-data/)
def run_test(test_class, test_method):
  print("Running test for {}#{}...".format(test_class, test_method))
  test_command = "mvn -Dtest={}#{} test".format(test_class, test_method)
  os.system(test_command)

def main(argv):
  try:
    df = pd.read_csv(argv[1])
    print("Input (rows, columns): {}".format(df.shape))
    print("Number of tests covering >= 1500 LOC: {}".format(df[df.loc_covered >= 1500].shape[0]))
    os.chdir(module_loc)
    # Clean the module before executing tests
    clean_module()
    for index, row in df.iterrows():
      if row['loc_covered'] >= 1500:
        run_test(row['test_class'], row['test_method'])
  except Exception as e:
    print("USAGE: python pankti-system-test.py </path/to/unit/test/loc/list>.csv")
    print(e)
    sys.exit()

if __name__ == "__main__":
  main(sys.argv)
