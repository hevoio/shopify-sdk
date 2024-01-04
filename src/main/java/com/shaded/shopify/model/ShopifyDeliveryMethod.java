package com.shaded.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyDeliveryMethod {
    @XmlElement(name = "id")
    private Long id;
    @XmlElement(name = "method_type")
    private String method_type;
    @XmlElement(name = "min_delivery_date_time")
    private String min_delivery_date_time;
    @XmlElement(name = "max_delivery_date_time")
    private String max_delivery_date_time;
}
