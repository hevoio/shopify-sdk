package com.shopify.model;

import java.util.List;

public class ShopifyLocationResponse {
    private List<ShopifyLocation> locations;
    private String nextPageToken;
    public ShopifyLocationResponse(List<ShopifyLocation> locations, String nextPageToken) {
        this.locations = locations;
        this.nextPageToken = nextPageToken;
    }
    public List<ShopifyLocation> getLocations() {
        return this.locations;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }
}
