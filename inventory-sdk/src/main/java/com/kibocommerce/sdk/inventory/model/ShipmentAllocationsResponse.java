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
import com.kibocommerce.sdk.inventory.model.InventoryAllocationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ShipmentAllocationsResponse Object
 */
@ApiModel(description = "ShipmentAllocationsResponse Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class ShipmentAllocationsResponse {
  public static final String SERIALIZED_NAME_CURRENT_ALLOCATIONS = "currentAllocations";
  @SerializedName(SERIALIZED_NAME_CURRENT_ALLOCATIONS)
  private List<InventoryAllocationResponse> currentAllocations = null;

  public static final String SERIALIZED_NAME_FUTURE_ALLOCATIONS = "futureAllocations";
  @SerializedName(SERIALIZED_NAME_FUTURE_ALLOCATIONS)
  private List<InventoryAllocationResponse> futureAllocations = null;

  public ShipmentAllocationsResponse currentAllocations(List<InventoryAllocationResponse> currentAllocations) {
    this.currentAllocations = currentAllocations;
    return this;
  }

  public ShipmentAllocationsResponse addCurrentAllocationsItem(InventoryAllocationResponse currentAllocationsItem) {
    if (this.currentAllocations == null) {
      this.currentAllocations = new ArrayList<InventoryAllocationResponse>();
    }
    this.currentAllocations.add(currentAllocationsItem);
    return this;
  }

   /**
   * List of InventoryAllocationResponse objects
   * @return currentAllocations
  **/
  @ApiModelProperty(value = "List of InventoryAllocationResponse objects")
  public List<InventoryAllocationResponse> getCurrentAllocations() {
    return currentAllocations;
  }

  public void setCurrentAllocations(List<InventoryAllocationResponse> currentAllocations) {
    this.currentAllocations = currentAllocations;
  }

  public ShipmentAllocationsResponse futureAllocations(List<InventoryAllocationResponse> futureAllocations) {
    this.futureAllocations = futureAllocations;
    return this;
  }

  public ShipmentAllocationsResponse addFutureAllocationsItem(InventoryAllocationResponse futureAllocationsItem) {
    if (this.futureAllocations == null) {
      this.futureAllocations = new ArrayList<InventoryAllocationResponse>();
    }
    this.futureAllocations.add(futureAllocationsItem);
    return this;
  }

   /**
   * List of InventoryAllocationResponse objects
   * @return futureAllocations
  **/
  @ApiModelProperty(value = "List of InventoryAllocationResponse objects")
  public List<InventoryAllocationResponse> getFutureAllocations() {
    return futureAllocations;
  }

  public void setFutureAllocations(List<InventoryAllocationResponse> futureAllocations) {
    this.futureAllocations = futureAllocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentAllocationsResponse shipmentAllocationsResponse = (ShipmentAllocationsResponse) o;
    return Objects.equals(this.currentAllocations, shipmentAllocationsResponse.currentAllocations) &&
        Objects.equals(this.futureAllocations, shipmentAllocationsResponse.futureAllocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAllocations, futureAllocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentAllocationsResponse {\n");
    
    sb.append("    currentAllocations: ").append(toIndentedString(currentAllocations)).append("\n");
    sb.append("    futureAllocations: ").append(toIndentedString(futureAllocations)).append("\n");
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

