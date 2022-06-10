package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyTaxLine {

	private String title;
	private BigDecimal price;
	private BigDecimal rate;
	@XmlElement(name = "price_set")
	private PriceSet priceSet;

	private Long position;
	private String source;
	@XmlElement(name = "compare_at")
	private BigDecimal compareAt;
	private String zone;
	@XmlElement(name = "channel_liable")
	private String channelLiable;

}
