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
import com.kibocommerce.sdk.commerce.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeChangeMessage;
import com.kibocommerce.sdk.commerce.models.CommerceRuntimePickupItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CollectionOfPickupItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionOfPickupItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CommerceRuntimePickupItem> items = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_DATE = "fulfillmentDate";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_DATE)
  private OffsetDateTime fulfillmentDate;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_AVAILABLE_ACTIONS = "availableActions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ACTIONS)
  private List<String> availableActions = null;

  public static final String SERIALIZED_NAME_CHANGE_MESSAGES = "changeMessages";
  @SerializedName(SERIALIZED_NAME_CHANGE_MESSAGES)
  private List<CommerceRuntimeChangeMessage> changeMessages = null;

  public CollectionOfPickupItem() {
  }

  public CollectionOfPickupItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the fulfillment unit.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the fulfillment unit.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CollectionOfPickupItem code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A human-readable identifier for this fulfillment unit.  If not set on create, will be autogenerated as a string of the form      {fulfillmentUnitType} #{next available int}
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable identifier for this fulfillment unit.  If not set on create, will be autogenerated as a string of the form      {fulfillmentUnitType} #{next available int}")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CollectionOfPickupItem status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the fulfillment unit  See FulfillmentStatusConst
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the fulfillment unit  See FulfillmentStatusConst")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CollectionOfPickupItem items(List<CommerceRuntimePickupItem> items) {
    
    this.items = items;
    return this;
  }

  public CollectionOfPickupItem addItemsItem(CommerceRuntimePickupItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items in the fulfillment unit
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of items in the fulfillment unit")

  public List<CommerceRuntimePickupItem> getItems() {
    return items;
  }


  public void setItems(List<CommerceRuntimePickupItem> items) {
    this.items = items;
  }


  public CollectionOfPickupItem fulfillmentDate(OffsetDateTime fulfillmentDate) {
    
    this.fulfillmentDate = fulfillmentDate;
    return this;
  }

   /**
   * Date of the pickup
   * @return fulfillmentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the pickup")

  public OffsetDateTime getFulfillmentDate() {
    return fulfillmentDate;
  }


  public void setFulfillmentDate(OffsetDateTime fulfillmentDate) {
    this.fulfillmentDate = fulfillmentDate;
  }


  public CollectionOfPickupItem fulfillmentLocationCode(String fulfillmentLocationCode) {
    
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Location code from which to obtain this item
   * @return fulfillmentLocationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location code from which to obtain this item")

  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }


  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }


  public CollectionOfPickupItem auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public CollectionOfPickupItem availableActions(List<String> availableActions) {
    
    this.availableActions = availableActions;
    return this;
  }

  public CollectionOfPickupItem addAvailableActionsItem(String availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new ArrayList<>();
    }
    this.availableActions.add(availableActionsItem);
    return this;
  }

   /**
   * Actions that can be taken on this fulfillment unit
   * @return availableActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actions that can be taken on this fulfillment unit")

  public List<String> getAvailableActions() {
    return availableActions;
  }


  public void setAvailableActions(List<String> availableActions) {
    this.availableActions = availableActions;
  }


  public CollectionOfPickupItem changeMessages(List<CommerceRuntimeChangeMessage> changeMessages) {
    
    this.changeMessages = changeMessages;
    return this;
  }

  public CollectionOfPickupItem addChangeMessagesItem(CommerceRuntimeChangeMessage changeMessagesItem) {
    if (this.changeMessages == null) {
      this.changeMessages = new ArrayList<>();
    }
    this.changeMessages.add(changeMessagesItem);
    return this;
  }

   /**
   * Change messages related to the fulfillment unit.
   * @return changeMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Change messages related to the fulfillment unit.")

  public List<CommerceRuntimeChangeMessage> getChangeMessages() {
    return changeMessages;
  }


  public void setChangeMessages(List<CommerceRuntimeChangeMessage> changeMessages) {
    this.changeMessages = changeMessages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfPickupItem collectionOfPickupItem = (CollectionOfPickupItem) o;
    return Objects.equals(this.id, collectionOfPickupItem.id) &&
        Objects.equals(this.code, collectionOfPickupItem.code) &&
        Objects.equals(this.status, collectionOfPickupItem.status) &&
        Objects.equals(this.items, collectionOfPickupItem.items) &&
        Objects.equals(this.fulfillmentDate, collectionOfPickupItem.fulfillmentDate) &&
        Objects.equals(this.fulfillmentLocationCode, collectionOfPickupItem.fulfillmentLocationCode) &&
        Objects.equals(this.auditInfo, collectionOfPickupItem.auditInfo) &&
        Objects.equals(this.availableActions, collectionOfPickupItem.availableActions) &&
        Objects.equals(this.changeMessages, collectionOfPickupItem.changeMessages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, status, items, fulfillmentDate, fulfillmentLocationCode, auditInfo, availableActions, changeMessages);
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
    sb.append("class CollectionOfPickupItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    fulfillmentDate: ").append(toIndentedString(fulfillmentDate)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    changeMessages: ").append(toIndentedString(changeMessages)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("code");
    openapiFields.add("status");
    openapiFields.add("items");
    openapiFields.add("fulfillmentDate");
    openapiFields.add("fulfillmentLocationCode");
    openapiFields.add("auditInfo");
    openapiFields.add("availableActions");
    openapiFields.add("changeMessages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollectionOfPickupItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollectionOfPickupItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionOfPickupItem is not found in the empty JSON string", CollectionOfPickupItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CollectionOfPickupItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionOfPickupItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            CommerceRuntimePickupItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("fulfillmentLocationCode") != null && !jsonObj.get("fulfillmentLocationCode").isJsonNull()) && !jsonObj.get("fulfillmentLocationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentLocationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentLocationCode").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("availableActions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableActions` to be an array in the JSON string but got `%s`", jsonObj.get("availableActions").toString()));
      }
      if (jsonObj.get("changeMessages") != null && !jsonObj.get("changeMessages").isJsonNull()) {
        JsonArray jsonArraychangeMessages = jsonObj.getAsJsonArray("changeMessages");
        if (jsonArraychangeMessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changeMessages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changeMessages` to be an array in the JSON string but got `%s`", jsonObj.get("changeMessages").toString()));
          }

          // validate the optional field `changeMessages` (array)
          for (int i = 0; i < jsonArraychangeMessages.size(); i++) {
            CommerceRuntimeChangeMessage.validateJsonObject(jsonArraychangeMessages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionOfPickupItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionOfPickupItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionOfPickupItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionOfPickupItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionOfPickupItem>() {
           @Override
           public void write(JsonWriter out, CollectionOfPickupItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionOfPickupItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionOfPickupItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionOfPickupItem
  * @throws IOException if the JSON string is invalid with respect to CollectionOfPickupItem
  */
  public static CollectionOfPickupItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionOfPickupItem.class);
  }

 /**
  * Convert an instance of CollectionOfPickupItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

