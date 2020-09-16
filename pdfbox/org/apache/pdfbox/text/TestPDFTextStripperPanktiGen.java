package org.apache.pdfbox.text;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestPDFTextStripperPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setUpXStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testWithin1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.text.PDFTextStripper.within1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFTextStripper receivingObject = (PDFTextStripper) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>89.25</float>" +
            "  <float>89.25</float>" +
            "  <float>0.1</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            float paramObject3 = (Float) paramObjects[2];
            Class Clazz = Class.forName("org.apache.pdfbox.text.PDFTextStripper");
            Method within = Clazz.getDeclaredMethod("within", float.class, float.class, float.class);
            within.setAccessible(true);
            Assert.assertEquals(returnedObject, within.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testWithin2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.text.PDFTextStripper.within2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFTextStripper receivingObject = (PDFTextStripper) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>122.25</float>" +
            "  <float>107.25</float>" +
            "  <float>0.1</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            float paramObject3 = (Float) paramObjects[2];
            Class Clazz = Class.forName("org.apache.pdfbox.text.PDFTextStripper");
            Method within = Clazz.getDeclaredMethod("within", float.class, float.class, float.class);
            within.setAccessible(true);
            Assert.assertEquals(returnedObject, within.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testWithin3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.text.PDFTextStripper.within3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFTextStripper receivingObject = (PDFTextStripper) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>107.25</float>" +
            "  <float>89.25</float>" +
            "  <float>0.1</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            float paramObject3 = (Float) paramObjects[2];
            Class Clazz = Class.forName("org.apache.pdfbox.text.PDFTextStripper");
            Method within = Clazz.getDeclaredMethod("within", float.class, float.class, float.class);
            within.setAccessible(true);
            Assert.assertEquals(returnedObject, within.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testWithin4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.text.PDFTextStripper.within4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFTextStripper receivingObject = (PDFTextStripper) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>122.25</float>" +
            "  <float>122.25</float>" +
            "  <float>0.1</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            float paramObject3 = (Float) paramObjects[2];
            Class Clazz = Class.forName("org.apache.pdfbox.text.PDFTextStripper");
            Method within = Clazz.getDeclaredMethod("within", float.class, float.class, float.class);
            within.setAccessible(true);
            Assert.assertEquals(returnedObject, within.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testWithin5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.text.PDFTextStripper.within5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFTextStripper receivingObject = (PDFTextStripper) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>89.25</float>" +
            "  <float>89.25</float>" +
            "  <float>0.1</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            float paramObject3 = (Float) paramObjects[2];
            Class Clazz = Class.forName("org.apache.pdfbox.text.PDFTextStripper");
            Method within = Clazz.getDeclaredMethod("within", float.class, float.class, float.class);
            within.setAccessible(true);
            Assert.assertEquals(returnedObject, within.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}