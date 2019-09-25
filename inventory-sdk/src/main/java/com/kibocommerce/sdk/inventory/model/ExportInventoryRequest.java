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
import com.kibocommerce.sdk.inventory.model.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExportInventoryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class ExportInventoryRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_NAME = "exportSettingsName";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_NAME)
  private String exportSettingsName;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_F_T_P_NAME = "exportSettingsFTPName";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_F_T_P_NAME)
  private String exportSettingsFTPName;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_S3_NAME = "exportSettingsS3Name";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_S3_NAME)
  private String exportSettingsS3Name;

  public static final String SERIALIZED_NAME_DEVELOPMENT = "development";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT)
  private Boolean development;

  public ExportInventoryRequest exportSettingsName(String exportSettingsName) {
    this.exportSettingsName = exportSettingsName;
    return this;
  }

   /**
   * Name of the Export Settings to use
   * @return exportSettingsName
  **/
  @ApiModelProperty(value = "Name of the Export Settings to use")
  public String getExportSettingsName() {
    return exportSettingsName;
  }

  public void setExportSettingsName(String exportSettingsName) {
    this.exportSettingsName = exportSettingsName;
  }

  public ExportInventoryRequest exportSettingsFTPName(String exportSettingsFTPName) {
    this.exportSettingsFTPName = exportSettingsFTPName;
    return this;
  }

   /**
   * Name of the FTP Settings to use. Will only check for this if exportID is already set
   * @return exportSettingsFTPName
  **/
  @ApiModelProperty(value = "Name of the FTP Settings to use. Will only check for this if exportID is already set")
  public String getExportSettingsFTPName() {
    return exportSettingsFTPName;
  }

  public void setExportSettingsFTPName(String exportSettingsFTPName) {
    this.exportSettingsFTPName = exportSettingsFTPName;
  }

  public ExportInventoryRequest exportSettingsS3Name(String exportSettingsS3Name) {
    this.exportSettingsS3Name = exportSettingsS3Name;
    return this;
  }

   /**
   * Name of the S3 Settings to use. Will only check for this if exportID is already set
   * @return exportSettingsS3Name
  **/
  @ApiModelProperty(value = "Name of the S3 Settings to use. Will only check for this if exportID is already set")
  public String getExportSettingsS3Name() {
    return exportSettingsS3Name;
  }

  public void setExportSettingsS3Name(String exportSettingsS3Name) {
    this.exportSettingsS3Name = exportSettingsS3Name;
  }

  public ExportInventoryRequest development(Boolean development) {
    this.development = development;
    return this;
  }

   /**
   * Flag for sending the exports to the development droppoint
   * @return development
  **/
  @ApiModelProperty(value = "Flag for sending the exports to the development droppoint")
  public Boolean getDevelopment() {
    return development;
  }

  public void setDevelopment(Boolean development) {
    this.development = development;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportInventoryRequest exportInventoryRequest = (ExportInventoryRequest) o;
    return Objects.equals(this.exportSettingsName, exportInventoryRequest.exportSettingsName) &&
        Objects.equals(this.exportSettingsFTPName, exportInventoryRequest.exportSettingsFTPName) &&
        Objects.equals(this.exportSettingsS3Name, exportInventoryRequest.exportSettingsS3Name) &&
        Objects.equals(this.development, exportInventoryRequest.development) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportSettingsName, exportSettingsFTPName, exportSettingsS3Name, development, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportInventoryRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportSettingsName: ").append(toIndentedString(exportSettingsName)).append("\n");
    sb.append("    exportSettingsFTPName: ").append(toIndentedString(exportSettingsFTPName)).append("\n");
    sb.append("    exportSettingsS3Name: ").append(toIndentedString(exportSettingsS3Name)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
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

