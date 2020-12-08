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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RejectItemsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class RejectItemsRequest {
  public static final String SERIALIZED_NAME_IS_USER_ACTION = "isUserAction";
  @SerializedName(SERIALIZED_NAME_IS_USER_ACTION)
  private Boolean isUserAction;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<RejectItem> items = null;

  public RejectItemsRequest isUserAction(Boolean isUserAction) {
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

  public RejectItemsRequest items(List<RejectItem> items) {
    this.items = items;
    return this;
  }

  public RejectItemsRequest addItemsItem(RejectItem itemsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectItemsRequest rejectItemsRequest = (RejectItemsRequest) o;
    return Objects.equals(this.isUserAction, rejectItemsRequest.isUserAction) &&
        Objects.equals(this.items, rejectItemsRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUserAction, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectItemsRequest {\n");
    
    sb.append("    isUserAction: ").append(toIndentedString(isUserAction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

