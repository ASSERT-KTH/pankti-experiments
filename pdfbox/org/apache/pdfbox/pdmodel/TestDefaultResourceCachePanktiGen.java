package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestDefaultResourceCachePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetExtGState1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState2() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.DefaultResourceCache>" +
        "  <fonts/>" +
        "  <colorSpaces/>" +
        "  <xobjects/>" +
        "  <extGStates>" +
        "    <entry>" +
        "      <org.apache.pdfbox.cos.COSObject>" +
        "        <direct>true</direct>" +
        "        <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
        "          <direct>false</direct>" +
        "          <needToBeUpdated>false</needToBeUpdated>" +
        "          <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "            <mapArr>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>Type</name>" +
        "                <hashCode>2622298</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>true</direct>" +
        "                <name>ExtGState</name>" +
        "                <hashCode>507622859</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>SA</name>" +
        "                <hashCode>2638</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSBoolean>" +
        "                <direct>true</direct>" +
        "                <value>false</value>" +
        "              </org.apache.pdfbox.cos.COSBoolean>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>OP</name>" +
        "                <hashCode>2529</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>SM</name>" +
        "                <hashCode>2650</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSFloat>" +
        "                <direct>true</direct>" +
        "                <value>0.02</value>" +
        "                <valueAsString>0.02</valueAsString>" +
        "              </org.apache.pdfbox.cos.COSFloat>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>op</name>" +
        "                <hashCode>3553</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>OPM</name>" +
        "                <hashCode>78476</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSInteger>" +
        "                <direct>true</direct>" +
        "                <value>1</value>" +
        "              </org.apache.pdfbox.cos.COSInteger>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>UCR2</name>" +
        "                <hashCode>2599214</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>true</direct>" +
        "                <name>Default</name>" +
        "                <hashCode>-1085510111</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSName>" +
        "                <direct>false</direct>" +
        "                <name>BG2</name>" +
        "                <hashCode>65677</hashCode>" +
        "              </org.apache.pdfbox.cos.COSName>" +
        "              <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
        "            </mapArr>" +
        "          </items>" +
        "        </baseObject>" +
        "        <objectNumber>24</objectNumber>" +
        "        <generationNumber>0</generationNumber>" +
        "        <needToBeUpdated>false</needToBeUpdated>" +
        "      </org.apache.pdfbox.cos.COSObject>" +
        "      <java.lang.ref.SoftReference>" +
        "        <referent class=\"org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState\">" +
        "          <dict reference=\"../../../org.apache.pdfbox.cos.COSObject/baseObject\"/>" +
        "        </referent>" +
        "        <queue class=\"java.lang.ref.ReferenceQueue$Null\">" +
        "          <lock/>" +
        "          <queueLength>0</queueLength>" +
        "        </queue>" +
        "        <timestamp>20761143</timestamp>" +
        "      </java.lang.ref.SoftReference>" +
        "    </entry>" +
        "  </extGStates>" +
        "  <shadings/>" +
        "  <patterns/>" +
        "  <properties/>" +
        "</org.apache.pdfbox.pdmodel.DefaultResourceCache>";
        org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
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
        "          <name>ExtGState</name>" +
        "          <hashCode>507622859</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SA</name>" +
        "          <hashCode>2638</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SM</name>" +
        "          <hashCode>2650</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>0.02</value>" +
        "          <valueAsString>0.02</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OPM</name>" +
        "          <hashCode>78476</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSInteger>" +
        "          <direct>true</direct>" +
        "          <value>1</value>" +
        "        </org.apache.pdfbox.cos.COSInteger>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>UCR2</name>" +
        "          <hashCode>2599214</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Default</name>" +
        "          <hashCode>-1085510111</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>BG2</name>" +
        "          <hashCode>65677</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSObject>" +
        "    <direct>true</direct>" +
        "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
        "      <direct>false</direct>" +
        "      <needToBeUpdated>false</needToBeUpdated>" +
        "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "        <mapArr>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>Type</name>" +
        "            <hashCode>2622298</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>ExtGState</name>" +
        "            <hashCode>507622859</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SA</name>" +
        "            <hashCode>2638</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean>" +
        "            <direct>true</direct>" +
        "            <value>false</value>" +
        "          </org.apache.pdfbox.cos.COSBoolean>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>OP</name>" +
        "            <hashCode>2529</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SM</name>" +
        "            <hashCode>2650</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSFloat>" +
        "            <direct>true</direct>" +
        "            <value>0.02</value>" +
        "            <valueAsString>0.02</valueAsString>" +
        "          </org.apache.pdfbox.cos.COSFloat>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>op</name>" +
        "            <hashCode>3553</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>OPM</name>" +
        "            <hashCode>78476</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSInteger>" +
        "            <direct>true</direct>" +
        "            <value>1</value>" +
        "          </org.apache.pdfbox.cos.COSInteger>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>UCR2</name>" +
        "            <hashCode>2599214</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>Default</name>" +
        "            <hashCode>-1085510111</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>BG2</name>" +
        "            <hashCode>65677</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
        "        </mapArr>" +
        "      </items>" +
        "    </baseObject>" +
        "    <objectNumber>24</objectNumber>" +
        "    <generationNumber>0</generationNumber>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "  </org.apache.pdfbox.cos.COSObject>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
    }

    @Test
    public void testGetExtGState3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState15() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.DefaultResourceCache>" +
        "  <fonts/>" +
        "  <colorSpaces/>" +
        "  <xobjects/>" +
        "  <extGStates/>" +
        "  <shadings/>" +
        "  <patterns/>" +
        "  <properties/>" +
        "</org.apache.pdfbox.pdmodel.DefaultResourceCache>";
        org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSObject>" +
        "    <direct>true</direct>" +
        "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
        "      <direct>false</direct>" +
        "      <needToBeUpdated>false</needToBeUpdated>" +
        "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "        <mapArr>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>Type</name>" +
        "            <hashCode>2622298</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>ExtGState</name>" +
        "            <hashCode>507622859</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SA</name>" +
        "            <hashCode>2638</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean>" +
        "            <direct>true</direct>" +
        "            <value>false</value>" +
        "          </org.apache.pdfbox.cos.COSBoolean>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>OP</name>" +
        "            <hashCode>2529</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SM</name>" +
        "            <hashCode>2650</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSFloat>" +
        "            <direct>true</direct>" +
        "            <value>0.02</value>" +
        "            <valueAsString>0.02</valueAsString>" +
        "          </org.apache.pdfbox.cos.COSFloat>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>op</name>" +
        "            <hashCode>3553</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>OPM</name>" +
        "            <hashCode>78476</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSInteger>" +
        "            <direct>true</direct>" +
        "            <value>1</value>" +
        "          </org.apache.pdfbox.cos.COSInteger>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>UCR2</name>" +
        "            <hashCode>2599214</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>Default</name>" +
        "            <hashCode>-1085510111</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>BG2</name>" +
        "            <hashCode>65677</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
        "        </mapArr>" +
        "      </items>" +
        "    </baseObject>" +
        "    <objectNumber>24</objectNumber>" +
        "    <generationNumber>0</generationNumber>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "  </org.apache.pdfbox.cos.COSObject>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
    }

    @Test
    public void testGetExtGState16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState18() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.DefaultResourceCache>" +
        "  <fonts/>" +
        "  <colorSpaces/>" +
        "  <xobjects/>" +
        "  <extGStates/>" +
        "  <shadings/>" +
        "  <patterns/>" +
        "  <properties/>" +
        "</org.apache.pdfbox.pdmodel.DefaultResourceCache>";
        org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSObject>" +
        "    <direct>true</direct>" +
        "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
        "      <direct>false</direct>" +
        "      <needToBeUpdated>false</needToBeUpdated>" +
        "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "        <mapArr>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>Type</name>" +
        "            <hashCode>2622298</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>ExtGState</name>" +
        "            <hashCode>507622859</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SA</name>" +
        "            <hashCode>2638</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSBoolean>" +
        "            <direct>true</direct>" +
        "            <value>false</value>" +
        "          </org.apache.pdfbox.cos.COSBoolean>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>SM</name>" +
        "            <hashCode>2650</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSFloat>" +
        "            <direct>true</direct>" +
        "            <value>0.02</value>" +
        "            <valueAsString>0.02</valueAsString>" +
        "          </org.apache.pdfbox.cos.COSFloat>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>false</direct>" +
        "            <name>TR2</name>" +
        "            <hashCode>83316</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "          <org.apache.pdfbox.cos.COSName>" +
        "            <direct>true</direct>" +
        "            <name>Default</name>" +
        "            <hashCode>-1085510111</hashCode>" +
        "          </org.apache.pdfbox.cos.COSName>" +
        "        </mapArr>" +
        "      </items>" +
        "    </baseObject>" +
        "    <objectNumber>33</objectNumber>" +
        "    <generationNumber>0</generationNumber>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "  </org.apache.pdfbox.cos.COSObject>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
    }

    @Test
    public void testGetExtGState19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OP</name>" +
            "          <hashCode>2529</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>op</name>" +
            "          <hashCode>3553</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>OPM</name>" +
            "          <hashCode>78476</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSInteger>" +
            "          <direct>true</direct>" +
            "          <value>1</value>" +
            "        </org.apache.pdfbox.cos.COSInteger>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>UCR2</name>" +
            "          <hashCode>2599214</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>BG2</name>" +
            "          <hashCode>65677</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OP</name>" +
            "            <hashCode>2529</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>op</name>" +
            "            <hashCode>3553</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>OPM</name>" +
            "            <hashCode>78476</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>UCR2</name>" +
            "            <hashCode>2599214</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>BG2</name>" +
            "            <hashCode>65677</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>24</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getExtGState22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
            "  <dict>" +
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
            "          <name>ExtGState</name>" +
            "          <hashCode>507622859</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SA</name>" +
            "          <hashCode>2638</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSBoolean>" +
            "          <direct>true</direct>" +
            "          <value>false</value>" +
            "        </org.apache.pdfbox.cos.COSBoolean>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>SM</name>" +
            "          <hashCode>2650</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSFloat>" +
            "          <direct>true</direct>" +
            "          <value>0.02</value>" +
            "          <valueAsString>0.02</valueAsString>" +
            "        </org.apache.pdfbox.cos.COSFloat>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>TR2</name>" +
            "          <hashCode>83316</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>true</direct>" +
            "          <name>Default</name>" +
            "          <hashCode>-1085510111</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "      </mapArr>" +
            "    </items>" +
            "  </dict>" +
            "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState expectedObject = (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <org.apache.pdfbox.cos.COSObject>" +
            "    <direct>true</direct>" +
            "    <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "      <direct>false</direct>" +
            "      <needToBeUpdated>false</needToBeUpdated>" +
            "      <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "        <mapArr>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>Type</name>" +
            "            <hashCode>2622298</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>ExtGState</name>" +
            "            <hashCode>507622859</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SA</name>" +
            "            <hashCode>2638</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSBoolean>" +
            "            <direct>true</direct>" +
            "            <value>false</value>" +
            "          </org.apache.pdfbox.cos.COSBoolean>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>SM</name>" +
            "            <hashCode>2650</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSFloat>" +
            "            <direct>true</direct>" +
            "            <value>0.02</value>" +
            "            <valueAsString>0.02</valueAsString>" +
            "          </org.apache.pdfbox.cos.COSFloat>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>false</direct>" +
            "            <name>TR2</name>" +
            "            <hashCode>83316</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "          <org.apache.pdfbox.cos.COSName>" +
            "            <direct>true</direct>" +
            "            <name>Default</name>" +
            "            <hashCode>-1085510111</hashCode>" +
            "          </org.apache.pdfbox.cos.COSName>" +
            "        </mapArr>" +
            "      </items>" +
            "    </baseObject>" +
            "    <objectNumber>33</objectNumber>" +
            "    <generationNumber>0</generationNumber>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "  </org.apache.pdfbox.cos.COSObject>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont1-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont1-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont2-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont4-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont4-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont5-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont5-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont6-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont6-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont7-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont7-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont8-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont8-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont9-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont9-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont10-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont10-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont11-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont11-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont12-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont12-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont13-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont13-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont14-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont15-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont15-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont16-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont16-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont17-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont18-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont18-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont19-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont19-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont20-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont20-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont21-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont21-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont22-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont22-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<org.apache.pdfbox.pdmodel.DefaultResourceCache>" +
            "  <fonts/>" +
            "  <colorSpaces/>" +
            "  <xobjects/>" +
            "  <extGStates>" +
            "    <entry>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <baseObject class=\"org.apache.pdfbox.cos.COSDictionary\">" +
            "          <direct>false</direct>" +
            "          <needToBeUpdated>false</needToBeUpdated>" +
            "          <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "            <mapArr>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>Type</name>" +
            "                <hashCode>2622298</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>true</direct>" +
            "                <name>ExtGState</name>" +
            "                <hashCode>507622859</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>SA</name>" +
            "                <hashCode>2638</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSBoolean>" +
            "                <direct>true</direct>" +
            "                <value>false</value>" +
            "              </org.apache.pdfbox.cos.COSBoolean>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>OP</name>" +
            "                <hashCode>2529</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>SM</name>" +
            "                <hashCode>2650</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSFloat>" +
            "                <direct>true</direct>" +
            "                <value>0.02</value>" +
            "                <valueAsString>0.02</valueAsString>" +
            "              </org.apache.pdfbox.cos.COSFloat>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>op</name>" +
            "                <hashCode>3553</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>OPM</name>" +
            "                <hashCode>78476</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSInteger>" +
            "                <direct>true</direct>" +
            "                <value>1</value>" +
            "              </org.apache.pdfbox.cos.COSInteger>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>UCR2</name>" +
            "                <hashCode>2599214</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>true</direct>" +
            "                <name>Default</name>" +
            "                <hashCode>-1085510111</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSName>" +
            "                <direct>false</direct>" +
            "                <name>BG2</name>" +
            "                <hashCode>65677</hashCode>" +
            "              </org.apache.pdfbox.cos.COSName>" +
            "              <org.apache.pdfbox.cos.COSName reference=\"../org.apache.pdfbox.cos.COSName[9]\"/>" +
            "            </mapArr>" +
            "          </items>" +
            "        </baseObject>" +
            "        <objectNumber>24</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <java.lang.ref.SoftReference>" +
            "        <referent class=\"org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState\">" +
            "          <dict reference=\"../../../org.apache.pdfbox.cos.COSObject/baseObject\"/>" +
            "        </referent>" +
            "        <queue class=\"java.lang.ref.ReferenceQueue$Null\">" +
            "          <lock/>" +
            "          <queueLength>0</queueLength>" +
            "        </queue>" +
            "        <timestamp>20697173</timestamp>" +
            "      </java.lang.ref.SoftReference>" +
            "    </entry>" +
            "  </extGStates>" +
            "  <shadings/>" +
            "  <patterns/>" +
            "  <properties/>" +
            "</org.apache.pdfbox.pdmodel.DefaultResourceCache>";
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont23-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont24-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont24-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont25-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont26-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont26-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont27-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont27-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont28-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont28-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont29-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDFont expectedObject = (org.apache.pdfbox.pdmodel.font.PDFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getFont29-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject1-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject4-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject5-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject6-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject7-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject8-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject9-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject10-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject11-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject12-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject13-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject13-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject14-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject14-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXObject15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.PDXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.PDXObject) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getXObject15-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getXObject(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace1-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace1-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace2-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace3-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace4-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace4-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace5-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace5-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace6-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace6-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace7-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace7-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace8-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace9-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace9-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace10-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace10-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace11-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace11-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace12-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace12-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace13-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace13-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace14-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace14-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace15-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace16-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace16-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace17-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace18-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace18-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace19-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace19-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace20-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace20-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace21-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace21-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace22-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace22-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace23-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace23-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace24-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace24-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace25-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace25-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace26-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace26-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorSpace27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.DefaultResourceCache receivingObject = (org.apache.pdfbox.pdmodel.DefaultResourceCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace expectedObject = (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.DefaultResourceCache.getColorSpace27-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSObject paramObject1 = (org.apache.pdfbox.cos.COSObject) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getColorSpace(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}