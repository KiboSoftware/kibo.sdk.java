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
 * MozuAppDevContractsDevAccountProdTenant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsDevAccountProdTenant {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_ID = "developerAccountId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_ID)
  private Integer developerAccountId;

  public static final String SERIALIZED_NAME_PRODUCTION_TENANT_ID = "productionTenantId";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_TENANT_ID)
  private Integer productionTenantId;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private OffsetDateTime beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public MozuAppDevContractsDevAccountProdTenant id(Integer id) {
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

  public MozuAppDevContractsDevAccountProdTenant developerAccountId(Integer developerAccountId) {
    this.developerAccountId = developerAccountId;
    return this;
  }

   /**
   * Get developerAccountId
   * @return developerAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeveloperAccountId() {
    return developerAccountId;
  }

  public void setDeveloperAccountId(Integer developerAccountId) {
    this.developerAccountId = developerAccountId;
  }

  public MozuAppDevContractsDevAccountProdTenant productionTenantId(Integer productionTenantId) {
    this.productionTenantId = productionTenantId;
    return this;
  }

   /**
   * Get productionTenantId
   * @return productionTenantId
  **/
  @ApiModelProperty(value = "")
  public Integer getProductionTenantId() {
    return productionTenantId;
  }

  public void setProductionTenantId(Integer productionTenantId) {
    this.productionTenantId = productionTenantId;
  }

  public MozuAppDevContractsDevAccountProdTenant beginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Get beginDate
   * @return beginDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(OffsetDateTime beginDate) {
    this.beginDate = beginDate;
  }

  public MozuAppDevContractsDevAccountProdTenant endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsDevAccountProdTenant mozuAppDevContractsDevAccountProdTenant = (MozuAppDevContractsDevAccountProdTenant) o;
    return Objects.equals(this.id, mozuAppDevContractsDevAccountProdTenant.id) &&
        Objects.equals(this.developerAccountId, mozuAppDevContractsDevAccountProdTenant.developerAccountId) &&
        Objects.equals(this.productionTenantId, mozuAppDevContractsDevAccountProdTenant.productionTenantId) &&
        Objects.equals(this.beginDate, mozuAppDevContractsDevAccountProdTenant.beginDate) &&
        Objects.equals(this.endDate, mozuAppDevContractsDevAccountProdTenant.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, developerAccountId, productionTenantId, beginDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsDevAccountProdTenant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    developerAccountId: ").append(toIndentedString(developerAccountId)).append("\n");
    sb.append("    productionTenantId: ").append(toIndentedString(productionTenantId)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
