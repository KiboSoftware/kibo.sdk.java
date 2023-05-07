/*
 * Kibo Fulfillment API - Production Profile
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.model.Address;
import com.kibocommerce.sdk.fulfillment.model.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class Contact {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_COMPANY_OR_ORGANIZATION = "companyOrOrganization";
  @SerializedName(SERIALIZED_NAME_COMPANY_OR_ORGANIZATION)
  private String companyOrOrganization;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LAST_NAME_OR_SURNAME = "lastNameOrSurname";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_OR_SURNAME)
  private String lastNameOrSurname;

  public static final String SERIALIZED_NAME_MIDDLE_NAME_OR_INITIAL = "middleNameOrInitial";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME_OR_INITIAL)
  private String middleNameOrInitial;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private Phone phoneNumbers = null;

  public static final String SERIALIZED_NAME_SHORT_FULL_NAME = "shortFullName";
  @SerializedName(SERIALIZED_NAME_SHORT_FULL_NAME)
  private String shortFullName;

  public Contact address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Contact attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Contact putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public Contact companyOrOrganization(String companyOrOrganization) {
    this.companyOrOrganization = companyOrOrganization;
    return this;
  }

   /**
   * Get companyOrOrganization
   * @return companyOrOrganization
  **/
  @ApiModelProperty(value = "")
  public String getCompanyOrOrganization() {
    return companyOrOrganization;
  }

  public void setCompanyOrOrganization(String companyOrOrganization) {
    this.companyOrOrganization = companyOrOrganization;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Contact id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Contact lastNameOrSurname(String lastNameOrSurname) {
    this.lastNameOrSurname = lastNameOrSurname;
    return this;
  }

   /**
   * Get lastNameOrSurname
   * @return lastNameOrSurname
  **/
  @ApiModelProperty(value = "")
  public String getLastNameOrSurname() {
    return lastNameOrSurname;
  }

  public void setLastNameOrSurname(String lastNameOrSurname) {
    this.lastNameOrSurname = lastNameOrSurname;
  }

  public Contact middleNameOrInitial(String middleNameOrInitial) {
    this.middleNameOrInitial = middleNameOrInitial;
    return this;
  }

   /**
   * Get middleNameOrInitial
   * @return middleNameOrInitial
  **/
  @ApiModelProperty(value = "")
  public String getMiddleNameOrInitial() {
    return middleNameOrInitial;
  }

  public void setMiddleNameOrInitial(String middleNameOrInitial) {
    this.middleNameOrInitial = middleNameOrInitial;
  }

  public Contact phoneNumbers(Phone phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "")
  public Phone getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(Phone phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public Contact shortFullName(String shortFullName) {
    this.shortFullName = shortFullName;
    return this;
  }

   /**
   * Get shortFullName
   * @return shortFullName
  **/
  @ApiModelProperty(value = "")
  public String getShortFullName() {
    return shortFullName;
  }

  public void setShortFullName(String shortFullName) {
    this.shortFullName = shortFullName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.address, contact.address) &&
        Objects.equals(this.attributes, contact.attributes) &&
        Objects.equals(this.companyOrOrganization, contact.companyOrOrganization) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.fullName, contact.fullName) &&
        Objects.equals(this.id, contact.id) &&
        Objects.equals(this.lastNameOrSurname, contact.lastNameOrSurname) &&
        Objects.equals(this.middleNameOrInitial, contact.middleNameOrInitial) &&
        Objects.equals(this.phoneNumbers, contact.phoneNumbers) &&
        Objects.equals(this.shortFullName, contact.shortFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, attributes, companyOrOrganization, email, firstName, fullName, id, lastNameOrSurname, middleNameOrInitial, phoneNumbers, shortFullName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    companyOrOrganization: ").append(toIndentedString(companyOrOrganization)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastNameOrSurname: ").append(toIndentedString(lastNameOrSurname)).append("\n");
    sb.append("    middleNameOrInitial: ").append(toIndentedString(middleNameOrInitial)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    shortFullName: ").append(toIndentedString(shortFullName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

