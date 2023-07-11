/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

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
 * PublishingScope
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublishingScope implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALL_PENDING = "allPending";
  @SerializedName(SERIALIZED_NAME_ALL_PENDING)
  private Boolean allPending;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "productCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public static final String SERIALIZED_NAME_PUBLISH_SET_CODE = "publishSetCode";
  @SerializedName(SERIALIZED_NAME_PUBLISH_SET_CODE)
  private String publishSetCode;

  public PublishingScope() {
  }

  public PublishingScope allPending(Boolean allPending) {
    
    this.allPending = allPending;
    return this;
  }

   /**
   * True &#x3D; scope to all pending products
   * @return allPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True = scope to all pending products")

  public Boolean getAllPending() {
    return allPending;
  }


  public void setAllPending(Boolean allPending) {
    this.allPending = allPending;
  }


  public PublishingScope productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public PublishingScope addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * List of specific productCodes to scope publish operation against
   * @return productCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of specific productCodes to scope publish operation against")

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }


  public PublishingScope publishSetCode(String publishSetCode) {
    
    this.publishSetCode = publishSetCode;
    return this;
  }

   /**
   * The Publish Set to publish
   * @return publishSetCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Publish Set to publish")

  public String getPublishSetCode() {
    return publishSetCode;
  }


  public void setPublishSetCode(String publishSetCode) {
    this.publishSetCode = publishSetCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishingScope publishingScope = (PublishingScope) o;
    return Objects.equals(this.allPending, publishingScope.allPending) &&
        Objects.equals(this.productCodes, publishingScope.productCodes) &&
        Objects.equals(this.publishSetCode, publishingScope.publishSetCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPending, productCodes, publishSetCode);
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
    sb.append("class PublishingScope {\n");
    sb.append("    allPending: ").append(toIndentedString(allPending)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    publishSetCode: ").append(toIndentedString(publishSetCode)).append("\n");
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
    openapiFields.add("allPending");
    openapiFields.add("productCodes");
    openapiFields.add("publishSetCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublishingScope
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublishingScope.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublishingScope is not found in the empty JSON string", PublishingScope.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PublishingScope.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublishingScope` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("productCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCodes` to be an array in the JSON string but got `%s`", jsonObj.get("productCodes").toString()));
      }
      if ((jsonObj.get("publishSetCode") != null && !jsonObj.get("publishSetCode").isJsonNull()) && !jsonObj.get("publishSetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publishSetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publishSetCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublishingScope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublishingScope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublishingScope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublishingScope.class));

       return (TypeAdapter<T>) new TypeAdapter<PublishingScope>() {
           @Override
           public void write(JsonWriter out, PublishingScope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublishingScope read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublishingScope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublishingScope
  * @throws IOException if the JSON string is invalid with respect to PublishingScope
  */
  public static PublishingScope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublishingScope.class);
  }

 /**
  * Convert an instance of PublishingScope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

