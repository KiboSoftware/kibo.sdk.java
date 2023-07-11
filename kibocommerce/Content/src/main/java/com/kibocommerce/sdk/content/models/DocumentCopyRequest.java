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
 * DocumentCopyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCopyRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "documentIds";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<String> documentIds = null;

  public static final String SERIALIZED_NAME_DESTINATION_PATH = "destinationPath";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PATH)
  private String destinationPath;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public DocumentCopyRequest() {
  }

  public DocumentCopyRequest documentIds(List<String> documentIds) {
    
    this.documentIds = documentIds;
    return this;
  }

  public DocumentCopyRequest addDocumentIdsItem(String documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

   /**
   * Document Id&#39;s to copy
   * @return documentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document Id's to copy")

  public List<String> getDocumentIds() {
    return documentIds;
  }


  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }


  public DocumentCopyRequest destinationPath(String destinationPath) {
    
    this.destinationPath = destinationPath;
    return this;
  }

   /**
   * The destination path to copy documents to
   * @return destinationPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The destination path to copy documents to")

  public String getDestinationPath() {
    return destinationPath;
  }


  public void setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
  }


  public DocumentCopyRequest updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCopyRequest documentCopyRequest = (DocumentCopyRequest) o;
    return Objects.equals(this.documentIds, documentCopyRequest.documentIds) &&
        Objects.equals(this.destinationPath, documentCopyRequest.destinationPath) &&
        Objects.equals(this.updatedBy, documentCopyRequest.updatedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIds, destinationPath, updatedBy);
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
    sb.append("class DocumentCopyRequest {\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    destinationPath: ").append(toIndentedString(destinationPath)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
    openapiFields.add("documentIds");
    openapiFields.add("destinationPath");
    openapiFields.add("updatedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentCopyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentCopyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentCopyRequest is not found in the empty JSON string", DocumentCopyRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DocumentCopyRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentCopyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("documentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentIds` to be an array in the JSON string but got `%s`", jsonObj.get("documentIds").toString()));
      }
      if ((jsonObj.get("destinationPath") != null && !jsonObj.get("destinationPath").isJsonNull()) && !jsonObj.get("destinationPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationPath").toString()));
      }
      if ((jsonObj.get("updatedBy") != null && !jsonObj.get("updatedBy").isJsonNull()) && !jsonObj.get("updatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentCopyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentCopyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentCopyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentCopyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentCopyRequest>() {
           @Override
           public void write(JsonWriter out, DocumentCopyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentCopyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentCopyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentCopyRequest
  * @throws IOException if the JSON string is invalid with respect to DocumentCopyRequest
  */
  public static DocumentCopyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentCopyRequest.class);
  }

 /**
  * Convert an instance of DocumentCopyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

