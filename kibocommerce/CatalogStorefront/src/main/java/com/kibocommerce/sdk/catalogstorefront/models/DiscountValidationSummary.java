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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesDiscount;
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
 * Provides a summary (more accurately it is a container) for valid discounts for potentially valid discounts for a product
 */
@ApiModel(description = "Provides a summary (more accurately it is a container) for valid discounts for potentially valid discounts for a product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DiscountValidationSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLICABLE_DISCOUNTS = "applicableDiscounts";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_DISCOUNTS)
  private List<CatalogRuntimesDiscount> applicableDiscounts = null;

  public DiscountValidationSummary() {
  }

  public DiscountValidationSummary applicableDiscounts(List<CatalogRuntimesDiscount> applicableDiscounts) {
    
    this.applicableDiscounts = applicableDiscounts;
    return this;
  }

  public DiscountValidationSummary addApplicableDiscountsItem(CatalogRuntimesDiscount applicableDiscountsItem) {
    if (this.applicableDiscounts == null) {
      this.applicableDiscounts = new ArrayList<>();
    }
    this.applicableDiscounts.add(applicableDiscountsItem);
    return this;
  }

   /**
   * Applicable/Valid Discounts
   * @return applicableDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applicable/Valid Discounts")

  public List<CatalogRuntimesDiscount> getApplicableDiscounts() {
    return applicableDiscounts;
  }


  public void setApplicableDiscounts(List<CatalogRuntimesDiscount> applicableDiscounts) {
    this.applicableDiscounts = applicableDiscounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountValidationSummary discountValidationSummary = (DiscountValidationSummary) o;
    return Objects.equals(this.applicableDiscounts, discountValidationSummary.applicableDiscounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableDiscounts);
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
    sb.append("class DiscountValidationSummary {\n");
    sb.append("    applicableDiscounts: ").append(toIndentedString(applicableDiscounts)).append("\n");
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
    openapiFields.add("applicableDiscounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscountValidationSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DiscountValidationSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountValidationSummary is not found in the empty JSON string", DiscountValidationSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DiscountValidationSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountValidationSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("applicableDiscounts") != null && !jsonObj.get("applicableDiscounts").isJsonNull()) {
        JsonArray jsonArrayapplicableDiscounts = jsonObj.getAsJsonArray("applicableDiscounts");
        if (jsonArrayapplicableDiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("applicableDiscounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `applicableDiscounts` to be an array in the JSON string but got `%s`", jsonObj.get("applicableDiscounts").toString()));
          }

          // validate the optional field `applicableDiscounts` (array)
          for (int i = 0; i < jsonArrayapplicableDiscounts.size(); i++) {
            CatalogRuntimesDiscount.validateJsonObject(jsonArrayapplicableDiscounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountValidationSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountValidationSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountValidationSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountValidationSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountValidationSummary>() {
           @Override
           public void write(JsonWriter out, DiscountValidationSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountValidationSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscountValidationSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountValidationSummary
  * @throws IOException if the JSON string is invalid with respect to DiscountValidationSummary
  */
  public static DiscountValidationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountValidationSummary.class);
  }

 /**
  * Convert an instance of DiscountValidationSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
