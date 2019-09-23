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
import com.kibocommerce.kibo.sdk.java.inventory.model.BinProductQuantities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadBinInventoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-22T23:27:35.732-05:00[America/Chicago]")
public class LoadBinInventoryRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_BINS = "bins";
  @SerializedName(SERIALIZED_NAME_BINS)
  private List<BinProductQuantities> bins = null;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public LoadBinInventoryRequest bins(List<BinProductQuantities> bins) {
    this.bins = bins;
    return this;
  }

  public LoadBinInventoryRequest addBinsItem(BinProductQuantities binsItem) {
    if (this.bins == null) {
      this.bins = new ArrayList<BinProductQuantities>();
    }
    this.bins.add(binsItem);
    return this;
  }

   /**
   * List of bins and their associated product quantities
   * @return bins
  **/
  @ApiModelProperty(value = "List of bins and their associated product quantities")
  public List<BinProductQuantities> getBins() {
    return bins;
  }

  public void setBins(List<BinProductQuantities> bins) {
    this.bins = bins;
  }

  public LoadBinInventoryRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Flag for dry runs
   * @return dryRun
  **/
  @ApiModelProperty(value = "Flag for dry runs")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBinInventoryRequest loadBinInventoryRequest = (LoadBinInventoryRequest) o;
    return Objects.equals(this.bins, loadBinInventoryRequest.bins) &&
        Objects.equals(this.dryRun, loadBinInventoryRequest.dryRun) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bins, dryRun, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBinInventoryRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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

