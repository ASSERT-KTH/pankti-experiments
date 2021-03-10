#!/bin/bash

: '
This script computes the average execution time
of `mvn clean test` over 5 executions
'

N=5
TOTAL=0

for ((i=0;i<N;i++)); do
  echo "Execution $i"
  start=$SECONDS
  mvn clean test
  end=$SECONDS
  duration=$(( end - start ))
  echo "Execution $i done in $duration seconds"
  TOTAL=$((TOTAL + duration))
done

echo "Total across $N executions: $TOTAL seconds"

AVERAGE=$(bc -l <<< $TOTAL/$N)
echo "Average across $N executions: $AVERAGE seconds"

