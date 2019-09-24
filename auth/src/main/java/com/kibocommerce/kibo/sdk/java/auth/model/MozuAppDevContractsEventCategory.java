/*
 * Kibo AppDev Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.kibo.sdk.java.auth.model;

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
 * MozuAppDevContractsEventCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsEventCategory {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_API_VERSION_NUMBER = "apiVersionNumber";
  @SerializedName(SERIALIZED_NAME_API_VERSION_NUMBER)
  private String apiVersionNumber;

  public MozuAppDevContractsEventCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MozuAppDevContractsEventCategory apiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
    return this;
  }

   /**
   * Get apiVersionNumber
   * @return apiVersionNumber
  **/
  @ApiModelProperty(value = "")
  public String getApiVersionNumber() {
    return apiVersionNumber;
  }

  public void setApiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsEventCategory mozuAppDevContractsEventCategory = (MozuAppDevContractsEventCategory) o;
    return Objects.equals(this.name, mozuAppDevContractsEventCategory.name) &&
        Objects.equals(this.apiVersionNumber, mozuAppDevContractsEventCategory.apiVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, apiVersionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsEventCategory {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiVersionNumber: ").append(toIndentedString(apiVersionNumber)).append("\n");
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

