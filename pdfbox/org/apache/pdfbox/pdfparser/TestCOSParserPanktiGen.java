package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class TestCOSParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetEncryption1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption28-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption35-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }

    @Test
    public void testGetEncryption36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption36-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getEncryption());
    }
}