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
import com.kibocommerce.sdk.fulfillment.model.ReassignedReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReassignItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-31T10:37:23.152728-05:00[America/Chicago]")
public class ReassignItem {
  public static final String SERIALIZED_NAME_BLOCK_ASSIGNMENT = "blockAssignment";
  @SerializedName(SERIALIZED_NAME_BLOCK_ASSIGNMENT)
  private Boolean blockAssignment;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private Integer lineId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REASSIGNED_REASON = "reassignedReason";
  @SerializedName(SERIALIZED_NAME_REASSIGNED_REASON)
  private ReassignedReason reassignedReason = null;

  public ReassignItem blockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
    return this;
  }

   /**
   * Get blockAssignment
   * @return blockAssignment
  **/
  @ApiModelProperty(value = "")
  public Boolean getBlockAssignment() {
    return blockAssignment;
  }

  public void setBlockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
  }

  public ReassignItem fulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @ApiModelProperty(value = "")
  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }

  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }

  public ReassignItem lineId(Integer lineId) {
    this.lineId = lineId;
    return this;
  }

   /**
   * Get lineId
   * @return lineId
  **/
  @ApiModelProperty(value = "")
  public Integer getLineId() {
    return lineId;
  }

  public void setLineId(Integer lineId) {
    this.lineId = lineId;
  }

  public ReassignItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ReassignItem reassignedReason(ReassignedReason reassignedReason) {
    this.reassignedReason = reassignedReason;
    return this;
  }

   /**
   * Get reassignedReason
   * @return reassignedReason
  **/
  @ApiModelProperty(value = "")
  public ReassignedReason getReassignedReason() {
    return reassignedReason;
  }

  public void setReassignedReason(ReassignedReason reassignedReason) {
    this.reassignedReason = reassignedReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReassignItem reassignItem = (ReassignItem) o;
    return Objects.equals(this.blockAssignment, reassignItem.blockAssignment) &&
        Objects.equals(this.fulfillmentLocationCode, reassignItem.fulfillmentLocationCode) &&
        Objects.equals(this.lineId, reassignItem.lineId) &&
        Objects.equals(this.quantity, reassignItem.quantity) &&
        Objects.equals(this.reassignedReason, reassignItem.reassignedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockAssignment, fulfillmentLocationCode, lineId, quantity, reassignedReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignItem {\n");
    
    sb.append("    blockAssignment: ").append(toIndentedString(blockAssignment)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    reassignedReason: ").append(toIndentedString(reassignedReason)).append("\n");
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

