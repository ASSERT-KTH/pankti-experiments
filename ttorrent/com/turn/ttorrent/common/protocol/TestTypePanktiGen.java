package com.turn.ttorrent.common.protocol;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestTypePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testEquals1() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>INTERESTED</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals2() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>KEEP_ALIVE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>1</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals3() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>INTERESTED</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals4() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>KEEP_ALIVE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals5() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>CHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals6() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>CHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals7() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>UNCHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals8() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>KEEP_ALIVE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals9() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>NOT_INTERESTED</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals10() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>CHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>1</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals11() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>UNCHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals12() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>BITFIELD</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals13() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>UNCHOKE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>1</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals14() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>NOT_INTERESTED</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals15() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>HAVE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>4</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }

    @Test
    public void testEquals16() {
        String receivingXML = 
        "<com.turn.ttorrent.common.protocol.PeerMessage_-Type>HAVE</com.turn.ttorrent.common.protocol.PeerMessage_-Type>";
        PeerMessage.Type receivingObject = (PeerMessage.Type) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <byte>5</byte>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte paramObject1 = (Byte) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.equals(paramObject1));
    }
}