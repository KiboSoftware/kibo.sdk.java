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
 * MozuAppDevContractsApplicationCapabilityDomainValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationCapabilityDomainValue {
  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUE_ID = "applicationCapabilityDomainValueId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUE_ID)
  private Integer applicationCapabilityDomainValueId;

  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID1 = "applicationCapabilityDomainId1";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID1)
  private Integer applicationCapabilityDomainId1;

  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID2 = "applicationCapabilityDomainId2";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID2)
  private Integer applicationCapabilityDomainId2;

  public static final String SERIALIZED_NAME_VALUE_NAME = "valueName";
  @SerializedName(SERIALIZED_NAME_VALUE_NAME)
  private String valueName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public MozuAppDevContractsApplicationCapabilityDomainValue applicationCapabilityDomainValueId(Integer applicationCapabilityDomainValueId) {
    this.applicationCapabilityDomainValueId = applicationCapabilityDomainValueId;
    return this;
  }

   /**
   * Get applicationCapabilityDomainValueId
   * @return applicationCapabilityDomainValueId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationCapabilityDomainValueId() {
    return applicationCapabilityDomainValueId;
  }

  public void setApplicationCapabilityDomainValueId(Integer applicationCapabilityDomainValueId) {
    this.applicationCapabilityDomainValueId = applicationCapabilityDomainValueId;
  }

  public MozuAppDevContractsApplicationCapabilityDomainValue applicationCapabilityDomainId1(Integer applicationCapabilityDomainId1) {
    this.applicationCapabilityDomainId1 = applicationCapabilityDomainId1;
    return this;
  }

   /**
   * Get applicationCapabilityDomainId1
   * @return applicationCapabilityDomainId1
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationCapabilityDomainId1() {
    return applicationCapabilityDomainId1;
  }

  public void setApplicationCapabilityDomainId1(Integer applicationCapabilityDomainId1) {
    this.applicationCapabilityDomainId1 = applicationCapabilityDomainId1;
  }

  public MozuAppDevContractsApplicationCapabilityDomainValue applicationCapabilityDomainId2(Integer applicationCapabilityDomainId2) {
    this.applicationCapabilityDomainId2 = applicationCapabilityDomainId2;
    return this;
  }

   /**
   * Get applicationCapabilityDomainId2
   * @return applicationCapabilityDomainId2
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationCapabilityDomainId2() {
    return applicationCapabilityDomainId2;
  }

  public void setApplicationCapabilityDomainId2(Integer applicationCapabilityDomainId2) {
    this.applicationCapabilityDomainId2 = applicationCapabilityDomainId2;
  }

  public MozuAppDevContractsApplicationCapabilityDomainValue valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

   /**
   * Get valueName
   * @return valueName
  **/
  @ApiModelProperty(value = "")
  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }

  public MozuAppDevContractsApplicationCapabilityDomainValue displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationCapabilityDomainValue mozuAppDevContractsApplicationCapabilityDomainValue = (MozuAppDevContractsApplicationCapabilityDomainValue) o;
    return Objects.equals(this.applicationCapabilityDomainValueId, mozuAppDevContractsApplicationCapabilityDomainValue.applicationCapabilityDomainValueId) &&
        Objects.equals(this.applicationCapabilityDomainId1, mozuAppDevContractsApplicationCapabilityDomainValue.applicationCapabilityDomainId1) &&
        Objects.equals(this.applicationCapabilityDomainId2, mozuAppDevContractsApplicationCapabilityDomainValue.applicationCapabilityDomainId2) &&
        Objects.equals(this.valueName, mozuAppDevContractsApplicationCapabilityDomainValue.valueName) &&
        Objects.equals(this.displayName, mozuAppDevContractsApplicationCapabilityDomainValue.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationCapabilityDomainValueId, applicationCapabilityDomainId1, applicationCapabilityDomainId2, valueName, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationCapabilityDomainValue {\n");
    
    sb.append("    applicationCapabilityDomainValueId: ").append(toIndentedString(applicationCapabilityDomainValueId)).append("\n");
    sb.append("    applicationCapabilityDomainId1: ").append(toIndentedString(applicationCapabilityDomainId1)).append("\n");
    sb.append("    applicationCapabilityDomainId2: ").append(toIndentedString(applicationCapabilityDomainId2)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

