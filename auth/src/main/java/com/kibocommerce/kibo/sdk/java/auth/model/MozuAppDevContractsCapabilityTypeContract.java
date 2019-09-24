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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuCoreApiContractsAuditInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsCapabilityTypeContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsCapabilityTypeContract {
  public static final String SERIALIZED_NAME_CAPABILITY_TYPE_CONTRACT_ID = "capabilityTypeContractId";
  @SerializedName(SERIALIZED_NAME_CAPABILITY_TYPE_CONTRACT_ID)
  private Integer capabilityTypeContractId;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contractName";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  private String contractName;

  public static final String SERIALIZED_NAME_CONTRACT_DESCRIPTION = "contractDescription";
  @SerializedName(SERIALIZED_NAME_CONTRACT_DESCRIPTION)
  private String contractDescription;

  public static final String SERIALIZED_NAME_CONTRACT_DEFINITION_URL = "contractDefinitionUrl";
  @SerializedName(SERIALIZED_NAME_CONTRACT_DEFINITION_URL)
  private String contractDefinitionUrl;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private MozuCoreApiContractsAuditInfo auditInfo = null;

  public static final String SERIALIZED_NAME_CAPABILITY_TYPE_ID = "capabilityTypeId";
  @SerializedName(SERIALIZED_NAME_CAPABILITY_TYPE_ID)
  private Integer capabilityTypeId;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private String verb;

  public MozuAppDevContractsCapabilityTypeContract capabilityTypeContractId(Integer capabilityTypeContractId) {
    this.capabilityTypeContractId = capabilityTypeContractId;
    return this;
  }

   /**
   * Get capabilityTypeContractId
   * @return capabilityTypeContractId
  **/
  @ApiModelProperty(value = "")
  public Integer getCapabilityTypeContractId() {
    return capabilityTypeContractId;
  }

  public void setCapabilityTypeContractId(Integer capabilityTypeContractId) {
    this.capabilityTypeContractId = capabilityTypeContractId;
  }

  public MozuAppDevContractsCapabilityTypeContract contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @ApiModelProperty(value = "")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public MozuAppDevContractsCapabilityTypeContract contractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
    return this;
  }

   /**
   * Get contractDescription
   * @return contractDescription
  **/
  @ApiModelProperty(value = "")
  public String getContractDescription() {
    return contractDescription;
  }

  public void setContractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
  }

  public MozuAppDevContractsCapabilityTypeContract contractDefinitionUrl(String contractDefinitionUrl) {
    this.contractDefinitionUrl = contractDefinitionUrl;
    return this;
  }

   /**
   * Get contractDefinitionUrl
   * @return contractDefinitionUrl
  **/
  @ApiModelProperty(value = "")
  public String getContractDefinitionUrl() {
    return contractDefinitionUrl;
  }

  public void setContractDefinitionUrl(String contractDefinitionUrl) {
    this.contractDefinitionUrl = contractDefinitionUrl;
  }

  public MozuAppDevContractsCapabilityTypeContract auditInfo(MozuCoreApiContractsAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @ApiModelProperty(value = "")
  public MozuCoreApiContractsAuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(MozuCoreApiContractsAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }

  public MozuAppDevContractsCapabilityTypeContract capabilityTypeId(Integer capabilityTypeId) {
    this.capabilityTypeId = capabilityTypeId;
    return this;
  }

   /**
   * Get capabilityTypeId
   * @return capabilityTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getCapabilityTypeId() {
    return capabilityTypeId;
  }

  public void setCapabilityTypeId(Integer capabilityTypeId) {
    this.capabilityTypeId = capabilityTypeId;
  }

  public MozuAppDevContractsCapabilityTypeContract isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public MozuAppDevContractsCapabilityTypeContract verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Get verb
   * @return verb
  **/
  @ApiModelProperty(value = "")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsCapabilityTypeContract mozuAppDevContractsCapabilityTypeContract = (MozuAppDevContractsCapabilityTypeContract) o;
    return Objects.equals(this.capabilityTypeContractId, mozuAppDevContractsCapabilityTypeContract.capabilityTypeContractId) &&
        Objects.equals(this.contractName, mozuAppDevContractsCapabilityTypeContract.contractName) &&
        Objects.equals(this.contractDescription, mozuAppDevContractsCapabilityTypeContract.contractDescription) &&
        Objects.equals(this.contractDefinitionUrl, mozuAppDevContractsCapabilityTypeContract.contractDefinitionUrl) &&
        Objects.equals(this.auditInfo, mozuAppDevContractsCapabilityTypeContract.auditInfo) &&
        Objects.equals(this.capabilityTypeId, mozuAppDevContractsCapabilityTypeContract.capabilityTypeId) &&
        Objects.equals(this.isRequired, mozuAppDevContractsCapabilityTypeContract.isRequired) &&
        Objects.equals(this.verb, mozuAppDevContractsCapabilityTypeContract.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilityTypeContractId, contractName, contractDescription, contractDefinitionUrl, auditInfo, capabilityTypeId, isRequired, verb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsCapabilityTypeContract {\n");
    
    sb.append("    capabilityTypeContractId: ").append(toIndentedString(capabilityTypeContractId)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    contractDescription: ").append(toIndentedString(contractDescription)).append("\n");
    sb.append("    contractDefinitionUrl: ").append(toIndentedString(contractDefinitionUrl)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    capabilityTypeId: ").append(toIndentedString(capabilityTypeId)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

