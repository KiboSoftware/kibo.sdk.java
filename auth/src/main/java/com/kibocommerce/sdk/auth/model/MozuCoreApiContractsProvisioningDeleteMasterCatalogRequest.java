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
 * MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest tenantId(Integer tenantId) {
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

  public MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest masterCatalogId(Integer masterCatalogId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest mozuCoreApiContractsProvisioningDeleteMasterCatalogRequest = (MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest) o;
    return Objects.equals(this.tenantId, mozuCoreApiContractsProvisioningDeleteMasterCatalogRequest.tenantId) &&
        Objects.equals(this.masterCatalogId, mozuCoreApiContractsProvisioningDeleteMasterCatalogRequest.masterCatalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, masterCatalogId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsProvisioningDeleteMasterCatalogRequest {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
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

