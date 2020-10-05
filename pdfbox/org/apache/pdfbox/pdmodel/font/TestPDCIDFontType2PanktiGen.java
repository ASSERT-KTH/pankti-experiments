package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class TestPDCIDFontType2PanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testCodeToGID1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testCodeToGID7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDCIDFontType2 receivingObject = (PDCIDFontType2) xStream.fromXML(receivingXML);
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
    }
}