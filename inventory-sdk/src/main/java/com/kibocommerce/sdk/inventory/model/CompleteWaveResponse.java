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


package com.kibocommerce.sdk.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * CompleteWaveResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:31:33.449-05:00[America/Chicago]")
public class CompleteWaveResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_RECOVERY_WAVE_I_D = "recoveryWaveID";
  @SerializedName(SERIALIZED_NAME_RECOVERY_WAVE_I_D)
  private Integer recoveryWaveID;

  public static final String SERIALIZED_NAME_AUDIT_I_D = "auditID";
  @SerializedName(SERIALIZED_NAME_AUDIT_I_D)
  private Integer auditID;

  public CompleteWaveResponse recoveryWaveID(Integer recoveryWaveID) {
    this.recoveryWaveID = recoveryWaveID;
    return this;
  }

   /**
   * Recovery Wave Identifier
   * @return recoveryWaveID
  **/
  @ApiModelProperty(value = "Recovery Wave Identifier")
  public Integer getRecoveryWaveID() {
    return recoveryWaveID;
  }

  public void setRecoveryWaveID(Integer recoveryWaveID) {
    this.recoveryWaveID = recoveryWaveID;
  }

  public CompleteWaveResponse auditID(Integer auditID) {
    this.auditID = auditID;
    return this;
  }

   /**
   * Audit Identifier
   * @return auditID
  **/
  @ApiModelProperty(value = "Audit Identifier")
  public Integer getAuditID() {
    return auditID;
  }

  public void setAuditID(Integer auditID) {
    this.auditID = auditID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteWaveResponse completeWaveResponse = (CompleteWaveResponse) o;
    return Objects.equals(this.recoveryWaveID, completeWaveResponse.recoveryWaveID) &&
        Objects.equals(this.auditID, completeWaveResponse.auditID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recoveryWaveID, auditID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteWaveResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    recoveryWaveID: ").append(toIndentedString(recoveryWaveID)).append("\n");
    sb.append("    auditID: ").append(toIndentedString(auditID)).append("\n");
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
