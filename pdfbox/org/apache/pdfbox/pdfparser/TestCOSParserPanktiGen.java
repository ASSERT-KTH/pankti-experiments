package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
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
    public void testGetEncryption1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption3-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML =
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption5-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption6-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption7-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption9-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption10-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption11-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption13-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption14-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption15-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption16-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption18-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption22-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption23-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption24-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption25-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption26-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption27-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption29-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption31-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption32-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetEncryption37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdfparser.PDFParser receivingObject = (org.apache.pdfbox.pdfparser.PDFParser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.getEncryption37-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.encryption.PDEncryption expectedObject = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getEncryption());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}