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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsPublicFileMetadata;
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsPublicFolderMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsPublicFolderMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsPublicFolderMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FULL_PATH = "fullPath";
  @SerializedName(SERIALIZED_NAME_FULL_PATH)
  private String fullPath;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<MozuAppDevContractsPublicFileMetadata> files = null;

  public static final String SERIALIZED_NAME_SUB_FOLDERS = "subFolders";
  @SerializedName(SERIALIZED_NAME_SUB_FOLDERS)
  private List<MozuAppDevContractsPublicFolderMetadata> subFolders = null;

  public MozuAppDevContractsPublicFolderMetadata name(String name) {
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

  public MozuAppDevContractsPublicFolderMetadata fullPath(String fullPath) {
    this.fullPath = fullPath;
    return this;
  }

   /**
   * Get fullPath
   * @return fullPath
  **/
  @ApiModelProperty(value = "")
  public String getFullPath() {
    return fullPath;
  }

  public void setFullPath(String fullPath) {
    this.fullPath = fullPath;
  }

  public MozuAppDevContractsPublicFolderMetadata files(List<MozuAppDevContractsPublicFileMetadata> files) {
    this.files = files;
    return this;
  }

  public MozuAppDevContractsPublicFolderMetadata addFilesItem(MozuAppDevContractsPublicFileMetadata filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<MozuAppDevContractsPublicFileMetadata>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsPublicFileMetadata> getFiles() {
    return files;
  }

  public void setFiles(List<MozuAppDevContractsPublicFileMetadata> files) {
    this.files = files;
  }

  public MozuAppDevContractsPublicFolderMetadata subFolders(List<MozuAppDevContractsPublicFolderMetadata> subFolders) {
    this.subFolders = subFolders;
    return this;
  }

  public MozuAppDevContractsPublicFolderMetadata addSubFoldersItem(MozuAppDevContractsPublicFolderMetadata subFoldersItem) {
    if (this.subFolders == null) {
      this.subFolders = new ArrayList<MozuAppDevContractsPublicFolderMetadata>();
    }
    this.subFolders.add(subFoldersItem);
    return this;
  }

   /**
   * Get subFolders
   * @return subFolders
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsPublicFolderMetadata> getSubFolders() {
    return subFolders;
  }

  public void setSubFolders(List<MozuAppDevContractsPublicFolderMetadata> subFolders) {
    this.subFolders = subFolders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsPublicFolderMetadata mozuAppDevContractsPublicFolderMetadata = (MozuAppDevContractsPublicFolderMetadata) o;
    return Objects.equals(this.name, mozuAppDevContractsPublicFolderMetadata.name) &&
        Objects.equals(this.fullPath, mozuAppDevContractsPublicFolderMetadata.fullPath) &&
        Objects.equals(this.files, mozuAppDevContractsPublicFolderMetadata.files) &&
        Objects.equals(this.subFolders, mozuAppDevContractsPublicFolderMetadata.subFolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fullPath, files, subFolders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsPublicFolderMetadata {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    subFolders: ").append(toIndentedString(subFolders)).append("\n");
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
