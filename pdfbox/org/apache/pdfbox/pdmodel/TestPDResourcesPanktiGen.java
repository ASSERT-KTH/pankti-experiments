package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;
public class TestPDResourcesPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetExtGState1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject.getCOSObject().keySet(), receivingObject.getExtGState(paramObject1).getCOSObject().keySet());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
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
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetExtGState18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDResources.getExtGState18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDResources receivingObject = (org.apache.pdfbox.pdmodel.PDResources) xStream.fromXML(receivingXML);
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
            "  <org.apache.pdfbox.cos.COSName>" +
            "    <direct>false</direct>" +
            "    <name>GS1</name>" +
            "    <hashCode>70853</hashCode>" +
            "  </org.apache.pdfbox.cos.COSName>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getExtGState(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}