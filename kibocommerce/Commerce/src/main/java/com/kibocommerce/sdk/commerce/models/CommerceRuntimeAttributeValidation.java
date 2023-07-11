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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CommerceRuntimeAttributeValidation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceRuntimeAttributeValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REGULAR_EXPRESSION = "regularExpression";
  @SerializedName(SERIALIZED_NAME_REGULAR_EXPRESSION)
  private String regularExpression;

  public static final String SERIALIZED_NAME_MIN_STRING_LENGTH = "minStringLength";
  @SerializedName(SERIALIZED_NAME_MIN_STRING_LENGTH)
  private Integer minStringLength;

  public static final String SERIALIZED_NAME_MAX_STRING_LENGTH = "maxStringLength";
  @SerializedName(SERIALIZED_NAME_MAX_STRING_LENGTH)
  private Integer maxStringLength;

  public static final String SERIALIZED_NAME_MIN_NUMERIC_VALUE = "minNumericValue";
  @SerializedName(SERIALIZED_NAME_MIN_NUMERIC_VALUE)
  private Double minNumericValue;

  public static final String SERIALIZED_NAME_MAX_NUMERIC_VALUE = "maxNumericValue";
  @SerializedName(SERIALIZED_NAME_MAX_NUMERIC_VALUE)
  private Double maxNumericValue;

  public static final String SERIALIZED_NAME_MIN_DATE_TIME = "minDateTime";
  @SerializedName(SERIALIZED_NAME_MIN_DATE_TIME)
  private OffsetDateTime minDateTime;

  public static final String SERIALIZED_NAME_MAX_DATE_TIME = "maxDateTime";
  @SerializedName(SERIALIZED_NAME_MAX_DATE_TIME)
  private OffsetDateTime maxDateTime;

  public CommerceRuntimeAttributeValidation() {
  }

  public CommerceRuntimeAttributeValidation regularExpression(String regularExpression) {
    
    this.regularExpression = regularExpression;
    return this;
  }

   /**
   * Get regularExpression
   * @return regularExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegularExpression() {
    return regularExpression;
  }


  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }


  public CommerceRuntimeAttributeValidation minStringLength(Integer minStringLength) {
    
    this.minStringLength = minStringLength;
    return this;
  }

   /**
   * Get minStringLength
   * @return minStringLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinStringLength() {
    return minStringLength;
  }


  public void setMinStringLength(Integer minStringLength) {
    this.minStringLength = minStringLength;
  }


  public CommerceRuntimeAttributeValidation maxStringLength(Integer maxStringLength) {
    
    this.maxStringLength = maxStringLength;
    return this;
  }

   /**
   * Get maxStringLength
   * @return maxStringLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxStringLength() {
    return maxStringLength;
  }


  public void setMaxStringLength(Integer maxStringLength) {
    this.maxStringLength = maxStringLength;
  }


  public CommerceRuntimeAttributeValidation minNumericValue(Double minNumericValue) {
    
    this.minNumericValue = minNumericValue;
    return this;
  }

   /**
   * Get minNumericValue
   * @return minNumericValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinNumericValue() {
    return minNumericValue;
  }


  public void setMinNumericValue(Double minNumericValue) {
    this.minNumericValue = minNumericValue;
  }


  public CommerceRuntimeAttributeValidation maxNumericValue(Double maxNumericValue) {
    
    this.maxNumericValue = maxNumericValue;
    return this;
  }

   /**
   * Get maxNumericValue
   * @return maxNumericValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxNumericValue() {
    return maxNumericValue;
  }


  public void setMaxNumericValue(Double maxNumericValue) {
    this.maxNumericValue = maxNumericValue;
  }


  public CommerceRuntimeAttributeValidation minDateTime(OffsetDateTime minDateTime) {
    
    this.minDateTime = minDateTime;
    return this;
  }

   /**
   * Get minDateTime
   * @return minDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMinDateTime() {
    return minDateTime;
  }


  public void setMinDateTime(OffsetDateTime minDateTime) {
    this.minDateTime = minDateTime;
  }


  public CommerceRuntimeAttributeValidation maxDateTime(OffsetDateTime maxDateTime) {
    
    this.maxDateTime = maxDateTime;
    return this;
  }

   /**
   * Get maxDateTime
   * @return maxDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMaxDateTime() {
    return maxDateTime;
  }


  public void setMaxDateTime(OffsetDateTime maxDateTime) {
    this.maxDateTime = maxDateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceRuntimeAttributeValidation commerceRuntimeAttributeValidation = (CommerceRuntimeAttributeValidation) o;
    return Objects.equals(this.regularExpression, commerceRuntimeAttributeValidation.regularExpression) &&
        Objects.equals(this.minStringLength, commerceRuntimeAttributeValidation.minStringLength) &&
        Objects.equals(this.maxStringLength, commerceRuntimeAttributeValidation.maxStringLength) &&
        Objects.equals(this.minNumericValue, commerceRuntimeAttributeValidation.minNumericValue) &&
        Objects.equals(this.maxNumericValue, commerceRuntimeAttributeValidation.maxNumericValue) &&
        Objects.equals(this.minDateTime, commerceRuntimeAttributeValidation.minDateTime) &&
        Objects.equals(this.maxDateTime, commerceRuntimeAttributeValidation.maxDateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(regularExpression, minStringLength, maxStringLength, minNumericValue, maxNumericValue, minDateTime, maxDateTime);
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
    sb.append("class CommerceRuntimeAttributeValidation {\n");
    sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
    sb.append("    minStringLength: ").append(toIndentedString(minStringLength)).append("\n");
    sb.append("    maxStringLength: ").append(toIndentedString(maxStringLength)).append("\n");
    sb.append("    minNumericValue: ").append(toIndentedString(minNumericValue)).append("\n");
    sb.append("    maxNumericValue: ").append(toIndentedString(maxNumericValue)).append("\n");
    sb.append("    minDateTime: ").append(toIndentedString(minDateTime)).append("\n");
    sb.append("    maxDateTime: ").append(toIndentedString(maxDateTime)).append("\n");
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
    openapiFields.add("regularExpression");
    openapiFields.add("minStringLength");
    openapiFields.add("maxStringLength");
    openapiFields.add("minNumericValue");
    openapiFields.add("maxNumericValue");
    openapiFields.add("minDateTime");
    openapiFields.add("maxDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommerceRuntimeAttributeValidation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CommerceRuntimeAttributeValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommerceRuntimeAttributeValidation is not found in the empty JSON string", CommerceRuntimeAttributeValidation.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CommerceRuntimeAttributeValidation.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommerceRuntimeAttributeValidation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("regularExpression") != null && !jsonObj.get("regularExpression").isJsonNull()) && !jsonObj.get("regularExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regularExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regularExpression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommerceRuntimeAttributeValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommerceRuntimeAttributeValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommerceRuntimeAttributeValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommerceRuntimeAttributeValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<CommerceRuntimeAttributeValidation>() {
           @Override
           public void write(JsonWriter out, CommerceRuntimeAttributeValidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommerceRuntimeAttributeValidation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommerceRuntimeAttributeValidation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommerceRuntimeAttributeValidation
  * @throws IOException if the JSON string is invalid with respect to CommerceRuntimeAttributeValidation
  */
  public static CommerceRuntimeAttributeValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommerceRuntimeAttributeValidation.class);
  }

 /**
  * Convert an instance of CommerceRuntimeAttributeValidation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

