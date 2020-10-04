package org.apache.fontbox.ttf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestNamingTablePanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetName1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif-Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDEG+Arial-BoldMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNDPL+Arial,Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName51-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName52-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName53-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName55-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName56-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName57-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName58-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName59-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName60-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName61-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName62-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDFM+ArialMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName63-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName64-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName65-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName66-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName67-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName68-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName69-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName70-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName71-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName72-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName73-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName74-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName75-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName76-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName77-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName78-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName79-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName80-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName81-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName82-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName83-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName84-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName85-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName86-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName87-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName88-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName89-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName90-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNDAO+Arial</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName91-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName92-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName93-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName94-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName95-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName96-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName97-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName98-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNCBB+TimesNewRoman</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName99() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName99-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName100() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName100-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName101() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName101-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName102() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName102-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName103() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName103-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName104() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName104-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName105() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName105-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName106() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName106-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName107() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName107-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName108() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName108-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName109() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName109-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName110() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName110-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName111() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName111-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName112() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName112-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName113() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName113-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName114() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName114-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName115() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName115-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName116() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName116-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName117() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName117-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName118() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName118-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName119() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName119-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName120() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName120-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName121() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName121-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName122() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName122-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName123() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName123-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName124() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName124-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName125() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName125-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEKNL+Arial</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName126() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName126-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName127() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName127-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName128() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName128-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName129() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName129-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName130() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName130-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName131() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName131-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName132() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName132-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName133() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName133-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDFM+ArialMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName134() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName134-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName135() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName135-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName136() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName136-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName137() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName137-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName138() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName138-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName139() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName139-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName140() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName140-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName141() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName141-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName142() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName142-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName143() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName143-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName144() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName144-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEKNL+Arial-BoldItalicMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName145() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName145-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName146() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName146-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName147() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName147-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName148() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName148-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName149() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName149-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName150() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName150-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif-Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName151() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName151-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName152() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName152-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName153() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName153-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName154() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName154-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName155() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName155-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName156() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName156-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName157() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName157-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName158() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName158-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNDAO+Arial</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName159() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName159-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName160() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName160-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName161() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName161-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName162() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName162-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName163() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName163-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName164() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName164-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName165() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName165-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName166() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName166-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName167() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName167-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif-Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName168() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName168-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName169() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName169-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDHC+Arial</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName170() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName170-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDHC+Arial-ItalicMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName171() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName171-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName172() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName172-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName173() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName173-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName174() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName174-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName175() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName175-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName176() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName176-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName177() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName177-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName178() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName178-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName179() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName179-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName180() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName180-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName181() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName181-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName182() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName182-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName183() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName183-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName184() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName184-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName185() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName185-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName186() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName186-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName187() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName187-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName188() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName188-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName189() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName189-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName190() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName190-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName191() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName191-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName192() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName192-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName193() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName193-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans-Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName194() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName194-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName195() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName195-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName196() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName196-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName197() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName197-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName198() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName198-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName199() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName199-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName200() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName200-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans-Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName201() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName201-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName202() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName202-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName203() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName203-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName204() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName204-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName205() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName205-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName206() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName206-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName207() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName207-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName208() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName208-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName209() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName209-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName210() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName210-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName211() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName211-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName212() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName212-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName213() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName213-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEFFP+TimesNewRomanPSMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName214() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName214-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName215() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName215-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName216() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName216-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName217() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName217-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName218() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName218-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName219() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName219-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName220() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName220-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName221() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName221-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSerif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName222() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName222-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName223() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName223-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName224() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName224-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName225() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName225-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName226() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName226-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName227() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName227-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName228() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName228-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName229() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName229-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Serif</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName230() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName230-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName231() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName231-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName232() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName232-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName233() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName233-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Regular</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName234() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName234-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName235() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName235-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName236() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName236-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNCBB+TimesNewRoman</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName237() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName237-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName238() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName238-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName239() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName239-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName240() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName240-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName241() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName241-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName242() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName242-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Italic</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName243() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName243-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName244() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName244-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEDEG+Arial</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName245() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName245-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName246() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName246-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName247() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName247-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>HGNDPL+Arial,Bold</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName248() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName248-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName249() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName249-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName250() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName250-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName251() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName251-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>Liberation Sans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName252() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName252-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName253() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName253-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName254() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName254-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName255() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName255-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName256() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName256-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>BJEFFP+TimesNewRomanPSMT</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>3</int>" +
            "  <int>1</int>" +
            "  <int>1033</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName257() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName257-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>3</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName258() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName258-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName259() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName259-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>2</int>" +
            "  <int>0</int>" +
            "  <int>4</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetName260() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName260-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<string>LiberationSans</string>";
            java.lang.String expectedObject = (java.lang.String) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>6</int>" +
            "  <int>1</int>" +
            "  <int>0</int>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            int paramObject4 = (Integer) paramObjects[3];
            Assert.assertEquals(expectedObject, receivingObject.getName(paramObject1, paramObject2, paramObject3, paramObject4));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}