package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestPDCIDFontType2PanktiGen {
    static XStream xStream = new XStream();


    @Test
    public void testCodeToGID1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>120</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(120, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>120</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(120, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(3, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>120</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(120, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(3, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(3, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCodeToGID7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>120</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(120, receivingObject.codeToGID(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPath1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
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
            "  <int>3</int>" +
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
    public void testGetPath2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>10</int>" +
            "    <int>34</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>425.0</float>" +
            "    <float>730.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>211.0</float>" +
            "    <float>472.0</float>" +
            "    <float>211.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>211.0</float>" +
            "    <float>213.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>425.0</float>" +
            "    <float>106.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>728.0</float>" +
            "    <float>213.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>942.0</float>" +
            "    <float>472.0</float>" +
            "    <float>942.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>942.0</float>" +
            "    <float>730.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>728.0</float>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
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
    public void testGetPath3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>10</int>" +
            "    <int>34</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>425.0</float>" +
            "    <float>730.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>211.0</float>" +
            "    <float>472.0</float>" +
            "    <float>211.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>211.0</float>" +
            "    <float>213.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>425.0</float>" +
            "    <float>106.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>728.0</float>" +
            "    <float>213.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>942.0</float>" +
            "    <float>472.0</float>" +
            "    <float>942.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>942.0</float>" +
            "    <float>730.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>728.0</float>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
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
    public void testGetPath4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
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
            "  <int>3</int>" +
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
    public void testGetPath5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
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
            "  <int>3</int>" +
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
    public void testGetPath6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.getPath6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 receivingObject = (org.apache.pdfbox.pdmodel.font.PDCIDFontType2) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>10</int>" +
            "    <int>34</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>425.0</float>" +
            "    <float>730.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>211.0</float>" +
            "    <float>472.0</float>" +
            "    <float>211.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>211.0</float>" +
            "    <float>213.0</float>" +
            "    <float>318.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>425.0</float>" +
            "    <float>106.0</float>" +
            "    <float>577.0</float>" +
            "    <byte>66</byte>" +
            "    <float>106.0</float>" +
            "    <float>728.0</float>" +
            "    <float>213.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>320.0</float>" +
            "    <float>942.0</float>" +
            "    <float>472.0</float>" +
            "    <float>942.0</float>" +
            "    <byte>66</byte>" +
            "    <float>623.0</float>" +
            "    <float>942.0</float>" +
            "    <float>730.0</float>" +
            "    <float>835.0</float>" +
            "    <byte>66</byte>" +
            "    <float>837.0</float>" +
            "    <float>728.0</float>" +
            "    <float>837.0</float>" +
            "    <float>577.0</float>" +
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
}