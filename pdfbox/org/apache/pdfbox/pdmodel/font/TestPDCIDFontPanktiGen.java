package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPDCIDFontPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetCIDSystemInfo1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFont.getCIDSystemInfo1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo>" +
            "  <dictionary>" +
            "    <direct>true</direct>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "      <mapArr>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>Registry</name>" +
            "          <hashCode>-625568675</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSString>" +
            "          <direct>true</direct>" +
            "          <bytes>QWRvYmU=</bytes>" +
            "          <forceHexForm>false</forceHexForm>" +
            "        </org.apache.pdfbox.cos.COSString>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>Ordering</name>" +
            "          <hashCode>1298958836</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSString>" +
            "          <direct>true</direct>" +
            "          <bytes>SWRlbnRpdHk=</bytes>" +
            "          <forceHexForm>false</forceHexForm>" +
            "        </org.apache.pdfbox.cos.COSString>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>Supplement</name>" +
            "          <hashCode>1281471705</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>0</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dictionary>" +
            "</org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo>";
            org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo expectedObject = (org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject.toString(), receivingObject.getCIDSystemInfo().toString());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}