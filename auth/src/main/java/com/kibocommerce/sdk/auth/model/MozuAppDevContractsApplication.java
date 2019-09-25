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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsAppVersion;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsChangeNote;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:21:37.137-05:00[America/Chicago]")
public class MozuAppDevContractsApplication {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_DEVELOPER_ACCOUNT_ID = "developerAccountId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ACCOUNT_ID)
  private Integer developerAccountId;

  public static final String SERIALIZED_NAME_APP_SCHEME_VERSION = "appSchemeVersion";
  @SerializedName(SERIALIZED_NAME_APP_SCHEME_VERSION)
  private Integer appSchemeVersion;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APPLICATION_LICENSE_TYPE_ID = "applicationLicenseTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_LICENSE_TYPE_ID)
  private Integer applicationLicenseTypeId;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_ID = "applicationStatusId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_ID)
  private Integer applicationStatusId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_APP_VERSION = "appVersion";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private MozuAppDevContractsAppVersion appVersion = null;

  public static final String SERIALIZED_NAME_EXTENDS_APPLICATION = "extendsApplication";
  @SerializedName(SERIALIZED_NAME_EXTENDS_APPLICATION)
  private Integer extendsApplication;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_SHARED_SECRET = "sharedSecret";
  @SerializedName(SERIALIZED_NAME_SHARED_SECRET)
  private String sharedSecret;

  public static final String SERIALIZED_NAME_VALID_APPLICATION_STATUS_ID_LIST = "validApplicationStatusIdList";
  @SerializedName(SERIALIZED_NAME_VALID_APPLICATION_STATUS_ID_LIST)
  private List<Integer> validApplicationStatusIdList = null;

  public static final String SERIALIZED_NAME_CHANGE_NOTES = "changeNotes";
  @SerializedName(SERIALIZED_NAME_CHANGE_NOTES)
  private List<MozuAppDevContractsChangeNote> changeNotes = null;

  public static final String SERIALIZED_NAME_API_VERSION_NUMBER = "apiVersionNumber";
  @SerializedName(SERIALIZED_NAME_API_VERSION_NUMBER)
  private String apiVersionNumber;

  public static final String SERIALIZED_NAME_API_MAJOR_VERSION_NUMBER = "apiMajorVersionNumber";
  @SerializedName(SERIALIZED_NAME_API_MAJOR_VERSION_NUMBER)
  private Integer apiMajorVersionNumber;

  public static final String SERIALIZED_NAME_IS_NAMESPACE_LOCKED = "isNamespaceLocked";
  @SerializedName(SERIALIZED_NAME_IS_NAMESPACE_LOCKED)
  private Boolean isNamespaceLocked;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_ID = "applicationTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_ID)
  private Integer applicationTypeId;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_NAME = "applicationTypeName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_NAME)
  private String applicationTypeName;

  public static final String SERIALIZED_NAME_RELEASE_PACKAGE_ID = "releasePackageId";
  @SerializedName(SERIALIZED_NAME_RELEASE_PACKAGE_ID)
  private Integer releasePackageId;

  public static final String SERIALIZED_NAME_INTERNAL_APP_ID = "internalAppId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_APP_ID)
  private String internalAppId;

  public static final String SERIALIZED_NAME_IS_EXTENSION_CERTIFIED = "isExtensionCertified";
  @SerializedName(SERIALIZED_NAME_IS_EXTENSION_CERTIFIED)
  private Boolean isExtensionCertified;

  public MozuAppDevContractsApplication applicationId(Integer applicationId) {
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

  public MozuAppDevContractsApplication developerAccountId(Integer developerAccountId) {
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

  public MozuAppDevContractsApplication appSchemeVersion(Integer appSchemeVersion) {
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

  public MozuAppDevContractsApplication appId(String appId) {
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

  public MozuAppDevContractsApplication applicationLicenseTypeId(Integer applicationLicenseTypeId) {
    this.applicationLicenseTypeId = applicationLicenseTypeId;
    return this;
  }

   /**
   * Get applicationLicenseTypeId
   * @return applicationLicenseTypeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationLicenseTypeId() {
    return applicationLicenseTypeId;
  }

  public void setApplicationLicenseTypeId(Integer applicationLicenseTypeId) {
    this.applicationLicenseTypeId = applicationLicenseTypeId;
  }

  public MozuAppDevContractsApplication applicationStatusId(Integer applicationStatusId) {
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

  public MozuAppDevContractsApplication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MozuAppDevContractsApplication namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public MozuAppDevContractsApplication appVersion(MozuAppDevContractsAppVersion appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsAppVersion getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(MozuAppDevContractsAppVersion appVersion) {
    this.appVersion = appVersion;
  }

  public MozuAppDevContractsApplication extendsApplication(Integer extendsApplication) {
    this.extendsApplication = extendsApplication;
    return this;
  }

   /**
   * Get extendsApplication
   * @return extendsApplication
  **/
  @ApiModelProperty(value = "")
  public Integer getExtendsApplication() {
    return extendsApplication;
  }

  public void setExtendsApplication(Integer extendsApplication) {
    this.extendsApplication = extendsApplication;
  }

  public MozuAppDevContractsApplication isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public MozuAppDevContractsApplication isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public MozuAppDevContractsApplication sharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
    return this;
  }

   /**
   * Get sharedSecret
   * @return sharedSecret
  **/
  @ApiModelProperty(value = "")
  public String getSharedSecret() {
    return sharedSecret;
  }

  public void setSharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
  }

  public MozuAppDevContractsApplication validApplicationStatusIdList(List<Integer> validApplicationStatusIdList) {
    this.validApplicationStatusIdList = validApplicationStatusIdList;
    return this;
  }

  public MozuAppDevContractsApplication addValidApplicationStatusIdListItem(Integer validApplicationStatusIdListItem) {
    if (this.validApplicationStatusIdList == null) {
      this.validApplicationStatusIdList = new ArrayList<Integer>();
    }
    this.validApplicationStatusIdList.add(validApplicationStatusIdListItem);
    return this;
  }

   /**
   * Get validApplicationStatusIdList
   * @return validApplicationStatusIdList
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getValidApplicationStatusIdList() {
    return validApplicationStatusIdList;
  }

  public void setValidApplicationStatusIdList(List<Integer> validApplicationStatusIdList) {
    this.validApplicationStatusIdList = validApplicationStatusIdList;
  }

  public MozuAppDevContractsApplication changeNotes(List<MozuAppDevContractsChangeNote> changeNotes) {
    this.changeNotes = changeNotes;
    return this;
  }

  public MozuAppDevContractsApplication addChangeNotesItem(MozuAppDevContractsChangeNote changeNotesItem) {
    if (this.changeNotes == null) {
      this.changeNotes = new ArrayList<MozuAppDevContractsChangeNote>();
    }
    this.changeNotes.add(changeNotesItem);
    return this;
  }

   /**
   * Get changeNotes
   * @return changeNotes
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsChangeNote> getChangeNotes() {
    return changeNotes;
  }

  public void setChangeNotes(List<MozuAppDevContractsChangeNote> changeNotes) {
    this.changeNotes = changeNotes;
  }

  public MozuAppDevContractsApplication apiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
    return this;
  }

   /**
   * Get apiVersionNumber
   * @return apiVersionNumber
  **/
  @ApiModelProperty(value = "")
  public String getApiVersionNumber() {
    return apiVersionNumber;
  }

  public void setApiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
  }

  public MozuAppDevContractsApplication apiMajorVersionNumber(Integer apiMajorVersionNumber) {
    this.apiMajorVersionNumber = apiMajorVersionNumber;
    return this;
  }

   /**
   * Get apiMajorVersionNumber
   * @return apiMajorVersionNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getApiMajorVersionNumber() {
    return apiMajorVersionNumber;
  }

  public void setApiMajorVersionNumber(Integer apiMajorVersionNumber) {
    this.apiMajorVersionNumber = apiMajorVersionNumber;
  }

  public MozuAppDevContractsApplication isNamespaceLocked(Boolean isNamespaceLocked) {
    this.isNamespaceLocked = isNamespaceLocked;
    return this;
  }

   /**
   * Get isNamespaceLocked
   * @return isNamespaceLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsNamespaceLocked() {
    return isNamespaceLocked;
  }

  public void setIsNamespaceLocked(Boolean isNamespaceLocked) {
    this.isNamespaceLocked = isNamespaceLocked;
  }

  public MozuAppDevContractsApplication name(String name) {
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

  public MozuAppDevContractsApplication applicationTypeId(Integer applicationTypeId) {
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

  public MozuAppDevContractsApplication applicationTypeName(String applicationTypeName) {
    this.applicationTypeName = applicationTypeName;
    return this;
  }

   /**
   * Get applicationTypeName
   * @return applicationTypeName
  **/
  @ApiModelProperty(value = "")
  public String getApplicationTypeName() {
    return applicationTypeName;
  }

  public void setApplicationTypeName(String applicationTypeName) {
    this.applicationTypeName = applicationTypeName;
  }

  public MozuAppDevContractsApplication releasePackageId(Integer releasePackageId) {
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

  public MozuAppDevContractsApplication internalAppId(String internalAppId) {
    this.internalAppId = internalAppId;
    return this;
  }

   /**
   * Get internalAppId
   * @return internalAppId
  **/
  @ApiModelProperty(value = "")
  public String getInternalAppId() {
    return internalAppId;
  }

  public void setInternalAppId(String internalAppId) {
    this.internalAppId = internalAppId;
  }

  public MozuAppDevContractsApplication isExtensionCertified(Boolean isExtensionCertified) {
    this.isExtensionCertified = isExtensionCertified;
    return this;
  }

   /**
   * Get isExtensionCertified
   * @return isExtensionCertified
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsExtensionCertified() {
    return isExtensionCertified;
  }

  public void setIsExtensionCertified(Boolean isExtensionCertified) {
    this.isExtensionCertified = isExtensionCertified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplication mozuAppDevContractsApplication = (MozuAppDevContractsApplication) o;
    return Objects.equals(this.applicationId, mozuAppDevContractsApplication.applicationId) &&
        Objects.equals(this.developerAccountId, mozuAppDevContractsApplication.developerAccountId) &&
        Objects.equals(this.appSchemeVersion, mozuAppDevContractsApplication.appSchemeVersion) &&
        Objects.equals(this.appId, mozuAppDevContractsApplication.appId) &&
        Objects.equals(this.applicationLicenseTypeId, mozuAppDevContractsApplication.applicationLicenseTypeId) &&
        Objects.equals(this.applicationStatusId, mozuAppDevContractsApplication.applicationStatusId) &&
        Objects.equals(this.description, mozuAppDevContractsApplication.description) &&
        Objects.equals(this.namespace, mozuAppDevContractsApplication.namespace) &&
        Objects.equals(this.appVersion, mozuAppDevContractsApplication.appVersion) &&
        Objects.equals(this.extendsApplication, mozuAppDevContractsApplication.extendsApplication) &&
        Objects.equals(this.isDeleted, mozuAppDevContractsApplication.isDeleted) &&
        Objects.equals(this.isLocked, mozuAppDevContractsApplication.isLocked) &&
        Objects.equals(this.sharedSecret, mozuAppDevContractsApplication.sharedSecret) &&
        Objects.equals(this.validApplicationStatusIdList, mozuAppDevContractsApplication.validApplicationStatusIdList) &&
        Objects.equals(this.changeNotes, mozuAppDevContractsApplication.changeNotes) &&
        Objects.equals(this.apiVersionNumber, mozuAppDevContractsApplication.apiVersionNumber) &&
        Objects.equals(this.apiMajorVersionNumber, mozuAppDevContractsApplication.apiMajorVersionNumber) &&
        Objects.equals(this.isNamespaceLocked, mozuAppDevContractsApplication.isNamespaceLocked) &&
        Objects.equals(this.name, mozuAppDevContractsApplication.name) &&
        Objects.equals(this.applicationTypeId, mozuAppDevContractsApplication.applicationTypeId) &&
        Objects.equals(this.applicationTypeName, mozuAppDevContractsApplication.applicationTypeName) &&
        Objects.equals(this.releasePackageId, mozuAppDevContractsApplication.releasePackageId) &&
        Objects.equals(this.internalAppId, mozuAppDevContractsApplication.internalAppId) &&
        Objects.equals(this.isExtensionCertified, mozuAppDevContractsApplication.isExtensionCertified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, developerAccountId, appSchemeVersion, appId, applicationLicenseTypeId, applicationStatusId, description, namespace, appVersion, extendsApplication, isDeleted, isLocked, sharedSecret, validApplicationStatusIdList, changeNotes, apiVersionNumber, apiMajorVersionNumber, isNamespaceLocked, name, applicationTypeId, applicationTypeName, releasePackageId, internalAppId, isExtensionCertified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplication {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    developerAccountId: ").append(toIndentedString(developerAccountId)).append("\n");
    sb.append("    appSchemeVersion: ").append(toIndentedString(appSchemeVersion)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    applicationLicenseTypeId: ").append(toIndentedString(applicationLicenseTypeId)).append("\n");
    sb.append("    applicationStatusId: ").append(toIndentedString(applicationStatusId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    extendsApplication: ").append(toIndentedString(extendsApplication)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
    sb.append("    validApplicationStatusIdList: ").append(toIndentedString(validApplicationStatusIdList)).append("\n");
    sb.append("    changeNotes: ").append(toIndentedString(changeNotes)).append("\n");
    sb.append("    apiVersionNumber: ").append(toIndentedString(apiVersionNumber)).append("\n");
    sb.append("    apiMajorVersionNumber: ").append(toIndentedString(apiMajorVersionNumber)).append("\n");
    sb.append("    isNamespaceLocked: ").append(toIndentedString(isNamespaceLocked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationTypeId: ").append(toIndentedString(applicationTypeId)).append("\n");
    sb.append("    applicationTypeName: ").append(toIndentedString(applicationTypeName)).append("\n");
    sb.append("    releasePackageId: ").append(toIndentedString(releasePackageId)).append("\n");
    sb.append("    internalAppId: ").append(toIndentedString(internalAppId)).append("\n");
    sb.append("    isExtensionCertified: ").append(toIndentedString(isExtensionCertified)).append("\n");
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
