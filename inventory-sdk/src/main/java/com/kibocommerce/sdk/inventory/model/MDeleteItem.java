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
import com.kibocommerce.sdk.inventory.model.MItemIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Delete Item Model
 */
@ApiModel(description = "Delete Item Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class MDeleteItem {
  public static final String SERIALIZED_NAME_PRODUCT_I_D = "productID";
  @SerializedName(SERIALIZED_NAME_PRODUCT_I_D)
  private Integer productID;

  public static final String SERIALIZED_NAME_INVENTORY_I_DS = "inventoryIDs";
  @SerializedName(SERIALIZED_NAME_INVENTORY_I_DS)
  private List<Integer> inventoryIDs = null;

  public static final String SERIALIZED_NAME_LOCATION_I_DS = "locationIDs";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_DS)
  private List<Integer> locationIDs = null;

  public static final String SERIALIZED_NAME_AUDIT_I_DS = "auditIDs";
  @SerializedName(SERIALIZED_NAME_AUDIT_I_DS)
  private List<Integer> auditIDs = null;

  public static final String SERIALIZED_NAME_PICK_WAVE_I_DS = "pickWaveIDs";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_I_DS)
  private List<Integer> pickWaveIDs = null;

  public static final String SERIALIZED_NAME_ITEM_IDENTIFIER = "itemIdentifier";
  @SerializedName(SERIALIZED_NAME_ITEM_IDENTIFIER)
  private MItemIdentifier itemIdentifier = null;

  public MDeleteItem productID(Integer productID) {
    this.productID = productID;
    return this;
  }

   /**
   * Product Identifier
   * @return productID
  **/
  @ApiModelProperty(value = "Product Identifier")
  public Integer getProductID() {
    return productID;
  }

  public void setProductID(Integer productID) {
    this.productID = productID;
  }

  public MDeleteItem inventoryIDs(List<Integer> inventoryIDs) {
    this.inventoryIDs = inventoryIDs;
    return this;
  }

  public MDeleteItem addInventoryIDsItem(Integer inventoryIDsItem) {
    if (this.inventoryIDs == null) {
      this.inventoryIDs = new ArrayList<Integer>();
    }
    this.inventoryIDs.add(inventoryIDsItem);
    return this;
  }

   /**
   * List of inventory identifiers associated with the deleted item
   * @return inventoryIDs
  **/
  @ApiModelProperty(value = "List of inventory identifiers associated with the deleted item")
  public List<Integer> getInventoryIDs() {
    return inventoryIDs;
  }

  public void setInventoryIDs(List<Integer> inventoryIDs) {
    this.inventoryIDs = inventoryIDs;
  }

  public MDeleteItem locationIDs(List<Integer> locationIDs) {
    this.locationIDs = locationIDs;
    return this;
  }

  public MDeleteItem addLocationIDsItem(Integer locationIDsItem) {
    if (this.locationIDs == null) {
      this.locationIDs = new ArrayList<Integer>();
    }
    this.locationIDs.add(locationIDsItem);
    return this;
  }

   /**
   * List of location identifiers associated with the deleted item
   * @return locationIDs
  **/
  @ApiModelProperty(value = "List of location identifiers associated with the deleted item")
  public List<Integer> getLocationIDs() {
    return locationIDs;
  }

  public void setLocationIDs(List<Integer> locationIDs) {
    this.locationIDs = locationIDs;
  }

  public MDeleteItem auditIDs(List<Integer> auditIDs) {
    this.auditIDs = auditIDs;
    return this;
  }

  public MDeleteItem addAuditIDsItem(Integer auditIDsItem) {
    if (this.auditIDs == null) {
      this.auditIDs = new ArrayList<Integer>();
    }
    this.auditIDs.add(auditIDsItem);
    return this;
  }

   /**
   * List of audit identifiers associated with the deleted item
   * @return auditIDs
  **/
  @ApiModelProperty(value = "List of audit identifiers associated with the deleted item")
  public List<Integer> getAuditIDs() {
    return auditIDs;
  }

  public void setAuditIDs(List<Integer> auditIDs) {
    this.auditIDs = auditIDs;
  }

  public MDeleteItem pickWaveIDs(List<Integer> pickWaveIDs) {
    this.pickWaveIDs = pickWaveIDs;
    return this;
  }

  public MDeleteItem addPickWaveIDsItem(Integer pickWaveIDsItem) {
    if (this.pickWaveIDs == null) {
      this.pickWaveIDs = new ArrayList<Integer>();
    }
    this.pickWaveIDs.add(pickWaveIDsItem);
    return this;
  }

   /**
   * List of pick wave identifiers associated with the deleted item
   * @return pickWaveIDs
  **/
  @ApiModelProperty(value = "List of pick wave identifiers associated with the deleted item")
  public List<Integer> getPickWaveIDs() {
    return pickWaveIDs;
  }

  public void setPickWaveIDs(List<Integer> pickWaveIDs) {
    this.pickWaveIDs = pickWaveIDs;
  }

  public MDeleteItem itemIdentifier(MItemIdentifier itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
    return this;
  }

   /**
   * Get itemIdentifier
   * @return itemIdentifier
  **/
  @ApiModelProperty(value = "")
  public MItemIdentifier getItemIdentifier() {
    return itemIdentifier;
  }

  public void setItemIdentifier(MItemIdentifier itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MDeleteItem mDeleteItem = (MDeleteItem) o;
    return Objects.equals(this.productID, mDeleteItem.productID) &&
        Objects.equals(this.inventoryIDs, mDeleteItem.inventoryIDs) &&
        Objects.equals(this.locationIDs, mDeleteItem.locationIDs) &&
        Objects.equals(this.auditIDs, mDeleteItem.auditIDs) &&
        Objects.equals(this.pickWaveIDs, mDeleteItem.pickWaveIDs) &&
        Objects.equals(this.itemIdentifier, mDeleteItem.itemIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productID, inventoryIDs, locationIDs, auditIDs, pickWaveIDs, itemIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MDeleteItem {\n");
    
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    inventoryIDs: ").append(toIndentedString(inventoryIDs)).append("\n");
    sb.append("    locationIDs: ").append(toIndentedString(locationIDs)).append("\n");
    sb.append("    auditIDs: ").append(toIndentedString(auditIDs)).append("\n");
    sb.append("    pickWaveIDs: ").append(toIndentedString(pickWaveIDs)).append("\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
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

