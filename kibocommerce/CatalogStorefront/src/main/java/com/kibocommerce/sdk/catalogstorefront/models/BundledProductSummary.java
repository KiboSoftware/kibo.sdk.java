/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesPackageMeasurements;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesProductInventoryInfo;
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
 * BundledProductSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BundledProductSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_SHORT_DESCRIPTION = "productShortDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SHORT_DESCRIPTION)
  private String productShortDescription;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goodsType";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_MEASUREMENTS = "measurements";
  @SerializedName(SERIALIZED_NAME_MEASUREMENTS)
  private CatalogRuntimesPackageMeasurements measurements;

  public static final String SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE = "isPackagedStandAlone";
  @SerializedName(SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE)
  private Boolean isPackagedStandAlone;

  public static final String SERIALIZED_NAME_INVENTORY_INFO = "inventoryInfo";
  @SerializedName(SERIALIZED_NAME_INVENTORY_INFO)
  private CatalogRuntimesProductInventoryInfo inventoryInfo;

  public static final String SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N = "optionAttributeFQN";
  @SerializedName(SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N)
  private String optionAttributeFQN;

  public static final String SERIALIZED_NAME_OPTION_VALUE = "optionValue";
  @SerializedName(SERIALIZED_NAME_OPTION_VALUE)
  private Object optionValue = null;

  public static final String SERIALIZED_NAME_CREDIT_VALUE = "creditValue";
  @SerializedName(SERIALIZED_NAME_CREDIT_VALUE)
  private Double creditValue;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "productType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType;

  public BundledProductSummary() {
  }

  public BundledProductSummary productShortDescription(String productShortDescription) {
    
    this.productShortDescription = productShortDescription;
    return this;
  }

   /**
   * Get productShortDescription
   * @return productShortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductShortDescription() {
    return productShortDescription;
  }


  public void setProductShortDescription(String productShortDescription) {
    this.productShortDescription = productShortDescription;
  }


  public BundledProductSummary productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public BundledProductSummary productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant-created code associated with the product, for example, a SKU.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant-created code associated with the product, for example, a SKU.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public BundledProductSummary goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * The GoodsType of this product (Physical, Digital, DigitalCredit)
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GoodsType of this product (Physical, Digital, DigitalCredit)")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public BundledProductSummary quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the bundled product
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity of the bundled product")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public BundledProductSummary measurements(CatalogRuntimesPackageMeasurements measurements) {
    
    this.measurements = measurements;
    return this;
  }

   /**
   * Get measurements
   * @return measurements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesPackageMeasurements getMeasurements() {
    return measurements;
  }


  public void setMeasurements(CatalogRuntimesPackageMeasurements measurements) {
    this.measurements = measurements;
  }


  public BundledProductSummary isPackagedStandAlone(Boolean isPackagedStandAlone) {
    
    this.isPackagedStandAlone = isPackagedStandAlone;
    return this;
  }

   /**
   * Is this product shipped in its own package
   * @return isPackagedStandAlone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is this product shipped in its own package")

  public Boolean getIsPackagedStandAlone() {
    return isPackagedStandAlone;
  }


  public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
    this.isPackagedStandAlone = isPackagedStandAlone;
  }


  public BundledProductSummary inventoryInfo(CatalogRuntimesProductInventoryInfo inventoryInfo) {
    
    this.inventoryInfo = inventoryInfo;
    return this;
  }

   /**
   * Get inventoryInfo
   * @return inventoryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesProductInventoryInfo getInventoryInfo() {
    return inventoryInfo;
  }


  public void setInventoryInfo(CatalogRuntimesProductInventoryInfo inventoryInfo) {
    this.inventoryInfo = inventoryInfo;
  }


  public BundledProductSummary optionAttributeFQN(String optionAttributeFQN) {
    
    this.optionAttributeFQN = optionAttributeFQN;
    return this;
  }

   /**
   * Fully Qualified Name of the selected option&#39;s attribute (only applies to Products as extras)
   * @return optionAttributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fully Qualified Name of the selected option's attribute (only applies to Products as extras)")

  public String getOptionAttributeFQN() {
    return optionAttributeFQN;
  }


  public void setOptionAttributeFQN(String optionAttributeFQN) {
    this.optionAttributeFQN = optionAttributeFQN;
  }


  public BundledProductSummary optionValue(Object optionValue) {
    
    this.optionValue = optionValue;
    return this;
  }

   /**
   * Value of the selected option (only applies to Products as extras)
   * @return optionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the selected option (only applies to Products as extras)")

  public Object getOptionValue() {
    return optionValue;
  }


  public void setOptionValue(Object optionValue) {
    this.optionValue = optionValue;
  }


  public BundledProductSummary creditValue(Double creditValue) {
    
    this.creditValue = creditValue;
    return this;
  }

   /**
   * Credit Value applicable to this product. Should only be present on DigitalCredit goodsType....
   * @return creditValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit Value applicable to this product. Should only be present on DigitalCredit goodsType....")

  public Double getCreditValue() {
    return creditValue;
  }


  public void setCreditValue(Double creditValue) {
    this.creditValue = creditValue;
  }


  public BundledProductSummary productType(String productType) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledProductSummary bundledProductSummary = (BundledProductSummary) o;
    return Objects.equals(this.productShortDescription, bundledProductSummary.productShortDescription) &&
        Objects.equals(this.productName, bundledProductSummary.productName) &&
        Objects.equals(this.productCode, bundledProductSummary.productCode) &&
        Objects.equals(this.goodsType, bundledProductSummary.goodsType) &&
        Objects.equals(this.quantity, bundledProductSummary.quantity) &&
        Objects.equals(this.measurements, bundledProductSummary.measurements) &&
        Objects.equals(this.isPackagedStandAlone, bundledProductSummary.isPackagedStandAlone) &&
        Objects.equals(this.inventoryInfo, bundledProductSummary.inventoryInfo) &&
        Objects.equals(this.optionAttributeFQN, bundledProductSummary.optionAttributeFQN) &&
        Objects.equals(this.optionValue, bundledProductSummary.optionValue) &&
        Objects.equals(this.creditValue, bundledProductSummary.creditValue) &&
        Objects.equals(this.productType, bundledProductSummary.productType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productShortDescription, productName, productCode, goodsType, quantity, measurements, isPackagedStandAlone, inventoryInfo, optionAttributeFQN, optionValue, creditValue, productType);
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
    sb.append("class BundledProductSummary {\n");
    sb.append("    productShortDescription: ").append(toIndentedString(productShortDescription)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    isPackagedStandAlone: ").append(toIndentedString(isPackagedStandAlone)).append("\n");
    sb.append("    inventoryInfo: ").append(toIndentedString(inventoryInfo)).append("\n");
    sb.append("    optionAttributeFQN: ").append(toIndentedString(optionAttributeFQN)).append("\n");
    sb.append("    optionValue: ").append(toIndentedString(optionValue)).append("\n");
    sb.append("    creditValue: ").append(toIndentedString(creditValue)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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
    openapiFields.add("goodsType");
    openapiFields.add("quantity");
    openapiFields.add("measurements");
    openapiFields.add("isPackagedStandAlone");
    openapiFields.add("inventoryInfo");
    openapiFields.add("optionAttributeFQN");
    openapiFields.add("optionValue");
    openapiFields.add("creditValue");
    openapiFields.add("productType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BundledProductSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BundledProductSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BundledProductSummary is not found in the empty JSON string", BundledProductSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!BundledProductSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BundledProductSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productShortDescription") != null && !jsonObj.get("productShortDescription").isJsonNull()) && !jsonObj.get("productShortDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productShortDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productShortDescription").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("goodsType") != null && !jsonObj.get("goodsType").isJsonNull()) && !jsonObj.get("goodsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goodsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goodsType").toString()));
      }
      // validate the optional field `measurements`
      if (jsonObj.get("measurements") != null && !jsonObj.get("measurements").isJsonNull()) {
        CatalogRuntimesPackageMeasurements.validateJsonObject(jsonObj.getAsJsonObject("measurements"));
      }
      // validate the optional field `inventoryInfo`
      if (jsonObj.get("inventoryInfo") != null && !jsonObj.get("inventoryInfo").isJsonNull()) {
        CatalogRuntimesProductInventoryInfo.validateJsonObject(jsonObj.getAsJsonObject("inventoryInfo"));
      }
      if ((jsonObj.get("optionAttributeFQN") != null && !jsonObj.get("optionAttributeFQN").isJsonNull()) && !jsonObj.get("optionAttributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionAttributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionAttributeFQN").toString()));
      }
      if ((jsonObj.get("productType") != null && !jsonObj.get("productType").isJsonNull()) && !jsonObj.get("productType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BundledProductSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BundledProductSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BundledProductSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BundledProductSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<BundledProductSummary>() {
           @Override
           public void write(JsonWriter out, BundledProductSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BundledProductSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BundledProductSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BundledProductSummary
  * @throws IOException if the JSON string is invalid with respect to BundledProductSummary
  */
  public static BundledProductSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BundledProductSummary.class);
  }

 /**
  * Convert an instance of BundledProductSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
