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
 * MozuAppDevContractsDeveloperAccountAppType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsDeveloperAccountAppType {
  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_APP_TYPE_ID = "developerAccountAppTypeId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_APP_TYPE_ID)
  private Integer developerAccountAppTypeId;

  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_TYPE_ID = "developerAccountTypeId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_TYPE_ID)
  private Integer developerAccountTypeId;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_ID = "applicationTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_ID)
  private Integer applicationTypeId;

  public static final String SERIALIZED_NAME_DEV_ACCOUNT_TYPE_ENABLED = "devAccountTypeEnabled";
  @SerializedName(SERIALIZED_NAME_DEV_ACCOUNT_TYPE_ENABLED)
  private Boolean devAccountTypeEnabled;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_NAME = "applicationTypeName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_NAME)
  private String applicationTypeName;

  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_TYPE_NAME = "developerAccountTypeName";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_TYPE_NAME)
  private String developerAccountTypeName;

  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_APP_TYPE_ENABLED = "developerAccountAppTypeEnabled";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_APP_TYPE_ENABLED)
  private Boolean developerAccountAppTypeEnabled;

  public MozuAppDevContractsDeveloperAccountAppType developerAccountAppTypeId(Integer developerAccountAppTypeId) {
    this.developerAccountAppTypeId = developerAccountAppTypeId;
    return this;
  }

   /**
   * Get developerAccountAppTypeId
   * @return developerAccountAppTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeveloperAccountAppTypeId() {
    return developerAccountAppTypeId;
  }

  public void setDeveloperAccountAppTypeId(Integer developerAccountAppTypeId) {
    this.developerAccountAppTypeId = developerAccountAppTypeId;
  }

  public MozuAppDevContractsDeveloperAccountAppType developerAccountTypeId(Integer developerAccountTypeId) {
    this.developerAccountTypeId = developerAccountTypeId;
    return this;
  }

   /**
   * Get developerAccountTypeId
   * @return developerAccountTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeveloperAccountTypeId() {
    return developerAccountTypeId;
  }

  public void setDeveloperAccountTypeId(Integer developerAccountTypeId) {
    this.developerAccountTypeId = developerAccountTypeId;
  }

  public MozuAppDevContractsDeveloperAccountAppType applicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
    return this;
  }

   /**
   * Get applicationTypeId
   * @return applicationTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationTypeId() {
    return applicationTypeId;
  }

  public void setApplicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
  }

  public MozuAppDevContractsDeveloperAccountAppType devAccountTypeEnabled(Boolean devAccountTypeEnabled) {
    this.devAccountTypeEnabled = devAccountTypeEnabled;
    return this;
  }

   /**
   * Get devAccountTypeEnabled
   * @return devAccountTypeEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getDevAccountTypeEnabled() {
    return devAccountTypeEnabled;
  }

  public void setDevAccountTypeEnabled(Boolean devAccountTypeEnabled) {
    this.devAccountTypeEnabled = devAccountTypeEnabled;
  }

  public MozuAppDevContractsDeveloperAccountAppType applicationTypeName(String applicationTypeName) {
    this.applicationTypeName = applicationTypeName;
    return this;
  }

   /**
   * Get applicationTypeName
   * @return applicationTypeName
  **/
  @ApiModelProperty(value = "")
  public String getApplicationTypeName() {
    return applicationTypeName;
  }

  public void setApplicationTypeName(String applicationTypeName) {
    this.applicationTypeName = applicationTypeName;
  }

  public MozuAppDevContractsDeveloperAccountAppType developerAccountTypeName(String developerAccountTypeName) {
    this.developerAccountTypeName = developerAccountTypeName;
    return this;
  }

   /**
   * Get developerAccountTypeName
   * @return developerAccountTypeName
  **/
  @ApiModelProperty(value = "")
  public String getDeveloperAccountTypeName() {
    return developerAccountTypeName;
  }

  public void setDeveloperAccountTypeName(String developerAccountTypeName) {
    this.developerAccountTypeName = developerAccountTypeName;
  }

  public MozuAppDevContractsDeveloperAccountAppType developerAccountAppTypeEnabled(Boolean developerAccountAppTypeEnabled) {
    this.developerAccountAppTypeEnabled = developerAccountAppTypeEnabled;
    return this;
  }

   /**
   * Get developerAccountAppTypeEnabled
   * @return developerAccountAppTypeEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getDeveloperAccountAppTypeEnabled() {
    return developerAccountAppTypeEnabled;
  }

  public void setDeveloperAccountAppTypeEnabled(Boolean developerAccountAppTypeEnabled) {
    this.developerAccountAppTypeEnabled = developerAccountAppTypeEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsDeveloperAccountAppType mozuAppDevContractsDeveloperAccountAppType = (MozuAppDevContractsDeveloperAccountAppType) o;
    return Objects.equals(this.developerAccountAppTypeId, mozuAppDevContractsDeveloperAccountAppType.developerAccountAppTypeId) &&
        Objects.equals(this.developerAccountTypeId, mozuAppDevContractsDeveloperAccountAppType.developerAccountTypeId) &&
        Objects.equals(this.applicationTypeId, mozuAppDevContractsDeveloperAccountAppType.applicationTypeId) &&
        Objects.equals(this.devAccountTypeEnabled, mozuAppDevContractsDeveloperAccountAppType.devAccountTypeEnabled) &&
        Objects.equals(this.applicationTypeName, mozuAppDevContractsDeveloperAccountAppType.applicationTypeName) &&
        Objects.equals(this.developerAccountTypeName, mozuAppDevContractsDeveloperAccountAppType.developerAccountTypeName) &&
        Objects.equals(this.developerAccountAppTypeEnabled, mozuAppDevContractsDeveloperAccountAppType.developerAccountAppTypeEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerAccountAppTypeId, developerAccountTypeId, applicationTypeId, devAccountTypeEnabled, applicationTypeName, developerAccountTypeName, developerAccountAppTypeEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsDeveloperAccountAppType {\n");
    
    sb.append("    developerAccountAppTypeId: ").append(toIndentedString(developerAccountAppTypeId)).append("\n");
    sb.append("    developerAccountTypeId: ").append(toIndentedString(developerAccountTypeId)).append("\n");
    sb.append("    applicationTypeId: ").append(toIndentedString(applicationTypeId)).append("\n");
    sb.append("    devAccountTypeEnabled: ").append(toIndentedString(devAccountTypeEnabled)).append("\n");
    sb.append("    applicationTypeName: ").append(toIndentedString(applicationTypeName)).append("\n");
    sb.append("    developerAccountTypeName: ").append(toIndentedString(developerAccountTypeName)).append("\n");
    sb.append("    developerAccountAppTypeEnabled: ").append(toIndentedString(developerAccountAppTypeEnabled)).append("\n");
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

