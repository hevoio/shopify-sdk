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
public class CurrentTotalAdditionalFeesSet {
    @XmlElement(name = "shop_money")
    ShopMoney shopMoney;

    @XmlElement(name = "presentment_money")
    PresentmentMoney presentmentMoney;
}
