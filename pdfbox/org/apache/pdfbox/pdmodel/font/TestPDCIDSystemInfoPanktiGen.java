package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestPDCIDSystemInfoPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

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
        PDCIDSystemInfo receivingObject = (PDCIDSystemInfo) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Adobe</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
        PDCIDSystemInfo receivingObject = (PDCIDSystemInfo) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>Identity</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOrdering());
    }
}