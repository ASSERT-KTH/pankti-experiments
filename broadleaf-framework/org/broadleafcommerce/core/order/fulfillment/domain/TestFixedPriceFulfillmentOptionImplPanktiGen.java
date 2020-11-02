package org.broadleafcommerce.core.order.fulfillment.domain;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestFixedPriceFulfillmentOptionImplPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetPrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.order.fulfillment.domain.FixedPriceFulfillmentOptionImpl>" +
        "  <id>3</id>" +
        "  <name>Express</name>" +
        "  <longDescription>1 - 2 Days</longDescription>" +
        "  <useFlatRates>false</useFlatRates>" +
        "  <fulfillmentType>PHYSICAL_SHIP</fulfillmentType>" +
        "  <price>20.00000</price>" +
        "</org.broadleafcommerce.core.order.fulfillment.domain.FixedPriceFulfillmentOptionImpl>";
        org.broadleafcommerce.core.order.fulfillment.domain.FixedPriceFulfillmentOptionImpl receivingObject = (org.broadleafcommerce.core.order.fulfillment.domain.FixedPriceFulfillmentOptionImpl) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>20.0</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = (org.broadleafcommerce.common.money.Money) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }
}