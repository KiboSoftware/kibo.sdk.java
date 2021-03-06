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
import com.kibocommerce.sdk.fulfillment.model.Contact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class Customer {
  public static final String SERIALIZED_NAME_CUSTOMER_CONTACT = "customerContact";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_CONTACT)
  private Contact customerContact = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public static final String SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL = "isDestinationCommercial";
  @SerializedName(SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL)
  private Boolean isDestinationCommercial;

  public Customer customerContact(Contact customerContact) {
    this.customerContact = customerContact;
    return this;
  }

   /**
   * Get customerContact
   * @return customerContact
  **/
  @ApiModelProperty(value = "")
  public Contact getCustomerContact() {
    return customerContact;
  }

  public void setCustomerContact(Contact customerContact) {
    this.customerContact = customerContact;
  }

  public Customer data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Customer isDestinationCommercial(Boolean isDestinationCommercial) {
    this.isDestinationCommercial = isDestinationCommercial;
    return this;
  }

   /**
   * Get isDestinationCommercial
   * @return isDestinationCommercial
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDestinationCommercial() {
    return isDestinationCommercial;
  }

  public void setIsDestinationCommercial(Boolean isDestinationCommercial) {
    this.isDestinationCommercial = isDestinationCommercial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerContact, customer.customerContact) &&
        Objects.equals(this.data, customer.data) &&
        Objects.equals(this.isDestinationCommercial, customer.isDestinationCommercial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContact, data, isDestinationCommercial);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerContact: ").append(toIndentedString(customerContact)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDestinationCommercial: ").append(toIndentedString(isDestinationCommercial)).append("\n");
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

