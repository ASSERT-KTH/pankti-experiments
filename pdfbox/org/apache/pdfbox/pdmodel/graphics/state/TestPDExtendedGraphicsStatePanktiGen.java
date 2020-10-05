package org.apache.pdfbox.pdmodel.graphics.state;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestPDExtendedGraphicsStatePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetAutomaticStrokeAdjustment1() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getAutomaticStrokeAdjustment());
    }

    @Test
    public void testGetAutomaticStrokeAdjustment2() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getAutomaticStrokeAdjustment());
    }

    @Test
    public void testGetAutomaticStrokeAdjustment3() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getAutomaticStrokeAdjustment());
    }

    @Test
    public void testGetAutomaticStrokeAdjustment4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(true, receivingObject.getAutomaticStrokeAdjustment());
    }

    @Test
    public void testGetStrokingOverprintControl1() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getStrokingOverprintControl());
    }

    @Test
    public void testGetStrokingOverprintControl2() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getStrokingOverprintControl());
    }

    @Test
    public void testGetStrokingOverprintControl3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getStrokingOverprintControl());
    }

    @Test
    public void testGetSmoothnessTolerance1() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>0.02</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSmoothnessTolerance());
    }

    @Test
    public void testGetSmoothnessTolerance2() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>0.02</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSmoothnessTolerance());
    }

    @Test
    public void testGetSmoothnessTolerance3() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>0.02</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSmoothnessTolerance());
    }

    @Test
    public void testGetNonStrokingOverprintControl1() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getNonStrokingOverprintControl());
    }

    @Test
    public void testGetNonStrokingOverprintControl2() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getNonStrokingOverprintControl());
    }

    @Test
    public void testGetNonStrokingOverprintControl3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getNonStrokingOverprintControl());
    }

    @Test
    public void testGetOverprintMode1() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>1.0</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOverprintMode());
    }

    @Test
    public void testGetOverprintMode2() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>1.0</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOverprintMode());
    }

    @Test
    public void testGetOverprintMode3() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>1.0</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getOverprintMode());
    }

    @Test
    public void testGetSoftMask1() {
        String receivingXML = 
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
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        PDSoftMask expectedObject = (PDSoftMask) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSoftMask());
    }

    @Test
    public void testGetSoftMask2() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        PDSoftMask expectedObject = (PDSoftMask) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSoftMask());
    }

    @Test
    public void testGetSoftMask3() {
        String receivingXML = 
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
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        PDSoftMask expectedObject = (PDSoftMask) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSoftMask());
    }

    @Test
    public void testGetSoftMask4() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        PDSoftMask expectedObject = (PDSoftMask) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getSoftMask());
    }

    @Test
    public void testGetStrokingAlphaConstant1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>1.0</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getStrokingAlphaConstant());
    }

    @Test
    public void testGetNonStrokingAlphaConstant1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float>1.0</float>";
        Float expectedObject = (Float) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getNonStrokingAlphaConstant());
    }

    @Test
    public void testGetAlphaSourceFlag1() {
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>" +
        "  <dict>" +
        "    <direct>false</direct>" +
        "    <needToBeUpdated>false</needToBeUpdated>" +
        "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
        "      <mapArr>" +
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
        "          <name>BM</name>" +
        "          <hashCode>2123</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>Normal</name>" +
        "          <hashCode>-1955878649</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>CA</name>" +
        "          <hashCode>2142</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>OP</name>" +
        "          <hashCode>2529</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean>" +
        "          <direct>true</direct>" +
        "          <value>false</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>SMask</name>" +
        "          <hashCode>79043039</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>true</direct>" +
        "          <name>None</name>" +
        "          <hashCode>2433880</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>ca</name>" +
        "          <hashCode>3166</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSFloat>" +
        "          <direct>true</direct>" +
        "          <value>1.0</value>" +
        "          <valueAsString>1.0</valueAsString>" +
        "        </org.apache.pdfbox.cos.COSFloat>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>AIS</name>" +
        "          <hashCode>64811</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
        "        <org.apache.pdfbox.cos.COSName>" +
        "          <direct>false</direct>" +
        "          <name>op</name>" +
        "          <hashCode>3553</hashCode>" +
        "        </org.apache.pdfbox.cos.COSName>" +
        "        <org.apache.pdfbox.cos.COSBoolean reference=\"../org.apache.pdfbox.cos.COSBoolean\"/>" +
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
        "          <value>true</value>" +
        "        </org.apache.pdfbox.cos.COSBoolean>" +
        "      </mapArr>" +
        "    </items>" +
        "  </dict>" +
        "</org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
        PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
        Assert.assertEquals(false, receivingObject.getAlphaSourceFlag());
    }
}