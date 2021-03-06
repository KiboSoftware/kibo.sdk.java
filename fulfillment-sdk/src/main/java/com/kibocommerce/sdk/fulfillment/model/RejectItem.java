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
import com.kibocommerce.sdk.fulfillment.model.RejectedReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RejectItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class RejectItem {
  public static final String SERIALIZED_NAME_BLOCK_ASSIGNMENT = "blockAssignment";
  @SerializedName(SERIALIZED_NAME_BLOCK_ASSIGNMENT)
  private Boolean blockAssignment;

  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private Integer lineId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REJECTED_REASON = "rejectedReason";
  @SerializedName(SERIALIZED_NAME_REJECTED_REASON)
  private RejectedReason rejectedReason = null;

  public RejectItem blockAssignment(Boolean blockAssignment) {
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

  public RejectItem lineId(Integer lineId) {
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

  public RejectItem quantity(Integer quantity) {
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

  public RejectItem rejectedReason(RejectedReason rejectedReason) {
    this.rejectedReason = rejectedReason;
    return this;
  }

   /**
   * Get rejectedReason
   * @return rejectedReason
  **/
  @ApiModelProperty(value = "")
  public RejectedReason getRejectedReason() {
    return rejectedReason;
  }

  public void setRejectedReason(RejectedReason rejectedReason) {
    this.rejectedReason = rejectedReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectItem rejectItem = (RejectItem) o;
    return Objects.equals(this.blockAssignment, rejectItem.blockAssignment) &&
        Objects.equals(this.lineId, rejectItem.lineId) &&
        Objects.equals(this.quantity, rejectItem.quantity) &&
        Objects.equals(this.rejectedReason, rejectItem.rejectedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockAssignment, lineId, quantity, rejectedReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectItem {\n");
    
    sb.append("    blockAssignment: ").append(toIndentedString(blockAssignment)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rejectedReason: ").append(toIndentedString(rejectedReason)).append("\n");
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

