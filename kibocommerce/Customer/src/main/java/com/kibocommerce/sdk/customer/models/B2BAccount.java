/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.customer.models.AccountSalesRep;
import com.kibocommerce.sdk.customer.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.customer.models.B2BUser;
import com.kibocommerce.sdk.customer.models.CommerceSummary;
import com.kibocommerce.sdk.customer.models.CustomerAttribute;
import com.kibocommerce.sdk.customer.models.CustomerContact;
import com.kibocommerce.sdk.customer.models.CustomerCustomerSegment;
import com.kibocommerce.sdk.customer.models.CustomerNote;
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
 * Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.
 */
@ApiModel(description = "Customer account. Customers provide contact information, view order history, and set email preferences on their account.   Merchants can edit accounts to add internal notes or assign them to segments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class B2BAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<B2BUser> users = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_PRICE_LIST = "priceList";
  @SerializedName(SERIALIZED_NAME_PRICE_LIST)
  private String priceList;

  public static final String SERIALIZED_NAME_SALES_REPS = "salesReps";
  @SerializedName(SERIALIZED_NAME_SALES_REPS)
  private List<AccountSalesRep> salesReps = null;

  public static final String SERIALIZED_NAME_ROOT_ACCOUNT_ID = "rootAccountId";
  @SerializedName(SERIALIZED_NAME_ROOT_ACCOUNT_ID)
  private Integer rootAccountId;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_ID = "parentAccountId";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_ID)
  private Integer parentAccountId;

  public static final String SERIALIZED_NAME_APPROVAL_STATUS = "approvalStatus";
  @SerializedName(SERIALIZED_NAME_APPROVAL_STATUS)
  private String approvalStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CUSTOMER_SET = "customerSet";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SET)
  private String customerSet;

  public static final String SERIALIZED_NAME_COMMERCE_SUMMARY = "commerceSummary";
  @SerializedName(SERIALIZED_NAME_COMMERCE_SUMMARY)
  private CommerceSummary commerceSummary;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<CustomerContact> contacts = null;

  public static final String SERIALIZED_NAME_COMPANY_OR_ORGANIZATION = "companyOrOrganization";
  @SerializedName(SERIALIZED_NAME_COMPANY_OR_ORGANIZATION)
  private String companyOrOrganization;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<CustomerNote> notes = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<CustomerAttribute> attributes = null;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private List<CustomerCustomerSegment> segments = null;

  public static final String SERIALIZED_NAME_TAX_EXEMPT = "taxExempt";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT)
  private Boolean taxExempt;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CUSTOMER_SINCE_DATE = "customerSinceDate";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SINCE_DATE)
  private OffsetDateTime customerSinceDate;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_MIGRATION_REQUIRED = "migrationRequired";
  @SerializedName(SERIALIZED_NAME_MIGRATION_REQUIRED)
  private Boolean migrationRequired;

  public B2BAccount() {
  }

  public B2BAccount users(List<B2BUser> users) {
    
    this.users = users;
    return this;
  }

  public B2BAccount addUsersItem(B2BUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of B2B users on the account.
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of B2B users on the account.")

  public List<B2BUser> getUsers() {
    return users;
  }


  public void setUsers(List<B2BUser> users) {
    this.users = users;
  }


  public B2BAccount isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Is the B2B account active?
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the B2B account active?")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public B2BAccount priceList(String priceList) {
    
    this.priceList = priceList;
    return this;
  }

   /**
   * Price list on B2B account.
   * @return priceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price list on B2B account.")

  public String getPriceList() {
    return priceList;
  }


  public void setPriceList(String priceList) {
    this.priceList = priceList;
  }


  public B2BAccount salesReps(List<AccountSalesRep> salesReps) {
    
    this.salesReps = salesReps;
    return this;
  }

  public B2BAccount addSalesRepsItem(AccountSalesRep salesRepsItem) {
    if (this.salesReps == null) {
      this.salesReps = new ArrayList<>();
    }
    this.salesReps.add(salesRepsItem);
    return this;
  }

   /**
   * List of sales rep on B2B account.
   * @return salesReps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sales rep on B2B account.")

  public List<AccountSalesRep> getSalesReps() {
    return salesReps;
  }


  public void setSalesReps(List<AccountSalesRep> salesReps) {
    this.salesReps = salesReps;
  }


  public B2BAccount rootAccountId(Integer rootAccountId) {
    
    this.rootAccountId = rootAccountId;
    return this;
  }

   /**
   * Root account Id in B2B hierarchy
   * @return rootAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Root account Id in B2B hierarchy")

  public Integer getRootAccountId() {
    return rootAccountId;
  }


  public void setRootAccountId(Integer rootAccountId) {
    this.rootAccountId = rootAccountId;
  }


  public B2BAccount parentAccountId(Integer parentAccountId) {
    
    this.parentAccountId = parentAccountId;
    return this;
  }

   /**
   * Parent account Id in B2B hierarchy
   * @return parentAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parent account Id in B2B hierarchy")

  public Integer getParentAccountId() {
    return parentAccountId;
  }


  public void setParentAccountId(Integer parentAccountId) {
    this.parentAccountId = parentAccountId;
  }


  public B2BAccount approvalStatus(String approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Status on B2B account.
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status on B2B account.")

  public String getApprovalStatus() {
    return approvalStatus;
  }


  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public B2BAccount id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the account, also known as a customer number.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the account, also known as a customer number.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public B2BAccount customerSet(String customerSet) {
    
    this.customerSet = customerSet;
    return this;
  }

   /**
   * Get customerSet
   * @return customerSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerSet() {
    return customerSet;
  }


  public void setCustomerSet(String customerSet) {
    this.customerSet = customerSet;
  }


  public B2BAccount commerceSummary(CommerceSummary commerceSummary) {
    
    this.commerceSummary = commerceSummary;
    return this;
  }

   /**
   * Get commerceSummary
   * @return commerceSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceSummary getCommerceSummary() {
    return commerceSummary;
  }


  public void setCommerceSummary(CommerceSummary commerceSummary) {
    this.commerceSummary = commerceSummary;
  }


  public B2BAccount contacts(List<CustomerContact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public B2BAccount addContactsItem(CustomerContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses.
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of contacts for this account. A customer account can have multiple contacts for billing and shipping addresses.")

  public List<CustomerContact> getContacts() {
    return contacts;
  }


  public void setContacts(List<CustomerContact> contacts) {
    this.contacts = contacts;
  }


  public B2BAccount companyOrOrganization(String companyOrOrganization) {
    
    this.companyOrOrganization = companyOrOrganization;
    return this;
  }

   /**
   * The company or organization name for an account.
   * @return companyOrOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company or organization name for an account.")

  public String getCompanyOrOrganization() {
    return companyOrOrganization;
  }


  public void setCompanyOrOrganization(String companyOrOrganization) {
    this.companyOrOrganization = companyOrOrganization;
  }


  public B2BAccount notes(List<CustomerNote> notes) {
    
    this.notes = notes;
    return this;
  }

  public B2BAccount addNotesItem(CustomerNote notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer&#39;s interests or complaints.   Notes are available only from the merchant&#39;s view, customers cannot view these notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of notes for the account. Merchants use these internal notes, for example, to make a note of a customer's interests or complaints.   Notes are available only from the merchant's view, customers cannot view these notes.")

  public List<CustomerNote> getNotes() {
    return notes;
  }


  public void setNotes(List<CustomerNote> notes) {
    this.notes = notes;
  }


  public B2BAccount attributes(List<CustomerAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public B2BAccount addAttributesItem(CustomerAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes for the account.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes for the account.")

  public List<CustomerAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<CustomerAttribute> attributes) {
    this.attributes = attributes;
  }


  public B2BAccount segments(List<CustomerCustomerSegment> segments) {
    
    this.segments = segments;
    return this;
  }

  public B2BAccount addSegmentsItem(CustomerCustomerSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.   Then they assign the account to the segment. An account can belong to several segments or none at all.
   * @return segments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of segments assigned to account. Merchants create segments, for example, to manage discounts or assign VIP status.   Then they assign the account to the segment. An account can belong to several segments or none at all.")

  public List<CustomerCustomerSegment> getSegments() {
    return segments;
  }


  public void setSegments(List<CustomerCustomerSegment> segments) {
    this.segments = segments;
  }


  public B2BAccount taxExempt(Boolean taxExempt) {
    
    this.taxExempt = taxExempt;
    return this;
  }

   /**
   * Get taxExempt
   * @return taxExempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTaxExempt() {
    return taxExempt;
  }


  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }


  public B2BAccount taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public B2BAccount externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public B2BAccount auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public B2BAccount customerSinceDate(OffsetDateTime customerSinceDate) {
    
    this.customerSinceDate = customerSinceDate;
    return this;
  }

   /**
   * Date when the customer account is created.
   * @return customerSinceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the customer account is created.")

  public OffsetDateTime getCustomerSinceDate() {
    return customerSinceDate;
  }


  public void setCustomerSinceDate(OffsetDateTime customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  public B2BAccount accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of account.")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public B2BAccount migrationRequired(Boolean migrationRequired) {
    
    this.migrationRequired = migrationRequired;
    return this;
  }

   /**
   * Indicates Subscription migration is required or not.
   * @return migrationRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates Subscription migration is required or not.")

  public Boolean getMigrationRequired() {
    return migrationRequired;
  }


  public void setMigrationRequired(Boolean migrationRequired) {
    this.migrationRequired = migrationRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    B2BAccount b2BAccount = (B2BAccount) o;
    return Objects.equals(this.users, b2BAccount.users) &&
        Objects.equals(this.isActive, b2BAccount.isActive) &&
        Objects.equals(this.priceList, b2BAccount.priceList) &&
        Objects.equals(this.salesReps, b2BAccount.salesReps) &&
        Objects.equals(this.rootAccountId, b2BAccount.rootAccountId) &&
        Objects.equals(this.parentAccountId, b2BAccount.parentAccountId) &&
        Objects.equals(this.approvalStatus, b2BAccount.approvalStatus) &&
        Objects.equals(this.id, b2BAccount.id) &&
        Objects.equals(this.customerSet, b2BAccount.customerSet) &&
        Objects.equals(this.commerceSummary, b2BAccount.commerceSummary) &&
        Objects.equals(this.contacts, b2BAccount.contacts) &&
        Objects.equals(this.companyOrOrganization, b2BAccount.companyOrOrganization) &&
        Objects.equals(this.notes, b2BAccount.notes) &&
        Objects.equals(this.attributes, b2BAccount.attributes) &&
        Objects.equals(this.segments, b2BAccount.segments) &&
        Objects.equals(this.taxExempt, b2BAccount.taxExempt) &&
        Objects.equals(this.taxId, b2BAccount.taxId) &&
        Objects.equals(this.externalId, b2BAccount.externalId) &&
        Objects.equals(this.auditInfo, b2BAccount.auditInfo) &&
        Objects.equals(this.customerSinceDate, b2BAccount.customerSinceDate) &&
        Objects.equals(this.accountType, b2BAccount.accountType) &&
        Objects.equals(this.migrationRequired, b2BAccount.migrationRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, isActive, priceList, salesReps, rootAccountId, parentAccountId, approvalStatus, id, customerSet, commerceSummary, contacts, companyOrOrganization, notes, attributes, segments, taxExempt, taxId, externalId, auditInfo, customerSinceDate, accountType, migrationRequired);
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
    sb.append("class B2BAccount {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    salesReps: ").append(toIndentedString(salesReps)).append("\n");
    sb.append("    rootAccountId: ").append(toIndentedString(rootAccountId)).append("\n");
    sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerSet: ").append(toIndentedString(customerSet)).append("\n");
    sb.append("    commerceSummary: ").append(toIndentedString(commerceSummary)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    companyOrOrganization: ").append(toIndentedString(companyOrOrganization)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    customerSinceDate: ").append(toIndentedString(customerSinceDate)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    migrationRequired: ").append(toIndentedString(migrationRequired)).append("\n");
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
    openapiFields.add("customerSet");
    openapiFields.add("commerceSummary");
    openapiFields.add("contacts");
    openapiFields.add("companyOrOrganization");
    openapiFields.add("notes");
    openapiFields.add("attributes");
    openapiFields.add("segments");
    openapiFields.add("taxExempt");
    openapiFields.add("taxId");
    openapiFields.add("externalId");
    openapiFields.add("auditInfo");
    openapiFields.add("customerSinceDate");
    openapiFields.add("accountType");
    openapiFields.add("migrationRequired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to B2BAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!B2BAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in B2BAccount is not found in the empty JSON string", B2BAccount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!B2BAccount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `B2BAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            B2BUser.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("priceList") != null && !jsonObj.get("priceList").isJsonNull()) && !jsonObj.get("priceList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceList").toString()));
      }
      if (jsonObj.get("salesReps") != null && !jsonObj.get("salesReps").isJsonNull()) {
        JsonArray jsonArraysalesReps = jsonObj.getAsJsonArray("salesReps");
        if (jsonArraysalesReps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("salesReps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `salesReps` to be an array in the JSON string but got `%s`", jsonObj.get("salesReps").toString()));
          }

          // validate the optional field `salesReps` (array)
          for (int i = 0; i < jsonArraysalesReps.size(); i++) {
            AccountSalesRep.validateJsonObject(jsonArraysalesReps.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("approvalStatus") != null && !jsonObj.get("approvalStatus").isJsonNull()) && !jsonObj.get("approvalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvalStatus").toString()));
      }
      if ((jsonObj.get("customerSet") != null && !jsonObj.get("customerSet").isJsonNull()) && !jsonObj.get("customerSet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerSet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerSet").toString()));
      }
      // validate the optional field `commerceSummary`
      if (jsonObj.get("commerceSummary") != null && !jsonObj.get("commerceSummary").isJsonNull()) {
        CommerceSummary.validateJsonObject(jsonObj.getAsJsonObject("commerceSummary"));
      }
      if (jsonObj.get("contacts") != null && !jsonObj.get("contacts").isJsonNull()) {
        JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
        if (jsonArraycontacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
          }

          // validate the optional field `contacts` (array)
          for (int i = 0; i < jsonArraycontacts.size(); i++) {
            CustomerContact.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("companyOrOrganization") != null && !jsonObj.get("companyOrOrganization").isJsonNull()) && !jsonObj.get("companyOrOrganization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyOrOrganization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyOrOrganization").toString()));
      }
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
        if (jsonArraynotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
          }

          // validate the optional field `notes` (array)
          for (int i = 0; i < jsonArraynotes.size(); i++) {
            CustomerNote.validateJsonObject(jsonArraynotes.get(i).getAsJsonObject());
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
            CustomerAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("segments") != null && !jsonObj.get("segments").isJsonNull()) {
        JsonArray jsonArraysegments = jsonObj.getAsJsonArray("segments");
        if (jsonArraysegments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("segments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `segments` to be an array in the JSON string but got `%s`", jsonObj.get("segments").toString()));
          }

          // validate the optional field `segments` (array)
          for (int i = 0; i < jsonArraysegments.size(); i++) {
            CustomerCustomerSegment.validateJsonObject(jsonArraysegments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonNull()) && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!B2BAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'B2BAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<B2BAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(B2BAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<B2BAccount>() {
           @Override
           public void write(JsonWriter out, B2BAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public B2BAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of B2BAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of B2BAccount
  * @throws IOException if the JSON string is invalid with respect to B2BAccount
  */
  public static B2BAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, B2BAccount.class);
  }

 /**
  * Convert an instance of B2BAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

