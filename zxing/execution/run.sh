#!/bin/bash
# define workload QR jpgs
workloads=(./workload/qr_url.jpg ./workload/qr_email.jpg ./workload/qr_tel.jpg  ./workload/qr_geo.jpg ./workload/qr_sms.jpg ./workload/qr_contact_info_mecard.jpg ./workload/qr_contact_info_vcard.jpg ./workload/qr_contact_info_bizcard.jpg ./workload/qr_calendar.jpg )
glowroot_jar_loc="/home/user/glowroot/glowroot.jar"
pankti_zxing_jar_loc="./pankti-zxing-3.4.1-jar-with-dependencies.jar"
zxing_jar_loc="./javase-3.4.1-jar-with-dependencies.jar"

# Generate QR JPGs in ./workload/
java -javaagent:${glowroot_jar_loc} -jar ${pankti_zxing_jar_loc} 

# execute ZXing for each workload
for i in ${workloads[@]}
do
  echo "Parsing " ${i}
  java -javaagent:${glowroot_jar_loc} -jar ${zxing_jar_loc} ${i}
done

