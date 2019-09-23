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
import com.kibocommerce.kibo.sdk.java.inventory.model.ExportSettingsS3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateExportSettingsS3Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-22T23:27:35.732-05:00[America/Chicago]")
public class CreateExportSettingsS3Request extends BaseRequest {
  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_NAME = "exportSettingsName";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_NAME)
  private String exportSettingsName;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_S3 = "exportSettingsS3";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_S3)
  private ExportSettingsS3 exportSettingsS3 = null;

  public CreateExportSettingsS3Request exportSettingsName(String exportSettingsName) {
    this.exportSettingsName = exportSettingsName;
    return this;
  }

   /**
   * Export Settings Name to associate the ftp settings with
   * @return exportSettingsName
  **/
  @ApiModelProperty(required = true, value = "Export Settings Name to associate the ftp settings with")
  public String getExportSettingsName() {
    return exportSettingsName;
  }

  public void setExportSettingsName(String exportSettingsName) {
    this.exportSettingsName = exportSettingsName;
  }

  public CreateExportSettingsS3Request exportSettingsS3(ExportSettingsS3 exportSettingsS3) {
    this.exportSettingsS3 = exportSettingsS3;
    return this;
  }

   /**
   * Get exportSettingsS3
   * @return exportSettingsS3
  **/
  @ApiModelProperty(required = true, value = "")
  public ExportSettingsS3 getExportSettingsS3() {
    return exportSettingsS3;
  }

  public void setExportSettingsS3(ExportSettingsS3 exportSettingsS3) {
    this.exportSettingsS3 = exportSettingsS3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExportSettingsS3Request createExportSettingsS3Request = (CreateExportSettingsS3Request) o;
    return Objects.equals(this.exportSettingsName, createExportSettingsS3Request.exportSettingsName) &&
        Objects.equals(this.exportSettingsS3, createExportSettingsS3Request.exportSettingsS3) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportSettingsName, exportSettingsS3, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExportSettingsS3Request {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportSettingsName: ").append(toIndentedString(exportSettingsName)).append("\n");
    sb.append("    exportSettingsS3: ").append(toIndentedString(exportSettingsS3)).append("\n");
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

