/*
 * Kibo SiteSettings Service
 * OpenAPI Spec for Kibo SiteSettings Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.settings.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.settings.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.settings.models.InventoryExportJob;
import com.kibocommerce.sdk.settings.models.LocationFulfillmentTypeSetting;
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
 * InventorySettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InventorySettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INVENTORY_EXPORT_JOB = "inventoryExportJob";
  @SerializedName(SERIALIZED_NAME_INVENTORY_EXPORT_JOB)
  private InventoryExportJob inventoryExportJob;

  public static final String SERIALIZED_NAME_RESERVE_CART_INVENTORY_INTERVAL = "reserveCartInventoryInterval";
  @SerializedName(SERIALIZED_NAME_RESERVE_CART_INVENTORY_INTERVAL)
  private Integer reserveCartInventoryInterval;

  public static final String SERIALIZED_NAME_LOCATION_FULFILLMENT_TYPE_SETTINGS = "locationFulfillmentTypeSettings";
  @SerializedName(SERIALIZED_NAME_LOCATION_FULFILLMENT_TYPE_SETTINGS)
  private List<LocationFulfillmentTypeSetting> locationFulfillmentTypeSettings = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public InventorySettings() {
  }

  public InventorySettings inventoryExportJob(InventoryExportJob inventoryExportJob) {
    
    this.inventoryExportJob = inventoryExportJob;
    return this;
  }

   /**
   * Get inventoryExportJob
   * @return inventoryExportJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InventoryExportJob getInventoryExportJob() {
    return inventoryExportJob;
  }


  public void setInventoryExportJob(InventoryExportJob inventoryExportJob) {
    this.inventoryExportJob = inventoryExportJob;
  }


  public InventorySettings reserveCartInventoryInterval(Integer reserveCartInventoryInterval) {
    
    this.reserveCartInventoryInterval = reserveCartInventoryInterval;
    return this;
  }

   /**
   * Get reserveCartInventoryInterval
   * @return reserveCartInventoryInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReserveCartInventoryInterval() {
    return reserveCartInventoryInterval;
  }


  public void setReserveCartInventoryInterval(Integer reserveCartInventoryInterval) {
    this.reserveCartInventoryInterval = reserveCartInventoryInterval;
  }


  public InventorySettings locationFulfillmentTypeSettings(List<LocationFulfillmentTypeSetting> locationFulfillmentTypeSettings) {
    
    this.locationFulfillmentTypeSettings = locationFulfillmentTypeSettings;
    return this;
  }

  public InventorySettings addLocationFulfillmentTypeSettingsItem(LocationFulfillmentTypeSetting locationFulfillmentTypeSettingsItem) {
    if (this.locationFulfillmentTypeSettings == null) {
      this.locationFulfillmentTypeSettings = new ArrayList<>();
    }
    this.locationFulfillmentTypeSettings.add(locationFulfillmentTypeSettingsItem);
    return this;
  }

   /**
   * Get locationFulfillmentTypeSettings
   * @return locationFulfillmentTypeSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocationFulfillmentTypeSetting> getLocationFulfillmentTypeSettings() {
    return locationFulfillmentTypeSettings;
  }


  public void setLocationFulfillmentTypeSettings(List<LocationFulfillmentTypeSetting> locationFulfillmentTypeSettings) {
    this.locationFulfillmentTypeSettings = locationFulfillmentTypeSettings;
  }


  public InventorySettings auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    InventorySettings inventorySettings = (InventorySettings) o;
    return Objects.equals(this.inventoryExportJob, inventorySettings.inventoryExportJob) &&
        Objects.equals(this.reserveCartInventoryInterval, inventorySettings.reserveCartInventoryInterval) &&
        Objects.equals(this.locationFulfillmentTypeSettings, inventorySettings.locationFulfillmentTypeSettings) &&
        Objects.equals(this.auditInfo, inventorySettings.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryExportJob, reserveCartInventoryInterval, locationFulfillmentTypeSettings, auditInfo);
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
    sb.append("class InventorySettings {\n");
    sb.append("    inventoryExportJob: ").append(toIndentedString(inventoryExportJob)).append("\n");
    sb.append("    reserveCartInventoryInterval: ").append(toIndentedString(reserveCartInventoryInterval)).append("\n");
    sb.append("    locationFulfillmentTypeSettings: ").append(toIndentedString(locationFulfillmentTypeSettings)).append("\n");
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
    openapiFields.add("inventoryExportJob");
    openapiFields.add("reserveCartInventoryInterval");
    openapiFields.add("locationFulfillmentTypeSettings");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InventorySettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InventorySettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InventorySettings is not found in the empty JSON string", InventorySettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!InventorySettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InventorySettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `inventoryExportJob`
      if (jsonObj.get("inventoryExportJob") != null && !jsonObj.get("inventoryExportJob").isJsonNull()) {
        InventoryExportJob.validateJsonObject(jsonObj.getAsJsonObject("inventoryExportJob"));
      }
      if (jsonObj.get("locationFulfillmentTypeSettings") != null && !jsonObj.get("locationFulfillmentTypeSettings").isJsonNull()) {
        JsonArray jsonArraylocationFulfillmentTypeSettings = jsonObj.getAsJsonArray("locationFulfillmentTypeSettings");
        if (jsonArraylocationFulfillmentTypeSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("locationFulfillmentTypeSettings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `locationFulfillmentTypeSettings` to be an array in the JSON string but got `%s`", jsonObj.get("locationFulfillmentTypeSettings").toString()));
          }

          // validate the optional field `locationFulfillmentTypeSettings` (array)
          for (int i = 0; i < jsonArraylocationFulfillmentTypeSettings.size(); i++) {
            LocationFulfillmentTypeSetting.validateJsonObject(jsonArraylocationFulfillmentTypeSettings.get(i).getAsJsonObject());
          };
        }
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
       if (!InventorySettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InventorySettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InventorySettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InventorySettings.class));

       return (TypeAdapter<T>) new TypeAdapter<InventorySettings>() {
           @Override
           public void write(JsonWriter out, InventorySettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InventorySettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InventorySettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InventorySettings
  * @throws IOException if the JSON string is invalid with respect to InventorySettings
  */
  public static InventorySettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InventorySettings.class);
  }

 /**
  * Convert an instance of InventorySettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
