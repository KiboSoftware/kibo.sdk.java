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
import org.threeten.bp.OffsetDateTime;

/**
 * MozuAppDevContractsApplicationTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationTransaction {
  public static final String SERIALIZED_NAME_APPLICATION_TRANSACTION_ID = "applicationTransactionId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TRANSACTION_ID)
  private Integer applicationTransactionId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_ENTITLEMENT_ID = "applicationEntitlementId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ENTITLEMENT_ID)
  private Integer applicationEntitlementId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private Integer localeCode;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "isoCurrencyCode";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transactionDate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private OffsetDateTime transactionDate;

  public static final String SERIALIZED_NAME_TRANSACTION_PRICE = "transactionPrice";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PRICE)
  private Double transactionPrice;

  public static final String SERIALIZED_NAME_TRANSACTION_TAX = "transactionTax";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TAX)
  private Double transactionTax;

  public static final String SERIALIZED_NAME_TRANSACTION_TOTAL = "transactionTotal";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TOTAL)
  private Double transactionTotal;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public MozuAppDevContractsApplicationTransaction applicationTransactionId(Integer applicationTransactionId) {
    this.applicationTransactionId = applicationTransactionId;
    return this;
  }

   /**
   * Get applicationTransactionId
   * @return applicationTransactionId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationTransactionId() {
    return applicationTransactionId;
  }

  public void setApplicationTransactionId(Integer applicationTransactionId) {
    this.applicationTransactionId = applicationTransactionId;
  }

  public MozuAppDevContractsApplicationTransaction applicationId(Integer applicationId) {
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

  public MozuAppDevContractsApplicationTransaction applicationEntitlementId(Integer applicationEntitlementId) {
    this.applicationEntitlementId = applicationEntitlementId;
    return this;
  }

   /**
   * Get applicationEntitlementId
   * @return applicationEntitlementId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationEntitlementId() {
    return applicationEntitlementId;
  }

  public void setApplicationEntitlementId(Integer applicationEntitlementId) {
    this.applicationEntitlementId = applicationEntitlementId;
  }

  public MozuAppDevContractsApplicationTransaction tenantId(Integer tenantId) {
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

  public MozuAppDevContractsApplicationTransaction siteId(Integer siteId) {
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

  public MozuAppDevContractsApplicationTransaction localeCode(Integer localeCode) {
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Get localeCode
   * @return localeCode
  **/
  @ApiModelProperty(value = "")
  public Integer getLocaleCode() {
    return localeCode;
  }

  public void setLocaleCode(Integer localeCode) {
    this.localeCode = localeCode;
  }

  public MozuAppDevContractsApplicationTransaction isoCurrencyCode(String isoCurrencyCode) {
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

  public MozuAppDevContractsApplicationTransaction transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public MozuAppDevContractsApplicationTransaction transactionPrice(Double transactionPrice) {
    this.transactionPrice = transactionPrice;
    return this;
  }

   /**
   * Get transactionPrice
   * @return transactionPrice
  **/
  @ApiModelProperty(value = "")
  public Double getTransactionPrice() {
    return transactionPrice;
  }

  public void setTransactionPrice(Double transactionPrice) {
    this.transactionPrice = transactionPrice;
  }

  public MozuAppDevContractsApplicationTransaction transactionTax(Double transactionTax) {
    this.transactionTax = transactionTax;
    return this;
  }

   /**
   * Get transactionTax
   * @return transactionTax
  **/
  @ApiModelProperty(value = "")
  public Double getTransactionTax() {
    return transactionTax;
  }

  public void setTransactionTax(Double transactionTax) {
    this.transactionTax = transactionTax;
  }

  public MozuAppDevContractsApplicationTransaction transactionTotal(Double transactionTotal) {
    this.transactionTotal = transactionTotal;
    return this;
  }

   /**
   * Get transactionTotal
   * @return transactionTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTransactionTotal() {
    return transactionTotal;
  }

  public void setTransactionTotal(Double transactionTotal) {
    this.transactionTotal = transactionTotal;
  }

  public MozuAppDevContractsApplicationTransaction orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationTransaction mozuAppDevContractsApplicationTransaction = (MozuAppDevContractsApplicationTransaction) o;
    return Objects.equals(this.applicationTransactionId, mozuAppDevContractsApplicationTransaction.applicationTransactionId) &&
        Objects.equals(this.applicationId, mozuAppDevContractsApplicationTransaction.applicationId) &&
        Objects.equals(this.applicationEntitlementId, mozuAppDevContractsApplicationTransaction.applicationEntitlementId) &&
        Objects.equals(this.tenantId, mozuAppDevContractsApplicationTransaction.tenantId) &&
        Objects.equals(this.siteId, mozuAppDevContractsApplicationTransaction.siteId) &&
        Objects.equals(this.localeCode, mozuAppDevContractsApplicationTransaction.localeCode) &&
        Objects.equals(this.isoCurrencyCode, mozuAppDevContractsApplicationTransaction.isoCurrencyCode) &&
        Objects.equals(this.transactionDate, mozuAppDevContractsApplicationTransaction.transactionDate) &&
        Objects.equals(this.transactionPrice, mozuAppDevContractsApplicationTransaction.transactionPrice) &&
        Objects.equals(this.transactionTax, mozuAppDevContractsApplicationTransaction.transactionTax) &&
        Objects.equals(this.transactionTotal, mozuAppDevContractsApplicationTransaction.transactionTotal) &&
        Objects.equals(this.orderNumber, mozuAppDevContractsApplicationTransaction.orderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationTransactionId, applicationId, applicationEntitlementId, tenantId, siteId, localeCode, isoCurrencyCode, transactionDate, transactionPrice, transactionTax, transactionTotal, orderNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationTransaction {\n");
    
    sb.append("    applicationTransactionId: ").append(toIndentedString(applicationTransactionId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationEntitlementId: ").append(toIndentedString(applicationEntitlementId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    transactionPrice: ").append(toIndentedString(transactionPrice)).append("\n");
    sb.append("    transactionTax: ").append(toIndentedString(transactionTax)).append("\n");
    sb.append("    transactionTotal: ").append(toIndentedString(transactionTotal)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
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
