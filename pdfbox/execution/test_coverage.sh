#!/bin/bash

jacococli_jar_loc="/home/user/dev/jacoco/lib/jacococli.jar"

classfiles="--classfiles /home/user/dev/revision/pdfbox/fontbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/pdfbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/examples/target/classes/org --classfiles /home/user/dev/revision/pdfbox/tools/target/classes/org --classfiles /home/user/dev/revision/pdfbox/preflight/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/debugger/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/xmpbox/target/classes/org/"

sourcefiles="--sourcefiles /home/user/dev/revision/pdfbox/fontbox/src/main/java --sourcefiles /home/user/dev/revision/pdfbox/pdfbox/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/examples/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/tools/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/preflight/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/debugger/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/xmpbox/src/main/java/"

jacocoexec_loc="/home/user/dev/revision/pdfbox/tools/target/jacoco.exec /home/user/dev/revision/pdfbox/preflight/target/jacoco.exec /home/user/dev/revision/pdfbox/pdfbox/target/jacoco.exec /home/user/dev/revision/pdfbox/fontbox/target/jacoco.exec /home/user/dev/revision/pdfbox/examples/target/jacoco.exec /home/user/dev/revision/pdfbox/xmpbox/target/jacoco.exec"

jacocoexec_merged_loc="/home/user/jacoco-merged.exec"

jacoco_report_loc="/home/user/jacoco-report"

# Merge all jacoco.exec files
java -jar ${jacococli_jar_loc} merge ${jacocoexec_loc} --destfile ${jacocoexec_merged_loc}

sleep 10s

# Generate report
java -jar  ${jacococli_jar_loc} report ${jacocoexec_merged_loc} ${classfiles} ${sourcefiles} --html ${jacoco_report_loc}

