package org.apache.fontbox.afm;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestAFMParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setUpXStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testIsEOL1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL1-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL2-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>55</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL3-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>44</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL4-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>100</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL5-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL6-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>98</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL7-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL8-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>121</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL9-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL10-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>57</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL11-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL12-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>41</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL13-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>44</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL14-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>55</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL15-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL16-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL17-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>40</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL18-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>41</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL19-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL20-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>100</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL21-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>121</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL22-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>56</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL23-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL24-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>56</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL25-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL26-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL27-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL28-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL29-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>55</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL30-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL31-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>104</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL32-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>112</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL33-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>48</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL34-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>56</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL35-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>100</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL36-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>112</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL37-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>65</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL38-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>65</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL39-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>98</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL40-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>112</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL41-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL42-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>51</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL43-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL44-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL45-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL46-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>51</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL47-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>65</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL48-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>57</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL49-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL50-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL51-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>57</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL52-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>121</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL53-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL54-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>48</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL55-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL56-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL57-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL58-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL59-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>56</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL60-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL61-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>48</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL62-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL63-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>40</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL64-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>40</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL65-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>48</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL66-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL67-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>40</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL68-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>41</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL69-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL70-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>100</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL71-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>121</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL72-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>104</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL73-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>98</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL74-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>51</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL75-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL76-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL77-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL78-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>65</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL79-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>98</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL80-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>41</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL81-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>44</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL82-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL83-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL84-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL85-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL86-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>112</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL87-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL88-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>57</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL89-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>104</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL90-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>44</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL91-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>51</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL92-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>55</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL93-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL94-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL95-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>104</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEOL96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isEOL96-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isEOL = Clazz.getDeclaredMethod("isEOL", int.class);
            isEOL.setAccessible(true);
            Assert.assertEquals(returnedObject, isEOL.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace1-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace2-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>77</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace3-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>67</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace4-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace5-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace6-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>70</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace7-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace8-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace9-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace10-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>67</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace11-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace12-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace13-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace14-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>67</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace15-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace16-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace17-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>52</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace18-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace19-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>70</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace20-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace21-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>46</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace22-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>77</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace23-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>46</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace24-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace25-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace26-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace27-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace28-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace29-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace30-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace31-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace32-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace33-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace34-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace35-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>110</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace36-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace37-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace38-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>67</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace39-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>77</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace40-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace41-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace42-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>110</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace43-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace44-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>70</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace45-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>110</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace46-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>52</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace47-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace48-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace49-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>46</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace50-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>97</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace51-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>97</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace52-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace53-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace54-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace55-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace56-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace57-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace58-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>52</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace59-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>46</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace60-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>110</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace61-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace62-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>97</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace63-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace64-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace65-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace66-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>83</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace67-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace68-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>49</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace69-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace70-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace71-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>52</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace72-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>97</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace73-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace74-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>77</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace75-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>70</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.afm.AFMParser.isWhitespace76-receiving.txt").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            AFMParser receivingObject = (AFMParser) xStream.fromXML(receivingXML);
            String returnedXML = "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.fontbox.afm.AFMParser");
            Method isWhitespace = Clazz.getDeclaredMethod("isWhitespace", int.class);
            isWhitespace.setAccessible(true);
            Assert.assertEquals(returnedObject, isWhitespace.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}