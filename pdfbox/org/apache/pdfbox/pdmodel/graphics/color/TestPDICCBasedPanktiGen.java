package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestPDICCBasedPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetDefaultDecode1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode3-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode4-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode5-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode6-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode7-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }

    @Test
    public void testGetDefaultDecode8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getDefaultDecode8-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingXML = scannerReceiving.useDelimiter("\\A").next();
        PDICCBased receivingObject = (PDICCBased) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<float-array>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "  <float>0.0</float>" +
        "  <float>1.0</float>" +
        "</float-array>";
        float[] expectedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <int>8</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertTrue(Arrays.equals(expectedObject, receivingObject.getDefaultDecode(paramObject1)));
    }
}