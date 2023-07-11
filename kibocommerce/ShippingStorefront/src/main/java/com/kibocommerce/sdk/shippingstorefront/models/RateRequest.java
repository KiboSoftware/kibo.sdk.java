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
import com.kibocommerce.sdk.shippingstorefront.models.CommerceRuntimeAddress;
import com.kibocommerce.sdk.shippingstorefront.models.CustomAttribute;
import com.kibocommerce.sdk.shippingstorefront.models.RateRequestAttribute;
import com.kibocommerce.sdk.shippingstorefront.models.RateRequestItem;
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
 * RateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "isoCurrencyCode";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_ORIGIN_ADDRESS = "originAddress";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ADDRESS)
  private CommerceRuntimeAddress originAddress;

  public static final String SERIALIZED_NAME_DESTINATION_ADDRESS = "destinationAddress";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ADDRESS)
  private CommerceRuntimeAddress destinationAddress;

  public static final String SERIALIZED_NAME_CARRIER_IDS = "carrierIds";
  @SerializedName(SERIALIZED_NAME_CARRIER_IDS)
  private List<String> carrierIds = null;

  public static final String SERIALIZED_NAME_SHIPPING_SERVICE_TYPES = "shippingServiceTypes";
  @SerializedName(SERIALIZED_NAME_SHIPPING_SERVICE_TYPES)
  private List<String> shippingServiceTypes = null;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private Double orderTotal;

  public static final String SERIALIZED_NAME_ORDER_DISCOUNTED_SUB_TOTAL = "orderDiscountedSubTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_DISCOUNTED_SUB_TOTAL)
  private Double orderDiscountedSubTotal;

  public static final String SERIALIZED_NAME_HANDLING_TOTAL = "handlingTotal";
  @SerializedName(SERIALIZED_NAME_HANDLING_TOTAL)
  private Double handlingTotal;

  public static final String SERIALIZED_NAME_RELATED_ORDER_ID = "relatedOrderId";
  @SerializedName(SERIALIZED_NAME_RELATED_ORDER_ID)
  private String relatedOrderId;

  public static final String SERIALIZED_NAME_RELATED_ORDER_NUMBER = "relatedOrderNumber";
  @SerializedName(SERIALIZED_NAME_RELATED_ORDER_NUMBER)
  private Integer relatedOrderNumber;

  public static final String SERIALIZED_NAME_IS_DESTINATION_ADDRESS_COMMERCIAL = "isDestinationAddressCommercial";
  @SerializedName(SERIALIZED_NAME_IS_DESTINATION_ADDRESS_COMMERCIAL)
  private Boolean isDestinationAddressCommercial;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<RateRequestItem> items = null;

  public static final String SERIALIZED_NAME_ESTIMATED_SHIPMENT_DATE = "estimatedShipmentDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SHIPMENT_DATE)
  private OffsetDateTime estimatedShipmentDate;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<RateRequestAttribute> attributes = null;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "customAttributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<CustomAttribute> customAttributes = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public RateRequest() {
  }

  public RateRequest id(String id) {
    
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


  public RateRequest isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * Get isoCurrencyCode
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public RateRequest originAddress(CommerceRuntimeAddress originAddress) {
    
    this.originAddress = originAddress;
    return this;
  }

   /**
   * Get originAddress
   * @return originAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeAddress getOriginAddress() {
    return originAddress;
  }


  public void setOriginAddress(CommerceRuntimeAddress originAddress) {
    this.originAddress = originAddress;
  }


  public RateRequest destinationAddress(CommerceRuntimeAddress destinationAddress) {
    
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * Get destinationAddress
   * @return destinationAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeAddress getDestinationAddress() {
    return destinationAddress;
  }


  public void setDestinationAddress(CommerceRuntimeAddress destinationAddress) {
    this.destinationAddress = destinationAddress;
  }


  public RateRequest carrierIds(List<String> carrierIds) {
    
    this.carrierIds = carrierIds;
    return this;
  }

  public RateRequest addCarrierIdsItem(String carrierIdsItem) {
    if (this.carrierIds == null) {
      this.carrierIds = new ArrayList<>();
    }
    this.carrierIds.add(carrierIdsItem);
    return this;
  }

   /**
   * Optional.  If one or more Carrier Ids are specified then only the rates for the specified carrier(&#39;s/s&#39;) configured service types or shipping methods will be calculated resulting in better performance.
   * @return carrierIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional.  If one or more Carrier Ids are specified then only the rates for the specified carrier('s/s') configured service types or shipping methods will be calculated resulting in better performance.")

  public List<String> getCarrierIds() {
    return carrierIds;
  }


  public void setCarrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
  }


  public RateRequest shippingServiceTypes(List<String> shippingServiceTypes) {
    
    this.shippingServiceTypes = shippingServiceTypes;
    return this;
  }

  public RateRequest addShippingServiceTypesItem(String shippingServiceTypesItem) {
    if (this.shippingServiceTypes == null) {
      this.shippingServiceTypes = new ArrayList<>();
    }
    this.shippingServiceTypes.add(shippingServiceTypesItem);
    return this;
  }

   /**
   * Optional.  If one or more Shipping Service Type Codes are specified then only the specified rates for the specified carrier(&#39;s/s&#39;) configured service types or shipping methods will be calculated resulting in better performance.
   * @return shippingServiceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional.  If one or more Shipping Service Type Codes are specified then only the specified rates for the specified carrier('s/s') configured service types or shipping methods will be calculated resulting in better performance.")

  public List<String> getShippingServiceTypes() {
    return shippingServiceTypes;
  }


  public void setShippingServiceTypes(List<String> shippingServiceTypes) {
    this.shippingServiceTypes = shippingServiceTypes;
  }


  public RateRequest orderTotal(Double orderTotal) {
    
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The OrderTotal to be used in rate calculation
   * @return orderTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OrderTotal to be used in rate calculation")

  public Double getOrderTotal() {
    return orderTotal;
  }


  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }


  public RateRequest orderDiscountedSubTotal(Double orderDiscountedSubTotal) {
    
    this.orderDiscountedSubTotal = orderDiscountedSubTotal;
    return this;
  }

   /**
   * The Order SubTotal After Discounts to be used in rate calculation
   * @return orderDiscountedSubTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Order SubTotal After Discounts to be used in rate calculation")

  public Double getOrderDiscountedSubTotal() {
    return orderDiscountedSubTotal;
  }


  public void setOrderDiscountedSubTotal(Double orderDiscountedSubTotal) {
    this.orderDiscountedSubTotal = orderDiscountedSubTotal;
  }


  public RateRequest handlingTotal(Double handlingTotal) {
    
    this.handlingTotal = handlingTotal;
    return this;
  }

   /**
   * The order Handling total after discounts to be used in rate calculation
   * @return handlingTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order Handling total after discounts to be used in rate calculation")

  public Double getHandlingTotal() {
    return handlingTotal;
  }


  public void setHandlingTotal(Double handlingTotal) {
    this.handlingTotal = handlingTotal;
  }


  public RateRequest relatedOrderId(String relatedOrderId) {
    
    this.relatedOrderId = relatedOrderId;
    return this;
  }

   /**
   * The Order ID to be used in rate calculation  Informational only
   * @return relatedOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Order ID to be used in rate calculation  Informational only")

  public String getRelatedOrderId() {
    return relatedOrderId;
  }


  public void setRelatedOrderId(String relatedOrderId) {
    this.relatedOrderId = relatedOrderId;
  }


  public RateRequest relatedOrderNumber(Integer relatedOrderNumber) {
    
    this.relatedOrderNumber = relatedOrderNumber;
    return this;
  }

   /**
   * The Order Number to be used in rate calculation  Informational only
   * @return relatedOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Order Number to be used in rate calculation  Informational only")

  public Integer getRelatedOrderNumber() {
    return relatedOrderNumber;
  }


  public void setRelatedOrderNumber(Integer relatedOrderNumber) {
    this.relatedOrderNumber = relatedOrderNumber;
  }


  public RateRequest isDestinationAddressCommercial(Boolean isDestinationAddressCommercial) {
    
    this.isDestinationAddressCommercial = isDestinationAddressCommercial;
    return this;
  }

   /**
   * Is the destination address a commercial address?
   * @return isDestinationAddressCommercial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the destination address a commercial address?")

  public Boolean getIsDestinationAddressCommercial() {
    return isDestinationAddressCommercial;
  }


  public void setIsDestinationAddressCommercial(Boolean isDestinationAddressCommercial) {
    this.isDestinationAddressCommercial = isDestinationAddressCommercial;
  }


  public RateRequest items(List<RateRequestItem> items) {
    
    this.items = items;
    return this;
  }

  public RateRequest addItemsItem(RateRequestItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RateRequestItem> getItems() {
    return items;
  }


  public void setItems(List<RateRequestItem> items) {
    this.items = items;
  }


  public RateRequest estimatedShipmentDate(OffsetDateTime estimatedShipmentDate) {
    
    this.estimatedShipmentDate = estimatedShipmentDate;
    return this;
  }

   /**
   * Estimate Date/Time when the shipment for this will be sent.  Primarily utilize to estimate delivery date.
   * @return estimatedShipmentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Estimate Date/Time when the shipment for this will be sent.  Primarily utilize to estimate delivery date.")

  public OffsetDateTime getEstimatedShipmentDate() {
    return estimatedShipmentDate;
  }


  public void setEstimatedShipmentDate(OffsetDateTime estimatedShipmentDate) {
    this.estimatedShipmentDate = estimatedShipmentDate;
  }


  public RateRequest attributes(List<RateRequestAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public RateRequest addAttributesItem(RateRequestAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Order Attributes. Made available for Arc.js to use
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order Attributes. Made available for Arc.js to use")

  public List<RateRequestAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<RateRequestAttribute> attributes) {
    this.attributes = attributes;
  }


  public RateRequest customAttributes(List<CustomAttribute> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public RateRequest addCustomAttributesItem(CustomAttribute customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Get customAttributes
   * @return customAttributes
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
  }


  public RateRequest data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateRequest rateRequest = (RateRequest) o;
    return Objects.equals(this.id, rateRequest.id) &&
        Objects.equals(this.isoCurrencyCode, rateRequest.isoCurrencyCode) &&
        Objects.equals(this.originAddress, rateRequest.originAddress) &&
        Objects.equals(this.destinationAddress, rateRequest.destinationAddress) &&
        Objects.equals(this.carrierIds, rateRequest.carrierIds) &&
        Objects.equals(this.shippingServiceTypes, rateRequest.shippingServiceTypes) &&
        Objects.equals(this.orderTotal, rateRequest.orderTotal) &&
        Objects.equals(this.orderDiscountedSubTotal, rateRequest.orderDiscountedSubTotal) &&
        Objects.equals(this.handlingTotal, rateRequest.handlingTotal) &&
        Objects.equals(this.relatedOrderId, rateRequest.relatedOrderId) &&
        Objects.equals(this.relatedOrderNumber, rateRequest.relatedOrderNumber) &&
        Objects.equals(this.isDestinationAddressCommercial, rateRequest.isDestinationAddressCommercial) &&
        Objects.equals(this.items, rateRequest.items) &&
        Objects.equals(this.estimatedShipmentDate, rateRequest.estimatedShipmentDate) &&
        Objects.equals(this.attributes, rateRequest.attributes) &&
        Objects.equals(this.customAttributes, rateRequest.customAttributes) &&
        Objects.equals(this.data, rateRequest.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isoCurrencyCode, originAddress, destinationAddress, carrierIds, shippingServiceTypes, orderTotal, orderDiscountedSubTotal, handlingTotal, relatedOrderId, relatedOrderNumber, isDestinationAddressCommercial, items, estimatedShipmentDate, attributes, customAttributes, data);
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
    sb.append("class RateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    originAddress: ").append(toIndentedString(originAddress)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    shippingServiceTypes: ").append(toIndentedString(shippingServiceTypes)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    orderDiscountedSubTotal: ").append(toIndentedString(orderDiscountedSubTotal)).append("\n");
    sb.append("    handlingTotal: ").append(toIndentedString(handlingTotal)).append("\n");
    sb.append("    relatedOrderId: ").append(toIndentedString(relatedOrderId)).append("\n");
    sb.append("    relatedOrderNumber: ").append(toIndentedString(relatedOrderNumber)).append("\n");
    sb.append("    isDestinationAddressCommercial: ").append(toIndentedString(isDestinationAddressCommercial)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    estimatedShipmentDate: ").append(toIndentedString(estimatedShipmentDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("isoCurrencyCode");
    openapiFields.add("originAddress");
    openapiFields.add("destinationAddress");
    openapiFields.add("carrierIds");
    openapiFields.add("shippingServiceTypes");
    openapiFields.add("orderTotal");
    openapiFields.add("orderDiscountedSubTotal");
    openapiFields.add("handlingTotal");
    openapiFields.add("relatedOrderId");
    openapiFields.add("relatedOrderNumber");
    openapiFields.add("isDestinationAddressCommercial");
    openapiFields.add("items");
    openapiFields.add("estimatedShipmentDate");
    openapiFields.add("attributes");
    openapiFields.add("customAttributes");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateRequest is not found in the empty JSON string", RateRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!RateRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("isoCurrencyCode") != null && !jsonObj.get("isoCurrencyCode").isJsonNull()) && !jsonObj.get("isoCurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isoCurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isoCurrencyCode").toString()));
      }
      // validate the optional field `originAddress`
      if (jsonObj.get("originAddress") != null && !jsonObj.get("originAddress").isJsonNull()) {
        CommerceRuntimeAddress.validateJsonObject(jsonObj.getAsJsonObject("originAddress"));
      }
      // validate the optional field `destinationAddress`
      if (jsonObj.get("destinationAddress") != null && !jsonObj.get("destinationAddress").isJsonNull()) {
        CommerceRuntimeAddress.validateJsonObject(jsonObj.getAsJsonObject("destinationAddress"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("carrierIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierIds` to be an array in the JSON string but got `%s`", jsonObj.get("carrierIds").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shippingServiceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingServiceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("shippingServiceTypes").toString()));
      }
      if ((jsonObj.get("relatedOrderId") != null && !jsonObj.get("relatedOrderId").isJsonNull()) && !jsonObj.get("relatedOrderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedOrderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relatedOrderId").toString()));
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
            RateRequestItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            RateRequestAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("customAttributes") != null && !jsonObj.get("customAttributes").isJsonNull()) {
        JsonArray jsonArraycustomAttributes = jsonObj.getAsJsonArray("customAttributes");
        if (jsonArraycustomAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("customAttributes").toString()));
          }

          // validate the optional field `customAttributes` (array)
          for (int i = 0; i < jsonArraycustomAttributes.size(); i++) {
            CustomAttribute.validateJsonObject(jsonArraycustomAttributes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RateRequest>() {
           @Override
           public void write(JsonWriter out, RateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateRequest
  * @throws IOException if the JSON string is invalid with respect to RateRequest
  */
  public static RateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateRequest.class);
  }

 /**
  * Convert an instance of RateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

