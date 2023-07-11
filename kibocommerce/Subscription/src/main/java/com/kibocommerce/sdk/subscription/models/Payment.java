/*
 * Kibo SubscriptionRuntime Service
 * OpenAPI Spec for Kibo SubscriptionRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.subscription.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.subscription.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.subscription.models.BillingInfo;
import com.kibocommerce.sdk.subscription.models.CommerceRuntimeChangeMessage;
import com.kibocommerce.sdk.subscription.models.GatewayGiftCard;
import com.kibocommerce.sdk.subscription.models.PaymentActionTarget;
import com.kibocommerce.sdk.subscription.models.PaymentInteraction;
import com.kibocommerce.sdk.subscription.models.SubPayment;
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
 * Payment transaction associated with this order. It is the entire payment interchange between the merchant who is forwarding the customer&#39;s payment   information and the payment service who is authorizing and capturing payment. Payment can be either by credit card, check, or PayPal. (PayPal not  currently supported.)
 */
@ApiModel(description = "Payment transaction associated with this order. It is the entire payment interchange between the merchant who is forwarding the customer's payment   information and the payment service who is authorizing and capturing payment. Payment can be either by credit card, check, or PayPal. (PayPal not  currently supported.)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Payment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private PaymentActionTarget groupId;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_TRANSACTION_ID = "paymentServiceTransactionId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_TRANSACTION_ID)
  private String paymentServiceTransactionId;

  public static final String SERIALIZED_NAME_AVAILABLE_ACTIONS = "availableActions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ACTIONS)
  private List<String> availableActions = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_PAYMENT_WORKFLOW = "paymentWorkflow";
  @SerializedName(SERIALIZED_NAME_PAYMENT_WORKFLOW)
  private String paymentWorkflow;

  public static final String SERIALIZED_NAME_EXTERNAL_TRANSACTION_ID = "externalTransactionId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TRANSACTION_ID)
  private String externalTransactionId;

  public static final String SERIALIZED_NAME_BILLING_INFO = "billingInfo";
  @SerializedName(SERIALIZED_NAME_BILLING_INFO)
  private BillingInfo billingInfo;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUB_PAYMENTS = "subPayments";
  @SerializedName(SERIALIZED_NAME_SUB_PAYMENTS)
  private List<SubPayment> subPayments = null;

  public static final String SERIALIZED_NAME_INTERACTIONS = "interactions";
  @SerializedName(SERIALIZED_NAME_INTERACTIONS)
  private List<PaymentInteraction> interactions = null;

  public static final String SERIALIZED_NAME_IS_RECURRING = "isRecurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_AMOUNT_COLLECTED = "amountCollected";
  @SerializedName(SERIALIZED_NAME_AMOUNT_COLLECTED)
  private Double amountCollected;

  public static final String SERIALIZED_NAME_AMOUNT_CREDITED = "amountCredited";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CREDITED)
  private Double amountCredited;

  public static final String SERIALIZED_NAME_AMOUNT_REQUESTED = "amountRequested";
  @SerializedName(SERIALIZED_NAME_AMOUNT_REQUESTED)
  private Double amountRequested;

  public static final String SERIALIZED_NAME_CHANGE_MESSAGES = "changeMessages";
  @SerializedName(SERIALIZED_NAME_CHANGE_MESSAGES)
  private List<CommerceRuntimeChangeMessage> changeMessages = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_GATEWAY_GIFT_CARD = "gatewayGiftCard";
  @SerializedName(SERIALIZED_NAME_GATEWAY_GIFT_CARD)
  private GatewayGiftCard gatewayGiftCard;

  public Payment() {
  }

  public Payment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this order transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of this order transaction.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Payment groupId(PaymentActionTarget groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentActionTarget getGroupId() {
    return groupId;
  }


  public void setGroupId(PaymentActionTarget groupId) {
    this.groupId = groupId;
  }


  public Payment paymentServiceTransactionId(String paymentServiceTransactionId) {
    
    this.paymentServiceTransactionId = paymentServiceTransactionId;
    return this;
  }

   /**
   * Unique identifier of the transaction, specified by the payment service processesing this transaction.
   * @return paymentServiceTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the transaction, specified by the payment service processesing this transaction.")

  public String getPaymentServiceTransactionId() {
    return paymentServiceTransactionId;
  }


  public void setPaymentServiceTransactionId(String paymentServiceTransactionId) {
    this.paymentServiceTransactionId = paymentServiceTransactionId;
  }


  public Payment availableActions(List<String> availableActions) {
    
    this.availableActions = availableActions;
    return this;
  }

  public Payment addAvailableActionsItem(String availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new ArrayList<>();
    }
    this.availableActions.add(availableActionsItem);
    return this;
  }

   /**
   * Actions available to the payment
   * @return availableActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actions available to the payment")

  public List<String> getAvailableActions() {
    return availableActions;
  }


  public void setAvailableActions(List<String> availableActions) {
    this.availableActions = availableActions;
  }


  public Payment orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique identifier of the order with which this transaction is associated.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the order with which this transaction is associated.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Payment paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Type of Payment
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of Payment")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public Payment paymentWorkflow(String paymentWorkflow) {
    
    this.paymentWorkflow = paymentWorkflow;
    return this;
  }

   /**
   * The source of data for this payment.  By default, this will be set to &#39;mozu&#39;
   * @return paymentWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of data for this payment.  By default, this will be set to 'mozu'")

  public String getPaymentWorkflow() {
    return paymentWorkflow;
  }


  public void setPaymentWorkflow(String paymentWorkflow) {
    this.paymentWorkflow = paymentWorkflow;
  }


  public Payment externalTransactionId(String externalTransactionId) {
    
    this.externalTransactionId = externalTransactionId;
    return this;
  }

   /**
   * The external/third party transaction Id for this payment. This is used to store the transaction Id from digital wallet like Visa Checkout
   * @return externalTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The external/third party transaction Id for this payment. This is used to store the transaction Id from digital wallet like Visa Checkout")

  public String getExternalTransactionId() {
    return externalTransactionId;
  }


  public void setExternalTransactionId(String externalTransactionId) {
    this.externalTransactionId = externalTransactionId;
  }


  public Payment billingInfo(BillingInfo billingInfo) {
    
    this.billingInfo = billingInfo;
    return this;
  }

   /**
   * Get billingInfo
   * @return billingInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingInfo getBillingInfo() {
    return billingInfo;
  }


  public void setBillingInfo(BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }


  public Payment data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Custom data from payment providers
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom data from payment providers")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public Payment status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current status of this transaction which are described by the PaymentStatusConst class.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current status of this transaction which are described by the PaymentStatusConst class.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Payment subPayments(List<SubPayment> subPayments) {
    
    this.subPayments = subPayments;
    return this;
  }

  public Payment addSubPaymentsItem(SubPayment subPaymentsItem) {
    if (this.subPayments == null) {
      this.subPayments = new ArrayList<>();
    }
    this.subPayments.add(subPaymentsItem);
    return this;
  }

   /**
   * List of sub payments that correspond to child orders in case of multiship orders.
   * @return subPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sub payments that correspond to child orders in case of multiship orders.")

  public List<SubPayment> getSubPayments() {
    return subPayments;
  }


  public void setSubPayments(List<SubPayment> subPayments) {
    this.subPayments = subPayments;
  }


  public Payment interactions(List<PaymentInteraction> interactions) {
    
    this.interactions = interactions;
    return this;
  }

  public Payment addInteractionsItem(PaymentInteraction interactionsItem) {
    if (this.interactions == null) {
      this.interactions = new ArrayList<>();
    }
    this.interactions.add(interactionsItem);
    return this;
  }

   /**
   * List of intereactions for this transaction. A transaction is created upon authorization and lasts across the payment   interchange, which can consist of multiple interactions, such as consecutive captures.
   * @return interactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of intereactions for this transaction. A transaction is created upon authorization and lasts across the payment   interchange, which can consist of multiple interactions, such as consecutive captures.")

  public List<PaymentInteraction> getInteractions() {
    return interactions;
  }


  public void setInteractions(List<PaymentInteraction> interactions) {
    this.interactions = interactions;
  }


  public Payment isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * If true, the product is purchased or fulfilled at regular intervals, for example,   monthly billing or a subscription. (Not currently supported.)
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the product is purchased or fulfilled at regular intervals, for example,   monthly billing or a subscription. (Not currently supported.)")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public Payment amountCollected(Double amountCollected) {
    
    this.amountCollected = amountCollected;
    return this;
  }

   /**
   * Amount collected on the payment
   * @return amountCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount collected on the payment")

  public Double getAmountCollected() {
    return amountCollected;
  }


  public void setAmountCollected(Double amountCollected) {
    this.amountCollected = amountCollected;
  }


  public Payment amountCredited(Double amountCredited) {
    
    this.amountCredited = amountCredited;
    return this;
  }

   /**
   * Amount credited back to the payment.
   * @return amountCredited
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount credited back to the payment.")

  public Double getAmountCredited() {
    return amountCredited;
  }


  public void setAmountCredited(Double amountCredited) {
    this.amountCredited = amountCredited;
  }


  public Payment amountRequested(Double amountRequested) {
    
    this.amountRequested = amountRequested;
    return this;
  }

   /**
   * Derived from the Amount on the initial payment create, used to help storefront determine how much can be captured for multiple payments.  See Order.AmountRemainingForPayment for an example.
   * @return amountRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived from the Amount on the initial payment create, used to help storefront determine how much can be captured for multiple payments.  See Order.AmountRemainingForPayment for an example.")

  public Double getAmountRequested() {
    return amountRequested;
  }


  public void setAmountRequested(Double amountRequested) {
    this.amountRequested = amountRequested;
  }


  public Payment changeMessages(List<CommerceRuntimeChangeMessage> changeMessages) {
    
    this.changeMessages = changeMessages;
    return this;
  }

  public Payment addChangeMessagesItem(CommerceRuntimeChangeMessage changeMessagesItem) {
    if (this.changeMessages == null) {
      this.changeMessages = new ArrayList<>();
    }
    this.changeMessages.add(changeMessagesItem);
    return this;
  }

   /**
   * Change messages related to the payment.
   * @return changeMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Change messages related to the payment.")

  public List<CommerceRuntimeChangeMessage> getChangeMessages() {
    return changeMessages;
  }


  public void setChangeMessages(List<CommerceRuntimeChangeMessage> changeMessages) {
    this.changeMessages = changeMessages;
  }


  public Payment auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public Payment gatewayGiftCard(GatewayGiftCard gatewayGiftCard) {
    
    this.gatewayGiftCard = gatewayGiftCard;
    return this;
  }

   /**
   * Get gatewayGiftCard
   * @return gatewayGiftCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayGiftCard getGatewayGiftCard() {
    return gatewayGiftCard;
  }


  public void setGatewayGiftCard(GatewayGiftCard gatewayGiftCard) {
    this.gatewayGiftCard = gatewayGiftCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.groupId, payment.groupId) &&
        Objects.equals(this.paymentServiceTransactionId, payment.paymentServiceTransactionId) &&
        Objects.equals(this.availableActions, payment.availableActions) &&
        Objects.equals(this.orderId, payment.orderId) &&
        Objects.equals(this.paymentType, payment.paymentType) &&
        Objects.equals(this.paymentWorkflow, payment.paymentWorkflow) &&
        Objects.equals(this.externalTransactionId, payment.externalTransactionId) &&
        Objects.equals(this.billingInfo, payment.billingInfo) &&
        Objects.equals(this.data, payment.data) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.subPayments, payment.subPayments) &&
        Objects.equals(this.interactions, payment.interactions) &&
        Objects.equals(this.isRecurring, payment.isRecurring) &&
        Objects.equals(this.amountCollected, payment.amountCollected) &&
        Objects.equals(this.amountCredited, payment.amountCredited) &&
        Objects.equals(this.amountRequested, payment.amountRequested) &&
        Objects.equals(this.changeMessages, payment.changeMessages) &&
        Objects.equals(this.auditInfo, payment.auditInfo) &&
        Objects.equals(this.gatewayGiftCard, payment.gatewayGiftCard);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, paymentServiceTransactionId, availableActions, orderId, paymentType, paymentWorkflow, externalTransactionId, billingInfo, data, status, subPayments, interactions, isRecurring, amountCollected, amountCredited, amountRequested, changeMessages, auditInfo, gatewayGiftCard);
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
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    paymentServiceTransactionId: ").append(toIndentedString(paymentServiceTransactionId)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentWorkflow: ").append(toIndentedString(paymentWorkflow)).append("\n");
    sb.append("    externalTransactionId: ").append(toIndentedString(externalTransactionId)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subPayments: ").append(toIndentedString(subPayments)).append("\n");
    sb.append("    interactions: ").append(toIndentedString(interactions)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    amountCollected: ").append(toIndentedString(amountCollected)).append("\n");
    sb.append("    amountCredited: ").append(toIndentedString(amountCredited)).append("\n");
    sb.append("    amountRequested: ").append(toIndentedString(amountRequested)).append("\n");
    sb.append("    changeMessages: ").append(toIndentedString(changeMessages)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    gatewayGiftCard: ").append(toIndentedString(gatewayGiftCard)).append("\n");
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
    openapiFields.add("groupId");
    openapiFields.add("paymentServiceTransactionId");
    openapiFields.add("availableActions");
    openapiFields.add("orderId");
    openapiFields.add("paymentType");
    openapiFields.add("paymentWorkflow");
    openapiFields.add("externalTransactionId");
    openapiFields.add("billingInfo");
    openapiFields.add("data");
    openapiFields.add("status");
    openapiFields.add("subPayments");
    openapiFields.add("interactions");
    openapiFields.add("isRecurring");
    openapiFields.add("amountCollected");
    openapiFields.add("amountCredited");
    openapiFields.add("amountRequested");
    openapiFields.add("changeMessages");
    openapiFields.add("auditInfo");
    openapiFields.add("gatewayGiftCard");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Payment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Payment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Payment.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `groupId`
      if (jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) {
        PaymentActionTarget.validateJsonObject(jsonObj.getAsJsonObject("groupId"));
      }
      if ((jsonObj.get("paymentServiceTransactionId") != null && !jsonObj.get("paymentServiceTransactionId").isJsonNull()) && !jsonObj.get("paymentServiceTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentServiceTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentServiceTransactionId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("availableActions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableActions` to be an array in the JSON string but got `%s`", jsonObj.get("availableActions").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("paymentType") != null && !jsonObj.get("paymentType").isJsonNull()) && !jsonObj.get("paymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentType").toString()));
      }
      if ((jsonObj.get("paymentWorkflow") != null && !jsonObj.get("paymentWorkflow").isJsonNull()) && !jsonObj.get("paymentWorkflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentWorkflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentWorkflow").toString()));
      }
      if ((jsonObj.get("externalTransactionId") != null && !jsonObj.get("externalTransactionId").isJsonNull()) && !jsonObj.get("externalTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalTransactionId").toString()));
      }
      // validate the optional field `billingInfo`
      if (jsonObj.get("billingInfo") != null && !jsonObj.get("billingInfo").isJsonNull()) {
        BillingInfo.validateJsonObject(jsonObj.getAsJsonObject("billingInfo"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("subPayments") != null && !jsonObj.get("subPayments").isJsonNull()) {
        JsonArray jsonArraysubPayments = jsonObj.getAsJsonArray("subPayments");
        if (jsonArraysubPayments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subPayments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subPayments` to be an array in the JSON string but got `%s`", jsonObj.get("subPayments").toString()));
          }

          // validate the optional field `subPayments` (array)
          for (int i = 0; i < jsonArraysubPayments.size(); i++) {
            SubPayment.validateJsonObject(jsonArraysubPayments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("interactions") != null && !jsonObj.get("interactions").isJsonNull()) {
        JsonArray jsonArrayinteractions = jsonObj.getAsJsonArray("interactions");
        if (jsonArrayinteractions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("interactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `interactions` to be an array in the JSON string but got `%s`", jsonObj.get("interactions").toString()));
          }

          // validate the optional field `interactions` (array)
          for (int i = 0; i < jsonArrayinteractions.size(); i++) {
            PaymentInteraction.validateJsonObject(jsonArrayinteractions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("changeMessages") != null && !jsonObj.get("changeMessages").isJsonNull()) {
        JsonArray jsonArraychangeMessages = jsonObj.getAsJsonArray("changeMessages");
        if (jsonArraychangeMessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changeMessages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changeMessages` to be an array in the JSON string but got `%s`", jsonObj.get("changeMessages").toString()));
          }

          // validate the optional field `changeMessages` (array)
          for (int i = 0; i < jsonArraychangeMessages.size(); i++) {
            CommerceRuntimeChangeMessage.validateJsonObject(jsonArraychangeMessages.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // validate the optional field `gatewayGiftCard`
      if (jsonObj.get("gatewayGiftCard") != null && !jsonObj.get("gatewayGiftCard").isJsonNull()) {
        GatewayGiftCard.validateJsonObject(jsonObj.getAsJsonObject("gatewayGiftCard"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Payment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Payment
  * @throws IOException if the JSON string is invalid with respect to Payment
  */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

 /**
  * Convert an instance of Payment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

