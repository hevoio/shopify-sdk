package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyAccessScope {
    @XmlElement(name = "access_scopes")
    private List<AccessScope> accessScopes;

    public List<AccessScope> getAccessScopes() {
        return accessScopes;
    }

    public void setAccessScopes(List<AccessScope> accessScopes) {
        this.accessScopes = accessScopes;
    }
}
