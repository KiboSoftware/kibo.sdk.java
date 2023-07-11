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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductPropertyValue;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductVariationProperty implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<CatalogAdminsProductPropertyValue> values = null;

  public ProductVariationProperty() {
  }

  public ProductVariationProperty attributeFQN(String attributeFQN) {
    
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * Unique identifier of the Attribute.
   * @return attributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Attribute.")

  public String getAttributeFQN() {
    return attributeFQN;
  }


  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }


  public ProductVariationProperty values(List<CatalogAdminsProductPropertyValue> values) {
    
    this.values = values;
    return this;
  }

  public ProductVariationProperty addValuesItem(CatalogAdminsProductPropertyValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CatalogAdminsProductPropertyValue> getValues() {
    return values;
  }


  public void setValues(List<CatalogAdminsProductPropertyValue> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariationProperty productVariationProperty = (ProductVariationProperty) o;
    return Objects.equals(this.attributeFQN, productVariationProperty.attributeFQN) &&
        Objects.equals(this.values, productVariationProperty.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeFQN, values);
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
    sb.append("class ProductVariationProperty {\n");
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("attributeFQN");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductVariationProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductVariationProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductVariationProperty is not found in the empty JSON string", ProductVariationProperty.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductVariationProperty.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductVariationProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("attributeFQN") != null && !jsonObj.get("attributeFQN").isJsonNull()) && !jsonObj.get("attributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeFQN").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            CatalogAdminsProductPropertyValue.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductVariationProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductVariationProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductVariationProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductVariationProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductVariationProperty>() {
           @Override
           public void write(JsonWriter out, ProductVariationProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductVariationProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductVariationProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductVariationProperty
  * @throws IOException if the JSON string is invalid with respect to ProductVariationProperty
  */
  public static ProductVariationProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductVariationProperty.class);
  }

 /**
  * Convert an instance of ProductVariationProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

