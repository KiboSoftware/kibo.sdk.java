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
 * Destination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class Destination {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public static final String SERIALIZED_NAME_DESTINATION_CONTACT = "destinationContact";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CONTACT)
  private Contact destinationContact = null;

  public static final String SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL = "isDestinationCommercial";
  @SerializedName(SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL)
  private Boolean isDestinationCommercial;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public Destination data(Object data) {
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

  public Destination destinationContact(Contact destinationContact) {
    this.destinationContact = destinationContact;
    return this;
  }

   /**
   * Get destinationContact
   * @return destinationContact
  **/
  @ApiModelProperty(value = "")
  public Contact getDestinationContact() {
    return destinationContact;
  }

  public void setDestinationContact(Contact destinationContact) {
    this.destinationContact = destinationContact;
  }

  public Destination isDestinationCommercial(Boolean isDestinationCommercial) {
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

  public Destination locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @ApiModelProperty(value = "")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.data, destination.data) &&
        Objects.equals(this.destinationContact, destination.destinationContact) &&
        Objects.equals(this.isDestinationCommercial, destination.isDestinationCommercial) &&
        Objects.equals(this.locationCode, destination.locationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, destinationContact, isDestinationCommercial, locationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    destinationContact: ").append(toIndentedString(destinationContact)).append("\n");
    sb.append("    isDestinationCommercial: ").append(toIndentedString(isDestinationCommercial)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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
