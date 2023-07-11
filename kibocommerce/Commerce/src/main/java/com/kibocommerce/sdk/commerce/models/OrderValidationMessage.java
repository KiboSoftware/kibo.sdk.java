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
 * Validation message returned by an order validator.
 */
@ApiModel(description = "Validation message returned by an order validator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderValidationMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_ITEM_ID = "orderItemId";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_ID)
  private String orderItemId;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public OrderValidationMessage() {
  }

  public OrderValidationMessage orderItemId(String orderItemId) {
    
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Order item id that this message applies to.  Can be empty.
   * @return orderItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order item id that this message applies to.  Can be empty.")

  public String getOrderItemId() {
    return orderItemId;
  }


  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public OrderValidationMessage messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Identifier to indicate the type of the message, See OrderValidatorMessageTypeConst for options.
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier to indicate the type of the message, See OrderValidatorMessageTypeConst for options.")

  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public OrderValidationMessage message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Actual message returned by the validator.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actual message returned by the validator.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderValidationMessage orderValidationMessage = (OrderValidationMessage) o;
    return Objects.equals(this.orderItemId, orderValidationMessage.orderItemId) &&
        Objects.equals(this.messageType, orderValidationMessage.messageType) &&
        Objects.equals(this.message, orderValidationMessage.message);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, messageType, message);
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
    sb.append("class OrderValidationMessage {\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("orderItemId");
    openapiFields.add("messageType");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderValidationMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderValidationMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderValidationMessage is not found in the empty JSON string", OrderValidationMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!OrderValidationMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderValidationMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("orderItemId") != null && !jsonObj.get("orderItemId").isJsonNull()) && !jsonObj.get("orderItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderItemId").toString()));
      }
      if ((jsonObj.get("messageType") != null && !jsonObj.get("messageType").isJsonNull()) && !jsonObj.get("messageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageType").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderValidationMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderValidationMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderValidationMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderValidationMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderValidationMessage>() {
           @Override
           public void write(JsonWriter out, OrderValidationMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderValidationMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderValidationMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderValidationMessage
  * @throws IOException if the JSON string is invalid with respect to OrderValidationMessage
  */
  public static OrderValidationMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderValidationMessage.class);
  }

 /**
  * Convert an instance of OrderValidationMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

