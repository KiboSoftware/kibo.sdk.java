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
 * Information about the relationship between a Mozu.ProductAdmin.Contracts.Product and a productCollection (product with usagetype of collection)  This is only represented on the product member side of the relationship.
 */
@ApiModel(description = "Information about the relationship between a Mozu.ProductAdmin.Contracts.Product and a productCollection (product with usagetype of collection)  This is only represented on the product member side of the relationship.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsProductCollectionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COLLECTION_PRODUCT_CODE = "collectionProductCode";
  @SerializedName(SERIALIZED_NAME_COLLECTION_PRODUCT_CODE)
  private String collectionProductCode;

  public static final String SERIALIZED_NAME_COLLECTION_NAME = "collectionName";
  @SerializedName(SERIALIZED_NAME_COLLECTION_NAME)
  private String collectionName;

  public static final String SERIALIZED_NAME_IS_PRIMARY_COLLECTION = "isPrimaryCollection";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_COLLECTION)
  private Boolean isPrimaryCollection;

  public CatalogAdminsProductCollectionInfo() {
  }

  public CatalogAdminsProductCollectionInfo collectionProductCode(String collectionProductCode) {
    
    this.collectionProductCode = collectionProductCode;
    return this;
  }

   /**
   * Product code of the product that is the collection that the containing product belongs to
   * @return collectionProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product code of the product that is the collection that the containing product belongs to")

  public String getCollectionProductCode() {
    return collectionProductCode;
  }


  public void setCollectionProductCode(String collectionProductCode) {
    this.collectionProductCode = collectionProductCode;
  }


  public CatalogAdminsProductCollectionInfo collectionName(String collectionName) {
    
    this.collectionName = collectionName;
    return this;
  }

   /**
   * Collection name in the language of the master catalog
   * @return collectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection name in the language of the master catalog")

  public String getCollectionName() {
    return collectionName;
  }


  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }


  public CatalogAdminsProductCollectionInfo isPrimaryCollection(Boolean isPrimaryCollection) {
    
    this.isPrimaryCollection = isPrimaryCollection;
    return this;
  }

   /**
   * True when this is the primary collection for the containing product.
   * @return isPrimaryCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True when this is the primary collection for the containing product.")

  public Boolean getIsPrimaryCollection() {
    return isPrimaryCollection;
  }


  public void setIsPrimaryCollection(Boolean isPrimaryCollection) {
    this.isPrimaryCollection = isPrimaryCollection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsProductCollectionInfo catalogAdminsProductCollectionInfo = (CatalogAdminsProductCollectionInfo) o;
    return Objects.equals(this.collectionProductCode, catalogAdminsProductCollectionInfo.collectionProductCode) &&
        Objects.equals(this.collectionName, catalogAdminsProductCollectionInfo.collectionName) &&
        Objects.equals(this.isPrimaryCollection, catalogAdminsProductCollectionInfo.isPrimaryCollection);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionProductCode, collectionName, isPrimaryCollection);
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
    sb.append("class CatalogAdminsProductCollectionInfo {\n");
    sb.append("    collectionProductCode: ").append(toIndentedString(collectionProductCode)).append("\n");
    sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
    sb.append("    isPrimaryCollection: ").append(toIndentedString(isPrimaryCollection)).append("\n");
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
    openapiFields.add("collectionProductCode");
    openapiFields.add("collectionName");
    openapiFields.add("isPrimaryCollection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsProductCollectionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsProductCollectionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsProductCollectionInfo is not found in the empty JSON string", CatalogAdminsProductCollectionInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsProductCollectionInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsProductCollectionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("collectionProductCode") != null && !jsonObj.get("collectionProductCode").isJsonNull()) && !jsonObj.get("collectionProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionProductCode").toString()));
      }
      if ((jsonObj.get("collectionName") != null && !jsonObj.get("collectionName").isJsonNull()) && !jsonObj.get("collectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsProductCollectionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsProductCollectionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsProductCollectionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsProductCollectionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsProductCollectionInfo>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsProductCollectionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsProductCollectionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsProductCollectionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsProductCollectionInfo
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsProductCollectionInfo
  */
  public static CatalogAdminsProductCollectionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsProductCollectionInfo.class);
  }

 /**
  * Convert an instance of CatalogAdminsProductCollectionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

