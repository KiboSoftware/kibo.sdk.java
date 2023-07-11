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
import com.kibocommerce.sdk.event.models.EventDeliveryAttempt;
import com.kibocommerce.sdk.event.models.EventSummary;
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
 * The external/public Event entity used specifically in PULL/POLL event scenarios
 */
@ApiModel(description = "The external/public Event entity used specifically in PULL/POLL event scenarios")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventDeliverySummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private String deliveryStatus;

  public static final String SERIALIZED_NAME_EVENT_SUMMARY = "eventSummary";
  @SerializedName(SERIALIZED_NAME_EVENT_SUMMARY)
  private EventSummary eventSummary;

  public static final String SERIALIZED_NAME_IS_RUNNING = "isRunning";
  @SerializedName(SERIALIZED_NAME_IS_RUNNING)
  private Boolean isRunning;

  public static final String SERIALIZED_NAME_LAST_EXECUTION_DATE = "lastExecutionDate";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTION_DATE)
  private OffsetDateTime lastExecutionDate;

  public static final String SERIALIZED_NAME_NEXT_EXECUTION_DATE = "nextExecutionDate";
  @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_DATE)
  private OffsetDateTime nextExecutionDate;

  public static final String SERIALIZED_NAME_RETRIES_REMAINING = "retriesRemaining";
  @SerializedName(SERIALIZED_NAME_RETRIES_REMAINING)
  private Integer retriesRemaining;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_DELIVERY_ATTEMPTS = "deliveryAttempts";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ATTEMPTS)
  private List<EventDeliveryAttempt> deliveryAttempts = null;

  public EventDeliverySummary() {
  }

  public EventDeliverySummary id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for an event delivery summary
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for an event delivery summary")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public EventDeliverySummary deliveryStatus(String deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Status of the delivery process (EventDeliveryStatusType)
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the delivery process (EventDeliveryStatusType)")

  public String getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public EventDeliverySummary eventSummary(EventSummary eventSummary) {
    
    this.eventSummary = eventSummary;
    return this;
  }

   /**
   * Get eventSummary
   * @return eventSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSummary getEventSummary() {
    return eventSummary;
  }


  public void setEventSummary(EventSummary eventSummary) {
    this.eventSummary = eventSummary;
  }


  public EventDeliverySummary isRunning(Boolean isRunning) {
    
    this.isRunning = isRunning;
    return this;
  }

   /**
   * Indicates whether delivery of the event is currently being attempted at this moment in time
   * @return isRunning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether delivery of the event is currently being attempted at this moment in time")

  public Boolean getIsRunning() {
    return isRunning;
  }


  public void setIsRunning(Boolean isRunning) {
    this.isRunning = isRunning;
  }


  public EventDeliverySummary lastExecutionDate(OffsetDateTime lastExecutionDate) {
    
    this.lastExecutionDate = lastExecutionDate;
    return this;
  }

   /**
   * The date that the delivery was last attempted (either successfully or not)
   * @return lastExecutionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the delivery was last attempted (either successfully or not)")

  public OffsetDateTime getLastExecutionDate() {
    return lastExecutionDate;
  }


  public void setLastExecutionDate(OffsetDateTime lastExecutionDate) {
    this.lastExecutionDate = lastExecutionDate;
  }


  public EventDeliverySummary nextExecutionDate(OffsetDateTime nextExecutionDate) {
    
    this.nextExecutionDate = nextExecutionDate;
    return this;
  }

   /**
   * The date that the delivery will next be attempted, if the event has not been successfully delivered yet and there are still retries remaining
   * @return nextExecutionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the delivery will next be attempted, if the event has not been successfully delivered yet and there are still retries remaining")

  public OffsetDateTime getNextExecutionDate() {
    return nextExecutionDate;
  }


  public void setNextExecutionDate(OffsetDateTime nextExecutionDate) {
    this.nextExecutionDate = nextExecutionDate;
  }


  public EventDeliverySummary retriesRemaining(Integer retriesRemaining) {
    
    this.retriesRemaining = retriesRemaining;
    return this;
  }

   /**
   * Number of delivery attempts remaining
   * @return retriesRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of delivery attempts remaining")

  public Integer getRetriesRemaining() {
    return retriesRemaining;
  }


  public void setRetriesRemaining(Integer retriesRemaining) {
    this.retriesRemaining = retriesRemaining;
  }


  public EventDeliverySummary createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Create Date
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create Date")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public EventDeliverySummary updateDate(OffsetDateTime updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Update Date
   * @return updateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Update Date")

  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public EventDeliverySummary deliveryAttempts(List<EventDeliveryAttempt> deliveryAttempts) {
    
    this.deliveryAttempts = deliveryAttempts;
    return this;
  }

  public EventDeliverySummary addDeliveryAttemptsItem(EventDeliveryAttempt deliveryAttemptsItem) {
    if (this.deliveryAttempts == null) {
      this.deliveryAttempts = new ArrayList<>();
    }
    this.deliveryAttempts.add(deliveryAttemptsItem);
    return this;
  }

   /**
   * Details about each attempted delivery of the event to the endpoint
   * @return deliveryAttempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about each attempted delivery of the event to the endpoint")

  public List<EventDeliveryAttempt> getDeliveryAttempts() {
    return deliveryAttempts;
  }


  public void setDeliveryAttempts(List<EventDeliveryAttempt> deliveryAttempts) {
    this.deliveryAttempts = deliveryAttempts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDeliverySummary eventDeliverySummary = (EventDeliverySummary) o;
    return Objects.equals(this.id, eventDeliverySummary.id) &&
        Objects.equals(this.deliveryStatus, eventDeliverySummary.deliveryStatus) &&
        Objects.equals(this.eventSummary, eventDeliverySummary.eventSummary) &&
        Objects.equals(this.isRunning, eventDeliverySummary.isRunning) &&
        Objects.equals(this.lastExecutionDate, eventDeliverySummary.lastExecutionDate) &&
        Objects.equals(this.nextExecutionDate, eventDeliverySummary.nextExecutionDate) &&
        Objects.equals(this.retriesRemaining, eventDeliverySummary.retriesRemaining) &&
        Objects.equals(this.createDate, eventDeliverySummary.createDate) &&
        Objects.equals(this.updateDate, eventDeliverySummary.updateDate) &&
        Objects.equals(this.deliveryAttempts, eventDeliverySummary.deliveryAttempts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deliveryStatus, eventSummary, isRunning, lastExecutionDate, nextExecutionDate, retriesRemaining, createDate, updateDate, deliveryAttempts);
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
    sb.append("class EventDeliverySummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    eventSummary: ").append(toIndentedString(eventSummary)).append("\n");
    sb.append("    isRunning: ").append(toIndentedString(isRunning)).append("\n");
    sb.append("    lastExecutionDate: ").append(toIndentedString(lastExecutionDate)).append("\n");
    sb.append("    nextExecutionDate: ").append(toIndentedString(nextExecutionDate)).append("\n");
    sb.append("    retriesRemaining: ").append(toIndentedString(retriesRemaining)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    deliveryAttempts: ").append(toIndentedString(deliveryAttempts)).append("\n");
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
    openapiFields.add("deliveryStatus");
    openapiFields.add("eventSummary");
    openapiFields.add("isRunning");
    openapiFields.add("lastExecutionDate");
    openapiFields.add("nextExecutionDate");
    openapiFields.add("retriesRemaining");
    openapiFields.add("createDate");
    openapiFields.add("updateDate");
    openapiFields.add("deliveryAttempts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventDeliverySummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventDeliverySummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventDeliverySummary is not found in the empty JSON string", EventDeliverySummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!EventDeliverySummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventDeliverySummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("deliveryStatus") != null && !jsonObj.get("deliveryStatus").isJsonNull()) && !jsonObj.get("deliveryStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryStatus").toString()));
      }
      // validate the optional field `eventSummary`
      if (jsonObj.get("eventSummary") != null && !jsonObj.get("eventSummary").isJsonNull()) {
        EventSummary.validateJsonObject(jsonObj.getAsJsonObject("eventSummary"));
      }
      if (jsonObj.get("deliveryAttempts") != null && !jsonObj.get("deliveryAttempts").isJsonNull()) {
        JsonArray jsonArraydeliveryAttempts = jsonObj.getAsJsonArray("deliveryAttempts");
        if (jsonArraydeliveryAttempts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deliveryAttempts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deliveryAttempts` to be an array in the JSON string but got `%s`", jsonObj.get("deliveryAttempts").toString()));
          }

          // validate the optional field `deliveryAttempts` (array)
          for (int i = 0; i < jsonArraydeliveryAttempts.size(); i++) {
            EventDeliveryAttempt.validateJsonObject(jsonArraydeliveryAttempts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventDeliverySummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventDeliverySummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventDeliverySummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventDeliverySummary.class));

       return (TypeAdapter<T>) new TypeAdapter<EventDeliverySummary>() {
           @Override
           public void write(JsonWriter out, EventDeliverySummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventDeliverySummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventDeliverySummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventDeliverySummary
  * @throws IOException if the JSON string is invalid with respect to EventDeliverySummary
  */
  public static EventDeliverySummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventDeliverySummary.class);
  }

 /**
  * Convert an instance of EventDeliverySummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

