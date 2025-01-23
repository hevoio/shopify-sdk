package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shopify.model.adapters.DateTimeAdapter;
import lombok.Data;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailMarketingConsent {

    private String state;

    @XmlElement(name = "opt_in_level")
    private String optInLevel;

    @XmlElement(name = "consent_updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime consentUpdatedAt;

}
