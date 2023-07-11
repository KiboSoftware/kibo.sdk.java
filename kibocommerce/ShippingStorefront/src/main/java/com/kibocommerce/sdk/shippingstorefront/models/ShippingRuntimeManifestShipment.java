/*
 * Kibo ShippingRuntime Service
 * OpenAPI Spec for Kibo ShippingRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingstorefront.models;

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
 * ShippingRuntimeManifestShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingRuntimeManifestShipment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_INTEGRATOR_IDS = "integratorIds";
  @SerializedName(SERIALIZED_NAME_INTEGRATOR_IDS)
  private List<String> integratorIds = null;

  public ShippingRuntimeManifestShipment() {
  }

  public ShippingRuntimeManifestShipment shipmentNumber(Integer shipmentNumber) {
    
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Kibo-ShipmentNumber
   * @return shipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kibo-ShipmentNumber")

  public Integer getShipmentNumber() {
    return shipmentNumber;
  }


  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  public ShippingRuntimeManifestShipment integratorIds(List<String> integratorIds) {
    
    this.integratorIds = integratorIds;
    return this;
  }

  public ShippingRuntimeManifestShipment addIntegratorIdsItem(String integratorIdsItem) {
    if (this.integratorIds == null) {
      this.integratorIds = new ArrayList<>();
    }
    this.integratorIds.add(integratorIdsItem);
    return this;
  }

   /**
   * List of EasyPost Integration ShipmentIds. Each package under the shipment has its own easypost-shipmentid
   * @return integratorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of EasyPost Integration ShipmentIds. Each package under the shipment has its own easypost-shipmentid")

  public List<String> getIntegratorIds() {
    return integratorIds;
  }


  public void setIntegratorIds(List<String> integratorIds) {
    this.integratorIds = integratorIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingRuntimeManifestShipment shippingRuntimeManifestShipment = (ShippingRuntimeManifestShipment) o;
    return Objects.equals(this.shipmentNumber, shippingRuntimeManifestShipment.shipmentNumber) &&
        Objects.equals(this.integratorIds, shippingRuntimeManifestShipment.integratorIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentNumber, integratorIds);
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
    sb.append("class ShippingRuntimeManifestShipment {\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    integratorIds: ").append(toIndentedString(integratorIds)).append("\n");
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
    openapiFields.add("shipmentNumber");
    openapiFields.add("integratorIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingRuntimeManifestShipment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingRuntimeManifestShipment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingRuntimeManifestShipment is not found in the empty JSON string", ShippingRuntimeManifestShipment.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingRuntimeManifestShipment.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingRuntimeManifestShipment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("integratorIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `integratorIds` to be an array in the JSON string but got `%s`", jsonObj.get("integratorIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingRuntimeManifestShipment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingRuntimeManifestShipment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingRuntimeManifestShipment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingRuntimeManifestShipment.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingRuntimeManifestShipment>() {
           @Override
           public void write(JsonWriter out, ShippingRuntimeManifestShipment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingRuntimeManifestShipment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingRuntimeManifestShipment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingRuntimeManifestShipment
  * @throws IOException if the JSON string is invalid with respect to ShippingRuntimeManifestShipment
  */
  public static ShippingRuntimeManifestShipment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingRuntimeManifestShipment.class);
  }

 /**
  * Convert an instance of ShippingRuntimeManifestShipment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
