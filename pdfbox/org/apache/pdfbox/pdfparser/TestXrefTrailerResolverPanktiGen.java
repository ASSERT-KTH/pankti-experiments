package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestXrefTrailerResolverPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetXrefType1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetXrefType17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.XrefTrailerResolver receivingObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType expectedObject = (org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}