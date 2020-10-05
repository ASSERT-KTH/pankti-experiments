package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestXrefTrailerResolverPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetXrefType1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType9-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }

    @Test
    public void testGetXrefType17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
        XrefTrailerResolver.XRefType expectedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
        Assert.assertEquals(expectedObject, receivingObject.getXrefType());
    }
}