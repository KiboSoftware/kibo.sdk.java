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
 * SMSTransactionSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SMSTransactionSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHIPMENT_ITEM_CANCELED = "shipmentItemCanceled";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_ITEM_CANCELED)
  private Boolean shipmentItemCanceled;

  public static final String SERIALIZED_NAME_SHIPMENT_ASSIGNED = "shipmentAssigned";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_ASSIGNED)
  private Boolean shipmentAssigned;

  public static final String SERIALIZED_NAME_CUSTOMER_INTRANSIT = "customerIntransit";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INTRANSIT)
  private Boolean customerIntransit;

  public static final String SERIALIZED_NAME_CUSTOMER_AT_CURBSIDE = "customerAtCurbside";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_AT_CURBSIDE)
  private Boolean customerAtCurbside;

  public static final String SERIALIZED_NAME_INTRANSIT_CONFIRMATION = "intransitConfirmation";
  @SerializedName(SERIALIZED_NAME_INTRANSIT_CONFIRMATION)
  private Boolean intransitConfirmation;

  public static final String SERIALIZED_NAME_SHIPMENT_FULFILLED = "shipmentFulfilled";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_FULFILLED)
  private Boolean shipmentFulfilled;

  public static final String SERIALIZED_NAME_ORDER_CONFIRMATION = "orderConfirmation";
  @SerializedName(SERIALIZED_NAME_ORDER_CONFIRMATION)
  private Boolean orderConfirmation;

  public static final String SERIALIZED_NAME_CURBSIDE_READY = "curbsideReady";
  @SerializedName(SERIALIZED_NAME_CURBSIDE_READY)
  private Boolean curbsideReady;

  public static final String SERIALIZED_NAME_STORE_ITEMS_CANCELED = "storeItemsCanceled";
  @SerializedName(SERIALIZED_NAME_STORE_ITEMS_CANCELED)
  private Boolean storeItemsCanceled;

  public static final String SERIALIZED_NAME_OPT_OUT_ACKNOWLEDGEMENT = "optOutAcknowledgement";
  @SerializedName(SERIALIZED_NAME_OPT_OUT_ACKNOWLEDGEMENT)
  private Boolean optOutAcknowledgement;

  public static final String SERIALIZED_NAME_ORDER_PICKUP_READY = "orderPickupReady";
  @SerializedName(SERIALIZED_NAME_ORDER_PICKUP_READY)
  private Boolean orderPickupReady;

  public static final String SERIALIZED_NAME_ORDER_PICKUP_REMINDER = "orderPickupReminder";
  @SerializedName(SERIALIZED_NAME_ORDER_PICKUP_REMINDER)
  private Boolean orderPickupReminder;

  public static final String SERIALIZED_NAME_CUSTOMER_AT_STORE = "customerAtStore";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_AT_STORE)
  private Boolean customerAtStore;

  public SMSTransactionSettings() {
  }

  public SMSTransactionSettings shipmentItemCanceled(Boolean shipmentItemCanceled) {
    
    this.shipmentItemCanceled = shipmentItemCanceled;
    return this;
  }

   /**
   * Get shipmentItemCanceled
   * @return shipmentItemCanceled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShipmentItemCanceled() {
    return shipmentItemCanceled;
  }


  public void setShipmentItemCanceled(Boolean shipmentItemCanceled) {
    this.shipmentItemCanceled = shipmentItemCanceled;
  }


  public SMSTransactionSettings shipmentAssigned(Boolean shipmentAssigned) {
    
    this.shipmentAssigned = shipmentAssigned;
    return this;
  }

   /**
   * Get shipmentAssigned
   * @return shipmentAssigned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShipmentAssigned() {
    return shipmentAssigned;
  }


  public void setShipmentAssigned(Boolean shipmentAssigned) {
    this.shipmentAssigned = shipmentAssigned;
  }


  public SMSTransactionSettings customerIntransit(Boolean customerIntransit) {
    
    this.customerIntransit = customerIntransit;
    return this;
  }

   /**
   * Get customerIntransit
   * @return customerIntransit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCustomerIntransit() {
    return customerIntransit;
  }


  public void setCustomerIntransit(Boolean customerIntransit) {
    this.customerIntransit = customerIntransit;
  }


  public SMSTransactionSettings customerAtCurbside(Boolean customerAtCurbside) {
    
    this.customerAtCurbside = customerAtCurbside;
    return this;
  }

   /**
   * Get customerAtCurbside
   * @return customerAtCurbside
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCustomerAtCurbside() {
    return customerAtCurbside;
  }


  public void setCustomerAtCurbside(Boolean customerAtCurbside) {
    this.customerAtCurbside = customerAtCurbside;
  }


  public SMSTransactionSettings intransitConfirmation(Boolean intransitConfirmation) {
    
    this.intransitConfirmation = intransitConfirmation;
    return this;
  }

   /**
   * Get intransitConfirmation
   * @return intransitConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIntransitConfirmation() {
    return intransitConfirmation;
  }


  public void setIntransitConfirmation(Boolean intransitConfirmation) {
    this.intransitConfirmation = intransitConfirmation;
  }


  public SMSTransactionSettings shipmentFulfilled(Boolean shipmentFulfilled) {
    
    this.shipmentFulfilled = shipmentFulfilled;
    return this;
  }

   /**
   * Get shipmentFulfilled
   * @return shipmentFulfilled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShipmentFulfilled() {
    return shipmentFulfilled;
  }


  public void setShipmentFulfilled(Boolean shipmentFulfilled) {
    this.shipmentFulfilled = shipmentFulfilled;
  }


  public SMSTransactionSettings orderConfirmation(Boolean orderConfirmation) {
    
    this.orderConfirmation = orderConfirmation;
    return this;
  }

   /**
   * Get orderConfirmation
   * @return orderConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOrderConfirmation() {
    return orderConfirmation;
  }


  public void setOrderConfirmation(Boolean orderConfirmation) {
    this.orderConfirmation = orderConfirmation;
  }


  public SMSTransactionSettings curbsideReady(Boolean curbsideReady) {
    
    this.curbsideReady = curbsideReady;
    return this;
  }

   /**
   * Get curbsideReady
   * @return curbsideReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCurbsideReady() {
    return curbsideReady;
  }


  public void setCurbsideReady(Boolean curbsideReady) {
    this.curbsideReady = curbsideReady;
  }


  public SMSTransactionSettings storeItemsCanceled(Boolean storeItemsCanceled) {
    
    this.storeItemsCanceled = storeItemsCanceled;
    return this;
  }

   /**
   * Get storeItemsCanceled
   * @return storeItemsCanceled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStoreItemsCanceled() {
    return storeItemsCanceled;
  }


  public void setStoreItemsCanceled(Boolean storeItemsCanceled) {
    this.storeItemsCanceled = storeItemsCanceled;
  }


  public SMSTransactionSettings optOutAcknowledgement(Boolean optOutAcknowledgement) {
    
    this.optOutAcknowledgement = optOutAcknowledgement;
    return this;
  }

   /**
   * Get optOutAcknowledgement
   * @return optOutAcknowledgement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptOutAcknowledgement() {
    return optOutAcknowledgement;
  }


  public void setOptOutAcknowledgement(Boolean optOutAcknowledgement) {
    this.optOutAcknowledgement = optOutAcknowledgement;
  }


  public SMSTransactionSettings orderPickupReady(Boolean orderPickupReady) {
    
    this.orderPickupReady = orderPickupReady;
    return this;
  }

   /**
   * Get orderPickupReady
   * @return orderPickupReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOrderPickupReady() {
    return orderPickupReady;
  }


  public void setOrderPickupReady(Boolean orderPickupReady) {
    this.orderPickupReady = orderPickupReady;
  }


  public SMSTransactionSettings orderPickupReminder(Boolean orderPickupReminder) {
    
    this.orderPickupReminder = orderPickupReminder;
    return this;
  }

   /**
   * Get orderPickupReminder
   * @return orderPickupReminder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOrderPickupReminder() {
    return orderPickupReminder;
  }


  public void setOrderPickupReminder(Boolean orderPickupReminder) {
    this.orderPickupReminder = orderPickupReminder;
  }


  public SMSTransactionSettings customerAtStore(Boolean customerAtStore) {
    
    this.customerAtStore = customerAtStore;
    return this;
  }

   /**
   * Get customerAtStore
   * @return customerAtStore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCustomerAtStore() {
    return customerAtStore;
  }


  public void setCustomerAtStore(Boolean customerAtStore) {
    this.customerAtStore = customerAtStore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSTransactionSettings smSTransactionSettings = (SMSTransactionSettings) o;
    return Objects.equals(this.shipmentItemCanceled, smSTransactionSettings.shipmentItemCanceled) &&
        Objects.equals(this.shipmentAssigned, smSTransactionSettings.shipmentAssigned) &&
        Objects.equals(this.customerIntransit, smSTransactionSettings.customerIntransit) &&
        Objects.equals(this.customerAtCurbside, smSTransactionSettings.customerAtCurbside) &&
        Objects.equals(this.intransitConfirmation, smSTransactionSettings.intransitConfirmation) &&
        Objects.equals(this.shipmentFulfilled, smSTransactionSettings.shipmentFulfilled) &&
        Objects.equals(this.orderConfirmation, smSTransactionSettings.orderConfirmation) &&
        Objects.equals(this.curbsideReady, smSTransactionSettings.curbsideReady) &&
        Objects.equals(this.storeItemsCanceled, smSTransactionSettings.storeItemsCanceled) &&
        Objects.equals(this.optOutAcknowledgement, smSTransactionSettings.optOutAcknowledgement) &&
        Objects.equals(this.orderPickupReady, smSTransactionSettings.orderPickupReady) &&
        Objects.equals(this.orderPickupReminder, smSTransactionSettings.orderPickupReminder) &&
        Objects.equals(this.customerAtStore, smSTransactionSettings.customerAtStore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentItemCanceled, shipmentAssigned, customerIntransit, customerAtCurbside, intransitConfirmation, shipmentFulfilled, orderConfirmation, curbsideReady, storeItemsCanceled, optOutAcknowledgement, orderPickupReady, orderPickupReminder, customerAtStore);
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
    sb.append("class SMSTransactionSettings {\n");
    sb.append("    shipmentItemCanceled: ").append(toIndentedString(shipmentItemCanceled)).append("\n");
    sb.append("    shipmentAssigned: ").append(toIndentedString(shipmentAssigned)).append("\n");
    sb.append("    customerIntransit: ").append(toIndentedString(customerIntransit)).append("\n");
    sb.append("    customerAtCurbside: ").append(toIndentedString(customerAtCurbside)).append("\n");
    sb.append("    intransitConfirmation: ").append(toIndentedString(intransitConfirmation)).append("\n");
    sb.append("    shipmentFulfilled: ").append(toIndentedString(shipmentFulfilled)).append("\n");
    sb.append("    orderConfirmation: ").append(toIndentedString(orderConfirmation)).append("\n");
    sb.append("    curbsideReady: ").append(toIndentedString(curbsideReady)).append("\n");
    sb.append("    storeItemsCanceled: ").append(toIndentedString(storeItemsCanceled)).append("\n");
    sb.append("    optOutAcknowledgement: ").append(toIndentedString(optOutAcknowledgement)).append("\n");
    sb.append("    orderPickupReady: ").append(toIndentedString(orderPickupReady)).append("\n");
    sb.append("    orderPickupReminder: ").append(toIndentedString(orderPickupReminder)).append("\n");
    sb.append("    customerAtStore: ").append(toIndentedString(customerAtStore)).append("\n");
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
    openapiFields.add("shipmentItemCanceled");
    openapiFields.add("shipmentAssigned");
    openapiFields.add("customerIntransit");
    openapiFields.add("customerAtCurbside");
    openapiFields.add("intransitConfirmation");
    openapiFields.add("shipmentFulfilled");
    openapiFields.add("orderConfirmation");
    openapiFields.add("curbsideReady");
    openapiFields.add("storeItemsCanceled");
    openapiFields.add("optOutAcknowledgement");
    openapiFields.add("orderPickupReady");
    openapiFields.add("orderPickupReminder");
    openapiFields.add("customerAtStore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SMSTransactionSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SMSTransactionSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SMSTransactionSettings is not found in the empty JSON string", SMSTransactionSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SMSTransactionSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SMSTransactionSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SMSTransactionSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SMSTransactionSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SMSTransactionSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SMSTransactionSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SMSTransactionSettings>() {
           @Override
           public void write(JsonWriter out, SMSTransactionSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SMSTransactionSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SMSTransactionSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SMSTransactionSettings
  * @throws IOException if the JSON string is invalid with respect to SMSTransactionSettings
  */
  public static SMSTransactionSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SMSTransactionSettings.class);
  }

 /**
  * Convert an instance of SMSTransactionSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

