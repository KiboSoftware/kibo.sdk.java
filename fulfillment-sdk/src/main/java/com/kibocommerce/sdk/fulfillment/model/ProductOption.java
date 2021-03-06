/*
 * Kibo Fulfillment API - Production Profile
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProductOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class ProductOption {
  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHOPPER_ENTERED_VALUE = "shopperEnteredValue";
  @SerializedName(SERIALIZED_NAME_SHOPPER_ENTERED_VALUE)
  private Object shopperEnteredValue = null;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public ProductOption attributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * Get attributeFQN
   * @return attributeFQN
  **/
  @ApiModelProperty(value = "")
  public String getAttributeFQN() {
    return attributeFQN;
  }

  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }

  public ProductOption attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProductOption putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public ProductOption dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public ProductOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOption shopperEnteredValue(Object shopperEnteredValue) {
    this.shopperEnteredValue = shopperEnteredValue;
    return this;
  }

   /**
   * Get shopperEnteredValue
   * @return shopperEnteredValue
  **/
  @ApiModelProperty(value = "")
  public Object getShopperEnteredValue() {
    return shopperEnteredValue;
  }

  public void setShopperEnteredValue(Object shopperEnteredValue) {
    this.shopperEnteredValue = shopperEnteredValue;
  }

  public ProductOption stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @ApiModelProperty(value = "")
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public ProductOption value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOption productOption = (ProductOption) o;
    return Objects.equals(this.attributeFQN, productOption.attributeFQN) &&
        Objects.equals(this.attributes, productOption.attributes) &&
        Objects.equals(this.dataType, productOption.dataType) &&
        Objects.equals(this.name, productOption.name) &&
        Objects.equals(this.shopperEnteredValue, productOption.shopperEnteredValue) &&
        Objects.equals(this.stringValue, productOption.stringValue) &&
        Objects.equals(this.value, productOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeFQN, attributes, dataType, name, shopperEnteredValue, stringValue, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOption {\n");
    
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shopperEnteredValue: ").append(toIndentedString(shopperEnteredValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

