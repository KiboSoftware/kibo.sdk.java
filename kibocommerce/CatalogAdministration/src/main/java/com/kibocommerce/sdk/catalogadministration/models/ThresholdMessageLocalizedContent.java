/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
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
 * ThresholdMessageLocalizedContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThresholdMessageLocalizedContent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_MESSAGE_TEMPLATE = "messageTemplate";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEMPLATE)
  private String messageTemplate;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public ThresholdMessageLocalizedContent() {
  }

  public ThresholdMessageLocalizedContent localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Language used for the discount in the current catalog. Defaults setting for the active catalog.
   * @return localeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language used for the discount in the current catalog. Defaults setting for the active catalog.")

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public ThresholdMessageLocalizedContent messageTemplate(String messageTemplate) {
    
    this.messageTemplate = messageTemplate;
    return this;
  }

   /**
   * Locale-based contents of the Threshold Message.
   * @return messageTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Locale-based contents of the Threshold Message.")

  public String getMessageTemplate() {
    return messageTemplate;
  }


  public void setMessageTemplate(String messageTemplate) {
    this.messageTemplate = messageTemplate;
  }


  public ThresholdMessageLocalizedContent auditInfo(AdminUserAuditInfo auditInfo) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdMessageLocalizedContent thresholdMessageLocalizedContent = (ThresholdMessageLocalizedContent) o;
    return Objects.equals(this.localeCode, thresholdMessageLocalizedContent.localeCode) &&
        Objects.equals(this.messageTemplate, thresholdMessageLocalizedContent.messageTemplate) &&
        Objects.equals(this.auditInfo, thresholdMessageLocalizedContent.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeCode, messageTemplate, auditInfo);
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
    sb.append("class ThresholdMessageLocalizedContent {\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    messageTemplate: ").append(toIndentedString(messageTemplate)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("localeCode");
    openapiFields.add("messageTemplate");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageTemplate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThresholdMessageLocalizedContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThresholdMessageLocalizedContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThresholdMessageLocalizedContent is not found in the empty JSON string", ThresholdMessageLocalizedContent.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ThresholdMessageLocalizedContent.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThresholdMessageLocalizedContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThresholdMessageLocalizedContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("localeCode") != null && !jsonObj.get("localeCode").isJsonNull()) && !jsonObj.get("localeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localeCode").toString()));
      }
      if (!jsonObj.get("messageTemplate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageTemplate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageTemplate").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThresholdMessageLocalizedContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThresholdMessageLocalizedContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThresholdMessageLocalizedContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThresholdMessageLocalizedContent.class));

       return (TypeAdapter<T>) new TypeAdapter<ThresholdMessageLocalizedContent>() {
           @Override
           public void write(JsonWriter out, ThresholdMessageLocalizedContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThresholdMessageLocalizedContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThresholdMessageLocalizedContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThresholdMessageLocalizedContent
  * @throws IOException if the JSON string is invalid with respect to ThresholdMessageLocalizedContent
  */
  public static ThresholdMessageLocalizedContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThresholdMessageLocalizedContent.class);
  }

 /**
  * Convert an instance of ThresholdMessageLocalizedContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

