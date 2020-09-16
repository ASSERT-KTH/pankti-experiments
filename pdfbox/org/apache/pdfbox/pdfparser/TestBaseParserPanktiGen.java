package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestBaseParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setUpXStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testIsClosing1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>99</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>113</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>113</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>99</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>99</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>113</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>50</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>10</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>97</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsCR30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isCR30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isCR = Clazz.getDeclaredMethod("isCR", int.class);
            isCR.setAccessible(true);
            Assert.assertEquals(returnedObject, isCR.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>37</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>45</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>68</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsLF30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isLF30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>70</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Class Clazz = Class.forName("org.apache.pdfbox.pdfparser.BaseParser");
            Method isLF = Clazz.getDeclaredMethod("isLF", int.class);
            isLF.setAccessible(true);
            Assert.assertEquals(returnedObject, isLF.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}