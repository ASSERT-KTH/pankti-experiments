package org.broadleafcommerce.core.order.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestOrderImplPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testFinalizeItemPrices1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testFinalizeItemPrices2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.finalizeItemPrices2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.finalizeItemPrices());
    }

    @Test
    public void testGetHasOrderAdjustments1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments1-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }

    @Test
    public void testGetHasOrderAdjustments2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.order.domain.OrderImpl.getHasOrderAdjustments2-receiving.xml").getFile());
        Scanner scannerReceiving = new Scanner(fileReceiving);
        String receivingObjectStr = scannerReceiving.useDelimiter("\\A").next();
        org.broadleafcommerce.core.order.domain.OrderImpl receivingObject = (org.broadleafcommerce.core.order.domain.OrderImpl) xStream.fromXML(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.getHasOrderAdjustments());
    }
}