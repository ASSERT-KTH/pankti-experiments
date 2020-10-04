package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPDFontDescriptorPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetFlags1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(32, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-628</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-376</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2034</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1048</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-BoldMT</name>" +
        "          <hashCode>946210742</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>138</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>905</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-665</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1037</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialMT</name>" +
        "          <hashCode>921886026</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>88</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>905</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>96</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(96, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags6() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-BoldItalic</name>" +
        "          <hashCode>162006588</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags7() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags8() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Bold</name>" +
        "          <hashCode>-659078932</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags9() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>98</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(98, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(34, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags11() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>136</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-BoldMT</name>" +
        "          <hashCode>946210742</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-376</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-628</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-376</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1010</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags12() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Bold</name>" +
        "          <hashCode>-659078932</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(32, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags14() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica</name>" +
        "          <hashCode>-816292751</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(32, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags16() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-Oblique</name>" +
        "          <hashCode>-1630228911</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags17() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags18() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>98</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>98</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(98, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags19() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica</name>" +
        "          <hashCode>-816292751</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags20() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-Bold</name>" +
        "          <hashCode>-923889023</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags21() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-BoldOblique</name>" +
        "          <hashCode>1468992524</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags22() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-Bold</name>" +
        "          <hashCode>-923889023</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags23() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-BoldOblique</name>" +
        "          <hashCode>1468992524</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags24() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-BoldOblique</name>" +
        "          <hashCode>-1278518160</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags25() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier</name>" +
        "          <hashCode>-1672374771</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags26() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags27() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-ItalicMT</name>" +
        "          <hashCode>-2073903583</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>96</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-325</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-517</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1082</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>998</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>998</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-12</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>96</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(96, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags28() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-Bold</name>" +
        "          <hashCode>2114255461</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags29() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags30() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-BoldOblique</name>" +
        "          <hashCode>-1278518160</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags31() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-Oblique</name>" +
        "          <hashCode>1148244149</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags32() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier</name>" +
        "          <hashCode>-1672374771</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags33() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Roman</name>" +
        "          <hashCode>1058166902</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags34() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-BoldItalic</name>" +
        "          <hashCode>162006588</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags35() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>88</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialMT</name>" +
        "          <hashCode>921886026</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-325</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-665</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1006</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1006</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags36() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ZapfDingbats</name>" +
        "          <hashCode>508452761</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>WmFwZkRpbmdiYXRz</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags37() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ZapfDingbats</name>" +
        "          <hashCode>508452761</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>WmFwZkRpbmdiYXRz</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>0</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags38() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>96</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(96, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags40() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Helvetica-Oblique</name>" +
        "          <hashCode>1148244149</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>SGVsdmV0aWNh</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags41() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Symbol</name>" +
        "          <hashCode>-1803656776</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>U3ltYm9s</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags42() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Symbol</name>" +
        "          <hashCode>-1803656776</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>U3ltYm9s</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>0</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags43() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>34</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(34, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags44() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-Oblique</name>" +
        "          <hashCode>-1630228911</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags45() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>96</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(96, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags47() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Courier-Bold</name>" +
        "          <hashCode>2114255461</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>Q291cmllcg==</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(34, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFlags49() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Italic</name>" +
        "          <hashCode>-1809956137</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags50() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags51() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Roman</name>" +
        "          <hashCode>1058166902</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>0</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(0, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags52() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Times-Italic</name>" +
        "          <hashCode>-1809956137</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>false</direct>" +
        "          <bytes>VGltZXM=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>false</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>32</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(32, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags53() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>34</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>34</int>";
        int expectedObject = (Integer) xStream.fromXML(returnedXML);
        Assert.assertEquals(34, receivingObject.getFlags());
    }

    @Test
    public void testGetFlags54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFlags54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            Assert.assertEquals(32, receivingObject.getFlags());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-665</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1037</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialMT</name>" +
        "          <hashCode>921886026</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>88</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>905</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-ItalicMT</name>" +
        "          <hashCode>-2073903583</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>96</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-325</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-517</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1082</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>998</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>998</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-12</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic7() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic8() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>34</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic13() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>88</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialMT</name>" +
        "          <hashCode>921886026</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-325</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-665</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-325</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1006</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1006</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic14() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic15() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>98</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSymbolic16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.isSymbolic());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testIsSymbolic17() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>136</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-BoldMT</name>" +
        "          <hashCode>946210742</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-376</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-628</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-376</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1010</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic18() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-628</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-376</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2034</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1048</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-BoldMT</name>" +
        "          <hashCode>946210742</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>138</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>905</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWw=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic19() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsSymbolic20() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSymbolic());
    }

    @Test
    public void testIsFixedPitch1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsFixedPitch2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsFixedPitch3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsFixedPitch4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsFixedPitch5() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsFixedPitch6() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>-1</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isFixedPitch());
    }

    @Test
    public void testIsSerif1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>98</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.isSerif());
    }

    @Test
    public void testIsSerif2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSerif());
    }

    @Test
    public void testIsSerif3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSerif());
    }

    @Test
    public void testIsSerif4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSerif());
    }

    @Test
    public void testIsSerif5() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>34</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.isSerif());
    }

    @Test
    public void testIsSerif6() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isSerif());
    }

    @Test
    public void testIsItalic1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-498</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1120</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1023</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPS-ItalicMT</name>" +
        "          <hashCode>1091303198</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>98</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>71.742004</value>" +
        "          <valueAsString>71.742004</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-15</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>98</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.isItalic());
    }

    @Test
    public void testIsItalic2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>200</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Arial-Black</name>" +
        "          <hashCode>1692990965</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-307</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-194</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1688</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1083</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1083</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgQmxhY2s=</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>519</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>716</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isItalic());
    }

    @Test
    public void testIsItalic3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-101</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-270</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1010</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>980</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS-Bold</name>" +
        "          <hashCode>-751382594</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>122</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isItalic());
    }

    @Test
    public void testIsItalic4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-568</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>2028</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1007</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TimesNewRomanPSMT</name>" +
        "          <hashCode>-551086355</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>34</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>82</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>656</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>891</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-216</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger[4]\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VGltZXMgTmV3IFJvbWFu</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>34</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isItalic());
    }

    @Test
    public void testIsItalic5() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-86</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-262</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>958</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>939</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>TrebuchetMS</name>" +
        "          <hashCode>-1023144684</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>92</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>938</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-222</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>VHJlYnVjaGV0IE1T</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>400</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isItalic());
    }

    @Test
    public void testIsItalic6() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.PDFontDescriptor>" +
        "  <dic>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Type</name>" +
        "          <hashCode>2622298</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>FontDescriptor</name>" +
        "          <hashCode>1034006846</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontBBox</name>" +
        "          <hashCode>429700888</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSArray>" +
        "          <direct>true</direct>" +
        "          <objects>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-137</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>-307</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1000</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "            <org.apache.pdfbox.cos.COSInteger>" +
        "              <direct>false</direct>" +
        "              <value>1109</value>" +
        "            </org.apache.pdfbox.cos.COSInteger>" +
        "          </objects>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "        </org.apache.pdfbox.cos.COSArray>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontName</name>" +
        "          <hashCode>430088090</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>ArialNarrow-Bold</name>" +
        "          <hashCode>-2146597772</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Flags</name>" +
        "          <hashCode>67960423</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>32</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>StemV</name>" +
        "          <hashCode>80208525</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>112</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CapHeight</name>" +
        "          <hashCode>-812484743</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>718</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>XHeight</name>" +
        "          <hashCode>-1346249825</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>515</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Ascent</name>" +
        "          <hashCode>1970149626</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>935</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>Descent</name>" +
        "          <hashCode>-1073460070</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>-211</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ItalicAngle</name>" +
        "          <hashCode>-2037328797</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>0</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontFamily</name>" +
        "          <hashCode>768768179</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSString>" +
        "          <direct>true</direct>" +
        "          <bytes>QXJpYWwgTmFycm93</bytes>" +
        "          <forceHexForm>false</forceHexForm>" +
        "        </org.apache.pdfbox.cos.COSString>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontStretch</name>" +
        "          <hashCode>1558082454</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Condensed</name>" +
        "          <hashCode>1138792711</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>FontWeight</name>" +
        "          <hashCode>1259036615</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>700</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dic>" +
        "  <xHeight>-Infinity</xHeight>" +
        "  <capHeight>-Infinity</capHeight>" +
        "  <flags>32</flags>" +
        "</org.apache.pdfbox.pdmodel.font.PDFontDescriptor>";
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = (org.apache.pdfbox.pdmodel.font.PDFontDescriptor) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.isItalic());
    }
}