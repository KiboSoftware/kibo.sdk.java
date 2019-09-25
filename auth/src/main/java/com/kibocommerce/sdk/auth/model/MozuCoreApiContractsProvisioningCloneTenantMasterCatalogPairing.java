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
import com.kibocommerce.sdk.auth.model.MozuCoreApiContractsProvisioningCloneTenantCatalogPairing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:21:37.137-05:00[America/Chicago]")
public class MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing {
  public static final String SERIALIZED_NAME_SOURCE_MASTER_CATALOG_ID = "sourceMasterCatalogId";
  @SerializedName(SERIALIZED_NAME_SOURCE_MASTER_CATALOG_ID)
  private Integer sourceMasterCatalogId;

  public static final String SERIALIZED_NAME_TARGET_MASTER_CATALOG_ID = "targetMasterCatalogId";
  @SerializedName(SERIALIZED_NAME_TARGET_MASTER_CATALOG_ID)
  private Integer targetMasterCatalogId;

  public static final String SERIALIZED_NAME_CATALOG_PAIRINGS = "catalogPairings";
  @SerializedName(SERIALIZED_NAME_CATALOG_PAIRINGS)
  private List<MozuCoreApiContractsProvisioningCloneTenantCatalogPairing> catalogPairings = null;

  public MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing sourceMasterCatalogId(Integer sourceMasterCatalogId) {
    this.sourceMasterCatalogId = sourceMasterCatalogId;
    return this;
  }

   /**
   * Get sourceMasterCatalogId
   * @return sourceMasterCatalogId
  **/
  @ApiModelProperty(value = "")
  public Integer getSourceMasterCatalogId() {
    return sourceMasterCatalogId;
  }

  public void setSourceMasterCatalogId(Integer sourceMasterCatalogId) {
    this.sourceMasterCatalogId = sourceMasterCatalogId;
  }

  public MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing targetMasterCatalogId(Integer targetMasterCatalogId) {
    this.targetMasterCatalogId = targetMasterCatalogId;
    return this;
  }

   /**
   * Get targetMasterCatalogId
   * @return targetMasterCatalogId
  **/
  @ApiModelProperty(value = "")
  public Integer getTargetMasterCatalogId() {
    return targetMasterCatalogId;
  }

  public void setTargetMasterCatalogId(Integer targetMasterCatalogId) {
    this.targetMasterCatalogId = targetMasterCatalogId;
  }

  public MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing catalogPairings(List<MozuCoreApiContractsProvisioningCloneTenantCatalogPairing> catalogPairings) {
    this.catalogPairings = catalogPairings;
    return this;
  }

  public MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing addCatalogPairingsItem(MozuCoreApiContractsProvisioningCloneTenantCatalogPairing catalogPairingsItem) {
    if (this.catalogPairings == null) {
      this.catalogPairings = new ArrayList<MozuCoreApiContractsProvisioningCloneTenantCatalogPairing>();
    }
    this.catalogPairings.add(catalogPairingsItem);
    return this;
  }

   /**
   * Get catalogPairings
   * @return catalogPairings
  **/
  @ApiModelProperty(value = "")
  public List<MozuCoreApiContractsProvisioningCloneTenantCatalogPairing> getCatalogPairings() {
    return catalogPairings;
  }

  public void setCatalogPairings(List<MozuCoreApiContractsProvisioningCloneTenantCatalogPairing> catalogPairings) {
    this.catalogPairings = catalogPairings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing mozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing = (MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing) o;
    return Objects.equals(this.sourceMasterCatalogId, mozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing.sourceMasterCatalogId) &&
        Objects.equals(this.targetMasterCatalogId, mozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing.targetMasterCatalogId) &&
        Objects.equals(this.catalogPairings, mozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing.catalogPairings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceMasterCatalogId, targetMasterCatalogId, catalogPairings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsProvisioningCloneTenantMasterCatalogPairing {\n");
    
    sb.append("    sourceMasterCatalogId: ").append(toIndentedString(sourceMasterCatalogId)).append("\n");
    sb.append("    targetMasterCatalogId: ").append(toIndentedString(targetMasterCatalogId)).append("\n");
    sb.append("    catalogPairings: ").append(toIndentedString(catalogPairings)).append("\n");
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
