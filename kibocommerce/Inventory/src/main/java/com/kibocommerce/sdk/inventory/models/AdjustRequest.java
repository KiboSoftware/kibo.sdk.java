/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.models.AdjustItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Request needed for adjusting inventory
 */
@ApiModel(description = "Request needed for adjusting inventory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdjustRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AdjustItem> items = null;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_NUM = "pageNum";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public AdjustRequest() {
  }

  public AdjustRequest items(List<AdjustItem> items) {
    
    this.items = items;
    return this;
  }

  public AdjustRequest addItemsItem(AdjustItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items to adjust
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of items to adjust")

  public List<AdjustItem> getItems() {
    return items;
  }


  public void setItems(List<AdjustItem> items) {
    this.items = items;
  }


  public AdjustRequest locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location Code")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public AdjustRequest userID(Integer userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * user id
   * @return userID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "user id")

  public Integer getUserID() {
    return userID;
  }


  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public AdjustRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * how many results to show per page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "how many results to show per page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AdjustRequest pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * which page to show
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "which page to show")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AdjustRequest sortBy(String sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * index to sort results by
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "index to sort results by")

  public String getSortBy() {
    return sortBy;
  }


  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustRequest adjustRequest = (AdjustRequest) o;
    return Objects.equals(this.items, adjustRequest.items) &&
        Objects.equals(this.locationCode, adjustRequest.locationCode) &&
        Objects.equals(this.userID, adjustRequest.userID) &&
        Objects.equals(this.pageSize, adjustRequest.pageSize) &&
        Objects.equals(this.pageNum, adjustRequest.pageNum) &&
        Objects.equals(this.sortBy, adjustRequest.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, locationCode, userID, pageSize, pageNum, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("locationCode");
    openapiFields.add("userID");
    openapiFields.add("pageSize");
    openapiFields.add("pageNum");
    openapiFields.add("sortBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdjustRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdjustRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdjustRequest is not found in the empty JSON string", AdjustRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AdjustRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdjustRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
            AdjustItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("sortBy") != null && !jsonObj.get("sortBy").isJsonNull()) && !jsonObj.get("sortBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustRequest>() {
           @Override
           public void write(JsonWriter out, AdjustRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdjustRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdjustRequest
  * @throws IOException if the JSON string is invalid with respect to AdjustRequest
  */
  public static AdjustRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustRequest.class);
  }

 /**
  * Convert an instance of AdjustRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

