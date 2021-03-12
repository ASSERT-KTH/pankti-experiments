#!/bin/bash

: '
This script computes the average cpu time (user)
of `mvn clean test` over 5 executions
'

N=5
durations=()
TOTAL=0

for ((i=0;i<N;i++)); do
  echo "Execution $i"
  command="mvn clean test"
  saved_timing=`mktemp`
  /usr/bin/time --format %U -o "$saved_timing" $command
  duration=$(cat "$saved_timing")
  echo "Execution $i done in $duration seconds"
  durations+=( $duration )
done

echo "Durations:"
printf '%s\n' "${durations[@]}"

for each in "${durations[@]}"
do
  TOTAL=$(echo "$TOTAL + $each" | bc )
done

echo "Total CPU (user) time across $N executions: $TOTAL seconds"

AVERAGE=$(bc -l <<< $TOTAL/$N)
echo "Average CPU (user) time across $N executions: $AVERAGE seconds"

