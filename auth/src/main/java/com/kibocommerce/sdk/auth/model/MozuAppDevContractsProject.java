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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsProjectApplication;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsProjectTenant;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsProjectUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * MozuAppDevContractsProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsProject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customerName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_ID = "projectStatusId";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_ID)
  private Integer projectStatusId;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_NAME = "projectStatusName";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_NAME)
  private String projectStatusName;

  public static final String SERIALIZED_NAME_PROJECT_DESCRIPTION = "projectDescription";
  @SerializedName(SERIALIZED_NAME_PROJECT_DESCRIPTION)
  private String projectDescription;

  public static final String SERIALIZED_NAME_ENGAGEMENT_NUMBER = "engagementNumber";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_NUMBER)
  private String engagementNumber;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_ESTIMATED_END_DATE = "estimatedEndDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_END_DATE)
  private OffsetDateTime estimatedEndDate;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_PROJECT_APPLICATIONS = "projectApplications";
  @SerializedName(SERIALIZED_NAME_PROJECT_APPLICATIONS)
  private List<MozuAppDevContractsProjectApplication> projectApplications = null;

  public static final String SERIALIZED_NAME_PROJECT_TENANTS = "projectTenants";
  @SerializedName(SERIALIZED_NAME_PROJECT_TENANTS)
  private List<MozuAppDevContractsProjectTenant> projectTenants = null;

  public static final String SERIALIZED_NAME_PROJECT_USERS = "projectUsers";
  @SerializedName(SERIALIZED_NAME_PROJECT_USERS)
  private List<MozuAppDevContractsProjectUser> projectUsers = null;

  public static final String SERIALIZED_NAME_CLIENTS_MAIN_CONTACT_INFO = "clientsMainContactInfo";
  @SerializedName(SERIALIZED_NAME_CLIENTS_MAIN_CONTACT_INFO)
  private String clientsMainContactInfo;

  public MozuAppDevContractsProject id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MozuAppDevContractsProject name(String name) {
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

  public MozuAppDevContractsProject customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public MozuAppDevContractsProject projectStatusId(Integer projectStatusId) {
    this.projectStatusId = projectStatusId;
    return this;
  }

   /**
   * Get projectStatusId
   * @return projectStatusId
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectStatusId() {
    return projectStatusId;
  }

  public void setProjectStatusId(Integer projectStatusId) {
    this.projectStatusId = projectStatusId;
  }

  public MozuAppDevContractsProject projectStatusName(String projectStatusName) {
    this.projectStatusName = projectStatusName;
    return this;
  }

   /**
   * Get projectStatusName
   * @return projectStatusName
  **/
  @ApiModelProperty(value = "")
  public String getProjectStatusName() {
    return projectStatusName;
  }

  public void setProjectStatusName(String projectStatusName) {
    this.projectStatusName = projectStatusName;
  }

  public MozuAppDevContractsProject projectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
    return this;
  }

   /**
   * Get projectDescription
   * @return projectDescription
  **/
  @ApiModelProperty(value = "")
  public String getProjectDescription() {
    return projectDescription;
  }

  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }

  public MozuAppDevContractsProject engagementNumber(String engagementNumber) {
    this.engagementNumber = engagementNumber;
    return this;
  }

   /**
   * Get engagementNumber
   * @return engagementNumber
  **/
  @ApiModelProperty(value = "")
  public String getEngagementNumber() {
    return engagementNumber;
  }

  public void setEngagementNumber(String engagementNumber) {
    this.engagementNumber = engagementNumber;
  }

  public MozuAppDevContractsProject startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public MozuAppDevContractsProject estimatedEndDate(OffsetDateTime estimatedEndDate) {
    this.estimatedEndDate = estimatedEndDate;
    return this;
  }

   /**
   * Get estimatedEndDate
   * @return estimatedEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEstimatedEndDate() {
    return estimatedEndDate;
  }

  public void setEstimatedEndDate(OffsetDateTime estimatedEndDate) {
    this.estimatedEndDate = estimatedEndDate;
  }

  public MozuAppDevContractsProject additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public MozuAppDevContractsProject projectApplications(List<MozuAppDevContractsProjectApplication> projectApplications) {
    this.projectApplications = projectApplications;
    return this;
  }

  public MozuAppDevContractsProject addProjectApplicationsItem(MozuAppDevContractsProjectApplication projectApplicationsItem) {
    if (this.projectApplications == null) {
      this.projectApplications = new ArrayList<MozuAppDevContractsProjectApplication>();
    }
    this.projectApplications.add(projectApplicationsItem);
    return this;
  }

   /**
   * Get projectApplications
   * @return projectApplications
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsProjectApplication> getProjectApplications() {
    return projectApplications;
  }

  public void setProjectApplications(List<MozuAppDevContractsProjectApplication> projectApplications) {
    this.projectApplications = projectApplications;
  }

  public MozuAppDevContractsProject projectTenants(List<MozuAppDevContractsProjectTenant> projectTenants) {
    this.projectTenants = projectTenants;
    return this;
  }

  public MozuAppDevContractsProject addProjectTenantsItem(MozuAppDevContractsProjectTenant projectTenantsItem) {
    if (this.projectTenants == null) {
      this.projectTenants = new ArrayList<MozuAppDevContractsProjectTenant>();
    }
    this.projectTenants.add(projectTenantsItem);
    return this;
  }

   /**
   * Get projectTenants
   * @return projectTenants
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsProjectTenant> getProjectTenants() {
    return projectTenants;
  }

  public void setProjectTenants(List<MozuAppDevContractsProjectTenant> projectTenants) {
    this.projectTenants = projectTenants;
  }

  public MozuAppDevContractsProject projectUsers(List<MozuAppDevContractsProjectUser> projectUsers) {
    this.projectUsers = projectUsers;
    return this;
  }

  public MozuAppDevContractsProject addProjectUsersItem(MozuAppDevContractsProjectUser projectUsersItem) {
    if (this.projectUsers == null) {
      this.projectUsers = new ArrayList<MozuAppDevContractsProjectUser>();
    }
    this.projectUsers.add(projectUsersItem);
    return this;
  }

   /**
   * Get projectUsers
   * @return projectUsers
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsProjectUser> getProjectUsers() {
    return projectUsers;
  }

  public void setProjectUsers(List<MozuAppDevContractsProjectUser> projectUsers) {
    this.projectUsers = projectUsers;
  }

  public MozuAppDevContractsProject clientsMainContactInfo(String clientsMainContactInfo) {
    this.clientsMainContactInfo = clientsMainContactInfo;
    return this;
  }

   /**
   * Get clientsMainContactInfo
   * @return clientsMainContactInfo
  **/
  @ApiModelProperty(value = "")
  public String getClientsMainContactInfo() {
    return clientsMainContactInfo;
  }

  public void setClientsMainContactInfo(String clientsMainContactInfo) {
    this.clientsMainContactInfo = clientsMainContactInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsProject mozuAppDevContractsProject = (MozuAppDevContractsProject) o;
    return Objects.equals(this.id, mozuAppDevContractsProject.id) &&
        Objects.equals(this.name, mozuAppDevContractsProject.name) &&
        Objects.equals(this.customerName, mozuAppDevContractsProject.customerName) &&
        Objects.equals(this.projectStatusId, mozuAppDevContractsProject.projectStatusId) &&
        Objects.equals(this.projectStatusName, mozuAppDevContractsProject.projectStatusName) &&
        Objects.equals(this.projectDescription, mozuAppDevContractsProject.projectDescription) &&
        Objects.equals(this.engagementNumber, mozuAppDevContractsProject.engagementNumber) &&
        Objects.equals(this.startDate, mozuAppDevContractsProject.startDate) &&
        Objects.equals(this.estimatedEndDate, mozuAppDevContractsProject.estimatedEndDate) &&
        Objects.equals(this.additionalInfo, mozuAppDevContractsProject.additionalInfo) &&
        Objects.equals(this.projectApplications, mozuAppDevContractsProject.projectApplications) &&
        Objects.equals(this.projectTenants, mozuAppDevContractsProject.projectTenants) &&
        Objects.equals(this.projectUsers, mozuAppDevContractsProject.projectUsers) &&
        Objects.equals(this.clientsMainContactInfo, mozuAppDevContractsProject.clientsMainContactInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, customerName, projectStatusId, projectStatusName, projectDescription, engagementNumber, startDate, estimatedEndDate, additionalInfo, projectApplications, projectTenants, projectUsers, clientsMainContactInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsProject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    projectStatusId: ").append(toIndentedString(projectStatusId)).append("\n");
    sb.append("    projectStatusName: ").append(toIndentedString(projectStatusName)).append("\n");
    sb.append("    projectDescription: ").append(toIndentedString(projectDescription)).append("\n");
    sb.append("    engagementNumber: ").append(toIndentedString(engagementNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    estimatedEndDate: ").append(toIndentedString(estimatedEndDate)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    projectApplications: ").append(toIndentedString(projectApplications)).append("\n");
    sb.append("    projectTenants: ").append(toIndentedString(projectTenants)).append("\n");
    sb.append("    projectUsers: ").append(toIndentedString(projectUsers)).append("\n");
    sb.append("    clientsMainContactInfo: ").append(toIndentedString(clientsMainContactInfo)).append("\n");
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

