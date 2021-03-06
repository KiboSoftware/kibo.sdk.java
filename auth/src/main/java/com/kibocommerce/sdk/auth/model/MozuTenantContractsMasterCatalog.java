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
import com.kibocommerce.sdk.auth.model.MozuTenantContractsCatalog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * MozuTenantContractsMasterCatalog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuTenantContractsMasterCatalog {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE_CODE = "defaultLocaleCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE_CODE)
  private String defaultLocaleCode;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY_CODE)
  private String defaultCurrencyCode;

  public static final String SERIALIZED_NAME_CATALOGS = "catalogs";
  @SerializedName(SERIALIZED_NAME_CATALOGS)
  private List<MozuTenantContractsCatalog> catalogs = null;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_DELETE_DATE = "deleteDate";
  @SerializedName(SERIALIZED_NAME_DELETE_DATE)
  private OffsetDateTime deleteDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MozuTenantContractsMasterCatalog tenantId(Integer tenantId) {
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

  public MozuTenantContractsMasterCatalog defaultLocaleCode(String defaultLocaleCode) {
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

  public MozuTenantContractsMasterCatalog defaultCurrencyCode(String defaultCurrencyCode) {
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

  public MozuTenantContractsMasterCatalog catalogs(List<MozuTenantContractsCatalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public MozuTenantContractsMasterCatalog addCatalogsItem(MozuTenantContractsCatalog catalogsItem) {
    if (this.catalogs == null) {
      this.catalogs = new ArrayList<MozuTenantContractsCatalog>();
    }
    this.catalogs.add(catalogsItem);
    return this;
  }

   /**
   * Get catalogs
   * @return catalogs
  **/
  @ApiModelProperty(value = "")
  public List<MozuTenantContractsCatalog> getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(List<MozuTenantContractsCatalog> catalogs) {
    this.catalogs = catalogs;
  }

  public MozuTenantContractsMasterCatalog createDate(OffsetDateTime createDate) {
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

  public MozuTenantContractsMasterCatalog isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public MozuTenantContractsMasterCatalog deleteDate(OffsetDateTime deleteDate) {
    this.deleteDate = deleteDate;
    return this;
  }

   /**
   * Get deleteDate
   * @return deleteDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDeleteDate() {
    return deleteDate;
  }

  public void setDeleteDate(OffsetDateTime deleteDate) {
    this.deleteDate = deleteDate;
  }

  public MozuTenantContractsMasterCatalog updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public MozuTenantContractsMasterCatalog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MozuTenantContractsMasterCatalog id(Integer id) {
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

  public MozuTenantContractsMasterCatalog name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuTenantContractsMasterCatalog mozuTenantContractsMasterCatalog = (MozuTenantContractsMasterCatalog) o;
    return Objects.equals(this.tenantId, mozuTenantContractsMasterCatalog.tenantId) &&
        Objects.equals(this.defaultLocaleCode, mozuTenantContractsMasterCatalog.defaultLocaleCode) &&
        Objects.equals(this.defaultCurrencyCode, mozuTenantContractsMasterCatalog.defaultCurrencyCode) &&
        Objects.equals(this.catalogs, mozuTenantContractsMasterCatalog.catalogs) &&
        Objects.equals(this.createDate, mozuTenantContractsMasterCatalog.createDate) &&
        Objects.equals(this.isDeleted, mozuTenantContractsMasterCatalog.isDeleted) &&
        Objects.equals(this.deleteDate, mozuTenantContractsMasterCatalog.deleteDate) &&
        Objects.equals(this.updateDate, mozuTenantContractsMasterCatalog.updateDate) &&
        Objects.equals(this.status, mozuTenantContractsMasterCatalog.status) &&
        Objects.equals(this.id, mozuTenantContractsMasterCatalog.id) &&
        Objects.equals(this.name, mozuTenantContractsMasterCatalog.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, defaultLocaleCode, defaultCurrencyCode, catalogs, createDate, isDeleted, deleteDate, updateDate, status, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuTenantContractsMasterCatalog {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    defaultLocaleCode: ").append(toIndentedString(defaultLocaleCode)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

