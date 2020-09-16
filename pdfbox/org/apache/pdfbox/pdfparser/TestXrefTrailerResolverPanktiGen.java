package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestXrefTrailerResolverPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetTrailer1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Length</name>" +
            "        <hashCode>-2022496506</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>90</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>3</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>1</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Encrypt</name>" +
            "        <hashCode>57395781</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>21</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Type</name>" +
            "        <hashCode>2622298</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>XRef</name>" +
            "        <hashCode>2703643</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>23</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Index</name>" +
            "        <hashCode>70793394</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>0</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>22</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>W</name>" +
            "        <hashCode>87</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>3</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../../../org.apache.pdfbox.cos.COSArray[2]/objects/org.apache.pdfbox.cos.COSInteger\"/>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Filter</name>" +
            "        <hashCode>2104342424</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>FlateDecode</name>" +
            "        <hashCode>1578622202</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTrailer2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Length</name>" +
            "        <hashCode>-2022496506</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>58</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Type</name>" +
            "        <hashCode>2622298</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>XRef</name>" +
            "        <hashCode>2703643</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Filter</name>" +
            "        <hashCode>2104342424</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>FlateDecode</name>" +
            "        <hashCode>1578622202</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>DecodeParms</name>" +
            "        <hashCode>-1448065895</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSDictionary>" +
            "        <direct>true</direct>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "        <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "          <mapArr>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Columns</name>" +
            "              <hashCode>-1680592963</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>5</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Predictor</name>" +
            "              <hashCode>655954012</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>12</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "          </mapArr>" +
            "        </items>" +
            "      </org.apache.pdfbox.cos.COSDictionary>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>W</name>" +
            "        <hashCode>87</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>true</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>3</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger\"/>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>2</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>t+RcaCy1h48d28hol+Kg3w==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>t+RcaCy1h48d28hol+Kg3w==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Index</name>" +
            "        <hashCode>70793394</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../../../org.apache.pdfbox.cos.COSInteger[2]\"/>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>16</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>12</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>4</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Prev</name>" +
            "        <hashCode>2496083</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>148768</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTrailer3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Length</name>" +
            "        <hashCode>-2022496506</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>66</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Type</name>" +
            "        <hashCode>2622298</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>XRef</name>" +
            "        <hashCode>2703643</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Filter</name>" +
            "        <hashCode>2104342424</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>FlateDecode</name>" +
            "        <hashCode>1578622202</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>DecodeParms</name>" +
            "        <hashCode>-1448065895</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSDictionary>" +
            "        <direct>true</direct>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "        <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "          <mapArr>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Columns</name>" +
            "              <hashCode>-1680592963</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>5</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Predictor</name>" +
            "              <hashCode>655954012</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>12</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "          </mapArr>" +
            "        </items>" +
            "      </org.apache.pdfbox.cos.COSDictionary>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>W</name>" +
            "        <hashCode>87</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>3</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger\"/>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSDictionary/items/mapArr/org.apache.pdfbox.cos.COSInteger\"/>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Index</name>" +
            "        <hashCode>70793394</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../../../org.apache.pdfbox.cos.COSDictionary/items/mapArr/org.apache.pdfbox.cos.COSInteger\"/>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>21</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>17</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>7</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Prev</name>" +
            "        <hashCode>2496083</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>263195</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTrailer4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Length</name>" +
            "        <hashCode>-2022496506</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>66</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Type</name>" +
            "        <hashCode>2622298</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>XRef</name>" +
            "        <hashCode>2703643</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Filter</name>" +
            "        <hashCode>2104342424</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>true</direct>" +
            "        <name>FlateDecode</name>" +
            "        <hashCode>1578622202</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>DecodeParms</name>" +
            "        <hashCode>-1448065895</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSDictionary>" +
            "        <direct>true</direct>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "        <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "          <mapArr>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Columns</name>" +
            "              <hashCode>-1680592963</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>5</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "            <org.apache.pdfbox.cos.COSName>" +
            "              <direct>false</direct>" +
            "              <name>Predictor</name>" +
            "              <hashCode>655954012</hashCode>" +
            "            </org.apache.pdfbox.cos.COSName>" +
            "            <org.apache.pdfbox.cos.COSInteger>" +
            "              <direct>true</direct>" +
            "              <value>12</value>" +
            "            </org.apache.pdfbox.cos.COSInteger>" +
            "          </mapArr>" +
            "        </items>" +
            "      </org.apache.pdfbox.cos.COSDictionary>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>W</name>" +
            "        <hashCode>87</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>1</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>3</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSInteger\"/>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger reference=\"../org.apache.pdfbox.cos.COSDictionary/items/mapArr/org.apache.pdfbox.cos.COSInteger\"/>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>eFhU8859DcpntqxiPz/tsg==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Index</name>" +
            "        <hashCode>70793394</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSInteger reference=\"../../../org.apache.pdfbox.cos.COSDictionary/items/mapArr/org.apache.pdfbox.cos.COSInteger\"/>" +
            "          <org.apache.pdfbox.cos.COSInteger>" +
            "            <direct>false</direct>" +
            "            <value>21</value>" +
            "          </org.apache.pdfbox.cos.COSInteger>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>17</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>7</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Prev</name>" +
            "        <hashCode>2496083</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>263195</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTrailer5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>1</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>3</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>hKGPLXQye1Y0NM14I+p1+A==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>hKGPLXQye1Y0NM14I+p1+A==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>18</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTrailer6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.cos.COSDictionary>" +
            "  <direct>false</direct>" +
            "  <needToBeUpdated>false</needToBeUpdated>" +
            "  <items class=\"org.apache.pdfbox.util.SmallMap\">" +
            "    <mapArr>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Root</name>" +
            "        <hashCode>2553090</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>1</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Info</name>" +
            "        <hashCode>2283726</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSObject>" +
            "        <direct>true</direct>" +
            "        <objectNumber>3</objectNumber>" +
            "        <generationNumber>0</generationNumber>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSObject>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>ID</name>" +
            "        <hashCode>2331</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSArray>" +
            "        <direct>true</direct>" +
            "        <objects>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>HJBK/tJs0frYacg0WAbzog==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "          <org.apache.pdfbox.cos.COSString>" +
            "            <direct>false</direct>" +
            "            <bytes>HJBK/tJs0frYacg0WAbzog==</bytes>" +
            "            <forceHexForm>false</forceHexForm>" +
            "          </org.apache.pdfbox.cos.COSString>" +
            "        </objects>" +
            "        <needToBeUpdated>false</needToBeUpdated>" +
            "      </org.apache.pdfbox.cos.COSArray>" +
            "      <org.apache.pdfbox.cos.COSName>" +
            "        <direct>false</direct>" +
            "        <name>Size</name>" +
            "        <hashCode>2577441</hashCode>" +
            "      </org.apache.pdfbox.cos.COSName>" +
            "      <org.apache.pdfbox.cos.COSInteger>" +
            "        <direct>true</direct>" +
            "        <value>13</value>" +
            "      </org.apache.pdfbox.cos.COSInteger>" +
            "    </mapArr>" +
            "  </items>" +
            "</org.apache.pdfbox.cos.COSDictionary>";
            org.apache.pdfbox.cos.COSDictionary returnedObject = (org.apache.pdfbox.cos.COSDictionary) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject.toString(), receivingObject.getTrailer().toString());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>644</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>141761</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148768</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>694</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>142020</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>825</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>147942</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1073</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148237</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>124</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>181</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1138</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1310</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>83827</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>84466</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>78</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>471</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1177</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>83240</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>84230</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>225</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1569</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150765</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>234377</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>247645</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>477</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1708</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>232715</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>234804</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>264009</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>720</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1842</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>233279</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>235045</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>64</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1530</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150066</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>233674</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>235281</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>225</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1569</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150765</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>234377</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>247645</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>477</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1708</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>232715</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>234804</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>264009</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>720</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1842</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>233279</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>235045</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>64</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1530</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150066</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>233674</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>235281</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>644</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>141761</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148768</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>694</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>142020</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>825</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>147942</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1073</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148237</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>181</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1447</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150600</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>152068</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>481</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1581</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>151188</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>164409</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>124</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1269</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149778</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>151591</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>78</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1308</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150227</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>151832</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>263195</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>729</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>150120</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179571</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>20</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>24</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180356</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>878</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162458</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>21</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>25</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>180604</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1139</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>162828</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>18</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>22</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>262531</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>679</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>149334</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>179171</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>19</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>23</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-16</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefTable14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<map>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>4</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>644</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>8</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>141761</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>12</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>16</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>1</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148768</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>5</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>694</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>9</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>142020</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>13</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>17</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>2</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>15</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>6</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>825</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>10</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>147942</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>14</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>3</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>216</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>7</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>1073</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>11</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>148237</long>" +
            "  </entry>" +
            "  <entry>" +
            "    <org.apache.pdfbox.cos.COSObjectKey>" +
            "      <number>15</number>" +
            "      <generation>0</generation>" +
            "    </org.apache.pdfbox.cos.COSObjectKey>" +
            "    <long>-11</long>" +
            "  </entry>" +
            "</map>";
            java.util.Map returnedObject = (java.util.Map) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefTable());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>STREAM</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>TABLE</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>STREAM</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>STREAM</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>STREAM</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetXrefType7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            XrefTrailerResolver receivingObject = (XrefTrailerResolver) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>STREAM</org.apache.pdfbox.pdfparser.XrefTrailerResolver_-XRefType>";
            XrefTrailerResolver.XRefType returnedObject = (XrefTrailerResolver.XRefType) xStream.fromXML(returnedXML);
            Assert.assertEquals(returnedObject, receivingObject.getXrefType());
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}