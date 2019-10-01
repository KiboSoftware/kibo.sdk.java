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


package com.kibocommerce.sdk.auth.model;

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
 * MozuAppDevContractsCapabilityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsCapabilityType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CAPABILITY_TYPE_NAME = "capabilityTypeName";
  @SerializedName(SERIALIZED_NAME_CAPABILITY_TYPE_NAME)
  private String capabilityTypeName;

  public static final String SERIALIZED_NAME_CAPABILITY_TYPE_LABEL = "capabilityTypeLabel";
  @SerializedName(SERIALIZED_NAME_CAPABILITY_TYPE_LABEL)
  private String capabilityTypeLabel;

  public static final String SERIALIZED_NAME_API_VERSION_NUMBER = "apiVersionNumber";
  @SerializedName(SERIALIZED_NAME_API_VERSION_NUMBER)
  private String apiVersionNumber;

  public MozuAppDevContractsCapabilityType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MozuAppDevContractsCapabilityType capabilityTypeName(String capabilityTypeName) {
    this.capabilityTypeName = capabilityTypeName;
    return this;
  }

   /**
   * Get capabilityTypeName
   * @return capabilityTypeName
  **/
  @ApiModelProperty(value = "")
  public String getCapabilityTypeName() {
    return capabilityTypeName;
  }

  public void setCapabilityTypeName(String capabilityTypeName) {
    this.capabilityTypeName = capabilityTypeName;
  }

  public MozuAppDevContractsCapabilityType capabilityTypeLabel(String capabilityTypeLabel) {
    this.capabilityTypeLabel = capabilityTypeLabel;
    return this;
  }

   /**
   * Get capabilityTypeLabel
   * @return capabilityTypeLabel
  **/
  @ApiModelProperty(value = "")
  public String getCapabilityTypeLabel() {
    return capabilityTypeLabel;
  }

  public void setCapabilityTypeLabel(String capabilityTypeLabel) {
    this.capabilityTypeLabel = capabilityTypeLabel;
  }

  public MozuAppDevContractsCapabilityType apiVersionNumber(String apiVersionNumber) {
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
    MozuAppDevContractsCapabilityType mozuAppDevContractsCapabilityType = (MozuAppDevContractsCapabilityType) o;
    return Objects.equals(this.id, mozuAppDevContractsCapabilityType.id) &&
        Objects.equals(this.capabilityTypeName, mozuAppDevContractsCapabilityType.capabilityTypeName) &&
        Objects.equals(this.capabilityTypeLabel, mozuAppDevContractsCapabilityType.capabilityTypeLabel) &&
        Objects.equals(this.apiVersionNumber, mozuAppDevContractsCapabilityType.apiVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, capabilityTypeName, capabilityTypeLabel, apiVersionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsCapabilityType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    capabilityTypeName: ").append(toIndentedString(capabilityTypeName)).append("\n");
    sb.append("    capabilityTypeLabel: ").append(toIndentedString(capabilityTypeLabel)).append("\n");
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

