/*
 * Kibo Reservation Web API
 * OpenAPI Spec for Kibo Reservation Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reservation.models;

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
 * ReservationWebAPIChangeMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReservationWebAPIChangeMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_APP_NAME = "appName";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_SUBJECT_TYPE = "subjectType";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPE)
  private String subjectType;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private String verb;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public ReservationWebAPIChangeMessage() {
  }

  public ReservationWebAPIChangeMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ReservationWebAPIChangeMessage identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ReservationWebAPIChangeMessage correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCorrelationId() {
    return correlationId;
  }


  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public ReservationWebAPIChangeMessage userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ReservationWebAPIChangeMessage appKey(String appKey) {
    
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  public ReservationWebAPIChangeMessage appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ReservationWebAPIChangeMessage subjectType(String subjectType) {
    
    this.subjectType = subjectType;
    return this;
  }

   /**
   * Get subjectType
   * @return subjectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectType() {
    return subjectType;
  }


  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }


  public ReservationWebAPIChangeMessage subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ReservationWebAPIChangeMessage verb(String verb) {
    
    this.verb = verb;
    return this;
  }

   /**
   * Get verb
   * @return verb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVerb() {
    return verb;
  }


  public void setVerb(String verb) {
    this.verb = verb;
  }


  public ReservationWebAPIChangeMessage message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ReservationWebAPIChangeMessage createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationWebAPIChangeMessage reservationWebAPIChangeMessage = (ReservationWebAPIChangeMessage) o;
    return Objects.equals(this.id, reservationWebAPIChangeMessage.id) &&
        Objects.equals(this.identifier, reservationWebAPIChangeMessage.identifier) &&
        Objects.equals(this.correlationId, reservationWebAPIChangeMessage.correlationId) &&
        Objects.equals(this.userId, reservationWebAPIChangeMessage.userId) &&
        Objects.equals(this.appKey, reservationWebAPIChangeMessage.appKey) &&
        Objects.equals(this.appName, reservationWebAPIChangeMessage.appName) &&
        Objects.equals(this.subjectType, reservationWebAPIChangeMessage.subjectType) &&
        Objects.equals(this.subject, reservationWebAPIChangeMessage.subject) &&
        Objects.equals(this.verb, reservationWebAPIChangeMessage.verb) &&
        Objects.equals(this.message, reservationWebAPIChangeMessage.message) &&
        Objects.equals(this.createDate, reservationWebAPIChangeMessage.createDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier, correlationId, userId, appKey, appName, subjectType, subject, verb, message, createDate);
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
    sb.append("class ReservationWebAPIChangeMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("correlationId");
    openapiFields.add("userId");
    openapiFields.add("appKey");
    openapiFields.add("appName");
    openapiFields.add("subjectType");
    openapiFields.add("subject");
    openapiFields.add("verb");
    openapiFields.add("message");
    openapiFields.add("createDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReservationWebAPIChangeMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReservationWebAPIChangeMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReservationWebAPIChangeMessage is not found in the empty JSON string", ReservationWebAPIChangeMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ReservationWebAPIChangeMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReservationWebAPIChangeMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("correlationId") != null && !jsonObj.get("correlationId").isJsonNull()) && !jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("appKey") != null && !jsonObj.get("appKey").isJsonNull()) && !jsonObj.get("appKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appKey").toString()));
      }
      if ((jsonObj.get("appName") != null && !jsonObj.get("appName").isJsonNull()) && !jsonObj.get("appName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appName").toString()));
      }
      if ((jsonObj.get("subjectType") != null && !jsonObj.get("subjectType").isJsonNull()) && !jsonObj.get("subjectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectType").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("verb") != null && !jsonObj.get("verb").isJsonNull()) && !jsonObj.get("verb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verb").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReservationWebAPIChangeMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReservationWebAPIChangeMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReservationWebAPIChangeMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReservationWebAPIChangeMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ReservationWebAPIChangeMessage>() {
           @Override
           public void write(JsonWriter out, ReservationWebAPIChangeMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReservationWebAPIChangeMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReservationWebAPIChangeMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReservationWebAPIChangeMessage
  * @throws IOException if the JSON string is invalid with respect to ReservationWebAPIChangeMessage
  */
  public static ReservationWebAPIChangeMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReservationWebAPIChangeMessage.class);
  }

 /**
  * Convert an instance of ReservationWebAPIChangeMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

