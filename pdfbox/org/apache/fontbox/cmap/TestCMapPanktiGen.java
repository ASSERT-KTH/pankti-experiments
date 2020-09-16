package org.apache.fontbox.cmap;
import com.thoughtworks.xstream.XStream;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;
public class TestCMapPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetCodeFromArray1() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>12</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AAw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray2() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>76</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray3() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>80</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFA=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray4() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>24</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABg=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray5() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>17</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABE=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray6() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>20</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABQ=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray7() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>55</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ADc=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray8() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>81</int>" +
            "      <string>n</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>82</int>" +
            "      <string>o</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>83</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFM=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray9() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>69</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEU=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray10() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEk=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray11() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>43</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ACs=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray12() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEg=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray13() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>54</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ADY=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray14() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode/>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>-1</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>3</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AAM=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray15() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>81</int>" +
            "      <string>n</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>82</int>" +
            "      <string>o</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>83</int>" +
            "      <string>p</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>85</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFU=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray16() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>41</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ACk=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray17() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEo=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray18() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>71</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEc=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray19() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>16</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABA=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray20() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>51</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ADM=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray21() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>36</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ACQ=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray22() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>81</int>" +
            "      <string>n</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>82</int>" +
            "      <string>o</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>83</int>" +
            "      <string>p</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>85</int>" +
            "      <string>r</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>86</int>" +
            "      <string>s</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>87</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFc=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray23() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>15</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AA8=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray24() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>21</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABU=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray25() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>91</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFs=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray26() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>74</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEo=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray27() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>92</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray28() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>75</int>" +
            "      <string>h</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>78</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AE4=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray29() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>44</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ACw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray30() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>78</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AE4=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray31() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>23</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABc=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray32() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>19</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABM=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray33() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>10</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AAo=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray34() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>28</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray35() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>11</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AAs=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray36() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>81</int>" +
            "      <string>n</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>82</int>" +
            "      <string>o</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>83</int>" +
            "      <string>p</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>85</int>" +
            "      <string>r</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>86</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFY=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray37() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>75</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEs=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray38() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEQ=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray39() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>70</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEY=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray40() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>81</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFE=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray41() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>79</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AE8=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray42() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>78</int>" +
            "      <string>k</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>79</int>" +
            "      <string>l</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>80</int>" +
            "      <string>m</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>81</int>" +
            "      <string>n</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>82</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AFI=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray43() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>69</int>" +
            "      <string>b</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>70</int>" +
            "      <string>c</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>71</int>" +
            "      <string>d</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>73</int>" +
            "      <string>f</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>74</int>" +
            "      <string>g</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>75</int>" +
            "      <string>h</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>17</int>" +
            "      <string>.</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>19</int>" +
            "      <string>0</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>20</int>" +
            "      <string>1</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>21</int>" +
            "      <string>2</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>23</int>" +
            "      <string>4</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>24</int>" +
            "      <string>5</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>43</int>" +
            "      <string>H</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>44</int>" +
            "      <string>I</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>54</int>" +
            "      <string>S</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>55</int>" +
            "      <string>T</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>76</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEw=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray44() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>72</int>" +
            "      <string>e</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>73</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEk=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray45() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>48</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ADA=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray46() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>48</int>" +
            "      <string>M</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>36</int>" +
            "      <string>A</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>10</int>" +
            "      <string>'</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>11</int>" +
            "      <string>(</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>28</int>" +
            "      <string>9</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>92</int>" +
            "      <string>y</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>12</int>" +
            "      <string>)</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>15</int>" +
            "      <string>,</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>16</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ABA=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray47() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>39</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>ACc=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray48() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>68</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEQ=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCodeFromArray49() {
        try {
            String receivingXML = 
            "<org.apache.fontbox.cmap.CMap>" +
            "  <wmode>0</wmode>" +
            "  <cmapName>Adobe-Identity-UCS</cmapName>" +
            "  <cmapType>2</cmapType>" +
            "  <supplement>0</supplement>" +
            "  <minCodeLength>2</minCodeLength>" +
            "  <maxCodeLength>2</maxCodeLength>" +
            "  <codespaceRanges>" +
            "    <org.apache.fontbox.cmap.CodespaceRange>" +
            "      <start>" +
            "        <int>0</int>" +
            "        <int>0</int>" +
            "      </start>" +
            "      <end>" +
            "        <int>255</int>" +
            "        <int>255</int>" +
            "      </end>" +
            "      <codeLength>2</codeLength>" +
            "    </org.apache.fontbox.cmap.CodespaceRange>" +
            "  </codespaceRanges>" +
            "  <charToUnicode>" +
            "    <entry>" +
            "      <int>16</int>" +
            "      <string>-</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>3</int>" +
            "      <string> </string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>51</int>" +
            "      <string>P</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>68</int>" +
            "      <string>a</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>39</int>" +
            "      <string>D</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>41</int>" +
            "      <string>F</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>91</int>" +
            "      <string>x</string>" +
            "    </entry>" +
            "    <entry>" +
            "      <int>76</int>" +
            "      <string>i</string>" +
            "    </entry>" +
            "  </charToUnicode>" +
            "  <codeToCid/>" +
            "  <codeToCidRanges/>" +
            "  <spaceMapping>3</spaceMapping>" +
            "</org.apache.fontbox.cmap.CMap>";
            CMap receivingObject = (CMap) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>72</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <byte-array>AEg=</byte-array>" +
            "  <int>0</int>" +
            "  <int>2</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            byte[] paramObject1 = (byte[]) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Class Clazz = Class.forName("org.apache.fontbox.cmap.CMap");
            Method getCodeFromArray = Clazz.getDeclaredMethod("getCodeFromArray", byte[].class, int.class, int.class);
            getCodeFromArray.setAccessible(true);
            Assert.assertEquals(returnedObject, getCodeFromArray.invoke(receivingObject, paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}