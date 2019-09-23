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
import com.kibocommerce.kibo.sdk.java.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Bin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:18:39.656-05:00[America/Chicago]")
public class Bin extends BaseResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_BIN_TYPE_I_D = "binTypeID";
  @SerializedName(SERIALIZED_NAME_BIN_TYPE_I_D)
  private Integer binTypeID;

  public static final String SERIALIZED_NAME_BIN_STATUS_I_D = "binStatusID";
  @SerializedName(SERIALIZED_NAME_BIN_STATUS_I_D)
  private Integer binStatusID;

  public Bin name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Bin Name
   * @return name
  **/
  @ApiModelProperty(value = "Bin Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bin binID(Integer binID) {
    this.binID = binID;
    return this;
  }

   /**
   * Bin ID
   * @return binID
  **/
  @ApiModelProperty(value = "Bin ID")
  public Integer getBinID() {
    return binID;
  }

  public void setBinID(Integer binID) {
    this.binID = binID;
  }

  public Bin locationCode(String locationCode) {
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

  public Bin binTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
    return this;
  }

   /**
   * Bin Type ID
   * @return binTypeID
  **/
  @ApiModelProperty(value = "Bin Type ID")
  public Integer getBinTypeID() {
    return binTypeID;
  }

  public void setBinTypeID(Integer binTypeID) {
    this.binTypeID = binTypeID;
  }

  public Bin binStatusID(Integer binStatusID) {
    this.binStatusID = binStatusID;
    return this;
  }

   /**
   * Bin Status ID
   * @return binStatusID
  **/
  @ApiModelProperty(value = "Bin Status ID")
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
    Bin bin = (Bin) o;
    return Objects.equals(this.name, bin.name) &&
        Objects.equals(this.binID, bin.binID) &&
        Objects.equals(this.locationCode, bin.locationCode) &&
        Objects.equals(this.binTypeID, bin.binTypeID) &&
        Objects.equals(this.binStatusID, bin.binStatusID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, binID, locationCode, binTypeID, binStatusID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bin {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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

