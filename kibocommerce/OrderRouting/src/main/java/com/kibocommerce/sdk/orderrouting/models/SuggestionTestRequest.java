/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.orderrouting.models.ApiDocumentationInventoryResponse;
import com.kibocommerce.sdk.orderrouting.models.SuggestionRequest;
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
 * SuggestionTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuggestionTestRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SUGGESTION_REQUEST = "suggestionRequest";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_REQUEST)
  private SuggestionRequest suggestionRequest;

  public static final String SERIALIZED_NAME_TEST_INVENTORY_RESPONSES = "testInventoryResponses";
  @SerializedName(SERIALIZED_NAME_TEST_INVENTORY_RESPONSES)
  private List<ApiDocumentationInventoryResponse> testInventoryResponses = null;

  public SuggestionTestRequest() {
  }

  public SuggestionTestRequest suggestionRequest(SuggestionRequest suggestionRequest) {
    
    this.suggestionRequest = suggestionRequest;
    return this;
  }

   /**
   * Get suggestionRequest
   * @return suggestionRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuggestionRequest getSuggestionRequest() {
    return suggestionRequest;
  }


  public void setSuggestionRequest(SuggestionRequest suggestionRequest) {
    this.suggestionRequest = suggestionRequest;
  }


  public SuggestionTestRequest testInventoryResponses(List<ApiDocumentationInventoryResponse> testInventoryResponses) {
    
    this.testInventoryResponses = testInventoryResponses;
    return this;
  }

  public SuggestionTestRequest addTestInventoryResponsesItem(ApiDocumentationInventoryResponse testInventoryResponsesItem) {
    if (this.testInventoryResponses == null) {
      this.testInventoryResponses = new ArrayList<>();
    }
    this.testInventoryResponses.add(testInventoryResponsesItem);
    return this;
  }

   /**
   * Get testInventoryResponses
   * @return testInventoryResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApiDocumentationInventoryResponse> getTestInventoryResponses() {
    return testInventoryResponses;
  }


  public void setTestInventoryResponses(List<ApiDocumentationInventoryResponse> testInventoryResponses) {
    this.testInventoryResponses = testInventoryResponses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionTestRequest suggestionTestRequest = (SuggestionTestRequest) o;
    return Objects.equals(this.suggestionRequest, suggestionTestRequest.suggestionRequest) &&
        Objects.equals(this.testInventoryResponses, suggestionTestRequest.testInventoryResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestionRequest, testInventoryResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionTestRequest {\n");
    sb.append("    suggestionRequest: ").append(toIndentedString(suggestionRequest)).append("\n");
    sb.append("    testInventoryResponses: ").append(toIndentedString(testInventoryResponses)).append("\n");
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
    openapiFields.add("suggestionRequest");
    openapiFields.add("testInventoryResponses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionTestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SuggestionTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionTestRequest is not found in the empty JSON string", SuggestionTestRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SuggestionTestRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionTestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `suggestionRequest`
      if (jsonObj.get("suggestionRequest") != null && !jsonObj.get("suggestionRequest").isJsonNull()) {
        SuggestionRequest.validateJsonObject(jsonObj.getAsJsonObject("suggestionRequest"));
      }
      if (jsonObj.get("testInventoryResponses") != null && !jsonObj.get("testInventoryResponses").isJsonNull()) {
        JsonArray jsonArraytestInventoryResponses = jsonObj.getAsJsonArray("testInventoryResponses");
        if (jsonArraytestInventoryResponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("testInventoryResponses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `testInventoryResponses` to be an array in the JSON string but got `%s`", jsonObj.get("testInventoryResponses").toString()));
          }

          // validate the optional field `testInventoryResponses` (array)
          for (int i = 0; i < jsonArraytestInventoryResponses.size(); i++) {
            ApiDocumentationInventoryResponse.validateJsonObject(jsonArraytestInventoryResponses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionTestRequest>() {
           @Override
           public void write(JsonWriter out, SuggestionTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionTestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionTestRequest
  * @throws IOException if the JSON string is invalid with respect to SuggestionTestRequest
  */
  public static SuggestionTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionTestRequest.class);
  }

 /**
  * Convert an instance of SuggestionTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

