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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsApiVersionNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsApiVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsApiVersionRequest {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_API_VERSION_NUMBER_FROM = "apiVersionNumberFrom";
  @SerializedName(SERIALIZED_NAME_API_VERSION_NUMBER_FROM)
  private MozuAppDevContractsApiVersionNumber apiVersionNumberFrom = null;

  public static final String SERIALIZED_NAME_API_VERSION_NUMBER_TO = "apiVersionNumberTo";
  @SerializedName(SERIALIZED_NAME_API_VERSION_NUMBER_TO)
  private MozuAppDevContractsApiVersionNumber apiVersionNumberTo = null;

  public MozuAppDevContractsApiVersionRequest applicationId(Integer applicationId) {
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

  public MozuAppDevContractsApiVersionRequest apiVersionNumberFrom(MozuAppDevContractsApiVersionNumber apiVersionNumberFrom) {
    this.apiVersionNumberFrom = apiVersionNumberFrom;
    return this;
  }

   /**
   * Get apiVersionNumberFrom
   * @return apiVersionNumberFrom
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsApiVersionNumber getApiVersionNumberFrom() {
    return apiVersionNumberFrom;
  }

  public void setApiVersionNumberFrom(MozuAppDevContractsApiVersionNumber apiVersionNumberFrom) {
    this.apiVersionNumberFrom = apiVersionNumberFrom;
  }

  public MozuAppDevContractsApiVersionRequest apiVersionNumberTo(MozuAppDevContractsApiVersionNumber apiVersionNumberTo) {
    this.apiVersionNumberTo = apiVersionNumberTo;
    return this;
  }

   /**
   * Get apiVersionNumberTo
   * @return apiVersionNumberTo
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsApiVersionNumber getApiVersionNumberTo() {
    return apiVersionNumberTo;
  }

  public void setApiVersionNumberTo(MozuAppDevContractsApiVersionNumber apiVersionNumberTo) {
    this.apiVersionNumberTo = apiVersionNumberTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApiVersionRequest mozuAppDevContractsApiVersionRequest = (MozuAppDevContractsApiVersionRequest) o;
    return Objects.equals(this.applicationId, mozuAppDevContractsApiVersionRequest.applicationId) &&
        Objects.equals(this.apiVersionNumberFrom, mozuAppDevContractsApiVersionRequest.apiVersionNumberFrom) &&
        Objects.equals(this.apiVersionNumberTo, mozuAppDevContractsApiVersionRequest.apiVersionNumberTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, apiVersionNumberFrom, apiVersionNumberTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApiVersionRequest {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    apiVersionNumberFrom: ").append(toIndentedString(apiVersionNumberFrom)).append("\n");
    sb.append("    apiVersionNumberTo: ").append(toIndentedString(apiVersionNumberTo)).append("\n");
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

