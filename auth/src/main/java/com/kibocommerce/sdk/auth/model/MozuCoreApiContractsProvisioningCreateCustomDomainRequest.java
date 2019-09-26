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
 * MozuCoreApiContractsProvisioningCreateCustomDomainRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuCoreApiContractsProvisioningCreateCustomDomainRequest {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_DOMAIN_MANAGED = "isDomainManaged";
  @SerializedName(SERIALIZED_NAME_IS_DOMAIN_MANAGED)
  private Boolean isDomainManaged;

  public MozuCoreApiContractsProvisioningCreateCustomDomainRequest domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @ApiModelProperty(value = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public MozuCoreApiContractsProvisioningCreateCustomDomainRequest zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @ApiModelProperty(value = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public MozuCoreApiContractsProvisioningCreateCustomDomainRequest isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public MozuCoreApiContractsProvisioningCreateCustomDomainRequest isDomainManaged(Boolean isDomainManaged) {
    this.isDomainManaged = isDomainManaged;
    return this;
  }

   /**
   * Get isDomainManaged
   * @return isDomainManaged
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDomainManaged() {
    return isDomainManaged;
  }

  public void setIsDomainManaged(Boolean isDomainManaged) {
    this.isDomainManaged = isDomainManaged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsProvisioningCreateCustomDomainRequest mozuCoreApiContractsProvisioningCreateCustomDomainRequest = (MozuCoreApiContractsProvisioningCreateCustomDomainRequest) o;
    return Objects.equals(this.domainName, mozuCoreApiContractsProvisioningCreateCustomDomainRequest.domainName) &&
        Objects.equals(this.zone, mozuCoreApiContractsProvisioningCreateCustomDomainRequest.zone) &&
        Objects.equals(this.isPrimary, mozuCoreApiContractsProvisioningCreateCustomDomainRequest.isPrimary) &&
        Objects.equals(this.isDomainManaged, mozuCoreApiContractsProvisioningCreateCustomDomainRequest.isDomainManaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, zone, isPrimary, isDomainManaged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsProvisioningCreateCustomDomainRequest {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isDomainManaged: ").append(toIndentedString(isDomainManaged)).append("\n");
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

