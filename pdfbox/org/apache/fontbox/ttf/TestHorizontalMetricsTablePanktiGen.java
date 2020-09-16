package org.apache.fontbox.ttf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestHorizontalMetricsTablePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetLeftSideBearing1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>75</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>70</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>71</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>36</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>148</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>39</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>-3</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>147</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>79</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>75</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>19</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>124</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>11</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>147</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>170</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>15</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>55</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>134</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>115</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>16</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>149</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>131</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>19</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>136</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>135</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>84</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>66</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>74</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>63</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>60</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>21</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>126</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>16</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>133</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>65</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>137</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>24</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>73</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>145</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>26</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>23</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>139</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>12</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>33</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>92</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>151</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>41</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>28</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>152</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>48</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            HorizontalMetricsTable receivingObject = (HorizontalMetricsTable) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>31</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}