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
import com.kibocommerce.sdk.auth.model.MozuCoreApiContractsAuditInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsApplicationLicense
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationLicense {
  public static final String SERIALIZED_NAME_APPLICATION_LICENSE_ID = "applicationLicenseId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_LICENSE_ID)
  private Integer applicationLicenseId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_LICENSE_TYPE_ID = "applicationLicenseTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_LICENSE_TYPE_ID)
  private Integer applicationLicenseTypeId;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_APPLICATION_PRICE = "applicationPrice";
  @SerializedName(SERIALIZED_NAME_APPLICATION_PRICE)
  private Double applicationPrice;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "isoCurrencyCode";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private MozuCoreApiContractsAuditInfo auditInfo = null;

  public MozuAppDevContractsApplicationLicense applicationLicenseId(Integer applicationLicenseId) {
    this.applicationLicenseId = applicationLicenseId;
    return this;
  }

   /**
   * Get applicationLicenseId
   * @return applicationLicenseId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationLicenseId() {
    return applicationLicenseId;
  }

  public void setApplicationLicenseId(Integer applicationLicenseId) {
    this.applicationLicenseId = applicationLicenseId;
  }

  public MozuAppDevContractsApplicationLicense applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public MozuAppDevContractsApplicationLicense applicationLicenseTypeId(Integer applicationLicenseTypeId) {
    this.applicationLicenseTypeId = applicationLicenseTypeId;
    return this;
  }

   /**
   * Get applicationLicenseTypeId
   * @return applicationLicenseTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationLicenseTypeId() {
    return applicationLicenseTypeId;
  }

  public void setApplicationLicenseTypeId(Integer applicationLicenseTypeId) {
    this.applicationLicenseTypeId = applicationLicenseTypeId;
  }

  public MozuAppDevContractsApplicationLicense localeCode(String localeCode) {
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Get localeCode
   * @return localeCode
  **/
  @ApiModelProperty(value = "")
  public String getLocaleCode() {
    return localeCode;
  }

  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }

  public MozuAppDevContractsApplicationLicense applicationPrice(Double applicationPrice) {
    this.applicationPrice = applicationPrice;
    return this;
  }

   /**
   * Get applicationPrice
   * @return applicationPrice
  **/
  @ApiModelProperty(value = "")
  public Double getApplicationPrice() {
    return applicationPrice;
  }

  public void setApplicationPrice(Double applicationPrice) {
    this.applicationPrice = applicationPrice;
  }

  public MozuAppDevContractsApplicationLicense isoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * Get isoCurrencyCode
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(value = "")
  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }

  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }

  public MozuAppDevContractsApplicationLicense auditInfo(MozuCoreApiContractsAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @ApiModelProperty(value = "")
  public MozuCoreApiContractsAuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(MozuCoreApiContractsAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationLicense mozuAppDevContractsApplicationLicense = (MozuAppDevContractsApplicationLicense) o;
    return Objects.equals(this.applicationLicenseId, mozuAppDevContractsApplicationLicense.applicationLicenseId) &&
        Objects.equals(this.applicationId, mozuAppDevContractsApplicationLicense.applicationId) &&
        Objects.equals(this.applicationLicenseTypeId, mozuAppDevContractsApplicationLicense.applicationLicenseTypeId) &&
        Objects.equals(this.localeCode, mozuAppDevContractsApplicationLicense.localeCode) &&
        Objects.equals(this.applicationPrice, mozuAppDevContractsApplicationLicense.applicationPrice) &&
        Objects.equals(this.isoCurrencyCode, mozuAppDevContractsApplicationLicense.isoCurrencyCode) &&
        Objects.equals(this.auditInfo, mozuAppDevContractsApplicationLicense.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLicenseId, applicationId, applicationLicenseTypeId, localeCode, applicationPrice, isoCurrencyCode, auditInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationLicense {\n");
    
    sb.append("    applicationLicenseId: ").append(toIndentedString(applicationLicenseId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationLicenseTypeId: ").append(toIndentedString(applicationLicenseTypeId)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    applicationPrice: ").append(toIndentedString(applicationPrice)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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

