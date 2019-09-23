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
import com.kibocommerce.kibo.sdk.java.inventory.model.BaseRequest;
import com.kibocommerce.kibo.sdk.java.inventory.model.Product;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BinSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-22T23:27:35.732-05:00[America/Chicago]")
public class BinSearchRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_BIN_NAME = "binName";
  @SerializedName(SERIALIZED_NAME_BIN_NAME)
  private String binName;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private Product product = null;

  public static final String SERIALIZED_NAME_SORT_ASCENDING = "sortAscending";
  @SerializedName(SERIALIZED_NAME_SORT_ASCENDING)
  private Boolean sortAscending;

  public static final String SERIALIZED_NAME_SHOW_NEGATIVE_INVENTORY = "showNegativeInventory";
  @SerializedName(SERIALIZED_NAME_SHOW_NEGATIVE_INVENTORY)
  private Boolean showNegativeInventory;

  public BinSearchRequest binName(String binName) {
    this.binName = binName;
    return this;
  }

   /**
   * Partial match of bin name
   * @return binName
  **/
  @ApiModelProperty(value = "Partial match of bin name")
  public String getBinName() {
    return binName;
  }

  public void setBinName(String binName) {
    this.binName = binName;
  }

  public BinSearchRequest product(Product product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public BinSearchRequest sortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
    return this;
  }

   /**
   * Flag for sorting ascending
   * @return sortAscending
  **/
  @ApiModelProperty(value = "Flag for sorting ascending")
  public Boolean getSortAscending() {
    return sortAscending;
  }

  public void setSortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
  }

  public BinSearchRequest showNegativeInventory(Boolean showNegativeInventory) {
    this.showNegativeInventory = showNegativeInventory;
    return this;
  }

   /**
   * Flag for showing negative inventory
   * @return showNegativeInventory
  **/
  @ApiModelProperty(value = "Flag for showing negative inventory")
  public Boolean getShowNegativeInventory() {
    return showNegativeInventory;
  }

  public void setShowNegativeInventory(Boolean showNegativeInventory) {
    this.showNegativeInventory = showNegativeInventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinSearchRequest binSearchRequest = (BinSearchRequest) o;
    return Objects.equals(this.binName, binSearchRequest.binName) &&
        Objects.equals(this.product, binSearchRequest.product) &&
        Objects.equals(this.sortAscending, binSearchRequest.sortAscending) &&
        Objects.equals(this.showNegativeInventory, binSearchRequest.showNegativeInventory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binName, product, sortAscending, showNegativeInventory, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sortAscending: ").append(toIndentedString(sortAscending)).append("\n");
    sb.append("    showNegativeInventory: ").append(toIndentedString(showNegativeInventory)).append("\n");
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

