package org.apache.fontbox.cmap;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestCodespaceRangePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testIsFullMatch1() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEo=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch2() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>ADM=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch3() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEQ=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch4() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFU=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch5() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFI=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch6() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFM=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch7() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AE4=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch8() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>ACc=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch9() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>ADY=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch10() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEU=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch11() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFE=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch12() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEw=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch13() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFc=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch14() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFA=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch15() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFY=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch16() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEg=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch17() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>ABA=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch18() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>ACk=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch19() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AE8=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch20() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AAM=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch21() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AFs=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch22() {
        String receivingXML = 
        "<org.apache.fontbox.cmap.CodespaceRange>" +
        "  <start>" +
        "    <int>0</int>" +
        "    <int>0</int>" +
        "  </start>" +
        "  <end>" +
        "    <int>255</int>" +
        "    <int>255</int>" +
        "  </end>" +
        "  <codeLength>2</codeLength>" +
        "</org.apache.fontbox.cmap.CodespaceRange>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte-array>AEk=</byte-array>" +
        "  <int>2</int>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }
}