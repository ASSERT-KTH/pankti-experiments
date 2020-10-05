package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
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
    public void testGetFont1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont1-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont2-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont3-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont4-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont5-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont6-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont10-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont10-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont11-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont11-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont12-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont12-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont13-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont13-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont14-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont14-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont15-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont15-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont16-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont16-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont17-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont17-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont19-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont19-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont20-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont20-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont21-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont21-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont22-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont22-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont23-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont23-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont25-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont25-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont26-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont26-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont27-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont27-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont30-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont30-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont32-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont32-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont33-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont33-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont34-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont34-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.FontCache>" +
        "  <cache class=\"concurrent-hash-map\"/>" +
        "</org.apache.pdfbox.pdmodel.font.FontCache>";
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont35-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont36-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont36-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont37-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont37-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont38-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont38-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont39-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont39-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont41-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont41-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont42-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont42-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont44-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont44-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont46-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont46-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont47-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont47-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont48-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont48-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont49() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont49-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont49-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont50() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont50-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont50-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont53() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont53-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont53-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont56() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont56-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont56-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont57() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont57-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont57-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont59() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont59-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont59-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont60() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont60-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont60-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont61() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont61-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont61-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont62() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont62-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont62-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont64() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.FontCache>" +
        "  <cache class=\"concurrent-hash-map\"/>" +
        "</org.apache.pdfbox.pdmodel.font.FontCache>";
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont64-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont65() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont65-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont65-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont66() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont66-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont66-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont67() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont67-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont67-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont68() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingXML = 
        "<org.apache.pdfbox.pdmodel.font.FontCache>" +
        "  <cache class=\"concurrent-hash-map\"/>" +
        "</org.apache.pdfbox.pdmodel.font.FontCache>";
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont68-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont69() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont69-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont69-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont70() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont70-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont70-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont71() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont71-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont71-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont72() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont72-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont72-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont73() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont73-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont73-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont74() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont74-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont74-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont75() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont75-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont75-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont76() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont76-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont76-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont77() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont77-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont77-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont78() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont78-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont78-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont79() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont79-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont79-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont81() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont81-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont81-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont82() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont82-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont82-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont83() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont83-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont83-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont84() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont84-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont84-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont85() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont85-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont85-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont86() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont86-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont86-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont87() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont87-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont87-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont89() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont89-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont89-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont90() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont90-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont90-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont91() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont91-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont91-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont92() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont92-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont92-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont93() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont93-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont93-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont95() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont95-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont95-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont96() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont96-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont96-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont98() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont98-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont98-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont99() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont99-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont99-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont101() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont101-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont101-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont103() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont103-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont103-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont104() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont104-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont104-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont105() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont105-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont105-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }

    @Test
    public void testGetFont106() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont106-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        FontCache receivingObject = (FontCache) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<null/>";
        org.apache.fontbox.FontBoxFont expectedObject = (org.apache.fontbox.FontBoxFont) xStream.fromXML(returnedXML);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.font.FontCache.getFont106-params.xml").getFile());
        Scanner scannerParams = new Scanner(fileParams);
        String paramsXML = scannerParams.useDelimiter("\\A").next();
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        FontInfo paramObject1 = (FontInfo) paramObjects[0];
        Assert.assertEquals(expectedObject, receivingObject.getFont(paramObject1));
    }
}