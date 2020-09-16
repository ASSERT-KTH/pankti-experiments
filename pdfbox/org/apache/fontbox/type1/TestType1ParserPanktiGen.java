package org.apache.fontbox.type1;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestType1ParserPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testDecrypt1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B+ReeAd/xA/g19wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>wnqSCegSxbetBBCBvtiusybudaA=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>gJ8B+ReeAey3A/jAtwML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>jkhhHcuBOMRLoFci2GJR4f6e/Q==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fp8B97WtAfjbpAH5DKkBi9cD976kA/gY1wP5QaUDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>9AI/tO0JMoF2W/toWd5ZOFR9OS7UpKcIGUqhFf1MJhFqH3s=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7IB4vEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>gdjUohIPgdYHCqI=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>hZ8B77IDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>L1kFUu4A3pkXMb0=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fr8Bi+cD9zTaA/ggwAP4WfdsAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>NUWxR/nWPsOSgMTiBBxuCbre0FWQZde+</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>gJ8B7LcD+MC3Aws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>qGnsSqaFijjgxyQ5eqZO</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fr8B+RirAYvnA/c02gP4IMAD+Fn3bAML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>GybxEl2k25ymK9qIiyBwPPSRw0iab/25+0Q5Dg==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fa8B+PzHAfeo2gML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>SUgw+swNq0I5DcsLJxB2zA==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>+QWwAeDxA/g59wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>6eRkE8qfiJqael4LSGat5zo=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fbIB9yOsAfkZqgGL3wP3YdID+SGzAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>y+P38Ix84zErSvJwiQsKR0zAULvO6MwjZjWI</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B+ReeAevxA/hh9wcDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>5f56Lufd/FBo+MZ1rWahpBiPkfc=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>+RafAajhA/fw8AML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>Fv1bVcnA6q+9ihcvm6tvDg==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B+ReeAeLxAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>UwZCjKFva+1/0L+wGKEF</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7AB4vEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>QL274FPR+7wprhA=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i4wMEAs=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>s03axcA+GlaY</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fa8B+PzHAffR0wML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>XPUzBRpqhlm/SQM+bRDR1w==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i58B9zvLAfkknwH3rdgDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>dvakIp0Z6J0+W7KvGgW2SGXx6Jk=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>97WtAfkknwGL1wP3vqQD+BjXA/lBpQML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>4eM+T4NzbZVpFgaPZy0WLlfg3J2RIPXOpFj4Kw==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7AB+QWwAevxA/hM8QML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>EtASzcgSMipONCLGFrvTtWCpyQ==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>ifMB9/D3AwHvsgML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>iiuh140E2LHHov0eByIHlw==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>ftIB+RirAYvnA/c02gP4IMAD+Fn3bAML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>CI2GYAOq1W5F3VQMkWwiGmPo7FJk/J8uxcHi/w==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7AB+QWwAePxA/jE9wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>DCcg6bBaH+hkZHGsQGCnw/wP2ys=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B4vEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>lNXC9rpki32Q0bI=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>97SzAfkFsAHf8QP4NfcBAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>1agK5L3dxif0PKvXdoNbSTBYvAo8</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>fbIB9yOsAfhInwH5GaoBi98D92HSA/khswML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>0QpOp9eacBcZfOJoMFMMnNeh7z+Fl6z8zn/AKnp+NA==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>hZ8B77IDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>t1fI0f1t4hdxxaM=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>facB+RynAYvXA/fN1wML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>nVjlXb+i98k6UVlhHpthFZvmhg==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>99u0AfkEsQHi8QML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>TTa+/r57Eb5syhDP5bNmWg==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B4/ED+MT3AQML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>H0DGYYY5Zu/yqjkpUb8WFg==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i40MEAs=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>oLLCzhO5kTPh</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i58B9zvLAfkknwH3rNkDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>Y7/9MrktWPevOMbbUwG/n/S6f6o=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B+ReeAeDxA/g59wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>/FnMnSa+cpDVBsBcrm0HIWqrCNA=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>+ReeAePxA/jE9wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>OWOjbSoKUsrPl8kJw3x/nAk=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt35-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i6kB9+erAfjbpAH5JJ8Bi9cD976kA/gY1wP5QaUDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>x8AJXEhqXm2u7OWM5etsca6SVbMJlFnMQeXDNdR/yDuHpzY=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B+QWwAeDxA/g59wEDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>z4Uh45jD6sdO49vELmKND5iXTrs=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>facB+RynAZHVA/e/0AML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>kOsiiEWEGmoWaGX957u0B6kMjQ==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>josMEAwRDBEMIQs=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>hr2EfusAqVWgQP57S+Zj</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>9yS2AYvfA/dh0gP5IbMDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>3rqHTC0fJx6Q1tlMUiRvHEPCvuA=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7AB+QWwAevxA/hh9wcDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>+Kc9ew9wRs8rIZ5A/rl0IJFLmuc=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7AB99u0AfkEsQHi8QML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>JsRaQWnpS6SAA6944JoWZ3AOPA==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>Cw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>rSEnJ4g=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>ifMB77IDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>Ip7oy1mtX0Hr2zM=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>ifMB9/D3AwGM9wMDCw==</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>pFx90kJr4XcoY0SEeKMWTtw=</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B7LcD+MC3Aws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>u7kbhlSwWw3Z7cGWKUqp</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i7IB+ReeAeLxAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ZwmierqWi/gaI85uM69O</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>+QypAYvXA/e+pAP4GNcD+UGlAws=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>7nFO6UoYaKLyQ1VQ5HWNookLwo/R8127</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>jI4MEAwRCgs=</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>2iW6gltpI7LThCYZ</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<byte-array>i54B99u0AfkXngHi8QML</byte-array>";
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>etzC8jKUz9NCJsM/jCqkQtDkIw==</byte-array>" +
            "  <int>4330</int>" +
            "  <int>4</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDecrypt50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            Type1Parser receivingObject = (Type1Parser) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt50-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            byte[] returnedObject = (byte[]) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.fontbox.type1.Type1Parser.decrypt50-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.type1.Type1Parser");
            Method decrypt = Clazz.getDeclaredMethod("decrypt", byte[].class, int.class, int.class);
            decrypt.setAccessible(true);
            Assert.assertTrue(Arrays.equals(returnedObject, (byte[]) decrypt.invoke(receivingObject, paramObject1, paramObject2, paramObject3)));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}