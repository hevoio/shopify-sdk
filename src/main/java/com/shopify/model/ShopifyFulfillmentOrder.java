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
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillmentOrder {
    @XmlElement(name = "assigned_location_id")
    private String assignedLocationId;
    private ShopifyAddress destination;
    private String id;
    @XmlElement(name = "line_items")
    private List<ShopifyFulfillmentLineItem> lineItems;
    @XmlElement(name = "order_id")
    private String orderId;
    @XmlElement(name = "request_status")
    private String requestStatus;
    @XmlElement(name = "shop_id")
    private String shopId;
    private String status;
    @XmlElement(name = "supported_actions")
    private List<String> supportedActions;
    @XmlElement(name = "assigned_location")
    private ShopifyAddress assignedLocation;
    @XmlElement(name = "merchant_requests")
    private List<MerchantRequest> merchantRequests;
    @XmlElement(name = "delivery_method")
    private ShopifyDeliveryMethod deliveryMethod;
    @XmlElement(name = "fulfill_by")
    private String fulfillBy;
    @XmlElement(name = "fulfill_at")
    private String fulfillAt;
    @XmlElement(name = "fulfillment_holds")
    private List<FulfillmentHolds> fulfillmentHolds;
    @XmlElement(name = "include_financial_summaries")
    private boolean includeFinancialSummaries;
    @XmlElement(name = "include_order_reference_fields")
    private boolean includeOrderReferenceFields;
    @XmlElement(name = "international_duties")
    private InternationalDuties internationalDuties;
    @XmlElement(name = "presented_name")
    private String presentedName;
    @XmlElement(name = "created_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime createdAt;
    @XmlElement(name = "updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime updatedAt;
}
