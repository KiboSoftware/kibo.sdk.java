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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsApplicationTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * MozuAppDevContractsApplicationEntitlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationEntitlement {
  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_APPLICATION_ENTITLEMENT_ID = "applicationEntitlementId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ENTITLEMENT_ID)
  private Integer applicationEntitlementId;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public static final String SERIALIZED_NAME_APPLICATION_LICENSE_TYPE = "applicationLicenseType";
  @SerializedName(SERIALIZED_NAME_APPLICATION_LICENSE_TYPE)
  private String applicationLicenseType;

  public static final String SERIALIZED_NAME_ENTITLEMENT_STATUS = "entitlementStatus";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENT_STATUS)
  private String entitlementStatus;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effectiveStartDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private OffsetDateTime effectiveStartDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effectiveEndDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private OffsetDateTime effectiveEndDate;

  public static final String SERIALIZED_NAME_APPLICATION_TRANSACTIONS = "applicationTransactions";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TRANSACTIONS)
  private List<MozuAppDevContractsApplicationTransaction> applicationTransactions = null;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "applicationName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_APPLICATION_VERSION = "applicationVersion";
  @SerializedName(SERIALIZED_NAME_APPLICATION_VERSION)
  private String applicationVersion;

  public static final String SERIALIZED_NAME_INSTALLED_BY_FIRST_NAME = "installedByFirstName";
  @SerializedName(SERIALIZED_NAME_INSTALLED_BY_FIRST_NAME)
  private String installedByFirstName;

  public static final String SERIALIZED_NAME_INSTALLED_BY_LAST_NAME = "installedByLastName";
  @SerializedName(SERIALIZED_NAME_INSTALLED_BY_LAST_NAME)
  private String installedByLastName;

  public static final String SERIALIZED_NAME_INSTALLED_DATE = "installedDate";
  @SerializedName(SERIALIZED_NAME_INSTALLED_DATE)
  private OffsetDateTime installedDate;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "packageName";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName;

  public static final String SERIALIZED_NAME_TENANT_NAME = "tenantName";
  @SerializedName(SERIALIZED_NAME_TENANT_NAME)
  private String tenantName;

  public static final String SERIALIZED_NAME_APPLICATION_STATUS_ID = "applicationStatusId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STATUS_ID)
  private String applicationStatusId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_DEV_ACCOUNT_ID = "devAccountId";
  @SerializedName(SERIALIZED_NAME_DEV_ACCOUNT_ID)
  private Integer devAccountId;

  public static final String SERIALIZED_NAME_INSTALLED_APPS_APPLICATION_ID = "installedAppsApplicationId";
  @SerializedName(SERIALIZED_NAME_INSTALLED_APPS_APPLICATION_ID)
  private String installedAppsApplicationId;

  public static final String SERIALIZED_NAME_APP_OWNER_DEV_ACCOUNT_ID = "appOwnerDevAccountId";
  @SerializedName(SERIALIZED_NAME_APP_OWNER_DEV_ACCOUNT_ID)
  private Integer appOwnerDevAccountId;

  public MozuAppDevContractsApplicationEntitlement appKey(String appKey) {
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

  public MozuAppDevContractsApplicationEntitlement applicationEntitlementId(Integer applicationEntitlementId) {
    this.applicationEntitlementId = applicationEntitlementId;
    return this;
  }

   /**
   * Get applicationEntitlementId
   * @return applicationEntitlementId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationEntitlementId() {
    return applicationEntitlementId;
  }

  public void setApplicationEntitlementId(Integer applicationEntitlementId) {
    this.applicationEntitlementId = applicationEntitlementId;
  }

  public MozuAppDevContractsApplicationEntitlement packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }

  public MozuAppDevContractsApplicationEntitlement applicationLicenseType(String applicationLicenseType) {
    this.applicationLicenseType = applicationLicenseType;
    return this;
  }

   /**
   * Get applicationLicenseType
   * @return applicationLicenseType
  **/
  @ApiModelProperty(value = "")
  public String getApplicationLicenseType() {
    return applicationLicenseType;
  }

  public void setApplicationLicenseType(String applicationLicenseType) {
    this.applicationLicenseType = applicationLicenseType;
  }

  public MozuAppDevContractsApplicationEntitlement entitlementStatus(String entitlementStatus) {
    this.entitlementStatus = entitlementStatus;
    return this;
  }

   /**
   * Get entitlementStatus
   * @return entitlementStatus
  **/
  @ApiModelProperty(value = "")
  public String getEntitlementStatus() {
    return entitlementStatus;
  }

  public void setEntitlementStatus(String entitlementStatus) {
    this.entitlementStatus = entitlementStatus;
  }

  public MozuAppDevContractsApplicationEntitlement tenantId(Integer tenantId) {
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

  public MozuAppDevContractsApplicationEntitlement siteId(Integer siteId) {
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

  public MozuAppDevContractsApplicationEntitlement effectiveStartDate(OffsetDateTime effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * Get effectiveStartDate
   * @return effectiveStartDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectiveStartDate() {
    return effectiveStartDate;
  }

  public void setEffectiveStartDate(OffsetDateTime effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }

  public MozuAppDevContractsApplicationEntitlement effectiveEndDate(OffsetDateTime effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * Get effectiveEndDate
   * @return effectiveEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }

  public void setEffectiveEndDate(OffsetDateTime effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }

  public MozuAppDevContractsApplicationEntitlement applicationTransactions(List<MozuAppDevContractsApplicationTransaction> applicationTransactions) {
    this.applicationTransactions = applicationTransactions;
    return this;
  }

  public MozuAppDevContractsApplicationEntitlement addApplicationTransactionsItem(MozuAppDevContractsApplicationTransaction applicationTransactionsItem) {
    if (this.applicationTransactions == null) {
      this.applicationTransactions = new ArrayList<MozuAppDevContractsApplicationTransaction>();
    }
    this.applicationTransactions.add(applicationTransactionsItem);
    return this;
  }

   /**
   * Get applicationTransactions
   * @return applicationTransactions
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsApplicationTransaction> getApplicationTransactions() {
    return applicationTransactions;
  }

  public void setApplicationTransactions(List<MozuAppDevContractsApplicationTransaction> applicationTransactions) {
    this.applicationTransactions = applicationTransactions;
  }

  public MozuAppDevContractsApplicationEntitlement applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @ApiModelProperty(value = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public MozuAppDevContractsApplicationEntitlement applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Get applicationVersion
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public MozuAppDevContractsApplicationEntitlement installedByFirstName(String installedByFirstName) {
    this.installedByFirstName = installedByFirstName;
    return this;
  }

   /**
   * Get installedByFirstName
   * @return installedByFirstName
  **/
  @ApiModelProperty(value = "")
  public String getInstalledByFirstName() {
    return installedByFirstName;
  }

  public void setInstalledByFirstName(String installedByFirstName) {
    this.installedByFirstName = installedByFirstName;
  }

  public MozuAppDevContractsApplicationEntitlement installedByLastName(String installedByLastName) {
    this.installedByLastName = installedByLastName;
    return this;
  }

   /**
   * Get installedByLastName
   * @return installedByLastName
  **/
  @ApiModelProperty(value = "")
  public String getInstalledByLastName() {
    return installedByLastName;
  }

  public void setInstalledByLastName(String installedByLastName) {
    this.installedByLastName = installedByLastName;
  }

  public MozuAppDevContractsApplicationEntitlement installedDate(OffsetDateTime installedDate) {
    this.installedDate = installedDate;
    return this;
  }

   /**
   * Get installedDate
   * @return installedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInstalledDate() {
    return installedDate;
  }

  public void setInstalledDate(OffsetDateTime installedDate) {
    this.installedDate = installedDate;
  }

  public MozuAppDevContractsApplicationEntitlement packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * Get packageName
   * @return packageName
  **/
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public MozuAppDevContractsApplicationEntitlement tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  @ApiModelProperty(value = "")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public MozuAppDevContractsApplicationEntitlement applicationStatusId(String applicationStatusId) {
    this.applicationStatusId = applicationStatusId;
    return this;
  }

   /**
   * Get applicationStatusId
   * @return applicationStatusId
  **/
  @ApiModelProperty(value = "")
  public String getApplicationStatusId() {
    return applicationStatusId;
  }

  public void setApplicationStatusId(String applicationStatusId) {
    this.applicationStatusId = applicationStatusId;
  }

  public MozuAppDevContractsApplicationEntitlement applicationId(Integer applicationId) {
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

  public MozuAppDevContractsApplicationEntitlement devAccountId(Integer devAccountId) {
    this.devAccountId = devAccountId;
    return this;
  }

   /**
   * Get devAccountId
   * @return devAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getDevAccountId() {
    return devAccountId;
  }

  public void setDevAccountId(Integer devAccountId) {
    this.devAccountId = devAccountId;
  }

  public MozuAppDevContractsApplicationEntitlement installedAppsApplicationId(String installedAppsApplicationId) {
    this.installedAppsApplicationId = installedAppsApplicationId;
    return this;
  }

   /**
   * Get installedAppsApplicationId
   * @return installedAppsApplicationId
  **/
  @ApiModelProperty(value = "")
  public String getInstalledAppsApplicationId() {
    return installedAppsApplicationId;
  }

  public void setInstalledAppsApplicationId(String installedAppsApplicationId) {
    this.installedAppsApplicationId = installedAppsApplicationId;
  }

  public MozuAppDevContractsApplicationEntitlement appOwnerDevAccountId(Integer appOwnerDevAccountId) {
    this.appOwnerDevAccountId = appOwnerDevAccountId;
    return this;
  }

   /**
   * Get appOwnerDevAccountId
   * @return appOwnerDevAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getAppOwnerDevAccountId() {
    return appOwnerDevAccountId;
  }

  public void setAppOwnerDevAccountId(Integer appOwnerDevAccountId) {
    this.appOwnerDevAccountId = appOwnerDevAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationEntitlement mozuAppDevContractsApplicationEntitlement = (MozuAppDevContractsApplicationEntitlement) o;
    return Objects.equals(this.appKey, mozuAppDevContractsApplicationEntitlement.appKey) &&
        Objects.equals(this.applicationEntitlementId, mozuAppDevContractsApplicationEntitlement.applicationEntitlementId) &&
        Objects.equals(this.packageId, mozuAppDevContractsApplicationEntitlement.packageId) &&
        Objects.equals(this.applicationLicenseType, mozuAppDevContractsApplicationEntitlement.applicationLicenseType) &&
        Objects.equals(this.entitlementStatus, mozuAppDevContractsApplicationEntitlement.entitlementStatus) &&
        Objects.equals(this.tenantId, mozuAppDevContractsApplicationEntitlement.tenantId) &&
        Objects.equals(this.siteId, mozuAppDevContractsApplicationEntitlement.siteId) &&
        Objects.equals(this.effectiveStartDate, mozuAppDevContractsApplicationEntitlement.effectiveStartDate) &&
        Objects.equals(this.effectiveEndDate, mozuAppDevContractsApplicationEntitlement.effectiveEndDate) &&
        Objects.equals(this.applicationTransactions, mozuAppDevContractsApplicationEntitlement.applicationTransactions) &&
        Objects.equals(this.applicationName, mozuAppDevContractsApplicationEntitlement.applicationName) &&
        Objects.equals(this.applicationVersion, mozuAppDevContractsApplicationEntitlement.applicationVersion) &&
        Objects.equals(this.installedByFirstName, mozuAppDevContractsApplicationEntitlement.installedByFirstName) &&
        Objects.equals(this.installedByLastName, mozuAppDevContractsApplicationEntitlement.installedByLastName) &&
        Objects.equals(this.installedDate, mozuAppDevContractsApplicationEntitlement.installedDate) &&
        Objects.equals(this.packageName, mozuAppDevContractsApplicationEntitlement.packageName) &&
        Objects.equals(this.tenantName, mozuAppDevContractsApplicationEntitlement.tenantName) &&
        Objects.equals(this.applicationStatusId, mozuAppDevContractsApplicationEntitlement.applicationStatusId) &&
        Objects.equals(this.applicationId, mozuAppDevContractsApplicationEntitlement.applicationId) &&
        Objects.equals(this.devAccountId, mozuAppDevContractsApplicationEntitlement.devAccountId) &&
        Objects.equals(this.installedAppsApplicationId, mozuAppDevContractsApplicationEntitlement.installedAppsApplicationId) &&
        Objects.equals(this.appOwnerDevAccountId, mozuAppDevContractsApplicationEntitlement.appOwnerDevAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, applicationEntitlementId, packageId, applicationLicenseType, entitlementStatus, tenantId, siteId, effectiveStartDate, effectiveEndDate, applicationTransactions, applicationName, applicationVersion, installedByFirstName, installedByLastName, installedDate, packageName, tenantName, applicationStatusId, applicationId, devAccountId, installedAppsApplicationId, appOwnerDevAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationEntitlement {\n");
    
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    applicationEntitlementId: ").append(toIndentedString(applicationEntitlementId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    applicationLicenseType: ").append(toIndentedString(applicationLicenseType)).append("\n");
    sb.append("    entitlementStatus: ").append(toIndentedString(entitlementStatus)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    applicationTransactions: ").append(toIndentedString(applicationTransactions)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    installedByFirstName: ").append(toIndentedString(installedByFirstName)).append("\n");
    sb.append("    installedByLastName: ").append(toIndentedString(installedByLastName)).append("\n");
    sb.append("    installedDate: ").append(toIndentedString(installedDate)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    applicationStatusId: ").append(toIndentedString(applicationStatusId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    devAccountId: ").append(toIndentedString(devAccountId)).append("\n");
    sb.append("    installedAppsApplicationId: ").append(toIndentedString(installedAppsApplicationId)).append("\n");
    sb.append("    appOwnerDevAccountId: ").append(toIndentedString(appOwnerDevAccountId)).append("\n");
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

