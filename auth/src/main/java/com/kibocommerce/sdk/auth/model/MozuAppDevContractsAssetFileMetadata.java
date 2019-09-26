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
import com.kibocommerce.sdk.auth.model.MozuCoreApiContractsAuditInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsAssetFileMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsAssetFileMetadata {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_CHECK_SUM = "checkSum";
  @SerializedName(SERIALIZED_NAME_CHECK_SUM)
  private String checkSum;

  public static final String SERIALIZED_NAME_SIZE_IN_BYTES = "sizeInBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_BYTES)
  private Long sizeInBytes;

  public static final String SERIALIZED_NAME_IS_FOLDER = "isFolder";
  @SerializedName(SERIALIZED_NAME_IS_FOLDER)
  private Boolean isFolder;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private MozuCoreApiContractsAuditInfo auditInfo = null;

  public MozuAppDevContractsAssetFileMetadata id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MozuAppDevContractsAssetFileMetadata type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MozuAppDevContractsAssetFileMetadata path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MozuAppDevContractsAssetFileMetadata checkSum(String checkSum) {
    this.checkSum = checkSum;
    return this;
  }

   /**
   * Get checkSum
   * @return checkSum
  **/
  @ApiModelProperty(value = "")
  public String getCheckSum() {
    return checkSum;
  }

  public void setCheckSum(String checkSum) {
    this.checkSum = checkSum;
  }

  public MozuAppDevContractsAssetFileMetadata sizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
  }

   /**
   * Get sizeInBytes
   * @return sizeInBytes
  **/
  @ApiModelProperty(value = "")
  public Long getSizeInBytes() {
    return sizeInBytes;
  }

  public void setSizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }

  public MozuAppDevContractsAssetFileMetadata isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * Get isFolder
   * @return isFolder
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public MozuAppDevContractsAssetFileMetadata auditInfo(MozuCoreApiContractsAuditInfo auditInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsAssetFileMetadata mozuAppDevContractsAssetFileMetadata = (MozuAppDevContractsAssetFileMetadata) o;
    return Objects.equals(this.id, mozuAppDevContractsAssetFileMetadata.id) &&
        Objects.equals(this.type, mozuAppDevContractsAssetFileMetadata.type) &&
        Objects.equals(this.path, mozuAppDevContractsAssetFileMetadata.path) &&
        Objects.equals(this.checkSum, mozuAppDevContractsAssetFileMetadata.checkSum) &&
        Objects.equals(this.sizeInBytes, mozuAppDevContractsAssetFileMetadata.sizeInBytes) &&
        Objects.equals(this.isFolder, mozuAppDevContractsAssetFileMetadata.isFolder) &&
        Objects.equals(this.auditInfo, mozuAppDevContractsAssetFileMetadata.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, path, checkSum, sizeInBytes, isFolder, auditInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsAssetFileMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    checkSum: ").append(toIndentedString(checkSum)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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

