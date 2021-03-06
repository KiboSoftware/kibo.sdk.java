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
import com.kibocommerce.sdk.inventory.model.BaseRequest;
import com.kibocommerce.sdk.inventory.model.BinProductQuantities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WaveCompletion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class WaveCompletion extends BaseRequest {
  public static final String SERIALIZED_NAME_CREATE_RECOVERY = "createRecovery";
  @SerializedName(SERIALIZED_NAME_CREATE_RECOVERY)
  private Boolean createRecovery;

  public static final String SERIALIZED_NAME_BINS = "bins";
  @SerializedName(SERIALIZED_NAME_BINS)
  private List<BinProductQuantities> bins = null;

  public WaveCompletion createRecovery(Boolean createRecovery) {
    this.createRecovery = createRecovery;
    return this;
  }

   /**
   * Flag for creating a recovery
   * @return createRecovery
  **/
  @ApiModelProperty(value = "Flag for creating a recovery")
  public Boolean getCreateRecovery() {
    return createRecovery;
  }

  public void setCreateRecovery(Boolean createRecovery) {
    this.createRecovery = createRecovery;
  }

  public WaveCompletion bins(List<BinProductQuantities> bins) {
    this.bins = bins;
    return this;
  }

  public WaveCompletion addBinsItem(BinProductQuantities binsItem) {
    if (this.bins == null) {
      this.bins = new ArrayList<BinProductQuantities>();
    }
    this.bins.add(binsItem);
    return this;
  }

   /**
   * Maximum number of orders
   * @return bins
  **/
  @ApiModelProperty(value = "Maximum number of orders")
  public List<BinProductQuantities> getBins() {
    return bins;
  }

  public void setBins(List<BinProductQuantities> bins) {
    this.bins = bins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaveCompletion waveCompletion = (WaveCompletion) o;
    return Objects.equals(this.createRecovery, waveCompletion.createRecovery) &&
        Objects.equals(this.bins, waveCompletion.bins) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createRecovery, bins, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaveCompletion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createRecovery: ").append(toIndentedString(createRecovery)).append("\n");
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
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

