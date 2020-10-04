package org.apache.pdfbox.pdmodel.graphics.image;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPDImageXObjectPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetMask1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetMask13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getMask13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject expectedObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetOptionalContent7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getOptionalContent7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList expectedObject = (org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getOptionalContent());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetInterpolate8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getInterpolate8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean expectedObject = (Boolean) xStream.fromXML(returnedXML);
            Assert.assertEquals(false, receivingObject.getInterpolate());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetColorKeyMask7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getColorKeyMask7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getColorKeyMask());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDecode7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.getDecode7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject receivingObject = (org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.cos.COSArray expectedObject = (org.apache.pdfbox.cos.COSArray) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getDecode());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}