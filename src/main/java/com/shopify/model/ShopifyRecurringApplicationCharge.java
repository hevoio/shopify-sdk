package com.shopify.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shopify.model.adapters.DateTimeAdapter;
import com.shopify.model.adapters.EscapedStringAdapter;
import org.joda.time.DateTime;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyRecurringApplicationCharge {

	private String id;
	@XmlElement(name = "api_client_id")
	private String apiClientId;
	private String name;
	private String terms;
	private BigDecimal price;
	@XmlElement(name = "capped_amount")
	private BigDecimal cappedAmount;
	private String status;
	@XmlElement(name = "return_url")
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String returnUrl;
	@XmlElement(name = "confirmation_url")
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String confirmationUrl;
	@XmlElement(name = "trial_days")
	private int trialDays;
	@XmlElement(name = "trial_end_on")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime trialEndsOn;
	@XmlElement(name = "activated_on")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime activatedOn;
	@XmlElement(name = "billing_on")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime billingOn;
	@XmlElement(name = "cancelled_on")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime cancelledOn;
	@XmlElement(name = "created_at")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime createdAt;
	@XmlElement(name = "updated_on")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime updatedAt;
	@XmlElement(name = "decorated_return_url")
	private String decoratedReturnUrl;
	private Boolean test;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApiClientId() {
		return apiClientId;
	}

	public void setApiClientId(String apiClientId) {
		this.apiClientId = apiClientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCappedAmount() {
		return cappedAmount;
	}

	public void setCappedAmount(BigDecimal cappedAmount) {
		this.cappedAmount = cappedAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getConfirmationUrl() {
		return confirmationUrl;
	}

	public void setConfirmationUrl(String confirmationUrl) {
		this.confirmationUrl = confirmationUrl;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public DateTime getTrialEndsOn() {
		return trialEndsOn;
	}

	public void setTrialEndsOn(DateTime trialEndsOn) {
		this.trialEndsOn = trialEndsOn;
	}

	public DateTime getActivatedOn() {
		return activatedOn;
	}

	public void setActivatedOn(DateTime activatedOn) {
		this.activatedOn = activatedOn;
	}

	public DateTime getBillingOn() {
		return billingOn;
	}

	public void setBillingOn(DateTime billingOn) {
		this.billingOn = billingOn;
	}

	public DateTime getCancelledOn() {
		return cancelledOn;
	}

	public void setCancelledOn(DateTime cancelledOn) {
		this.cancelledOn = cancelledOn;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean isTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public String getDecoratedReturnUrl() {
		return decoratedReturnUrl;
	}

	public void setDecoratedReturnUrl(String decoratedReturnUrl) {
		this.decoratedReturnUrl = decoratedReturnUrl;
	}
}
