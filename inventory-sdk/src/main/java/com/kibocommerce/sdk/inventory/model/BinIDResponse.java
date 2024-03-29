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
 * Bin ID Response
 */
@ApiModel(description = "Bin ID Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class BinIDResponse {
  public static final String SERIALIZED_NAME_BIN_I_D = "binID";
  @SerializedName(SERIALIZED_NAME_BIN_I_D)
  private Integer binID;

  public BinIDResponse binID(Integer binID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinIDResponse binIDResponse = (BinIDResponse) o;
    return Objects.equals(this.binID, binIDResponse.binID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinIDResponse {\n");
    
    sb.append("    binID: ").append(toIndentedString(binID)).append("\n");
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

