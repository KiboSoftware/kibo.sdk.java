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
import com.kibocommerce.sdk.fulfillment.model.RejectItem;
import com.kibocommerce.sdk.fulfillment.model.RejectedReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RejectShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class RejectShipment {
  public static final String SERIALIZED_NAME_BLOCK_ASSIGNMENT = "blockAssignment";
  @SerializedName(SERIALIZED_NAME_BLOCK_ASSIGNMENT)
  private Boolean blockAssignment;

  public static final String SERIALIZED_NAME_IS_USER_ACTION = "isUserAction";
  @SerializedName(SERIALIZED_NAME_IS_USER_ACTION)
  private Boolean isUserAction;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<RejectItem> items = null;

  public static final String SERIALIZED_NAME_REJECTED_REASON = "rejectedReason";
  @SerializedName(SERIALIZED_NAME_REJECTED_REASON)
  private RejectedReason rejectedReason = null;

  public RejectShipment blockAssignment(Boolean blockAssignment) {
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

  public RejectShipment isUserAction(Boolean isUserAction) {
    this.isUserAction = isUserAction;
    return this;
  }

   /**
   * Get isUserAction
   * @return isUserAction
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsUserAction() {
    return isUserAction;
  }

  public void setIsUserAction(Boolean isUserAction) {
    this.isUserAction = isUserAction;
  }

  public RejectShipment items(List<RejectItem> items) {
    this.items = items;
    return this;
  }

  public RejectShipment addItemsItem(RejectItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<RejectItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<RejectItem> getItems() {
    return items;
  }

  public void setItems(List<RejectItem> items) {
    this.items = items;
  }

  public RejectShipment rejectedReason(RejectedReason rejectedReason) {
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
    RejectShipment rejectShipment = (RejectShipment) o;
    return Objects.equals(this.blockAssignment, rejectShipment.blockAssignment) &&
        Objects.equals(this.isUserAction, rejectShipment.isUserAction) &&
        Objects.equals(this.items, rejectShipment.items) &&
        Objects.equals(this.rejectedReason, rejectShipment.rejectedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockAssignment, isUserAction, items, rejectedReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectShipment {\n");
    
    sb.append("    blockAssignment: ").append(toIndentedString(blockAssignment)).append("\n");
    sb.append("    isUserAction: ").append(toIndentedString(isUserAction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

