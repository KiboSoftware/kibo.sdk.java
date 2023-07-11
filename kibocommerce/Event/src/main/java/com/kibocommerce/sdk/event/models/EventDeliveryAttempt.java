/*
 * Kibo Event Service
 * OpenAPI Spec for Kibo Event Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.event.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.event.models.HttpStatus;
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
 * The external/public Event entity used specifically in PULL/POLL event scenarios
 */
@ApiModel(description = "The external/public Event entity used specifically in PULL/POLL event scenarios")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventDeliveryAttempt implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private String deliveryStatus;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private HttpStatus httpStatus;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "executionDate";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private OffsetDateTime executionDate;

  public EventDeliveryAttempt() {
  }

  public EventDeliveryAttempt deliveryStatus(String deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Status of the delivery process (EventDeliveryStatusType). System-supplied and read-only.
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the delivery process (EventDeliveryStatusType). System-supplied and read-only.")

  public String getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public EventDeliveryAttempt errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * Type of error that occurred, if the delivery was unsuccessful
   * @return errorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of error that occurred, if the delivery was unsuccessful")

  public String getErrorType() {
    return errorType;
  }


  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public EventDeliveryAttempt httpStatus(HttpStatus httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(HttpStatus httpStatus) {
    this.httpStatus = httpStatus;
  }


  public EventDeliveryAttempt message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * HTTP message returned by the remote endpoint
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP message returned by the remote endpoint")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public EventDeliveryAttempt executionDate(OffsetDateTime executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * The date that the delivery was attempted
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the delivery was attempted")

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDeliveryAttempt eventDeliveryAttempt = (EventDeliveryAttempt) o;
    return Objects.equals(this.deliveryStatus, eventDeliveryAttempt.deliveryStatus) &&
        Objects.equals(this.errorType, eventDeliveryAttempt.errorType) &&
        Objects.equals(this.httpStatus, eventDeliveryAttempt.httpStatus) &&
        Objects.equals(this.message, eventDeliveryAttempt.message) &&
        Objects.equals(this.executionDate, eventDeliveryAttempt.executionDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryStatus, errorType, httpStatus, message, executionDate);
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
    sb.append("class EventDeliveryAttempt {\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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
    openapiFields.add("deliveryStatus");
    openapiFields.add("errorType");
    openapiFields.add("httpStatus");
    openapiFields.add("message");
    openapiFields.add("executionDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventDeliveryAttempt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventDeliveryAttempt.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventDeliveryAttempt is not found in the empty JSON string", EventDeliveryAttempt.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!EventDeliveryAttempt.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventDeliveryAttempt` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("deliveryStatus") != null && !jsonObj.get("deliveryStatus").isJsonNull()) && !jsonObj.get("deliveryStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryStatus").toString()));
      }
      if ((jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) && !jsonObj.get("errorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorType").toString()));
      }
      // validate the optional field `httpStatus`
      if (jsonObj.get("httpStatus") != null && !jsonObj.get("httpStatus").isJsonNull()) {
        HttpStatus.validateJsonObject(jsonObj.getAsJsonObject("httpStatus"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventDeliveryAttempt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventDeliveryAttempt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventDeliveryAttempt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventDeliveryAttempt.class));

       return (TypeAdapter<T>) new TypeAdapter<EventDeliveryAttempt>() {
           @Override
           public void write(JsonWriter out, EventDeliveryAttempt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventDeliveryAttempt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventDeliveryAttempt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventDeliveryAttempt
  * @throws IOException if the JSON string is invalid with respect to EventDeliveryAttempt
  */
  public static EventDeliveryAttempt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventDeliveryAttempt.class);
  }

 /**
  * Convert an instance of EventDeliveryAttempt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

