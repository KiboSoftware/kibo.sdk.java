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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * UpdateBinsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:31:33.449-05:00[America/Chicago]")
public class UpdateBinsResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_NUMBER_AFFECTED = "numberAffected";
  @SerializedName(SERIALIZED_NAME_NUMBER_AFFECTED)
  private Integer numberAffected;

  public UpdateBinsResponse numberAffected(Integer numberAffected) {
    this.numberAffected = numberAffected;
    return this;
  }

   /**
   * Number of affected bins
   * @return numberAffected
  **/
  @ApiModelProperty(value = "Number of affected bins")
  public Integer getNumberAffected() {
    return numberAffected;
  }

  public void setNumberAffected(Integer numberAffected) {
    this.numberAffected = numberAffected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBinsResponse updateBinsResponse = (UpdateBinsResponse) o;
    return Objects.equals(this.numberAffected, updateBinsResponse.numberAffected) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberAffected, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBinsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    numberAffected: ").append(toIndentedString(numberAffected)).append("\n");
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
