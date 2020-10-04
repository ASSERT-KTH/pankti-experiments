package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPDTrueTypeFontPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetPath_int1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>1113.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>832.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>832.0</float>" +
            "    <float>542.0</float>" +
            "    <byte>66</byte>" +
            "    <float>832.0</float>" +
            "    <float>714.0</float>" +
            "    <float>814.0</float>" +
            "    <float>764.0</float>" +
            "    <byte>66</byte>" +
            "    <float>796.0</float>" +
            "    <float>815.0</float>" +
            "    <float>756.0</float>" +
            "    <float>843.0</float>" +
            "    <byte>66</byte>" +
            "    <float>715.0</float>" +
            "    <float>871.0</float>" +
            "    <float>658.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>585.0</float>" +
            "    <float>871.0</float>" +
            "    <float>527.0</float>" +
            "    <float>831.0</float>" +
            "    <byte>66</byte>" +
            "    <float>469.0</float>" +
            "    <float>791.0</float>" +
            "    <float>448.0</float>" +
            "    <float>725.0</float>" +
            "    <byte>66</byte>" +
            "    <float>426.0</float>" +
            "    <float>659.0</float>" +
            "    <float>426.0</float>" +
            "    <float>481.0</float>" +
            "    <byte>65</byte>" +
            "    <float>426.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>145.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>145.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.0</float>" +
            "    <float>906.0</float>" +
            "    <byte>66</byte>" +
            "    <float>545.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>756.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>849.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>926.0</float>" +
            "    <float>1053.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1003.0</float>" +
            "    <float>1019.0</float>" +
            "    <float>1042.0</float>" +
            "    <float>967.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1082.0</float>" +
            "    <float>915.0</float>" +
            "    <float>1097.0</float>" +
            "    <float>849.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1113.0</float>" +
            "    <float>783.0</float>" +
            "    <float>1113.0</float>" +
            "    <float>660.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1113.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>13</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>613.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>65</byte>" +
            "    <float>420.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>66</byte>" +
            "    <float>267.0</float>" +
            "    <float>-200.0</float>" +
            "    <float>187.0</float>" +
            "    <float>49.0</float>" +
            "    <byte>66</byte>" +
            "    <float>107.0</float>" +
            "    <float>298.0</float>" +
            "    <float>107.0</float>" +
            "    <float>531.0</float>" +
            "    <byte>66</byte>" +
            "    <float>107.0</float>" +
            "    <float>820.0</float>" +
            "    <float>206.0</float>" +
            "    <float>1078.0</float>" +
            "    <byte>66</byte>" +
            "    <float>292.0</float>" +
            "    <float>1302.0</float>" +
            "    <float>424.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>65</byte>" +
            "    <float>616.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>66</byte>" +
            "    <float>479.0</float>" +
            "    <float>1188.0</float>" +
            "    <float>428.0</float>" +
            "    <float>976.0</float>" +
            "    <byte>66</byte>" +
            "    <float>376.0</float>" +
            "    <float>763.0</float>" +
            "    <float>376.0</float>" +
            "    <float>525.0</float>" +
            "    <byte>66</byte>" +
            "    <float>376.0</float>" +
            "    <float>361.0</float>" +
            "    <float>406.0</float>" +
            "    <float>189.0</float>" +
            "    <byte>66</byte>" +
            "    <float>437.0</float>" +
            "    <float>17.0</float>" +
            "    <float>490.0</float>" +
            "    <float>-138.0</float>" +
            "    <byte>66</byte>" +
            "    <float>525.0</float>" +
            "    <float>-240.0</float>" +
            "    <float>613.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>82.0</float>" +
            "    <float>546.0</float>" +
            "    <byte>66</byte>" +
            "    <float>82.0</float>" +
            "    <float>686.0</float>" +
            "    <float>151.0</float>" +
            "    <float>817.0</float>" +
            "    <byte>66</byte>" +
            "    <float>220.0</float>" +
            "    <float>948.0</float>" +
            "    <float>346.0</float>" +
            "    <float>1017.0</float>" +
            "    <byte>66</byte>" +
            "    <float>473.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>629.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>870.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>1024.0</float>" +
            "    <float>930.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1178.0</float>" +
            "    <float>773.0</float>" +
            "    <float>1178.0</float>" +
            "    <float>534.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1178.0</float>" +
            "    <float>293.0</float>" +
            "    <float>1023.0</float>" +
            "    <float>135.0</float>" +
            "    <byte>66</byte>" +
            "    <float>867.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>631.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>485.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>353.0</float>" +
            "    <float>42.0</float>" +
            "    <byte>66</byte>" +
            "    <float>220.0</float>" +
            "    <float>108.0</float>" +
            "    <float>151.0</float>" +
            "    <float>235.0</float>" +
            "    <byte>66</byte>" +
            "    <float>82.0</float>" +
            "    <float>363.0</float>" +
            "    <float>82.0</float>" +
            "    <float>546.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>370.0</float>" +
            "    <float>531.0</float>" +
            "    <byte>66</byte>" +
            "    <float>370.0</float>" +
            "    <float>373.0</float>" +
            "    <float>445.0</float>" +
            "    <float>289.0</float>" +
            "    <byte>66</byte>" +
            "    <float>520.0</float>" +
            "    <float>205.0</float>" +
            "    <float>630.0</float>" +
            "    <float>205.0</float>" +
            "    <byte>66</byte>" +
            "    <float>740.0</float>" +
            "    <float>205.0</float>" +
            "    <float>814.0</float>" +
            "    <float>289.0</float>" +
            "    <byte>66</byte>" +
            "    <float>889.0</float>" +
            "    <float>373.0</float>" +
            "    <float>889.0</float>" +
            "    <float>533.0</float>" +
            "    <byte>66</byte>" +
            "    <float>889.0</float>" +
            "    <float>689.0</float>" +
            "    <float>815.0</float>" +
            "    <float>773.0</float>" +
            "    <byte>66</byte>" +
            "    <float>740.0</float>" +
            "    <float>857.0</float>" +
            "    <float>630.0</float>" +
            "    <float>857.0</float>" +
            "    <byte>66</byte>" +
            "    <float>520.0</float>" +
            "    <float>857.0</float>" +
            "    <float>445.0</float>" +
            "    <float>773.0</float>" +
            "    <byte>66</byte>" +
            "    <float>370.0</float>" +
            "    <float>689.0</float>" +
            "    <float>370.0</float>" +
            "    <float>531.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>31</int>" +
            "    <int>90</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>150.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>150.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>773.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1008.0</float>" +
            "    <float>1466.0</float>" +
            "    <float>1114.0</float>" +
            "    <float>1427.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1221.0</float>" +
            "    <float>1387.0</float>" +
            "    <float>1285.0</float>" +
            "    <float>1286.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1349.0</float>" +
            "    <float>1185.0</float>" +
            "    <float>1349.0</float>" +
            "    <float>1055.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1349.0</float>" +
            "    <float>890.0</float>" +
            "    <float>1252.0</float>" +
            "    <float>783.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1155.0</float>" +
            "    <float>675.0</float>" +
            "    <float>962.0</float>" +
            "    <float>647.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1058.0</float>" +
            "    <float>591.0</float>" +
            "    <float>1120.0</float>" +
            "    <float>524.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1183.0</float>" +
            "    <float>457.0</float>" +
            "    <float>1289.0</float>" +
            "    <float>286.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1468.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1114.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>900.0</float>" +
            "    <float>319.0</float>" +
            "    <byte>66</byte>" +
            "    <float>786.0</float>" +
            "    <float>490.0</float>" +
            "    <float>744.0</float>" +
            "    <float>534.0</float>" +
            "    <byte>66</byte>" +
            "    <float>702.0</float>" +
            "    <float>579.0</float>" +
            "    <float>655.0</float>" +
            "    <float>595.0</float>" +
            "    <byte>66</byte>" +
            "    <float>608.0</float>" +
            "    <float>612.0</float>" +
            "    <float>506.0</float>" +
            "    <float>612.0</float>" +
            "    <byte>65</byte>" +
            "    <float>446.0</float>" +
            "    <float>612.0</float>" +
            "    <byte>65</byte>" +
            "    <float>446.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>150.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>446.0</float>" +
            "    <float>846.0</float>" +
            "    <byte>65</byte>" +
            "    <float>665.0</float>" +
            "    <float>846.0</float>" +
            "    <byte>66</byte>" +
            "    <float>878.0</float>" +
            "    <float>846.0</float>" +
            "    <float>931.0</float>" +
            "    <float>864.0</float>" +
            "    <byte>66</byte>" +
            "    <float>984.0</float>" +
            "    <float>882.0</float>" +
            "    <float>1014.0</float>" +
            "    <float>926.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1044.0</float>" +
            "    <float>970.0</float>" +
            "    <float>1044.0</float>" +
            "    <float>1036.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1044.0</float>" +
            "    <float>1110.0</float>" +
            "    <float>1005.0</float>" +
            "    <float>1155.0</float>" +
            "    <byte>66</byte>" +
            "    <float>965.0</float>" +
            "    <float>1201.0</float>" +
            "    <float>893.0</float>" +
            "    <float>1213.0</float>" +
            "    <byte>66</byte>" +
            "    <float>857.0</float>" +
            "    <float>1218.0</float>" +
            "    <float>677.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>446.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>446.0</float>" +
            "    <float>846.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>162.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>162.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1222.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1222.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>356.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>356.0</float>" +
            "    <float>844.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1167.0</float>" +
            "    <float>844.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1167.0</float>" +
            "    <float>672.0</float>" +
            "    <byte>65</byte>" +
            "    <float>356.0</float>" +
            "    <float>672.0</float>" +
            "    <byte>65</byte>" +
            "    <float>356.0</float>" +
            "    <float>173.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1256.0</float>" +
            "    <float>173.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1256.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>162.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>10</int>" +
            "    <int>18</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>531.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>531.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>48.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>48.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1210.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1210.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>725.0</float>" +
            "    <float>1293.0</float>" +
            "    <byte>65</byte>" +
            "    <float>725.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>531.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>24</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>862.0</float>" +
            "    <float>342.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1048.0</float>" +
            "    <float>319.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1004.0</float>" +
            "    <float>156.0</float>" +
            "    <float>885.0</float>" +
            "    <float>66.0</float>" +
            "    <byte>66</byte>" +
            "    <float>766.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>581.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>348.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>212.0</float>" +
            "    <float>119.0</float>" +
            "    <byte>66</byte>" +
            "    <float>75.0</float>" +
            "    <float>263.0</float>" +
            "    <float>75.0</float>" +
            "    <float>522.0</float>" +
            "    <byte>66</byte>" +
            "    <float>75.0</float>" +
            "    <float>790.0</float>" +
            "    <float>213.0</float>" +
            "    <float>938.0</float>" +
            "    <byte>66</byte>" +
            "    <float>351.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>571.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>784.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>919.0</float>" +
            "    <float>941.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1054.0</float>" +
            "    <float>796.0</float>" +
            "    <float>1054.0</float>" +
            "    <float>533.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1054.0</float>" +
            "    <float>517.0</float>" +
            "    <float>1053.0</float>" +
            "    <float>485.0</float>" +
            "    <byte>65</byte>" +
            "    <float>261.0</float>" +
            "    <float>485.0</float>" +
            "    <byte>66</byte>" +
            "    <float>271.0</float>" +
            "    <float>310.0</float>" +
            "    <float>360.0</float>" +
            "    <float>217.0</float>" +
            "    <byte>66</byte>" +
            "    <float>449.0</float>" +
            "    <float>124.0</float>" +
            "    <float>582.0</float>" +
            "    <float>124.0</float>" +
            "    <byte>66</byte>" +
            "    <float>681.0</float>" +
            "    <float>124.0</float>" +
            "    <float>751.0</float>" +
            "    <float>176.0</float>" +
            "    <byte>66</byte>" +
            "    <float>821.0</float>" +
            "    <float>228.0</float>" +
            "    <float>862.0</float>" +
            "    <float>342.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>271.0</float>" +
            "    <float>633.0</float>" +
            "    <byte>65</byte>" +
            "    <float>864.0</float>" +
            "    <float>633.0</float>" +
            "    <byte>66</byte>" +
            "    <float>852.0</float>" +
            "    <float>767.0</float>" +
            "    <float>796.0</float>" +
            "    <float>834.0</float>" +
            "    <byte>66</byte>" +
            "    <float>710.0</float>" +
            "    <float>938.0</float>" +
            "    <float>573.0</float>" +
            "    <float>938.0</float>" +
            "    <byte>66</byte>" +
            "    <float>449.0</float>" +
            "    <float>938.0</float>" +
            "    <float>365.0</float>" +
            "    <float>855.0</float>" +
            "    <byte>66</byte>" +
            "    <float>280.0</float>" +
            "    <float>772.0</float>" +
            "    <float>271.0</float>" +
            "    <float>633.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>28</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>145.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>145.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>588.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>854.0</float>" +
            "    <float>466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1117.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1561.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1561.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1286.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1286.0</float>" +
            "    <float>1154.0</float>" +
            "    <byte>65</byte>" +
            "    <float>995.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>710.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>420.0</float>" +
            "    <float>1154.0</float>" +
            "    <byte>65</byte>" +
            "    <float>420.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>145.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>28</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>357.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>7.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>310.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>531.0</float>" +
            "    <float>459.0</float>" +
            "    <byte>65</byte>" +
            "    <float>799.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1151.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1408.0</float>" +
            "    <float>442.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1633.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1931.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1575.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1261.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>969.0</float>" +
            "    <float>1096.0</float>" +
            "    <byte>65</byte>" +
            "    <float>678.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>357.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>74</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>762.0</float>" +
            "    <float>338.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1042.0</float>" +
            "    <float>291.0</float>" +
            "    <byte>66</byte>" +
            "    <float>988.0</float>" +
            "    <float>137.0</float>" +
            "    <float>872.0</float>" +
            "    <float>57.0</float>" +
            "    <byte>66</byte>" +
            "    <float>755.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>580.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>303.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>170.0</float>" +
            "    <float>157.0</float>" +
            "    <byte>66</byte>" +
            "    <float>65.0</float>" +
            "    <float>302.0</float>" +
            "    <float>65.0</float>" +
            "    <float>523.0</float>" +
            "    <byte>66</byte>" +
            "    <float>65.0</float>" +
            "    <float>787.0</float>" +
            "    <float>203.0</float>" +
            "    <float>936.0</float>" +
            "    <byte>66</byte>" +
            "    <float>341.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>552.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>789.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>926.0</float>" +
            "    <float>930.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1063.0</float>" +
            "    <float>773.0</float>" +
            "    <float>1057.0</float>" +
            "    <float>450.0</float>" +
            "    <byte>65</byte>" +
            "    <float>353.0</float>" +
            "    <float>450.0</float>" +
            "    <byte>66</byte>" +
            "    <float>356.0</float>" +
            "    <float>325.0</float>" +
            "    <float>421.0</float>" +
            "    <float>256.0</float>" +
            "    <byte>66</byte>" +
            "    <float>486.0</float>" +
            "    <float>186.0</float>" +
            "    <float>583.0</float>" +
            "    <float>186.0</float>" +
            "    <byte>66</byte>" +
            "    <float>649.0</float>" +
            "    <float>186.0</float>" +
            "    <float>694.0</float>" +
            "    <float>222.0</float>" +
            "    <byte>66</byte>" +
            "    <float>739.0</float>" +
            "    <float>258.0</float>" +
            "    <float>762.0</float>" +
            "    <float>338.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>778.0</float>" +
            "    <float>622.0</float>" +
            "    <byte>66</byte>" +
            "    <float>775.0</float>" +
            "    <float>744.0</float>" +
            "    <float>715.0</float>" +
            "    <float>807.0</float>" +
            "    <byte>66</byte>" +
            "    <float>655.0</float>" +
            "    <float>871.0</float>" +
            "    <float>569.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>477.0</float>" +
            "    <float>871.0</float>" +
            "    <float>417.0</float>" +
            "    <float>804.0</float>" +
            "    <byte>66</byte>" +
            "    <float>357.0</float>" +
            "    <float>737.0</float>" +
            "    <float>358.0</float>" +
            "    <float>622.0</float>" +
            "    <byte>65</byte>" +
            "    <float>778.0</float>" +
            "    <float>622.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>439.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>11.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>306.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>506.0</float>" +
            "    <float>520.0</float>" +
            "    <byte>65</byte>" +
            "    <float>564.0</float>" +
            "    <float>339.0</float>" +
            "    <byte>66</byte>" +
            "    <float>587.0</float>" +
            "    <float>408.0</float>" +
            "    <float>593.0</float>" +
            "    <float>430.0</float>" +
            "    <byte>66</byte>" +
            "    <float>607.0</float>" +
            "    <float>475.0</float>" +
            "    <float>623.0</float>" +
            "    <float>520.0</float>" +
            "    <byte>65</byte>" +
            "    <float>825.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1114.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>692.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>439.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>46</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>69.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>66</byte>" +
            "    <float>152.0</float>" +
            "    <float>-253.0</float>" +
            "    <float>186.0</float>" +
            "    <float>-158.0</float>" +
            "    <byte>66</byte>" +
            "    <float>220.0</float>" +
            "    <float>-63.0</float>" +
            "    <float>249.0</float>" +
            "    <float>61.0</float>" +
            "    <byte>66</byte>" +
            "    <float>278.0</float>" +
            "    <float>185.0</float>" +
            "    <float>292.0</float>" +
            "    <float>296.0</float>" +
            "    <byte>66</byte>" +
            "    <float>306.0</float>" +
            "    <float>408.0</float>" +
            "    <float>306.0</float>" +
            "    <float>525.0</float>" +
            "    <byte>66</byte>" +
            "    <float>306.0</float>" +
            "    <float>763.0</float>" +
            "    <float>255.0</float>" +
            "    <float>975.0</float>" +
            "    <byte>66</byte>" +
            "    <float>204.0</float>" +
            "    <float>1188.0</float>" +
            "    <float>67.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>65</byte>" +
            "    <float>258.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>66</byte>" +
            "    <float>409.0</float>" +
            "    <float>1276.0</float>" +
            "    <float>492.0</float>" +
            "    <float>1035.0</float>" +
            "    <byte>66</byte>" +
            "    <float>576.0</float>" +
            "    <float>794.0</float>" +
            "    <float>576.0</float>" +
            "    <float>546.0</float>" +
            "    <byte>66</byte>" +
            "    <float>576.0</float>" +
            "    <float>337.0</float>" +
            "    <float>510.0</float>" +
            "    <float>98.0</float>" +
            "    <byte>66</byte>" +
            "    <float>435.0</float>" +
            "    <float>-170.0</float>" +
            "    <float>263.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>65</byte>" +
            "    <float>69.0</float>" +
            "    <float>-431.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>634.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>634.0</float>" +
            "    <float>838.0</float>" +
            "    <byte>65</byte>" +
            "    <float>442.0</float>" +
            "    <float>838.0</float>" +
            "    <byte>65</byte>" +
            "    <float>442.0</float>" +
            "    <float>410.0</float>" +
            "    <byte>66</byte>" +
            "    <float>442.0</float>" +
            "    <float>280.0</float>" +
            "    <float>447.0</float>" +
            "    <float>259.0</float>" +
            "    <byte>66</byte>" +
            "    <float>453.0</float>" +
            "    <float>237.0</float>" +
            "    <float>472.0</float>" +
            "    <float>223.0</float>" +
            "    <byte>66</byte>" +
            "    <float>492.0</float>" +
            "    <float>209.0</float>" +
            "    <float>520.0</float>" +
            "    <float>209.0</float>" +
            "    <byte>66</byte>" +
            "    <float>559.0</float>" +
            "    <float>209.0</float>" +
            "    <float>633.0</float>" +
            "    <float>236.0</float>" +
            "    <byte>65</byte>" +
            "    <float>657.0</float>" +
            "    <float>18.0</float>" +
            "    <byte>66</byte>" +
            "    <float>559.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>435.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>359.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>298.0</float>" +
            "    <float>1.0</float>" +
            "    <byte>66</byte>" +
            "    <float>237.0</float>" +
            "    <float>27.0</float>" +
            "    <float>209.0</float>" +
            "    <float>67.0</float>" +
            "    <byte>66</byte>" +
            "    <float>180.0</float>" +
            "    <float>108.0</float>" +
            "    <float>169.0</float>" +
            "    <float>177.0</float>" +
            "    <byte>66</byte>" +
            "    <float>160.0</float>" +
            "    <float>226.0</float>" +
            "    <float>160.0</float>" +
            "    <float>375.0</float>" +
            "    <byte>65</byte>" +
            "    <float>160.0</float>" +
            "    <float>838.0</float>" +
            "    <byte>65</byte>" +
            "    <float>31.0</float>" +
            "    <float>838.0</float>" +
            "    <byte>65</byte>" +
            "    <float>31.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>160.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>160.0</float>" +
            "    <float>1273.0</float>" +
            "    <byte>65</byte>" +
            "    <float>442.0</float>" +
            "    <float>1437.0</float>" +
            "    <byte>65</byte>" +
            "    <float>442.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>634.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>17</int>" +
            "    <int>34</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>-3.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>560.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>769.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1369.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1148.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>977.0</float>" +
            "    <float>444.0</float>" +
            "    <byte>65</byte>" +
            "    <float>364.0</float>" +
            "    <float>444.0</float>" +
            "    <byte>65</byte>" +
            "    <float>203.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>-3.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>420.0</float>" +
            "    <float>602.0</float>" +
            "    <byte>65</byte>" +
            "    <float>917.0</float>" +
            "    <float>602.0</float>" +
            "    <byte>65</byte>" +
            "    <float>764.0</float>" +
            "    <float>1008.0</float>" +
            "    <byte>66</byte>" +
            "    <float>694.0</float>" +
            "    <float>1193.0</float>" +
            "    <float>660.0</float>" +
            "    <float>1312.0</float>" +
            "    <byte>66</byte>" +
            "    <float>632.0</float>" +
            "    <float>1171.0</float>" +
            "    <float>581.0</float>" +
            "    <float>1032.0</float>" +
            "    <byte>65</byte>" +
            "    <float>420.0</float>" +
            "    <float>602.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>70</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>147.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>443.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>443.0</float>" +
            "    <float>672.0</float>" +
            "    <byte>66</byte>" +
            "    <float>443.0</float>" +
            "    <float>483.0</float>" +
            "    <float>454.0</float>" +
            "    <float>427.0</float>" +
            "    <byte>66</byte>" +
            "    <float>473.0</float>" +
            "    <float>337.0</float>" +
            "    <float>544.0</float>" +
            "    <float>283.0</float>" +
            "    <byte>66</byte>" +
            "    <float>616.0</float>" +
            "    <float>228.0</float>" +
            "    <float>740.0</float>" +
            "    <float>228.0</float>" +
            "    <byte>66</byte>" +
            "    <float>866.0</float>" +
            "    <float>228.0</float>" +
            "    <float>930.0</float>" +
            "    <float>279.0</float>" +
            "    <byte>66</byte>" +
            "    <float>994.0</float>" +
            "    <float>331.0</float>" +
            "    <float>1007.0</float>" +
            "    <float>406.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1020.0</float>" +
            "    <float>481.0</float>" +
            "    <float>1020.0</float>" +
            "    <float>655.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1020.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1316.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1316.0</float>" +
            "    <float>696.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1316.0</float>" +
            "    <float>432.0</float>" +
            "    <float>1292.0</float>" +
            "    <float>323.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1268.0</float>" +
            "    <float>214.0</float>" +
            "    <float>1204.0</float>" +
            "    <float>139.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1139.0</float>" +
            "    <float>64.0</float>" +
            "    <float>1031.0</float>" +
            "    <float>20.0</float>" +
            "    <byte>66</byte>" +
            "    <float>923.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>749.0</float>" +
            "    <float>-25.0</float>" +
            "    <byte>66</byte>" +
            "    <float>539.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>431.0</float>" +
            "    <float>23.0</float>" +
            "    <byte>66</byte>" +
            "    <float>322.0</float>" +
            "    <float>72.0</float>" +
            "    <float>259.0</float>" +
            "    <float>149.0</float>" +
            "    <byte>66</byte>" +
            "    <float>196.0</float>" +
            "    <float>227.0</float>" +
            "    <float>176.0</float>" +
            "    <float>312.0</float>" +
            "    <byte>66</byte>" +
            "    <float>147.0</float>" +
            "    <float>438.0</float>" +
            "    <float>147.0</float>" +
            "    <float>684.0</float>" +
            "    <byte>65</byte>" +
            "    <float>147.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>156.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>156.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>355.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1125.0</float>" +
            "    <float>315.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1125.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1311.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1311.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1112.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>342.0</float>" +
            "    <float>1152.0</float>" +
            "    <byte>65</byte>" +
            "    <float>342.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>156.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>149.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>149.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1236.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1236.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>893.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1181.0</float>" +
            "    <float>893.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1181.0</float>" +
            "    <float>646.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>646.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>247.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1264.0</float>" +
            "    <float>247.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1264.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>149.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>37</int>" +
            "    <int>138</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>92.0</float>" +
            "    <float>471.0</float>" +
            "    <byte>65</byte>" +
            "    <float>275.0</float>" +
            "    <float>487.0</float>" +
            "    <byte>66</byte>" +
            "    <float>288.0</float>" +
            "    <float>377.0</float>" +
            "    <float>335.0</float>" +
            "    <float>307.0</float>" +
            "    <byte>66</byte>" +
            "    <float>383.0</float>" +
            "    <float>236.0</float>" +
            "    <float>483.0</float>" +
            "    <float>193.0</float>" +
            "    <byte>66</byte>" +
            "    <float>583.0</float>" +
            "    <float>149.0</float>" +
            "    <float>708.0</float>" +
            "    <float>149.0</float>" +
            "    <byte>66</byte>" +
            "    <float>819.0</float>" +
            "    <float>149.0</float>" +
            "    <float>904.0</float>" +
            "    <float>182.0</float>" +
            "    <byte>66</byte>" +
            "    <float>989.0</float>" +
            "    <float>215.0</float>" +
            "    <float>1030.0</float>" +
            "    <float>272.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1072.0</float>" +
            "    <float>330.0</float>" +
            "    <float>1072.0</float>" +
            "    <float>398.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1072.0</float>" +
            "    <float>467.0</float>" +
            "    <float>1032.0</float>" +
            "    <float>518.0</float>" +
            "    <byte>66</byte>" +
            "    <float>992.0</float>" +
            "    <float>570.0</float>" +
            "    <float>900.0</float>" +
            "    <float>605.0</float>" +
            "    <byte>66</byte>" +
            "    <float>841.0</float>" +
            "    <float>628.0</float>" +
            "    <float>639.0</float>" +
            "    <float>676.0</float>" +
            "    <byte>66</byte>" +
            "    <float>437.0</float>" +
            "    <float>725.0</float>" +
            "    <float>356.0</float>" +
            "    <float>768.0</float>" +
            "    <byte>66</byte>" +
            "    <float>251.0</float>" +
            "    <float>823.0</float>" +
            "    <float>200.0</float>" +
            "    <float>904.0</float>" +
            "    <byte>66</byte>" +
            "    <float>148.0</float>" +
            "    <float>986.0</float>" +
            "    <float>148.0</float>" +
            "    <float>1087.0</float>" +
            "    <byte>66</byte>" +
            "    <float>148.0</float>" +
            "    <float>1198.0</float>" +
            "    <float>211.0</float>" +
            "    <float>1294.0</float>" +
            "    <byte>66</byte>" +
            "    <float>274.0</float>" +
            "    <float>1391.0</float>" +
            "    <float>395.0</float>" +
            "    <float>1441.0</float>" +
            "    <byte>66</byte>" +
            "    <float>516.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>664.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>66</byte>" +
            "    <float>827.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>951.0</float>" +
            "    <float>1439.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1076.0</float>" +
            "    <float>1386.0</float>" +
            "    <float>1143.0</float>" +
            "    <float>1284.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1210.0</float>" +
            "    <float>1182.0</float>" +
            "    <float>1215.0</float>" +
            "    <float>1053.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1029.0</float>" +
            "    <float>1039.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1014.0</float>" +
            "    <float>1178.0</float>" +
            "    <float>928.0</float>" +
            "    <float>1249.0</float>" +
            "    <byte>66</byte>" +
            "    <float>841.0</float>" +
            "    <float>1320.0</float>" +
            "    <float>672.0</float>" +
            "    <float>1320.0</float>" +
            "    <byte>66</byte>" +
            "    <float>496.0</float>" +
            "    <float>1320.0</float>" +
            "    <float>416.0</float>" +
            "    <float>1256.0</float>" +
            "    <byte>66</byte>" +
            "    <float>335.0</float>" +
            "    <float>1191.0</float>" +
            "    <float>335.0</float>" +
            "    <float>1100.0</float>" +
            "    <byte>66</byte>" +
            "    <float>335.0</float>" +
            "    <float>1021.0</float>" +
            "    <float>392.0</float>" +
            "    <float>970.0</float>" +
            "    <byte>66</byte>" +
            "    <float>448.0</float>" +
            "    <float>919.0</float>" +
            "    <float>684.0</float>" +
            "    <float>866.0</float>" +
            "    <byte>66</byte>" +
            "    <float>921.0</float>" +
            "    <float>812.0</float>" +
            "    <float>1009.0</float>" +
            "    <float>772.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1137.0</float>" +
            "    <float>713.0</float>" +
            "    <float>1198.0</float>" +
            "    <float>623.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1259.0</float>" +
            "    <float>532.0</float>" +
            "    <float>1259.0</float>" +
            "    <float>414.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1259.0</float>" +
            "    <float>297.0</float>" +
            "    <float>1192.0</float>" +
            "    <float>194.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1125.0</float>" +
            "    <float>90.0</float>" +
            "    <float>1000.0</float>" +
            "    <float>33.0</float>" +
            "    <byte>66</byte>" +
            "    <float>874.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>717.0</float>" +
            "    <float>-25.0</float>" +
            "    <byte>66</byte>" +
            "    <float>518.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>384.0</float>" +
            "    <float>33.0</float>" +
            "    <byte>66</byte>" +
            "    <float>249.0</float>" +
            "    <float>91.0</float>" +
            "    <float>173.0</float>" +
            "    <float>207.0</float>" +
            "    <byte>66</byte>" +
            "    <float>96.0</float>" +
            "    <float>324.0</float>" +
            "    <float>92.0</float>" +
            "    <float>471.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>20</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>147.0</float>" +
            "    <float>1206.0</float>" +
            "    <byte>65</byte>" +
            "    <float>147.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>428.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>428.0</float>" +
            "    <float>1206.0</float>" +
            "    <byte>65</byte>" +
            "    <float>147.0</float>" +
            "    <float>1206.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>147.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>147.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>428.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>428.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>147.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>38</int>" +
            "    <int>130</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>357.0</float>" +
            "    <float>738.0</float>" +
            "    <byte>65</byte>" +
            "    <float>102.0</float>" +
            "    <float>784.0</float>" +
            "    <byte>66</byte>" +
            "    <float>145.0</float>" +
            "    <float>938.0</float>" +
            "    <float>250.0</float>" +
            "    <float>1012.0</float>" +
            "    <byte>66</byte>" +
            "    <float>355.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>562.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>750.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>842.0</float>" +
            "    <float>1042.0</float>" +
            "    <byte>66</byte>" +
            "    <float>934.0</float>" +
            "    <float>997.0</float>" +
            "    <float>971.0</float>" +
            "    <float>929.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1009.0</float>" +
            "    <float>860.0</float>" +
            "    <float>1009.0</float>" +
            "    <float>677.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1006.0</float>" +
            "    <float>349.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1006.0</float>" +
            "    <float>209.0</float>" +
            "    <float>1019.0</float>" +
            "    <float>143.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1033.0</float>" +
            "    <float>76.0</float>" +
            "    <float>1070.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>792.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>66</byte>" +
            "    <float>781.0</float>" +
            "    <float>28.0</float>" +
            "    <float>765.0</float>" +
            "    <float>83.0</float>" +
            "    <byte>66</byte>" +
            "    <float>758.0</float>" +
            "    <float>108.0</float>" +
            "    <float>755.0</float>" +
            "    <float>116.0</float>" +
            "    <byte>66</byte>" +
            "    <float>683.0</float>" +
            "    <float>46.0</float>" +
            "    <float>601.0</float>" +
            "    <float>11.0</float>" +
            "    <byte>66</byte>" +
            "    <float>519.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>426.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>262.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>168.0</float>" +
            "    <float>65.0</float>" +
            "    <byte>66</byte>" +
            "    <float>73.0</float>" +
            "    <float>154.0</float>" +
            "    <float>73.0</float>" +
            "    <float>290.0</float>" +
            "    <byte>66</byte>" +
            "    <float>73.0</float>" +
            "    <float>380.0</float>" +
            "    <float>116.0</float>" +
            "    <float>450.0</float>" +
            "    <byte>66</byte>" +
            "    <float>159.0</float>" +
            "    <float>521.0</float>" +
            "    <float>236.0</float>" +
            "    <float>558.0</float>" +
            "    <byte>66</byte>" +
            "    <float>314.0</float>" +
            "    <float>596.0</float>" +
            "    <float>460.0</float>" +
            "    <float>624.0</float>" +
            "    <byte>66</byte>" +
            "    <float>657.0</float>" +
            "    <float>661.0</float>" +
            "    <float>733.0</float>" +
            "    <float>693.0</float>" +
            "    <byte>65</byte>" +
            "    <float>733.0</float>" +
            "    <float>721.0</float>" +
            "    <byte>66</byte>" +
            "    <float>733.0</float>" +
            "    <float>802.0</float>" +
            "    <float>693.0</float>" +
            "    <float>836.0</float>" +
            "    <byte>66</byte>" +
            "    <float>653.0</float>" +
            "    <float>871.0</float>" +
            "    <float>542.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>467.0</float>" +
            "    <float>871.0</float>" +
            "    <float>425.0</float>" +
            "    <float>842.0</float>" +
            "    <byte>66</byte>" +
            "    <float>383.0</float>" +
            "    <float>812.0</float>" +
            "    <float>357.0</float>" +
            "    <float>738.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>733.0</float>" +
            "    <float>510.0</float>" +
            "    <byte>66</byte>" +
            "    <float>679.0</float>" +
            "    <float>492.0</float>" +
            "    <float>562.0</float>" +
            "    <float>467.0</float>" +
            "    <byte>66</byte>" +
            "    <float>445.0</float>" +
            "    <float>442.0</float>" +
            "    <float>409.0</float>" +
            "    <float>418.0</float>" +
            "    <byte>66</byte>" +
            "    <float>354.0</float>" +
            "    <float>379.0</float>" +
            "    <float>354.0</float>" +
            "    <float>319.0</float>" +
            "    <byte>66</byte>" +
            "    <float>354.0</float>" +
            "    <float>260.0</float>" +
            "    <float>398.0</float>" +
            "    <float>217.0</float>" +
            "    <byte>66</byte>" +
            "    <float>442.0</float>" +
            "    <float>174.0</float>" +
            "    <float>510.0</float>" +
            "    <float>174.0</float>" +
            "    <byte>66</byte>" +
            "    <float>586.0</float>" +
            "    <float>174.0</float>" +
            "    <float>655.0</float>" +
            "    <float>224.0</float>" +
            "    <byte>66</byte>" +
            "    <float>706.0</float>" +
            "    <float>262.0</float>" +
            "    <float>722.0</float>" +
            "    <float>317.0</float>" +
            "    <byte>66</byte>" +
            "    <float>733.0</float>" +
            "    <float>353.0</float>" +
            "    <float>733.0</float>" +
            "    <float>454.0</float>" +
            "    <byte>65</byte>" +
            "    <float>733.0</float>" +
            "    <float>510.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>19</int>" +
            "    <int>54</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>135.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>135.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>315.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>315.0</float>" +
            "    <float>940.0</float>" +
            "    <byte>66</byte>" +
            "    <float>441.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>633.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>751.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>838.0</float>" +
            "    <float>1040.0</float>" +
            "    <byte>66</byte>" +
            "    <float>925.0</float>" +
            "    <float>993.0</float>" +
            "    <float>962.0</float>" +
            "    <float>911.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1000.0</float>" +
            "    <float>829.0</float>" +
            "    <float>1000.0</float>" +
            "    <float>673.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1000.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>820.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>820.0</float>" +
            "    <float>673.0</float>" +
            "    <byte>66</byte>" +
            "    <float>820.0</float>" +
            "    <float>808.0</float>" +
            "    <float>762.0</float>" +
            "    <float>869.0</float>" +
            "    <byte>66</byte>" +
            "    <float>703.0</float>" +
            "    <float>931.0</float>" +
            "    <float>596.0</float>" +
            "    <float>931.0</float>" +
            "    <byte>66</byte>" +
            "    <float>516.0</float>" +
            "    <float>931.0</float>" +
            "    <float>446.0</float>" +
            "    <float>890.0</float>" +
            "    <byte>66</byte>" +
            "    <float>375.0</float>" +
            "    <float>848.0</float>" +
            "    <float>345.0</float>" +
            "    <float>777.0</float>" +
            "    <byte>66</byte>" +
            "    <float>315.0</float>" +
            "    <float>706.0</float>" +
            "    <float>315.0</float>" +
            "    <float>581.0</float>" +
            "    <byte>65</byte>" +
            "    <float>315.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>135.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>104</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>28</int>" +
            "    <int>102</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>48.0</float>" +
            "    <float>303.0</float>" +
            "    <byte>65</byte>" +
            "    <float>330.0</float>" +
            "    <float>346.0</float>" +
            "    <byte>66</byte>" +
            "    <float>348.0</float>" +
            "    <float>264.0</float>" +
            "    <float>403.0</float>" +
            "    <float>222.0</float>" +
            "    <byte>66</byte>" +
            "    <float>458.0</float>" +
            "    <float>179.0</float>" +
            "    <float>557.0</float>" +
            "    <float>179.0</float>" +
            "    <byte>66</byte>" +
            "    <float>666.0</float>" +
            "    <float>179.0</float>" +
            "    <float>721.0</float>" +
            "    <float>219.0</float>" +
            "    <byte>66</byte>" +
            "    <float>758.0</float>" +
            "    <float>247.0</float>" +
            "    <float>758.0</float>" +
            "    <float>294.0</float>" +
            "    <byte>66</byte>" +
            "    <float>758.0</float>" +
            "    <float>326.0</float>" +
            "    <float>738.0</float>" +
            "    <float>347.0</float>" +
            "    <byte>66</byte>" +
            "    <float>717.0</float>" +
            "    <float>367.0</float>" +
            "    <float>644.0</float>" +
            "    <float>384.0</float>" +
            "    <byte>66</byte>" +
            "    <float>304.0</float>" +
            "    <float>459.0</float>" +
            "    <float>213.0</float>" +
            "    <float>521.0</float>" +
            "    <byte>66</byte>" +
            "    <float>87.0</float>" +
            "    <float>607.0</float>" +
            "    <float>87.0</float>" +
            "    <float>760.0</float>" +
            "    <byte>66</byte>" +
            "    <float>87.0</float>" +
            "    <float>898.0</float>" +
            "    <float>196.0</float>" +
            "    <float>992.0</float>" +
            "    <byte>66</byte>" +
            "    <float>305.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>534.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>752.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>858.0</float>" +
            "    <float>1015.0</float>" +
            "    <byte>66</byte>" +
            "    <float>964.0</float>" +
            "    <float>944.0</float>" +
            "    <float>1004.0</float>" +
            "    <float>805.0</float>" +
            "    <byte>65</byte>" +
            "    <float>739.0</float>" +
            "    <float>756.0</float>" +
            "    <byte>66</byte>" +
            "    <float>722.0</float>" +
            "    <float>818.0</float>" +
            "    <float>675.0</float>" +
            "    <float>851.0</float>" +
            "    <byte>66</byte>" +
            "    <float>627.0</float>" +
            "    <float>884.0</float>" +
            "    <float>539.0</float>" +
            "    <float>884.0</float>" +
            "    <byte>66</byte>" +
            "    <float>428.0</float>" +
            "    <float>884.0</float>" +
            "    <float>380.0</float>" +
            "    <float>853.0</float>" +
            "    <byte>66</byte>" +
            "    <float>348.0</float>" +
            "    <float>831.0</float>" +
            "    <float>348.0</float>" +
            "    <float>796.0</float>" +
            "    <byte>66</byte>" +
            "    <float>348.0</float>" +
            "    <float>766.0</float>" +
            "    <float>376.0</float>" +
            "    <float>745.0</float>" +
            "    <byte>66</byte>" +
            "    <float>414.0</float>" +
            "    <float>717.0</float>" +
            "    <float>638.0</float>" +
            "    <float>666.0</float>" +
            "    <byte>66</byte>" +
            "    <float>863.0</float>" +
            "    <float>615.0</float>" +
            "    <float>952.0</float>" +
            "    <float>541.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1040.0</float>" +
            "    <float>466.0</float>" +
            "    <float>1040.0</float>" +
            "    <float>332.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1040.0</float>" +
            "    <float>186.0</float>" +
            "    <float>918.0</float>" +
            "    <float>81.0</float>" +
            "    <byte>66</byte>" +
            "    <float>796.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>557.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>340.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>214.0</float>" +
            "    <float>64.0</float>" +
            "    <byte>66</byte>" +
            "    <float>87.0</float>" +
            "    <float>152.0</float>" +
            "    <float>48.0</float>" +
            "    <float>303.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>1471.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1149.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1021.0</float>" +
            "    <float>333.0</float>" +
            "    <byte>65</byte>" +
            "    <float>435.0</float>" +
            "    <float>333.0</float>" +
            "    <byte>65</byte>" +
            "    <float>314.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>0.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>571.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>884.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1471.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>926.0</float>" +
            "    <float>580.0</float>" +
            "    <byte>65</byte>" +
            "    <float>724.0</float>" +
            "    <float>1124.0</float>" +
            "    <byte>65</byte>" +
            "    <float>526.0</float>" +
            "    <float>580.0</float>" +
            "    <byte>65</byte>" +
            "    <float>926.0</float>" +
            "    <float>580.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>27</int>" +
            "    <int>84</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>751.0</float>" +
            "    <float>378.0</float>" +
            "    <byte>65</byte>" +
            "    <float>496.0</float>" +
            "    <float>378.0</float>" +
            "    <byte>66</byte>" +
            "    <float>495.0</float>" +
            "    <float>433.0</float>" +
            "    <float>495.0</float>" +
            "    <float>445.0</float>" +
            "    <byte>66</byte>" +
            "    <float>495.0</float>" +
            "    <float>569.0</float>" +
            "    <float>536.0</float>" +
            "    <float>649.0</float>" +
            "    <byte>66</byte>" +
            "    <float>577.0</float>" +
            "    <float>729.0</float>" +
            "    <float>700.0</float>" +
            "    <float>829.0</float>" +
            "    <byte>66</byte>" +
            "    <float>823.0</float>" +
            "    <float>929.0</float>" +
            "    <float>847.0</float>" +
            "    <float>960.0</float>" +
            "    <byte>66</byte>" +
            "    <float>884.0</float>" +
            "    <float>1009.0</float>" +
            "    <float>884.0</float>" +
            "    <float>1068.0</float>" +
            "    <byte>66</byte>" +
            "    <float>884.0</float>" +
            "    <float>1150.0</float>" +
            "    <float>819.0</float>" +
            "    <float>1208.0</float>" +
            "    <byte>66</byte>" +
            "    <float>753.0</float>" +
            "    <float>1267.0</float>" +
            "    <float>642.0</float>" +
            "    <float>1267.0</float>" +
            "    <byte>66</byte>" +
            "    <float>535.0</float>" +
            "    <float>1267.0</float>" +
            "    <float>463.0</float>" +
            "    <float>1206.0</float>" +
            "    <byte>66</byte>" +
            "    <float>391.0</float>" +
            "    <float>1145.0</float>" +
            "    <float>364.0</float>" +
            "    <float>1020.0</float>" +
            "    <byte>65</byte>" +
            "    <float>106.0</float>" +
            "    <float>1052.0</float>" +
            "    <byte>66</byte>" +
            "    <float>117.0</float>" +
            "    <float>1231.0</float>" +
            "    <float>258.0</float>" +
            "    <float>1356.0</float>" +
            "    <byte>66</byte>" +
            "    <float>400.0</float>" +
            "    <float>1481.0</float>" +
            "    <float>630.0</float>" +
            "    <float>1481.0</float>" +
            "    <byte>66</byte>" +
            "    <float>872.0</float>" +
            "    <float>1481.0</float>" +
            "    <float>1015.0</float>" +
            "    <float>1355.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1158.0</float>" +
            "    <float>1228.0</float>" +
            "    <float>1158.0</float>" +
            "    <float>1060.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1158.0</float>" +
            "    <float>967.0</float>" +
            "    <float>1106.0</float>" +
            "    <float>884.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1053.0</float>" +
            "    <float>801.0</float>" +
            "    <float>881.0</float>" +
            "    <float>658.0</float>" +
            "    <byte>66</byte>" +
            "    <float>792.0</float>" +
            "    <float>584.0</float>" +
            "    <float>771.0</float>" +
            "    <float>539.0</float>" +
            "    <byte>66</byte>" +
            "    <float>749.0</float>" +
            "    <float>494.0</float>" +
            "    <float>751.0</float>" +
            "    <float>378.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>496.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>496.0</float>" +
            "    <float>281.0</float>" +
            "    <byte>65</byte>" +
            "    <float>777.0</float>" +
            "    <float>281.0</float>" +
            "    <byte>65</byte>" +
            "    <float>777.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>496.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>63</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>416.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>135.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>135.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>396.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>396.0</float>" +
            "    <float>911.0</float>" +
            "    <byte>66</byte>" +
            "    <float>463.0</float>" +
            "    <float>1018.0</float>" +
            "    <float>516.0</float>" +
            "    <float>1052.0</float>" +
            "    <byte>66</byte>" +
            "    <float>570.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>638.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>734.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>823.0</float>" +
            "    <float>1033.0</float>" +
            "    <byte>65</byte>" +
            "    <float>736.0</float>" +
            "    <float>788.0</float>" +
            "    <byte>66</byte>" +
            "    <float>665.0</float>" +
            "    <float>834.0</float>" +
            "    <float>604.0</float>" +
            "    <float>834.0</float>" +
            "    <byte>66</byte>" +
            "    <float>545.0</float>" +
            "    <float>834.0</float>" +
            "    <float>504.0</float>" +
            "    <float>802.0</float>" +
            "    <byte>66</byte>" +
            "    <float>463.0</float>" +
            "    <float>769.0</float>" +
            "    <float>440.0</float>" +
            "    <float>684.0</float>" +
            "    <byte>66</byte>" +
            "    <float>416.0</float>" +
            "    <float>599.0</float>" +
            "    <float>416.0</float>" +
            "    <float>328.0</float>" +
            "    <byte>65</byte>" +
            "    <float>416.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>152.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>152.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>440.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1040.0</float>" +
            "    <float>487.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1040.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1315.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1315.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1018.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>427.0</float>" +
            "    <float>956.0</float>" +
            "    <byte>65</byte>" +
            "    <float>427.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>152.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>139.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>401.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>401.0</float>" +
            "    <float>906.0</float>" +
            "    <byte>66</byte>" +
            "    <float>452.0</float>" +
            "    <float>986.0</float>" +
            "    <float>539.0</float>" +
            "    <float>1036.0</float>" +
            "    <byte>66</byte>" +
            "    <float>626.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>732.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>917.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>1046.0</float>" +
            "    <float>941.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1175.0</float>" +
            "    <float>796.0</float>" +
            "    <float>1175.0</float>" +
            "    <float>537.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1175.0</float>" +
            "    <float>271.0</float>" +
            "    <float>1045.0</float>" +
            "    <float>124.0</float>" +
            "    <byte>66</byte>" +
            "    <float>915.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>730.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>642.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>571.0</float>" +
            "    <float>11.0</float>" +
            "    <byte>66</byte>" +
            "    <float>499.0</float>" +
            "    <float>46.0</float>" +
            "    <float>420.0</float>" +
            "    <float>131.0</float>" +
            "    <byte>65</byte>" +
            "    <float>420.0</float>" +
            "    <float>-404.0</float>" +
            "    <byte>65</byte>" +
            "    <float>139.0</float>" +
            "    <float>-404.0</float>" +
            "    <byte>65</byte>" +
            "    <float>139.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>417.0</float>" +
            "    <float>549.0</float>" +
            "    <byte>66</byte>" +
            "    <float>417.0</float>" +
            "    <float>370.0</float>" +
            "    <float>488.0</float>" +
            "    <float>285.0</float>" +
            "    <byte>66</byte>" +
            "    <float>559.0</float>" +
            "    <float>199.0</float>" +
            "    <float>661.0</float>" +
            "    <float>199.0</float>" +
            "    <byte>66</byte>" +
            "    <float>759.0</float>" +
            "    <float>199.0</float>" +
            "    <float>824.0</float>" +
            "    <float>277.0</float>" +
            "    <byte>66</byte>" +
            "    <float>889.0</float>" +
            "    <float>356.0</float>" +
            "    <float>889.0</float>" +
            "    <float>535.0</float>" +
            "    <byte>66</byte>" +
            "    <float>889.0</float>" +
            "    <float>702.0</float>" +
            "    <float>822.0</float>" +
            "    <float>783.0</float>" +
            "    <byte>66</byte>" +
            "    <float>755.0</float>" +
            "    <float>864.0</float>" +
            "    <float>656.0</float>" +
            "    <float>864.0</float>" +
            "    <byte>66</byte>" +
            "    <float>553.0</float>" +
            "    <float>864.0</float>" +
            "    <float>485.0</float>" +
            "    <float>785.0</float>" +
            "    <byte>66</byte>" +
            "    <float>417.0</float>" +
            "    <float>705.0</float>" +
            "    <float>417.0</float>" +
            "    <float>549.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>846.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>846.0</float>" +
            "    <float>159.0</float>" +
            "    <byte>66</byte>" +
            "    <float>788.0</float>" +
            "    <float>74.0</float>" +
            "    <float>694.0</float>" +
            "    <float>25.0</float>" +
            "    <byte>66</byte>" +
            "    <float>599.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>494.0</float>" +
            "    <float>-24.0</float>" +
            "    <byte>66</byte>" +
            "    <float>387.0</float>" +
            "    <float>-24.0</float>" +
            "    <float>302.0</float>" +
            "    <float>23.0</float>" +
            "    <byte>66</byte>" +
            "    <float>217.0</float>" +
            "    <float>70.0</float>" +
            "    <float>179.0</float>" +
            "    <float>155.0</float>" +
            "    <byte>66</byte>" +
            "    <float>141.0</float>" +
            "    <float>240.0</float>" +
            "    <float>141.0</float>" +
            "    <float>390.0</float>" +
            "    <byte>65</byte>" +
            "    <float>141.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>422.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>422.0</float>" +
            "    <float>574.0</float>" +
            "    <byte>66</byte>" +
            "    <float>422.0</float>" +
            "    <float>350.0</float>" +
            "    <float>437.0</float>" +
            "    <float>300.0</float>" +
            "    <byte>66</byte>" +
            "    <float>453.0</float>" +
            "    <float>249.0</float>" +
            "    <float>494.0</float>" +
            "    <float>220.0</float>" +
            "    <byte>66</byte>" +
            "    <float>535.0</float>" +
            "    <float>190.0</float>" +
            "    <float>598.0</float>" +
            "    <float>190.0</float>" +
            "    <byte>66</byte>" +
            "    <float>670.0</float>" +
            "    <float>190.0</float>" +
            "    <float>727.0</float>" +
            "    <float>229.0</float>" +
            "    <byte>66</byte>" +
            "    <float>784.0</float>" +
            "    <float>269.0</float>" +
            "    <float>805.0</float>" +
            "    <float>327.0</float>" +
            "    <byte>66</byte>" +
            "    <float>826.0</float>" +
            "    <float>386.0</float>" +
            "    <float>826.0</float>" +
            "    <float>614.0</float>" +
            "    <byte>65</byte>" +
            "    <float>826.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1107.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1107.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>846.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>117</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>100</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>126.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>385.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>385.0</float>" +
            "    <float>917.0</float>" +
            "    <byte>66</byte>" +
            "    <float>524.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>716.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>818.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>893.0</float>" +
            "    <float>1044.0</float>" +
            "    <byte>66</byte>" +
            "    <float>968.0</float>" +
            "    <float>1002.0</float>" +
            "    <float>1016.0</float>" +
            "    <float>917.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1086.0</float>" +
            "    <float>1002.0</float>" +
            "    <float>1167.0</float>" +
            "    <float>1044.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1248.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>1340.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1457.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>1538.0</float>" +
            "    <float>1039.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1619.0</float>" +
            "    <float>991.0</float>" +
            "    <float>1659.0</float>" +
            "    <float>899.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1688.0</float>" +
            "    <float>831.0</float>" +
            "    <float>1688.0</float>" +
            "    <float>679.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1688.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1407.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1407.0</float>" +
            "    <float>607.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1407.0</float>" +
            "    <float>765.0</float>" +
            "    <float>1378.0</float>" +
            "    <float>811.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1339.0</float>" +
            "    <float>871.0</float>" +
            "    <float>1258.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1199.0</float>" +
            "    <float>871.0</float>" +
            "    <float>1147.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1095.0</float>" +
            "    <float>799.0</float>" +
            "    <float>1072.0</float>" +
            "    <float>730.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1049.0</float>" +
            "    <float>660.0</float>" +
            "    <float>1049.0</float>" +
            "    <float>510.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1049.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>768.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>768.0</float>" +
            "    <float>582.0</float>" +
            "    <byte>66</byte>" +
            "    <float>768.0</float>" +
            "    <float>737.0</float>" +
            "    <float>753.0</float>" +
            "    <float>782.0</float>" +
            "    <byte>66</byte>" +
            "    <float>738.0</float>" +
            "    <float>827.0</float>" +
            "    <float>707.0</float>" +
            "    <float>849.0</float>" +
            "    <byte>66</byte>" +
            "    <float>675.0</float>" +
            "    <float>871.0</float>" +
            "    <float>621.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>556.0</float>" +
            "    <float>871.0</float>" +
            "    <float>504.0</float>" +
            "    <float>836.0</float>" +
            "    <byte>66</byte>" +
            "    <float>452.0</float>" +
            "    <float>801.0</float>" +
            "    <float>430.0</float>" +
            "    <float>735.0</float>" +
            "    <byte>66</byte>" +
            "    <float>407.0</float>" +
            "    <float>669.0</float>" +
            "    <float>407.0</float>" +
            "    <float>516.0</float>" +
            "    <byte>65</byte>" +
            "    <float>407.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>126.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>126.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>89.0</float>" +
            "    <float>724.0</float>" +
            "    <byte>66</byte>" +
            "    <float>89.0</float>" +
            "    <float>948.0</float>" +
            "    <float>156.0</float>" +
            "    <float>1100.0</float>" +
            "    <byte>66</byte>" +
            "    <float>206.0</float>" +
            "    <float>1212.0</float>" +
            "    <float>292.0</float>" +
            "    <float>1301.0</float>" +
            "    <byte>66</byte>" +
            "    <float>379.0</float>" +
            "    <float>1390.0</float>" +
            "    <float>482.0</float>" +
            "    <float>1433.0</float>" +
            "    <byte>66</byte>" +
            "    <float>619.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>798.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1122.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>1316.0</float>" +
            "    <float>1290.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1511.0</float>" +
            "    <float>1089.0</float>" +
            "    <float>1511.0</float>" +
            "    <float>731.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1511.0</float>" +
            "    <float>376.0</float>" +
            "    <float>1318.0</float>" +
            "    <float>176.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1125.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>802.0</float>" +
            "    <float>-25.0</float>" +
            "    <byte>66</byte>" +
            "    <float>475.0</float>" +
            "    <float>-25.0</float>" +
            "    <float>282.0</float>" +
            "    <float>174.0</float>" +
            "    <byte>66</byte>" +
            "    <float>89.0</float>" +
            "    <float>374.0</float>" +
            "    <float>89.0</float>" +
            "    <float>724.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>394.0</float>" +
            "    <float>734.0</float>" +
            "    <byte>66</byte>" +
            "    <float>394.0</float>" +
            "    <float>485.0</float>" +
            "    <float>509.0</float>" +
            "    <float>357.0</float>" +
            "    <byte>66</byte>" +
            "    <float>624.0</float>" +
            "    <float>228.0</float>" +
            "    <float>801.0</float>" +
            "    <float>228.0</float>" +
            "    <byte>66</byte>" +
            "    <float>978.0</float>" +
            "    <float>228.0</float>" +
            "    <float>1091.0</float>" +
            "    <float>355.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1205.0</float>" +
            "    <float>483.0</float>" +
            "    <float>1205.0</float>" +
            "    <float>738.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1205.0</float>" +
            "    <float>990.0</float>" +
            "    <float>1095.0</float>" +
            "    <float>1114.0</float>" +
            "    <byte>66</byte>" +
            "    <float>984.0</float>" +
            "    <float>1238.0</float>" +
            "    <float>801.0</float>" +
            "    <float>1238.0</float>" +
            "    <byte>66</byte>" +
            "    <float>618.0</float>" +
            "    <float>1238.0</float>" +
            "    <float>506.0</float>" +
            "    <float>1113.0</float>" +
            "    <byte>66</byte>" +
            "    <float>394.0</float>" +
            "    <float>987.0</float>" +
            "    <float>394.0</float>" +
            "    <float>734.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>427.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>427.0</float>" +
            "    <float>927.0</float>" +
            "    <byte>66</byte>" +
            "    <float>563.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>752.0</float>" +
            "    <float>1086.0</float>" +
            "    <byte>66</byte>" +
            "    <float>849.0</float>" +
            "    <float>1086.0</float>" +
            "    <float>927.0</float>" +
            "    <float>1050.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1005.0</float>" +
            "    <float>1014.0</float>" +
            "    <float>1044.0</float>" +
            "    <float>958.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1084.0</float>" +
            "    <float>902.0</float>" +
            "    <float>1098.0</float>" +
            "    <float>834.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1113.0</float>" +
            "    <float>766.0</float>" +
            "    <float>1113.0</float>" +
            "    <float>623.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1113.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>832.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>832.0</float>" +
            "    <float>561.0</float>" +
            "    <byte>66</byte>" +
            "    <float>832.0</float>" +
            "    <float>728.0</float>" +
            "    <float>816.0</float>" +
            "    <float>773.0</float>" +
            "    <byte>66</byte>" +
            "    <float>800.0</float>" +
            "    <float>818.0</float>" +
            "    <float>760.0</float>" +
            "    <float>844.0</float>" +
            "    <byte>66</byte>" +
            "    <float>719.0</float>" +
            "    <float>871.0</float>" +
            "    <float>658.0</float>" +
            "    <float>871.0</float>" +
            "    <byte>66</byte>" +
            "    <float>588.0</float>" +
            "    <float>871.0</float>" +
            "    <float>533.0</float>" +
            "    <float>837.0</float>" +
            "    <byte>66</byte>" +
            "    <float>478.0</float>" +
            "    <float>803.0</float>" +
            "    <float>453.0</float>" +
            "    <float>735.0</float>" +
            "    <byte>66</byte>" +
            "    <float>427.0</float>" +
            "    <float>666.0</float>" +
            "    <float>427.0</float>" +
            "    <float>532.0</float>" +
            "    <byte>65</byte>" +
            "    <float>427.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>146.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>146.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>427.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>104</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>12.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>395.0</float>" +
            "    <float>547.0</float>" +
            "    <byte>65</byte>" +
            "    <float>28.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>371.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>559.0</float>" +
            "    <float>770.0</float>" +
            "    <byte>65</byte>" +
            "    <float>757.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1087.0</float>" +
            "    <float>1062.0</float>" +
            "    <byte>65</byte>" +
            "    <float>727.0</float>" +
            "    <float>559.0</float>" +
            "    <byte>65</byte>" +
            "    <float>1120.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>775.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>559.0</float>" +
            "    <float>329.0</float>" +
            "    <byte>65</byte>" +
            "    <float>341.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>12.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>72</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>149.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>149.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>65</byte>" +
            "    <float>624.0</float>" +
            "    <float>1466.0</float>" +
            "    <byte>66</byte>" +
            "    <float>894.0</float>" +
            "    <float>1466.0</float>" +
            "    <float>976.0</float>" +
            "    <float>1444.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1102.0</float>" +
            "    <float>1411.0</float>" +
            "    <float>1187.0</float>" +
            "    <float>1301.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1272.0</float>" +
            "    <float>1190.0</float>" +
            "    <float>1272.0</float>" +
            "    <float>1015.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1272.0</float>" +
            "    <float>880.0</float>" +
            "    <float>1223.0</float>" +
            "    <float>788.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1174.0</float>" +
            "    <float>696.0</float>" +
            "    <float>1099.0</float>" +
            "    <float>644.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1023.0</float>" +
            "    <float>591.0</float>" +
            "    <float>945.0</float>" +
            "    <float>574.0</float>" +
            "    <byte>66</byte>" +
            "    <float>839.0</float>" +
            "    <float>553.0</float>" +
            "    <float>638.0</float>" +
            "    <float>553.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>553.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>149.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>445.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>802.0</float>" +
            "    <byte>65</byte>" +
            "    <float>607.0</float>" +
            "    <float>802.0</float>" +
            "    <byte>66</byte>" +
            "    <float>782.0</float>" +
            "    <float>802.0</float>" +
            "    <float>841.0</float>" +
            "    <float>825.0</float>" +
            "    <byte>66</byte>" +
            "    <float>900.0</float>" +
            "    <float>848.0</float>" +
            "    <float>933.0</float>" +
            "    <float>897.0</float>" +
            "    <byte>66</byte>" +
            "    <float>967.0</float>" +
            "    <float>946.0</float>" +
            "    <float>967.0</float>" +
            "    <float>1011.0</float>" +
            "    <byte>66</byte>" +
            "    <float>967.0</float>" +
            "    <float>1091.0</float>" +
            "    <float>920.0</float>" +
            "    <float>1143.0</float>" +
            "    <byte>66</byte>" +
            "    <float>873.0</float>" +
            "    <float>1195.0</float>" +
            "    <float>801.0</float>" +
            "    <float>1208.0</float>" +
            "    <byte>66</byte>" +
            "    <float>748.0</float>" +
            "    <float>1218.0</float>" +
            "    <float>588.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>65</byte>" +
            "    <float>445.0</float>" +
            "    <float>1218.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath_int36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getPath_int36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>118</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>74.0</float>" +
            "    <float>477.0</float>" +
            "    <byte>65</byte>" +
            "    <float>362.0</float>" +
            "    <float>505.0</float>" +
            "    <byte>66</byte>" +
            "    <float>388.0</float>" +
            "    <float>360.0</float>" +
            "    <float>467.0</float>" +
            "    <float>292.0</float>" +
            "    <byte>66</byte>" +
            "    <float>547.0</float>" +
            "    <float>224.0</float>" +
            "    <float>682.0</float>" +
            "    <float>224.0</float>" +
            "    <byte>66</byte>" +
            "    <float>825.0</float>" +
            "    <float>224.0</float>" +
            "    <float>897.0</float>" +
            "    <float>284.0</float>" +
            "    <byte>66</byte>" +
            "    <float>970.0</float>" +
            "    <float>345.0</float>" +
            "    <float>970.0</float>" +
            "    <float>426.0</float>" +
            "    <byte>66</byte>" +
            "    <float>970.0</float>" +
            "    <float>478.0</float>" +
            "    <float>940.0</float>" +
            "    <float>514.0</float>" +
            "    <byte>66</byte>" +
            "    <float>909.0</float>" +
            "    <float>551.0</float>" +
            "    <float>833.0</float>" +
            "    <float>578.0</float>" +
            "    <byte>66</byte>" +
            "    <float>781.0</float>" +
            "    <float>596.0</float>" +
            "    <float>596.0</float>" +
            "    <float>642.0</float>" +
            "    <byte>66</byte>" +
            "    <float>358.0</float>" +
            "    <float>701.0</float>" +
            "    <float>262.0</float>" +
            "    <float>787.0</float>" +
            "    <byte>66</byte>" +
            "    <float>127.0</float>" +
            "    <float>908.0</float>" +
            "    <float>127.0</float>" +
            "    <float>1082.0</float>" +
            "    <byte>66</byte>" +
            "    <float>127.0</float>" +
            "    <float>1194.0</float>" +
            "    <float>190.0</float>" +
            "    <float>1291.0</float>" +
            "    <byte>66</byte>" +
            "    <float>254.0</float>" +
            "    <float>1389.0</float>" +
            "    <float>373.0</float>" +
            "    <float>1440.0</float>" +
            "    <byte>66</byte>" +
            "    <float>493.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>662.0</float>" +
            "    <float>1491.0</float>" +
            "    <byte>66</byte>" +
            "    <float>938.0</float>" +
            "    <float>1491.0</float>" +
            "    <float>1077.0</float>" +
            "    <float>1370.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1217.0</float>" +
            "    <float>1249.0</float>" +
            "    <float>1224.0</float>" +
            "    <float>1047.0</float>" +
            "    <byte>65</byte>" +
            "    <float>928.0</float>" +
            "    <float>1034.0</float>" +
            "    <byte>66</byte>" +
            "    <float>909.0</float>" +
            "    <float>1147.0</float>" +
            "    <float>847.0</float>" +
            "    <float>1196.0</float>" +
            "    <byte>66</byte>" +
            "    <float>784.0</float>" +
            "    <float>1246.0</float>" +
            "    <float>659.0</float>" +
            "    <float>1246.0</float>" +
            "    <byte>66</byte>" +
            "    <float>530.0</float>" +
            "    <float>1246.0</float>" +
            "    <float>457.0</float>" +
            "    <float>1193.0</float>" +
            "    <byte>66</byte>" +
            "    <float>410.0</float>" +
            "    <float>1159.0</float>" +
            "    <float>410.0</float>" +
            "    <float>1102.0</float>" +
            "    <byte>66</byte>" +
            "    <float>410.0</float>" +
            "    <float>1050.0</float>" +
            "    <float>454.0</float>" +
            "    <float>1013.0</float>" +
            "    <byte>66</byte>" +
            "    <float>510.0</float>" +
            "    <float>966.0</float>" +
            "    <float>726.0</float>" +
            "    <float>915.0</float>" +
            "    <byte>66</byte>" +
            "    <float>942.0</float>" +
            "    <float>864.0</float>" +
            "    <float>1045.0</float>" +
            "    <float>810.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1149.0</float>" +
            "    <float>755.0</float>" +
            "    <float>1207.0</float>" +
            "    <float>661.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1266.0</float>" +
            "    <float>566.0</float>" +
            "    <float>1266.0</float>" +
            "    <float>427.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1266.0</float>" +
            "    <float>301.0</float>" +
            "    <float>1196.0</float>" +
            "    <float>191.0</float>" +
            "    <byte>66</byte>" +
            "    <float>1126.0</float>" +
            "    <float>81.0</float>" +
            "    <float>998.0</float>" +
            "    <float>28.0</float>" +
            "    <byte>66</byte>" +
            "    <float>870.0</float>" +
            "    <float>-26.0</float>" +
            "    <float>679.0</float>" +
            "    <float>-26.0</float>" +
            "    <byte>66</byte>" +
            "    <float>401.0</float>" +
            "    <float>-26.0</float>" +
            "    <float>252.0</float>" +
            "    <float>102.0</float>" +
            "    <byte>66</byte>" +
            "    <float>103.0</float>" +
            "    <float>231.0</float>" +
            "    <float>74.0</float>" +
            "    <float>477.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPath(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}