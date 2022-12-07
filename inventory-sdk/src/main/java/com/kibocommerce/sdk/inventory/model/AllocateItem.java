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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Item for Allocation
 */
@ApiModel(description = "Item for Allocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class AllocateItem {
  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private Integer orderID;

  public static final String SERIALIZED_NAME_ORDER_ITEM_I_D = "orderItemID";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_I_D)
  private Integer orderItemID;

  public static final String SERIALIZED_NAME_CART_I_D = "cartID";
  @SerializedName(SERIALIZED_NAME_CART_I_D)
  private String cartID;

  public static final String SERIALIZED_NAME_RESERVATION_I_D = "reservationID";
  @SerializedName(SERIALIZED_NAME_RESERVATION_I_D)
  private String reservationID;

  public static final String SERIALIZED_NAME_CART_ITEM_I_D = "cartItemID";
  @SerializedName(SERIALIZED_NAME_CART_ITEM_I_D)
  private String cartItemID;

  public static final String SERIALIZED_NAME_SHIPMENT_I_D = "shipmentID";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_I_D)
  private Integer shipmentID;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_PREVIOUS_ORDER_ITEM_I_D = "previousOrderItemID";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ORDER_ITEM_I_D)
  private Integer previousOrderItemID;

  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public static final String SERIALIZED_NAME_BLOCK_ASSIGNMENT = "blockAssignment";
  @SerializedName(SERIALIZED_NAME_BLOCK_ASSIGNMENT)
  private Boolean blockAssignment;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_FUTURE_DATE = "futureDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_DATE)
  private OffsetDateTime futureDate = null;

  public AllocateItem partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * part number
   * @return partNumber
  **/
  @ApiModelProperty(value = "part number")
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public AllocateItem upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * upc
   * @return upc
  **/
  @ApiModelProperty(value = "upc")
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public AllocateItem sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * sku
   * @return sku
  **/
  @ApiModelProperty(value = "sku")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public AllocateItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public AllocateItem orderID(Integer orderID) {
    this.orderID = orderID;
    return this;
  }

   /**
   * order ID
   * @return orderID
  **/
  @ApiModelProperty(required = true, value = "order ID")
  public Integer getOrderID() {
    return orderID;
  }

  public void setOrderID(Integer orderID) {
    this.orderID = orderID;
  }

  public AllocateItem orderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
    return this;
  }

   /**
   * order item ID
   * @return orderItemID
  **/
  @ApiModelProperty(required = true, value = "order item ID")
  public Integer getOrderItemID() {
    return orderItemID;
  }

  public void setOrderItemID(Integer orderItemID) {
    this.orderItemID = orderItemID;
  }

  public AllocateItem cartID(String cartID) {
    this.cartID = cartID;
    return this;
  }

   /**
   * Cart ID (GUID)
   * @return cartID
  **/
  @ApiModelProperty(value = "Cart ID (GUID)")
  public String getCartID() {
    return cartID;
  }

  public void setCartID(String cartID) {
    this.cartID = cartID;
  }

  public AllocateItem reservationID(String reservationID) {
    this.reservationID = reservationID;
    return this;
  }

   /**
   * Reservation ID
   * @return reservationID
  **/
  @ApiModelProperty(value = "Reservation ID")
  public String getReservationID() {
    return reservationID;
  }

  public void setReservationID(String reservationID) {
    this.reservationID = reservationID;
  }

  public AllocateItem cartItemID(String cartItemID) {
    this.cartItemID = cartItemID;
    return this;
  }

   /**
   * Cart Item ID (GUID)
   * @return cartItemID
  **/
  @ApiModelProperty(value = "Cart Item ID (GUID)")
  public String getCartItemID() {
    return cartItemID;
  }

  public void setCartItemID(String cartItemID) {
    this.cartItemID = cartItemID;
  }

  public AllocateItem shipmentID(Integer shipmentID) {
    this.shipmentID = shipmentID;
    return this;
  }

   /**
   * shipment ID
   * @return shipmentID
  **/
  @ApiModelProperty(required = true, value = "shipment ID")
  public Integer getShipmentID() {
    return shipmentID;
  }

  public void setShipmentID(Integer shipmentID) {
    this.shipmentID = shipmentID;
  }

  public AllocateItem locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * location Code
   * @return locationCode
  **/
  @ApiModelProperty(value = "location Code")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public AllocateItem previousOrderItemID(Integer previousOrderItemID) {
    this.previousOrderItemID = previousOrderItemID;
    return this;
  }

   /**
   * previous order item ID
   * @return previousOrderItemID
  **/
  @ApiModelProperty(value = "previous order item ID")
  public Integer getPreviousOrderItemID() {
    return previousOrderItemID;
  }

  public void setPreviousOrderItemID(Integer previousOrderItemID) {
    this.previousOrderItemID = previousOrderItemID;
  }

  public AllocateItem binID(Integer binID) {
    this.binID = binID;
    return this;
  }

   /**
   * Bin Location Identifier
   * @return binID
  **/
  @ApiModelProperty(value = "Bin Location Identifier")
  public Integer getBinID() {
    return binID;
  }

  public void setBinID(Integer binID) {
    this.binID = binID;
  }

  public AllocateItem blockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
    return this;
  }

   /**
   * Block assignment of item at product/location level. ONLY allowed on deallocate.
   * @return blockAssignment
  **/
  @ApiModelProperty(value = "Block assignment of item at product/location level. ONLY allowed on deallocate.")
  public Boolean getBlockAssignment() {
    return blockAssignment;
  }

  public void setBlockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
  }

  public AllocateItem tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AllocateItem putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName
   * @return tags
  **/
  @ApiModelProperty(value = "Associative Map of <String, String> for tagCategoryName => tagName")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AllocateItem futureDate(OffsetDateTime futureDate) {
    this.futureDate = futureDate;
    return this;
  }

   /**
   * Future Date at which the inventory should be allocated against. Expected format &#39;2020-09-28T12:00:00-0500&#39;
   * @return futureDate
  **/
  @ApiModelProperty(value = "Future Date at which the inventory should be allocated against. Expected format '2020-09-28T12:00:00-0500'")
  public OffsetDateTime getFutureDate() {
    return futureDate;
  }

  public void setFutureDate(OffsetDateTime futureDate) {
    this.futureDate = futureDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateItem allocateItem = (AllocateItem) o;
    return Objects.equals(this.partNumber, allocateItem.partNumber) &&
        Objects.equals(this.upc, allocateItem.upc) &&
        Objects.equals(this.sku, allocateItem.sku) &&
        Objects.equals(this.quantity, allocateItem.quantity) &&
        Objects.equals(this.orderID, allocateItem.orderID) &&
        Objects.equals(this.orderItemID, allocateItem.orderItemID) &&
        Objects.equals(this.cartID, allocateItem.cartID) &&
        Objects.equals(this.reservationID, allocateItem.reservationID) &&
        Objects.equals(this.cartItemID, allocateItem.cartItemID) &&
        Objects.equals(this.shipmentID, allocateItem.shipmentID) &&
        Objects.equals(this.locationCode, allocateItem.locationCode) &&
        Objects.equals(this.previousOrderItemID, allocateItem.previousOrderItemID) &&
        Objects.equals(this.binID, allocateItem.binID) &&
        Objects.equals(this.blockAssignment, allocateItem.blockAssignment) &&
        Objects.equals(this.tags, allocateItem.tags) &&
        Objects.equals(this.futureDate, allocateItem.futureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, upc, sku, quantity, orderID, orderItemID, cartID, reservationID, cartItemID, shipmentID, locationCode, previousOrderItemID, binID, blockAssignment, tags, futureDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateItem {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    orderItemID: ").append(toIndentedString(orderItemID)).append("\n");
    sb.append("    cartID: ").append(toIndentedString(cartID)).append("\n");
    sb.append("    reservationID: ").append(toIndentedString(reservationID)).append("\n");
    sb.append("    cartItemID: ").append(toIndentedString(cartItemID)).append("\n");
    sb.append("    shipmentID: ").append(toIndentedString(shipmentID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    previousOrderItemID: ").append(toIndentedString(previousOrderItemID)).append("\n");
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
    sb.append("    blockAssignment: ").append(toIndentedString(blockAssignment)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    futureDate: ").append(toIndentedString(futureDate)).append("\n");
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

