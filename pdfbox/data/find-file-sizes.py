import os
import pandas as pd
import glob

# Replace with path to report without file sizes
df = pd.read_csv('../execution/report.csv')
# Replace with path for object-data directory
files = glob.glob("/tmp/pankti-object-data-pdfbox/*.xml")

average_sizes = []
total_average_size = 0
for index, row in df.iterrows():
    found = [i for i,x in enumerate(files) if row['method'] in x]
    size = 0
    for i in range(len(found)):
        size += os.path.getsize(files[found[i]])
    # in KB
    average_size = (size/row['collected-profiles'])/1000
    total_average_size += average_size
    average_sizes.append(average_size)
average_sizes[-1] = total_average_size
df['avg-size-on-disk-kb'] = average_sizes

df.to_csv(r'./report-file-sizes.csv', index=False)

