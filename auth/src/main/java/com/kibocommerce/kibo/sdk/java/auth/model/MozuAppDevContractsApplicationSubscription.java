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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsApplicationSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationSubscription {
  public static final String SERIALIZED_NAME_APPLICATION_SUBSCRIPTION_ID = "applicationSubscriptionId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_SUBSCRIPTION_ID)
  private Integer applicationSubscriptionId;

  public static final String SERIALIZED_NAME_APPLICATION_END_POINT = "applicationEndPoint";
  @SerializedName(SERIALIZED_NAME_APPLICATION_END_POINT)
  private String applicationEndPoint;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<MozuAppDevContractsEvent> events = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public static final String SERIALIZED_NAME_NO_CALLBACK = "noCallback";
  @SerializedName(SERIALIZED_NAME_NO_CALLBACK)
  private Boolean noCallback;

  public MozuAppDevContractsApplicationSubscription applicationSubscriptionId(Integer applicationSubscriptionId) {
    this.applicationSubscriptionId = applicationSubscriptionId;
    return this;
  }

   /**
   * Get applicationSubscriptionId
   * @return applicationSubscriptionId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationSubscriptionId() {
    return applicationSubscriptionId;
  }

  public void setApplicationSubscriptionId(Integer applicationSubscriptionId) {
    this.applicationSubscriptionId = applicationSubscriptionId;
  }

  public MozuAppDevContractsApplicationSubscription applicationEndPoint(String applicationEndPoint) {
    this.applicationEndPoint = applicationEndPoint;
    return this;
  }

   /**
   * Get applicationEndPoint
   * @return applicationEndPoint
  **/
  @ApiModelProperty(value = "")
  public String getApplicationEndPoint() {
    return applicationEndPoint;
  }

  public void setApplicationEndPoint(String applicationEndPoint) {
    this.applicationEndPoint = applicationEndPoint;
  }

  public MozuAppDevContractsApplicationSubscription events(List<MozuAppDevContractsEvent> events) {
    this.events = events;
    return this;
  }

  public MozuAppDevContractsApplicationSubscription addEventsItem(MozuAppDevContractsEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<MozuAppDevContractsEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsEvent> getEvents() {
    return events;
  }

  public void setEvents(List<MozuAppDevContractsEvent> events) {
    this.events = events;
  }

  public MozuAppDevContractsApplicationSubscription packageId(Integer packageId) {
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

  public MozuAppDevContractsApplicationSubscription noCallback(Boolean noCallback) {
    this.noCallback = noCallback;
    return this;
  }

   /**
   * Get noCallback
   * @return noCallback
  **/
  @ApiModelProperty(value = "")
  public Boolean getNoCallback() {
    return noCallback;
  }

  public void setNoCallback(Boolean noCallback) {
    this.noCallback = noCallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationSubscription mozuAppDevContractsApplicationSubscription = (MozuAppDevContractsApplicationSubscription) o;
    return Objects.equals(this.applicationSubscriptionId, mozuAppDevContractsApplicationSubscription.applicationSubscriptionId) &&
        Objects.equals(this.applicationEndPoint, mozuAppDevContractsApplicationSubscription.applicationEndPoint) &&
        Objects.equals(this.events, mozuAppDevContractsApplicationSubscription.events) &&
        Objects.equals(this.packageId, mozuAppDevContractsApplicationSubscription.packageId) &&
        Objects.equals(this.noCallback, mozuAppDevContractsApplicationSubscription.noCallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationSubscriptionId, applicationEndPoint, events, packageId, noCallback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationSubscription {\n");
    
    sb.append("    applicationSubscriptionId: ").append(toIndentedString(applicationSubscriptionId)).append("\n");
    sb.append("    applicationEndPoint: ").append(toIndentedString(applicationEndPoint)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    noCallback: ").append(toIndentedString(noCallback)).append("\n");
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

