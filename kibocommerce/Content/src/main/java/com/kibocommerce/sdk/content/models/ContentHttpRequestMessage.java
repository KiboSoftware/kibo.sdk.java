/*
 * Kibo Content Service
 * OpenAPI Spec for Kibo Content Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.content.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.content.models.ContentHttpContent;
import com.kibocommerce.sdk.content.models.ContentHttpVersionPolicy;
import com.kibocommerce.sdk.content.models.HttpMethod;
import com.kibocommerce.sdk.content.models.KeyValuePair2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * ContentHttpRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentHttpRequestMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_POLICY = "versionPolicy";
  @SerializedName(SERIALIZED_NAME_VERSION_POLICY)
  private ContentHttpVersionPolicy versionPolicy;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ContentHttpContent content;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private HttpMethod method;

  public static final String SERIALIZED_NAME_REQUEST_URI = "requestUri";
  @SerializedName(SERIALIZED_NAME_REQUEST_URI)
  private URI requestUri;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<KeyValuePair2> headers = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;

  public ContentHttpRequestMessage() {
  }

  
  public ContentHttpRequestMessage(
     List<KeyValuePair2> headers, 
     Map<String, Object> properties, 
     Map<String, Object> options
  ) {
    this();
    this.headers = headers;
    this.properties = properties;
    this.options = options;
  }

  public ContentHttpRequestMessage version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ContentHttpRequestMessage versionPolicy(ContentHttpVersionPolicy versionPolicy) {
    
    this.versionPolicy = versionPolicy;
    return this;
  }

   /**
   * Get versionPolicy
   * @return versionPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentHttpVersionPolicy getVersionPolicy() {
    return versionPolicy;
  }


  public void setVersionPolicy(ContentHttpVersionPolicy versionPolicy) {
    this.versionPolicy = versionPolicy;
  }


  public ContentHttpRequestMessage content(ContentHttpContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentHttpContent getContent() {
    return content;
  }


  public void setContent(ContentHttpContent content) {
    this.content = content;
  }


  public ContentHttpRequestMessage method(HttpMethod method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HttpMethod getMethod() {
    return method;
  }


  public void setMethod(HttpMethod method) {
    this.method = method;
  }


  public ContentHttpRequestMessage requestUri(URI requestUri) {
    
    this.requestUri = requestUri;
    return this;
  }

   /**
   * Get requestUri
   * @return requestUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getRequestUri() {
    return requestUri;
  }


  public void setRequestUri(URI requestUri) {
    this.requestUri = requestUri;
  }


   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyValuePair2> getHeaders() {
    return headers;
  }




   /**
   * Get properties
   * @return properties
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getProperties() {
    return properties;
  }




   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOptions() {
    return options;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentHttpRequestMessage contentHttpRequestMessage = (ContentHttpRequestMessage) o;
    return Objects.equals(this.version, contentHttpRequestMessage.version) &&
        Objects.equals(this.versionPolicy, contentHttpRequestMessage.versionPolicy) &&
        Objects.equals(this.content, contentHttpRequestMessage.content) &&
        Objects.equals(this.method, contentHttpRequestMessage.method) &&
        Objects.equals(this.requestUri, contentHttpRequestMessage.requestUri) &&
        Objects.equals(this.headers, contentHttpRequestMessage.headers) &&
        Objects.equals(this.properties, contentHttpRequestMessage.properties) &&
        Objects.equals(this.options, contentHttpRequestMessage.options);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, versionPolicy, content, method, requestUri, headers, properties, options);
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
    sb.append("class ContentHttpRequestMessage {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionPolicy: ").append(toIndentedString(versionPolicy)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    requestUri: ").append(toIndentedString(requestUri)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("versionPolicy");
    openapiFields.add("content");
    openapiFields.add("method");
    openapiFields.add("requestUri");
    openapiFields.add("headers");
    openapiFields.add("properties");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContentHttpRequestMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContentHttpRequestMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentHttpRequestMessage is not found in the empty JSON string", ContentHttpRequestMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ContentHttpRequestMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentHttpRequestMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        ContentHttpContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `method`
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) {
        HttpMethod.validateJsonObject(jsonObj.getAsJsonObject("method"));
      }
      if ((jsonObj.get("requestUri") != null && !jsonObj.get("requestUri").isJsonNull()) && !jsonObj.get("requestUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestUri").toString()));
      }
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
          }

          // validate the optional field `headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            KeyValuePair2.validateJsonObject(jsonArrayheaders.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentHttpRequestMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentHttpRequestMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentHttpRequestMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentHttpRequestMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentHttpRequestMessage>() {
           @Override
           public void write(JsonWriter out, ContentHttpRequestMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentHttpRequestMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentHttpRequestMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentHttpRequestMessage
  * @throws IOException if the JSON string is invalid with respect to ContentHttpRequestMessage
  */
  public static ContentHttpRequestMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentHttpRequestMessage.class);
  }

 /**
  * Convert an instance of ContentHttpRequestMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

