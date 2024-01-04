package com.shaded.shopify.model.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.shaded.shopify.model.InventoryPolicy;

public class InventoryPolicyAdapter extends XmlAdapter<String, InventoryPolicy> {

	@Override
	public InventoryPolicy unmarshal(final String inventoryPolicy) throws Exception {
		return InventoryPolicy.toEnum(inventoryPolicy);
	}

	@Override
	public String marshal(final InventoryPolicy inventoryManagement) throws Exception {
		return inventoryManagement.toString();
	}

}
