/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesProductImageGroupTag;
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
 * CatalogRuntimesProductImageGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesProductImageGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_GROUP_ID = "productImageGroupId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_GROUP_ID)
  private String productImageGroupId;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_GROUP_TAGS = "productImageGroupTags";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_GROUP_TAGS)
  private List<CatalogRuntimesProductImageGroupTag> productImageGroupTags = null;

  public CatalogRuntimesProductImageGroup() {
  }

  public CatalogRuntimesProductImageGroup productImageGroupId(String productImageGroupId) {
    
    this.productImageGroupId = productImageGroupId;
    return this;
  }

   /**
   * Get productImageGroupId
   * @return productImageGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProductImageGroupId() {
    return productImageGroupId;
  }


  public void setProductImageGroupId(String productImageGroupId) {
    this.productImageGroupId = productImageGroupId;
  }


  public CatalogRuntimesProductImageGroup productImageGroupTags(List<CatalogRuntimesProductImageGroupTag> productImageGroupTags) {
    
    this.productImageGroupTags = productImageGroupTags;
    return this;
  }

  public CatalogRuntimesProductImageGroup addProductImageGroupTagsItem(CatalogRuntimesProductImageGroupTag productImageGroupTagsItem) {
    if (this.productImageGroupTags == null) {
      this.productImageGroupTags = new ArrayList<>();
    }
    this.productImageGroupTags.add(productImageGroupTagsItem);
    return this;
  }

   /**
   * Get productImageGroupTags
   * @return productImageGroupTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CatalogRuntimesProductImageGroupTag> getProductImageGroupTags() {
    return productImageGroupTags;
  }


  public void setProductImageGroupTags(List<CatalogRuntimesProductImageGroupTag> productImageGroupTags) {
    this.productImageGroupTags = productImageGroupTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesProductImageGroup catalogRuntimesProductImageGroup = (CatalogRuntimesProductImageGroup) o;
    return Objects.equals(this.productImageGroupId, catalogRuntimesProductImageGroup.productImageGroupId) &&
        Objects.equals(this.productImageGroupTags, catalogRuntimesProductImageGroup.productImageGroupTags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productImageGroupId, productImageGroupTags);
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
    sb.append("class CatalogRuntimesProductImageGroup {\n");
    sb.append("    productImageGroupId: ").append(toIndentedString(productImageGroupId)).append("\n");
    sb.append("    productImageGroupTags: ").append(toIndentedString(productImageGroupTags)).append("\n");
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
    openapiFields.add("productImageGroupId");
    openapiFields.add("productImageGroupTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("productImageGroupId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesProductImageGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesProductImageGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesProductImageGroup is not found in the empty JSON string", CatalogRuntimesProductImageGroup.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesProductImageGroup.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesProductImageGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogRuntimesProductImageGroup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("productImageGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productImageGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productImageGroupId").toString()));
      }
      if (jsonObj.get("productImageGroupTags") != null && !jsonObj.get("productImageGroupTags").isJsonNull()) {
        JsonArray jsonArrayproductImageGroupTags = jsonObj.getAsJsonArray("productImageGroupTags");
        if (jsonArrayproductImageGroupTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productImageGroupTags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productImageGroupTags` to be an array in the JSON string but got `%s`", jsonObj.get("productImageGroupTags").toString()));
          }

          // validate the optional field `productImageGroupTags` (array)
          for (int i = 0; i < jsonArrayproductImageGroupTags.size(); i++) {
            CatalogRuntimesProductImageGroupTag.validateJsonObject(jsonArrayproductImageGroupTags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesProductImageGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesProductImageGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesProductImageGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesProductImageGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesProductImageGroup>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesProductImageGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesProductImageGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesProductImageGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesProductImageGroup
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesProductImageGroup
  */
  public static CatalogRuntimesProductImageGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesProductImageGroup.class);
  }

 /**
  * Convert an instance of CatalogRuntimesProductImageGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

