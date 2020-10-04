package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestPDSimpleFontPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testToUnicode_int1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string> </string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>e</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>S</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>E</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>t</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>S</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>r</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>R</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>e</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>E</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>u</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>117</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>A</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string> </string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>i</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>m</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>p</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>o</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>N</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>U</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string> </string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>N</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>o</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>r</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>v</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string> </string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>e</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>P</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>x</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>t</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>n</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>r</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>s</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>n</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string> </string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testToUnicode_int35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>m</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>108</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>108</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>46</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>99</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>103</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>102</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>52</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>66</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>33</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth51-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth52-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth53-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth55-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>108</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth56-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth57-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth58-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth59-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>108</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth60-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>103</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth61-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth62-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth63-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth64-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth65-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth66-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth67-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth68-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth69-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth70-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth71-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth72-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth73-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth74-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth75-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth76-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth77-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth78-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth79-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>108</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth80-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth81-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth82-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth83-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth84-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth85-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>121</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth86-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth87-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth88-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth89-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth90-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>67</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth91-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth92-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth93-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth94-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>117</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth95-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth96-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth97-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth98-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth99() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth99-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth100() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth100-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth101() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth101-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth102() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth102-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth103() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth103-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth104() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth104-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth105() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth105-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth106() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth106-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>99</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth107() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth107-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth108() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth108-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth109() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth109-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>121</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth110() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth110-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth111() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth111-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth112() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth112-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth113() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth113-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth114() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth114-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth115() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth115-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth116() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth116-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testHasExplicitWidth117() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth117-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = (org.apache.pdfbox.pdmodel.font.PDTrueTypeFont) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>100</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(true, receivingObject.hasExplicitWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}