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


package com.kibocommerce.kibo.sdk.java.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.kibo.sdk.java.inventory.model.WaveItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A shipment (used in getting wave suggestions)
 */
@ApiModel(description = "A shipment (used in getting wave suggestions)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-22T23:27:35.732-05:00[America/Chicago]")
public class WaveShipment {
  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private Integer orderID;

  public static final String SERIALIZED_NAME_SHIPMENT_I_D = "shipmentID";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_I_D)
  private Integer shipmentID;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<WaveItem> items = new ArrayList<WaveItem>();

  public WaveShipment orderID(Integer orderID) {
    this.orderID = orderID;
    return this;
  }

   /**
   * Order Identifier
   * @return orderID
  **/
  @ApiModelProperty(required = true, value = "Order Identifier")
  public Integer getOrderID() {
    return orderID;
  }

  public void setOrderID(Integer orderID) {
    this.orderID = orderID;
  }

  public WaveShipment shipmentID(Integer shipmentID) {
    this.shipmentID = shipmentID;
    return this;
  }

   /**
   * Shipment Identifier
   * @return shipmentID
  **/
  @ApiModelProperty(required = true, value = "Shipment Identifier")
  public Integer getShipmentID() {
    return shipmentID;
  }

  public void setShipmentID(Integer shipmentID) {
    this.shipmentID = shipmentID;
  }

  public WaveShipment items(List<WaveItem> items) {
    this.items = items;
    return this;
  }

  public WaveShipment addItemsItem(WaveItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of Items in the shipment
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of Items in the shipment")
  public List<WaveItem> getItems() {
    return items;
  }

  public void setItems(List<WaveItem> items) {
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
    WaveShipment waveShipment = (WaveShipment) o;
    return Objects.equals(this.orderID, waveShipment.orderID) &&
        Objects.equals(this.shipmentID, waveShipment.shipmentID) &&
        Objects.equals(this.items, waveShipment.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, shipmentID, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaveShipment {\n");
    
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    shipmentID: ").append(toIndentedString(shipmentID)).append("\n");
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

