/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.kibo.sdk.java.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.kibo.sdk.java.inventory.model.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CloneTenantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-22T23:27:35.732-05:00[America/Chicago]")
public class CloneTenantRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TARGET_TENANT_NAME = "targetTenantName";
  @SerializedName(SERIALIZED_NAME_TARGET_TENANT_NAME)
  private String targetTenantName;

  public static final String SERIALIZED_NAME_SOURCE_TENANT_I_D = "sourceTenantID";
  @SerializedName(SERIALIZED_NAME_SOURCE_TENANT_I_D)
  private Integer sourceTenantID;

  public static final String SERIALIZED_NAME_TARGET_TENANT_I_D = "targetTenantID";
  @SerializedName(SERIALIZED_NAME_TARGET_TENANT_I_D)
  private Integer targetTenantID;

  public CloneTenantRequest targetTenantName(String targetTenantName) {
    this.targetTenantName = targetTenantName;
    return this;
  }

   /**
   * Target Tenant name
   * @return targetTenantName
  **/
  @ApiModelProperty(value = "Target Tenant name")
  public String getTargetTenantName() {
    return targetTenantName;
  }

  public void setTargetTenantName(String targetTenantName) {
    this.targetTenantName = targetTenantName;
  }

  public CloneTenantRequest sourceTenantID(Integer sourceTenantID) {
    this.sourceTenantID = sourceTenantID;
    return this;
  }

   /**
   * Source Tenant ID
   * @return sourceTenantID
  **/
  @ApiModelProperty(value = "Source Tenant ID")
  public Integer getSourceTenantID() {
    return sourceTenantID;
  }

  public void setSourceTenantID(Integer sourceTenantID) {
    this.sourceTenantID = sourceTenantID;
  }

  public CloneTenantRequest targetTenantID(Integer targetTenantID) {
    this.targetTenantID = targetTenantID;
    return this;
  }

   /**
   * Target Tenant ID
   * @return targetTenantID
  **/
  @ApiModelProperty(value = "Target Tenant ID")
  public Integer getTargetTenantID() {
    return targetTenantID;
  }

  public void setTargetTenantID(Integer targetTenantID) {
    this.targetTenantID = targetTenantID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneTenantRequest cloneTenantRequest = (CloneTenantRequest) o;
    return Objects.equals(this.targetTenantName, cloneTenantRequest.targetTenantName) &&
        Objects.equals(this.sourceTenantID, cloneTenantRequest.sourceTenantID) &&
        Objects.equals(this.targetTenantID, cloneTenantRequest.targetTenantID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetTenantName, sourceTenantID, targetTenantID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneTenantRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetTenantName: ").append(toIndentedString(targetTenantName)).append("\n");
    sb.append("    sourceTenantID: ").append(toIndentedString(sourceTenantID)).append("\n");
    sb.append("    targetTenantID: ").append(toIndentedString(targetTenantID)).append("\n");
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

