/*
 * Kibo PricingRuntime Service
 * OpenAPI Spec for Kibo PricingRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.pricingstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.pricingstorefront.models.CommerceRuntimeAddress;
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
 * The context for the tax calculation.
 */
@ApiModel(description = "The context for the tax calculation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThrirdPartyTaxContext implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TAX_CONTEXT_ID = "taxContextId";
  @SerializedName(SERIALIZED_NAME_TAX_CONTEXT_ID)
  private String taxContextId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TAX_EXEMPT_ID = "taxExemptId";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT_ID)
  private String taxExemptId;

  public static final String SERIALIZED_NAME_TAX_SHIPPING = "taxShipping";
  @SerializedName(SERIALIZED_NAME_TAX_SHIPPING)
  private Boolean taxShipping;

  public static final String SERIALIZED_NAME_ORIGIN_ADDRESS = "originAddress";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ADDRESS)
  private CommerceRuntimeAddress originAddress;

  public static final String SERIALIZED_NAME_DESTINATION_ADDRESS = "destinationAddress";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ADDRESS)
  private CommerceRuntimeAddress destinationAddress;

  public ThrirdPartyTaxContext() {
  }

  public ThrirdPartyTaxContext taxContextId(String taxContextId) {
    
    this.taxContextId = taxContextId;
    return this;
  }

   /**
   * The unique id of this context. Will typically be the OrderId or CartId, depending when the tax is being calculated.
   * @return taxContextId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique id of this context. Will typically be the OrderId or CartId, depending when the tax is being calculated.")

  public String getTaxContextId() {
    return taxContextId;
  }


  public void setTaxContextId(String taxContextId) {
    this.taxContextId = taxContextId;
  }


  public ThrirdPartyTaxContext customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A unique id for a customer.  This may be the userid, checking with Avalara to determine the meaning of this
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique id for a customer.  This may be the userid, checking with Avalara to determine the meaning of this")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ThrirdPartyTaxContext taxExemptId(String taxExemptId) {
    
    this.taxExemptId = taxExemptId;
    return this;
  }

   /**
   * Tax exemption id.  Indicates that this customer or user is tax exempt
   * @return taxExemptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax exemption id.  Indicates that this customer or user is tax exempt")

  public String getTaxExemptId() {
    return taxExemptId;
  }


  public void setTaxExemptId(String taxExemptId) {
    this.taxExemptId = taxExemptId;
  }


  public ThrirdPartyTaxContext taxShipping(Boolean taxShipping) {
    
    this.taxShipping = taxShipping;
    return this;
  }

   /**
   * Indicates whether shipping amounts should be taxed
   * @return taxShipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether shipping amounts should be taxed")

  public Boolean getTaxShipping() {
    return taxShipping;
  }


  public void setTaxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
  }


  public ThrirdPartyTaxContext originAddress(CommerceRuntimeAddress originAddress) {
    
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


  public ThrirdPartyTaxContext destinationAddress(CommerceRuntimeAddress destinationAddress) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrirdPartyTaxContext thrirdPartyTaxContext = (ThrirdPartyTaxContext) o;
    return Objects.equals(this.taxContextId, thrirdPartyTaxContext.taxContextId) &&
        Objects.equals(this.customerId, thrirdPartyTaxContext.customerId) &&
        Objects.equals(this.taxExemptId, thrirdPartyTaxContext.taxExemptId) &&
        Objects.equals(this.taxShipping, thrirdPartyTaxContext.taxShipping) &&
        Objects.equals(this.originAddress, thrirdPartyTaxContext.originAddress) &&
        Objects.equals(this.destinationAddress, thrirdPartyTaxContext.destinationAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxContextId, customerId, taxExemptId, taxShipping, originAddress, destinationAddress);
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
    sb.append("class ThrirdPartyTaxContext {\n");
    sb.append("    taxContextId: ").append(toIndentedString(taxContextId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    taxExemptId: ").append(toIndentedString(taxExemptId)).append("\n");
    sb.append("    taxShipping: ").append(toIndentedString(taxShipping)).append("\n");
    sb.append("    originAddress: ").append(toIndentedString(originAddress)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
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
    openapiFields.add("taxContextId");
    openapiFields.add("customerId");
    openapiFields.add("taxExemptId");
    openapiFields.add("taxShipping");
    openapiFields.add("originAddress");
    openapiFields.add("destinationAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThrirdPartyTaxContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThrirdPartyTaxContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThrirdPartyTaxContext is not found in the empty JSON string", ThrirdPartyTaxContext.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ThrirdPartyTaxContext.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThrirdPartyTaxContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("taxContextId") != null && !jsonObj.get("taxContextId").isJsonNull()) && !jsonObj.get("taxContextId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxContextId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxContextId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("taxExemptId") != null && !jsonObj.get("taxExemptId").isJsonNull()) && !jsonObj.get("taxExemptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxExemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxExemptId").toString()));
      }
      // validate the optional field `originAddress`
      if (jsonObj.get("originAddress") != null && !jsonObj.get("originAddress").isJsonNull()) {
        CommerceRuntimeAddress.validateJsonObject(jsonObj.getAsJsonObject("originAddress"));
      }
      // validate the optional field `destinationAddress`
      if (jsonObj.get("destinationAddress") != null && !jsonObj.get("destinationAddress").isJsonNull()) {
        CommerceRuntimeAddress.validateJsonObject(jsonObj.getAsJsonObject("destinationAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThrirdPartyTaxContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThrirdPartyTaxContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThrirdPartyTaxContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThrirdPartyTaxContext.class));

       return (TypeAdapter<T>) new TypeAdapter<ThrirdPartyTaxContext>() {
           @Override
           public void write(JsonWriter out, ThrirdPartyTaxContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThrirdPartyTaxContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThrirdPartyTaxContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThrirdPartyTaxContext
  * @throws IOException if the JSON string is invalid with respect to ThrirdPartyTaxContext
  */
  public static ThrirdPartyTaxContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThrirdPartyTaxContext.class);
  }

 /**
  * Convert an instance of ThrirdPartyTaxContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

