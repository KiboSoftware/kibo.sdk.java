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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsApplicationCapabilityDomainValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsApplicationCapabilityDomain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationCapabilityDomain {
  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID = "applicationCapabilityDomainId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_ID)
  private Integer applicationCapabilityDomainId;

  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_TYPE_ID = "applicationCapabilityTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_TYPE_ID)
  private Integer applicationCapabilityTypeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUES1 = "applicationCapabilityDomainValues1";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUES1)
  private List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues1 = null;

  public static final String SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUES2 = "applicationCapabilityDomainValues2";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CAPABILITY_DOMAIN_VALUES2)
  private List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues2 = null;

  public MozuAppDevContractsApplicationCapabilityDomain applicationCapabilityDomainId(Integer applicationCapabilityDomainId) {
    this.applicationCapabilityDomainId = applicationCapabilityDomainId;
    return this;
  }

   /**
   * Get applicationCapabilityDomainId
   * @return applicationCapabilityDomainId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationCapabilityDomainId() {
    return applicationCapabilityDomainId;
  }

  public void setApplicationCapabilityDomainId(Integer applicationCapabilityDomainId) {
    this.applicationCapabilityDomainId = applicationCapabilityDomainId;
  }

  public MozuAppDevContractsApplicationCapabilityDomain applicationCapabilityTypeId(Integer applicationCapabilityTypeId) {
    this.applicationCapabilityTypeId = applicationCapabilityTypeId;
    return this;
  }

   /**
   * Get applicationCapabilityTypeId
   * @return applicationCapabilityTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationCapabilityTypeId() {
    return applicationCapabilityTypeId;
  }

  public void setApplicationCapabilityTypeId(Integer applicationCapabilityTypeId) {
    this.applicationCapabilityTypeId = applicationCapabilityTypeId;
  }

  public MozuAppDevContractsApplicationCapabilityDomain name(String name) {
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

  public MozuAppDevContractsApplicationCapabilityDomain applicationCapabilityDomainValues1(List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues1) {
    this.applicationCapabilityDomainValues1 = applicationCapabilityDomainValues1;
    return this;
  }

  public MozuAppDevContractsApplicationCapabilityDomain addApplicationCapabilityDomainValues1Item(MozuAppDevContractsApplicationCapabilityDomainValue applicationCapabilityDomainValues1Item) {
    if (this.applicationCapabilityDomainValues1 == null) {
      this.applicationCapabilityDomainValues1 = new ArrayList<MozuAppDevContractsApplicationCapabilityDomainValue>();
    }
    this.applicationCapabilityDomainValues1.add(applicationCapabilityDomainValues1Item);
    return this;
  }

   /**
   * Get applicationCapabilityDomainValues1
   * @return applicationCapabilityDomainValues1
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsApplicationCapabilityDomainValue> getApplicationCapabilityDomainValues1() {
    return applicationCapabilityDomainValues1;
  }

  public void setApplicationCapabilityDomainValues1(List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues1) {
    this.applicationCapabilityDomainValues1 = applicationCapabilityDomainValues1;
  }

  public MozuAppDevContractsApplicationCapabilityDomain applicationCapabilityDomainValues2(List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues2) {
    this.applicationCapabilityDomainValues2 = applicationCapabilityDomainValues2;
    return this;
  }

  public MozuAppDevContractsApplicationCapabilityDomain addApplicationCapabilityDomainValues2Item(MozuAppDevContractsApplicationCapabilityDomainValue applicationCapabilityDomainValues2Item) {
    if (this.applicationCapabilityDomainValues2 == null) {
      this.applicationCapabilityDomainValues2 = new ArrayList<MozuAppDevContractsApplicationCapabilityDomainValue>();
    }
    this.applicationCapabilityDomainValues2.add(applicationCapabilityDomainValues2Item);
    return this;
  }

   /**
   * Get applicationCapabilityDomainValues2
   * @return applicationCapabilityDomainValues2
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsApplicationCapabilityDomainValue> getApplicationCapabilityDomainValues2() {
    return applicationCapabilityDomainValues2;
  }

  public void setApplicationCapabilityDomainValues2(List<MozuAppDevContractsApplicationCapabilityDomainValue> applicationCapabilityDomainValues2) {
    this.applicationCapabilityDomainValues2 = applicationCapabilityDomainValues2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationCapabilityDomain mozuAppDevContractsApplicationCapabilityDomain = (MozuAppDevContractsApplicationCapabilityDomain) o;
    return Objects.equals(this.applicationCapabilityDomainId, mozuAppDevContractsApplicationCapabilityDomain.applicationCapabilityDomainId) &&
        Objects.equals(this.applicationCapabilityTypeId, mozuAppDevContractsApplicationCapabilityDomain.applicationCapabilityTypeId) &&
        Objects.equals(this.name, mozuAppDevContractsApplicationCapabilityDomain.name) &&
        Objects.equals(this.applicationCapabilityDomainValues1, mozuAppDevContractsApplicationCapabilityDomain.applicationCapabilityDomainValues1) &&
        Objects.equals(this.applicationCapabilityDomainValues2, mozuAppDevContractsApplicationCapabilityDomain.applicationCapabilityDomainValues2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationCapabilityDomainId, applicationCapabilityTypeId, name, applicationCapabilityDomainValues1, applicationCapabilityDomainValues2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationCapabilityDomain {\n");
    
    sb.append("    applicationCapabilityDomainId: ").append(toIndentedString(applicationCapabilityDomainId)).append("\n");
    sb.append("    applicationCapabilityTypeId: ").append(toIndentedString(applicationCapabilityTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationCapabilityDomainValues1: ").append(toIndentedString(applicationCapabilityDomainValues1)).append("\n");
    sb.append("    applicationCapabilityDomainValues2: ").append(toIndentedString(applicationCapabilityDomainValues2)).append("\n");
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

