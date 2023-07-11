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
 * ProductSortExpression
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSortExpression implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public ProductSortExpression() {
  }

  public ProductSortExpression field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * The name of the field to sort on.  Must be a known sort field or sortable attribute
   * @return field
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the field to sort on.  Must be a known sort field or sortable attribute")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public ProductSortExpression direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * ASC or DESC
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ASC or DESC")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSortExpression productSortExpression = (ProductSortExpression) o;
    return Objects.equals(this.field, productSortExpression.field) &&
        Objects.equals(this.direction, productSortExpression.direction);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, direction);
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
    sb.append("class ProductSortExpression {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSortExpression
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSortExpression.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSortExpression is not found in the empty JSON string", ProductSortExpression.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductSortExpression.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSortExpression` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductSortExpression.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSortExpression.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSortExpression' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSortExpression> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSortExpression.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSortExpression>() {
           @Override
           public void write(JsonWriter out, ProductSortExpression value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSortExpression read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSortExpression given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSortExpression
  * @throws IOException if the JSON string is invalid with respect to ProductSortExpression
  */
  public static ProductSortExpression fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSortExpression.class);
  }

 /**
  * Convert an instance of ProductSortExpression to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
