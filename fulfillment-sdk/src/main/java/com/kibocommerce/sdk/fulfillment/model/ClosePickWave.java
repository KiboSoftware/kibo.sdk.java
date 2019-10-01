/*
 * Kibo Fulfillment API
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
import com.kibocommerce.sdk.fulfillment.model.BinShipmentProductQuantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClosePickWave
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-01T15:17:07.337463-05:00[America/Chicago]")
public class ClosePickWave {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CREATE_RECOVERY = "createRecovery";
  @SerializedName(SERIALIZED_NAME_CREATE_RECOVERY)
  private Boolean createRecovery;

  public static final String SERIALIZED_NAME_QUANTITIES = "quantities";
  @SerializedName(SERIALIZED_NAME_QUANTITIES)
  private List<BinShipmentProductQuantity> quantities = null;

  public ClosePickWave attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ClosePickWave putAttributesItem(String key, Object attributesItem) {
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

  public ClosePickWave createRecovery(Boolean createRecovery) {
    this.createRecovery = createRecovery;
    return this;
  }

   /**
   * Get createRecovery
   * @return createRecovery
  **/
  @ApiModelProperty(value = "")
  public Boolean getCreateRecovery() {
    return createRecovery;
  }

  public void setCreateRecovery(Boolean createRecovery) {
    this.createRecovery = createRecovery;
  }

  public ClosePickWave quantities(List<BinShipmentProductQuantity> quantities) {
    this.quantities = quantities;
    return this;
  }

  public ClosePickWave addQuantitiesItem(BinShipmentProductQuantity quantitiesItem) {
    if (this.quantities == null) {
      this.quantities = new ArrayList<BinShipmentProductQuantity>();
    }
    this.quantities.add(quantitiesItem);
    return this;
  }

   /**
   * Get quantities
   * @return quantities
  **/
  @ApiModelProperty(value = "")
  public List<BinShipmentProductQuantity> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<BinShipmentProductQuantity> quantities) {
    this.quantities = quantities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClosePickWave closePickWave = (ClosePickWave) o;
    return Objects.equals(this.attributes, closePickWave.attributes) &&
        Objects.equals(this.createRecovery, closePickWave.createRecovery) &&
        Objects.equals(this.quantities, closePickWave.quantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, createRecovery, quantities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClosePickWave {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createRecovery: ").append(toIndentedString(createRecovery)).append("\n");
    sb.append("    quantities: ").append(toIndentedString(quantities)).append("\n");
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

