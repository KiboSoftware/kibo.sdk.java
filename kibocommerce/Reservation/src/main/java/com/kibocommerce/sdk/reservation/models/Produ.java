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
import com.kibocommerce.sdk.reservation.models.BundledProdu;
import com.kibocommerce.sdk.reservation.models.ReservationWebAPIPackageMeasurements;
import com.kibocommerce.sdk.reservation.models.ReservationWebAPIProductProperty;
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
 * Produ
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Produ implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "productType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType;

  public static final String SERIALIZED_NAME_MFG_PART_NUMBER = "mfgPartNumber";
  @SerializedName(SERIALIZED_NAME_MFG_PART_NUMBER)
  private String mfgPartNumber;

  public static final String SERIALIZED_NAME_VARIATION_PRODUCT_CODE = "variationProductCode";
  @SerializedName(SERIALIZED_NAME_VARIATION_PRODUCT_CODE)
  private String variationProductCode;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goodsType";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_PRODUCT_USAGE = "productUsage";
  @SerializedName(SERIALIZED_NAME_PRODUCT_USAGE)
  private String productUsage;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCTS = "bundledProducts";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCTS)
  private List<BundledProdu> bundledProducts = null;

  public static final String SERIALIZED_NAME_IS_SPLIT_EXTRAS_IN_SHIPMENT = "isSplitExtrasInShipment";
  @SerializedName(SERIALIZED_NAME_IS_SPLIT_EXTRAS_IN_SHIPMENT)
  private Boolean isSplitExtrasInShipment;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<ReservationWebAPIProductProperty> properties = null;

  public static final String SERIALIZED_NAME_MEASUREMENTS = "measurements";
  @SerializedName(SERIALIZED_NAME_MEASUREMENTS)
  private ReservationWebAPIPackageMeasurements measurements;

  public static final String SERIALIZED_NAME_IS_TAXABLE = "isTaxable";
  @SerializedName(SERIALIZED_NAME_IS_TAXABLE)
  private Boolean isTaxable;

  public Produ() {
  }

  public Produ productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public Produ name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Produ productType(String productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductType() {
    return productType;
  }


  public void setProductType(String productType) {
    this.productType = productType;
  }


  public Produ mfgPartNumber(String mfgPartNumber) {
    
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


  public Produ variationProductCode(String variationProductCode) {
    
    this.variationProductCode = variationProductCode;
    return this;
  }

   /**
   * Get variationProductCode
   * @return variationProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariationProductCode() {
    return variationProductCode;
  }


  public void setVariationProductCode(String variationProductCode) {
    this.variationProductCode = variationProductCode;
  }


  public Produ sku(String sku) {
    
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


  public Produ goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * Get goodsType
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public Produ productUsage(String productUsage) {
    
    this.productUsage = productUsage;
    return this;
  }

   /**
   * Get productUsage
   * @return productUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductUsage() {
    return productUsage;
  }


  public void setProductUsage(String productUsage) {
    this.productUsage = productUsage;
  }


  public Produ bundledProducts(List<BundledProdu> bundledProducts) {
    
    this.bundledProducts = bundledProducts;
    return this;
  }

  public Produ addBundledProductsItem(BundledProdu bundledProductsItem) {
    if (this.bundledProducts == null) {
      this.bundledProducts = new ArrayList<>();
    }
    this.bundledProducts.add(bundledProductsItem);
    return this;
  }

   /**
   * Get bundledProducts
   * @return bundledProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BundledProdu> getBundledProducts() {
    return bundledProducts;
  }


  public void setBundledProducts(List<BundledProdu> bundledProducts) {
    this.bundledProducts = bundledProducts;
  }


  public Produ isSplitExtrasInShipment(Boolean isSplitExtrasInShipment) {
    
    this.isSplitExtrasInShipment = isSplitExtrasInShipment;
    return this;
  }

   /**
   * Get isSplitExtrasInShipment
   * @return isSplitExtrasInShipment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSplitExtrasInShipment() {
    return isSplitExtrasInShipment;
  }


  public void setIsSplitExtrasInShipment(Boolean isSplitExtrasInShipment) {
    this.isSplitExtrasInShipment = isSplitExtrasInShipment;
  }


  public Produ properties(List<ReservationWebAPIProductProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public Produ addPropertiesItem(ReservationWebAPIProductProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReservationWebAPIProductProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<ReservationWebAPIProductProperty> properties) {
    this.properties = properties;
  }


  public Produ measurements(ReservationWebAPIPackageMeasurements measurements) {
    
    this.measurements = measurements;
    return this;
  }

   /**
   * Get measurements
   * @return measurements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReservationWebAPIPackageMeasurements getMeasurements() {
    return measurements;
  }


  public void setMeasurements(ReservationWebAPIPackageMeasurements measurements) {
    this.measurements = measurements;
  }


  public Produ isTaxable(Boolean isTaxable) {
    
    this.isTaxable = isTaxable;
    return this;
  }

   /**
   * Get isTaxable
   * @return isTaxable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTaxable() {
    return isTaxable;
  }


  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Produ produ = (Produ) o;
    return Objects.equals(this.productCode, produ.productCode) &&
        Objects.equals(this.name, produ.name) &&
        Objects.equals(this.productType, produ.productType) &&
        Objects.equals(this.mfgPartNumber, produ.mfgPartNumber) &&
        Objects.equals(this.variationProductCode, produ.variationProductCode) &&
        Objects.equals(this.sku, produ.sku) &&
        Objects.equals(this.goodsType, produ.goodsType) &&
        Objects.equals(this.productUsage, produ.productUsage) &&
        Objects.equals(this.bundledProducts, produ.bundledProducts) &&
        Objects.equals(this.isSplitExtrasInShipment, produ.isSplitExtrasInShipment) &&
        Objects.equals(this.properties, produ.properties) &&
        Objects.equals(this.measurements, produ.measurements) &&
        Objects.equals(this.isTaxable, produ.isTaxable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, name, productType, mfgPartNumber, variationProductCode, sku, goodsType, productUsage, bundledProducts, isSplitExtrasInShipment, properties, measurements, isTaxable);
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
    sb.append("class Produ {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    mfgPartNumber: ").append(toIndentedString(mfgPartNumber)).append("\n");
    sb.append("    variationProductCode: ").append(toIndentedString(variationProductCode)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    productUsage: ").append(toIndentedString(productUsage)).append("\n");
    sb.append("    bundledProducts: ").append(toIndentedString(bundledProducts)).append("\n");
    sb.append("    isSplitExtrasInShipment: ").append(toIndentedString(isSplitExtrasInShipment)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("productType");
    openapiFields.add("mfgPartNumber");
    openapiFields.add("variationProductCode");
    openapiFields.add("sku");
    openapiFields.add("goodsType");
    openapiFields.add("productUsage");
    openapiFields.add("bundledProducts");
    openapiFields.add("isSplitExtrasInShipment");
    openapiFields.add("properties");
    openapiFields.add("measurements");
    openapiFields.add("isTaxable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Produ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Produ.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Produ is not found in the empty JSON string", Produ.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Produ.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Produ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("productType") != null && !jsonObj.get("productType").isJsonNull()) && !jsonObj.get("productType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productType").toString()));
      }
      if ((jsonObj.get("mfgPartNumber") != null && !jsonObj.get("mfgPartNumber").isJsonNull()) && !jsonObj.get("mfgPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfgPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfgPartNumber").toString()));
      }
      if ((jsonObj.get("variationProductCode") != null && !jsonObj.get("variationProductCode").isJsonNull()) && !jsonObj.get("variationProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variationProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variationProductCode").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("goodsType") != null && !jsonObj.get("goodsType").isJsonNull()) && !jsonObj.get("goodsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goodsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goodsType").toString()));
      }
      if ((jsonObj.get("productUsage") != null && !jsonObj.get("productUsage").isJsonNull()) && !jsonObj.get("productUsage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productUsage").toString()));
      }
      if (jsonObj.get("bundledProducts") != null && !jsonObj.get("bundledProducts").isJsonNull()) {
        JsonArray jsonArraybundledProducts = jsonObj.getAsJsonArray("bundledProducts");
        if (jsonArraybundledProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bundledProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bundledProducts` to be an array in the JSON string but got `%s`", jsonObj.get("bundledProducts").toString()));
          }

          // validate the optional field `bundledProducts` (array)
          for (int i = 0; i < jsonArraybundledProducts.size(); i++) {
            BundledProdu.validateJsonObject(jsonArraybundledProducts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            ReservationWebAPIProductProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `measurements`
      if (jsonObj.get("measurements") != null && !jsonObj.get("measurements").isJsonNull()) {
        ReservationWebAPIPackageMeasurements.validateJsonObject(jsonObj.getAsJsonObject("measurements"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Produ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Produ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Produ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Produ.class));

       return (TypeAdapter<T>) new TypeAdapter<Produ>() {
           @Override
           public void write(JsonWriter out, Produ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Produ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Produ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Produ
  * @throws IOException if the JSON string is invalid with respect to Produ
  */
  public static Produ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Produ.class);
  }

 /**
  * Convert an instance of Produ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

