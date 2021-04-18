#!/bin/bash
# define workload QR jpgs
workloads_qr=(./workload/qr_codes/url.jpg ./workload/qr_codes/email.jpg ./workload/qr_codes/tel.jpg  ./workload/qr_codes/geo.jpg ./workload/qr_codes/sms.jpg ./workload/qr_codes/mecard.jpg ./workload/qr_codes/vcard.jpg ./workload/qr_codes/bizcard.jpg ./workload/qr_codes/calendar.jpg ./workload/qr_codes/wifi.jpg)
workloads_barcode=(./workload/barcodes/code39.png ./workload/barcodes/rss.png ./workload/barcodes/ean13.png ./workload/barcodes/upc.png)

glowroot_jar_loc="/home/user/glowroot/glowroot.jar"
pankti_zxing_jar_loc="./pankti-zxing-3.4.1-jar-with-dependencies.jar"
zxing_jar_loc="./javase-3.4.1-jar-with-dependencies.jar"

# Generate QR JPGs in ./workload/
java -javaagent:${glowroot_jar_loc} -jar ${pankti_zxing_jar_loc} 

# execute ZXing for each QR workload
for i in ${workloads_qr[@]}
do
  echo "Parsing " ${i}
  java -javaagent:${glowroot_jar_loc} -jar ${zxing_jar_loc} ${i}
done

# execute ZXing for each barcode workload
for i in ${workloads_barcode[@]}
do
  echo "Parsing " ${i}
  java -javaagent:${glowroot_jar_loc} -jar ${zxing_jar_loc} ${i}
done

