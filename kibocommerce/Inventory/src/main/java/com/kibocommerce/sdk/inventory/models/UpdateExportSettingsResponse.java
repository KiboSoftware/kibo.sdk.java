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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Update Export Settings Response
 */
@ApiModel(description = "Update Export Settings Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateExportSettingsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public UpdateExportSettingsResponse() {
  }

  public UpdateExportSettingsResponse tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant ID")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public UpdateExportSettingsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateExportSettingsResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Flag for success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for success")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public UpdateExportSettingsResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public UpdateExportSettingsResponse addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * List of messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of messages")

  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  public UpdateExportSettingsResponse numResults(Integer numResults) {
    
    this.numResults = numResults;
    return this;
  }

   /**
   * Number of results
   * @return numResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of results")

  public Integer getNumResults() {
    return numResults;
  }


  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExportSettingsResponse updateExportSettingsResponse = (UpdateExportSettingsResponse) o;
    return Objects.equals(this.tenantID, updateExportSettingsResponse.tenantID) &&
        Objects.equals(this.name, updateExportSettingsResponse.name) &&
        Objects.equals(this.success, updateExportSettingsResponse.success) &&
        Objects.equals(this.messages, updateExportSettingsResponse.messages) &&
        Objects.equals(this.numResults, updateExportSettingsResponse.numResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantID, name, success, messages, numResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExportSettingsResponse {\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
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
    openapiFields.add("tenantID");
    openapiFields.add("name");
    openapiFields.add("success");
    openapiFields.add("messages");
    openapiFields.add("numResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateExportSettingsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateExportSettingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateExportSettingsResponse is not found in the empty JSON string", UpdateExportSettingsResponse.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!UpdateExportSettingsResponse.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateExportSettingsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateExportSettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateExportSettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateExportSettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateExportSettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateExportSettingsResponse>() {
           @Override
           public void write(JsonWriter out, UpdateExportSettingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateExportSettingsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateExportSettingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateExportSettingsResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateExportSettingsResponse
  */
  public static UpdateExportSettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateExportSettingsResponse.class);
  }

 /**
  * Convert an instance of UpdateExportSettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

