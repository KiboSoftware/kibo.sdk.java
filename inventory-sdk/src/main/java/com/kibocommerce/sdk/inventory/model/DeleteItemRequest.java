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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Request needed for deleting inventory
 */
@ApiModel(description = "Request needed for deleting inventory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class DeleteItemRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_EXPLICIT = "explicit";
  @SerializedName(SERIALIZED_NAME_EXPLICIT)
  private Boolean explicit;

  public static final String SERIALIZED_NAME_LOCATION_CODES = "locationCodes";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODES)
  private List<String> locationCodes = null;

  public static final String SERIALIZED_NAME_ALL_LOCATIONS = "allLocations";
  @SerializedName(SERIALIZED_NAME_ALL_LOCATIONS)
  private Boolean allLocations;

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public DeleteItemRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Flag used to differentiate between a test and a non-test run.
   * @return dryRun
  **/
  @ApiModelProperty(value = "Flag used to differentiate between a test and a non-test run.")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public DeleteItemRequest explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

   /**
   * Flag used to request explicit inventory, location, pick wave, and audit information for each request item.
   * @return explicit
  **/
  @ApiModelProperty(value = "Flag used to request explicit inventory, location, pick wave, and audit information for each request item.")
  public Boolean getExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }

  public DeleteItemRequest locationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
    return this;
  }

  public DeleteItemRequest addLocationCodesItem(String locationCodesItem) {
    if (this.locationCodes == null) {
      this.locationCodes = new ArrayList<String>();
    }
    this.locationCodes.add(locationCodesItem);
    return this;
  }

   /**
   * An array of locationCodes to be considered for item-deletion purposes. Optional.     All locationCodes associated with the requesting tenant will be considered if no locationCodes are provided.
   * @return locationCodes
  **/
  @ApiModelProperty(value = "An array of locationCodes to be considered for item-deletion purposes. Optional.     All locationCodes associated with the requesting tenant will be considered if no locationCodes are provided.")
  public List<String> getLocationCodes() {
    return locationCodes;
  }

  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }

  public DeleteItemRequest allLocations(Boolean allLocations) {
    this.allLocations = allLocations;
    return this;
  }

   /**
   * Flag used to request deletion of inventory across all locations (overrides locationCodes).
   * @return allLocations
  **/
  @ApiModelProperty(value = "Flag used to request deletion of inventory across all locations (overrides locationCodes).")
  public Boolean getAllLocations() {
    return allLocations;
  }

  public void setAllLocations(Boolean allLocations) {
    this.allLocations = allLocations;
  }

  public DeleteItemRequest partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * The part number of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return partNumber
  **/
  @ApiModelProperty(value = "The part number of the item to be deleted. Supports basic regex operators: .*+?^$[]")
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public DeleteItemRequest upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * The upc of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return upc
  **/
  @ApiModelProperty(value = "The upc of the item to be deleted. Supports basic regex operators: .*+?^$[]")
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public DeleteItemRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The sku of the item to be deleted. Supports basic regex operators: .*+?^$[]
   * @return sku
  **/
  @ApiModelProperty(value = "The sku of the item to be deleted. Supports basic regex operators: .*+?^$[]")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public DeleteItemRequest tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public DeleteItemRequest putTagsItem(String key, String tagsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteItemRequest deleteItemRequest = (DeleteItemRequest) o;
    return Objects.equals(this.dryRun, deleteItemRequest.dryRun) &&
        Objects.equals(this.explicit, deleteItemRequest.explicit) &&
        Objects.equals(this.locationCodes, deleteItemRequest.locationCodes) &&
        Objects.equals(this.allLocations, deleteItemRequest.allLocations) &&
        Objects.equals(this.partNumber, deleteItemRequest.partNumber) &&
        Objects.equals(this.upc, deleteItemRequest.upc) &&
        Objects.equals(this.sku, deleteItemRequest.sku) &&
        Objects.equals(this.tags, deleteItemRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, explicit, locationCodes, allLocations, partNumber, upc, sku, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItemRequest {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    allLocations: ").append(toIndentedString(allLocations)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

