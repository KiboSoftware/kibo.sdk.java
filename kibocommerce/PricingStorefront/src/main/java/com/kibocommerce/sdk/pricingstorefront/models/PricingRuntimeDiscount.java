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
import com.kibocommerce.sdk.pricingstorefront.models.PricingRuntimeDiscountCondition;
import com.kibocommerce.sdk.pricingstorefront.models.PricingRuntimeDiscountTarget;
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
 * Name of the discount that can be applied and its expiration date. The discount can be on a single product or the  entire order.
 */
@ApiModel(description = "Name of the discount that can be applied and its expiration date. The discount can be on a single product or the  entire order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingRuntimeDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DISCOUNT_ID = "discountId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_ID)
  private Integer discountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FRIENDLY_DESCRIPTION = "friendlyDescription";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_DESCRIPTION)
  private String friendlyDescription;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_MAX_REDEMPTIONS = "maxRedemptions";
  @SerializedName(SERIALIZED_NAME_MAX_REDEMPTIONS)
  private Integer maxRedemptions;

  public static final String SERIALIZED_NAME_MAXIMUM_USES_PER_USER = "maximumUsesPerUser";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_USES_PER_USER)
  private Integer maximumUsesPerUser;

  public static final String SERIALIZED_NAME_REQUIRES_AUTHENTICATED_USER = "requiresAuthenticatedUser";
  @SerializedName(SERIALIZED_NAME_REQUIRES_AUTHENTICATED_USER)
  private Boolean requiresAuthenticatedUser;

  public static final String SERIALIZED_NAME_DOES_NOT_APPLY_TO_PRODUCTS_WITH_SALE_PRICE = "doesNotApplyToProductsWithSalePrice";
  @SerializedName(SERIALIZED_NAME_DOES_NOT_APPLY_TO_PRODUCTS_WITH_SALE_PRICE)
  private Boolean doesNotApplyToProductsWithSalePrice;

  public static final String SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER = "maximumRedemptionsPerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER)
  private Integer maximumRedemptionsPerOrder;

  public static final String SERIALIZED_NAME_MAXIMUM_DISCOUNT_VALUE_PER_ORDER = "maximumDiscountValuePerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DISCOUNT_VALUE_PER_ORDER)
  private Double maximumDiscountValuePerOrder;

  public static final String SERIALIZED_NAME_MAX_DISCOUNT_VALUE_PER_REDEMPTION = "maxDiscountValuePerRedemption";
  @SerializedName(SERIALIZED_NAME_MAX_DISCOUNT_VALUE_PER_REDEMPTION)
  private Double maxDiscountValuePerRedemption;

  public static final String SERIALIZED_NAME_DOES_NOT_APPLY_TO_MULTI_SHIP_TO_ORDERS = "doesNotApplyToMultiShipToOrders";
  @SerializedName(SERIALIZED_NAME_DOES_NOT_APPLY_TO_MULTI_SHIP_TO_ORDERS)
  private Boolean doesNotApplyToMultiShipToOrders;

  public static final String SERIALIZED_NAME_INCLUDED_PRICE_LISTS = "includedPriceLists";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PRICE_LISTS)
  private List<String> includedPriceLists = null;

  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private Integer redemptions;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amountType";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private String amountType;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private PricingRuntimeDiscountTarget target;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private PricingRuntimeDiscountCondition condition;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_STACKING_LAYER = "stackingLayer";
  @SerializedName(SERIALIZED_NAME_STACKING_LAYER)
  private Integer stackingLayer;

  public PricingRuntimeDiscount() {
  }

  public PricingRuntimeDiscount discountId(Integer discountId) {
    
    this.discountId = discountId;
    return this;
  }

   /**
   * Unique identifier of the discount. System-supplied and read-only.
   * @return discountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the discount. System-supplied and read-only.")

  public Integer getDiscountId() {
    return discountId;
  }


  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }


  public PricingRuntimeDiscount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the discount.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the discount.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PricingRuntimeDiscount friendlyDescription(String friendlyDescription) {
    
    this.friendlyDescription = friendlyDescription;
    return this;
  }

   /**
   * Friendly description of the discount.
   * @return friendlyDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Friendly description of the discount.")

  public String getFriendlyDescription() {
    return friendlyDescription;
  }


  public void setFriendlyDescription(String friendlyDescription) {
    this.friendlyDescription = friendlyDescription;
  }


  public PricingRuntimeDiscount amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public PricingRuntimeDiscount scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public PricingRuntimeDiscount maxRedemptions(Integer maxRedemptions) {
    
    this.maxRedemptions = maxRedemptions;
    return this;
  }

   /**
   * Get maxRedemptions
   * @return maxRedemptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxRedemptions() {
    return maxRedemptions;
  }


  public void setMaxRedemptions(Integer maxRedemptions) {
    this.maxRedemptions = maxRedemptions;
  }


  public PricingRuntimeDiscount maximumUsesPerUser(Integer maximumUsesPerUser) {
    
    this.maximumUsesPerUser = maximumUsesPerUser;
    return this;
  }

   /**
   * Get maximumUsesPerUser
   * @return maximumUsesPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaximumUsesPerUser() {
    return maximumUsesPerUser;
  }


  public void setMaximumUsesPerUser(Integer maximumUsesPerUser) {
    this.maximumUsesPerUser = maximumUsesPerUser;
  }


  public PricingRuntimeDiscount requiresAuthenticatedUser(Boolean requiresAuthenticatedUser) {
    
    this.requiresAuthenticatedUser = requiresAuthenticatedUser;
    return this;
  }

   /**
   * Get requiresAuthenticatedUser
   * @return requiresAuthenticatedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresAuthenticatedUser() {
    return requiresAuthenticatedUser;
  }


  public void setRequiresAuthenticatedUser(Boolean requiresAuthenticatedUser) {
    this.requiresAuthenticatedUser = requiresAuthenticatedUser;
  }


  public PricingRuntimeDiscount doesNotApplyToProductsWithSalePrice(Boolean doesNotApplyToProductsWithSalePrice) {
    
    this.doesNotApplyToProductsWithSalePrice = doesNotApplyToProductsWithSalePrice;
    return this;
  }

   /**
   * Get doesNotApplyToProductsWithSalePrice
   * @return doesNotApplyToProductsWithSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDoesNotApplyToProductsWithSalePrice() {
    return doesNotApplyToProductsWithSalePrice;
  }


  public void setDoesNotApplyToProductsWithSalePrice(Boolean doesNotApplyToProductsWithSalePrice) {
    this.doesNotApplyToProductsWithSalePrice = doesNotApplyToProductsWithSalePrice;
  }


  public PricingRuntimeDiscount maximumRedemptionsPerOrder(Integer maximumRedemptionsPerOrder) {
    
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
    return this;
  }

   /**
   * Get maximumRedemptionsPerOrder
   * @return maximumRedemptionsPerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaximumRedemptionsPerOrder() {
    return maximumRedemptionsPerOrder;
  }


  public void setMaximumRedemptionsPerOrder(Integer maximumRedemptionsPerOrder) {
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
  }


  public PricingRuntimeDiscount maximumDiscountValuePerOrder(Double maximumDiscountValuePerOrder) {
    
    this.maximumDiscountValuePerOrder = maximumDiscountValuePerOrder;
    return this;
  }

   /**
   * Get maximumDiscountValuePerOrder
   * @return maximumDiscountValuePerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaximumDiscountValuePerOrder() {
    return maximumDiscountValuePerOrder;
  }


  public void setMaximumDiscountValuePerOrder(Double maximumDiscountValuePerOrder) {
    this.maximumDiscountValuePerOrder = maximumDiscountValuePerOrder;
  }


  public PricingRuntimeDiscount maxDiscountValuePerRedemption(Double maxDiscountValuePerRedemption) {
    
    this.maxDiscountValuePerRedemption = maxDiscountValuePerRedemption;
    return this;
  }

   /**
   * Get maxDiscountValuePerRedemption
   * @return maxDiscountValuePerRedemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxDiscountValuePerRedemption() {
    return maxDiscountValuePerRedemption;
  }


  public void setMaxDiscountValuePerRedemption(Double maxDiscountValuePerRedemption) {
    this.maxDiscountValuePerRedemption = maxDiscountValuePerRedemption;
  }


  public PricingRuntimeDiscount doesNotApplyToMultiShipToOrders(Boolean doesNotApplyToMultiShipToOrders) {
    
    this.doesNotApplyToMultiShipToOrders = doesNotApplyToMultiShipToOrders;
    return this;
  }

   /**
   * Get doesNotApplyToMultiShipToOrders
   * @return doesNotApplyToMultiShipToOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDoesNotApplyToMultiShipToOrders() {
    return doesNotApplyToMultiShipToOrders;
  }


  public void setDoesNotApplyToMultiShipToOrders(Boolean doesNotApplyToMultiShipToOrders) {
    this.doesNotApplyToMultiShipToOrders = doesNotApplyToMultiShipToOrders;
  }


  public PricingRuntimeDiscount includedPriceLists(List<String> includedPriceLists) {
    
    this.includedPriceLists = includedPriceLists;
    return this;
  }

  public PricingRuntimeDiscount addIncludedPriceListsItem(String includedPriceListsItem) {
    if (this.includedPriceLists == null) {
      this.includedPriceLists = new ArrayList<>();
    }
    this.includedPriceLists.add(includedPriceListsItem);
    return this;
  }

   /**
   * Get includedPriceLists
   * @return includedPriceLists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncludedPriceLists() {
    return includedPriceLists;
  }


  public void setIncludedPriceLists(List<String> includedPriceLists) {
    this.includedPriceLists = includedPriceLists;
  }


  public PricingRuntimeDiscount redemptions(Integer redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(Integer redemptions) {
    this.redemptions = redemptions;
  }


  public PricingRuntimeDiscount type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PricingRuntimeDiscount amountType(String amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * Type of discount, which can be either a percentage off the price, a specific monetary amount, or free. Possible values: \&quot;Percentage,\&quot; \&quot;Amount,\&quot; and \&quot;Free\&quot;.
   * @return amountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of discount, which can be either a percentage off the price, a specific monetary amount, or free. Possible values: \"Percentage,\" \"Amount,\" and \"Free\".")

  public String getAmountType() {
    return amountType;
  }


  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }


  public PricingRuntimeDiscount target(PricingRuntimeDiscountTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingRuntimeDiscountTarget getTarget() {
    return target;
  }


  public void setTarget(PricingRuntimeDiscountTarget target) {
    this.target = target;
  }


  public PricingRuntimeDiscount condition(PricingRuntimeDiscountCondition condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingRuntimeDiscountCondition getCondition() {
    return condition;
  }


  public void setCondition(PricingRuntimeDiscountCondition condition) {
    this.condition = condition;
  }


  public PricingRuntimeDiscount expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * When the discount expires. If null, there&#39;s no expiration date.
   * @return expirationDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the discount expires. If null, there's no expiration date.")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PricingRuntimeDiscount stackingLayer(Integer stackingLayer) {
    
    this.stackingLayer = stackingLayer;
    return this;
  }

   /**
   * Get stackingLayer
   * @return stackingLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStackingLayer() {
    return stackingLayer;
  }


  public void setStackingLayer(Integer stackingLayer) {
    this.stackingLayer = stackingLayer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingRuntimeDiscount pricingRuntimeDiscount = (PricingRuntimeDiscount) o;
    return Objects.equals(this.discountId, pricingRuntimeDiscount.discountId) &&
        Objects.equals(this.name, pricingRuntimeDiscount.name) &&
        Objects.equals(this.friendlyDescription, pricingRuntimeDiscount.friendlyDescription) &&
        Objects.equals(this.amount, pricingRuntimeDiscount.amount) &&
        Objects.equals(this.scope, pricingRuntimeDiscount.scope) &&
        Objects.equals(this.maxRedemptions, pricingRuntimeDiscount.maxRedemptions) &&
        Objects.equals(this.maximumUsesPerUser, pricingRuntimeDiscount.maximumUsesPerUser) &&
        Objects.equals(this.requiresAuthenticatedUser, pricingRuntimeDiscount.requiresAuthenticatedUser) &&
        Objects.equals(this.doesNotApplyToProductsWithSalePrice, pricingRuntimeDiscount.doesNotApplyToProductsWithSalePrice) &&
        Objects.equals(this.maximumRedemptionsPerOrder, pricingRuntimeDiscount.maximumRedemptionsPerOrder) &&
        Objects.equals(this.maximumDiscountValuePerOrder, pricingRuntimeDiscount.maximumDiscountValuePerOrder) &&
        Objects.equals(this.maxDiscountValuePerRedemption, pricingRuntimeDiscount.maxDiscountValuePerRedemption) &&
        Objects.equals(this.doesNotApplyToMultiShipToOrders, pricingRuntimeDiscount.doesNotApplyToMultiShipToOrders) &&
        Objects.equals(this.includedPriceLists, pricingRuntimeDiscount.includedPriceLists) &&
        Objects.equals(this.redemptions, pricingRuntimeDiscount.redemptions) &&
        Objects.equals(this.type, pricingRuntimeDiscount.type) &&
        Objects.equals(this.amountType, pricingRuntimeDiscount.amountType) &&
        Objects.equals(this.target, pricingRuntimeDiscount.target) &&
        Objects.equals(this.condition, pricingRuntimeDiscount.condition) &&
        Objects.equals(this.expirationDate, pricingRuntimeDiscount.expirationDate) &&
        Objects.equals(this.stackingLayer, pricingRuntimeDiscount.stackingLayer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountId, name, friendlyDescription, amount, scope, maxRedemptions, maximumUsesPerUser, requiresAuthenticatedUser, doesNotApplyToProductsWithSalePrice, maximumRedemptionsPerOrder, maximumDiscountValuePerOrder, maxDiscountValuePerRedemption, doesNotApplyToMultiShipToOrders, includedPriceLists, redemptions, type, amountType, target, condition, expirationDate, stackingLayer);
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
    sb.append("class PricingRuntimeDiscount {\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    friendlyDescription: ").append(toIndentedString(friendlyDescription)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    maxRedemptions: ").append(toIndentedString(maxRedemptions)).append("\n");
    sb.append("    maximumUsesPerUser: ").append(toIndentedString(maximumUsesPerUser)).append("\n");
    sb.append("    requiresAuthenticatedUser: ").append(toIndentedString(requiresAuthenticatedUser)).append("\n");
    sb.append("    doesNotApplyToProductsWithSalePrice: ").append(toIndentedString(doesNotApplyToProductsWithSalePrice)).append("\n");
    sb.append("    maximumRedemptionsPerOrder: ").append(toIndentedString(maximumRedemptionsPerOrder)).append("\n");
    sb.append("    maximumDiscountValuePerOrder: ").append(toIndentedString(maximumDiscountValuePerOrder)).append("\n");
    sb.append("    maxDiscountValuePerRedemption: ").append(toIndentedString(maxDiscountValuePerRedemption)).append("\n");
    sb.append("    doesNotApplyToMultiShipToOrders: ").append(toIndentedString(doesNotApplyToMultiShipToOrders)).append("\n");
    sb.append("    includedPriceLists: ").append(toIndentedString(includedPriceLists)).append("\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    stackingLayer: ").append(toIndentedString(stackingLayer)).append("\n");
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
    openapiFields.add("discountId");
    openapiFields.add("name");
    openapiFields.add("friendlyDescription");
    openapiFields.add("amount");
    openapiFields.add("scope");
    openapiFields.add("maxRedemptions");
    openapiFields.add("maximumUsesPerUser");
    openapiFields.add("requiresAuthenticatedUser");
    openapiFields.add("doesNotApplyToProductsWithSalePrice");
    openapiFields.add("maximumRedemptionsPerOrder");
    openapiFields.add("maximumDiscountValuePerOrder");
    openapiFields.add("maxDiscountValuePerRedemption");
    openapiFields.add("doesNotApplyToMultiShipToOrders");
    openapiFields.add("includedPriceLists");
    openapiFields.add("redemptions");
    openapiFields.add("type");
    openapiFields.add("amountType");
    openapiFields.add("target");
    openapiFields.add("condition");
    openapiFields.add("expirationDate");
    openapiFields.add("stackingLayer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricingRuntimeDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricingRuntimeDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingRuntimeDiscount is not found in the empty JSON string", PricingRuntimeDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PricingRuntimeDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingRuntimeDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("friendlyDescription") != null && !jsonObj.get("friendlyDescription").isJsonNull()) && !jsonObj.get("friendlyDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendlyDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendlyDescription").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("includedPriceLists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedPriceLists` to be an array in the JSON string but got `%s`", jsonObj.get("includedPriceLists").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("amountType") != null && !jsonObj.get("amountType").isJsonNull()) && !jsonObj.get("amountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountType").toString()));
      }
      // validate the optional field `target`
      if (jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) {
        PricingRuntimeDiscountTarget.validateJsonObject(jsonObj.getAsJsonObject("target"));
      }
      // validate the optional field `condition`
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) {
        PricingRuntimeDiscountCondition.validateJsonObject(jsonObj.getAsJsonObject("condition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingRuntimeDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingRuntimeDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingRuntimeDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingRuntimeDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingRuntimeDiscount>() {
           @Override
           public void write(JsonWriter out, PricingRuntimeDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingRuntimeDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingRuntimeDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingRuntimeDiscount
  * @throws IOException if the JSON string is invalid with respect to PricingRuntimeDiscount
  */
  public static PricingRuntimeDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingRuntimeDiscount.class);
  }

 /**
  * Convert an instance of PricingRuntimeDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
