package org.apache.fontbox.cmap;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestCIDRangePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testMap1() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>51</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>3</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap2() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>82</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>R</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap3() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>80</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap4() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>73</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>I</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap5() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>85</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>U</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap6() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>68</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>D</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap7() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>76</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>L</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap8() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>79</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>O</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap9() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>39</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>'</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap10() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>41</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>)</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap11() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>91</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>[</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap12() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>69</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap13() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>87</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>W</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap14() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>72</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap15() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>81</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>Q</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap16() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>3</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>&#x3;</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap17() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>86</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>V</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap18() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>74</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>J</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap19() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>78</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap20() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>54</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>6</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap21() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>83</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>S</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap22() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CIDRange>" +
        "  <from/>" +
        "  <to>&#xffff;</to>" +
        "  <cid>0</cid>" +
        "</org.apache.fontbox.cmap.CIDRange>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<int>16</int>";
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>&#x10;</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }
}