/*
 * Kibo Reference Service
 * OpenAPI Spec for Kibo Reference Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reference.models;

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
 * UnitOfMeasure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnitOfMeasure implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLURAL_NAME = "pluralName";
  @SerializedName(SERIALIZED_NAME_PLURAL_NAME)
  private String pluralName;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE_TYPE = "unitOfMeasureType";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE_TYPE)
  private String unitOfMeasureType;

  public UnitOfMeasure() {
  }

  public UnitOfMeasure symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public UnitOfMeasure name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UnitOfMeasure pluralName(String pluralName) {
    
    this.pluralName = pluralName;
    return this;
  }

   /**
   * Get pluralName
   * @return pluralName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPluralName() {
    return pluralName;
  }


  public void setPluralName(String pluralName) {
    this.pluralName = pluralName;
  }


  public UnitOfMeasure unitOfMeasureType(String unitOfMeasureType) {
    
    this.unitOfMeasureType = unitOfMeasureType;
    return this;
  }

   /**
   * This value can be \&quot;Length\&quot;, \&quot;Weight\&quot;, or \&quot;Volume\&quot;
   * @return unitOfMeasureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value can be \"Length\", \"Weight\", or \"Volume\"")

  public String getUnitOfMeasureType() {
    return unitOfMeasureType;
  }


  public void setUnitOfMeasureType(String unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitOfMeasure unitOfMeasure = (UnitOfMeasure) o;
    return Objects.equals(this.symbol, unitOfMeasure.symbol) &&
        Objects.equals(this.name, unitOfMeasure.name) &&
        Objects.equals(this.pluralName, unitOfMeasure.pluralName) &&
        Objects.equals(this.unitOfMeasureType, unitOfMeasure.unitOfMeasureType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, pluralName, unitOfMeasureType);
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
    sb.append("class UnitOfMeasure {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluralName: ").append(toIndentedString(pluralName)).append("\n");
    sb.append("    unitOfMeasureType: ").append(toIndentedString(unitOfMeasureType)).append("\n");
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
    openapiFields.add("symbol");
    openapiFields.add("name");
    openapiFields.add("pluralName");
    openapiFields.add("unitOfMeasureType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnitOfMeasure
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UnitOfMeasure.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnitOfMeasure is not found in the empty JSON string", UnitOfMeasure.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!UnitOfMeasure.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnitOfMeasure` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pluralName") != null && !jsonObj.get("pluralName").isJsonNull()) && !jsonObj.get("pluralName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluralName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluralName").toString()));
      }
      if ((jsonObj.get("unitOfMeasureType") != null && !jsonObj.get("unitOfMeasureType").isJsonNull()) && !jsonObj.get("unitOfMeasureType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitOfMeasureType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitOfMeasureType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnitOfMeasure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnitOfMeasure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnitOfMeasure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnitOfMeasure.class));

       return (TypeAdapter<T>) new TypeAdapter<UnitOfMeasure>() {
           @Override
           public void write(JsonWriter out, UnitOfMeasure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnitOfMeasure read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnitOfMeasure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnitOfMeasure
  * @throws IOException if the JSON string is invalid with respect to UnitOfMeasure
  */
  public static UnitOfMeasure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnitOfMeasure.class);
  }

 /**
  * Convert an instance of UnitOfMeasure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

