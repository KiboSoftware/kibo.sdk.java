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
public class ReturnAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_RETURN_IDS = "returnIds";
  @SerializedName(SERIALIZED_NAME_RETURN_IDS)
  private List<String> returnIds = null;

  public ReturnAction() {
  }

  public ReturnAction actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * The name of the action to perform, query the Return for Available actions to get valid values. This is required.
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the action to perform, query the Return for Available actions to get valid values. This is required.")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public ReturnAction returnIds(List<String> returnIds) {
    
    this.returnIds = returnIds;
    return this;
  }

  public ReturnAction addReturnIdsItem(String returnIdsItem) {
    if (this.returnIds == null) {
      this.returnIds = new ArrayList<>();
    }
    this.returnIds.add(returnIdsItem);
    return this;
  }

   /**
   * The list of Returns upon which to perform the action. This is required.
   * @return returnIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Returns upon which to perform the action. This is required.")

  public List<String> getReturnIds() {
    return returnIds;
  }


  public void setReturnIds(List<String> returnIds) {
    this.returnIds = returnIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnAction returnAction = (ReturnAction) o;
    return Objects.equals(this.actionName, returnAction.actionName) &&
        Objects.equals(this.returnIds, returnAction.returnIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, returnIds);
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
    sb.append("class ReturnAction {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    returnIds: ").append(toIndentedString(returnIds)).append("\n");
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
    openapiFields.add("actionName");
    openapiFields.add("returnIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReturnAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReturnAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnAction is not found in the empty JSON string", ReturnAction.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ReturnAction.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("actionName") != null && !jsonObj.get("actionName").isJsonNull()) && !jsonObj.get("actionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("returnIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnIds` to be an array in the JSON string but got `%s`", jsonObj.get("returnIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnAction.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnAction>() {
           @Override
           public void write(JsonWriter out, ReturnAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReturnAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnAction
  * @throws IOException if the JSON string is invalid with respect to ReturnAction
  */
  public static ReturnAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnAction.class);
  }

 /**
  * Convert an instance of ReturnAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

