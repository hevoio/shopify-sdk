package com.shopify.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

import com.shopify.model.adapters.DateTimeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyCustomer {

	private String id;
	private String email;
	@XmlElement(name = "created_at")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime createdAt;
	@XmlElement(name = "updated_at")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime updatedAt;
	@XmlElement(name = "first_name")
	private String firstName;
	@XmlElement(name = "last_name")
	private String lastname;
	private String phone;
	@XmlElement(name = "orders_count")
	private long ordersCount;
	private String state;
	@XmlElement(name = "total_spent")
	private BigDecimal totalSpent;
	private String note;
	private Metafield metafield;
	private List<CustomerAddress> addresses;
	@XmlElement(name = "default_address")
	private CustomerAddress defaultAddress;

	private Currency currency;
	@XmlElement(name = "multipass_identifier")
	private String multipassIdentifier;
	private String tags;
	@XmlElement(name = "tax_exempt")
	private boolean taxExempt;
	@XmlElement(name = "tax_exemptions")
	private List<String> taxExemptions;
	@XmlElement(name = "verified_email")
	private boolean verifiedEmail;
	@XmlElement(name = "last_order_id")
	private String lastOrderId;
	@XmlElement(name = "last_order_name")
	private String lastOrderName;
	@XmlElement(name = "admin_graphql_api_id")
	private String adminGraphqlApiId;

	@XmlElement(name = "sms_marketing_consent")
	private Map<String, Object> smsMarketingConsent;

	@XmlElement(name = "email_marketing_consent")
	private EmailMarketingConsent emailMarketingConsent;

	public String getLastOrderId() {
		return lastOrderId;
	}

	public void setLastOrderId(String lastOrderId) {
		this.lastOrderId = lastOrderId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public boolean getVerifiedEmail() {
		return verifiedEmail;
	}

	public void setVerifiedEmail(boolean verifiedEmail) {
		this.verifiedEmail = verifiedEmail;
	}

	public List<String> getTaxExemptions() {
		return this.taxExemptions;
	}

	public void setTaxExemptions(final List<String> taxExemptions) {
		this.taxExemptions = taxExemptions;
	}

	public boolean getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	public String getMultipassIdentifier() {
		return multipassIdentifier;
	}

	public void setMultipassIdentifier(String multipassIdentifier) {
		this.multipassIdentifier = multipassIdentifier;
	}

	public String getLastOrderName() {
		return lastOrderName;
	}

	public void setLastOrderName(String lastOrderName) {
		this.lastOrderName = lastOrderName;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerAddress getDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(CustomerAddress email) {
		this.defaultAddress = defaultAddress;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(BigDecimal totalSpent) {
		this.totalSpent = totalSpent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Metafield getMetafield() {
		return metafield;
	}

	public void setMetafield(final Metafield metafield) {
		this.metafield = metafield;
	}

	public void setCustomerAddresses(final List<CustomerAddress> addresses) {
		this.addresses = addresses;
	}

	public List<CustomerAddress> getCustomerAddresses() {
		return addresses;
	}

	public String getAdminGraphqlApiId() {
		return adminGraphqlApiId;
	}

	public void setAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public List<CustomerAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<CustomerAddress> addresses) {
		this.addresses = addresses;
	}

	public boolean isTaxExempt() {
		return taxExempt;
	}

	public boolean isVerifiedEmail() {
		return verifiedEmail;
	}

	public Map<String, Object> getSmsMarketingConsent() {
		return smsMarketingConsent;
	}

	public void setSmsMarketingConsent(Map<String, Object> smsMarketingConsent) {
		this.smsMarketingConsent = smsMarketingConsent;
	}

	public EmailMarketingConsent getEmailMarketingConsent() {
		return emailMarketingConsent;
	}

	public void setEmailMarketingConsent(EmailMarketingConsent emailMarketingConsent) {
		this.emailMarketingConsent = emailMarketingConsent;
	}
}
