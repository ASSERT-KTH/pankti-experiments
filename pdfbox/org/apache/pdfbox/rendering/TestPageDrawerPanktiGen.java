package org.apache.pdfbox.rendering;
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
public class TestPageDrawerPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setUpXStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testClampColor1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PageDrawer.clampColor1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PageDrawer receivingObject = (PageDrawer) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<float>1.0</float>";
            float returnedObject = (Float) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>1.0</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.rendering.PageDrawer");
            Method clampColor = Clazz.getDeclaredMethod("clampColor", float.class);
            clampColor.setAccessible(true);
            Assert.assertEquals(returnedObject, clampColor.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testClampColor2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PageDrawer.clampColor2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PageDrawer receivingObject = (PageDrawer) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<float>1.0</float>";
            float returnedObject = (Float) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>1.0</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.rendering.PageDrawer");
            Method clampColor = Clazz.getDeclaredMethod("clampColor", float.class);
            clampColor.setAccessible(true);
            Assert.assertEquals(returnedObject, clampColor.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testClampColor3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PageDrawer.clampColor3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PageDrawer receivingObject = (PageDrawer) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<float>1.0</float>";
            float returnedObject = (Float) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>1.0</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.rendering.PageDrawer");
            Method clampColor = Clazz.getDeclaredMethod("clampColor", float.class);
            clampColor.setAccessible(true);
            Assert.assertEquals(returnedObject, clampColor.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testClampColor4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PageDrawer.clampColor4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PageDrawer receivingObject = (PageDrawer) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<float>1.0</float>";
            float returnedObject = (Float) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <float>1.0</float>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            float paramObject1 = (Float) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.rendering.PageDrawer");
            Method clampColor = Clazz.getDeclaredMethod("clampColor", float.class);
            clampColor.setAccessible(true);
            Assert.assertEquals(returnedObject, clampColor.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}