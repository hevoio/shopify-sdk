package com.shaded.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyAttribute {

	private String name;
	@JsonDeserialize(using = ShopifyAttributeDeserializer.class)
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static class ShopifyAttributeDeserializer extends JsonDeserializer<String> {

		@Override
		public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
			ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
			JsonNode jsonNode = mapper.readTree(jsonParser);
			return mapper.writeValueAsString(jsonNode);
		}
	}
}
