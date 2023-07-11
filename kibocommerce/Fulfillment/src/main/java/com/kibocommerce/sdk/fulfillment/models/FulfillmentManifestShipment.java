/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentDestination;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * FulfillmentManifestShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FulfillmentManifestShipment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private FulfillmentDestination destination;

  public static final String SERIALIZED_NAME_EXTERNAL_ORDER_ID = "externalOrderId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORDER_ID)
  private String externalOrderId;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<FulfillmentPackage> packages = null;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private String shipmentType;

  public FulfillmentManifestShipment() {
  }

  public FulfillmentManifestShipment destination(FulfillmentDestination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FulfillmentDestination getDestination() {
    return destination;
  }


  public void setDestination(FulfillmentDestination destination) {
    this.destination = destination;
  }


  public FulfillmentManifestShipment externalOrderId(String externalOrderId) {
    
    this.externalOrderId = externalOrderId;
    return this;
  }

   /**
   * Get externalOrderId
   * @return externalOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalOrderId() {
    return externalOrderId;
  }


  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }


  public FulfillmentManifestShipment fulfillmentLocationCode(String fulfillmentLocationCode) {
    
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }


  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }


  public FulfillmentManifestShipment orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public FulfillmentManifestShipment packages(List<FulfillmentPackage> packages) {
    
    this.packages = packages;
    return this;
  }

  public FulfillmentManifestShipment addPackagesItem(FulfillmentPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FulfillmentPackage> getPackages() {
    return packages;
  }


  public void setPackages(List<FulfillmentPackage> packages) {
    this.packages = packages;
  }


  public FulfillmentManifestShipment shipmentNumber(Integer shipmentNumber) {
    
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Get shipmentNumber
   * @return shipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShipmentNumber() {
    return shipmentNumber;
  }


  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  public FulfillmentManifestShipment shipmentType(String shipmentType) {
    
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipmentType() {
    return shipmentType;
  }


  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentManifestShipment fulfillmentManifestShipment = (FulfillmentManifestShipment) o;
    return Objects.equals(this.destination, fulfillmentManifestShipment.destination) &&
        Objects.equals(this.externalOrderId, fulfillmentManifestShipment.externalOrderId) &&
        Objects.equals(this.fulfillmentLocationCode, fulfillmentManifestShipment.fulfillmentLocationCode) &&
        Objects.equals(this.orderNumber, fulfillmentManifestShipment.orderNumber) &&
        Objects.equals(this.packages, fulfillmentManifestShipment.packages) &&
        Objects.equals(this.shipmentNumber, fulfillmentManifestShipment.shipmentNumber) &&
        Objects.equals(this.shipmentType, fulfillmentManifestShipment.shipmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, externalOrderId, fulfillmentLocationCode, orderNumber, packages, shipmentNumber, shipmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentManifestShipment {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    externalOrderId: ").append(toIndentedString(externalOrderId)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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
    openapiFields.add("destination");
    openapiFields.add("externalOrderId");
    openapiFields.add("fulfillmentLocationCode");
    openapiFields.add("orderNumber");
    openapiFields.add("packages");
    openapiFields.add("shipmentNumber");
    openapiFields.add("shipmentType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FulfillmentManifestShipment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FulfillmentManifestShipment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentManifestShipment is not found in the empty JSON string", FulfillmentManifestShipment.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FulfillmentManifestShipment.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FulfillmentManifestShipment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `destination`
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) {
        FulfillmentDestination.validateJsonObject(jsonObj.getAsJsonObject("destination"));
      }
      if ((jsonObj.get("externalOrderId") != null && !jsonObj.get("externalOrderId").isJsonNull()) && !jsonObj.get("externalOrderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalOrderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalOrderId").toString()));
      }
      if ((jsonObj.get("fulfillmentLocationCode") != null && !jsonObj.get("fulfillmentLocationCode").isJsonNull()) && !jsonObj.get("fulfillmentLocationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentLocationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentLocationCode").toString()));
      }
      if (jsonObj.get("packages") != null && !jsonObj.get("packages").isJsonNull()) {
        JsonArray jsonArraypackages = jsonObj.getAsJsonArray("packages");
        if (jsonArraypackages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("packages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `packages` to be an array in the JSON string but got `%s`", jsonObj.get("packages").toString()));
          }

          // validate the optional field `packages` (array)
          for (int i = 0; i < jsonArraypackages.size(); i++) {
            FulfillmentPackage.validateJsonObject(jsonArraypackages.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("shipmentType") != null && !jsonObj.get("shipmentType").isJsonNull()) && !jsonObj.get("shipmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentManifestShipment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentManifestShipment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentManifestShipment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentManifestShipment.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentManifestShipment>() {
           @Override
           public void write(JsonWriter out, FulfillmentManifestShipment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FulfillmentManifestShipment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FulfillmentManifestShipment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FulfillmentManifestShipment
  * @throws IOException if the JSON string is invalid with respect to FulfillmentManifestShipment
  */
  public static FulfillmentManifestShipment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentManifestShipment.class);
  }

 /**
  * Convert an instance of FulfillmentManifestShipment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

