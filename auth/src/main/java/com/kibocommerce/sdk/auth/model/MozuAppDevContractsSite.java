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
 * MozuAppDevContractsSite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:21:37.137-05:00[America/Chicago]")
public class MozuAppDevContractsSite {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE_CODE = "defaultLocaleCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE_CODE)
  private String defaultLocaleCode;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY_CODE)
  private String defaultCurrencyCode;

  public static final String SERIALIZED_NAME_IS_MOZU_RENDERED = "isMozuRendered";
  @SerializedName(SERIALIZED_NAME_IS_MOZU_RENDERED)
  private Boolean isMozuRendered;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public MozuAppDevContractsSite id(Integer id) {
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

  public MozuAppDevContractsSite tenantId(Integer tenantId) {
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

  public MozuAppDevContractsSite masterCatalogId(Integer masterCatalogId) {
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

  public MozuAppDevContractsSite catalogId(Integer catalogId) {
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

  public MozuAppDevContractsSite name(String name) {
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

  public MozuAppDevContractsSite countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public MozuAppDevContractsSite defaultLocaleCode(String defaultLocaleCode) {
    this.defaultLocaleCode = defaultLocaleCode;
    return this;
  }

   /**
   * Get defaultLocaleCode
   * @return defaultLocaleCode
  **/
  @ApiModelProperty(value = "")
  public String getDefaultLocaleCode() {
    return defaultLocaleCode;
  }

  public void setDefaultLocaleCode(String defaultLocaleCode) {
    this.defaultLocaleCode = defaultLocaleCode;
  }

  public MozuAppDevContractsSite defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * Get defaultCurrencyCode
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "")
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }

  public MozuAppDevContractsSite isMozuRendered(Boolean isMozuRendered) {
    this.isMozuRendered = isMozuRendered;
    return this;
  }

   /**
   * Get isMozuRendered
   * @return isMozuRendered
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsMozuRendered() {
    return isMozuRendered;
  }

  public void setIsMozuRendered(Boolean isMozuRendered) {
    this.isMozuRendered = isMozuRendered;
  }

  public MozuAppDevContractsSite domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsSite mozuAppDevContractsSite = (MozuAppDevContractsSite) o;
    return Objects.equals(this.id, mozuAppDevContractsSite.id) &&
        Objects.equals(this.tenantId, mozuAppDevContractsSite.tenantId) &&
        Objects.equals(this.masterCatalogId, mozuAppDevContractsSite.masterCatalogId) &&
        Objects.equals(this.catalogId, mozuAppDevContractsSite.catalogId) &&
        Objects.equals(this.name, mozuAppDevContractsSite.name) &&
        Objects.equals(this.countryCode, mozuAppDevContractsSite.countryCode) &&
        Objects.equals(this.defaultLocaleCode, mozuAppDevContractsSite.defaultLocaleCode) &&
        Objects.equals(this.defaultCurrencyCode, mozuAppDevContractsSite.defaultCurrencyCode) &&
        Objects.equals(this.isMozuRendered, mozuAppDevContractsSite.isMozuRendered) &&
        Objects.equals(this.domain, mozuAppDevContractsSite.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, masterCatalogId, catalogId, name, countryCode, defaultLocaleCode, defaultCurrencyCode, isMozuRendered, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsSite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    defaultLocaleCode: ").append(toIndentedString(defaultLocaleCode)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    isMozuRendered: ").append(toIndentedString(isMozuRendered)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
