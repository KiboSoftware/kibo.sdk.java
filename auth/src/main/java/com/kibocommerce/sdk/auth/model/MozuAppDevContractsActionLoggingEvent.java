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
import org.threeten.bp.OffsetDateTime;

/**
 * MozuAppDevContractsActionLoggingEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsActionLoggingEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_API_CONTEXT = "apiContext";
  @SerializedName(SERIALIZED_NAME_API_CONTEXT)
  private String apiContext;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "applicationName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_KEY = "applicationKey";
  @SerializedName(SERIALIZED_NAME_APPLICATION_KEY)
  private String applicationKey;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_FULL_MESSAGE = "fullMessage";
  @SerializedName(SERIALIZED_NAME_FULL_MESSAGE)
  private String fullMessage;

  public static final String SERIALIZED_NAME_SCALE_UNIT = "scaleUnit";
  @SerializedName(SERIALIZED_NAME_SCALE_UNIT)
  private String scaleUnit;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_FUNCTION_ID = "functionId";
  @SerializedName(SERIALIZED_NAME_FUNCTION_ID)
  private String functionId;

  public static final String SERIALIZED_NAME_ACTION_ID = "actionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId;

  public static final String SERIALIZED_NAME_ACTION_DOMAIN = "actionDomain";
  @SerializedName(SERIALIZED_NAME_ACTION_DOMAIN)
  private String actionDomain;

  public static final String SERIALIZED_NAME_EXCEPTION = "exception";
  @SerializedName(SERIALIZED_NAME_EXCEPTION)
  private String exception;

  public MozuAppDevContractsActionLoggingEvent id(String id) {
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

  public MozuAppDevContractsActionLoggingEvent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public MozuAppDevContractsActionLoggingEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @ApiModelProperty(value = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public MozuAppDevContractsActionLoggingEvent apiContext(String apiContext) {
    this.apiContext = apiContext;
    return this;
  }

   /**
   * Get apiContext
   * @return apiContext
  **/
  @ApiModelProperty(value = "")
  public String getApiContext() {
    return apiContext;
  }

  public void setApiContext(String apiContext) {
    this.apiContext = apiContext;
  }

  public MozuAppDevContractsActionLoggingEvent applicationName(String applicationName) {
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

  public MozuAppDevContractsActionLoggingEvent applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public MozuAppDevContractsActionLoggingEvent applicationKey(String applicationKey) {
    this.applicationKey = applicationKey;
    return this;
  }

   /**
   * Get applicationKey
   * @return applicationKey
  **/
  @ApiModelProperty(value = "")
  public String getApplicationKey() {
    return applicationKey;
  }

  public void setApplicationKey(String applicationKey) {
    this.applicationKey = applicationKey;
  }

  public MozuAppDevContractsActionLoggingEvent content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MozuAppDevContractsActionLoggingEvent fullMessage(String fullMessage) {
    this.fullMessage = fullMessage;
    return this;
  }

   /**
   * Get fullMessage
   * @return fullMessage
  **/
  @ApiModelProperty(value = "")
  public String getFullMessage() {
    return fullMessage;
  }

  public void setFullMessage(String fullMessage) {
    this.fullMessage = fullMessage;
  }

  public MozuAppDevContractsActionLoggingEvent scaleUnit(String scaleUnit) {
    this.scaleUnit = scaleUnit;
    return this;
  }

   /**
   * Get scaleUnit
   * @return scaleUnit
  **/
  @ApiModelProperty(value = "")
  public String getScaleUnit() {
    return scaleUnit;
  }

  public void setScaleUnit(String scaleUnit) {
    this.scaleUnit = scaleUnit;
  }

  public MozuAppDevContractsActionLoggingEvent severity(Integer severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }

  public MozuAppDevContractsActionLoggingEvent functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * Get functionId
   * @return functionId
  **/
  @ApiModelProperty(value = "")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  public MozuAppDevContractsActionLoggingEvent actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @ApiModelProperty(value = "")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public MozuAppDevContractsActionLoggingEvent actionDomain(String actionDomain) {
    this.actionDomain = actionDomain;
    return this;
  }

   /**
   * Get actionDomain
   * @return actionDomain
  **/
  @ApiModelProperty(value = "")
  public String getActionDomain() {
    return actionDomain;
  }

  public void setActionDomain(String actionDomain) {
    this.actionDomain = actionDomain;
  }

  public MozuAppDevContractsActionLoggingEvent exception(String exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsActionLoggingEvent mozuAppDevContractsActionLoggingEvent = (MozuAppDevContractsActionLoggingEvent) o;
    return Objects.equals(this.id, mozuAppDevContractsActionLoggingEvent.id) &&
        Objects.equals(this.timestamp, mozuAppDevContractsActionLoggingEvent.timestamp) &&
        Objects.equals(this.correlationId, mozuAppDevContractsActionLoggingEvent.correlationId) &&
        Objects.equals(this.apiContext, mozuAppDevContractsActionLoggingEvent.apiContext) &&
        Objects.equals(this.applicationName, mozuAppDevContractsActionLoggingEvent.applicationName) &&
        Objects.equals(this.applicationId, mozuAppDevContractsActionLoggingEvent.applicationId) &&
        Objects.equals(this.applicationKey, mozuAppDevContractsActionLoggingEvent.applicationKey) &&
        Objects.equals(this.content, mozuAppDevContractsActionLoggingEvent.content) &&
        Objects.equals(this.fullMessage, mozuAppDevContractsActionLoggingEvent.fullMessage) &&
        Objects.equals(this.scaleUnit, mozuAppDevContractsActionLoggingEvent.scaleUnit) &&
        Objects.equals(this.severity, mozuAppDevContractsActionLoggingEvent.severity) &&
        Objects.equals(this.functionId, mozuAppDevContractsActionLoggingEvent.functionId) &&
        Objects.equals(this.actionId, mozuAppDevContractsActionLoggingEvent.actionId) &&
        Objects.equals(this.actionDomain, mozuAppDevContractsActionLoggingEvent.actionDomain) &&
        Objects.equals(this.exception, mozuAppDevContractsActionLoggingEvent.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, correlationId, apiContext, applicationName, applicationId, applicationKey, content, fullMessage, scaleUnit, severity, functionId, actionId, actionDomain, exception);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsActionLoggingEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    apiContext: ").append(toIndentedString(apiContext)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    fullMessage: ").append(toIndentedString(fullMessage)).append("\n");
    sb.append("    scaleUnit: ").append(toIndentedString(scaleUnit)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionDomain: ").append(toIndentedString(actionDomain)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

