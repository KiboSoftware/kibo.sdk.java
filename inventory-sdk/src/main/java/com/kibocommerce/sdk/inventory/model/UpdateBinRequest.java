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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateBinRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:31:58.472-05:00[America/Chicago]")
public class UpdateBinRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public static final String SERIALIZED_NAME_BIN_TYPE_I_D = "binTypeID";
  @SerializedName(SERIALIZED_NAME_BIN_TYPE_I_D)
  private Integer binTypeID;

  public static final String SERIALIZED_NAME_BIN_STATUS_I_D = "binStatusID";
  @SerializedName(SERIALIZED_NAME_BIN_STATUS_I_D)
  private Integer binStatusID;

  public UpdateBinRequest binID(Integer binID) {
    this.binID = binID;
    return this;
  }

   /**
   * Bin identifier
   * @return binID
  **/
  @ApiModelProperty(required = true, value = "Bin identifier")
  public Integer getBinID() {
    return binID;
  }

  public void setBinID(Integer binID) {
    this.binID = binID;
  }

  public UpdateBinRequest binTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
    return this;
  }

   /**
   * New Bin&#39;s Type ID
   * @return binTypeID
  **/
  @ApiModelProperty(value = "New Bin's Type ID")
  public Integer getBinTypeID() {
    return binTypeID;
  }

  public void setBinTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
  }

  public UpdateBinRequest binStatusID(Integer binStatusID) {
    this.binStatusID = binStatusID;
    return this;
  }

   /**
   * New Bin&#39;s Status ID
   * @return binStatusID
  **/
  @ApiModelProperty(value = "New Bin's Status ID")
  public Integer getBinStatusID() {
    return binStatusID;
  }

  public void setBinStatusID(Integer binStatusID) {
    this.binStatusID = binStatusID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBinRequest updateBinRequest = (UpdateBinRequest) o;
    return Objects.equals(this.binID, updateBinRequest.binID) &&
        Objects.equals(this.binTypeID, updateBinRequest.binTypeID) &&
        Objects.equals(this.binStatusID, updateBinRequest.binStatusID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binID, binTypeID, binStatusID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBinRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
    sb.append("    binTypeID: ").append(toIndentedString(binTypeID)).append("\n");
    sb.append("    binStatusID: ").append(toIndentedString(binStatusID)).append("\n");
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

