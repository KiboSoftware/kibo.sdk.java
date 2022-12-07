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
import com.kibocommerce.sdk.inventory.model.BinModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Bin Response Object
 */
@ApiModel(description = "Bin Response Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class BinResponseModel {
  public static final String SERIALIZED_NAME_BINS = "bins";
  @SerializedName(SERIALIZED_NAME_BINS)
  private BinModel bins = null;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "resultCount";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public BinResponseModel bins(BinModel bins) {
    this.bins = bins;
    return this;
  }

   /**
   * Get bins
   * @return bins
  **/
  @ApiModelProperty(value = "")
  public BinModel getBins() {
    return bins;
  }

  public void setBins(BinModel bins) {
    this.bins = bins;
  }

  public BinResponseModel resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

   /**
   * number of results
   * @return resultCount
  **/
  @ApiModelProperty(value = "number of results")
  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinResponseModel binResponseModel = (BinResponseModel) o;
    return Objects.equals(this.bins, binResponseModel.bins) &&
        Objects.equals(this.resultCount, binResponseModel.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bins, resultCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinResponseModel {\n");
    
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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

