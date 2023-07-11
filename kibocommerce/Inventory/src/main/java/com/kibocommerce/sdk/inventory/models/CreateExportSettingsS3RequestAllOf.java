/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.models.ExportSettingsS3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kibocommerce.sdk.common.JSON;

/**
 * CreateExportSettingsS3RequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateExportSettingsS3RequestAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_NAME = "exportSettingsName";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_NAME)
  private String exportSettingsName;

  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_S3 = "exportSettingsS3";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_S3)
  private ExportSettingsS3 exportSettingsS3;

  public CreateExportSettingsS3RequestAllOf() {
  }

  public CreateExportSettingsS3RequestAllOf exportSettingsName(String exportSettingsName) {
    
    this.exportSettingsName = exportSettingsName;
    return this;
  }

   /**
   * Export Settings Name to associate the ftp settings with
   * @return exportSettingsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Export Settings Name to associate the ftp settings with")

  public String getExportSettingsName() {
    return exportSettingsName;
  }


  public void setExportSettingsName(String exportSettingsName) {
    this.exportSettingsName = exportSettingsName;
  }


  public CreateExportSettingsS3RequestAllOf exportSettingsS3(ExportSettingsS3 exportSettingsS3) {
    
    this.exportSettingsS3 = exportSettingsS3;
    return this;
  }

   /**
   * Get exportSettingsS3
   * @return exportSettingsS3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExportSettingsS3 getExportSettingsS3() {
    return exportSettingsS3;
  }


  public void setExportSettingsS3(ExportSettingsS3 exportSettingsS3) {
    this.exportSettingsS3 = exportSettingsS3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExportSettingsS3RequestAllOf createExportSettingsS3RequestAllOf = (CreateExportSettingsS3RequestAllOf) o;
    return Objects.equals(this.exportSettingsName, createExportSettingsS3RequestAllOf.exportSettingsName) &&
        Objects.equals(this.exportSettingsS3, createExportSettingsS3RequestAllOf.exportSettingsS3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportSettingsName, exportSettingsS3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExportSettingsS3RequestAllOf {\n");
    sb.append("    exportSettingsName: ").append(toIndentedString(exportSettingsName)).append("\n");
    sb.append("    exportSettingsS3: ").append(toIndentedString(exportSettingsS3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("exportSettingsName");
    openapiFields.add("exportSettingsS3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateExportSettingsS3RequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateExportSettingsS3RequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateExportSettingsS3RequestAllOf is not found in the empty JSON string", CreateExportSettingsS3RequestAllOf.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CreateExportSettingsS3RequestAllOf.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateExportSettingsS3RequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("exportSettingsName") != null && !jsonObj.get("exportSettingsName").isJsonNull()) && !jsonObj.get("exportSettingsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportSettingsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportSettingsName").toString()));
      }
      // validate the optional field `exportSettingsS3`
      if (jsonObj.get("exportSettingsS3") != null && !jsonObj.get("exportSettingsS3").isJsonNull()) {
        ExportSettingsS3.validateJsonObject(jsonObj.getAsJsonObject("exportSettingsS3"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateExportSettingsS3RequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateExportSettingsS3RequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateExportSettingsS3RequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateExportSettingsS3RequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateExportSettingsS3RequestAllOf>() {
           @Override
           public void write(JsonWriter out, CreateExportSettingsS3RequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateExportSettingsS3RequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateExportSettingsS3RequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateExportSettingsS3RequestAllOf
  * @throws IOException if the JSON string is invalid with respect to CreateExportSettingsS3RequestAllOf
  */
  public static CreateExportSettingsS3RequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateExportSettingsS3RequestAllOf.class);
  }

 /**
  * Convert an instance of CreateExportSettingsS3RequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
