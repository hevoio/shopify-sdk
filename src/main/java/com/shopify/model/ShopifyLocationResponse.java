package com.shopify.model;

import java.util.List;

public class ShopifyLocationResponse {
    private List<ShopifyLocation> locations;
    private String nextPageLink;
    public ShopifyLocationResponse(List<ShopifyLocation> locations, String nextPageLink) {
        this.locations = locations;
        this.nextPageLink = nextPageLink;

    }
    public List<ShopifyLocation> getLocations() {
        return this.locations;
    }
    public String getNextPageLink() {
        return this.nextPageLink;
    }
}
