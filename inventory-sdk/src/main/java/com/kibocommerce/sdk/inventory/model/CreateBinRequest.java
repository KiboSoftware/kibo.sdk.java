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
 * CreateBinRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:31:33.449-05:00[America/Chicago]")
public class CreateBinRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_BIN_TYPE_I_D = "binTypeID";
  @SerializedName(SERIALIZED_NAME_BIN_TYPE_I_D)
  private Integer binTypeID;

  public static final String SERIALIZED_NAME_BIN_STATUS_I_D = "binStatusID";
  @SerializedName(SERIALIZED_NAME_BIN_STATUS_I_D)
  private Integer binStatusID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateBinRequest locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @ApiModelProperty(value = "Location Code")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public CreateBinRequest binTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
    return this;
  }

   /**
   * Bin Type Identifier
   * @return binTypeID
  **/
  @ApiModelProperty(value = "Bin Type Identifier")
  public Integer getBinTypeID() {
    return binTypeID;
  }

  public void setBinTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
  }

  public CreateBinRequest binStatusID(Integer binStatusID) {
    this.binStatusID = binStatusID;
    return this;
  }

   /**
   * Bin Status Identifier
   * @return binStatusID
  **/
  @ApiModelProperty(value = "Bin Status Identifier")
  public Integer getBinStatusID() {
    return binStatusID;
  }

  public void setBinStatusID(Integer binStatusID) {
    this.binStatusID = binStatusID;
  }

  public CreateBinRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBinRequest createBinRequest = (CreateBinRequest) o;
    return Objects.equals(this.locationCode, createBinRequest.locationCode) &&
        Objects.equals(this.binTypeID, createBinRequest.binTypeID) &&
        Objects.equals(this.binStatusID, createBinRequest.binStatusID) &&
        Objects.equals(this.name, createBinRequest.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationCode, binTypeID, binStatusID, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBinRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    binTypeID: ").append(toIndentedString(binTypeID)).append("\n");
    sb.append("    binStatusID: ").append(toIndentedString(binStatusID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
