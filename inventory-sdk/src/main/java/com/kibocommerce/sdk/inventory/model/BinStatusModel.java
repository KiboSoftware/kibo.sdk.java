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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Status of Bin
 */
@ApiModel(description = "Status of Bin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class BinStatusModel {
  public static final String SERIALIZED_NAME_BIN_STATUS_I_D = "binStatusID";
  @SerializedName(SERIALIZED_NAME_BIN_STATUS_I_D)
  private Integer binStatusID;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BinStatusModel binStatusID(Integer binStatusID) {
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

  public BinStatusModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Bin Status Description
   * @return description
  **/
  @ApiModelProperty(value = "Bin Status Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinStatusModel binStatusModel = (BinStatusModel) o;
    return Objects.equals(this.binStatusID, binStatusModel.binStatusID) &&
        Objects.equals(this.description, binStatusModel.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binStatusID, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinStatusModel {\n");
    
    sb.append("    binStatusID: ").append(toIndentedString(binStatusID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
