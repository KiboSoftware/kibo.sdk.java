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
 * UpdateExportSettingsS3Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:19:08.239507-05:00[America/Chicago]")
public class UpdateExportSettingsS3Response extends BaseResponse {
  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_S3_I_D = "exportSettingsS3ID";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_S3_I_D)
  private Integer exportSettingsS3ID;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_I_D = "exportSettingsID";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_I_D)
  private Integer exportSettingsID;

  public UpdateExportSettingsS3Response tenantID(Integer tenantID) {
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantID
  **/
  @ApiModelProperty(value = "Tenant ID")
  public Integer getTenantID() {
    return tenantID;
  }

  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }

  public UpdateExportSettingsS3Response exportSettingsS3ID(Integer exportSettingsS3ID) {
    this.exportSettingsS3ID = exportSettingsS3ID;
    return this;
  }

   /**
   * Export Settings S3 ID
   * @return exportSettingsS3ID
  **/
  @ApiModelProperty(value = "Export Settings S3 ID")
  public Integer getExportSettingsS3ID() {
    return exportSettingsS3ID;
  }

  public void setExportSettingsS3ID(Integer exportSettingsS3ID) {
    this.exportSettingsS3ID = exportSettingsS3ID;
  }

  public UpdateExportSettingsS3Response exportSettingsID(Integer exportSettingsID) {
    this.exportSettingsID = exportSettingsID;
    return this;
  }

   /**
   * Export Settings ID to associate the s3 settings with
   * @return exportSettingsID
  **/
  @ApiModelProperty(value = "Export Settings ID to associate the s3 settings with")
  public Integer getExportSettingsID() {
    return exportSettingsID;
  }

  public void setExportSettingsID(Integer exportSettingsID) {
    this.exportSettingsID = exportSettingsID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExportSettingsS3Response updateExportSettingsS3Response = (UpdateExportSettingsS3Response) o;
    return Objects.equals(this.tenantID, updateExportSettingsS3Response.tenantID) &&
        Objects.equals(this.exportSettingsS3ID, updateExportSettingsS3Response.exportSettingsS3ID) &&
        Objects.equals(this.exportSettingsID, updateExportSettingsS3Response.exportSettingsID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantID, exportSettingsS3ID, exportSettingsID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExportSettingsS3Response {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    exportSettingsS3ID: ").append(toIndentedString(exportSettingsS3ID)).append("\n");
    sb.append("    exportSettingsID: ").append(toIndentedString(exportSettingsID)).append("\n");
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

