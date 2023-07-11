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
import com.kibocommerce.sdk.commerce.models.CommerceRuntimeFulfillmentField;
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
 * OrderReturnableItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderReturnableItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_ITEM_ID = "shipmentItemId";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_ITEM_ID)
  private Integer shipmentItemId;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_FULFILLED = "quantityFulfilled";
  @SerializedName(SERIALIZED_NAME_QUANTITY_FULFILLED)
  private Integer quantityFulfilled;

  public static final String SERIALIZED_NAME_QUANTITY_RETURNED = "quantityReturned";
  @SerializedName(SERIALIZED_NAME_QUANTITY_RETURNED)
  private Integer quantityReturned;

  public static final String SERIALIZED_NAME_QUANTITY_REJECTED = "quantityRejected";
  @SerializedName(SERIALIZED_NAME_QUANTITY_REJECTED)
  private Integer quantityRejected;

  public static final String SERIALIZED_NAME_QUANTITY_RETURNABLE = "quantityReturnable";
  @SerializedName(SERIALIZED_NAME_QUANTITY_RETURNABLE)
  private Integer quantityReturnable;

  public static final String SERIALIZED_NAME_FULFILLMENT_STATUS = "fulfillmentStatus";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_STATUS)
  private String fulfillmentStatus;

  public static final String SERIALIZED_NAME_ORDER_ITEM_ID = "orderItemId";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_ID)
  private String orderItemId;

  public static final String SERIALIZED_NAME_ORDER_LINE_ID = "orderLineId";
  @SerializedName(SERIALIZED_NAME_ORDER_LINE_ID)
  private Integer orderLineId;

  public static final String SERIALIZED_NAME_ORDER_ITEM_OPTION_ATTRIBUTE_F_Q_N = "orderItemOptionAttributeFQN";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_OPTION_ATTRIBUTE_F_Q_N)
  private String orderItemOptionAttributeFQN;

  public static final String SERIALIZED_NAME_UNIT_QUANTITY = "unitQuantity";
  @SerializedName(SERIALIZED_NAME_UNIT_QUANTITY)
  private Integer unitQuantity;

  public static final String SERIALIZED_NAME_PARENT_PRODUCT_CODE = "parentProductCode";
  @SerializedName(SERIALIZED_NAME_PARENT_PRODUCT_CODE)
  private String parentProductCode;

  public static final String SERIALIZED_NAME_PARENT_PRODUCT_NAME = "parentProductName";
  @SerializedName(SERIALIZED_NAME_PARENT_PRODUCT_NAME)
  private String parentProductName;

  public static final String SERIALIZED_NAME_FULFILLMENT_FIELDS = "fulfillmentFields";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_FIELDS)
  private List<CommerceRuntimeFulfillmentField> fulfillmentFields = null;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_MFG_PART_NUMBER = "mfgPartNumber";
  @SerializedName(SERIALIZED_NAME_MFG_PART_NUMBER)
  private String mfgPartNumber;

  public OrderReturnableItem() {
  }

  
  public OrderReturnableItem(
     Integer quantityReturnable
  ) {
    this();
    this.quantityReturnable = quantityReturnable;
  }

  public OrderReturnableItem productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * The product code of the associated item.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product code of the associated item.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public OrderReturnableItem productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * The name of the associated product.
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the associated product.")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public OrderReturnableItem shipmentNumber(Integer shipmentNumber) {
    
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Shipment Number associated with product
   * @return shipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipment Number associated with product")

  public Integer getShipmentNumber() {
    return shipmentNumber;
  }


  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  public OrderReturnableItem shipmentItemId(Integer shipmentItemId) {
    
    this.shipmentItemId = shipmentItemId;
    return this;
  }

   /**
   * Shipment Item Id Number associated with product
   * @return shipmentItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipment Item Id Number associated with product")

  public Integer getShipmentItemId() {
    return shipmentItemId;
  }


  public void setShipmentItemId(Integer shipmentItemId) {
    this.shipmentItemId = shipmentItemId;
  }


  public OrderReturnableItem quantityOrdered(Integer quantityOrdered) {
    
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The number of units ordered.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of units ordered.")

  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }


  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderReturnableItem quantityFulfilled(Integer quantityFulfilled) {
    
    this.quantityFulfilled = quantityFulfilled;
    return this;
  }

   /**
   * The number of units fulfilled.
   * @return quantityFulfilled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of units fulfilled.")

  public Integer getQuantityFulfilled() {
    return quantityFulfilled;
  }


  public void setQuantityFulfilled(Integer quantityFulfilled) {
    this.quantityFulfilled = quantityFulfilled;
  }


  public OrderReturnableItem quantityReturned(Integer quantityReturned) {
    
    this.quantityReturned = quantityReturned;
    return this;
  }

   /**
   * The number if times this item configuration was found in live returns (not cancelled or rejected).
   * @return quantityReturned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number if times this item configuration was found in live returns (not cancelled or rejected).")

  public Integer getQuantityReturned() {
    return quantityReturned;
  }


  public void setQuantityReturned(Integer quantityReturned) {
    this.quantityReturned = quantityReturned;
  }


  public OrderReturnableItem quantityRejected(Integer quantityRejected) {
    
    this.quantityRejected = quantityRejected;
    return this;
  }

   /**
   * Get quantityRejected
   * @return quantityRejected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantityRejected() {
    return quantityRejected;
  }


  public void setQuantityRejected(Integer quantityRejected) {
    this.quantityRejected = quantityRejected;
  }


   /**
   * Get quantityReturnable
   * @return quantityReturnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantityReturnable() {
    return quantityReturnable;
  }




  public OrderReturnableItem fulfillmentStatus(String fulfillmentStatus) {
    
    this.fulfillmentStatus = fulfillmentStatus;
    return this;
  }

   /**
   * Get fulfillmentStatus
   * @return fulfillmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }


  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
  }


  public OrderReturnableItem orderItemId(String orderItemId) {
    
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderItemId() {
    return orderItemId;
  }


  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  public OrderReturnableItem orderLineId(Integer orderLineId) {
    
    this.orderLineId = orderLineId;
    return this;
  }

   /**
   * Get orderLineId
   * @return orderLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderLineId() {
    return orderLineId;
  }


  public void setOrderLineId(Integer orderLineId) {
    this.orderLineId = orderLineId;
  }


  public OrderReturnableItem orderItemOptionAttributeFQN(String orderItemOptionAttributeFQN) {
    
    this.orderItemOptionAttributeFQN = orderItemOptionAttributeFQN;
    return this;
  }

   /**
   * Get orderItemOptionAttributeFQN
   * @return orderItemOptionAttributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderItemOptionAttributeFQN() {
    return orderItemOptionAttributeFQN;
  }


  public void setOrderItemOptionAttributeFQN(String orderItemOptionAttributeFQN) {
    this.orderItemOptionAttributeFQN = orderItemOptionAttributeFQN;
  }


  public OrderReturnableItem unitQuantity(Integer unitQuantity) {
    
    this.unitQuantity = unitQuantity;
    return this;
  }

   /**
   * Get unitQuantity
   * @return unitQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnitQuantity() {
    return unitQuantity;
  }


  public void setUnitQuantity(Integer unitQuantity) {
    this.unitQuantity = unitQuantity;
  }


  public OrderReturnableItem parentProductCode(String parentProductCode) {
    
    this.parentProductCode = parentProductCode;
    return this;
  }

   /**
   * Get parentProductCode
   * @return parentProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentProductCode() {
    return parentProductCode;
  }


  public void setParentProductCode(String parentProductCode) {
    this.parentProductCode = parentProductCode;
  }


  public OrderReturnableItem parentProductName(String parentProductName) {
    
    this.parentProductName = parentProductName;
    return this;
  }

   /**
   * Get parentProductName
   * @return parentProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentProductName() {
    return parentProductName;
  }


  public void setParentProductName(String parentProductName) {
    this.parentProductName = parentProductName;
  }


  public OrderReturnableItem fulfillmentFields(List<CommerceRuntimeFulfillmentField> fulfillmentFields) {
    
    this.fulfillmentFields = fulfillmentFields;
    return this;
  }

  public OrderReturnableItem addFulfillmentFieldsItem(CommerceRuntimeFulfillmentField fulfillmentFieldsItem) {
    if (this.fulfillmentFields == null) {
      this.fulfillmentFields = new ArrayList<>();
    }
    this.fulfillmentFields.add(fulfillmentFieldsItem);
    return this;
  }

   /**
   * List of unique product identifiers for an item on shipment
   * @return fulfillmentFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of unique product identifiers for an item on shipment")

  public List<CommerceRuntimeFulfillmentField> getFulfillmentFields() {
    return fulfillmentFields;
  }


  public void setFulfillmentFields(List<CommerceRuntimeFulfillmentField> fulfillmentFields) {
    this.fulfillmentFields = fulfillmentFields;
  }


  public OrderReturnableItem sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public OrderReturnableItem mfgPartNumber(String mfgPartNumber) {
    
    this.mfgPartNumber = mfgPartNumber;
    return this;
  }

   /**
   * Get mfgPartNumber
   * @return mfgPartNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMfgPartNumber() {
    return mfgPartNumber;
  }


  public void setMfgPartNumber(String mfgPartNumber) {
    this.mfgPartNumber = mfgPartNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnableItem orderReturnableItem = (OrderReturnableItem) o;
    return Objects.equals(this.productCode, orderReturnableItem.productCode) &&
        Objects.equals(this.productName, orderReturnableItem.productName) &&
        Objects.equals(this.shipmentNumber, orderReturnableItem.shipmentNumber) &&
        Objects.equals(this.shipmentItemId, orderReturnableItem.shipmentItemId) &&
        Objects.equals(this.quantityOrdered, orderReturnableItem.quantityOrdered) &&
        Objects.equals(this.quantityFulfilled, orderReturnableItem.quantityFulfilled) &&
        Objects.equals(this.quantityReturned, orderReturnableItem.quantityReturned) &&
        Objects.equals(this.quantityRejected, orderReturnableItem.quantityRejected) &&
        Objects.equals(this.quantityReturnable, orderReturnableItem.quantityReturnable) &&
        Objects.equals(this.fulfillmentStatus, orderReturnableItem.fulfillmentStatus) &&
        Objects.equals(this.orderItemId, orderReturnableItem.orderItemId) &&
        Objects.equals(this.orderLineId, orderReturnableItem.orderLineId) &&
        Objects.equals(this.orderItemOptionAttributeFQN, orderReturnableItem.orderItemOptionAttributeFQN) &&
        Objects.equals(this.unitQuantity, orderReturnableItem.unitQuantity) &&
        Objects.equals(this.parentProductCode, orderReturnableItem.parentProductCode) &&
        Objects.equals(this.parentProductName, orderReturnableItem.parentProductName) &&
        Objects.equals(this.fulfillmentFields, orderReturnableItem.fulfillmentFields) &&
        Objects.equals(this.sku, orderReturnableItem.sku) &&
        Objects.equals(this.mfgPartNumber, orderReturnableItem.mfgPartNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productName, shipmentNumber, shipmentItemId, quantityOrdered, quantityFulfilled, quantityReturned, quantityRejected, quantityReturnable, fulfillmentStatus, orderItemId, orderLineId, orderItemOptionAttributeFQN, unitQuantity, parentProductCode, parentProductName, fulfillmentFields, sku, mfgPartNumber);
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
    sb.append("class OrderReturnableItem {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    shipmentItemId: ").append(toIndentedString(shipmentItemId)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityFulfilled: ").append(toIndentedString(quantityFulfilled)).append("\n");
    sb.append("    quantityReturned: ").append(toIndentedString(quantityReturned)).append("\n");
    sb.append("    quantityRejected: ").append(toIndentedString(quantityRejected)).append("\n");
    sb.append("    quantityReturnable: ").append(toIndentedString(quantityReturnable)).append("\n");
    sb.append("    fulfillmentStatus: ").append(toIndentedString(fulfillmentStatus)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    orderItemOptionAttributeFQN: ").append(toIndentedString(orderItemOptionAttributeFQN)).append("\n");
    sb.append("    unitQuantity: ").append(toIndentedString(unitQuantity)).append("\n");
    sb.append("    parentProductCode: ").append(toIndentedString(parentProductCode)).append("\n");
    sb.append("    parentProductName: ").append(toIndentedString(parentProductName)).append("\n");
    sb.append("    fulfillmentFields: ").append(toIndentedString(fulfillmentFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    mfgPartNumber: ").append(toIndentedString(mfgPartNumber)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("productName");
    openapiFields.add("shipmentNumber");
    openapiFields.add("shipmentItemId");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityFulfilled");
    openapiFields.add("quantityReturned");
    openapiFields.add("quantityRejected");
    openapiFields.add("quantityReturnable");
    openapiFields.add("fulfillmentStatus");
    openapiFields.add("orderItemId");
    openapiFields.add("orderLineId");
    openapiFields.add("orderItemOptionAttributeFQN");
    openapiFields.add("unitQuantity");
    openapiFields.add("parentProductCode");
    openapiFields.add("parentProductName");
    openapiFields.add("fulfillmentFields");
    openapiFields.add("sku");
    openapiFields.add("mfgPartNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderReturnableItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderReturnableItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderReturnableItem is not found in the empty JSON string", OrderReturnableItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!OrderReturnableItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderReturnableItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if ((jsonObj.get("fulfillmentStatus") != null && !jsonObj.get("fulfillmentStatus").isJsonNull()) && !jsonObj.get("fulfillmentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentStatus").toString()));
      }
      if ((jsonObj.get("orderItemId") != null && !jsonObj.get("orderItemId").isJsonNull()) && !jsonObj.get("orderItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderItemId").toString()));
      }
      if ((jsonObj.get("orderItemOptionAttributeFQN") != null && !jsonObj.get("orderItemOptionAttributeFQN").isJsonNull()) && !jsonObj.get("orderItemOptionAttributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderItemOptionAttributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderItemOptionAttributeFQN").toString()));
      }
      if ((jsonObj.get("parentProductCode") != null && !jsonObj.get("parentProductCode").isJsonNull()) && !jsonObj.get("parentProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentProductCode").toString()));
      }
      if ((jsonObj.get("parentProductName") != null && !jsonObj.get("parentProductName").isJsonNull()) && !jsonObj.get("parentProductName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentProductName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentProductName").toString()));
      }
      if (jsonObj.get("fulfillmentFields") != null && !jsonObj.get("fulfillmentFields").isJsonNull()) {
        JsonArray jsonArrayfulfillmentFields = jsonObj.getAsJsonArray("fulfillmentFields");
        if (jsonArrayfulfillmentFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fulfillmentFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fulfillmentFields` to be an array in the JSON string but got `%s`", jsonObj.get("fulfillmentFields").toString()));
          }

          // validate the optional field `fulfillmentFields` (array)
          for (int i = 0; i < jsonArrayfulfillmentFields.size(); i++) {
            CommerceRuntimeFulfillmentField.validateJsonObject(jsonArrayfulfillmentFields.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("mfgPartNumber") != null && !jsonObj.get("mfgPartNumber").isJsonNull()) && !jsonObj.get("mfgPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfgPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfgPartNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderReturnableItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderReturnableItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderReturnableItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderReturnableItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderReturnableItem>() {
           @Override
           public void write(JsonWriter out, OrderReturnableItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderReturnableItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderReturnableItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderReturnableItem
  * @throws IOException if the JSON string is invalid with respect to OrderReturnableItem
  */
  public static OrderReturnableItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderReturnableItem.class);
  }

 /**
  * Convert an instance of OrderReturnableItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

