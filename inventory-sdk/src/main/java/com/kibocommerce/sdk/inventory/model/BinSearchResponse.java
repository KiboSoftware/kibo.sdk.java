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
import com.kibocommerce.sdk.inventory.model.BinProductResponseQuantities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BinSearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class BinSearchResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_BIN_QUANTITIES = "binQuantities";
  @SerializedName(SERIALIZED_NAME_BIN_QUANTITIES)
  private List<BinProductResponseQuantities> binQuantities = null;

  public BinSearchResponse binQuantities(List<BinProductResponseQuantities> binQuantities) {
    this.binQuantities = binQuantities;
    return this;
  }

  public BinSearchResponse addBinQuantitiesItem(BinProductResponseQuantities binQuantitiesItem) {
    if (this.binQuantities == null) {
      this.binQuantities = new ArrayList<BinProductResponseQuantities>();
    }
    this.binQuantities.add(binQuantitiesItem);
    return this;
  }

   /**
   * List of BinProductQuantities - bins with associated products and quantities
   * @return binQuantities
  **/
  @ApiModelProperty(value = "List of BinProductQuantities - bins with associated products and quantities")
  public List<BinProductResponseQuantities> getBinQuantities() {
    return binQuantities;
  }

  public void setBinQuantities(List<BinProductResponseQuantities> binQuantities) {
    this.binQuantities = binQuantities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinSearchResponse binSearchResponse = (BinSearchResponse) o;
    return Objects.equals(this.binQuantities, binSearchResponse.binQuantities) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binQuantities, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinSearchResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    binQuantities: ").append(toIndentedString(binQuantities)).append("\n");
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
