package com.shopify.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class ShopifyShippingZonesRoot {

    @XmlElement(name = "shipping_zones")
    private List<ShopifyShippingZone> shippingZones = new LinkedList<>();

    public List<ShopifyShippingZone> getShippingZones() {
        return shippingZones;
    }

    public void setShippingZones(List<ShopifyShippingZone> shippingZones) {
        this.shippingZones = shippingZones;
    }
}
