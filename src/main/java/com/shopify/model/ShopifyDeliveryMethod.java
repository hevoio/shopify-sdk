package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyDeliveryMethod {

    @XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "method_type")
    private String methodType;

    @XmlElement(name = "min_delivery_date_time")
    private String minDeliveryDateTime;

    @XmlElement(name = "max_delivery_date_time")
    private String maxDeliveryDateTime;

}
