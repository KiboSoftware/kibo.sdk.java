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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Item
 */
@ApiModel(description = "Item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:18:39.656-05:00[America/Chicago]")
public class Item {
  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public Item partNumber(String partNumber) {
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

  public Item upc(String upc) {
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

  public Item sku(String sku) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.partNumber, item.partNumber) &&
        Objects.equals(this.upc, item.upc) &&
        Objects.equals(this.sku, item.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, upc, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

