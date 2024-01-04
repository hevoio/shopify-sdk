package com.shaded.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class ShopifyAbandonedCheckoutsRoot {
    public List<ShopifyAbandonedCheckout> getCheckouts() {
        return checkouts;
    }

    public void setCheckouts(List<ShopifyAbandonedCheckout> checkouts) {
        this.checkouts = checkouts;
    }

    private List<ShopifyAbandonedCheckout> checkouts = new LinkedList<>();
}
