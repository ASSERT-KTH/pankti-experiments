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
public class TestHorizontalMetricsTablePanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetAdvanceWidth1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>512</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(512, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>38</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>512</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(512, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth51-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth52-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth53-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth55-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth56-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1593</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1593, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth57-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth58-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth59-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth60-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth61-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>60</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth62-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth63-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth64-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth65-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth66-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth67-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth68-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1536</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>0</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1536, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth69-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth70-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth71-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth72-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth73-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth74-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth75-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1706</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1706, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth76-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth77-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth78-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth79-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth80-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth81-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth82-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth83-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1593</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>90</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1593, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth84-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth85-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth86-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth87-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth88-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth89-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth90-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth91-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1706</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1706, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth92-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth93-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth94-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth95-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth96-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth97-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1706</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1706, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth98-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth99() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth99-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth100() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth100-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth101() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth101-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth102() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth102-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>22</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth103() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth103-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth104() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth104-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth105() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth105-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth106() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth106-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth107() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth107-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth108() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth108-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth109() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth109-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth110() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth110-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth111() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth111-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth112() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth112-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth113() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth113-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth114() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth114-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth115() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth115-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth116() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth116-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth117() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth117-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1593</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>52</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1593, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth118() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth118-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth119() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth119-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth120() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth120-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth121() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth121-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth122() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth122-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth123() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth123-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>23</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth124() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth124-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth125() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth125-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth126() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth126-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>17</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth127() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth127-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth128() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth128-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>909</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(909, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth129() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth129-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth130() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth130-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth131() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth131-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth132() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth132-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>797</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(797, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth133() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth133-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth134() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth134-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth135() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth135-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>17</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth136() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth136-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth137() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth137-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth138() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth138-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth139() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth139-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1024</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1024, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth140() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth140-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth141() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth141-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth142() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth142-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth143() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth143-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth144() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth144-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1593</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1593, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth145() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth145-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth146() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth146-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth147() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth147-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth148() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth148-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>527</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth149() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth149-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth150() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth150-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth151() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth151-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth152() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth152-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth153() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth153-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth154() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth154-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth155() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth155-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>909</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(909, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth156() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth156-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth157() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth157-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth158() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth158-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1479</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1479, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth159() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth159-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth160() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth160-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth161() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth161-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>909</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(909, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth162() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth162-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth163() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth163-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth164() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth164-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth165() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth165-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth166() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth166-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1366</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1366, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth167() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth167-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth168() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth168-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth169() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth169-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1139, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth170() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth170-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth171() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth171-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>569</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(569, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth172() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth172-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth173() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth173-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1251</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1251, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetAdvanceWidth174() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getAdvanceWidth174-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>682</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(682, receivingObject.getAdvanceWidth(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>15</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(15, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-3, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>15</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>59</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(15, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>87</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(87, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>36</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(36, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>147</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(147, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(139, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(74, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>75</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(75, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>43</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>108</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>182</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(108, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>24</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(24, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>7</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(7, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>19</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>60</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(19, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>158</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(158, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>13</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>90</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(13, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>75</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(75, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>144</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(144, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>43</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>27</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(27, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>1</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(1, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>223</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(223, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>45</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>60</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(45, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>61</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(61, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>69</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(69, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>31</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(31, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>196</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(67, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>51</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(51, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>132</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(132, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>149</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(149, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-94</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-94, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>152</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(152, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>25</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(25, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>124</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>12</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(124, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>18</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>59</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(18, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(131, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing51-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>122</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(122, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing52-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>168</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(168, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing53-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>152</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(152, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(3, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing55-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>11</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing56-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>162</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(162, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing57-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>158</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(158, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing58-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>201</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(201, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing59-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(34, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing60-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>127</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(127, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing61-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>4</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(4, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing62-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>17</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(139, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing63-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>149</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(149, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing64-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>185</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(185, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing65-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>35</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>43</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(35, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing66-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>16</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing67-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing68-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>14</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(14, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing69-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(92, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing70-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>123</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(123, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing71-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(65, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing72-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>106</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(106, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing73-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>13</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(13, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing74-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(48, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing75-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>22</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-3, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing76-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>42</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(72, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing77-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>63</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>24</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(63, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing78-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-32</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-32, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing79-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>57</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(57, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing80-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>142</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(142, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing81-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing82-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>189</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(189, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing83-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>133</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(133, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing84-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>41</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>61</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(41, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing85-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing86-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>41</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(41, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing87-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-94</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-94, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing88-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing89-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>170</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>15</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(170, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing90-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing91-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(73, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing92-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>70</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(70, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing93-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing94-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>193</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(193, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing95-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing96-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>88</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(88, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing97-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(85, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing98-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>86</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(86, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing99() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing99-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>141</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(141, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing100() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing100-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>66</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(66, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing101() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing101-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing102() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing102-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>55</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(55, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing103() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing103-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>63</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(63, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing104() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing104-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing105() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing105-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>77</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(77, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing106() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing106-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>86</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>22</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(86, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing107() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing107-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing108() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing108-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>59</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(59, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing109() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing109-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>133</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(133, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing110() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing110-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>66</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(66, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing111() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing111-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>25</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(25, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing112() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing112-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing113() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing113-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>0</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(0, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing114() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing114-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>109</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>42</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(109, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing115() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing115-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>89</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(89, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing116() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing116-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>20</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(20, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing117() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing117-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>25</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(25, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing118() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing118-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>158</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(158, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing119() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing119-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing120() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing120-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>223</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(223, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing121() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing121-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing122() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing122-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>31</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(31, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing123() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing123-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>106</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>34</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(106, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing124() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing124-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing125() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing125-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing126() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing126-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(73, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing127() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing127-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>133</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(133, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing128() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing128-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>28</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(28, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing129() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing129-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(97, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing130() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing130-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>193</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>182</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(193, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing131() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing131-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing132() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing132-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>33</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(33, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing133() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing133-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>42</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(42, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing134() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing134-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>99</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(99, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing135() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing135-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-41</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-41, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing136() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing136-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>79</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(79, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing137() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing137-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(82, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing138() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing138-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(74, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing139() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing139-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>240</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(240, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing140() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing140-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing141() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing141-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing142() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing142-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>8</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(8, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing143() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing143-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>107</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>11</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(107, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing144() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing144-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(73, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing145() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing145-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(26, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing146() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing146-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>6</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>90</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(6, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing147() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing147-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing148() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing148-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing149() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing149-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>0</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(0, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing150() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing150-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>17</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(17, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing151() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing151-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>12</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(12, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing152() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing152-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>145</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(145, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing153() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing153-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>164</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>43</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(164, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing154() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing154-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>62</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(62, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing155() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing155-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>88</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>52</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(88, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing156() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing156-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>138</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(138, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing157() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing157-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing158() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing158-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing159() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing159-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>62</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>522</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(62, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing160() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing160-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing161() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing161-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing162() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing162-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>109</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(109, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing163() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing163-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing164() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing164-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>71</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>180</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(71, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing165() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing165-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing166() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing166-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing167() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing167-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>161</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(161, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing168() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing168-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(131, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing169() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing169-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-3</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>90</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-3, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing170() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing170-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>23</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(23, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing171() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing171-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>129</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>20</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(129, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing172() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing172-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing173() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing173-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>11</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(11, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing174() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing174-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>63</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(63, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing175() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing175-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(48, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing176() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing176-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>168</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(168, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing177() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing177-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-157</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>77</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-157, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing178() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing178-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>145</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(145, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing179() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing179-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>71</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(71, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing180() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing180-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>156</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(156, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing181() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing181-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>46</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing182() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing182-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>142</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>30</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(142, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing183() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing183-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>27</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(65, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing184() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing184-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>35</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(97, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing185() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing185-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>93</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(93, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing186() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing186-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>60</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(60, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing187() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing187-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>34</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(92, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing188() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing188-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>47</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>22</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(47, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing189() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing189-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing190() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing190-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>124</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>11</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(124, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing191() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing191-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing192() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing192-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>76</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(76, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing193() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing193-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>35</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(35, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing194() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing194-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(82, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing195() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing195-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>40</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>93</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(40, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing196() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing196-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-23</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-23, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing197() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing197-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>23</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(23, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing198() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing198-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>128</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(128, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing199() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing199-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>12</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(67, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing200() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing200-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>100</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(100, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing201() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing201-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>78</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(78, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing202() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing202-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>87</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(87, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing203() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing203-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>19</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(19, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing204() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing204-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>110</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>15</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(110, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing205() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing205-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>76</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>26</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(76, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing206() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing206-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-6</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>90</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-6, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing207() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing207-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(72, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing208() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing208-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing209() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing209-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>126</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(126, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing210() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing210-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing211() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing211-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing212() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing212-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(135, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing213() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing213-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>195</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>30</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(195, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing214() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing214-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>186</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>17</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(186, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing215() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing215-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>145</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>17</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(145, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing216() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing216-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>16</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(16, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing217() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing217-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(92, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing218() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing218-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>75</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(75, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing219() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing219-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>161</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(161, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing220() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing220-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>59</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(59, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing221() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing221-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>31</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(31, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing222() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing222-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>51</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(51, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing223() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing223-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>197</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(197, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing224() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing224-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing225() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing225-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>18</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>57</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(18, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing226() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing226-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(85, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing227() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing227-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>12</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(12, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing228() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing228-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>168</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(168, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing229() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing229-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>44</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(44, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing230() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing230-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>62</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(62, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing231() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing231-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>35</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(35, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing232() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing232-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>61</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(61, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing233() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing233-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>31</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>23</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(31, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing234() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing234-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(131, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing235() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing235-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>33</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(33, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing236() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing236-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>38</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing237() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing237-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>29</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(29, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing238() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing238-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>158</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(158, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing239() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing239-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>15</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(15, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing240() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing240-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(72, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing241() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing241-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing242() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing242-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>46</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(34, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing243() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing243-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>16</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(83, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing244() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing244-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>228</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(228, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing245() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing245-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>16</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(16, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing246() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing246-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(83, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing247() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing247-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>24</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(85, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing248() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing248-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(72, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing249() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing249-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>102</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>11</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(102, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing250() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing250-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>86</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(86, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing251() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing251-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>161</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(161, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing252() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing252-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>42</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing253() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing253-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(2, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing254() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing254-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>12</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(2, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing255() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing255-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>151</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(151, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing256() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing256-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>123</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(123, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing257() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing257-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>70</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(70, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing258() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing258-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>90</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>9</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(90, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing259() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing259-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(74, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing260() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing260-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>93</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing261() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing261-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>49</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>15</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(49, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing262() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing262-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(34, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing263() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing263-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>158</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(158, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing264() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing264-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>152</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(152, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing265() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing265-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>191</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>44</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(191, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing266() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing266-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>111</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>35</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(111, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing267() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing267-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>187</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(187, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing268() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing268-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>27</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>58</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(27, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing269() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing269-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>168</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(168, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing270() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing270-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing271() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing271-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>87</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(87, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing272() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing272-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>34</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(34, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing273() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing273-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(92, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing274() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing274-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>114</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(114, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing275() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing275-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-5</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-5, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing276() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing276-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>15</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(139, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing277() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing277-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>16</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(65, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing278() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing278-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>105</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(105, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing279() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing279-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing280() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing280-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing281() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing281-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing282() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing282-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing283() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing283-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>13</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(13, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing284() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing284-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>162</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(162, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing285() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing285-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>12</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(12, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing286() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing286-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>88</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>26</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(88, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing287() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing287-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>128</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(128, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing288() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing288-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(2, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing289() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing289-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>41</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>93</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(41, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing290() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing290-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(80, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing291() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing291-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing292() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing292-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>28</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(85, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing293() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing293-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>146</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(146, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing294() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing294-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>60</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(60, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing295() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing295-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>179</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(83, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing296() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing296-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>98</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>24</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(98, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing297() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing297-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>9</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>57</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(9, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing298() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing298-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>60</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(60, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing299() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing299-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>99</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(99, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing300() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing300-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>11</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(11, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing301() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing301-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-27</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-27, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing302() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing302-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>61</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(61, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing303() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing303-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(65, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing304() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing304-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing305() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing305-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(48, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing306() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing306-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>97</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>26</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(97, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing307() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing307-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(48, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing308() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing308-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>81</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(81, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing309() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing309-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(82, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing310() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing310-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>71</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>28</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(71, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing311() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing311-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>51</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(51, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing312() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing312-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>139</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>527</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(139, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing313() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing313-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>147</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(147, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing314() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing314-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(72, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing315() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing315-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>60</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(60, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing316() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing316-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>20</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>18</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(20, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing317() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing317-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>134</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(134, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing318() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing318-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>45</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(45, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing319() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing319-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>90</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(90, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing320() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing320-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing321() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing321-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-7</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(-7, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing322() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing322-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>42</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(42, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing323() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing323-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>170</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>30</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(170, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing324() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing324-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>134</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(134, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing325() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing325-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing326() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing326-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>23</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(26, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing327() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing327-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>38</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(84, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing328() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing328-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(136, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing329() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing329-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(73, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing330() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing330-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>17</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(17, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing331() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing331-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>22</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(83, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing332() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing332-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>61</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(26, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing333() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing333-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>197</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>29</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(197, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing334() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing334-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>19</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(19, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing335() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing335-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing336() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing336-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(92, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing337() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing337-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>23</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(26, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing338() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing338-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing339() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing339-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>102</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>38</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(102, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing340() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing340-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>25</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(25, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing341() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing341-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing342() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing342-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(74, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing343() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing343-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>79</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(79, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing344() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing344-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>67</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>180</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(67, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing345() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing345-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>84</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(68, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing346() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing346-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>38</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(74, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing347() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing347-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>90</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(90, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing348() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing348-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>150</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>47</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(150, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing349() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing349-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>17</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(17, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing350() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing350-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>77</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(77, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing351() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing351-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>9</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>59</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(9, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing352() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing352-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>63</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(63, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing353() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing353-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>25</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(83, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing354() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing354-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>143</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(143, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing355() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing355-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(131, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing356() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing356-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>46</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>12</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(46, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing357() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing357-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(137, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing358() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing358-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>36</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(36, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing359() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing359-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>70</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(70, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetLeftSideBearing360() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing360-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>35</int>";
            int expectedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(35, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}