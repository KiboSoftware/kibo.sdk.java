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
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import com.kibocommerce.sdk.inventory.model.OrderItemInformationEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderItemInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:31:58.472-05:00[America/Chicago]")
public class OrderItemInformation extends BaseResponse {
  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private Integer orderID;

  public static final String SERIALIZED_NAME_ORDER_ITEM_I_D = "orderItemID";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_I_D)
  private Integer orderItemID;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Integer locationID;

  public static final String SERIALIZED_NAME_LOCATION_ACTIVE = "locationActive";
  @SerializedName(SERIALIZED_NAME_LOCATION_ACTIVE)
  private Boolean locationActive;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private Integer locationCode;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_LTD = "ltd";
  @SerializedName(SERIALIZED_NAME_LTD)
  private String ltd;

  public static final String SERIALIZED_NAME_FLOOR = "floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private Integer floor;

  public static final String SERIALIZED_NAME_SAFETY_STOCK = "safetyStock";
  @SerializedName(SERIALIZED_NAME_SAFETY_STOCK)
  private Integer safetyStock;

  public static final String SERIALIZED_NAME_ON_HAND = "onHand";
  @SerializedName(SERIALIZED_NAME_ON_HAND)
  private Integer onHand;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private Integer allocated;

  public static final String SERIALIZED_NAME_ALLOCATES = "allocates";
  @SerializedName(SERIALIZED_NAME_ALLOCATES)
  private Integer allocates;

  public static final String SERIALIZED_NAME_DEALLOCATES = "deallocates";
  @SerializedName(SERIALIZED_NAME_DEALLOCATES)
  private Integer deallocates;

  public static final String SERIALIZED_NAME_FULFILLS = "fulfills";
  @SerializedName(SERIALIZED_NAME_FULFILLS)
  private Integer fulfills;

  public static final String SERIALIZED_NAME_PICKS = "picks";
  @SerializedName(SERIALIZED_NAME_PICKS)
  private Integer picks;

  public static final String SERIALIZED_NAME_PENDING_QUANTITY = "pendingQuantity";
  @SerializedName(SERIALIZED_NAME_PENDING_QUANTITY)
  private Integer pendingQuantity;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<OrderItemInformationEvent> events = null;

  public OrderItemInformation orderID(Integer orderID) {
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

  public OrderItemInformation orderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
    return this;
  }

   /**
   * Order Item Identifier
   * @return orderItemID
  **/
  @ApiModelProperty(value = "Order Item Identifier")
  public Integer getOrderItemID() {
    return orderItemID;
  }

  public void setOrderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
  }

  public OrderItemInformation locationID(Integer locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Location Identifier
   * @return locationID
  **/
  @ApiModelProperty(value = "Location Identifier")
  public Integer getLocationID() {
    return locationID;
  }

  public void setLocationID(Integer locationID) {
    this.locationID = locationID;
  }

  public OrderItemInformation locationActive(Boolean locationActive) {
    this.locationActive = locationActive;
    return this;
  }

   /**
   * Flag for whether the location is active
   * @return locationActive
  **/
  @ApiModelProperty(value = "Flag for whether the location is active")
  public Boolean getLocationActive() {
    return locationActive;
  }

  public void setLocationActive(Boolean locationActive) {
    this.locationActive = locationActive;
  }

  public OrderItemInformation locationCode(Integer locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * External Store Identifier
   * @return locationCode
  **/
  @ApiModelProperty(value = "External Store Identifier")
  public Integer getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(Integer locationCode) {
    this.locationCode = locationCode;
  }

  public OrderItemInformation locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Location Name
   * @return locationName
  **/
  @ApiModelProperty(value = "Location Name")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public OrderItemInformation binID(Integer binID) {
    this.binID = binID;
    return this;
  }

   /**
   * Bin Identifier
   * @return binID
  **/
  @ApiModelProperty(value = "Bin Identifier")
  public Integer getBinID() {
    return binID;
  }

  public void setBinID(Integer binID) {
    this.binID = binID;
  }

  public OrderItemInformation partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Part/Product Number
   * @return partNumber
  **/
  @ApiModelProperty(value = "Part/Product Number")
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public OrderItemInformation upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * Universal Product Code
   * @return upc
  **/
  @ApiModelProperty(value = "Universal Product Code")
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public OrderItemInformation sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Stock Keeping Unit
   * @return sku
  **/
  @ApiModelProperty(value = "Stock Keeping Unit")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public OrderItemInformation ltd(String ltd) {
    this.ltd = ltd;
    return this;
  }

   /**
   * Custom field used for store prioritization
   * @return ltd
  **/
  @ApiModelProperty(value = "Custom field used for store prioritization")
  public String getLtd() {
    return ltd;
  }

  public void setLtd(String ltd) {
    this.ltd = ltd;
  }

  public OrderItemInformation floor(Integer floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Absolute minimum quantity of this item that should be in stock at any time
   * @return floor
  **/
  @ApiModelProperty(value = "Absolute minimum quantity of this item that should be in stock at any time")
  public Integer getFloor() {
    return floor;
  }

  public void setFloor(Integer floor) {
    this.floor = floor;
  }

  public OrderItemInformation safetyStock(Integer safetyStock) {
    this.safetyStock = safetyStock;
    return this;
  }

   /**
   * Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted
   * @return safetyStock
  **/
  @ApiModelProperty(value = "Quantity of this item the location wants to keep in stock to ensure stock isn't completely depleted")
  public Integer getSafetyStock() {
    return safetyStock;
  }

  public void setSafetyStock(Integer safetyStock) {
    this.safetyStock = safetyStock;
  }

  public OrderItemInformation onHand(Integer onHand) {
    this.onHand = onHand;
    return this;
  }

   /**
   * The quantity the location has in its possession
   * @return onHand
  **/
  @ApiModelProperty(value = "The quantity the location has in its possession")
  public Integer getOnHand() {
    return onHand;
  }

  public void setOnHand(Integer onHand) {
    this.onHand = onHand;
  }

  public OrderItemInformation available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * The quantity the location has that are available for purchase
   * @return available
  **/
  @ApiModelProperty(value = "The quantity the location has that are available for purchase")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public OrderItemInformation allocated(Integer allocated) {
    this.allocated = allocated;
    return this;
  }

   /**
   * The quantity the location has that are allocated
   * @return allocated
  **/
  @ApiModelProperty(value = "The quantity the location has that are allocated")
  public Integer getAllocated() {
    return allocated;
  }

  public void setAllocated(Integer allocated) {
    this.allocated = allocated;
  }

  public OrderItemInformation allocates(Integer allocates) {
    this.allocates = allocates;
    return this;
  }

   /**
   * Total number of allocations
   * @return allocates
  **/
  @ApiModelProperty(value = "Total number of allocations")
  public Integer getAllocates() {
    return allocates;
  }

  public void setAllocates(Integer allocates) {
    this.allocates = allocates;
  }

  public OrderItemInformation deallocates(Integer deallocates) {
    this.deallocates = deallocates;
    return this;
  }

   /**
   * Total number of deallocations
   * @return deallocates
  **/
  @ApiModelProperty(value = "Total number of deallocations")
  public Integer getDeallocates() {
    return deallocates;
  }

  public void setDeallocates(Integer deallocates) {
    this.deallocates = deallocates;
  }

  public OrderItemInformation fulfills(Integer fulfills) {
    this.fulfills = fulfills;
    return this;
  }

   /**
   * Total number of fulfillments. Should never be greater than 1.
   * @return fulfills
  **/
  @ApiModelProperty(value = "Total number of fulfillments. Should never be greater than 1.")
  public Integer getFulfills() {
    return fulfills;
  }

  public void setFulfills(Integer fulfills) {
    this.fulfills = fulfills;
  }

  public OrderItemInformation picks(Integer picks) {
    this.picks = picks;
    return this;
  }

   /**
   * Total number of picks (WMS only)
   * @return picks
  **/
  @ApiModelProperty(value = "Total number of picks (WMS only)")
  public Integer getPicks() {
    return picks;
  }

  public void setPicks(Integer picks) {
    this.picks = picks;
  }

  public OrderItemInformation pendingQuantity(Integer pendingQuantity) {
    this.pendingQuantity = pendingQuantity;
    return this;
  }

   /**
   * Pending quantity (WMS only)
   * @return pendingQuantity
  **/
  @ApiModelProperty(value = "Pending quantity (WMS only)")
  public Integer getPendingQuantity() {
    return pendingQuantity;
  }

  public void setPendingQuantity(Integer pendingQuantity) {
    this.pendingQuantity = pendingQuantity;
  }

  public OrderItemInformation events(List<OrderItemInformationEvent> events) {
    this.events = events;
    return this;
  }

  public OrderItemInformation addEventsItem(OrderItemInformationEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<OrderItemInformationEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Order Identifier
   * @return events
  **/
  @ApiModelProperty(value = "Order Identifier")
  public List<OrderItemInformationEvent> getEvents() {
    return events;
  }

  public void setEvents(List<OrderItemInformationEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemInformation orderItemInformation = (OrderItemInformation) o;
    return Objects.equals(this.orderID, orderItemInformation.orderID) &&
        Objects.equals(this.orderItemID, orderItemInformation.orderItemID) &&
        Objects.equals(this.locationID, orderItemInformation.locationID) &&
        Objects.equals(this.locationActive, orderItemInformation.locationActive) &&
        Objects.equals(this.locationCode, orderItemInformation.locationCode) &&
        Objects.equals(this.locationName, orderItemInformation.locationName) &&
        Objects.equals(this.binID, orderItemInformation.binID) &&
        Objects.equals(this.partNumber, orderItemInformation.partNumber) &&
        Objects.equals(this.upc, orderItemInformation.upc) &&
        Objects.equals(this.sku, orderItemInformation.sku) &&
        Objects.equals(this.ltd, orderItemInformation.ltd) &&
        Objects.equals(this.floor, orderItemInformation.floor) &&
        Objects.equals(this.safetyStock, orderItemInformation.safetyStock) &&
        Objects.equals(this.onHand, orderItemInformation.onHand) &&
        Objects.equals(this.available, orderItemInformation.available) &&
        Objects.equals(this.allocated, orderItemInformation.allocated) &&
        Objects.equals(this.allocates, orderItemInformation.allocates) &&
        Objects.equals(this.deallocates, orderItemInformation.deallocates) &&
        Objects.equals(this.fulfills, orderItemInformation.fulfills) &&
        Objects.equals(this.picks, orderItemInformation.picks) &&
        Objects.equals(this.pendingQuantity, orderItemInformation.pendingQuantity) &&
        Objects.equals(this.events, orderItemInformation.events) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, orderItemID, locationID, locationActive, locationCode, locationName, binID, partNumber, upc, sku, ltd, floor, safetyStock, onHand, available, allocated, allocates, deallocates, fulfills, picks, pendingQuantity, events, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemInformation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    orderItemID: ").append(toIndentedString(orderItemID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    locationActive: ").append(toIndentedString(locationActive)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    ltd: ").append(toIndentedString(ltd)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    safetyStock: ").append(toIndentedString(safetyStock)).append("\n");
    sb.append("    onHand: ").append(toIndentedString(onHand)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    allocates: ").append(toIndentedString(allocates)).append("\n");
    sb.append("    deallocates: ").append(toIndentedString(deallocates)).append("\n");
    sb.append("    fulfills: ").append(toIndentedString(fulfills)).append("\n");
    sb.append("    picks: ").append(toIndentedString(picks)).append("\n");
    sb.append("    pendingQuantity: ").append(toIndentedString(pendingQuantity)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

