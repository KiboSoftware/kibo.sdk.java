/*
 * Kibo Admin User Service
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
import com.kibocommerce.kibo.sdk.java.auth.model.DeveloperAccount;
import com.kibocommerce.kibo.sdk.java.auth.model.UserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DeveloperAdminUserAuthTicket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T10:12:53.586362-05:00[America/Chicago]")
public class DeveloperAdminUserAuthTicket {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserProfile user = null;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_JWT_ACCESS_TOKEN = "jwtAccessToken";
  @SerializedName(SERIALIZED_NAME_JWT_ACCESS_TOKEN)
  private String jwtAccessToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_EXPIRATION = "accessTokenExpiration";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_EXPIRATION)
  private OffsetDateTime accessTokenExpiration;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_EXPIRATION = "refreshTokenExpiration";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_EXPIRATION)
  private OffsetDateTime refreshTokenExpiration;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private DeveloperAccount account = null;

  public static final String SERIALIZED_NAME_AVAILABLE_ACCOUNTS = "availableAccounts";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ACCOUNTS)
  private List<DeveloperAccount> availableAccounts = null;

  public static final String SERIALIZED_NAME_GRANTED_BEHAVIORS = "grantedBehaviors";
  @SerializedName(SERIALIZED_NAME_GRANTED_BEHAVIORS)
  private List<Integer> grantedBehaviors = null;

  public DeveloperAdminUserAuthTicket user(UserProfile user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public UserProfile getUser() {
    return user;
  }

  public void setUser(UserProfile user) {
    this.user = user;
  }

  public DeveloperAdminUserAuthTicket createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public DeveloperAdminUserAuthTicket jwtAccessToken(String jwtAccessToken) {
    this.jwtAccessToken = jwtAccessToken;
    return this;
  }

   /**
   * Get jwtAccessToken
   * @return jwtAccessToken
  **/
  @ApiModelProperty(value = "")
  public String getJwtAccessToken() {
    return jwtAccessToken;
  }

  public void setJwtAccessToken(String jwtAccessToken) {
    this.jwtAccessToken = jwtAccessToken;
  }

  public DeveloperAdminUserAuthTicket accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public DeveloperAdminUserAuthTicket accessTokenExpiration(OffsetDateTime accessTokenExpiration) {
    this.accessTokenExpiration = accessTokenExpiration;
    return this;
  }

   /**
   * Get accessTokenExpiration
   * @return accessTokenExpiration
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAccessTokenExpiration() {
    return accessTokenExpiration;
  }

  public void setAccessTokenExpiration(OffsetDateTime accessTokenExpiration) {
    this.accessTokenExpiration = accessTokenExpiration;
  }

  public DeveloperAdminUserAuthTicket refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public DeveloperAdminUserAuthTicket refreshTokenExpiration(OffsetDateTime refreshTokenExpiration) {
    this.refreshTokenExpiration = refreshTokenExpiration;
    return this;
  }

   /**
   * Get refreshTokenExpiration
   * @return refreshTokenExpiration
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRefreshTokenExpiration() {
    return refreshTokenExpiration;
  }

  public void setRefreshTokenExpiration(OffsetDateTime refreshTokenExpiration) {
    this.refreshTokenExpiration = refreshTokenExpiration;
  }

  public DeveloperAdminUserAuthTicket account(DeveloperAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public DeveloperAccount getAccount() {
    return account;
  }

  public void setAccount(DeveloperAccount account) {
    this.account = account;
  }

  public DeveloperAdminUserAuthTicket availableAccounts(List<DeveloperAccount> availableAccounts) {
    this.availableAccounts = availableAccounts;
    return this;
  }

  public DeveloperAdminUserAuthTicket addAvailableAccountsItem(DeveloperAccount availableAccountsItem) {
    if (this.availableAccounts == null) {
      this.availableAccounts = new ArrayList<DeveloperAccount>();
    }
    this.availableAccounts.add(availableAccountsItem);
    return this;
  }

   /**
   * Get availableAccounts
   * @return availableAccounts
  **/
  @ApiModelProperty(value = "")
  public List<DeveloperAccount> getAvailableAccounts() {
    return availableAccounts;
  }

  public void setAvailableAccounts(List<DeveloperAccount> availableAccounts) {
    this.availableAccounts = availableAccounts;
  }

  public DeveloperAdminUserAuthTicket grantedBehaviors(List<Integer> grantedBehaviors) {
    this.grantedBehaviors = grantedBehaviors;
    return this;
  }

  public DeveloperAdminUserAuthTicket addGrantedBehaviorsItem(Integer grantedBehaviorsItem) {
    if (this.grantedBehaviors == null) {
      this.grantedBehaviors = new ArrayList<Integer>();
    }
    this.grantedBehaviors.add(grantedBehaviorsItem);
    return this;
  }

   /**
   * Get grantedBehaviors
   * @return grantedBehaviors
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getGrantedBehaviors() {
    return grantedBehaviors;
  }

  public void setGrantedBehaviors(List<Integer> grantedBehaviors) {
    this.grantedBehaviors = grantedBehaviors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = (DeveloperAdminUserAuthTicket) o;
    return Objects.equals(this.user, developerAdminUserAuthTicket.user) &&
        Objects.equals(this.createdOn, developerAdminUserAuthTicket.createdOn) &&
        Objects.equals(this.jwtAccessToken, developerAdminUserAuthTicket.jwtAccessToken) &&
        Objects.equals(this.accessToken, developerAdminUserAuthTicket.accessToken) &&
        Objects.equals(this.accessTokenExpiration, developerAdminUserAuthTicket.accessTokenExpiration) &&
        Objects.equals(this.refreshToken, developerAdminUserAuthTicket.refreshToken) &&
        Objects.equals(this.refreshTokenExpiration, developerAdminUserAuthTicket.refreshTokenExpiration) &&
        Objects.equals(this.account, developerAdminUserAuthTicket.account) &&
        Objects.equals(this.availableAccounts, developerAdminUserAuthTicket.availableAccounts) &&
        Objects.equals(this.grantedBehaviors, developerAdminUserAuthTicket.grantedBehaviors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, createdOn, jwtAccessToken, accessToken, accessTokenExpiration, refreshToken, refreshTokenExpiration, account, availableAccounts, grantedBehaviors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeveloperAdminUserAuthTicket {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    jwtAccessToken: ").append(toIndentedString(jwtAccessToken)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpiration: ").append(toIndentedString(accessTokenExpiration)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiration: ").append(toIndentedString(refreshTokenExpiration)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    availableAccounts: ").append(toIndentedString(availableAccounts)).append("\n");
    sb.append("    grantedBehaviors: ").append(toIndentedString(grantedBehaviors)).append("\n");
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

