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
 * SearchMerchandizingImpactItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchMerchandizingImpactItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_SLICE_VALUE = "sliceValue";
  @SerializedName(SERIALIZED_NAME_SLICE_VALUE)
  private String sliceValue;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_IS_PINNED = "isPinned";
  @SerializedName(SERIALIZED_NAME_IS_PINNED)
  private Boolean isPinned;

  public SearchMerchandizingImpactItem() {
  }

  public SearchMerchandizingImpactItem productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public SearchMerchandizingImpactItem sliceValue(String sliceValue) {
    
    this.sliceValue = sliceValue;
    return this;
  }

   /**
   * Get sliceValue
   * @return sliceValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSliceValue() {
    return sliceValue;
  }


  public void setSliceValue(String sliceValue) {
    this.sliceValue = sliceValue;
  }


  public SearchMerchandizingImpactItem position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public SearchMerchandizingImpactItem isPinned(Boolean isPinned) {
    
    this.isPinned = isPinned;
    return this;
  }

   /**
   * Get isPinned
   * @return isPinned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPinned() {
    return isPinned;
  }


  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMerchandizingImpactItem searchMerchandizingImpactItem = (SearchMerchandizingImpactItem) o;
    return Objects.equals(this.productCode, searchMerchandizingImpactItem.productCode) &&
        Objects.equals(this.sliceValue, searchMerchandizingImpactItem.sliceValue) &&
        Objects.equals(this.position, searchMerchandizingImpactItem.position) &&
        Objects.equals(this.isPinned, searchMerchandizingImpactItem.isPinned);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, sliceValue, position, isPinned);
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
    sb.append("class SearchMerchandizingImpactItem {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    sliceValue: ").append(toIndentedString(sliceValue)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("sliceValue");
    openapiFields.add("position");
    openapiFields.add("isPinned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchMerchandizingImpactItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchMerchandizingImpactItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMerchandizingImpactItem is not found in the empty JSON string", SearchMerchandizingImpactItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchMerchandizingImpactItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMerchandizingImpactItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("sliceValue") != null && !jsonObj.get("sliceValue").isJsonNull()) && !jsonObj.get("sliceValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sliceValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sliceValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMerchandizingImpactItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMerchandizingImpactItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMerchandizingImpactItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMerchandizingImpactItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMerchandizingImpactItem>() {
           @Override
           public void write(JsonWriter out, SearchMerchandizingImpactItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMerchandizingImpactItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchMerchandizingImpactItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchMerchandizingImpactItem
  * @throws IOException if the JSON string is invalid with respect to SearchMerchandizingImpactItem
  */
  public static SearchMerchandizingImpactItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMerchandizingImpactItem.class);
  }

 /**
  * Convert an instance of SearchMerchandizingImpactItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

