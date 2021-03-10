#!/bin/bash
# define workload PDFs
workloads=(./workload/000752 ./workload/000753 ./workload/000809 ./workload/000810 ./workload/000817)
overlay_pdf="./workload/000142"
extension=".pdf"
jacocoagent_jar_loc="/home/user/dev/jacoco/lib/jacocoagent.jar"
jacococli_jar_loc="/home/user/dev/jacoco/lib/jacococli.jar"
pdfbox_jar_loc="/home/user/dev/revision/pdfbox/app/target/pdfbox-app-2.0.21.jar"
jacoco_exec_loc="/home/user/dev/revision/pdfbox/app/target/jacoco.exec"
jacocoagent_options="=append=true,destfile="${jacoco_exec_loc}

classfiles="--classfiles /home/user/dev/revision/pdfbox/fontbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/pdfbox/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/examples/target/classes/org --classfiles /home/user/dev/revision/pdfbox/tools/target/classes/org --classfiles /home/user/dev/revision/pdfbox/preflight/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/debugger/target/classes/org/ --classfiles /home/user/dev/revision/pdfbox/xmpbox/target/classes/org/"

sourcefiles="--sourcefiles /home/user/dev/revision/pdfbox/fontbox/src/main/java --sourcefiles /home/user/dev/revision/pdfbox/pdfbox/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/examples/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/tools/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/preflight/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/debugger/src/main/java/ --sourcefiles /home/user/dev/revision/pdfbox/xmpbox/src/main/java/"

jacoco_report_loc="/home/user/dev/revision/pdfbox/app/target/jacoco-report"

# remove pre-existing jacoco.exec file and jacoco html reports
echo "Removing pre-existing jacoco.exec and jacoco html reports"
rm -f ${jacoco_exec_loc}
rm -rf ${jacoco_report_loc}

# execute PDFBox functionalities for each workload
for i in ${workloads[@]}
do
  # Encrypt
  echo "Encrypt " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} Encrypt -O 123 -U 123 ${i}${extension} ${i}-locked${extension}
  sleep 10s

  # Decrypt
  echo "Decrypt " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} Decrypt -password 123 ${i}-locked${extension} ${i}-unlocked${extension}
  sleep 10s

  # ExtractText
  echo "ExtractText " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} ExtractText -password 123 -sort ${i}-locked${extension} ${i}-from-pdf.txt
  sleep 10s

  # ExtractImages
  echo "ExtractImages " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} ExtractImages -password 123 -directJPEG ${i}-locked${extension}
  sleep 10s

  # PDFToImage
  echo "PDFToImage " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} PDFToImage -password 123 -imageType png -outputPrefix workloadAsImage -time ${i}-locked${extension}
  sleep 10s

  # TextToPDF
  echo "TextToPDF " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} TextToPDF -standardFont Helvetica-BoldOblique -fontSize 18 ${i}-from-txt${extension} ${i}-from-pdf.txt
  sleep 10s

  # PDFSplit
  echo "PDFSplit " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc}  PDFSplit -password 123 -split 1 ${i}-locked${extension}
  sleep 10s

  # PDFMerger
  echo "PDFMerger " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} PDFMerger ${i}-locked-*${extension} ${i}-merged${extension}
  sleep 10s

  # WriteDecodedDoc
  echo "WriteDecodedDoc " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} WriteDecodedDoc -password 123 ${i}-locked${extension} ${i}-decoded${extension}
  sleep 10s

  # OverlayPDF
  echo "OverlayPDF " ${i}${extension}
  java -javaagent:${jacocoagent_jar_loc}${jacocoagent_options} -jar ${pdfbox_jar_loc} OverlayPDF ${i}${extension} ${overlay_pdf}${extension} -position foreground ${i}-overlaid${extension}
  sleep 10s
done

# generate workload coverage report
echo "Generating coverage report"
java -jar ${jacococli_jar_loc} report ${jacoco_exec_loc} ${classfiles} ${sourcefiles} --html ${jacoco_report_loc}
echo "Generated coverage report " ${jacoco_report_loc}

