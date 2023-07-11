/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.customer.models.CustomerPurchaseOrderAccount;
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
 * CustomerPurchaseOrderAccountCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerPurchaseOrderAccountCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "pageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CustomerPurchaseOrderAccount> items = null;

  public CustomerPurchaseOrderAccountCollection() {
  }

  public CustomerPurchaseOrderAccountCollection startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public CustomerPurchaseOrderAccountCollection pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public CustomerPurchaseOrderAccountCollection pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public CustomerPurchaseOrderAccountCollection totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public CustomerPurchaseOrderAccountCollection items(List<CustomerPurchaseOrderAccount> items) {
    
    this.items = items;
    return this;
  }

  public CustomerPurchaseOrderAccountCollection addItemsItem(CustomerPurchaseOrderAccount itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomerPurchaseOrderAccount> getItems() {
    return items;
  }


  public void setItems(List<CustomerPurchaseOrderAccount> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPurchaseOrderAccountCollection customerPurchaseOrderAccountCollection = (CustomerPurchaseOrderAccountCollection) o;
    return Objects.equals(this.startIndex, customerPurchaseOrderAccountCollection.startIndex) &&
        Objects.equals(this.pageSize, customerPurchaseOrderAccountCollection.pageSize) &&
        Objects.equals(this.pageCount, customerPurchaseOrderAccountCollection.pageCount) &&
        Objects.equals(this.totalCount, customerPurchaseOrderAccountCollection.totalCount) &&
        Objects.equals(this.items, customerPurchaseOrderAccountCollection.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, pageSize, pageCount, totalCount, items);
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
    sb.append("class CustomerPurchaseOrderAccountCollection {\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("startIndex");
    openapiFields.add("pageSize");
    openapiFields.add("pageCount");
    openapiFields.add("totalCount");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerPurchaseOrderAccountCollection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerPurchaseOrderAccountCollection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerPurchaseOrderAccountCollection is not found in the empty JSON string", CustomerPurchaseOrderAccountCollection.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CustomerPurchaseOrderAccountCollection.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerPurchaseOrderAccountCollection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            CustomerPurchaseOrderAccount.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerPurchaseOrderAccountCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerPurchaseOrderAccountCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerPurchaseOrderAccountCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerPurchaseOrderAccountCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerPurchaseOrderAccountCollection>() {
           @Override
           public void write(JsonWriter out, CustomerPurchaseOrderAccountCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerPurchaseOrderAccountCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerPurchaseOrderAccountCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerPurchaseOrderAccountCollection
  * @throws IOException if the JSON string is invalid with respect to CustomerPurchaseOrderAccountCollection
  */
  public static CustomerPurchaseOrderAccountCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerPurchaseOrderAccountCollection.class);
  }

 /**
  * Convert an instance of CustomerPurchaseOrderAccountCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

