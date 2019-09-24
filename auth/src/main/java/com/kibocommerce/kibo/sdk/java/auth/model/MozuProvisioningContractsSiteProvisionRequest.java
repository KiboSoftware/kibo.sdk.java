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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuCoreApiContractsProvisioningCreateCatalogRequest;
import com.kibocommerce.kibo.sdk.java.auth.model.MozuCoreApiContractsProvisioningCreateCustomDomainRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuProvisioningContractsSiteProvisionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuProvisioningContractsSiteProvisionRequest {
  public static final String SERIALIZED_NAME_IS_OVERRIDE = "isOverride";
  @SerializedName(SERIALIZED_NAME_IS_OVERRIDE)
  private Boolean isOverride;

  public static final String SERIALIZED_NAME_IS_RETRY = "isRetry";
  @SerializedName(SERIALIZED_NAME_IS_RETRY)
  private Boolean isRetry;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_CATALOG_REQUEST = "catalogRequest";
  @SerializedName(SERIALIZED_NAME_CATALOG_REQUEST)
  private MozuCoreApiContractsProvisioningCreateCatalogRequest catalogRequest = null;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<MozuCoreApiContractsProvisioningCreateCustomDomainRequest> domains = null;

  public static final String SERIALIZED_NAME_IS_MOZU_STOREFRONT = "isMozuStorefront";
  @SerializedName(SERIALIZED_NAME_IS_MOZU_STOREFRONT)
  private Boolean isMozuStorefront;

  public static final String SERIALIZED_NAME_OMS_CATALOG_ID = "omsCatalogId";
  @SerializedName(SERIALIZED_NAME_OMS_CATALOG_ID)
  private Integer omsCatalogId;

  public MozuProvisioningContractsSiteProvisionRequest isOverride(Boolean isOverride) {
    this.isOverride = isOverride;
    return this;
  }

   /**
   * Get isOverride
   * @return isOverride
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsOverride() {
    return isOverride;
  }

  public void setIsOverride(Boolean isOverride) {
    this.isOverride = isOverride;
  }

  public MozuProvisioningContractsSiteProvisionRequest isRetry(Boolean isRetry) {
    this.isRetry = isRetry;
    return this;
  }

   /**
   * Get isRetry
   * @return isRetry
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsRetry() {
    return isRetry;
  }

  public void setIsRetry(Boolean isRetry) {
    this.isRetry = isRetry;
  }

  public MozuProvisioningContractsSiteProvisionRequest tenantId(Integer tenantId) {
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

  public MozuProvisioningContractsSiteProvisionRequest masterCatalogId(Integer masterCatalogId) {
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

  public MozuProvisioningContractsSiteProvisionRequest catalogId(Integer catalogId) {
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

  public MozuProvisioningContractsSiteProvisionRequest catalogRequest(MozuCoreApiContractsProvisioningCreateCatalogRequest catalogRequest) {
    this.catalogRequest = catalogRequest;
    return this;
  }

   /**
   * Get catalogRequest
   * @return catalogRequest
  **/
  @ApiModelProperty(value = "")
  public MozuCoreApiContractsProvisioningCreateCatalogRequest getCatalogRequest() {
    return catalogRequest;
  }

  public void setCatalogRequest(MozuCoreApiContractsProvisioningCreateCatalogRequest catalogRequest) {
    this.catalogRequest = catalogRequest;
  }

  public MozuProvisioningContractsSiteProvisionRequest siteId(Integer siteId) {
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

  public MozuProvisioningContractsSiteProvisionRequest name(String name) {
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

  public MozuProvisioningContractsSiteProvisionRequest localeCode(String localeCode) {
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

  public MozuProvisioningContractsSiteProvisionRequest countryCode(String countryCode) {
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

  public MozuProvisioningContractsSiteProvisionRequest currencyCode(String currencyCode) {
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

  public MozuProvisioningContractsSiteProvisionRequest domains(List<MozuCoreApiContractsProvisioningCreateCustomDomainRequest> domains) {
    this.domains = domains;
    return this;
  }

  public MozuProvisioningContractsSiteProvisionRequest addDomainsItem(MozuCoreApiContractsProvisioningCreateCustomDomainRequest domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<MozuCoreApiContractsProvisioningCreateCustomDomainRequest>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @ApiModelProperty(value = "")
  public List<MozuCoreApiContractsProvisioningCreateCustomDomainRequest> getDomains() {
    return domains;
  }

  public void setDomains(List<MozuCoreApiContractsProvisioningCreateCustomDomainRequest> domains) {
    this.domains = domains;
  }

  public MozuProvisioningContractsSiteProvisionRequest isMozuStorefront(Boolean isMozuStorefront) {
    this.isMozuStorefront = isMozuStorefront;
    return this;
  }

   /**
   * Get isMozuStorefront
   * @return isMozuStorefront
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsMozuStorefront() {
    return isMozuStorefront;
  }

  public void setIsMozuStorefront(Boolean isMozuStorefront) {
    this.isMozuStorefront = isMozuStorefront;
  }

  public MozuProvisioningContractsSiteProvisionRequest omsCatalogId(Integer omsCatalogId) {
    this.omsCatalogId = omsCatalogId;
    return this;
  }

   /**
   * Get omsCatalogId
   * @return omsCatalogId
  **/
  @ApiModelProperty(value = "")
  public Integer getOmsCatalogId() {
    return omsCatalogId;
  }

  public void setOmsCatalogId(Integer omsCatalogId) {
    this.omsCatalogId = omsCatalogId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuProvisioningContractsSiteProvisionRequest mozuProvisioningContractsSiteProvisionRequest = (MozuProvisioningContractsSiteProvisionRequest) o;
    return Objects.equals(this.isOverride, mozuProvisioningContractsSiteProvisionRequest.isOverride) &&
        Objects.equals(this.isRetry, mozuProvisioningContractsSiteProvisionRequest.isRetry) &&
        Objects.equals(this.tenantId, mozuProvisioningContractsSiteProvisionRequest.tenantId) &&
        Objects.equals(this.masterCatalogId, mozuProvisioningContractsSiteProvisionRequest.masterCatalogId) &&
        Objects.equals(this.catalogId, mozuProvisioningContractsSiteProvisionRequest.catalogId) &&
        Objects.equals(this.catalogRequest, mozuProvisioningContractsSiteProvisionRequest.catalogRequest) &&
        Objects.equals(this.siteId, mozuProvisioningContractsSiteProvisionRequest.siteId) &&
        Objects.equals(this.name, mozuProvisioningContractsSiteProvisionRequest.name) &&
        Objects.equals(this.localeCode, mozuProvisioningContractsSiteProvisionRequest.localeCode) &&
        Objects.equals(this.countryCode, mozuProvisioningContractsSiteProvisionRequest.countryCode) &&
        Objects.equals(this.currencyCode, mozuProvisioningContractsSiteProvisionRequest.currencyCode) &&
        Objects.equals(this.domains, mozuProvisioningContractsSiteProvisionRequest.domains) &&
        Objects.equals(this.isMozuStorefront, mozuProvisioningContractsSiteProvisionRequest.isMozuStorefront) &&
        Objects.equals(this.omsCatalogId, mozuProvisioningContractsSiteProvisionRequest.omsCatalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOverride, isRetry, tenantId, masterCatalogId, catalogId, catalogRequest, siteId, name, localeCode, countryCode, currencyCode, domains, isMozuStorefront, omsCatalogId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuProvisioningContractsSiteProvisionRequest {\n");
    
    sb.append("    isOverride: ").append(toIndentedString(isOverride)).append("\n");
    sb.append("    isRetry: ").append(toIndentedString(isRetry)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogRequest: ").append(toIndentedString(catalogRequest)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    isMozuStorefront: ").append(toIndentedString(isMozuStorefront)).append("\n");
    sb.append("    omsCatalogId: ").append(toIndentedString(omsCatalogId)).append("\n");
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

