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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InventoryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:31:58.472-05:00[America/Chicago]")
public class InventoryResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_ON_HAND = "onHand";
  @SerializedName(SERIALIZED_NAME_ON_HAND)
  private Integer onHand;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private Integer allocated;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Integer pending;

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_BLOCK_ASSIGNMENT = "blockAssignment";
  @SerializedName(SERIALIZED_NAME_BLOCK_ASSIGNMENT)
  private Boolean blockAssignment;

  public static final String SERIALIZED_NAME_LTD = "ltd";
  @SerializedName(SERIALIZED_NAME_LTD)
  private BigDecimal ltd;

  public static final String SERIALIZED_NAME_FLOOR = "floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private Integer floor;

  public static final String SERIALIZED_NAME_SAFETY_STOCK = "safetyStock";
  @SerializedName(SERIALIZED_NAME_SAFETY_STOCK)
  private Integer safetyStock;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private Boolean directShip;

  public static final String SERIALIZED_NAME_TRANSFER_ENABLED = "transferEnabled";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ENABLED)
  private Boolean transferEnabled;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CURRENCY_I_D = "currencyID";
  @SerializedName(SERIALIZED_NAME_CURRENCY_I_D)
  private Integer currencyID;

  public static final String SERIALIZED_NAME_RETAIL_PRICE = "retailPrice";
  @SerializedName(SERIALIZED_NAME_RETAIL_PRICE)
  private BigDecimal retailPrice;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<String> attributes = null;

  public InventoryResponse locationName(String locationName) {
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

  public InventoryResponse locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @ApiModelProperty(value = "Location Code")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public InventoryResponse tenantID(Integer tenantID) {
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant Identifier
   * @return tenantID
  **/
  @ApiModelProperty(value = "Tenant Identifier")
  public Integer getTenantID() {
    return tenantID;
  }

  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }

  public InventoryResponse onHand(Integer onHand) {
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

  public InventoryResponse available(Integer available) {
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

  public InventoryResponse allocated(Integer allocated) {
    this.allocated = allocated;
    return this;
  }

   /**
   * The quantity the location has that are already allocated.
   * @return allocated
  **/
  @ApiModelProperty(value = "The quantity the location has that are already allocated.")
  public Integer getAllocated() {
    return allocated;
  }

  public void setAllocated(Integer allocated) {
    this.allocated = allocated;
  }

  public InventoryResponse pending(Integer pending) {
    this.pending = pending;
    return this;
  }

   /**
   * The quantity the location has that are pending.
   * @return pending
  **/
  @ApiModelProperty(value = "The quantity the location has that are pending.")
  public Integer getPending() {
    return pending;
  }

  public void setPending(Integer pending) {
    this.pending = pending;
  }

  public InventoryResponse partNumber(String partNumber) {
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

  public InventoryResponse upc(String upc) {
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

  public InventoryResponse sku(String sku) {
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

  public InventoryResponse blockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
    return this;
  }

   /**
   * Whether or not the product is blocked for assignment
   * @return blockAssignment
  **/
  @ApiModelProperty(value = "Whether or not the product is blocked for assignment")
  public Boolean getBlockAssignment() {
    return blockAssignment;
  }

  public void setBlockAssignment(Boolean blockAssignment) {
    this.blockAssignment = blockAssignment;
  }

  public InventoryResponse ltd(BigDecimal ltd) {
    this.ltd = ltd;
    return this;
  }

   /**
   * Custom field used for store prioritization
   * @return ltd
  **/
  @ApiModelProperty(value = "Custom field used for store prioritization")
  public BigDecimal getLtd() {
    return ltd;
  }

  public void setLtd(BigDecimal ltd) {
    this.ltd = ltd;
  }

  public InventoryResponse floor(Integer floor) {
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

  public InventoryResponse safetyStock(Integer safetyStock) {
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

  public InventoryResponse distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance in miles from this location to the item&#39;s destination
   * @return distance
  **/
  @ApiModelProperty(value = "The distance in miles from this location to the item's destination")
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public InventoryResponse directShip(Boolean directShip) {
    this.directShip = directShip;
    return this;
  }

   /**
   * Whether this location can ship to a consumer
   * @return directShip
  **/
  @ApiModelProperty(value = "Whether this location can ship to a consumer")
  public Boolean getDirectShip() {
    return directShip;
  }

  public void setDirectShip(Boolean directShip) {
    this.directShip = directShip;
  }

  public InventoryResponse transferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
    return this;
  }

   /**
   * Whether the location can ship to another location (store), thus restocking that location.
   * @return transferEnabled
  **/
  @ApiModelProperty(value = "Whether the location can ship to another location (store), thus restocking that location.")
  public Boolean getTransferEnabled() {
    return transferEnabled;
  }

  public void setTransferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
  }

  public InventoryResponse pickup(Boolean pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Whether a consumer can pick up product at this location (store)
   * @return pickup
  **/
  @ApiModelProperty(value = "Whether a consumer can pick up product at this location (store)")
  public Boolean getPickup() {
    return pickup;
  }

  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }

  public InventoryResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code of this location
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country code of this location")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InventoryResponse currencyID(Integer currencyID) {
    this.currencyID = currencyID;
    return this;
  }

   /**
   * The currency identifier for the retailPrice
   * @return currencyID
  **/
  @ApiModelProperty(value = "The currency identifier for the retailPrice")
  public Integer getCurrencyID() {
    return currencyID;
  }

  public void setCurrencyID(Integer currencyID) {
    this.currencyID = currencyID;
  }

  public InventoryResponse retailPrice(BigDecimal retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

   /**
   * The price of the product at this location
   * @return retailPrice
  **/
  @ApiModelProperty(value = "The price of the product at this location")
  public BigDecimal getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(BigDecimal retailPrice) {
    this.retailPrice = retailPrice;
  }

  public InventoryResponse attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public InventoryResponse addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of Inventory Attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "List of Inventory Attributes")
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryResponse inventoryResponse = (InventoryResponse) o;
    return Objects.equals(this.locationName, inventoryResponse.locationName) &&
        Objects.equals(this.locationCode, inventoryResponse.locationCode) &&
        Objects.equals(this.tenantID, inventoryResponse.tenantID) &&
        Objects.equals(this.onHand, inventoryResponse.onHand) &&
        Objects.equals(this.available, inventoryResponse.available) &&
        Objects.equals(this.allocated, inventoryResponse.allocated) &&
        Objects.equals(this.pending, inventoryResponse.pending) &&
        Objects.equals(this.partNumber, inventoryResponse.partNumber) &&
        Objects.equals(this.upc, inventoryResponse.upc) &&
        Objects.equals(this.sku, inventoryResponse.sku) &&
        Objects.equals(this.blockAssignment, inventoryResponse.blockAssignment) &&
        Objects.equals(this.ltd, inventoryResponse.ltd) &&
        Objects.equals(this.floor, inventoryResponse.floor) &&
        Objects.equals(this.safetyStock, inventoryResponse.safetyStock) &&
        Objects.equals(this.distance, inventoryResponse.distance) &&
        Objects.equals(this.directShip, inventoryResponse.directShip) &&
        Objects.equals(this.transferEnabled, inventoryResponse.transferEnabled) &&
        Objects.equals(this.pickup, inventoryResponse.pickup) &&
        Objects.equals(this.countryCode, inventoryResponse.countryCode) &&
        Objects.equals(this.currencyID, inventoryResponse.currencyID) &&
        Objects.equals(this.retailPrice, inventoryResponse.retailPrice) &&
        Objects.equals(this.attributes, inventoryResponse.attributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationName, locationCode, tenantID, onHand, available, allocated, pending, partNumber, upc, sku, blockAssignment, ltd, floor, safetyStock, distance, directShip, transferEnabled, pickup, countryCode, currencyID, retailPrice, attributes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    onHand: ").append(toIndentedString(onHand)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    blockAssignment: ").append(toIndentedString(blockAssignment)).append("\n");
    sb.append("    ltd: ").append(toIndentedString(ltd)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    safetyStock: ").append(toIndentedString(safetyStock)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    transferEnabled: ").append(toIndentedString(transferEnabled)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

