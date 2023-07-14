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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsAssetFileMetadata;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsAssetFileMetadataNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsAssetFileMetadataNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsAssetFileMetadataNode {
  public static final String SERIALIZED_NAME_FULL_PATH = "fullPath";
  @SerializedName(SERIALIZED_NAME_FULL_PATH)
  private String fullPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_PATH = "parentPath";
  @SerializedName(SERIALIZED_NAME_PARENT_PATH)
  private String parentPath;

  public static final String SERIALIZED_NAME_IS_FOLDER = "isFolder";
  @SerializedName(SERIALIZED_NAME_IS_FOLDER)
  private Boolean isFolder;

  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private MozuAppDevContractsAssetFileMetadata content = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<MozuAppDevContractsAssetFileMetadataNode> children = null;

  public MozuAppDevContractsAssetFileMetadataNode fullPath(String fullPath) {
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

  public MozuAppDevContractsAssetFileMetadataNode name(String name) {
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

  public MozuAppDevContractsAssetFileMetadataNode parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Get parentPath
   * @return parentPath
  **/
  @ApiModelProperty(value = "")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public MozuAppDevContractsAssetFileMetadataNode isFolder(Boolean isFolder) {
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

  public MozuAppDevContractsAssetFileMetadataNode hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Get hasChildren
   * @return hasChildren
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasChildren() {
    return hasChildren;
  }

  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }

  public MozuAppDevContractsAssetFileMetadataNode content(MozuAppDevContractsAssetFileMetadata content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsAssetFileMetadata getContent() {
    return content;
  }

  public void setContent(MozuAppDevContractsAssetFileMetadata content) {
    this.content = content;
  }

  public MozuAppDevContractsAssetFileMetadataNode children(List<MozuAppDevContractsAssetFileMetadataNode> children) {
    this.children = children;
    return this;
  }

  public MozuAppDevContractsAssetFileMetadataNode addChildrenItem(MozuAppDevContractsAssetFileMetadataNode childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<MozuAppDevContractsAssetFileMetadataNode>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsAssetFileMetadataNode> getChildren() {
    return children;
  }

  public void setChildren(List<MozuAppDevContractsAssetFileMetadataNode> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsAssetFileMetadataNode mozuAppDevContractsAssetFileMetadataNode = (MozuAppDevContractsAssetFileMetadataNode) o;
    return Objects.equals(this.fullPath, mozuAppDevContractsAssetFileMetadataNode.fullPath) &&
        Objects.equals(this.name, mozuAppDevContractsAssetFileMetadataNode.name) &&
        Objects.equals(this.parentPath, mozuAppDevContractsAssetFileMetadataNode.parentPath) &&
        Objects.equals(this.isFolder, mozuAppDevContractsAssetFileMetadataNode.isFolder) &&
        Objects.equals(this.hasChildren, mozuAppDevContractsAssetFileMetadataNode.hasChildren) &&
        Objects.equals(this.content, mozuAppDevContractsAssetFileMetadataNode.content) &&
        Objects.equals(this.children, mozuAppDevContractsAssetFileMetadataNode.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullPath, name, parentPath, isFolder, hasChildren, content, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsAssetFileMetadataNode {\n");
    
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
