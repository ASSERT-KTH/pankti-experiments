package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.CleanerImplConverter;
import org.apache.pdfbox.pdfparser.FileCleanableConverter;
import org.apache.pdfbox.pdfparser.InflaterConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestPDDocumentCatalogPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testGetViewerPreferences1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences>" +
            "  <prefs>" +
            "    <direct>true</direct>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "      <mapArr>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>PrintPageRange</name>" +
            "          <hashCode>1248990177</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSObject>" +
            "          <direct>true</direct>" +
            "          <baseObject class=\"org.apache.pdfbox.cos.COSArray\">" +
            "            <direct>false</direct>" +
            "            <objects>" +
            "              <org.apache.pdfbox.cos.COSInteger>" +
            "                <direct>true</direct>" +
            "                <value>0</value>" +
            "              </org.apache.pdfbox.cos.COSInteger>" +
            "              <org.apache.pdfbox.cos.COSInteger>" +
            "                <direct>true</direct>" +
            "                <value>1</value>" +
            "              </org.apache.pdfbox.cos.COSInteger>" +
            "            </objects>" +
            "            <needToBeUpdated>false</needToBeUpdated>" +
            "          </baseObject>" +
            "          <objectNumber>2</objectNumber>" +
            "          <generationNumber>0</generationNumber>" +
            "          <needToBeUpdated>false</needToBeUpdated>" +
            "        </org.apache.pdfbox.cos.COSObject>" +
            "      </mapArr>" +
            "    </items>" +
            "  </prefs>" +
            "</org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences>" +
            "  <prefs>" +
            "    <direct>true</direct>" +
            "    <needToBeUpdated>false</needToBeUpdated>" +
            "    <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "      <mapArr>" +
            "        <org.apache.pdfbox.cos.COSName>" +
            "          <direct>false</direct>" +
            "          <name>PrintPageRange</name>" +
            "          <hashCode>1248990177</hashCode>" +
            "        </org.apache.pdfbox.cos.COSName>" +
            "        <org.apache.pdfbox.cos.COSObject>" +
            "          <direct>true</direct>" +
            "          <baseObject class=\"org.apache.pdfbox.cos.COSArray\">" +
            "            <direct>false</direct>" +
            "            <objects>" +
            "              <org.apache.pdfbox.cos.COSInteger>" +
            "                <direct>true</direct>" +
            "                <value>0</value>" +
            "              </org.apache.pdfbox.cos.COSInteger>" +
            "              <org.apache.pdfbox.cos.COSInteger>" +
            "                <direct>true</direct>" +
            "                <value>1</value>" +
            "              </org.apache.pdfbox.cos.COSInteger>" +
            "            </objects>" +
            "            <needToBeUpdated>false</needToBeUpdated>" +
            "          </baseObject>" +
            "          <objectNumber>2</objectNumber>" +
            "          <generationNumber>0</generationNumber>" +
            "          <needToBeUpdated>false</needToBeUpdated>" +
            "        </org.apache.pdfbox.cos.COSObject>" +
            "      </mapArr>" +
            "    </items>" +
            "  </prefs>" +
            "</org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetViewerPreferences8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getViewerPreferences8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = (org.apache.pdfbox.pdmodel.PDDocumentCatalog) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<null/>";
            org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences expectedObject = (org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences) xStream.fromXML(returnedXML);
            Assert.assertEquals(expectedObject, receivingObject.getViewerPreferences());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}