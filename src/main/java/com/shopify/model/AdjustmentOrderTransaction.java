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
public class AdjustmentOrderTransaction {
    @XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "amount")
    private String amount;

    @XmlElement(name = "order")
    private OrderDetails orderDetails;
    String fee;
    String net;
}
