package org.apache.pdfbox.pdmodel.graphics.state;
import com.thoughtworks.xstream.XStream;
import java.lang.reflect.Method;
import org.junit.Assert;
import org.junit.Test;
public class TestPDExtendedGraphicsStatePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testDefaultIfNull1() {
        try {
            String receivingXML = "<org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState><dict><direct>false</direct><needToBeUpdated>false</needToBeUpdated><items class=\"org.apache.pdfbox.util.SmallMap\"><mapArr><org.apache.pdfbox.cos.COSName><direct>false</direct><name>BM</name><hashCode>2123</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSName><direct>true</direct><name>Normal</name><hashCode>-1955878649</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSName><direct>false</direct><name>ca</name><hashCode>3166</hashCode></org.apache.pdfbox.cos.COSName><org.apache.pdfbox.cos.COSInteger><direct>true</direct><value>1</value></org.apache.pdfbox.cos.COSInteger></mapArr></items></dict></org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState>";
            PDExtendedGraphicsState receivingObject = (PDExtendedGraphicsState) xStream.fromXML(receivingXML);
            String returnedXML = "<float>1.0</float>";
            float returnedObject = (Float) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><float>1.0</float><float>1.0</float></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            Float paramObject1 = (Float) paramObjects[0];
            float paramObject2 = (Float) paramObjects[1];
            Class Clazz = Class.forName("org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState");
            Method defaultIfNull = Clazz.getDeclaredMethod("defaultIfNull", Float.class, float.class);
            defaultIfNull.setAccessible(true);
            Assert.assertEquals(returnedObject, defaultIfNull.invoke(receivingObject, paramObject1, paramObject2));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}