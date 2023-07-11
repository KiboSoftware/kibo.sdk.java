/*
 * Kibo MongoAdmin Service
 * OpenAPI Spec for Kibo MongoAdmin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.importexport.models;

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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * ExportResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "isComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_STATE_DETAILS = "stateDetails";
  @SerializedName(SERIALIZED_NAME_STATE_DETAILS)
  private String stateDetails;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Object _configuration = null;

  public ExportResource() {
  }

  public ExportResource resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public ExportResource filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public ExportResource fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public ExportResource addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public ExportResource format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public ExportResource status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ExportResource isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * Get isComplete
   * @return isComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public ExportResource statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusMessage() {
    return statusMessage;
  }


  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public ExportResource stateDetails(String stateDetails) {
    
    this.stateDetails = stateDetails;
    return this;
  }

   /**
   * Get stateDetails
   * @return stateDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateDetails() {
    return stateDetails;
  }


  public void setStateDetails(String stateDetails) {
    this.stateDetails = stateDetails;
  }


  public ExportResource _configuration(Object _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportResource exportResource = (ExportResource) o;
    return Objects.equals(this.resource, exportResource.resource) &&
        Objects.equals(this.filter, exportResource.filter) &&
        Objects.equals(this.fields, exportResource.fields) &&
        Objects.equals(this.format, exportResource.format) &&
        Objects.equals(this.status, exportResource.status) &&
        Objects.equals(this.isComplete, exportResource.isComplete) &&
        Objects.equals(this.statusMessage, exportResource.statusMessage) &&
        Objects.equals(this.stateDetails, exportResource.stateDetails) &&
        Objects.equals(this._configuration, exportResource._configuration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, filter, fields, format, status, isComplete, statusMessage, stateDetails, _configuration);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportResource {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    stateDetails: ").append(toIndentedString(stateDetails)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
    openapiFields.add("resource");
    openapiFields.add("filter");
    openapiFields.add("fields");
    openapiFields.add("format");
    openapiFields.add("status");
    openapiFields.add("isComplete");
    openapiFields.add("statusMessage");
    openapiFields.add("stateDetails");
    openapiFields.add("configuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportResource is not found in the empty JSON string", ExportResource.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ExportResource.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportResource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) && !jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("statusMessage") != null && !jsonObj.get("statusMessage").isJsonNull()) && !jsonObj.get("statusMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusMessage").toString()));
      }
      if ((jsonObj.get("stateDetails") != null && !jsonObj.get("stateDetails").isJsonNull()) && !jsonObj.get("stateDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportResource.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportResource>() {
           @Override
           public void write(JsonWriter out, ExportResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportResource
  * @throws IOException if the JSON string is invalid with respect to ExportResource
  */
  public static ExportResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportResource.class);
  }

 /**
  * Convert an instance of ExportResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

