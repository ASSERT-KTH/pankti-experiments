package org.broadleafcommerce.core.catalog.service.dynamic;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestDynamicSkuPricesPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetPrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>6.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = (org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>6.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = (org.broadleafcommerce.common.money.Money) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }
}