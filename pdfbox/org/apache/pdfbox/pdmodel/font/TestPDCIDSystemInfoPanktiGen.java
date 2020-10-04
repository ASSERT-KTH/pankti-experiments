package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestPDCIDSystemInfoPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetRegistry1() {
        String receivingXML = 
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
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Adobe</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getRegistry());
    }

    @Test
    public void testGetOrdering1() {
        String receivingXML = 
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
        org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Identity</string>";
        java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOrdering());
    }
}