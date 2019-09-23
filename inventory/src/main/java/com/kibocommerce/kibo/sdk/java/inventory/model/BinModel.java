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
 * Bin Model
 */
@ApiModel(description = "Bin Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:18:39.656-05:00[America/Chicago]")
public class BinModel {
  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Integer locationID;

  public static final String SERIALIZED_NAME_BIN_TYPE_I_D = "binTypeID";
  @SerializedName(SERIALIZED_NAME_BIN_TYPE_I_D)
  private Integer binTypeID;

  public static final String SERIALIZED_NAME_BIN_STATUS_I_D = "binStatusID";
  @SerializedName(SERIALIZED_NAME_BIN_STATUS_I_D)
  private Integer binStatusID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Integer name;

  public BinModel binID(Integer binID) {
    this.binID = binID;
    return this;
  }

   /**
   * Unique Bin Identifier assigned by the system
   * @return binID
  **/
  @ApiModelProperty(value = "Unique Bin Identifier assigned by the system")
  public Integer getBinID() {
    return binID;
  }

  public void setBinID(Integer binID) {
    this.binID = binID;
  }

  public BinModel locationID(Integer locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Location Identifier of the owning location
   * @return locationID
  **/
  @ApiModelProperty(value = "Location Identifier of the owning location")
  public Integer getLocationID() {
    return locationID;
  }

  public void setLocationID(Integer locationID) {
    this.locationID = locationID;
  }

  public BinModel binTypeID(Integer binTypeID) {
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

  public BinModel binStatusID(Integer binStatusID) {
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

  public BinModel name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Client specified static bin name
   * @return name
  **/
  @ApiModelProperty(value = "Client specified static bin name")
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
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
    BinModel binModel = (BinModel) o;
    return Objects.equals(this.binID, binModel.binID) &&
        Objects.equals(this.locationID, binModel.locationID) &&
        Objects.equals(this.binTypeID, binModel.binTypeID) &&
        Objects.equals(this.binStatusID, binModel.binStatusID) &&
        Objects.equals(this.name, binModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binID, locationID, binTypeID, binStatusID, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinModel {\n");
    
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
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

