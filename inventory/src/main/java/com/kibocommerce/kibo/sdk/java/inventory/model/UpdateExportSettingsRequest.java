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
import com.kibocommerce.kibo.sdk.java.inventory.model.ExportSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateExportSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:18:39.656-05:00[America/Chicago]")
public class UpdateExportSettingsRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_EXPORT_SETTINGS = "exportSettings";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS)
  private ExportSettings exportSettings = null;

  public UpdateExportSettingsRequest exportSettings(ExportSettings exportSettings) {
    this.exportSettings = exportSettings;
    return this;
  }

   /**
   * Get exportSettings
   * @return exportSettings
  **/
  @ApiModelProperty(required = true, value = "")
  public ExportSettings getExportSettings() {
    return exportSettings;
  }

  public void setExportSettings(ExportSettings exportSettings) {
    this.exportSettings = exportSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExportSettingsRequest updateExportSettingsRequest = (UpdateExportSettingsRequest) o;
    return Objects.equals(this.exportSettings, updateExportSettingsRequest.exportSettings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportSettings, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExportSettingsRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportSettings: ").append(toIndentedString(exportSettings)).append("\n");
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

