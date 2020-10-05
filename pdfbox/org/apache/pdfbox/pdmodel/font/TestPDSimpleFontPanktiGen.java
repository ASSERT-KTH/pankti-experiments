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
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testToUnicode_int1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string> </string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>32</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>e</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>101</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>S</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>83</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>E</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>69</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>t</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>116</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>S</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>83</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>r</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>114</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>R</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>82</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int9-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>e</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>101</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>E</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>69</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>u</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>117</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>A</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>65</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string> </string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>32</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>i</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>105</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>m</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>109</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>p</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>112</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>o</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>111</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int18-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>N</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>78</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>U</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>85</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string> </string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>32</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>N</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>78</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int22-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>o</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>111</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int23-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>r</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>114</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int24-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>v</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>118</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int25-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string> </string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>32</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int26-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>e</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>101</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int27-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>P</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>80</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int28-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>x</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>120</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int29-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>t</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>116</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>n</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>110</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int31-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>r</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>114</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int32-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>s</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>115</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>n</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>110</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string> </string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>32</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testToUnicode_int35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int35-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<string>m</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>109</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.toUnicode(paramObject1));
    }

    @Test
    public void testHasExplicitWidth1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth9-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth18-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth22-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth23-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth24-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth25-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth26-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth27-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth28-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth29-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth31-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth32-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth35-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth36-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth37-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth38-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth39-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth40-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth41-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth42-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth43-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth44-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth45-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth46-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth47-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth48-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth49-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth50-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth51-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth52-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth53-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth54-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth55-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth56-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth57-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth58-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth59-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth60-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth61-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth62-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth63-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth64-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth65-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth66-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth67-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth68-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth69-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth70-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth71-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth72-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth73-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth74-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth75-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth76-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth77-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth78-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth79-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth80() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth80-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth81-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth82-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth83-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth84-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth85-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth86-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth87-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth88() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth88-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth89-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth90-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth91-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth92-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth93-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth94() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth94-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth95-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth96-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth97() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth97-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth98-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth99-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth100() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth100-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth101-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth102() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth102-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth103-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth104-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth105-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth106-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth107() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth107-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth108() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth108-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth109() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth109-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth110() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth110-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth111() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth111-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth112() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth112-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth113() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth113-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth114() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth114-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth115() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth115-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth116() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth116-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testHasExplicitWidth117() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDSimpleFont.hasExplicitWidth117-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDTrueTypeFont receivingObject = (PDTrueTypeFont) xStream.fromXML(receivingXML);
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
    }
}