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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsAppVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsApplicationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationSummary {
  public static final String SERIALIZED_NAME_PARENT_NAME = "parentName";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  private String parentName;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_ID = "applicationTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_ID)
  private Integer applicationTypeId;

  public static final String SERIALIZED_NAME_RELEASE_PACKAGE_ID = "releasePackageId";
  @SerializedName(SERIALIZED_NAME_RELEASE_PACKAGE_ID)
  private Integer releasePackageId;

  public static final String SERIALIZED_NAME_RELEASE_PACKAGE_NAME = "releasePackageName";
  @SerializedName(SERIALIZED_NAME_RELEASE_PACKAGE_NAME)
  private String releasePackageName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_NAMESPACE = "applicationNamespace";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAMESPACE)
  private String applicationNamespace;

  public static final String SERIALIZED_NAME_APPLICATION_VERSION = "applicationVersion";
  @SerializedName(SERIALIZED_NAME_APPLICATION_VERSION)
  private MozuAppDevContractsAppVersion applicationVersion = null;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_ID = "applicationStatusId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_ID)
  private Integer applicationStatusId;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_NAME = "applicationStatusName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_NAME)
  private String applicationStatusName;

  public static final String SERIALIZED_NAME_HAS_VERSIONS = "hasVersions";
  @SerializedName(SERIALIZED_NAME_HAS_VERSIONS)
  private Boolean hasVersions;

  public static final String SERIALIZED_NAME_APP_SCHEME_VERSION = "appSchemeVersion";
  @SerializedName(SERIALIZED_NAME_APP_SCHEME_VERSION)
  private Integer appSchemeVersion;

  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_PARENT_APP_KEY = "parentAppKey";
  @SerializedName(SERIALIZED_NAME_PARENT_APP_KEY)
  private String parentAppKey;

  public static final String SERIALIZED_NAME_UPDATE_PARENT_APP_KEY = "updateParentAppKey";
  @SerializedName(SERIALIZED_NAME_UPDATE_PARENT_APP_KEY)
  private String updateParentAppKey;

  public static final String SERIALIZED_NAME_UPDATE_AVAILABLE = "updateAvailable";
  @SerializedName(SERIALIZED_NAME_UPDATE_AVAILABLE)
  private Boolean updateAvailable;

  public MozuAppDevContractsApplicationSummary parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Get parentName
   * @return parentName
  **/
  @ApiModelProperty(value = "")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public MozuAppDevContractsApplicationSummary applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public MozuAppDevContractsApplicationSummary applicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
    return this;
  }

   /**
   * Get applicationTypeId
   * @return applicationTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationTypeId() {
    return applicationTypeId;
  }

  public void setApplicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
  }

  public MozuAppDevContractsApplicationSummary releasePackageId(Integer releasePackageId) {
    this.releasePackageId = releasePackageId;
    return this;
  }

   /**
   * Get releasePackageId
   * @return releasePackageId
  **/
  @ApiModelProperty(value = "")
  public Integer getReleasePackageId() {
    return releasePackageId;
  }

  public void setReleasePackageId(Integer releasePackageId) {
    this.releasePackageId = releasePackageId;
  }

  public MozuAppDevContractsApplicationSummary releasePackageName(String releasePackageName) {
    this.releasePackageName = releasePackageName;
    return this;
  }

   /**
   * Get releasePackageName
   * @return releasePackageName
  **/
  @ApiModelProperty(value = "")
  public String getReleasePackageName() {
    return releasePackageName;
  }

  public void setReleasePackageName(String releasePackageName) {
    this.releasePackageName = releasePackageName;
  }

  public MozuAppDevContractsApplicationSummary name(String name) {
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

  public MozuAppDevContractsApplicationSummary applicationNamespace(String applicationNamespace) {
    this.applicationNamespace = applicationNamespace;
    return this;
  }

   /**
   * Get applicationNamespace
   * @return applicationNamespace
  **/
  @ApiModelProperty(value = "")
  public String getApplicationNamespace() {
    return applicationNamespace;
  }

  public void setApplicationNamespace(String applicationNamespace) {
    this.applicationNamespace = applicationNamespace;
  }

  public MozuAppDevContractsApplicationSummary applicationVersion(MozuAppDevContractsAppVersion applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsAppVersion getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(MozuAppDevContractsAppVersion applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public MozuAppDevContractsApplicationSummary applicationStatusId(Integer applicationStatusId) {
    this.applicationStatusId = applicationStatusId;
    return this;
  }

   /**
   * Get applicationStatusId
   * @return applicationStatusId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationStatusId() {
    return applicationStatusId;
  }

  public void setApplicationStatusId(Integer applicationStatusId) {
    this.applicationStatusId = applicationStatusId;
  }

  public MozuAppDevContractsApplicationSummary appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public MozuAppDevContractsApplicationSummary applicationStatusName(String applicationStatusName) {
    this.applicationStatusName = applicationStatusName;
    return this;
  }

   /**
   * Get applicationStatusName
   * @return applicationStatusName
  **/
  @ApiModelProperty(value = "")
  public String getApplicationStatusName() {
    return applicationStatusName;
  }

  public void setApplicationStatusName(String applicationStatusName) {
    this.applicationStatusName = applicationStatusName;
  }

  public MozuAppDevContractsApplicationSummary hasVersions(Boolean hasVersions) {
    this.hasVersions = hasVersions;
    return this;
  }

   /**
   * Get hasVersions
   * @return hasVersions
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasVersions() {
    return hasVersions;
  }

  public void setHasVersions(Boolean hasVersions) {
    this.hasVersions = hasVersions;
  }

  public MozuAppDevContractsApplicationSummary appSchemeVersion(Integer appSchemeVersion) {
    this.appSchemeVersion = appSchemeVersion;
    return this;
  }

   /**
   * Get appSchemeVersion
   * @return appSchemeVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getAppSchemeVersion() {
    return appSchemeVersion;
  }

  public void setAppSchemeVersion(Integer appSchemeVersion) {
    this.appSchemeVersion = appSchemeVersion;
  }

  public MozuAppDevContractsApplicationSummary appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  @ApiModelProperty(value = "")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public MozuAppDevContractsApplicationSummary parentAppKey(String parentAppKey) {
    this.parentAppKey = parentAppKey;
    return this;
  }

   /**
   * Get parentAppKey
   * @return parentAppKey
  **/
  @ApiModelProperty(value = "")
  public String getParentAppKey() {
    return parentAppKey;
  }

  public void setParentAppKey(String parentAppKey) {
    this.parentAppKey = parentAppKey;
  }

  public MozuAppDevContractsApplicationSummary updateParentAppKey(String updateParentAppKey) {
    this.updateParentAppKey = updateParentAppKey;
    return this;
  }

   /**
   * Get updateParentAppKey
   * @return updateParentAppKey
  **/
  @ApiModelProperty(value = "")
  public String getUpdateParentAppKey() {
    return updateParentAppKey;
  }

  public void setUpdateParentAppKey(String updateParentAppKey) {
    this.updateParentAppKey = updateParentAppKey;
  }

  public MozuAppDevContractsApplicationSummary updateAvailable(Boolean updateAvailable) {
    this.updateAvailable = updateAvailable;
    return this;
  }

   /**
   * Get updateAvailable
   * @return updateAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean getUpdateAvailable() {
    return updateAvailable;
  }

  public void setUpdateAvailable(Boolean updateAvailable) {
    this.updateAvailable = updateAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationSummary mozuAppDevContractsApplicationSummary = (MozuAppDevContractsApplicationSummary) o;
    return Objects.equals(this.parentName, mozuAppDevContractsApplicationSummary.parentName) &&
        Objects.equals(this.applicationId, mozuAppDevContractsApplicationSummary.applicationId) &&
        Objects.equals(this.applicationTypeId, mozuAppDevContractsApplicationSummary.applicationTypeId) &&
        Objects.equals(this.releasePackageId, mozuAppDevContractsApplicationSummary.releasePackageId) &&
        Objects.equals(this.releasePackageName, mozuAppDevContractsApplicationSummary.releasePackageName) &&
        Objects.equals(this.name, mozuAppDevContractsApplicationSummary.name) &&
        Objects.equals(this.applicationNamespace, mozuAppDevContractsApplicationSummary.applicationNamespace) &&
        Objects.equals(this.applicationVersion, mozuAppDevContractsApplicationSummary.applicationVersion) &&
        Objects.equals(this.applicationStatusId, mozuAppDevContractsApplicationSummary.applicationStatusId) &&
        Objects.equals(this.appId, mozuAppDevContractsApplicationSummary.appId) &&
        Objects.equals(this.applicationStatusName, mozuAppDevContractsApplicationSummary.applicationStatusName) &&
        Objects.equals(this.hasVersions, mozuAppDevContractsApplicationSummary.hasVersions) &&
        Objects.equals(this.appSchemeVersion, mozuAppDevContractsApplicationSummary.appSchemeVersion) &&
        Objects.equals(this.appKey, mozuAppDevContractsApplicationSummary.appKey) &&
        Objects.equals(this.parentAppKey, mozuAppDevContractsApplicationSummary.parentAppKey) &&
        Objects.equals(this.updateParentAppKey, mozuAppDevContractsApplicationSummary.updateParentAppKey) &&
        Objects.equals(this.updateAvailable, mozuAppDevContractsApplicationSummary.updateAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentName, applicationId, applicationTypeId, releasePackageId, releasePackageName, name, applicationNamespace, applicationVersion, applicationStatusId, appId, applicationStatusName, hasVersions, appSchemeVersion, appKey, parentAppKey, updateParentAppKey, updateAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationSummary {\n");
    
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationTypeId: ").append(toIndentedString(applicationTypeId)).append("\n");
    sb.append("    releasePackageId: ").append(toIndentedString(releasePackageId)).append("\n");
    sb.append("    releasePackageName: ").append(toIndentedString(releasePackageName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationNamespace: ").append(toIndentedString(applicationNamespace)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationStatusId: ").append(toIndentedString(applicationStatusId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    applicationStatusName: ").append(toIndentedString(applicationStatusName)).append("\n");
    sb.append("    hasVersions: ").append(toIndentedString(hasVersions)).append("\n");
    sb.append("    appSchemeVersion: ").append(toIndentedString(appSchemeVersion)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    parentAppKey: ").append(toIndentedString(parentAppKey)).append("\n");
    sb.append("    updateParentAppKey: ").append(toIndentedString(updateParentAppKey)).append("\n");
    sb.append("    updateAvailable: ").append(toIndentedString(updateAvailable)).append("\n");
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

