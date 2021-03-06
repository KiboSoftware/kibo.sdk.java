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
 * MozuTenantContractsDomain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuTenantContractsDomain {
  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_INFRASTRUCTURE_RECORD = "isInfrastructureRecord";
  @SerializedName(SERIALIZED_NAME_IS_INFRASTRUCTURE_RECORD)
  private Boolean isInfrastructureRecord;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ASSIGNED = "isSystemAssigned";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ASSIGNED)
  private Boolean isSystemAssigned;

  public static final String SERIALIZED_NAME_IS_DOMAIN_MANAGED = "isDomainManaged";
  @SerializedName(SERIALIZED_NAME_IS_DOMAIN_MANAGED)
  private Boolean isDomainManaged;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_C_NAME = "cName";
  @SerializedName(SERIALIZED_NAME_C_NAME)
  private String cName;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public MozuTenantContractsDomain domainName(String domainName) {
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

  public MozuTenantContractsDomain zone(String zone) {
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

  public MozuTenantContractsDomain createDate(OffsetDateTime createDate) {
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

  public MozuTenantContractsDomain updateDate(OffsetDateTime updateDate) {
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

  public MozuTenantContractsDomain isPrimary(Boolean isPrimary) {
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

  public MozuTenantContractsDomain isInfrastructureRecord(Boolean isInfrastructureRecord) {
    this.isInfrastructureRecord = isInfrastructureRecord;
    return this;
  }

   /**
   * Get isInfrastructureRecord
   * @return isInfrastructureRecord
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsInfrastructureRecord() {
    return isInfrastructureRecord;
  }

  public void setIsInfrastructureRecord(Boolean isInfrastructureRecord) {
    this.isInfrastructureRecord = isInfrastructureRecord;
  }

  public MozuTenantContractsDomain isSystemAssigned(Boolean isSystemAssigned) {
    this.isSystemAssigned = isSystemAssigned;
    return this;
  }

   /**
   * Get isSystemAssigned
   * @return isSystemAssigned
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsSystemAssigned() {
    return isSystemAssigned;
  }

  public void setIsSystemAssigned(Boolean isSystemAssigned) {
    this.isSystemAssigned = isSystemAssigned;
  }

  public MozuTenantContractsDomain isDomainManaged(Boolean isDomainManaged) {
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

  public MozuTenantContractsDomain ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public MozuTenantContractsDomain cName(String cName) {
    this.cName = cName;
    return this;
  }

   /**
   * Get cName
   * @return cName
  **/
  @ApiModelProperty(value = "")
  public String getCName() {
    return cName;
  }

  public void setCName(String cName) {
    this.cName = cName;
  }

  public MozuTenantContractsDomain tenantId(Integer tenantId) {
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

  public MozuTenantContractsDomain siteId(Integer siteId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuTenantContractsDomain mozuTenantContractsDomain = (MozuTenantContractsDomain) o;
    return Objects.equals(this.domainName, mozuTenantContractsDomain.domainName) &&
        Objects.equals(this.zone, mozuTenantContractsDomain.zone) &&
        Objects.equals(this.createDate, mozuTenantContractsDomain.createDate) &&
        Objects.equals(this.updateDate, mozuTenantContractsDomain.updateDate) &&
        Objects.equals(this.isPrimary, mozuTenantContractsDomain.isPrimary) &&
        Objects.equals(this.isInfrastructureRecord, mozuTenantContractsDomain.isInfrastructureRecord) &&
        Objects.equals(this.isSystemAssigned, mozuTenantContractsDomain.isSystemAssigned) &&
        Objects.equals(this.isDomainManaged, mozuTenantContractsDomain.isDomainManaged) &&
        Objects.equals(this.ipAddress, mozuTenantContractsDomain.ipAddress) &&
        Objects.equals(this.cName, mozuTenantContractsDomain.cName) &&
        Objects.equals(this.tenantId, mozuTenantContractsDomain.tenantId) &&
        Objects.equals(this.siteId, mozuTenantContractsDomain.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, zone, createDate, updateDate, isPrimary, isInfrastructureRecord, isSystemAssigned, isDomainManaged, ipAddress, cName, tenantId, siteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuTenantContractsDomain {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isInfrastructureRecord: ").append(toIndentedString(isInfrastructureRecord)).append("\n");
    sb.append("    isSystemAssigned: ").append(toIndentedString(isSystemAssigned)).append("\n");
    sb.append("    isDomainManaged: ").append(toIndentedString(isDomainManaged)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    cName: ").append(toIndentedString(cName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

