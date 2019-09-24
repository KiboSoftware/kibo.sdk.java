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
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsPaymentCapabilityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsPaymentCapabilityType {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_CAPABILITY_TYPE_NAME = "capabilityTypeName";
  @SerializedName(SERIALIZED_NAME_CAPABILITY_TYPE_NAME)
  private String capabilityTypeName;

  public static final String SERIALIZED_NAME_IS_IMPLEMENTED = "isImplemented";
  @SerializedName(SERIALIZED_NAME_IS_IMPLEMENTED)
  private Boolean isImplemented;

  public static final String SERIALIZED_NAME_IS_INITIALIZED_BY_DEFAULT = "isInitializedByDefault";
  @SerializedName(SERIALIZED_NAME_IS_INITIALIZED_BY_DEFAULT)
  private Boolean isInitializedByDefault;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public MozuAppDevContractsPaymentCapabilityType countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public MozuAppDevContractsPaymentCapabilityType addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public MozuAppDevContractsPaymentCapabilityType metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public MozuAppDevContractsPaymentCapabilityType capabilityTypeName(String capabilityTypeName) {
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

  public MozuAppDevContractsPaymentCapabilityType isImplemented(Boolean isImplemented) {
    this.isImplemented = isImplemented;
    return this;
  }

   /**
   * Get isImplemented
   * @return isImplemented
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsImplemented() {
    return isImplemented;
  }

  public void setIsImplemented(Boolean isImplemented) {
    this.isImplemented = isImplemented;
  }

  public MozuAppDevContractsPaymentCapabilityType isInitializedByDefault(Boolean isInitializedByDefault) {
    this.isInitializedByDefault = isInitializedByDefault;
    return this;
  }

   /**
   * Get isInitializedByDefault
   * @return isInitializedByDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsInitializedByDefault() {
    return isInitializedByDefault;
  }

  public void setIsInitializedByDefault(Boolean isInitializedByDefault) {
    this.isInitializedByDefault = isInitializedByDefault;
  }

  public MozuAppDevContractsPaymentCapabilityType endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public MozuAppDevContractsPaymentCapabilityType packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsPaymentCapabilityType mozuAppDevContractsPaymentCapabilityType = (MozuAppDevContractsPaymentCapabilityType) o;
    return Objects.equals(this.countries, mozuAppDevContractsPaymentCapabilityType.countries) &&
        Objects.equals(this.metadata, mozuAppDevContractsPaymentCapabilityType.metadata) &&
        Objects.equals(this.capabilityTypeName, mozuAppDevContractsPaymentCapabilityType.capabilityTypeName) &&
        Objects.equals(this.isImplemented, mozuAppDevContractsPaymentCapabilityType.isImplemented) &&
        Objects.equals(this.isInitializedByDefault, mozuAppDevContractsPaymentCapabilityType.isInitializedByDefault) &&
        Objects.equals(this.endpoint, mozuAppDevContractsPaymentCapabilityType.endpoint) &&
        Objects.equals(this.packageId, mozuAppDevContractsPaymentCapabilityType.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, metadata, capabilityTypeName, isImplemented, isInitializedByDefault, endpoint, packageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsPaymentCapabilityType {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    capabilityTypeName: ").append(toIndentedString(capabilityTypeName)).append("\n");
    sb.append("    isImplemented: ").append(toIndentedString(isImplemented)).append("\n");
    sb.append("    isInitializedByDefault: ").append(toIndentedString(isInitializedByDefault)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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

