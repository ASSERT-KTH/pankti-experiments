package com.hs.mail.imap.parser;
import com.thoughtworks.xstream.XStream;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;
public class TestAbstractImapCommandParserPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testQuoted_special1() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>15</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"te</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>e</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special2() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>26</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>r</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special3() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>18</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>-</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special4() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>23</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-recei</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>i</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special5() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special6() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>32</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@local</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>l</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special7() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special8() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>40</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"6</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>6</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special9() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special10() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>34</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@localho</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>o</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special11() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special12() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>29</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@lo</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>o</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special13() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>46</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"654321\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special14() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special15() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special16() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>27</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>@</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special17() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN0</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>0</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special18() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>20</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-re</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>e</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special19() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>22</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-rece</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>e</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special20() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>13</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>IGOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special21() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>39</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special22() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>16</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"tes</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>s</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special23() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>21</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-rec</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>c</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special24() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>36</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@localhost</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>t</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special25() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>33</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@localh</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>h</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special26() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>14</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"t</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>t</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special27() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special28() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>44</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"65432</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>2</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special29() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>28</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@l</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>l</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special30() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>37</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@localhost\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>true</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special31() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special32() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special33() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>42</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"654</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>4</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special34() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>31</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@loca</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>a</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special35() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>24</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiv</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>v</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special36() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>45</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"654321</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>1</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special37() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>19</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-r</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>r</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special38() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>43</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"6543</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>3</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special39() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN2</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>2</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special40() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>35</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@localhos</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>s</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special41() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special42() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>30</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receiver@loc</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>c</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special43() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>25</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test-receive</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>e</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special44() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>41</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"65</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>5</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special45() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special46() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>17</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"test</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>t</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special47() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN1</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>1</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special48() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special49() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testQuoted_special50() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.quoted_special(paramObject1));
    }

    @Test
    public void testResp_special1() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special2() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special3() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special4() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special5() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN2 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special6() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special7() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special8() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special9() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special10() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN4</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>4</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special11() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN5</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>5</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special12() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special13() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>G</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special14() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special15() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special16() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN0</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>0</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special17() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special18() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN0 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special19() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special20() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN1 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special21() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN6 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special22() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NO</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>O</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special23() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN5 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special24() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special25() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN6</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>6</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special26() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special27() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN3 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special28() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special29() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special30() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special31() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG0 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special32() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special33() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special34() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special35() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN2</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>2</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special36() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>39</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special37() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special38() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special39() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG0</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>0</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special40() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>6</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN4 </buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char> </char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special41() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special42() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN1</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>1</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special43() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>N</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special44() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special45() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special46() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special47() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>13</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>IGOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special48() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special49() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testResp_special50() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN3</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>3</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.resp_special(paramObject1));
    }

    @Test
    public void testDigit1() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>IPFH4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>13</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>IPFH4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit2() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>BBPE4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>13</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>BBPE4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit3() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>BBPE4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>BBPE4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit4() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>KJLI4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>13</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>KJLI4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit5() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>KJLI4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>KJLI4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit6() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>IPFH4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>IPFH4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit7() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit8() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>IPFH4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>IPFH4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit9() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>0</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit10() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit11() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit12() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>KJLI4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>0</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>KJLI4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit13() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>IPFH4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>0</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>IPFH4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit14() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit15() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>BBPE4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>0</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>BBPE4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit16() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>13</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit17() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>13</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit18() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>BBPE4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>F&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>BBPE4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit19() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>KJLI4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3 </buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>KJLI4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>false</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char> </char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testDigit20() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG4 FETCH 3 (RFC822)" +
            "</str>" +
            "    <length>23</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback> 3&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>3</buffer>" +
            "  <pos>0</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG4</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>FETCH</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method digit = Clazz.getDeclaredMethod("digit", char.class);
            digit.setAccessible(true);
            Assert.assertEquals(returnedObject, digit.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testList_wildcard1() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard2() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>N</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard3() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NO</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>O</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard4() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard5() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard6() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>N</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard7() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard8() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard9() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard10() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard11() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard12() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN4</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>4</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard13() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN5</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>5</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard14() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard15() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>G</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard16() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard17() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard18() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard19() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN0</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>0</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard20() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>13</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>IGOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>NOPG1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard21() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard22() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard23() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NO</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>O</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard24() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard25() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG1</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>1</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard26() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN6</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>6</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard27() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>39</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>NOPG1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard28() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard29() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN6 LOGOUT" +
        "</str>" +
        "    <length>13</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard30() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard31() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard32() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard33() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN5 CLOSE" +
        "</str>" +
        "    <length>12</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard34() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard35() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN2</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>2</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard36() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>39</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>QUOTED</type>" +
        "      <value>test-receiver@localhost</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard37() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>3</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEP</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>P</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard38() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard39() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG0</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>0</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard40() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard41() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN1</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>1</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard42() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>N</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard43() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard44() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN4 FETCH 3 (RFC822)" +
        "</str>" +
        "    <length>23</length>" +
        "    <next>1</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>H</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>H</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard45() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>NOPG</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>G</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard46() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN2 SELECT INBOX" +
        "</str>" +
        "    <length>19</length>" +
        "    <next>4</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>N</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard47() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>13</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>IGOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>\"</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>TAG</type>" +
        "      <value>HEPN1</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "    <com.hs.mail.imap.parser.Token>" +
        "      <type>KEYWORD</type>" +
        "      <value>LOGIN</value>" +
        "    </com.hs.mail.imap.parser.Token>" +
        "  </tokens>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>\"</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard48() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN0 CAPABILITY" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard49() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
        "</str>" +
        "    <length>47</length>" +
        "    <next>2</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HE</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>E</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testList_wildcard50() {
        String receivingXML = 
        "<com.hs.mail.imap.parser.CommandParser>" +
        "  <reader>" +
        "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
        "    <str>HEPN3 SEARCH ALL" +
        "</str>" +
        "    <length>17</length>" +
        "    <next>5</next>" +
        "    <mark>0</mark>" +
        "  </reader>" +
        "  <pushback>&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
        "  <buffer>HEPN3</buffer>" +
        "  <pos>-1</pos>" +
        "  <tokens/>" +
        "  <index>0</index>" +
        "</com.hs.mail.imap.parser.CommandParser>";
        com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
        String returnedXML = 
        "<boolean>false</boolean>";
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = 
        "<object-array>" +
        "  <char>3</char>" +
        "</object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.list_wildcard(paramObject1));
    }

    @Test
    public void testText_char1() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>23</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-recei</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>i</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char2() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>29</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@lo</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>o</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char3() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>31</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@loca</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>a</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char4() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>30</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@loc</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>c</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char5() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>27</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>@</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char6() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>35</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@localhos</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>s</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char7() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>25</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receive</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char8() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>41</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"65</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>5</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char9() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>22</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-rece</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char10() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>31</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@loca</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>a</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char11() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>24</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiv</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>v</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char12() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>19</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-r</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>r</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char13() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>46</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"654321\"</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>\"</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char14() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>28</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@l</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>l</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char15() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>43</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"6543</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>3</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char16() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>16</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"tes</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>s</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char17() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>22</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-rece</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char18() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>18</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>-</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char19() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>32</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@local</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>l</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char20() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>25</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receive</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char21() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>44</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"65432</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>2</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char22() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>26</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>r</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char23() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>23</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-recei</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>i</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char24() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>26</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>r</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char25() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>17</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>t</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char26() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>17</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>t</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char27() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>28</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@l</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>l</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char28() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>30</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@loc</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>c</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char29() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>20</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-re</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char30() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>18</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>-</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char31() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>34</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@localho</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>o</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char32() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>24</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiv</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>v</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char33() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>15</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"te</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char34() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>37</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@localhost\"</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>\"</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char35() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>29</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@lo</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>o</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char36() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>32</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@local</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>l</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char37() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>19</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-r</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>r</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char38() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>42</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"654</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>4</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char39() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>27</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>@</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char40() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>45</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"654321</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>1</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char41() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>40</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"6</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>QUOTED</type>" +
            "      <value>test-receiver@localhost</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>6</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char42() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>21</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-rec</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>c</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char43() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>15</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"te</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char44() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>21</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-rec</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>c</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char45() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>NOPG1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"t</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>NOPG1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>t</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char46() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>14</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"t</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>t</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char47() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>33</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@localh</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>h</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char48() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>16</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"tes</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>s</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char49() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>20</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-re</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>e</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testText_char50() {
        try {
            String receivingXML = 
            "<com.hs.mail.imap.parser.CommandParser>" +
            "  <reader>" +
            "    <lock class=\"java.io.StringReader\" reference=\"..\"/>" +
            "    <str>HEPN1 LOGIN \"test-receiver@localhost\" \"654321\"" +
            "</str>" +
            "    <length>47</length>" +
            "    <next>36</next>" +
            "    <mark>0</mark>" +
            "  </reader>" +
            "  <pushback>\"GOL&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;&#x0;</pushback>" +
            "  <buffer>\"test-receiver@localhost</buffer>" +
            "  <pos>-1</pos>" +
            "  <tokens>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>TAG</type>" +
            "      <value>HEPN1</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "    <com.hs.mail.imap.parser.Token>" +
            "      <type>KEYWORD</type>" +
            "      <value>LOGIN</value>" +
            "    </com.hs.mail.imap.parser.Token>" +
            "  </tokens>" +
            "  <index>0</index>" +
            "</com.hs.mail.imap.parser.CommandParser>";
            com.hs.mail.imap.parser.CommandParser receivingObject = (com.hs.mail.imap.parser.CommandParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<boolean>true</boolean>";
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char>t</char>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char paramObject1 = (Character) paramObjects[0];
            Class Clazz = Class.forName("com.hs.mail.imap.parser.AbstractImapCommandParser");
            Method text_char = Clazz.getDeclaredMethod("text_char", char.class);
            text_char.setAccessible(true);
            Assert.assertEquals(returnedObject, text_char.invoke(receivingObject, paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}