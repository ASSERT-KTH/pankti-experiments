#!/bin/bash

# define or replace $SITE_APPLICATION_PID first (one can use jps to find out the pid)
top -b | grep $SITE_APPLICATION_PID --line-buffered >> top_normal.log 2>&1 &
sleep 1

# need to install ab first (sudo apt-get install apache2-utils)
for i in {1..5}
do
  echo "Round $i"
  ab -t 10 -n 100 http://localhost:8080/ >> ab_normal.log 2>&1
  echo "Done"
  sleep 3
done

killall top