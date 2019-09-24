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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsRoleInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsDeveloperAccountUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsDeveloperAccountUser {
  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developerId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private Integer developerId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WORK_CONTACT_ID = "workContactId";
  @SerializedName(SERIALIZED_NAME_WORK_CONTACT_ID)
  private Integer workContactId;

  public static final String SERIALIZED_NAME_WORK_ADDRESS1 = "workAddress1";
  @SerializedName(SERIALIZED_NAME_WORK_ADDRESS1)
  private String workAddress1;

  public static final String SERIALIZED_NAME_WORK_ADDRESS2 = "workAddress2";
  @SerializedName(SERIALIZED_NAME_WORK_ADDRESS2)
  private String workAddress2;

  public static final String SERIALIZED_NAME_WORK_ADDRESS3 = "workAddress3";
  @SerializedName(SERIALIZED_NAME_WORK_ADDRESS3)
  private String workAddress3;

  public static final String SERIALIZED_NAME_WORK_ADDRESS4 = "workAddress4";
  @SerializedName(SERIALIZED_NAME_WORK_ADDRESS4)
  private String workAddress4;

  public static final String SERIALIZED_NAME_WORK_CITY = "workCity";
  @SerializedName(SERIALIZED_NAME_WORK_CITY)
  private String workCity;

  public static final String SERIALIZED_NAME_WORK_STATE = "workState";
  @SerializedName(SERIALIZED_NAME_WORK_STATE)
  private String workState;

  public static final String SERIALIZED_NAME_WORK_ZIP = "workZip";
  @SerializedName(SERIALIZED_NAME_WORK_ZIP)
  private String workZip;

  public static final String SERIALIZED_NAME_WORK_COUNTRY = "workCountry";
  @SerializedName(SERIALIZED_NAME_WORK_COUNTRY)
  private String workCountry;

  public static final String SERIALIZED_NAME_WORK_PHONE = "workPhone";
  @SerializedName(SERIALIZED_NAME_WORK_PHONE)
  private String workPhone;

  public static final String SERIALIZED_NAME_PERSONAL_CONTACT_ID = "personalContactId";
  @SerializedName(SERIALIZED_NAME_PERSONAL_CONTACT_ID)
  private Integer personalContactId;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS1 = "personalAddress1";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS1)
  private String personalAddress1;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS2 = "personalAddress2";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS2)
  private String personalAddress2;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS3 = "personalAddress3";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS3)
  private String personalAddress3;

  public static final String SERIALIZED_NAME_PERSONAL_ADDRESS4 = "personalAddress4";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ADDRESS4)
  private String personalAddress4;

  public static final String SERIALIZED_NAME_PERSONAL_CITY = "personalCity";
  @SerializedName(SERIALIZED_NAME_PERSONAL_CITY)
  private String personalCity;

  public static final String SERIALIZED_NAME_PERSONAL_STATE = "personalState";
  @SerializedName(SERIALIZED_NAME_PERSONAL_STATE)
  private String personalState;

  public static final String SERIALIZED_NAME_PERSONAL_ZIP = "personalZip";
  @SerializedName(SERIALIZED_NAME_PERSONAL_ZIP)
  private String personalZip;

  public static final String SERIALIZED_NAME_PERSONAL_COUNTRY = "personalCountry";
  @SerializedName(SERIALIZED_NAME_PERSONAL_COUNTRY)
  private String personalCountry;

  public static final String SERIALIZED_NAME_PERSONAL_PHONE = "personalPhone";
  @SerializedName(SERIALIZED_NAME_PERSONAL_PHONE)
  private String personalPhone;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<MozuAppDevContractsRoleInfo> roles = null;

  public MozuAppDevContractsDeveloperAccountUser developerId(Integer developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Get developerId
   * @return developerId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(Integer developerId) {
    this.developerId = developerId;
  }

  public MozuAppDevContractsDeveloperAccountUser userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public MozuAppDevContractsDeveloperAccountUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MozuAppDevContractsDeveloperAccountUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MozuAppDevContractsDeveloperAccountUser emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public MozuAppDevContractsDeveloperAccountUser type(String type) {
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

  public MozuAppDevContractsDeveloperAccountUser workContactId(Integer workContactId) {
    this.workContactId = workContactId;
    return this;
  }

   /**
   * Get workContactId
   * @return workContactId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkContactId() {
    return workContactId;
  }

  public void setWorkContactId(Integer workContactId) {
    this.workContactId = workContactId;
  }

  public MozuAppDevContractsDeveloperAccountUser workAddress1(String workAddress1) {
    this.workAddress1 = workAddress1;
    return this;
  }

   /**
   * Get workAddress1
   * @return workAddress1
  **/
  @ApiModelProperty(value = "")
  public String getWorkAddress1() {
    return workAddress1;
  }

  public void setWorkAddress1(String workAddress1) {
    this.workAddress1 = workAddress1;
  }

  public MozuAppDevContractsDeveloperAccountUser workAddress2(String workAddress2) {
    this.workAddress2 = workAddress2;
    return this;
  }

   /**
   * Get workAddress2
   * @return workAddress2
  **/
  @ApiModelProperty(value = "")
  public String getWorkAddress2() {
    return workAddress2;
  }

  public void setWorkAddress2(String workAddress2) {
    this.workAddress2 = workAddress2;
  }

  public MozuAppDevContractsDeveloperAccountUser workAddress3(String workAddress3) {
    this.workAddress3 = workAddress3;
    return this;
  }

   /**
   * Get workAddress3
   * @return workAddress3
  **/
  @ApiModelProperty(value = "")
  public String getWorkAddress3() {
    return workAddress3;
  }

  public void setWorkAddress3(String workAddress3) {
    this.workAddress3 = workAddress3;
  }

  public MozuAppDevContractsDeveloperAccountUser workAddress4(String workAddress4) {
    this.workAddress4 = workAddress4;
    return this;
  }

   /**
   * Get workAddress4
   * @return workAddress4
  **/
  @ApiModelProperty(value = "")
  public String getWorkAddress4() {
    return workAddress4;
  }

  public void setWorkAddress4(String workAddress4) {
    this.workAddress4 = workAddress4;
  }

  public MozuAppDevContractsDeveloperAccountUser workCity(String workCity) {
    this.workCity = workCity;
    return this;
  }

   /**
   * Get workCity
   * @return workCity
  **/
  @ApiModelProperty(value = "")
  public String getWorkCity() {
    return workCity;
  }

  public void setWorkCity(String workCity) {
    this.workCity = workCity;
  }

  public MozuAppDevContractsDeveloperAccountUser workState(String workState) {
    this.workState = workState;
    return this;
  }

   /**
   * Get workState
   * @return workState
  **/
  @ApiModelProperty(value = "")
  public String getWorkState() {
    return workState;
  }

  public void setWorkState(String workState) {
    this.workState = workState;
  }

  public MozuAppDevContractsDeveloperAccountUser workZip(String workZip) {
    this.workZip = workZip;
    return this;
  }

   /**
   * Get workZip
   * @return workZip
  **/
  @ApiModelProperty(value = "")
  public String getWorkZip() {
    return workZip;
  }

  public void setWorkZip(String workZip) {
    this.workZip = workZip;
  }

  public MozuAppDevContractsDeveloperAccountUser workCountry(String workCountry) {
    this.workCountry = workCountry;
    return this;
  }

   /**
   * Get workCountry
   * @return workCountry
  **/
  @ApiModelProperty(value = "")
  public String getWorkCountry() {
    return workCountry;
  }

  public void setWorkCountry(String workCountry) {
    this.workCountry = workCountry;
  }

  public MozuAppDevContractsDeveloperAccountUser workPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

   /**
   * Get workPhone
   * @return workPhone
  **/
  @ApiModelProperty(value = "")
  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public MozuAppDevContractsDeveloperAccountUser personalContactId(Integer personalContactId) {
    this.personalContactId = personalContactId;
    return this;
  }

   /**
   * Get personalContactId
   * @return personalContactId
  **/
  @ApiModelProperty(value = "")
  public Integer getPersonalContactId() {
    return personalContactId;
  }

  public void setPersonalContactId(Integer personalContactId) {
    this.personalContactId = personalContactId;
  }

  public MozuAppDevContractsDeveloperAccountUser personalAddress1(String personalAddress1) {
    this.personalAddress1 = personalAddress1;
    return this;
  }

   /**
   * Get personalAddress1
   * @return personalAddress1
  **/
  @ApiModelProperty(value = "")
  public String getPersonalAddress1() {
    return personalAddress1;
  }

  public void setPersonalAddress1(String personalAddress1) {
    this.personalAddress1 = personalAddress1;
  }

  public MozuAppDevContractsDeveloperAccountUser personalAddress2(String personalAddress2) {
    this.personalAddress2 = personalAddress2;
    return this;
  }

   /**
   * Get personalAddress2
   * @return personalAddress2
  **/
  @ApiModelProperty(value = "")
  public String getPersonalAddress2() {
    return personalAddress2;
  }

  public void setPersonalAddress2(String personalAddress2) {
    this.personalAddress2 = personalAddress2;
  }

  public MozuAppDevContractsDeveloperAccountUser personalAddress3(String personalAddress3) {
    this.personalAddress3 = personalAddress3;
    return this;
  }

   /**
   * Get personalAddress3
   * @return personalAddress3
  **/
  @ApiModelProperty(value = "")
  public String getPersonalAddress3() {
    return personalAddress3;
  }

  public void setPersonalAddress3(String personalAddress3) {
    this.personalAddress3 = personalAddress3;
  }

  public MozuAppDevContractsDeveloperAccountUser personalAddress4(String personalAddress4) {
    this.personalAddress4 = personalAddress4;
    return this;
  }

   /**
   * Get personalAddress4
   * @return personalAddress4
  **/
  @ApiModelProperty(value = "")
  public String getPersonalAddress4() {
    return personalAddress4;
  }

  public void setPersonalAddress4(String personalAddress4) {
    this.personalAddress4 = personalAddress4;
  }

  public MozuAppDevContractsDeveloperAccountUser personalCity(String personalCity) {
    this.personalCity = personalCity;
    return this;
  }

   /**
   * Get personalCity
   * @return personalCity
  **/
  @ApiModelProperty(value = "")
  public String getPersonalCity() {
    return personalCity;
  }

  public void setPersonalCity(String personalCity) {
    this.personalCity = personalCity;
  }

  public MozuAppDevContractsDeveloperAccountUser personalState(String personalState) {
    this.personalState = personalState;
    return this;
  }

   /**
   * Get personalState
   * @return personalState
  **/
  @ApiModelProperty(value = "")
  public String getPersonalState() {
    return personalState;
  }

  public void setPersonalState(String personalState) {
    this.personalState = personalState;
  }

  public MozuAppDevContractsDeveloperAccountUser personalZip(String personalZip) {
    this.personalZip = personalZip;
    return this;
  }

   /**
   * Get personalZip
   * @return personalZip
  **/
  @ApiModelProperty(value = "")
  public String getPersonalZip() {
    return personalZip;
  }

  public void setPersonalZip(String personalZip) {
    this.personalZip = personalZip;
  }

  public MozuAppDevContractsDeveloperAccountUser personalCountry(String personalCountry) {
    this.personalCountry = personalCountry;
    return this;
  }

   /**
   * Get personalCountry
   * @return personalCountry
  **/
  @ApiModelProperty(value = "")
  public String getPersonalCountry() {
    return personalCountry;
  }

  public void setPersonalCountry(String personalCountry) {
    this.personalCountry = personalCountry;
  }

  public MozuAppDevContractsDeveloperAccountUser personalPhone(String personalPhone) {
    this.personalPhone = personalPhone;
    return this;
  }

   /**
   * Get personalPhone
   * @return personalPhone
  **/
  @ApiModelProperty(value = "")
  public String getPersonalPhone() {
    return personalPhone;
  }

  public void setPersonalPhone(String personalPhone) {
    this.personalPhone = personalPhone;
  }

  public MozuAppDevContractsDeveloperAccountUser roles(List<MozuAppDevContractsRoleInfo> roles) {
    this.roles = roles;
    return this;
  }

  public MozuAppDevContractsDeveloperAccountUser addRolesItem(MozuAppDevContractsRoleInfo rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<MozuAppDevContractsRoleInfo>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsRoleInfo> getRoles() {
    return roles;
  }

  public void setRoles(List<MozuAppDevContractsRoleInfo> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsDeveloperAccountUser mozuAppDevContractsDeveloperAccountUser = (MozuAppDevContractsDeveloperAccountUser) o;
    return Objects.equals(this.developerId, mozuAppDevContractsDeveloperAccountUser.developerId) &&
        Objects.equals(this.userId, mozuAppDevContractsDeveloperAccountUser.userId) &&
        Objects.equals(this.firstName, mozuAppDevContractsDeveloperAccountUser.firstName) &&
        Objects.equals(this.lastName, mozuAppDevContractsDeveloperAccountUser.lastName) &&
        Objects.equals(this.emailAddress, mozuAppDevContractsDeveloperAccountUser.emailAddress) &&
        Objects.equals(this.type, mozuAppDevContractsDeveloperAccountUser.type) &&
        Objects.equals(this.workContactId, mozuAppDevContractsDeveloperAccountUser.workContactId) &&
        Objects.equals(this.workAddress1, mozuAppDevContractsDeveloperAccountUser.workAddress1) &&
        Objects.equals(this.workAddress2, mozuAppDevContractsDeveloperAccountUser.workAddress2) &&
        Objects.equals(this.workAddress3, mozuAppDevContractsDeveloperAccountUser.workAddress3) &&
        Objects.equals(this.workAddress4, mozuAppDevContractsDeveloperAccountUser.workAddress4) &&
        Objects.equals(this.workCity, mozuAppDevContractsDeveloperAccountUser.workCity) &&
        Objects.equals(this.workState, mozuAppDevContractsDeveloperAccountUser.workState) &&
        Objects.equals(this.workZip, mozuAppDevContractsDeveloperAccountUser.workZip) &&
        Objects.equals(this.workCountry, mozuAppDevContractsDeveloperAccountUser.workCountry) &&
        Objects.equals(this.workPhone, mozuAppDevContractsDeveloperAccountUser.workPhone) &&
        Objects.equals(this.personalContactId, mozuAppDevContractsDeveloperAccountUser.personalContactId) &&
        Objects.equals(this.personalAddress1, mozuAppDevContractsDeveloperAccountUser.personalAddress1) &&
        Objects.equals(this.personalAddress2, mozuAppDevContractsDeveloperAccountUser.personalAddress2) &&
        Objects.equals(this.personalAddress3, mozuAppDevContractsDeveloperAccountUser.personalAddress3) &&
        Objects.equals(this.personalAddress4, mozuAppDevContractsDeveloperAccountUser.personalAddress4) &&
        Objects.equals(this.personalCity, mozuAppDevContractsDeveloperAccountUser.personalCity) &&
        Objects.equals(this.personalState, mozuAppDevContractsDeveloperAccountUser.personalState) &&
        Objects.equals(this.personalZip, mozuAppDevContractsDeveloperAccountUser.personalZip) &&
        Objects.equals(this.personalCountry, mozuAppDevContractsDeveloperAccountUser.personalCountry) &&
        Objects.equals(this.personalPhone, mozuAppDevContractsDeveloperAccountUser.personalPhone) &&
        Objects.equals(this.roles, mozuAppDevContractsDeveloperAccountUser.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerId, userId, firstName, lastName, emailAddress, type, workContactId, workAddress1, workAddress2, workAddress3, workAddress4, workCity, workState, workZip, workCountry, workPhone, personalContactId, personalAddress1, personalAddress2, personalAddress3, personalAddress4, personalCity, personalState, personalZip, personalCountry, personalPhone, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsDeveloperAccountUser {\n");
    
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workContactId: ").append(toIndentedString(workContactId)).append("\n");
    sb.append("    workAddress1: ").append(toIndentedString(workAddress1)).append("\n");
    sb.append("    workAddress2: ").append(toIndentedString(workAddress2)).append("\n");
    sb.append("    workAddress3: ").append(toIndentedString(workAddress3)).append("\n");
    sb.append("    workAddress4: ").append(toIndentedString(workAddress4)).append("\n");
    sb.append("    workCity: ").append(toIndentedString(workCity)).append("\n");
    sb.append("    workState: ").append(toIndentedString(workState)).append("\n");
    sb.append("    workZip: ").append(toIndentedString(workZip)).append("\n");
    sb.append("    workCountry: ").append(toIndentedString(workCountry)).append("\n");
    sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
    sb.append("    personalContactId: ").append(toIndentedString(personalContactId)).append("\n");
    sb.append("    personalAddress1: ").append(toIndentedString(personalAddress1)).append("\n");
    sb.append("    personalAddress2: ").append(toIndentedString(personalAddress2)).append("\n");
    sb.append("    personalAddress3: ").append(toIndentedString(personalAddress3)).append("\n");
    sb.append("    personalAddress4: ").append(toIndentedString(personalAddress4)).append("\n");
    sb.append("    personalCity: ").append(toIndentedString(personalCity)).append("\n");
    sb.append("    personalState: ").append(toIndentedString(personalState)).append("\n");
    sb.append("    personalZip: ").append(toIndentedString(personalZip)).append("\n");
    sb.append("    personalCountry: ").append(toIndentedString(personalCountry)).append("\n");
    sb.append("    personalPhone: ").append(toIndentedString(personalPhone)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

