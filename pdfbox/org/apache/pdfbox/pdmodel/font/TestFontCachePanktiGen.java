package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestFontCachePanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new CleanerImplConverter());
        xStream.registerConverter(new InflaterConverter());
    }

    @Test
    public void testGetFont1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont1-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont2-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont3-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont4-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont5-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont6-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont7-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont7-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont8-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont8-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont9-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont9-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont10-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont11-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont12-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont13-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont14-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont15-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont16-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont17-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont18-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont18-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont19-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont20-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont21-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont22-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont23-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont24-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont24-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont25-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont26-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont27-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont28-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont28-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont29-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont29-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont30-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont31-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont31-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont32-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont33-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont34-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<org.apache.pdfbox.pdmodel.font.FontCache>" +
            "  <cache class=\"concurrent-hash-map\"/>" +
            "</org.apache.pdfbox.pdmodel.font.FontCache>";
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont35-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont36() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont36-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont36-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont37() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont37-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont37-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont38() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont38-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont38-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont39() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont39-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont39-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont40() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont40-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont40-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont40-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont41() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont41-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont41-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont42() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont42-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont42-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont43() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont43-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont43-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont43-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont44() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont44-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont44-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont45() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont45-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont45-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont45-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont46() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont46-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont46-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont47() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont47-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont47-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont48() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont48-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont48-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont49() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont49-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont49-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont50() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont50-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont50-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont51() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont51-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont51-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont51-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont52() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont52-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont52-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont52-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont53() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont53-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont53-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont54() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont54-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont54-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont54-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont55() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont55-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont55-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont55-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont56-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont56-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont57() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont57-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont57-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont58() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont58-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont58-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont58-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont59() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont59-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont59-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont60() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont60-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont60-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont61() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont61-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont61-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont62() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont62-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont62-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont63() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont63-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont63-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont63-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont64() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<org.apache.pdfbox.pdmodel.font.FontCache>" +
            "  <cache class=\"concurrent-hash-map\"/>" +
            "</org.apache.pdfbox.pdmodel.font.FontCache>";
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont64-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont65() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont65-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont65-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont66() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont66-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont66-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont67() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont67-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont67-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont68() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String receivingXML = 
            "<org.apache.pdfbox.pdmodel.font.FontCache>" +
            "  <cache class=\"concurrent-hash-map\"/>" +
            "</org.apache.pdfbox.pdmodel.font.FontCache>";
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont68-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont69() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont69-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont69-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont70() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont70-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont70-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont71() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont71-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont71-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont72() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont72-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont72-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont73() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont73-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont73-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont74() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont74-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont74-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont75() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont75-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont75-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont76() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont76-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont76-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont77() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont77-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont77-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont78() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont78-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont78-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont79() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont79-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont79-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont80() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont80-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont80-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont80-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont81() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont81-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont81-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont82() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont82-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont82-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont83() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont83-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont83-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont84() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont84-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont84-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont85() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont85-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont85-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont86() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont86-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont86-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont87() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont87-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont87-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont88() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont88-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont88-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont88-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont89() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont89-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont89-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont90() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont90-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont90-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont91() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont91-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont91-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont92() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont92-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont92-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont93() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont93-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont93-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont94() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont94-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont94-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont94-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont95() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont95-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont95-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont96() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont96-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont96-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont97() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont97-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont97-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont97-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont98() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont98-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont98-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont99() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont99-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont99-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont100() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont100-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont100-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont100-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont101() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont101-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont101-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont102() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont102-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            File filereturned = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont102-returned.xml").getFile());
            Scanner scannerreturned = new Scanner(filereturned);
            String returnedXML = scannerreturned.useDelimiter("\\A").next();
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont102-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont103() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont103-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont103-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont104() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont104-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont104-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont105() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont105-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont105-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFont106() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont106-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.font.FontCache receivingObject = (org.apache.pdfbox.pdmodel.font.FontCache) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
            File fileparams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont106-params.xml").getFile());
            Scanner scannerparams = new Scanner(fileparams);
            String paramsXML = scannerparams.useDelimiter("\\A").next();
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            org.apache.pdfbox.pdmodel.font.FontInfo paramObject1 = (org.apache.pdfbox.pdmodel.font.FontInfo) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}