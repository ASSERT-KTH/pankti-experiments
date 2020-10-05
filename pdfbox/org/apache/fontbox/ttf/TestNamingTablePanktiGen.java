package org.apache.fontbox.ttf;

import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

public class TestNamingTablePanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetName1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName9-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif-Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName18-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDEG+Arial-BoldMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName22-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName23-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName24-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName25-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName26-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName27-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName28-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName29-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName31-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName32-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNDPL+Arial,Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName35-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName36-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName37-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName38-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName39-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName40-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName41-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName42-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName43-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName44-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName45-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName46-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName47-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName48-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName49-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName50-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName51-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName52-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName53-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName54-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName55-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName56-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName57-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName58-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName59-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName60-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName61-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName62-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDFM+ArialMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName63-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName64-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName65-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName66-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName67-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName68-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName69-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName70-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName71-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName72-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName73-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName74-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName75-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName76-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName77-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName78-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName79-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName80() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName80-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName81-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName82-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName83-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName84-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName85-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName86-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName87-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName88() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName88-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName89-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName90-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNDAO+Arial</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName91-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName92-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName93-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName94() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName94-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName95-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName96-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName97() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName97-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName98-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNCBB+TimesNewRoman</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName99-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName100() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName100-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName101-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName102() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName102-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName103-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName104-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName105-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName106-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName107() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName107-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName108() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName108-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName109() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName109-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName110() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName110-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName111() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName111-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName112() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName112-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName113() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName113-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName114() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName114-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName115() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName115-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName116() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName116-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName117() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName117-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName118() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName118-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName119() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName119-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName120() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName120-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName121() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName121-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName122() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName122-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName123() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName123-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName124() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName124-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName125() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName125-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEKNL+Arial</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName126() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName126-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName127() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName127-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName128() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName128-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName129() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName129-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName130() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName130-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName131() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName131-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName132() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName132-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName133() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName133-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDFM+ArialMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName134() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName134-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName135() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName135-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName136() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName136-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName137() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName137-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName138() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName138-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName139() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName139-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName140() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName140-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName141() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName141-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName142() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName142-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName143() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName143-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName144() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName144-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEKNL+Arial-BoldItalicMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName145() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName145-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName146() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName146-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName147() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName147-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName148() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName148-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName149() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName149-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName150() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName150-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif-Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName151() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName151-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName152() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName152-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName153() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName153-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName154() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName154-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName155() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName155-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName156() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName156-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName157() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName157-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName158() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName158-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNDAO+Arial</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName159() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName159-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName160() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName160-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName161() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName161-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName162() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName162-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName163() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName163-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName164() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName164-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName165() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName165-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName166() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName166-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName167() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName167-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif-Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName168() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName168-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName169() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName169-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDHC+Arial</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName170() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName170-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDHC+Arial-ItalicMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName171() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName171-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName172() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName172-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName173() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName173-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName174() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName174-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName175() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName175-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName176() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName176-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName177() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName177-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName178() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName178-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName179() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName179-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName180() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName180-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName181() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName181-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName182() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName182-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName183() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName183-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName184() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName184-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName185() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName185-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName186() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName186-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName187() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName187-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName188() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName188-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName189() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName189-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName190() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName190-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName191() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName191-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName192() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName192-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName193() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName193-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans-Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName194() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName194-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName195() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName195-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName196() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName196-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName197() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName197-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName198() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName198-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName199() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName199-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName200() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName200-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans-Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName201() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName201-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName202() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName202-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName203() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName203-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName204() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName204-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName205() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName205-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName206() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName206-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName207() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName207-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName208() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName208-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName209() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName209-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName210() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName210-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName211() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName211-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName212() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName212-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName213() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName213-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEFFP+TimesNewRomanPSMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName214() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName214-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName215() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName215-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName216() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName216-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName217() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName217-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName218() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName218-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName219() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName219-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName220() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName220-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName221() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName221-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSerif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName222() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName222-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName223() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName223-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName224() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName224-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName225() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName225-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName226() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName226-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName227() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName227-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName228() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName228-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName229() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName229-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Serif</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName230() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName230-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName231() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName231-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName232() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName232-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName233() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName233-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Regular</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName234() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName234-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName235() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName235-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName236() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName236-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNCBB+TimesNewRoman</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName237() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName237-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName238() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName238-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName239() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName239-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName240() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName240-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName241() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName241-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName242() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName242-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Italic</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName243() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName243-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName244() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName244-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEDEG+Arial</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName245() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName245-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName246() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName246-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName247() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName247-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>HGNDPL+Arial,Bold</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName248() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName248-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName249() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName249-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName250() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName250-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName251() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName251-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>Liberation Sans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName252() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName252-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName253() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName253-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName254() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName254-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName255() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName255-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName256() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName256-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>BJEFFP+TimesNewRomanPSMT</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName257() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName257-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName258() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName258-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName259() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName259-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<null/>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }

    @Test
    public void testGetName260() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.NamingTable.getName260-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.NamingTable receivingObject = (org.apache.fontbox.ttf.NamingTable) xStream.fromXML(receivingXML);
        String returnedXML =
        "<string>LiberationSans</string>";
        String expectedObject = (String) xStream.fromXML(returnedXML);
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
    }
}