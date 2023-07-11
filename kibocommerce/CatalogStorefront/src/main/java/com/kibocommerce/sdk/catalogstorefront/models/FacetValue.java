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
public class FacetValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_IS_APPLIED = "isApplied";
  @SerializedName(SERIALIZED_NAME_IS_APPLIED)
  private Boolean isApplied;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_FILTER_VALUE = "filterValue";
  @SerializedName(SERIALIZED_NAME_FILTER_VALUE)
  private String filterValue;

  public static final String SERIALIZED_NAME_RANGE_QUERY_VALUE_START = "rangeQueryValueStart";
  @SerializedName(SERIALIZED_NAME_RANGE_QUERY_VALUE_START)
  private String rangeQueryValueStart;

  public static final String SERIALIZED_NAME_RANGE_QUERY_VALUE_END = "rangeQueryValueEnd";
  @SerializedName(SERIALIZED_NAME_RANGE_QUERY_VALUE_END)
  private String rangeQueryValueEnd;

  public static final String SERIALIZED_NAME_PARENT_FACET_VALUE = "parentFacetValue";
  @SerializedName(SERIALIZED_NAME_PARENT_FACET_VALUE)
  private String parentFacetValue;

  public static final String SERIALIZED_NAME_IS_DISPLAYED = "isDisplayed";
  @SerializedName(SERIALIZED_NAME_IS_DISPLAYED)
  private Boolean isDisplayed;

  public static final String SERIALIZED_NAME_CHILDREN_FACET_VALUES = "childrenFacetValues";
  @SerializedName(SERIALIZED_NAME_CHILDREN_FACET_VALUES)
  private List<FacetValue> childrenFacetValues = null;

  public FacetValue() {
  }

  public FacetValue label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public FacetValue isApplied(Boolean isApplied) {
    
    this.isApplied = isApplied;
    return this;
  }

   /**
   * True if this FacetValue was supplied as a facet value filter in the current search
   * @return isApplied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this FacetValue was supplied as a facet value filter in the current search")

  public Boolean getIsApplied() {
    return isApplied;
  }


  public void setIsApplied(Boolean isApplied) {
    this.isApplied = isApplied;
  }


  public FacetValue count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of occurrences of FacetValue in result set.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of occurrences of FacetValue in result set.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public FacetValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * String representation of Facet Value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String representation of Facet Value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public FacetValue filterValue(String filterValue) {
    
    this.filterValue = filterValue;
    return this;
  }

   /**
   * Submit this as a facet value filter
   * @return filterValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Submit this as a facet value filter")

  public String getFilterValue() {
    return filterValue;
  }


  public void setFilterValue(String filterValue) {
    this.filterValue = filterValue;
  }


  public FacetValue rangeQueryValueStart(String rangeQueryValueStart) {
    
    this.rangeQueryValueStart = rangeQueryValueStart;
    return this;
  }

   /**
   * When range query Facet
   * @return rangeQueryValueStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When range query Facet")

  public String getRangeQueryValueStart() {
    return rangeQueryValueStart;
  }


  public void setRangeQueryValueStart(String rangeQueryValueStart) {
    this.rangeQueryValueStart = rangeQueryValueStart;
  }


  public FacetValue rangeQueryValueEnd(String rangeQueryValueEnd) {
    
    this.rangeQueryValueEnd = rangeQueryValueEnd;
    return this;
  }

   /**
   * When range query Facet
   * @return rangeQueryValueEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When range query Facet")

  public String getRangeQueryValueEnd() {
    return rangeQueryValueEnd;
  }


  public void setRangeQueryValueEnd(String rangeQueryValueEnd) {
    this.rangeQueryValueEnd = rangeQueryValueEnd;
  }


  public FacetValue parentFacetValue(String parentFacetValue) {
    
    this.parentFacetValue = parentFacetValue;
    return this;
  }

   /**
   * When hierarchical Facet
   * @return parentFacetValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When hierarchical Facet")

  public String getParentFacetValue() {
    return parentFacetValue;
  }


  public void setParentFacetValue(String parentFacetValue) {
    this.parentFacetValue = parentFacetValue;
  }


  public FacetValue isDisplayed(Boolean isDisplayed) {
    
    this.isDisplayed = isDisplayed;
    return this;
  }

   /**
   * Indicates whether the FacetValue should be displayed
   * @return isDisplayed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the FacetValue should be displayed")

  public Boolean getIsDisplayed() {
    return isDisplayed;
  }


  public void setIsDisplayed(Boolean isDisplayed) {
    this.isDisplayed = isDisplayed;
  }


  public FacetValue childrenFacetValues(List<FacetValue> childrenFacetValues) {
    
    this.childrenFacetValues = childrenFacetValues;
    return this;
  }

  public FacetValue addChildrenFacetValuesItem(FacetValue childrenFacetValuesItem) {
    if (this.childrenFacetValues == null) {
      this.childrenFacetValues = new ArrayList<>();
    }
    this.childrenFacetValues.add(childrenFacetValuesItem);
    return this;
  }

   /**
   * When hierarchical Facet
   * @return childrenFacetValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When hierarchical Facet")

  public List<FacetValue> getChildrenFacetValues() {
    return childrenFacetValues;
  }


  public void setChildrenFacetValues(List<FacetValue> childrenFacetValues) {
    this.childrenFacetValues = childrenFacetValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetValue facetValue = (FacetValue) o;
    return Objects.equals(this.label, facetValue.label) &&
        Objects.equals(this.isApplied, facetValue.isApplied) &&
        Objects.equals(this.count, facetValue.count) &&
        Objects.equals(this.value, facetValue.value) &&
        Objects.equals(this.filterValue, facetValue.filterValue) &&
        Objects.equals(this.rangeQueryValueStart, facetValue.rangeQueryValueStart) &&
        Objects.equals(this.rangeQueryValueEnd, facetValue.rangeQueryValueEnd) &&
        Objects.equals(this.parentFacetValue, facetValue.parentFacetValue) &&
        Objects.equals(this.isDisplayed, facetValue.isDisplayed) &&
        Objects.equals(this.childrenFacetValues, facetValue.childrenFacetValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, isApplied, count, value, filterValue, rangeQueryValueStart, rangeQueryValueEnd, parentFacetValue, isDisplayed, childrenFacetValues);
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
    sb.append("class FacetValue {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
    sb.append("    rangeQueryValueStart: ").append(toIndentedString(rangeQueryValueStart)).append("\n");
    sb.append("    rangeQueryValueEnd: ").append(toIndentedString(rangeQueryValueEnd)).append("\n");
    sb.append("    parentFacetValue: ").append(toIndentedString(parentFacetValue)).append("\n");
    sb.append("    isDisplayed: ").append(toIndentedString(isDisplayed)).append("\n");
    sb.append("    childrenFacetValues: ").append(toIndentedString(childrenFacetValues)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("isApplied");
    openapiFields.add("count");
    openapiFields.add("value");
    openapiFields.add("filterValue");
    openapiFields.add("rangeQueryValueStart");
    openapiFields.add("rangeQueryValueEnd");
    openapiFields.add("parentFacetValue");
    openapiFields.add("isDisplayed");
    openapiFields.add("childrenFacetValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacetValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacetValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacetValue is not found in the empty JSON string", FacetValue.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FacetValue.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FacetValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("filterValue") != null && !jsonObj.get("filterValue").isJsonNull()) && !jsonObj.get("filterValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterValue").toString()));
      }
      if ((jsonObj.get("rangeQueryValueStart") != null && !jsonObj.get("rangeQueryValueStart").isJsonNull()) && !jsonObj.get("rangeQueryValueStart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangeQueryValueStart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rangeQueryValueStart").toString()));
      }
      if ((jsonObj.get("rangeQueryValueEnd") != null && !jsonObj.get("rangeQueryValueEnd").isJsonNull()) && !jsonObj.get("rangeQueryValueEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangeQueryValueEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rangeQueryValueEnd").toString()));
      }
      if ((jsonObj.get("parentFacetValue") != null && !jsonObj.get("parentFacetValue").isJsonNull()) && !jsonObj.get("parentFacetValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentFacetValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentFacetValue").toString()));
      }
      if (jsonObj.get("childrenFacetValues") != null && !jsonObj.get("childrenFacetValues").isJsonNull()) {
        JsonArray jsonArraychildrenFacetValues = jsonObj.getAsJsonArray("childrenFacetValues");
        if (jsonArraychildrenFacetValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("childrenFacetValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `childrenFacetValues` to be an array in the JSON string but got `%s`", jsonObj.get("childrenFacetValues").toString()));
          }

          // validate the optional field `childrenFacetValues` (array)
          for (int i = 0; i < jsonArraychildrenFacetValues.size(); i++) {
            FacetValue.validateJsonObject(jsonArraychildrenFacetValues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacetValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacetValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacetValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacetValue.class));

       return (TypeAdapter<T>) new TypeAdapter<FacetValue>() {
           @Override
           public void write(JsonWriter out, FacetValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FacetValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FacetValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacetValue
  * @throws IOException if the JSON string is invalid with respect to FacetValue
  */
  public static FacetValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacetValue.class);
  }

 /**
  * Convert an instance of FacetValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

