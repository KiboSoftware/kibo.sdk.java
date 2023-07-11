/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeAppliedDiscount;
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
 * CommerceRuntimeAppliedLineItemShippingDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeAppliedLineItemShippingDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_METHOD_CODE = "methodCode";
  @SerializedName(SERIALIZED_NAME_METHOD_CODE)
  private String methodCode;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private CommerceRuntimeAppliedDiscount discount;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discountQuantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_IMPACT_PER_UNIT = "impactPerUnit";
  @SerializedName(SERIALIZED_NAME_IMPACT_PER_UNIT)
  private Double impactPerUnit;

  public CommerceRuntimeAppliedLineItemShippingDiscount() {
  }

  public CommerceRuntimeAppliedLineItemShippingDiscount methodCode(String methodCode) {
    
    this.methodCode = methodCode;
    return this;
  }

   /**
   * Unique identifier of the shipping method discount.
   * @return methodCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the shipping method discount.")

  public String getMethodCode() {
    return methodCode;
  }


  public void setMethodCode(String methodCode) {
    this.methodCode = methodCode;
  }


  public CommerceRuntimeAppliedLineItemShippingDiscount discount(CommerceRuntimeAppliedDiscount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeAppliedDiscount getDiscount() {
    return discount;
  }


  public void setDiscount(CommerceRuntimeAppliedDiscount discount) {
    this.discount = discount;
  }


  public CommerceRuntimeAppliedLineItemShippingDiscount discountQuantity(Integer discountQuantity) {
    
    this.discountQuantity = discountQuantity;
    return this;
  }

   /**
   * The number of the line item that can be used for this particular discount.
   * @return discountQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the line item that can be used for this particular discount.")

  public Integer getDiscountQuantity() {
    return discountQuantity;
  }


  public void setDiscountQuantity(Integer discountQuantity) {
    this.discountQuantity = discountQuantity;
  }


  public CommerceRuntimeAppliedLineItemShippingDiscount impactPerUnit(Double impactPerUnit) {
    
    this.impactPerUnit = impactPerUnit;
    return this;
  }

   /**
   * The impact of this discount pur discount quantity.
   * @return impactPerUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The impact of this discount pur discount quantity.")

  public Double getImpactPerUnit() {
    return impactPerUnit;
  }


  public void setImpactPerUnit(Double impactPerUnit) {
    this.impactPerUnit = impactPerUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceRuntimeAppliedLineItemShippingDiscount commerceRuntimeAppliedLineItemShippingDiscount = (CommerceRuntimeAppliedLineItemShippingDiscount) o;
    return Objects.equals(this.methodCode, commerceRuntimeAppliedLineItemShippingDiscount.methodCode) &&
        Objects.equals(this.discount, commerceRuntimeAppliedLineItemShippingDiscount.discount) &&
        Objects.equals(this.discountQuantity, commerceRuntimeAppliedLineItemShippingDiscount.discountQuantity) &&
        Objects.equals(this.impactPerUnit, commerceRuntimeAppliedLineItemShippingDiscount.impactPerUnit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodCode, discount, discountQuantity, impactPerUnit);
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
    sb.append("class CommerceRuntimeAppliedLineItemShippingDiscount {\n");
    sb.append("    methodCode: ").append(toIndentedString(methodCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    impactPerUnit: ").append(toIndentedString(impactPerUnit)).append("\n");
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
    openapiFields.add("methodCode");
    openapiFields.add("discount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeAppliedLineItemShippingDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeAppliedLineItemShippingDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeAppliedLineItemShippingDiscount is not found in the empty JSON string", CommerceRuntimeAppliedLineItemShippingDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeAppliedLineItemShippingDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeAppliedLineItemShippingDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("methodCode") != null && !jsonObj.get("methodCode").isJsonNull()) && !jsonObj.get("methodCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `methodCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("methodCode").toString()));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        CommerceRuntimeAppliedDiscount.validateJsonObject(jsonObj.getAsJsonObject("discount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommerceRuntimeAppliedLineItemShippingDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeAppliedLineItemShippingDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeAppliedLineItemShippingDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeAppliedLineItemShippingDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeAppliedLineItemShippingDiscount>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeAppliedLineItemShippingDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeAppliedLineItemShippingDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeAppliedLineItemShippingDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeAppliedLineItemShippingDiscount
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeAppliedLineItemShippingDiscount
  */
  public static CommerceRuntimeAppliedLineItemShippingDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeAppliedLineItemShippingDiscount.class);
  }

 /**
  * Convert an instance of CommerceRuntimeAppliedLineItemShippingDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
