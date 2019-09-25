/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.model.BaseRequest;
import com.kibocommerce.sdk.inventory.model.Item;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderItemInformationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:19:08.239507-05:00[America/Chicago]")
public class OrderItemInformationRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private Integer orderID;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public OrderItemInformationRequest orderID(Integer orderID) {
    this.orderID = orderID;
    return this;
  }

   /**
   * Order Identifier
   * @return orderID
  **/
  @ApiModelProperty(value = "Order Identifier")
  public Integer getOrderID() {
    return orderID;
  }

  public void setOrderID(Integer orderID) {
    this.orderID = orderID;
  }

  public OrderItemInformationRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  public OrderItemInformationRequest addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Item>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of Items to search on
   * @return items
  **/
  @ApiModelProperty(value = "List of Items to search on")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
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
    OrderItemInformationRequest orderItemInformationRequest = (OrderItemInformationRequest) o;
    return Objects.equals(this.orderID, orderItemInformationRequest.orderID) &&
        Objects.equals(this.items, orderItemInformationRequest.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemInformationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
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

