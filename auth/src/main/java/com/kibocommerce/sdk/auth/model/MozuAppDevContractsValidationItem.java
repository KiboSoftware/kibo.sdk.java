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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsValidationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsValidationItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_HASHTAG = "hashtag";
  @SerializedName(SERIALIZED_NAME_HASHTAG)
  private String hashtag;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_HELP_URL = "helpUrl";
  @SerializedName(SERIALIZED_NAME_HELP_URL)
  private String helpUrl;

  public MozuAppDevContractsValidationItem id(String id) {
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

  public MozuAppDevContractsValidationItem type(String type) {
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

  public MozuAppDevContractsValidationItem hashtag(String hashtag) {
    this.hashtag = hashtag;
    return this;
  }

   /**
   * Get hashtag
   * @return hashtag
  **/
  @ApiModelProperty(value = "")
  public String getHashtag() {
    return hashtag;
  }

  public void setHashtag(String hashtag) {
    this.hashtag = hashtag;
  }

  public MozuAppDevContractsValidationItem severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public MozuAppDevContractsValidationItem message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MozuAppDevContractsValidationItem helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

   /**
   * Get helpUrl
   * @return helpUrl
  **/
  @ApiModelProperty(value = "")
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsValidationItem mozuAppDevContractsValidationItem = (MozuAppDevContractsValidationItem) o;
    return Objects.equals(this.id, mozuAppDevContractsValidationItem.id) &&
        Objects.equals(this.type, mozuAppDevContractsValidationItem.type) &&
        Objects.equals(this.hashtag, mozuAppDevContractsValidationItem.hashtag) &&
        Objects.equals(this.severity, mozuAppDevContractsValidationItem.severity) &&
        Objects.equals(this.message, mozuAppDevContractsValidationItem.message) &&
        Objects.equals(this.helpUrl, mozuAppDevContractsValidationItem.helpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, hashtag, severity, message, helpUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsValidationItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hashtag: ").append(toIndentedString(hashtag)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
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

