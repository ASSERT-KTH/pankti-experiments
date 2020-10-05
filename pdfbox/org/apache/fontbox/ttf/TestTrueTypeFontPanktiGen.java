package org.apache.fontbox.ttf;

import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

public class TestTrueTypeFontPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetAdvanceWidth1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth9-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth18-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth22-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth23-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth24-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth25-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth26-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth27-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth28-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth29-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth31-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth32-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth35-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth36-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth37-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth38-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth39-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth40-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth41-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth42-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth43-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth44-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth45-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth46-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth47-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth48-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth49-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth50-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth51() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth51-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth52() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth52-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth53-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth54() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth54-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth55() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth55-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth56-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth57-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth58() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth58-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth59-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth60-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth61-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth62-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth63() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth63-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth64-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth65-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth66-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth67-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth68-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth69-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth70-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth71-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth72-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth73-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth74-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth75-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth76-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth77-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth78-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth79-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth80() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth80-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth81-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth82-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth83-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth84-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth85-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth86-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth87-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth88() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth88-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth89-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth90-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth91-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth92-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth93-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth94() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth94-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth95-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth96-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth97() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth97-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth98-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth99-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth100() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth100-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth101-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth102() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth102-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth103-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth104-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth105-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth106-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth107() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth107-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth108() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth108-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth109() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth109-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth110() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth110-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth111() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth111-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth112() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth112-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth113() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth113-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth114() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth114-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth115() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth115-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth116() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth116-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth117() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth117-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth118() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth118-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth119() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth119-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth120() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth120-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth121() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth121-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth122() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth122-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth123() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth123-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth124() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth124-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth125() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth125-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth126() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth126-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth127() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth127-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth128() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth128-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth129() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth129-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth130() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth130-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth131() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth131-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth132() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth132-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth133() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth133-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth134() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth134-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth135() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth135-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth136() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth136-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth137() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth137-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth138() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth138-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth139() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth139-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth140() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth140-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth141() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth141-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth142() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth142-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth143() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth143-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth144() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth144-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth145() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth145-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth146() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth146-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth147() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth147-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth148() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth148-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth149() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth149-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth150() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth150-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth151() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth151-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth152() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth152-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth153() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth153-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth154() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth154-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth155() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth155-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth156() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth156-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth157() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth157-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth158() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth158-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth159() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth159-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth160() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth160-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth161() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth161-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth162() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth162-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth163() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth163-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth164() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth164-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth165() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth165-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth166() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth166-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth167() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth167-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth168() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth168-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth169() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth169-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth170() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth170-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth171() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth171-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth172() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth172-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth173() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth173-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }

    @Test
    public void testGetAdvanceWidth174() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth174-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        org.apache.fontbox.ttf.TrueTypeFont receivingObject = (org.apache.fontbox.ttf.TrueTypeFont) xStream.fromXML(receivingXML);
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
    }
}