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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuCoreApiContractsUserRole;
import com.kibocommerce.kibo.sdk.java.auth.model.MozuCoreApiContractsUserSystemData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuCoreApiContractsUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuCoreApiContractsUser {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_OPT_IN_TO_EMAIL = "optInToEmail";
  @SerializedName(SERIALIZED_NAME_OPT_IN_TO_EMAIL)
  private Boolean optInToEmail;

  public static final String SERIALIZED_NAME_OPT_IN_TO_TEXT_MESSAGE = "optInToTextMessage";
  @SerializedName(SERIALIZED_NAME_OPT_IN_TO_TEXT_MESSAGE)
  private Boolean optInToTextMessage;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SYSTEM_DATA = "systemData";
  @SerializedName(SERIALIZED_NAME_SYSTEM_DATA)
  private MozuCoreApiContractsUserSystemData systemData = null;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<MozuCoreApiContractsUserRole> roles = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public MozuCoreApiContractsUser emailAddress(String emailAddress) {
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

  public MozuCoreApiContractsUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public MozuCoreApiContractsUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public MozuCoreApiContractsUser externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public MozuCoreApiContractsUser localeCode(String localeCode) {
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Get localeCode
   * @return localeCode
  **/
  @ApiModelProperty(value = "")
  public String getLocaleCode() {
    return localeCode;
  }

  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }

  public MozuCoreApiContractsUser firstName(String firstName) {
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

  public MozuCoreApiContractsUser lastName(String lastName) {
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

  public MozuCoreApiContractsUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public MozuCoreApiContractsUser optInToEmail(Boolean optInToEmail) {
    this.optInToEmail = optInToEmail;
    return this;
  }

   /**
   * Get optInToEmail
   * @return optInToEmail
  **/
  @ApiModelProperty(value = "")
  public Boolean getOptInToEmail() {
    return optInToEmail;
  }

  public void setOptInToEmail(Boolean optInToEmail) {
    this.optInToEmail = optInToEmail;
  }

  public MozuCoreApiContractsUser optInToTextMessage(Boolean optInToTextMessage) {
    this.optInToTextMessage = optInToTextMessage;
    return this;
  }

   /**
   * Get optInToTextMessage
   * @return optInToTextMessage
  **/
  @ApiModelProperty(value = "")
  public Boolean getOptInToTextMessage() {
    return optInToTextMessage;
  }

  public void setOptInToTextMessage(Boolean optInToTextMessage) {
    this.optInToTextMessage = optInToTextMessage;
  }

  public MozuCoreApiContractsUser id(String id) {
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

  public MozuCoreApiContractsUser systemData(MozuCoreApiContractsUserSystemData systemData) {
    this.systemData = systemData;
    return this;
  }

   /**
   * Get systemData
   * @return systemData
  **/
  @ApiModelProperty(value = "")
  public MozuCoreApiContractsUserSystemData getSystemData() {
    return systemData;
  }

  public void setSystemData(MozuCoreApiContractsUserSystemData systemData) {
    this.systemData = systemData;
  }

  public MozuCoreApiContractsUser roles(List<MozuCoreApiContractsUserRole> roles) {
    this.roles = roles;
    return this;
  }

  public MozuCoreApiContractsUser addRolesItem(MozuCoreApiContractsUserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<MozuCoreApiContractsUserRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<MozuCoreApiContractsUserRole> getRoles() {
    return roles;
  }

  public void setRoles(List<MozuCoreApiContractsUserRole> roles) {
    this.roles = roles;
  }

  public MozuCoreApiContractsUser isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsUser mozuCoreApiContractsUser = (MozuCoreApiContractsUser) o;
    return Objects.equals(this.emailAddress, mozuCoreApiContractsUser.emailAddress) &&
        Objects.equals(this.userName, mozuCoreApiContractsUser.userName) &&
        Objects.equals(this.phoneNumber, mozuCoreApiContractsUser.phoneNumber) &&
        Objects.equals(this.externalId, mozuCoreApiContractsUser.externalId) &&
        Objects.equals(this.localeCode, mozuCoreApiContractsUser.localeCode) &&
        Objects.equals(this.firstName, mozuCoreApiContractsUser.firstName) &&
        Objects.equals(this.lastName, mozuCoreApiContractsUser.lastName) &&
        Objects.equals(this.password, mozuCoreApiContractsUser.password) &&
        Objects.equals(this.optInToEmail, mozuCoreApiContractsUser.optInToEmail) &&
        Objects.equals(this.optInToTextMessage, mozuCoreApiContractsUser.optInToTextMessage) &&
        Objects.equals(this.id, mozuCoreApiContractsUser.id) &&
        Objects.equals(this.systemData, mozuCoreApiContractsUser.systemData) &&
        Objects.equals(this.roles, mozuCoreApiContractsUser.roles) &&
        Objects.equals(this.isActive, mozuCoreApiContractsUser.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, userName, phoneNumber, externalId, localeCode, firstName, lastName, password, optInToEmail, optInToTextMessage, id, systemData, roles, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsUser {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    optInToEmail: ").append(toIndentedString(optInToEmail)).append("\n");
    sb.append("    optInToTextMessage: ").append(toIndentedString(optInToTextMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    systemData: ").append(toIndentedString(systemData)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

