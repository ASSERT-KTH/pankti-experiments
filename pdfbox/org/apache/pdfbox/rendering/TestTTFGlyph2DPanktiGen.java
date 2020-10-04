package org.apache.pdfbox.rendering;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestTTFGlyph2DPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetPathForGID1() {
        java.awt.geom.GeneralPath path;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>413.08594</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>413.08594</float>" +
            "    <float>77.63672</float>" +
            "    <byte>66</byte>" +
            "    <float>384.76562</float>" +
            "    <float>36.132812</float>" +
            "    <float>338.8672</float>" +
            "    <float>12.207031</float>" +
            "    <byte>66</byte>" +
            "    <float>292.48047</float>" +
            "    <float>-11.71875</float>" +
            "    <float>241.21094</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>188.96484</float>" +
            "    <float>-11.71875</float>" +
            "    <float>147.46094</float>" +
            "    <float>11.230469</float>" +
            "    <byte>66</byte>" +
            "    <float>105.95703</float>" +
            "    <float>34.179688</float>" +
            "    <float>87.40234</float>" +
            "    <float>75.68359</float>" +
            "    <byte>66</byte>" +
            "    <float>68.84766</float>" +
            "    <float>117.1875</float>" +
            "    <float>68.84766</float>" +
            "    <float>190.42969</float>" +
            "    <byte>65</byte>" +
            "    <float>68.84766</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>206.05469</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>206.05469</float>" +
            "    <float>280.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>206.05469</float>" +
            "    <float>170.89844</float>" +
            "    <float>213.3789</float>" +
            "    <float>146.48438</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>121.58203</float>" +
            "    <float>241.21094</float>" +
            "    <float>107.421875</float>" +
            "    <byte>66</byte>" +
            "    <float>261.23047</float>" +
            "    <float>92.77344</float>" +
            "    <float>291.9922</float>" +
            "    <float>92.77344</float>" +
            "    <byte>66</byte>" +
            "    <float>327.14844</float>" +
            "    <float>92.77344</float>" +
            "    <float>354.98047</float>" +
            "    <float>111.81641</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>131.34766</float>" +
            "    <float>393.0664</float>" +
            "    <float>159.66797</float>" +
            "    <byte>66</byte>" +
            "    <float>403.3203</float>" +
            "    <float>188.47656</float>" +
            "    <float>403.3203</float>" +
            "    <float>299.8047</float>" +
            "    <byte>65</byte>" +
            "    <float>403.3203</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>540.52734</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>540.52734</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>413.08594</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>88</int>" +
            "  <int>117</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>200.19531</float>" +
            "    <byte>66</byte>" +
            "    <float>215.82031</float>" +
            "    <float>136.71875</float>" +
            "    <float>218.26172</float>" +
            "    <float>126.46484</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>115.72266</float>" +
            "    <float>230.46875</float>" +
            "    <float>108.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>240.23438</float>" +
            "    <float>102.05078</float>" +
            "    <float>253.90625</float>" +
            "    <float>102.05078</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>102.05078</float>" +
            "    <float>309.08203</float>" +
            "    <float>115.234375</float>" +
            "    <byte>65</byte>" +
            "    <float>320.80078</float>" +
            "    <float>8.7890625</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>212.40234</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>175.29297</float>" +
            "    <float>-11.71875</float>" +
            "    <float>145.50781</float>" +
            "    <float>0.48828125</float>" +
            "    <byte>66</byte>" +
            "    <float>115.72266</float>" +
            "    <float>13.183594</float>" +
            "    <float>102.05078</float>" +
            "    <float>32.714844</float>" +
            "    <byte>66</byte>" +
            "    <float>87.890625</float>" +
            "    <float>52.734375</float>" +
            "    <float>82.51953</float>" +
            "    <float>86.42578</float>" +
            "    <byte>66</byte>" +
            "    <float>78.125</float>" +
            "    <float>110.35156</float>" +
            "    <float>78.125</float>" +
            "    <float>183.10547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>621.58203</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>701.66016</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>74</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>65</byte>" +
            "    <float>508.78906</float>" +
            "    <float>142.08984</float>" +
            "    <byte>66</byte>" +
            "    <float>482.42188</float>" +
            "    <float>66.89453</float>" +
            "    <float>425.78125</float>" +
            "    <float>27.832031</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>-11.71875</float>" +
            "    <float>283.20312</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>147.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>83.00781</float>" +
            "    <float>76.66016</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>147.46094</float>" +
            "    <float>31.738281</float>" +
            "    <float>255.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>384.27734</float>" +
            "    <float>99.12109</float>" +
            "    <float>457.03125</float>" +
            "    <byte>66</byte>" +
            "    <float>166.5039</float>" +
            "    <float>530.27344</float>" +
            "    <float>269.53125</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>385.2539</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>519.04297</float>" +
            "    <float>377.4414</float>" +
            "    <float>516.1133</float>" +
            "    <float>219.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>172.36328</float>" +
            "    <float>219.72656</float>" +
            "    <byte>66</byte>" +
            "    <float>173.82812</float>" +
            "    <float>158.6914</float>" +
            "    <float>205.5664</float>" +
            "    <float>125.0</float>" +
            "    <byte>66</byte>" +
            "    <float>237.30469</float>" +
            "    <float>90.82031</float>" +
            "    <float>284.66797</float>" +
            "    <float>90.82031</float>" +
            "    <byte>66</byte>" +
            "    <float>316.89453</float>" +
            "    <float>90.82031</float>" +
            "    <float>338.8672</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>360.83984</float>" +
            "    <float>125.97656</float>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>66</byte>" +
            "    <float>378.41797</float>" +
            "    <float>363.28125</float>" +
            "    <float>349.1211</float>" +
            "    <float>394.04297</float>" +
            "    <byte>66</byte>" +
            "    <float>319.82422</float>" +
            "    <float>425.29297</float>" +
            "    <float>277.83203</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>232.91016</float>" +
            "    <float>425.29297</float>" +
            "    <float>203.61328</float>" +
            "    <float>392.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>174.3164</float>" +
            "    <float>359.86328</float>" +
            "    <float>174.80469</float>" +
            "    <float>303.71094</float>" +
            "    <byte>65</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>200.19531</float>" +
            "    <byte>66</byte>" +
            "    <float>215.82031</float>" +
            "    <float>136.71875</float>" +
            "    <float>218.26172</float>" +
            "    <float>126.46484</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>115.72266</float>" +
            "    <float>230.46875</float>" +
            "    <float>108.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>240.23438</float>" +
            "    <float>102.05078</float>" +
            "    <float>253.90625</float>" +
            "    <float>102.05078</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>102.05078</float>" +
            "    <float>309.08203</float>" +
            "    <float>115.234375</float>" +
            "    <byte>65</byte>" +
            "    <float>320.80078</float>" +
            "    <float>8.7890625</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>212.40234</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>175.29297</float>" +
            "    <float>-11.71875</float>" +
            "    <float>145.50781</float>" +
            "    <float>0.48828125</float>" +
            "    <byte>66</byte>" +
            "    <float>115.72266</float>" +
            "    <float>13.183594</float>" +
            "    <float>102.05078</float>" +
            "    <float>32.714844</float>" +
            "    <byte>66</byte>" +
            "    <float>87.890625</float>" +
            "    <float>52.734375</float>" +
            "    <float>82.51953</float>" +
            "    <float>86.42578</float>" +
            "    <byte>66</byte>" +
            "    <float>78.125</float>" +
            "    <float>110.35156</float>" +
            "    <float>78.125</float>" +
            "    <float>183.10547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>621.58203</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>701.66016</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>87</int>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>561.03516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>498.53516</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>212.40234</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>153.32031</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>0.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>278.8086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>431.64062</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>353.51562</float>" +
            "    <float>548.8281</float>" +
            "    <byte>65</byte>" +
            "    <float>256.83594</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>481.4453</float>" +
            "    <float>263.1836</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>305.66406</float>" +
            "    <float>530.27344</float>" +
            "    <float>357.42188</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>447.7539</float>" +
            "    <float>530.27344</float>" +
            "    <float>510.7422</float>" +
            "    <float>459.47266</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>388.67188</float>" +
            "    <float>573.73047</float>" +
            "    <float>262.20703</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>132.32422</float>" +
            "    <float>510.2539</float>" +
            "    <float>60.546875</float>" +
            "    <byte>66</byte>" +
            "    <float>446.77734</float>" +
            "    <float>-11.71875</float>" +
            "    <float>356.4453</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>313.47656</float>" +
            "    <float>-11.71875</float>" +
            "    <float>278.8086</float>" +
            "    <float>5.3710938</float>" +
            "    <byte>66</byte>" +
            "    <float>243.65234</float>" +
            "    <float>22.460938</float>" +
            "    <float>205.07812</float>" +
            "    <float>63.964844</float>" +
            "    <byte>65</byte>" +
            "    <float>205.07812</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>180.66406</float>" +
            "    <float>238.28125</float>" +
            "    <float>139.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>97.16797</float>" +
            "    <float>322.7539</float>" +
            "    <float>97.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>370.60547</float>" +
            "    <float>97.16797</float>" +
            "    <float>402.34375</float>" +
            "    <float>135.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>173.82812</float>" +
            "    <float>434.08203</float>" +
            "    <float>261.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>342.77344</float>" +
            "    <float>401.3672</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>421.875</float>" +
            "    <float>320.3125</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>270.01953</float>" +
            "    <float>421.875</float>" +
            "    <float>236.8164</float>" +
            "    <float>383.30078</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>344.23828</float>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>74</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>65</byte>" +
            "    <float>508.78906</float>" +
            "    <float>142.08984</float>" +
            "    <byte>66</byte>" +
            "    <float>482.42188</float>" +
            "    <float>66.89453</float>" +
            "    <float>425.78125</float>" +
            "    <float>27.832031</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>-11.71875</float>" +
            "    <float>283.20312</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>147.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>83.00781</float>" +
            "    <float>76.66016</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>147.46094</float>" +
            "    <float>31.738281</float>" +
            "    <float>255.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>384.27734</float>" +
            "    <float>99.12109</float>" +
            "    <float>457.03125</float>" +
            "    <byte>66</byte>" +
            "    <float>166.5039</float>" +
            "    <float>530.27344</float>" +
            "    <float>269.53125</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>385.2539</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>519.04297</float>" +
            "    <float>377.4414</float>" +
            "    <float>516.1133</float>" +
            "    <float>219.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>172.36328</float>" +
            "    <float>219.72656</float>" +
            "    <byte>66</byte>" +
            "    <float>173.82812</float>" +
            "    <float>158.6914</float>" +
            "    <float>205.5664</float>" +
            "    <float>125.0</float>" +
            "    <byte>66</byte>" +
            "    <float>237.30469</float>" +
            "    <float>90.82031</float>" +
            "    <float>284.66797</float>" +
            "    <float>90.82031</float>" +
            "    <byte>66</byte>" +
            "    <float>316.89453</float>" +
            "    <float>90.82031</float>" +
            "    <float>338.8672</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>360.83984</float>" +
            "    <float>125.97656</float>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>66</byte>" +
            "    <float>378.41797</float>" +
            "    <float>363.28125</float>" +
            "    <float>349.1211</float>" +
            "    <float>394.04297</float>" +
            "    <byte>66</byte>" +
            "    <float>319.82422</float>" +
            "    <float>425.29297</float>" +
            "    <float>277.83203</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>232.91016</float>" +
            "    <float>425.29297</float>" +
            "    <float>203.61328</float>" +
            "    <float>392.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>174.3164</float>" +
            "    <float>359.86328</float>" +
            "    <float>174.80469</float>" +
            "    <float>303.71094</float>" +
            "    <byte>65</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>72</int>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>334.96094</float>" +
            "    <float>73.73047</float>" +
            "    <float>398.92578</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>462.89062</float>" +
            "    <float>168.94531</float>" +
            "    <float>496.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>530.27344</float>" +
            "    <float>307.1289</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>530.27344</float>" +
            "    <float>500.0</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>377.4414</float>" +
            "    <float>575.1953</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>143.0664</float>" +
            "    <float>499.51172</float>" +
            "    <float>65.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>423.33984</float>" +
            "    <float>-11.71875</float>" +
            "    <float>308.10547</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>236.8164</float>" +
            "    <float>-11.71875</float>" +
            "    <float>172.36328</float>" +
            "    <float>20.507812</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>52.734375</float>" +
            "    <float>73.73047</float>" +
            "    <float>114.74609</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>177.2461</float>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>182.1289</float>" +
            "    <float>217.28516</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>100.09766</float>" +
            "    <float>307.6172</float>" +
            "    <float>100.09766</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>100.09766</float>" +
            "    <float>397.46094</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>182.1289</float>" +
            "    <float>434.08203</float>" +
            "    <float>260.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>336.42578</float>" +
            "    <float>397.94922</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>418.45703</float>" +
            "    <float>307.6172</float>" +
            "    <float>418.45703</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>418.45703</float>" +
            "    <float>217.28516</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>336.42578</float>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>543.45703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.25</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.25</float>" +
            "    <float>264.64844</float>" +
            "    <byte>66</byte>" +
            "    <float>406.25</float>" +
            "    <float>348.6328</float>" +
            "    <float>397.46094</float>" +
            "    <float>373.04688</float>" +
            "    <byte>66</byte>" +
            "    <float>388.67188</float>" +
            "    <float>397.94922</float>" +
            "    <float>369.14062</float>" +
            "    <float>411.6211</float>" +
            "    <byte>66</byte>" +
            "    <float>349.1211</float>" +
            "    <float>425.29297</float>" +
            "    <float>321.28906</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>285.64453</float>" +
            "    <float>425.29297</float>" +
            "    <float>257.32422</float>" +
            "    <float>405.76172</float>" +
            "    <byte>66</byte>" +
            "    <float>229.0039</float>" +
            "    <float>386.23047</float>" +
            "    <float>218.75</float>" +
            "    <float>354.0039</float>" +
            "    <byte>66</byte>" +
            "    <float>208.00781</float>" +
            "    <float>321.77734</float>" +
            "    <float>208.00781</float>" +
            "    <float>234.86328</float>" +
            "    <byte>65</byte>" +
            "    <float>208.00781</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>70.80078</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>70.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>198.24219</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>198.24219</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>530.27344</float>" +
            "    <float>369.14062</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>414.55078</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>514.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>489.7461</float>" +
            "    <float>497.5586</float>" +
            "    <float>508.78906</float>" +
            "    <float>472.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>528.3203</float>" +
            "    <float>446.77734</float>" +
            "    <float>535.64453</float>" +
            "    <float>414.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>543.45703</float>" +
            "    <float>382.32422</float>" +
            "    <float>543.45703</float>" +
            "    <float>322.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>543.45703</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>81</int>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>481.4453</float>" +
            "    <float>263.1836</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>305.66406</float>" +
            "    <float>530.27344</float>" +
            "    <float>357.42188</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>447.7539</float>" +
            "    <float>530.27344</float>" +
            "    <float>510.7422</float>" +
            "    <float>459.47266</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>388.67188</float>" +
            "    <float>573.73047</float>" +
            "    <float>262.20703</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>132.32422</float>" +
            "    <float>510.2539</float>" +
            "    <float>60.546875</float>" +
            "    <byte>66</byte>" +
            "    <float>446.77734</float>" +
            "    <float>-11.71875</float>" +
            "    <float>356.4453</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>313.47656</float>" +
            "    <float>-11.71875</float>" +
            "    <float>278.8086</float>" +
            "    <float>5.3710938</float>" +
            "    <byte>66</byte>" +
            "    <float>243.65234</float>" +
            "    <float>22.460938</float>" +
            "    <float>205.07812</float>" +
            "    <float>63.964844</float>" +
            "    <byte>65</byte>" +
            "    <float>205.07812</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>180.66406</float>" +
            "    <float>238.28125</float>" +
            "    <float>139.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>97.16797</float>" +
            "    <float>322.7539</float>" +
            "    <float>97.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>370.60547</float>" +
            "    <float>97.16797</float>" +
            "    <float>402.34375</float>" +
            "    <float>135.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>173.82812</float>" +
            "    <float>434.08203</float>" +
            "    <float>261.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>342.77344</float>" +
            "    <float>401.3672</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>421.875</float>" +
            "    <float>320.3125</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>270.01953</float>" +
            "    <float>421.875</float>" +
            "    <float>236.8164</float>" +
            "    <float>383.30078</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>344.23828</float>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>20</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>588.8672</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>588.8672</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>588.8672</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>76</int>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>31</int>" +
            "    <int>90</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>73.24219</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>73.24219</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>377.4414</float>" +
            "    <float>715.8203</float>" +
            "    <byte>66</byte>" +
            "    <float>492.1875</float>" +
            "    <float>715.8203</float>" +
            "    <float>543.9453</float>" +
            "    <float>696.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>596.1914</float>" +
            "    <float>677.2461</float>" +
            "    <float>627.4414</float>" +
            "    <float>627.9297</float>" +
            "    <byte>66</byte>" +
            "    <float>658.6914</float>" +
            "    <float>578.6133</float>" +
            "    <float>658.6914</float>" +
            "    <float>515.1367</float>" +
            "    <byte>66</byte>" +
            "    <float>658.6914</float>" +
            "    <float>434.5703</float>" +
            "    <float>611.3281</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>563.96484</float>" +
            "    <float>329.58984</float>" +
            "    <float>469.72656</float>" +
            "    <float>315.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>516.60156</float>" +
            "    <float>288.57422</float>" +
            "    <float>546.875</float>" +
            "    <float>255.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>577.6367</float>" +
            "    <float>223.14453</float>" +
            "    <float>629.39453</float>" +
            "    <float>139.64844</float>" +
            "    <byte>65</byte>" +
            "    <float>716.7969</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>543.9453</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>439.45312</float>" +
            "    <float>155.76172</float>" +
            "    <byte>66</byte>" +
            "    <float>383.78906</float>" +
            "    <float>239.25781</float>" +
            "    <float>363.28125</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>342.77344</float>" +
            "    <float>282.71484</float>" +
            "    <float>319.82422</float>" +
            "    <float>290.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>296.875</float>" +
            "    <float>298.82812</float>" +
            "    <float>247.07031</float>" +
            "    <float>298.82812</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>298.82812</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>73.24219</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>217.77344</float>" +
            "    <float>413.08594</float>" +
            "    <byte>65</byte>" +
            "    <float>324.70703</float>" +
            "    <float>413.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>428.71094</float>" +
            "    <float>413.08594</float>" +
            "    <float>454.58984</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>480.46875</float>" +
            "    <float>430.66406</float>" +
            "    <float>495.1172</float>" +
            "    <float>452.14844</float>" +
            "    <byte>66</byte>" +
            "    <float>509.76562</float>" +
            "    <float>473.6328</float>" +
            "    <float>509.76562</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>509.76562</float>" +
            "    <float>541.9922</float>" +
            "    <float>490.72266</float>" +
            "    <float>563.96484</float>" +
            "    <byte>66</byte>" +
            "    <float>471.1914</float>" +
            "    <float>586.4258</float>" +
            "    <float>436.03516</float>" +
            "    <float>592.28516</float>" +
            "    <byte>66</byte>" +
            "    <float>418.45703</float>" +
            "    <float>594.72656</float>" +
            "    <float>330.5664</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>413.08594</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>53</int>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>561.03516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>498.53516</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>212.40234</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>153.32031</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>0.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>278.8086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>431.64062</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>353.51562</float>" +
            "    <float>548.8281</float>" +
            "    <byte>65</byte>" +
            "    <float>256.83594</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>36</int>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>118</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>65</byte>" +
            "    <float>176.75781</float>" +
            "    <float>246.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>189.45312</float>" +
            "    <float>175.78125</float>" +
            "    <float>228.02734</float>" +
            "    <float>142.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>267.08984</float>" +
            "    <float>109.375</float>" +
            "    <float>333.0078</float>" +
            "    <float>109.375</float>" +
            "    <byte>66</byte>" +
            "    <float>402.83203</float>" +
            "    <float>109.375</float>" +
            "    <float>437.98828</float>" +
            "    <float>138.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>168.45703</float>" +
            "    <float>473.6328</float>" +
            "    <float>208.00781</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>233.39844</float>" +
            "    <float>458.98438</float>" +
            "    <float>250.97656</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>269.04297</float>" +
            "    <float>406.73828</float>" +
            "    <float>282.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>381.34766</float>" +
            "    <float>291.01562</float>" +
            "    <float>291.01562</float>" +
            "    <float>313.47656</float>" +
            "    <byte>66</byte>" +
            "    <float>174.80469</float>" +
            "    <float>342.28516</float>" +
            "    <float>127.92969</float>" +
            "    <float>384.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>443.35938</float>" +
            "    <float>62.01172</float>" +
            "    <float>528.3203</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>583.0078</float>" +
            "    <float>92.77344</float>" +
            "    <float>630.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>124.02344</float>" +
            "    <float>678.22266</float>" +
            "    <float>182.1289</float>" +
            "    <float>703.125</float>" +
            "    <byte>66</byte>" +
            "    <float>240.72266</float>" +
            "    <float>728.02734</float>" +
            "    <float>323.2422</float>" +
            "    <float>728.02734</float>" +
            "    <byte>66</byte>" +
            "    <float>458.0078</float>" +
            "    <float>728.02734</float>" +
            "    <float>525.8789</float>" +
            "    <float>668.9453</float>" +
            "    <byte>66</byte>" +
            "    <float>594.2383</float>" +
            "    <float>609.8633</float>" +
            "    <float>597.65625</float>" +
            "    <float>511.23047</float>" +
            "    <byte>65</byte>" +
            "    <float>453.125</float>" +
            "    <float>504.8828</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>560.0586</float>" +
            "    <float>413.57422</float>" +
            "    <float>583.9844</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>608.39844</float>" +
            "    <float>321.77734</float>" +
            "    <float>608.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>258.78906</float>" +
            "    <float>608.39844</float>" +
            "    <float>223.14453</float>" +
            "    <float>582.51953</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>565.91797</float>" +
            "    <float>200.19531</float>" +
            "    <float>538.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>512.6953</float>" +
            "    <float>221.67969</float>" +
            "    <float>494.6289</float>" +
            "    <byte>66</byte>" +
            "    <float>249.02344</float>" +
            "    <float>471.6797</float>" +
            "    <float>354.4922</float>" +
            "    <float>446.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>459.96094</float>" +
            "    <float>421.875</float>" +
            "    <float>510.2539</float>" +
            "    <float>395.5078</float>" +
            "    <byte>66</byte>" +
            "    <float>561.03516</float>" +
            "    <float>368.65234</float>" +
            "    <float>589.35547</float>" +
            "    <float>322.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>276.3672</float>" +
            "    <float>618.16406</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>146.97266</float>" +
            "    <float>583.9844</float>" +
            "    <float>93.26172</float>" +
            "    <byte>66</byte>" +
            "    <float>549.8047</float>" +
            "    <float>39.55078</float>" +
            "    <float>487.3047</float>" +
            "    <float>13.671875</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>331.54297</float>" +
            "    <float>-12.6953125</float>" +
            "    <byte>66</byte>" +
            "    <float>195.80078</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>123.046875</float>" +
            "    <float>49.804688</float>" +
            "    <byte>66</byte>" +
            "    <float>50.29297</float>" +
            "    <float>112.79297</float>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>214.35547</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>5.3710938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>149.41406</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>247.07031</float>" +
            "    <float>253.90625</float>" +
            "    <byte>65</byte>" +
            "    <float>275.39062</float>" +
            "    <float>165.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>286.6211</float>" +
            "    <float>199.21875</float>" +
            "    <float>289.55078</float>" +
            "    <float>209.96094</float>" +
            "    <byte>66</byte>" +
            "    <float>296.38672</float>" +
            "    <float>231.9336</float>" +
            "    <float>304.19922</float>" +
            "    <float>253.90625</float>" +
            "    <byte>65</byte>" +
            "    <float>402.83203</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>543.9453</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>337.89062</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>214.35547</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>89</int>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>118</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>65</byte>" +
            "    <float>176.75781</float>" +
            "    <float>246.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>189.45312</float>" +
            "    <float>175.78125</float>" +
            "    <float>228.02734</float>" +
            "    <float>142.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>267.08984</float>" +
            "    <float>109.375</float>" +
            "    <float>333.0078</float>" +
            "    <float>109.375</float>" +
            "    <byte>66</byte>" +
            "    <float>402.83203</float>" +
            "    <float>109.375</float>" +
            "    <float>437.98828</float>" +
            "    <float>138.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>168.45703</float>" +
            "    <float>473.6328</float>" +
            "    <float>208.00781</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>233.39844</float>" +
            "    <float>458.98438</float>" +
            "    <float>250.97656</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>269.04297</float>" +
            "    <float>406.73828</float>" +
            "    <float>282.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>381.34766</float>" +
            "    <float>291.01562</float>" +
            "    <float>291.01562</float>" +
            "    <float>313.47656</float>" +
            "    <byte>66</byte>" +
            "    <float>174.80469</float>" +
            "    <float>342.28516</float>" +
            "    <float>127.92969</float>" +
            "    <float>384.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>443.35938</float>" +
            "    <float>62.01172</float>" +
            "    <float>528.3203</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>583.0078</float>" +
            "    <float>92.77344</float>" +
            "    <float>630.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>124.02344</float>" +
            "    <float>678.22266</float>" +
            "    <float>182.1289</float>" +
            "    <float>703.125</float>" +
            "    <byte>66</byte>" +
            "    <float>240.72266</float>" +
            "    <float>728.02734</float>" +
            "    <float>323.2422</float>" +
            "    <float>728.02734</float>" +
            "    <byte>66</byte>" +
            "    <float>458.0078</float>" +
            "    <float>728.02734</float>" +
            "    <float>525.8789</float>" +
            "    <float>668.9453</float>" +
            "    <byte>66</byte>" +
            "    <float>594.2383</float>" +
            "    <float>609.8633</float>" +
            "    <float>597.65625</float>" +
            "    <float>511.23047</float>" +
            "    <byte>65</byte>" +
            "    <float>453.125</float>" +
            "    <float>504.8828</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>560.0586</float>" +
            "    <float>413.57422</float>" +
            "    <float>583.9844</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>608.39844</float>" +
            "    <float>321.77734</float>" +
            "    <float>608.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>258.78906</float>" +
            "    <float>608.39844</float>" +
            "    <float>223.14453</float>" +
            "    <float>582.51953</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>565.91797</float>" +
            "    <float>200.19531</float>" +
            "    <float>538.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>512.6953</float>" +
            "    <float>221.67969</float>" +
            "    <float>494.6289</float>" +
            "    <byte>66</byte>" +
            "    <float>249.02344</float>" +
            "    <float>471.6797</float>" +
            "    <float>354.4922</float>" +
            "    <float>446.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>459.96094</float>" +
            "    <float>421.875</float>" +
            "    <float>510.2539</float>" +
            "    <float>395.5078</float>" +
            "    <byte>66</byte>" +
            "    <float>561.03516</float>" +
            "    <float>368.65234</float>" +
            "    <float>589.35547</float>" +
            "    <float>322.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>276.3672</float>" +
            "    <float>618.16406</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>146.97266</float>" +
            "    <float>583.9844</float>" +
            "    <float>93.26172</float>" +
            "    <byte>66</byte>" +
            "    <float>549.8047</float>" +
            "    <float>39.55078</float>" +
            "    <float>487.3047</float>" +
            "    <float>13.671875</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>331.54297</float>" +
            "    <float>-12.6953125</float>" +
            "    <byte>66</byte>" +
            "    <float>195.80078</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>123.046875</float>" +
            "    <float>49.804688</float>" +
            "    <byte>66</byte>" +
            "    <float>50.29297</float>" +
            "    <float>112.79297</float>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>54</int>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>70</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>216.3086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>216.3086</float>" +
            "    <float>328.125</float>" +
            "    <byte>66</byte>" +
            "    <float>216.3086</float>" +
            "    <float>235.83984</float>" +
            "    <float>221.67969</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>164.55078</float>" +
            "    <float>265.625</float>" +
            "    <float>138.1836</float>" +
            "    <byte>66</byte>" +
            "    <float>300.78125</float>" +
            "    <float>111.328125</float>" +
            "    <float>361.32812</float>" +
            "    <float>111.328125</float>" +
            "    <byte>66</byte>" +
            "    <float>422.85156</float>" +
            "    <float>111.328125</float>" +
            "    <float>454.10156</float>" +
            "    <float>136.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>485.35156</float>" +
            "    <float>161.6211</float>" +
            "    <float>491.69922</float>" +
            "    <float>198.24219</float>" +
            "    <byte>66</byte>" +
            "    <float>498.04688</float>" +
            "    <float>234.86328</float>" +
            "    <float>498.04688</float>" +
            "    <float>319.82422</float>" +
            "    <byte>65</byte>" +
            "    <float>498.04688</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.5781</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.5781</float>" +
            "    <float>339.84375</float>" +
            "    <byte>66</byte>" +
            "    <float>642.5781</float>" +
            "    <float>210.9375</float>" +
            "    <float>630.8594</float>" +
            "    <float>157.71484</float>" +
            "    <byte>66</byte>" +
            "    <float>619.1406</float>" +
            "    <float>104.49219</float>" +
            "    <float>587.8906</float>" +
            "    <float>67.87109</float>" +
            "    <byte>66</byte>" +
            "    <float>556.15234</float>" +
            "    <float>31.25</float>" +
            "    <float>503.41797</float>" +
            "    <float>9.765625</float>" +
            "    <byte>66</byte>" +
            "    <float>450.6836</float>" +
            "    <float>-12.207031</float>" +
            "    <float>365.72266</float>" +
            "    <float>-12.207031</float>" +
            "    <byte>66</byte>" +
            "    <float>263.1836</float>" +
            "    <float>-12.207031</float>" +
            "    <float>210.44922</float>" +
            "    <float>11.230469</float>" +
            "    <byte>66</byte>" +
            "    <float>157.22656</float>" +
            "    <float>35.15625</float>" +
            "    <float>126.46484</float>" +
            "    <float>72.75391</float>" +
            "    <byte>66</byte>" +
            "    <float>95.703125</float>" +
            "    <float>110.83984</float>" +
            "    <float>85.9375</float>" +
            "    <float>152.34375</float>" +
            "    <byte>66</byte>" +
            "    <float>71.77734</float>" +
            "    <float>213.86719</float>" +
            "    <float>71.77734</float>" +
            "    <float>333.98438</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>56</int>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>72</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>304.6875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>66</byte>" +
            "    <float>436.52344</float>" +
            "    <float>715.8203</float>" +
            "    <float>476.5625</float>" +
            "    <float>705.0781</float>" +
            "    <byte>66</byte>" +
            "    <float>538.08594</float>" +
            "    <float>688.96484</float>" +
            "    <float>579.58984</float>" +
            "    <float>635.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>621.09375</float>" +
            "    <float>581.0547</float>" +
            "    <float>621.09375</float>" +
            "    <float>495.60547</float>" +
            "    <byte>66</byte>" +
            "    <float>621.09375</float>" +
            "    <float>429.6875</float>" +
            "    <float>597.16797</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>573.2422</float>" +
            "    <float>339.84375</float>" +
            "    <float>536.6211</float>" +
            "    <float>314.45312</float>" +
            "    <byte>66</byte>" +
            "    <float>499.51172</float>" +
            "    <float>288.57422</float>" +
            "    <float>461.42578</float>" +
            "    <float>280.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>409.66797</float>" +
            "    <float>270.01953</float>" +
            "    <float>311.52344</float>" +
            "    <float>270.01953</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>270.01953</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>391.60156</float>" +
            "    <byte>65</byte>" +
            "    <float>296.38672</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>381.83594</float>" +
            "    <float>391.60156</float>" +
            "    <float>410.64453</float>" +
            "    <float>402.83203</float>" +
            "    <byte>66</byte>" +
            "    <float>439.45312</float>" +
            "    <float>414.0625</float>" +
            "    <float>455.5664</float>" +
            "    <float>437.98828</float>" +
            "    <byte>66</byte>" +
            "    <float>472.16797</float>" +
            "    <float>461.91406</float>" +
            "    <float>472.16797</float>" +
            "    <float>493.65234</float>" +
            "    <byte>66</byte>" +
            "    <float>472.16797</float>" +
            "    <float>532.71484</float>" +
            "    <float>449.21875</float>" +
            "    <float>558.10547</float>" +
            "    <byte>66</byte>" +
            "    <float>426.26953</float>" +
            "    <float>583.4961</float>" +
            "    <float>391.11328</float>" +
            "    <float>589.84375</float>" +
            "    <byte>66</byte>" +
            "    <float>365.23438</float>" +
            "    <float>594.72656</float>" +
            "    <float>287.10938</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>51</int>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>214.84375</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>237.79297</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>497.0703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>466.79688</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>100</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>61.523438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>187.98828</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>187.98828</float>" +
            "    <float>447.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>255.85938</float>" +
            "    <float>530.27344</float>" +
            "    <float>349.60938</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>399.41406</float>" +
            "    <float>530.27344</float>" +
            "    <float>436.03516</float>" +
            "    <float>509.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>472.65625</float>" +
            "    <float>489.2578</float>" +
            "    <float>496.09375</float>" +
            "    <float>447.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>530.27344</float>" +
            "    <float>489.2578</float>" +
            "    <float>569.8242</float>" +
            "    <float>509.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>609.375</float>" +
            "    <float>530.27344</float>" +
            "    <float>654.2969</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>711.4258</float>" +
            "    <float>530.27344</float>" +
            "    <float>750.97656</float>" +
            "    <float>507.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>790.52734</float>" +
            "    <float>483.88672</float>" +
            "    <float>810.0586</float>" +
            "    <float>438.96484</float>" +
            "    <byte>66</byte>" +
            "    <float>824.21875</float>" +
            "    <float>405.76172</float>" +
            "    <float>824.21875</float>" +
            "    <float>331.54297</float>" +
            "    <byte>65</byte>" +
            "    <float>824.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>687.0117</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>687.0117</float>" +
            "    <float>296.38672</float>" +
            "    <byte>66</byte>" +
            "    <float>687.0117</float>" +
            "    <float>373.53516</float>" +
            "    <float>672.85156</float>" +
            "    <float>395.9961</float>" +
            "    <byte>66</byte>" +
            "    <float>653.8086</float>" +
            "    <float>425.29297</float>" +
            "    <float>614.2578</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>585.4492</float>" +
            "    <float>425.29297</float>" +
            "    <float>560.0586</float>" +
            "    <float>407.71484</float>" +
            "    <byte>66</byte>" +
            "    <float>534.66797</float>" +
            "    <float>390.13672</float>" +
            "    <float>523.4375</float>" +
            "    <float>356.4453</float>" +
            "    <byte>66</byte>" +
            "    <float>512.20703</float>" +
            "    <float>322.26562</float>" +
            "    <float>512.20703</float>" +
            "    <float>249.02344</float>" +
            "    <byte>65</byte>" +
            "    <float>512.20703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>375.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>375.0</float>" +
            "    <float>284.1797</float>" +
            "    <byte>66</byte>" +
            "    <float>375.0</float>" +
            "    <float>359.86328</float>" +
            "    <float>367.67578</float>" +
            "    <float>381.83594</float>" +
            "    <byte>66</byte>" +
            "    <float>360.35156</float>" +
            "    <float>403.8086</float>" +
            "    <float>345.21484</float>" +
            "    <float>414.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>329.58984</float>" +
            "    <float>425.29297</float>" +
            "    <float>303.22266</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>271.48438</float>" +
            "    <float>425.29297</float>" +
            "    <float>246.09375</float>" +
            "    <float>408.20312</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>391.11328</float>" +
            "    <float>209.96094</float>" +
            "    <float>358.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>198.73047</float>" +
            "    <float>326.66016</float>" +
            "    <float>198.73047</float>" +
            "    <float>251.95312</float>" +
            "    <byte>65</byte>" +
            "    <float>198.73047</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>61.523438</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>61.523438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>3</int>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>214.84375</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>237.79297</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>497.0703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>466.79688</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>49</int>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>40</int>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>5.859375</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>192.8711</float>" +
            "    <float>267.08984</float>" +
            "    <byte>65</byte>" +
            "    <float>13.671875</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>181.15234</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>272.94922</float>" +
            "    <float>375.97656</float>" +
            "    <byte>65</byte>" +
            "    <float>369.6289</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>530.7617</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>354.98047</float>" +
            "    <float>272.94922</float>" +
            "    <byte>65</byte>" +
            "    <float>546.875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>378.41797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>272.94922</float>" +
            "    <float>160.64453</float>" +
            "    <byte>65</byte>" +
            "    <float>166.5039</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>5.859375</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>91</int>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>334.96094</float>" +
            "    <float>73.73047</float>" +
            "    <float>398.92578</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>462.89062</float>" +
            "    <float>168.94531</float>" +
            "    <float>496.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>530.27344</float>" +
            "    <float>307.1289</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>530.27344</float>" +
            "    <float>500.0</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>377.4414</float>" +
            "    <float>575.1953</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>143.0664</float>" +
            "    <float>499.51172</float>" +
            "    <float>65.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>423.33984</float>" +
            "    <float>-11.71875</float>" +
            "    <float>308.10547</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>236.8164</float>" +
            "    <float>-11.71875</float>" +
            "    <float>172.36328</float>" +
            "    <float>20.507812</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>52.734375</float>" +
            "    <float>73.73047</float>" +
            "    <float>114.74609</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>177.2461</float>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>182.1289</float>" +
            "    <float>217.28516</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>100.09766</float>" +
            "    <float>307.6172</float>" +
            "    <float>100.09766</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>100.09766</float>" +
            "    <float>397.46094</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>182.1289</float>" +
            "    <float>434.08203</float>" +
            "    <float>260.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>336.42578</float>" +
            "    <float>397.94922</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>418.45703</float>" +
            "    <float>307.6172</float>" +
            "    <float>418.45703</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>418.45703</float>" +
            "    <float>217.28516</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>336.42578</float>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForGID34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>28</int>" +
            "    <int>102</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>23.4375</float>" +
            "    <float>147.94922</float>" +
            "    <byte>65</byte>" +
            "    <float>161.13281</float>" +
            "    <float>168.94531</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>128.90625</float>" +
            "    <float>196.77734</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>223.63281</float>" +
            "    <float>87.40234</float>" +
            "    <float>271.97266</float>" +
            "    <float>87.40234</float>" +
            "    <byte>66</byte>" +
            "    <float>325.1953</float>" +
            "    <float>87.40234</float>" +
            "    <float>352.05078</float>" +
            "    <float>106.93359</float>" +
            "    <byte>66</byte>" +
            "    <float>370.1172</float>" +
            "    <float>120.60547</float>" +
            "    <float>370.1172</float>" +
            "    <float>143.55469</float>" +
            "    <byte>66</byte>" +
            "    <float>370.1172</float>" +
            "    <float>159.17969</float>" +
            "    <float>360.35156</float>" +
            "    <float>169.4336</float>" +
            "    <byte>66</byte>" +
            "    <float>350.09766</float>" +
            "    <float>179.19922</float>" +
            "    <float>314.45312</float>" +
            "    <float>187.5</float>" +
            "    <byte>66</byte>" +
            "    <float>148.4375</float>" +
            "    <float>224.1211</float>" +
            "    <float>104.00391</float>" +
            "    <float>254.39453</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>296.38672</float>" +
            "    <float>42.48047</float>" +
            "    <float>371.09375</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>438.47656</float>" +
            "    <float>95.703125</float>" +
            "    <float>484.375</float>" +
            "    <byte>66</byte>" +
            "    <float>148.92578</float>" +
            "    <float>530.27344</float>" +
            "    <float>260.7422</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>367.1875</float>" +
            "    <float>530.27344</float>" +
            "    <float>418.9453</float>" +
            "    <float>495.60547</float>" +
            "    <byte>66</byte>" +
            "    <float>470.70312</float>" +
            "    <float>460.9375</float>" +
            "    <float>490.23438</float>" +
            "    <float>393.0664</float>" +
            "    <byte>65</byte>" +
            "    <float>360.83984</float>" +
            "    <float>369.14062</float>" +
            "    <byte>66</byte>" +
            "    <float>352.53906</float>" +
            "    <float>399.41406</float>" +
            "    <float>329.58984</float>" +
            "    <float>415.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>306.15234</float>" +
            "    <float>431.64062</float>" +
            "    <float>263.1836</float>" +
            "    <float>431.64062</float>" +
            "    <byte>66</byte>" +
            "    <float>208.98438</float>" +
            "    <float>431.64062</float>" +
            "    <float>185.54688</float>" +
            "    <float>416.5039</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>405.76172</float>" +
            "    <float>169.92188</float>" +
            "    <float>388.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>374.02344</float>" +
            "    <float>183.59375</float>" +
            "    <float>363.76953</float>" +
            "    <byte>66</byte>" +
            "    <float>202.14844</float>" +
            "    <float>350.09766</float>" +
            "    <float>311.52344</float>" +
            "    <float>325.1953</float>" +
            "    <byte>66</byte>" +
            "    <float>421.38672</float>" +
            "    <float>300.29297</float>" +
            "    <float>464.84375</float>" +
            "    <float>264.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>507.8125</float>" +
            "    <float>227.53906</float>" +
            "    <float>507.8125</float>" +
            "    <float>162.10938</float>" +
            "    <byte>66</byte>" +
            "    <float>507.8125</float>" +
            "    <float>90.82031</float>" +
            "    <float>448.2422</float>" +
            "    <float>39.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>388.67188</float>" +
            "    <float>-11.71875</float>" +
            "    <float>271.97266</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>166.01562</float>" +
            "    <float>-11.71875</float>" +
            "    <float>104.49219</float>" +
            "    <float>31.25</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>74.21875</float>" +
            "    <float>23.4375</float>" +
            "    <float>147.94922</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>86</int>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            int paramObject2 = (Integer) paramObjects[1];
            Assert.assertEquals(expectedObject, receivingObject.getPathForGID(paramObject1, paramObject2));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>214.84375</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>237.79297</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>497.0703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>466.79688</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>22</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>214.84375</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>237.79297</float>" +
            "    <byte>65</byte>" +
            "    <float>507.8125</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.08984</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>497.0703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>466.79688</float>" +
            "    <byte>65</byte>" +
            "    <float>208.4961</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>74.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>78</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>561.03516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>498.53516</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>212.40234</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>153.32031</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>0.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>278.8086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>431.64062</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>353.51562</float>" +
            "    <float>548.8281</float>" +
            "    <byte>65</byte>" +
            "    <float>256.83594</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>543.45703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.25</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>406.25</float>" +
            "    <float>264.64844</float>" +
            "    <byte>66</byte>" +
            "    <float>406.25</float>" +
            "    <float>348.6328</float>" +
            "    <float>397.46094</float>" +
            "    <float>373.04688</float>" +
            "    <byte>66</byte>" +
            "    <float>388.67188</float>" +
            "    <float>397.94922</float>" +
            "    <float>369.14062</float>" +
            "    <float>411.6211</float>" +
            "    <byte>66</byte>" +
            "    <float>349.1211</float>" +
            "    <float>425.29297</float>" +
            "    <float>321.28906</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>285.64453</float>" +
            "    <float>425.29297</float>" +
            "    <float>257.32422</float>" +
            "    <float>405.76172</float>" +
            "    <byte>66</byte>" +
            "    <float>229.0039</float>" +
            "    <float>386.23047</float>" +
            "    <float>218.75</float>" +
            "    <float>354.0039</float>" +
            "    <byte>66</byte>" +
            "    <float>208.00781</float>" +
            "    <float>321.77734</float>" +
            "    <float>208.00781</float>" +
            "    <float>234.86328</float>" +
            "    <byte>65</byte>" +
            "    <float>208.00781</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>70.80078</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>70.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>198.24219</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>198.24219</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>530.27344</float>" +
            "    <float>369.14062</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>414.55078</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>514.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>489.7461</float>" +
            "    <float>497.5586</float>" +
            "    <float>508.78906</float>" +
            "    <float>472.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>528.3203</float>" +
            "    <float>446.77734</float>" +
            "    <float>535.64453</float>" +
            "    <float>414.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>543.45703</float>" +
            "    <float>382.32422</float>" +
            "    <float>543.45703</float>" +
            "    <float>322.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>543.45703</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>110</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>72</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>304.6875</float>" +
            "    <float>715.8203</float>" +
            "    <byte>66</byte>" +
            "    <float>436.52344</float>" +
            "    <float>715.8203</float>" +
            "    <float>476.5625</float>" +
            "    <float>705.0781</float>" +
            "    <byte>66</byte>" +
            "    <float>538.08594</float>" +
            "    <float>688.96484</float>" +
            "    <float>579.58984</float>" +
            "    <float>635.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>621.09375</float>" +
            "    <float>581.0547</float>" +
            "    <float>621.09375</float>" +
            "    <float>495.60547</float>" +
            "    <byte>66</byte>" +
            "    <float>621.09375</float>" +
            "    <float>429.6875</float>" +
            "    <float>597.16797</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>573.2422</float>" +
            "    <float>339.84375</float>" +
            "    <float>536.6211</float>" +
            "    <float>314.45312</float>" +
            "    <byte>66</byte>" +
            "    <float>499.51172</float>" +
            "    <float>288.57422</float>" +
            "    <float>461.42578</float>" +
            "    <float>280.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>409.66797</float>" +
            "    <float>270.01953</float>" +
            "    <float>311.52344</float>" +
            "    <float>270.01953</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>270.01953</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>391.60156</float>" +
            "    <byte>65</byte>" +
            "    <float>296.38672</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>381.83594</float>" +
            "    <float>391.60156</float>" +
            "    <float>410.64453</float>" +
            "    <float>402.83203</float>" +
            "    <byte>66</byte>" +
            "    <float>439.45312</float>" +
            "    <float>414.0625</float>" +
            "    <float>455.5664</float>" +
            "    <float>437.98828</float>" +
            "    <byte>66</byte>" +
            "    <float>472.16797</float>" +
            "    <float>461.91406</float>" +
            "    <float>472.16797</float>" +
            "    <float>493.65234</float>" +
            "    <byte>66</byte>" +
            "    <float>472.16797</float>" +
            "    <float>532.71484</float>" +
            "    <float>449.21875</float>" +
            "    <float>558.10547</float>" +
            "    <byte>66</byte>" +
            "    <float>426.26953</float>" +
            "    <float>583.4961</float>" +
            "    <float>391.11328</float>" +
            "    <float>589.84375</float>" +
            "    <byte>66</byte>" +
            "    <float>365.23438</float>" +
            "    <float>594.72656</float>" +
            "    <float>287.10938</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>80</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>214.35547</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>5.3710938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>149.41406</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>247.07031</float>" +
            "    <float>253.90625</float>" +
            "    <byte>65</byte>" +
            "    <float>275.39062</float>" +
            "    <float>165.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>286.6211</float>" +
            "    <float>199.21875</float>" +
            "    <float>289.55078</float>" +
            "    <float>209.96094</float>" +
            "    <byte>66</byte>" +
            "    <float>296.38672</float>" +
            "    <float>231.9336</float>" +
            "    <float>304.19922</float>" +
            "    <float>253.90625</float>" +
            "    <byte>65</byte>" +
            "    <float>402.83203</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>543.9453</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>337.89062</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>214.35547</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>118</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>334.96094</float>" +
            "    <float>73.73047</float>" +
            "    <float>398.92578</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>462.89062</float>" +
            "    <float>168.94531</float>" +
            "    <float>496.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>530.27344</float>" +
            "    <float>307.1289</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>530.27344</float>" +
            "    <float>500.0</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>377.4414</float>" +
            "    <float>575.1953</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>143.0664</float>" +
            "    <float>499.51172</float>" +
            "    <float>65.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>423.33984</float>" +
            "    <float>-11.71875</float>" +
            "    <float>308.10547</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>236.8164</float>" +
            "    <float>-11.71875</float>" +
            "    <float>172.36328</float>" +
            "    <float>20.507812</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>52.734375</float>" +
            "    <float>73.73047</float>" +
            "    <float>114.74609</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>177.2461</float>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>182.1289</float>" +
            "    <float>217.28516</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>100.09766</float>" +
            "    <float>307.6172</float>" +
            "    <float>100.09766</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>100.09766</float>" +
            "    <float>397.46094</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>182.1289</float>" +
            "    <float>434.08203</float>" +
            "    <float>260.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>336.42578</float>" +
            "    <float>397.94922</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>418.45703</float>" +
            "    <float>307.6172</float>" +
            "    <float>418.45703</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>418.45703</float>" +
            "    <float>217.28516</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>336.42578</float>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>76</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>334.96094</float>" +
            "    <float>73.73047</float>" +
            "    <float>398.92578</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>462.89062</float>" +
            "    <float>168.94531</float>" +
            "    <float>496.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>530.27344</float>" +
            "    <float>307.1289</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>530.27344</float>" +
            "    <float>500.0</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>377.4414</float>" +
            "    <float>575.1953</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>575.1953</float>" +
            "    <float>143.0664</float>" +
            "    <float>499.51172</float>" +
            "    <float>65.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>423.33984</float>" +
            "    <float>-11.71875</float>" +
            "    <float>308.10547</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>236.8164</float>" +
            "    <float>-11.71875</float>" +
            "    <float>172.36328</float>" +
            "    <float>20.507812</float>" +
            "    <byte>66</byte>" +
            "    <float>107.421875</float>" +
            "    <float>52.734375</float>" +
            "    <float>73.73047</float>" +
            "    <float>114.74609</float>" +
            "    <byte>66</byte>" +
            "    <float>40.039062</float>" +
            "    <float>177.2461</float>" +
            "    <float>40.039062</float>" +
            "    <float>266.60156</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>182.1289</float>" +
            "    <float>217.28516</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>100.09766</float>" +
            "    <float>307.6172</float>" +
            "    <float>100.09766</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>100.09766</float>" +
            "    <float>397.46094</float>" +
            "    <float>141.11328</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>182.1289</float>" +
            "    <float>434.08203</float>" +
            "    <float>260.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>336.42578</float>" +
            "    <float>397.94922</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>361.32812</float>" +
            "    <float>418.45703</float>" +
            "    <float>307.6172</float>" +
            "    <float>418.45703</float>" +
            "    <byte>66</byte>" +
            "    <float>253.90625</float>" +
            "    <float>418.45703</float>" +
            "    <float>217.28516</float>" +
            "    <float>377.4414</float>" +
            "    <byte>66</byte>" +
            "    <float>180.66406</float>" +
            "    <float>336.42578</float>" +
            "    <float>180.66406</float>" +
            "    <float>259.27734</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>111</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>74</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>65</byte>" +
            "    <float>508.78906</float>" +
            "    <float>142.08984</float>" +
            "    <byte>66</byte>" +
            "    <float>482.42188</float>" +
            "    <float>66.89453</float>" +
            "    <float>425.78125</float>" +
            "    <float>27.832031</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>-11.71875</float>" +
            "    <float>283.20312</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>147.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>83.00781</float>" +
            "    <float>76.66016</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>147.46094</float>" +
            "    <float>31.738281</float>" +
            "    <float>255.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>384.27734</float>" +
            "    <float>99.12109</float>" +
            "    <float>457.03125</float>" +
            "    <byte>66</byte>" +
            "    <float>166.5039</float>" +
            "    <float>530.27344</float>" +
            "    <float>269.53125</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>385.2539</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>519.04297</float>" +
            "    <float>377.4414</float>" +
            "    <float>516.1133</float>" +
            "    <float>219.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>172.36328</float>" +
            "    <float>219.72656</float>" +
            "    <byte>66</byte>" +
            "    <float>173.82812</float>" +
            "    <float>158.6914</float>" +
            "    <float>205.5664</float>" +
            "    <float>125.0</float>" +
            "    <byte>66</byte>" +
            "    <float>237.30469</float>" +
            "    <float>90.82031</float>" +
            "    <float>284.66797</float>" +
            "    <float>90.82031</float>" +
            "    <byte>66</byte>" +
            "    <float>316.89453</float>" +
            "    <float>90.82031</float>" +
            "    <float>338.8672</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>360.83984</float>" +
            "    <float>125.97656</float>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>66</byte>" +
            "    <float>378.41797</float>" +
            "    <float>363.28125</float>" +
            "    <float>349.1211</float>" +
            "    <float>394.04297</float>" +
            "    <byte>66</byte>" +
            "    <float>319.82422</float>" +
            "    <float>425.29297</float>" +
            "    <float>277.83203</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>232.91016</float>" +
            "    <float>425.29297</float>" +
            "    <float>203.61328</float>" +
            "    <float>392.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>174.3164</float>" +
            "    <float>359.86328</float>" +
            "    <float>174.80469</float>" +
            "    <float>303.71094</float>" +
            "    <byte>65</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>481.4453</float>" +
            "    <float>263.1836</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>305.66406</float>" +
            "    <float>530.27344</float>" +
            "    <float>357.42188</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>447.7539</float>" +
            "    <float>530.27344</float>" +
            "    <float>510.7422</float>" +
            "    <float>459.47266</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>388.67188</float>" +
            "    <float>573.73047</float>" +
            "    <float>262.20703</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>132.32422</float>" +
            "    <float>510.2539</float>" +
            "    <float>60.546875</float>" +
            "    <byte>66</byte>" +
            "    <float>446.77734</float>" +
            "    <float>-11.71875</float>" +
            "    <float>356.4453</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>313.47656</float>" +
            "    <float>-11.71875</float>" +
            "    <float>278.8086</float>" +
            "    <float>5.3710938</float>" +
            "    <byte>66</byte>" +
            "    <float>243.65234</float>" +
            "    <float>22.460938</float>" +
            "    <float>205.07812</float>" +
            "    <float>63.964844</float>" +
            "    <byte>65</byte>" +
            "    <float>205.07812</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>180.66406</float>" +
            "    <float>238.28125</float>" +
            "    <float>139.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>97.16797</float>" +
            "    <float>322.7539</float>" +
            "    <float>97.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>370.60547</float>" +
            "    <float>97.16797</float>" +
            "    <float>402.34375</float>" +
            "    <float>135.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>173.82812</float>" +
            "    <float>434.08203</float>" +
            "    <float>261.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>342.77344</float>" +
            "    <float>401.3672</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>421.875</float>" +
            "    <float>320.3125</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>270.01953</float>" +
            "    <float>421.875</float>" +
            "    <float>236.8164</float>" +
            "    <float>383.30078</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>344.23828</float>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>31</int>" +
            "    <int>90</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>73.24219</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>73.24219</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>377.4414</float>" +
            "    <float>715.8203</float>" +
            "    <byte>66</byte>" +
            "    <float>492.1875</float>" +
            "    <float>715.8203</float>" +
            "    <float>543.9453</float>" +
            "    <float>696.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>596.1914</float>" +
            "    <float>677.2461</float>" +
            "    <float>627.4414</float>" +
            "    <float>627.9297</float>" +
            "    <byte>66</byte>" +
            "    <float>658.6914</float>" +
            "    <float>578.6133</float>" +
            "    <float>658.6914</float>" +
            "    <float>515.1367</float>" +
            "    <byte>66</byte>" +
            "    <float>658.6914</float>" +
            "    <float>434.5703</float>" +
            "    <float>611.3281</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>563.96484</float>" +
            "    <float>329.58984</float>" +
            "    <float>469.72656</float>" +
            "    <float>315.91797</float>" +
            "    <byte>66</byte>" +
            "    <float>516.60156</float>" +
            "    <float>288.57422</float>" +
            "    <float>546.875</float>" +
            "    <float>255.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>577.6367</float>" +
            "    <float>223.14453</float>" +
            "    <float>629.39453</float>" +
            "    <float>139.64844</float>" +
            "    <byte>65</byte>" +
            "    <float>716.7969</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>543.9453</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>439.45312</float>" +
            "    <float>155.76172</float>" +
            "    <byte>66</byte>" +
            "    <float>383.78906</float>" +
            "    <float>239.25781</float>" +
            "    <float>363.28125</float>" +
            "    <float>260.7422</float>" +
            "    <byte>66</byte>" +
            "    <float>342.77344</float>" +
            "    <float>282.71484</float>" +
            "    <float>319.82422</float>" +
            "    <float>290.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>296.875</float>" +
            "    <float>298.82812</float>" +
            "    <float>247.07031</float>" +
            "    <float>298.82812</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>298.82812</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>73.24219</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>217.77344</float>" +
            "    <float>413.08594</float>" +
            "    <byte>65</byte>" +
            "    <float>324.70703</float>" +
            "    <float>413.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>428.71094</float>" +
            "    <float>413.08594</float>" +
            "    <float>454.58984</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>480.46875</float>" +
            "    <float>430.66406</float>" +
            "    <float>495.1172</float>" +
            "    <float>452.14844</float>" +
            "    <byte>66</byte>" +
            "    <float>509.76562</float>" +
            "    <float>473.6328</float>" +
            "    <float>509.76562</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>509.76562</float>" +
            "    <float>541.9922</float>" +
            "    <float>490.72266</float>" +
            "    <float>563.96484</float>" +
            "    <byte>66</byte>" +
            "    <float>471.1914</float>" +
            "    <float>586.4258</float>" +
            "    <float>436.03516</float>" +
            "    <float>592.28516</float>" +
            "    <byte>66</byte>" +
            "    <float>418.45703</float>" +
            "    <float>594.72656</float>" +
            "    <float>330.5664</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.77344</float>" +
            "    <float>413.08594</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>82</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>28</int>" +
            "    <int>102</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>23.4375</float>" +
            "    <float>147.94922</float>" +
            "    <byte>65</byte>" +
            "    <float>161.13281</float>" +
            "    <float>168.94531</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>128.90625</float>" +
            "    <float>196.77734</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>223.63281</float>" +
            "    <float>87.40234</float>" +
            "    <float>271.97266</float>" +
            "    <float>87.40234</float>" +
            "    <byte>66</byte>" +
            "    <float>325.1953</float>" +
            "    <float>87.40234</float>" +
            "    <float>352.05078</float>" +
            "    <float>106.93359</float>" +
            "    <byte>66</byte>" +
            "    <float>370.1172</float>" +
            "    <float>120.60547</float>" +
            "    <float>370.1172</float>" +
            "    <float>143.55469</float>" +
            "    <byte>66</byte>" +
            "    <float>370.1172</float>" +
            "    <float>159.17969</float>" +
            "    <float>360.35156</float>" +
            "    <float>169.4336</float>" +
            "    <byte>66</byte>" +
            "    <float>350.09766</float>" +
            "    <float>179.19922</float>" +
            "    <float>314.45312</float>" +
            "    <float>187.5</float>" +
            "    <byte>66</byte>" +
            "    <float>148.4375</float>" +
            "    <float>224.1211</float>" +
            "    <float>104.00391</float>" +
            "    <float>254.39453</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>296.38672</float>" +
            "    <float>42.48047</float>" +
            "    <float>371.09375</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>438.47656</float>" +
            "    <float>95.703125</float>" +
            "    <float>484.375</float>" +
            "    <byte>66</byte>" +
            "    <float>148.92578</float>" +
            "    <float>530.27344</float>" +
            "    <float>260.7422</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>367.1875</float>" +
            "    <float>530.27344</float>" +
            "    <float>418.9453</float>" +
            "    <float>495.60547</float>" +
            "    <byte>66</byte>" +
            "    <float>470.70312</float>" +
            "    <float>460.9375</float>" +
            "    <float>490.23438</float>" +
            "    <float>393.0664</float>" +
            "    <byte>65</byte>" +
            "    <float>360.83984</float>" +
            "    <float>369.14062</float>" +
            "    <byte>66</byte>" +
            "    <float>352.53906</float>" +
            "    <float>399.41406</float>" +
            "    <float>329.58984</float>" +
            "    <float>415.52734</float>" +
            "    <byte>66</byte>" +
            "    <float>306.15234</float>" +
            "    <float>431.64062</float>" +
            "    <float>263.1836</float>" +
            "    <float>431.64062</float>" +
            "    <byte>66</byte>" +
            "    <float>208.98438</float>" +
            "    <float>431.64062</float>" +
            "    <float>185.54688</float>" +
            "    <float>416.5039</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>405.76172</float>" +
            "    <float>169.92188</float>" +
            "    <float>388.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>169.92188</float>" +
            "    <float>374.02344</float>" +
            "    <float>183.59375</float>" +
            "    <float>363.76953</float>" +
            "    <byte>66</byte>" +
            "    <float>202.14844</float>" +
            "    <float>350.09766</float>" +
            "    <float>311.52344</float>" +
            "    <float>325.1953</float>" +
            "    <byte>66</byte>" +
            "    <float>421.38672</float>" +
            "    <float>300.29297</float>" +
            "    <float>464.84375</float>" +
            "    <float>264.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>507.8125</float>" +
            "    <float>227.53906</float>" +
            "    <float>507.8125</float>" +
            "    <float>162.10938</float>" +
            "    <byte>66</byte>" +
            "    <float>507.8125</float>" +
            "    <float>90.82031</float>" +
            "    <float>448.2422</float>" +
            "    <float>39.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>388.67188</float>" +
            "    <float>-11.71875</float>" +
            "    <float>271.97266</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>166.01562</float>" +
            "    <float>-11.71875</float>" +
            "    <float>104.49219</float>" +
            "    <float>31.25</float>" +
            "    <byte>66</byte>" +
            "    <float>42.48047</float>" +
            "    <float>74.21875</float>" +
            "    <float>23.4375</float>" +
            "    <float>147.94922</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>115</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>12</int>" +
            "    <int>20</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>588.8672</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>588.8672</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>588.8672</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>208.98438</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>105</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>22</int>" +
            "    <int>70</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>216.3086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>216.3086</float>" +
            "    <float>328.125</float>" +
            "    <byte>66</byte>" +
            "    <float>216.3086</float>" +
            "    <float>235.83984</float>" +
            "    <float>221.67969</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>230.95703</float>" +
            "    <float>164.55078</float>" +
            "    <float>265.625</float>" +
            "    <float>138.1836</float>" +
            "    <byte>66</byte>" +
            "    <float>300.78125</float>" +
            "    <float>111.328125</float>" +
            "    <float>361.32812</float>" +
            "    <float>111.328125</float>" +
            "    <byte>66</byte>" +
            "    <float>422.85156</float>" +
            "    <float>111.328125</float>" +
            "    <float>454.10156</float>" +
            "    <float>136.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>485.35156</float>" +
            "    <float>161.6211</float>" +
            "    <float>491.69922</float>" +
            "    <float>198.24219</float>" +
            "    <byte>66</byte>" +
            "    <float>498.04688</float>" +
            "    <float>234.86328</float>" +
            "    <float>498.04688</float>" +
            "    <float>319.82422</float>" +
            "    <byte>65</byte>" +
            "    <float>498.04688</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.5781</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>642.5781</float>" +
            "    <float>339.84375</float>" +
            "    <byte>66</byte>" +
            "    <float>642.5781</float>" +
            "    <float>210.9375</float>" +
            "    <float>630.8594</float>" +
            "    <float>157.71484</float>" +
            "    <byte>66</byte>" +
            "    <float>619.1406</float>" +
            "    <float>104.49219</float>" +
            "    <float>587.8906</float>" +
            "    <float>67.87109</float>" +
            "    <byte>66</byte>" +
            "    <float>556.15234</float>" +
            "    <float>31.25</float>" +
            "    <float>503.41797</float>" +
            "    <float>9.765625</float>" +
            "    <byte>66</byte>" +
            "    <float>450.6836</float>" +
            "    <float>-12.207031</float>" +
            "    <float>365.72266</float>" +
            "    <float>-12.207031</float>" +
            "    <byte>66</byte>" +
            "    <float>263.1836</float>" +
            "    <float>-12.207031</float>" +
            "    <float>210.44922</float>" +
            "    <float>11.230469</float>" +
            "    <byte>66</byte>" +
            "    <float>157.22656</float>" +
            "    <float>35.15625</float>" +
            "    <float>126.46484</float>" +
            "    <float>72.75391</float>" +
            "    <byte>66</byte>" +
            "    <float>95.703125</float>" +
            "    <float>110.83984</float>" +
            "    <float>85.9375</float>" +
            "    <float>152.34375</float>" +
            "    <byte>66</byte>" +
            "    <float>71.77734</float>" +
            "    <float>213.86719</float>" +
            "    <float>71.77734</float>" +
            "    <float>333.98438</float>" +
            "    <byte>65</byte>" +
            "    <float>71.77734</float>" +
            "    <float>715.8203</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>85</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode17-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>25</int>" +
            "    <int>78</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>195.80078</float>" +
            "    <float>442.3828</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>481.4453</float>" +
            "    <float>263.1836</float>" +
            "    <float>505.85938</float>" +
            "    <byte>66</byte>" +
            "    <float>305.66406</float>" +
            "    <float>530.27344</float>" +
            "    <float>357.42188</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>447.7539</float>" +
            "    <float>530.27344</float>" +
            "    <float>510.7422</float>" +
            "    <float>459.47266</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>388.67188</float>" +
            "    <float>573.73047</float>" +
            "    <float>262.20703</float>" +
            "    <byte>66</byte>" +
            "    <float>573.73047</float>" +
            "    <float>132.32422</float>" +
            "    <float>510.2539</float>" +
            "    <float>60.546875</float>" +
            "    <byte>66</byte>" +
            "    <float>446.77734</float>" +
            "    <float>-11.71875</float>" +
            "    <float>356.4453</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>313.47656</float>" +
            "    <float>-11.71875</float>" +
            "    <float>278.8086</float>" +
            "    <float>5.3710938</float>" +
            "    <byte>66</byte>" +
            "    <float>243.65234</float>" +
            "    <float>22.460938</float>" +
            "    <float>205.07812</float>" +
            "    <float>63.964844</float>" +
            "    <byte>65</byte>" +
            "    <float>205.07812</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>-197.26562</float>" +
            "    <byte>65</byte>" +
            "    <float>67.87109</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>180.66406</float>" +
            "    <float>238.28125</float>" +
            "    <float>139.16016</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>97.16797</float>" +
            "    <float>322.7539</float>" +
            "    <float>97.16797</float>" +
            "    <byte>66</byte>" +
            "    <float>370.60547</float>" +
            "    <float>97.16797</float>" +
            "    <float>402.34375</float>" +
            "    <float>135.2539</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>173.82812</float>" +
            "    <float>434.08203</float>" +
            "    <float>261.23047</float>" +
            "    <byte>66</byte>" +
            "    <float>434.08203</float>" +
            "    <float>342.77344</float>" +
            "    <float>401.3672</float>" +
            "    <float>382.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>421.875</float>" +
            "    <float>320.3125</float>" +
            "    <float>421.875</float>" +
            "    <byte>66</byte>" +
            "    <float>270.01953</float>" +
            "    <float>421.875</float>" +
            "    <float>236.8164</float>" +
            "    <float>383.30078</float>" +
            "    <byte>66</byte>" +
            "    <float>203.61328</float>" +
            "    <float>344.23828</float>" +
            "    <float>203.61328</float>" +
            "    <float>268.0664</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>112</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode18-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>561.03516</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>498.53516</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>212.40234</float>" +
            "    <float>162.59766</float>" +
            "    <byte>65</byte>" +
            "    <float>153.32031</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>0.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>278.8086</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>431.64062</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>718.2617</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>353.51562</float>" +
            "    <float>548.8281</float>" +
            "    <byte>65</byte>" +
            "    <float>256.83594</float>" +
            "    <float>283.20312</float>" +
            "    <byte>65</byte>" +
            "    <float>452.14844</float>" +
            "    <float>283.20312</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>65</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode19-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>118</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>65</byte>" +
            "    <float>176.75781</float>" +
            "    <float>246.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>189.45312</float>" +
            "    <float>175.78125</float>" +
            "    <float>228.02734</float>" +
            "    <float>142.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>267.08984</float>" +
            "    <float>109.375</float>" +
            "    <float>333.0078</float>" +
            "    <float>109.375</float>" +
            "    <byte>66</byte>" +
            "    <float>402.83203</float>" +
            "    <float>109.375</float>" +
            "    <float>437.98828</float>" +
            "    <float>138.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>168.45703</float>" +
            "    <float>473.6328</float>" +
            "    <float>208.00781</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>233.39844</float>" +
            "    <float>458.98438</float>" +
            "    <float>250.97656</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>269.04297</float>" +
            "    <float>406.73828</float>" +
            "    <float>282.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>381.34766</float>" +
            "    <float>291.01562</float>" +
            "    <float>291.01562</float>" +
            "    <float>313.47656</float>" +
            "    <byte>66</byte>" +
            "    <float>174.80469</float>" +
            "    <float>342.28516</float>" +
            "    <float>127.92969</float>" +
            "    <float>384.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>443.35938</float>" +
            "    <float>62.01172</float>" +
            "    <float>528.3203</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>583.0078</float>" +
            "    <float>92.77344</float>" +
            "    <float>630.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>124.02344</float>" +
            "    <float>678.22266</float>" +
            "    <float>182.1289</float>" +
            "    <float>703.125</float>" +
            "    <byte>66</byte>" +
            "    <float>240.72266</float>" +
            "    <float>728.02734</float>" +
            "    <float>323.2422</float>" +
            "    <float>728.02734</float>" +
            "    <byte>66</byte>" +
            "    <float>458.0078</float>" +
            "    <float>728.02734</float>" +
            "    <float>525.8789</float>" +
            "    <float>668.9453</float>" +
            "    <byte>66</byte>" +
            "    <float>594.2383</float>" +
            "    <float>609.8633</float>" +
            "    <float>597.65625</float>" +
            "    <float>511.23047</float>" +
            "    <byte>65</byte>" +
            "    <float>453.125</float>" +
            "    <float>504.8828</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>560.0586</float>" +
            "    <float>413.57422</float>" +
            "    <float>583.9844</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>608.39844</float>" +
            "    <float>321.77734</float>" +
            "    <float>608.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>258.78906</float>" +
            "    <float>608.39844</float>" +
            "    <float>223.14453</float>" +
            "    <float>582.51953</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>565.91797</float>" +
            "    <float>200.19531</float>" +
            "    <float>538.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>512.6953</float>" +
            "    <float>221.67969</float>" +
            "    <float>494.6289</float>" +
            "    <byte>66</byte>" +
            "    <float>249.02344</float>" +
            "    <float>471.6797</float>" +
            "    <float>354.4922</float>" +
            "    <float>446.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>459.96094</float>" +
            "    <float>421.875</float>" +
            "    <float>510.2539</float>" +
            "    <float>395.5078</float>" +
            "    <byte>66</byte>" +
            "    <float>561.03516</float>" +
            "    <float>368.65234</float>" +
            "    <float>589.35547</float>" +
            "    <float>322.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>276.3672</float>" +
            "    <float>618.16406</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>146.97266</float>" +
            "    <float>583.9844</float>" +
            "    <float>93.26172</float>" +
            "    <byte>66</byte>" +
            "    <float>549.8047</float>" +
            "    <float>39.55078</float>" +
            "    <float>487.3047</float>" +
            "    <float>13.671875</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>331.54297</float>" +
            "    <float>-12.6953125</float>" +
            "    <byte>66</byte>" +
            "    <float>195.80078</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>123.046875</float>" +
            "    <float>49.804688</float>" +
            "    <byte>66</byte>" +
            "    <float>50.29297</float>" +
            "    <float>112.79297</float>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode20-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>21</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>413.08594</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>413.08594</float>" +
            "    <float>77.63672</float>" +
            "    <byte>66</byte>" +
            "    <float>384.76562</float>" +
            "    <float>36.132812</float>" +
            "    <float>338.8672</float>" +
            "    <float>12.207031</float>" +
            "    <byte>66</byte>" +
            "    <float>292.48047</float>" +
            "    <float>-11.71875</float>" +
            "    <float>241.21094</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>188.96484</float>" +
            "    <float>-11.71875</float>" +
            "    <float>147.46094</float>" +
            "    <float>11.230469</float>" +
            "    <byte>66</byte>" +
            "    <float>105.95703</float>" +
            "    <float>34.179688</float>" +
            "    <float>87.40234</float>" +
            "    <float>75.68359</float>" +
            "    <byte>66</byte>" +
            "    <float>68.84766</float>" +
            "    <float>117.1875</float>" +
            "    <float>68.84766</float>" +
            "    <float>190.42969</float>" +
            "    <byte>65</byte>" +
            "    <float>68.84766</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>206.05469</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>206.05469</float>" +
            "    <float>280.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>206.05469</float>" +
            "    <float>170.89844</float>" +
            "    <float>213.3789</float>" +
            "    <float>146.48438</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>121.58203</float>" +
            "    <float>241.21094</float>" +
            "    <float>107.421875</float>" +
            "    <byte>66</byte>" +
            "    <float>261.23047</float>" +
            "    <float>92.77344</float>" +
            "    <float>291.9922</float>" +
            "    <float>92.77344</float>" +
            "    <byte>66</byte>" +
            "    <float>327.14844</float>" +
            "    <float>92.77344</float>" +
            "    <float>354.98047</float>" +
            "    <float>111.81641</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>131.34766</float>" +
            "    <float>393.0664</float>" +
            "    <float>159.66797</float>" +
            "    <byte>66</byte>" +
            "    <float>403.3203</float>" +
            "    <float>188.47656</float>" +
            "    <float>403.3203</float>" +
            "    <float>299.8047</float>" +
            "    <byte>65</byte>" +
            "    <float>403.3203</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>540.52734</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>540.52734</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>413.08594</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>117</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode21-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode22-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode23-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>100</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>61.523438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>187.98828</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>187.98828</float>" +
            "    <float>447.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>255.85938</float>" +
            "    <float>530.27344</float>" +
            "    <float>349.60938</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>399.41406</float>" +
            "    <float>530.27344</float>" +
            "    <float>436.03516</float>" +
            "    <float>509.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>472.65625</float>" +
            "    <float>489.2578</float>" +
            "    <float>496.09375</float>" +
            "    <float>447.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>530.27344</float>" +
            "    <float>489.2578</float>" +
            "    <float>569.8242</float>" +
            "    <float>509.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>609.375</float>" +
            "    <float>530.27344</float>" +
            "    <float>654.2969</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>711.4258</float>" +
            "    <float>530.27344</float>" +
            "    <float>750.97656</float>" +
            "    <float>507.32422</float>" +
            "    <byte>66</byte>" +
            "    <float>790.52734</float>" +
            "    <float>483.88672</float>" +
            "    <float>810.0586</float>" +
            "    <float>438.96484</float>" +
            "    <byte>66</byte>" +
            "    <float>824.21875</float>" +
            "    <float>405.76172</float>" +
            "    <float>824.21875</float>" +
            "    <float>331.54297</float>" +
            "    <byte>65</byte>" +
            "    <float>824.21875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>687.0117</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>687.0117</float>" +
            "    <float>296.38672</float>" +
            "    <byte>66</byte>" +
            "    <float>687.0117</float>" +
            "    <float>373.53516</float>" +
            "    <float>672.85156</float>" +
            "    <float>395.9961</float>" +
            "    <byte>66</byte>" +
            "    <float>653.8086</float>" +
            "    <float>425.29297</float>" +
            "    <float>614.2578</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>585.4492</float>" +
            "    <float>425.29297</float>" +
            "    <float>560.0586</float>" +
            "    <float>407.71484</float>" +
            "    <byte>66</byte>" +
            "    <float>534.66797</float>" +
            "    <float>390.13672</float>" +
            "    <float>523.4375</float>" +
            "    <float>356.4453</float>" +
            "    <byte>66</byte>" +
            "    <float>512.20703</float>" +
            "    <float>322.26562</float>" +
            "    <float>512.20703</float>" +
            "    <float>249.02344</float>" +
            "    <byte>65</byte>" +
            "    <float>512.20703</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>375.0</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>375.0</float>" +
            "    <float>284.1797</float>" +
            "    <byte>66</byte>" +
            "    <float>375.0</float>" +
            "    <float>359.86328</float>" +
            "    <float>367.67578</float>" +
            "    <float>381.83594</float>" +
            "    <byte>66</byte>" +
            "    <float>360.35156</float>" +
            "    <float>403.8086</float>" +
            "    <float>345.21484</float>" +
            "    <float>414.55078</float>" +
            "    <byte>66</byte>" +
            "    <float>329.58984</float>" +
            "    <float>425.29297</float>" +
            "    <float>303.22266</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>271.48438</float>" +
            "    <float>425.29297</float>" +
            "    <float>246.09375</float>" +
            "    <float>408.20312</float>" +
            "    <byte>66</byte>" +
            "    <float>220.70312</float>" +
            "    <float>391.11328</float>" +
            "    <float>209.96094</float>" +
            "    <float>358.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>198.73047</float>" +
            "    <float>326.66016</float>" +
            "    <float>198.73047</float>" +
            "    <float>251.95312</float>" +
            "    <byte>65</byte>" +
            "    <float>198.73047</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>61.523438</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>61.523438</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>109</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode24-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>200.19531</float>" +
            "    <byte>66</byte>" +
            "    <float>215.82031</float>" +
            "    <float>136.71875</float>" +
            "    <float>218.26172</float>" +
            "    <float>126.46484</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>115.72266</float>" +
            "    <float>230.46875</float>" +
            "    <float>108.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>240.23438</float>" +
            "    <float>102.05078</float>" +
            "    <float>253.90625</float>" +
            "    <float>102.05078</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>102.05078</float>" +
            "    <float>309.08203</float>" +
            "    <float>115.234375</float>" +
            "    <byte>65</byte>" +
            "    <float>320.80078</float>" +
            "    <float>8.7890625</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>212.40234</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>175.29297</float>" +
            "    <float>-11.71875</float>" +
            "    <float>145.50781</float>" +
            "    <float>0.48828125</float>" +
            "    <byte>66</byte>" +
            "    <float>115.72266</float>" +
            "    <float>13.183594</float>" +
            "    <float>102.05078</float>" +
            "    <float>32.714844</float>" +
            "    <byte>66</byte>" +
            "    <float>87.890625</float>" +
            "    <float>52.734375</float>" +
            "    <float>82.51953</float>" +
            "    <float>86.42578</float>" +
            "    <byte>66</byte>" +
            "    <float>78.125</float>" +
            "    <float>110.35156</float>" +
            "    <float>78.125</float>" +
            "    <float>183.10547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>621.58203</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>701.66016</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode25-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode26-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>74</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>65</byte>" +
            "    <float>508.78906</float>" +
            "    <float>142.08984</float>" +
            "    <byte>66</byte>" +
            "    <float>482.42188</float>" +
            "    <float>66.89453</float>" +
            "    <float>425.78125</float>" +
            "    <float>27.832031</float>" +
            "    <byte>66</byte>" +
            "    <float>368.65234</float>" +
            "    <float>-11.71875</float>" +
            "    <float>283.20312</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>147.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>83.00781</float>" +
            "    <float>76.66016</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>147.46094</float>" +
            "    <float>31.738281</float>" +
            "    <float>255.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>31.738281</float>" +
            "    <float>384.27734</float>" +
            "    <float>99.12109</float>" +
            "    <float>457.03125</float>" +
            "    <byte>66</byte>" +
            "    <float>166.5039</float>" +
            "    <float>530.27344</float>" +
            "    <float>269.53125</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>385.2539</float>" +
            "    <float>530.27344</float>" +
            "    <float>452.14844</float>" +
            "    <float>454.10156</float>" +
            "    <byte>66</byte>" +
            "    <float>519.04297</float>" +
            "    <float>377.4414</float>" +
            "    <float>516.1133</float>" +
            "    <float>219.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>172.36328</float>" +
            "    <float>219.72656</float>" +
            "    <byte>66</byte>" +
            "    <float>173.82812</float>" +
            "    <float>158.6914</float>" +
            "    <float>205.5664</float>" +
            "    <float>125.0</float>" +
            "    <byte>66</byte>" +
            "    <float>237.30469</float>" +
            "    <float>90.82031</float>" +
            "    <float>284.66797</float>" +
            "    <float>90.82031</float>" +
            "    <byte>66</byte>" +
            "    <float>316.89453</float>" +
            "    <float>90.82031</float>" +
            "    <float>338.8672</float>" +
            "    <float>108.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>360.83984</float>" +
            "    <float>125.97656</float>" +
            "    <float>372.0703</float>" +
            "    <float>165.03906</float>" +
            "    <byte>96</byte>" +
            "    <byte>64</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>66</byte>" +
            "    <float>378.41797</float>" +
            "    <float>363.28125</float>" +
            "    <float>349.1211</float>" +
            "    <float>394.04297</float>" +
            "    <byte>66</byte>" +
            "    <float>319.82422</float>" +
            "    <float>425.29297</float>" +
            "    <float>277.83203</float>" +
            "    <float>425.29297</float>" +
            "    <byte>66</byte>" +
            "    <float>232.91016</float>" +
            "    <float>425.29297</float>" +
            "    <float>203.61328</float>" +
            "    <float>392.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>174.3164</float>" +
            "    <float>359.86328</float>" +
            "    <float>174.80469</float>" +
            "    <float>303.71094</float>" +
            "    <byte>65</byte>" +
            "    <float>379.8828</float>" +
            "    <float>303.71094</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>101</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode27-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>15</int>" +
            "    <int>42</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>65.91797</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>193.35938</float>" +
            "    <float>444.82422</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>497.0703</float>" +
            "    <float>251.95312</float>" +
            "    <float>513.6719</float>" +
            "    <byte>66</byte>" +
            "    <float>278.3203</float>" +
            "    <float>530.27344</float>" +
            "    <float>311.52344</float>" +
            "    <float>530.27344</float>" +
            "    <byte>66</byte>" +
            "    <float>358.39844</float>" +
            "    <float>530.27344</float>" +
            "    <float>401.85547</float>" +
            "    <float>504.39453</float>" +
            "    <byte>65</byte>" +
            "    <float>359.375</float>" +
            "    <float>384.76562</float>" +
            "    <byte>66</byte>" +
            "    <float>324.70703</float>" +
            "    <float>407.22656</float>" +
            "    <float>294.92188</float>" +
            "    <float>407.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>266.11328</float>" +
            "    <float>407.22656</float>" +
            "    <float>246.09375</float>" +
            "    <float>391.60156</float>" +
            "    <byte>66</byte>" +
            "    <float>226.07422</float>" +
            "    <float>375.48828</float>" +
            "    <float>214.84375</float>" +
            "    <float>333.98438</float>" +
            "    <byte>66</byte>" +
            "    <float>203.125</float>" +
            "    <float>292.48047</float>" +
            "    <float>203.125</float>" +
            "    <float>160.15625</float>" +
            "    <byte>65</byte>" +
            "    <float>203.125</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>114</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode28-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>32</int>" +
            "    <int>118</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>65</byte>" +
            "    <float>176.75781</float>" +
            "    <float>246.58203</float>" +
            "    <byte>66</byte>" +
            "    <float>189.45312</float>" +
            "    <float>175.78125</float>" +
            "    <float>228.02734</float>" +
            "    <float>142.57812</float>" +
            "    <byte>66</byte>" +
            "    <float>267.08984</float>" +
            "    <float>109.375</float>" +
            "    <float>333.0078</float>" +
            "    <float>109.375</float>" +
            "    <byte>66</byte>" +
            "    <float>402.83203</float>" +
            "    <float>109.375</float>" +
            "    <float>437.98828</float>" +
            "    <float>138.67188</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>168.45703</float>" +
            "    <float>473.6328</float>" +
            "    <float>208.00781</float>" +
            "    <byte>66</byte>" +
            "    <float>473.6328</float>" +
            "    <float>233.39844</float>" +
            "    <float>458.98438</float>" +
            "    <float>250.97656</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>269.04297</float>" +
            "    <float>406.73828</float>" +
            "    <float>282.22656</float>" +
            "    <byte>66</byte>" +
            "    <float>381.34766</float>" +
            "    <float>291.01562</float>" +
            "    <float>291.01562</float>" +
            "    <float>313.47656</float>" +
            "    <byte>66</byte>" +
            "    <float>174.80469</float>" +
            "    <float>342.28516</float>" +
            "    <float>127.92969</float>" +
            "    <float>384.27734</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>443.35938</float>" +
            "    <float>62.01172</float>" +
            "    <float>528.3203</float>" +
            "    <byte>66</byte>" +
            "    <float>62.01172</float>" +
            "    <float>583.0078</float>" +
            "    <float>92.77344</float>" +
            "    <float>630.3711</float>" +
            "    <byte>66</byte>" +
            "    <float>124.02344</float>" +
            "    <float>678.22266</float>" +
            "    <float>182.1289</float>" +
            "    <float>703.125</float>" +
            "    <byte>66</byte>" +
            "    <float>240.72266</float>" +
            "    <float>728.02734</float>" +
            "    <float>323.2422</float>" +
            "    <float>728.02734</float>" +
            "    <byte>66</byte>" +
            "    <float>458.0078</float>" +
            "    <float>728.02734</float>" +
            "    <float>525.8789</float>" +
            "    <float>668.9453</float>" +
            "    <byte>66</byte>" +
            "    <float>594.2383</float>" +
            "    <float>609.8633</float>" +
            "    <float>597.65625</float>" +
            "    <float>511.23047</float>" +
            "    <byte>65</byte>" +
            "    <float>453.125</float>" +
            "    <float>504.8828</float>" +
            "    <byte>66</byte>" +
            "    <float>443.84766</float>" +
            "    <float>560.0586</float>" +
            "    <float>413.57422</float>" +
            "    <float>583.9844</float>" +
            "    <byte>66</byte>" +
            "    <float>382.8125</float>" +
            "    <float>608.39844</float>" +
            "    <float>321.77734</float>" +
            "    <float>608.39844</float>" +
            "    <byte>66</byte>" +
            "    <float>258.78906</float>" +
            "    <float>608.39844</float>" +
            "    <float>223.14453</float>" +
            "    <float>582.51953</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>565.91797</float>" +
            "    <float>200.19531</float>" +
            "    <float>538.08594</float>" +
            "    <byte>66</byte>" +
            "    <float>200.19531</float>" +
            "    <float>512.6953</float>" +
            "    <float>221.67969</float>" +
            "    <float>494.6289</float>" +
            "    <byte>66</byte>" +
            "    <float>249.02344</float>" +
            "    <float>471.6797</float>" +
            "    <float>354.4922</float>" +
            "    <float>446.77734</float>" +
            "    <byte>66</byte>" +
            "    <float>459.96094</float>" +
            "    <float>421.875</float>" +
            "    <float>510.2539</float>" +
            "    <float>395.5078</float>" +
            "    <byte>66</byte>" +
            "    <float>561.03516</float>" +
            "    <float>368.65234</float>" +
            "    <float>589.35547</float>" +
            "    <float>322.7539</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>276.3672</float>" +
            "    <float>618.16406</float>" +
            "    <float>208.4961</float>" +
            "    <byte>66</byte>" +
            "    <float>618.16406</float>" +
            "    <float>146.97266</float>" +
            "    <float>583.9844</float>" +
            "    <float>93.26172</float>" +
            "    <byte>66</byte>" +
            "    <float>549.8047</float>" +
            "    <float>39.55078</float>" +
            "    <float>487.3047</float>" +
            "    <float>13.671875</float>" +
            "    <byte>66</byte>" +
            "    <float>424.8047</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>331.54297</float>" +
            "    <float>-12.6953125</float>" +
            "    <byte>66</byte>" +
            "    <float>195.80078</float>" +
            "    <float>-12.6953125</float>" +
            "    <float>123.046875</float>" +
            "    <float>49.804688</float>" +
            "    <byte>66</byte>" +
            "    <float>50.29297</float>" +
            "    <float>112.79297</float>" +
            "    <float>36.132812</float>" +
            "    <float>232.91016</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>83</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode29-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>715.8203</float>" +
            "    <byte>65</byte>" +
            "    <float>603.5156</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>594.72656</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>436.03516</float>" +
            "    <byte>65</byte>" +
            "    <float>576.66016</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>315.4297</float>" +
            "    <byte>65</byte>" +
            "    <float>217.28516</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>120.60547</float>" +
            "    <byte>65</byte>" +
            "    <float>617.1875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>72.75391</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>69</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode30-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode31-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode32-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>14</int>" +
            "    <int>26</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>5.859375</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>192.8711</float>" +
            "    <float>267.08984</float>" +
            "    <byte>65</byte>" +
            "    <float>13.671875</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>181.15234</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>272.94922</float>" +
            "    <float>375.97656</float>" +
            "    <byte>65</byte>" +
            "    <float>369.6289</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>530.7617</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>354.98047</float>" +
            "    <float>272.94922</float>" +
            "    <byte>65</byte>" +
            "    <float>546.875</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>378.41797</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>272.94922</float>" +
            "    <float>160.64453</float>" +
            "    <byte>65</byte>" +
            "    <float>166.5039</float>" +
            "    <float>0.0</float>" +
            "    <byte>65</byte>" +
            "    <float>5.859375</float>" +
            "    <float>0.0</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>120</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode33-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>0</int>" +
            "    <int>0</int>" +
            "    <byte>1</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>32</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetPathForCharacterCode34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.TTFGlyph2D.getPathForCharacterCode34-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            org.apache.pdfbox.rendering.TTFGlyph2D receivingObject = (org.apache.pdfbox.rendering.TTFGlyph2D) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<java.awt.geom.GeneralPath serialization=\"custom\">" +
            "  <unserializable-parents/>" +
            "  <java.awt.geom.Path2D_-Float>" +
            "    <default/>" +
            "    <byte>48</byte>" +
            "    <int>23</int>" +
            "    <int>62</int>" +
            "    <byte>1</byte>" +
            "    <byte>64</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>200.19531</float>" +
            "    <byte>66</byte>" +
            "    <float>215.82031</float>" +
            "    <float>136.71875</float>" +
            "    <float>218.26172</float>" +
            "    <float>126.46484</float>" +
            "    <byte>66</byte>" +
            "    <float>221.1914</float>" +
            "    <float>115.72266</float>" +
            "    <float>230.46875</float>" +
            "    <float>108.88672</float>" +
            "    <byte>66</byte>" +
            "    <float>240.23438</float>" +
            "    <float>102.05078</float>" +
            "    <float>253.90625</float>" +
            "    <float>102.05078</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>102.05078</float>" +
            "    <float>309.08203</float>" +
            "    <float>115.234375</float>" +
            "    <byte>65</byte>" +
            "    <float>320.80078</float>" +
            "    <float>8.7890625</float>" +
            "    <byte>66</byte>" +
            "    <float>272.94922</float>" +
            "    <float>-11.71875</float>" +
            "    <float>212.40234</float>" +
            "    <float>-11.71875</float>" +
            "    <byte>66</byte>" +
            "    <float>175.29297</float>" +
            "    <float>-11.71875</float>" +
            "    <float>145.50781</float>" +
            "    <float>0.48828125</float>" +
            "    <byte>66</byte>" +
            "    <float>115.72266</float>" +
            "    <float>13.183594</float>" +
            "    <float>102.05078</float>" +
            "    <float>32.714844</float>" +
            "    <byte>66</byte>" +
            "    <float>87.890625</float>" +
            "    <float>52.734375</float>" +
            "    <float>82.51953</float>" +
            "    <float>86.42578</float>" +
            "    <byte>66</byte>" +
            "    <float>78.125</float>" +
            "    <float>110.35156</float>" +
            "    <float>78.125</float>" +
            "    <float>183.10547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>409.1797</float>" +
            "    <byte>65</byte>" +
            "    <float>15.136719</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>78.125</float>" +
            "    <float>621.58203</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>701.66016</float>" +
            "    <byte>65</byte>" +
            "    <float>215.82031</float>" +
            "    <float>518.5547</float>" +
            "    <byte>65</byte>" +
            "    <float>309.5703</float>" +
            "    <float>518.5547</float>" +
            "    <byte>96</byte>" +
            "    <byte>97</byte>" +
            "  </java.awt.geom.Path2D_-Float>" +
            "</java.awt.geom.GeneralPath>";
            java.awt.geom.GeneralPath expectedObject = (java.awt.geom.GeneralPath) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <int>116</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(expectedObject, receivingObject.getPathForCharacterCode(paramObject1));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}