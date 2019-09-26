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
import org.threeten.bp.OffsetDateTime;

/**
 * MozuCoreMessagingContractsMessagePublishingContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuCoreMessagingContractsMessagePublishingContext {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_VISIT_ID = "visitId";
  @SerializedName(SERIALIZED_NAME_VISIT_ID)
  private String visitId;

  public static final String SERIALIZED_NAME_INITIATING_APP_ID = "initiatingAppId";
  @SerializedName(SERIALIZED_NAME_INITIATING_APP_ID)
  private String initiatingAppId;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_IS_TEST = "isTest";
  @SerializedName(SERIALIZED_NAME_IS_TEST)
  private Boolean isTest;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_CREATE_BY = "createBy";
  @SerializedName(SERIALIZED_NAME_CREATE_BY)
  private String createBy;

  public static final String SERIALIZED_NAME_DATA_VIEW_MODE = "dataViewMode";
  @SerializedName(SERIALIZED_NAME_DATA_VIEW_MODE)
  private Integer dataViewMode;

  public static final String SERIALIZED_NAME_MOZU_INSTANCE_ID = "mozuInstanceId";
  @SerializedName(SERIALIZED_NAME_MOZU_INSTANCE_ID)
  private String mozuInstanceId;

  public MozuCoreMessagingContractsMessagePublishingContext siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext catalogId(Integer catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @ApiModelProperty(value = "")
  public Integer getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext masterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
    return this;
  }

   /**
   * Get masterCatalogId
   * @return masterCatalogId
  **/
  @ApiModelProperty(value = "")
  public Integer getMasterCatalogId() {
    return masterCatalogId;
  }

  public void setMasterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext tenantId(Integer tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public Integer getTenantId() {
    return tenantId;
  }

  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext localeCode(String localeCode) {
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

  public MozuCoreMessagingContractsMessagePublishingContext currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MozuCoreMessagingContractsMessagePublishingContext userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext visitId(String visitId) {
    this.visitId = visitId;
    return this;
  }

   /**
   * Get visitId
   * @return visitId
  **/
  @ApiModelProperty(value = "")
  public String getVisitId() {
    return visitId;
  }

  public void setVisitId(String visitId) {
    this.visitId = visitId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext initiatingAppId(String initiatingAppId) {
    this.initiatingAppId = initiatingAppId;
    return this;
  }

   /**
   * Get initiatingAppId
   * @return initiatingAppId
  **/
  @ApiModelProperty(value = "")
  public String getInitiatingAppId() {
    return initiatingAppId;
  }

  public void setInitiatingAppId(String initiatingAppId) {
    this.initiatingAppId = initiatingAppId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @ApiModelProperty(value = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public MozuCoreMessagingContractsMessagePublishingContext isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Get isTest
   * @return isTest
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  public MozuCoreMessagingContractsMessagePublishingContext createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public MozuCoreMessagingContractsMessagePublishingContext createBy(String createBy) {
    this.createBy = createBy;
    return this;
  }

   /**
   * Get createBy
   * @return createBy
  **/
  @ApiModelProperty(value = "")
  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public MozuCoreMessagingContractsMessagePublishingContext dataViewMode(Integer dataViewMode) {
    this.dataViewMode = dataViewMode;
    return this;
  }

   /**
   * Get dataViewMode
   * @return dataViewMode
  **/
  @ApiModelProperty(value = "")
  public Integer getDataViewMode() {
    return dataViewMode;
  }

  public void setDataViewMode(Integer dataViewMode) {
    this.dataViewMode = dataViewMode;
  }

   /**
   * Get mozuInstanceId
   * @return mozuInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getMozuInstanceId() {
    return mozuInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreMessagingContractsMessagePublishingContext mozuCoreMessagingContractsMessagePublishingContext = (MozuCoreMessagingContractsMessagePublishingContext) o;
    return Objects.equals(this.siteId, mozuCoreMessagingContractsMessagePublishingContext.siteId) &&
        Objects.equals(this.catalogId, mozuCoreMessagingContractsMessagePublishingContext.catalogId) &&
        Objects.equals(this.masterCatalogId, mozuCoreMessagingContractsMessagePublishingContext.masterCatalogId) &&
        Objects.equals(this.tenantId, mozuCoreMessagingContractsMessagePublishingContext.tenantId) &&
        Objects.equals(this.localeCode, mozuCoreMessagingContractsMessagePublishingContext.localeCode) &&
        Objects.equals(this.currencyCode, mozuCoreMessagingContractsMessagePublishingContext.currencyCode) &&
        Objects.equals(this.userId, mozuCoreMessagingContractsMessagePublishingContext.userId) &&
        Objects.equals(this.customerId, mozuCoreMessagingContractsMessagePublishingContext.customerId) &&
        Objects.equals(this.visitId, mozuCoreMessagingContractsMessagePublishingContext.visitId) &&
        Objects.equals(this.initiatingAppId, mozuCoreMessagingContractsMessagePublishingContext.initiatingAppId) &&
        Objects.equals(this.correlationId, mozuCoreMessagingContractsMessagePublishingContext.correlationId) &&
        Objects.equals(this.isTest, mozuCoreMessagingContractsMessagePublishingContext.isTest) &&
        Objects.equals(this.createDate, mozuCoreMessagingContractsMessagePublishingContext.createDate) &&
        Objects.equals(this.createBy, mozuCoreMessagingContractsMessagePublishingContext.createBy) &&
        Objects.equals(this.dataViewMode, mozuCoreMessagingContractsMessagePublishingContext.dataViewMode) &&
        Objects.equals(this.mozuInstanceId, mozuCoreMessagingContractsMessagePublishingContext.mozuInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, catalogId, masterCatalogId, tenantId, localeCode, currencyCode, userId, customerId, visitId, initiatingAppId, correlationId, isTest, createDate, createBy, dataViewMode, mozuInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreMessagingContractsMessagePublishingContext {\n");
    
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    visitId: ").append(toIndentedString(visitId)).append("\n");
    sb.append("    initiatingAppId: ").append(toIndentedString(initiatingAppId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    dataViewMode: ").append(toIndentedString(dataViewMode)).append("\n");
    sb.append("    mozuInstanceId: ").append(toIndentedString(mozuInstanceId)).append("\n");
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

