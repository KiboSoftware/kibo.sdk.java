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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ManifestRequestShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class ManifestRequestShipment {
  public static final String SERIALIZED_NAME_INTEGRATOR_IDS = "integratorIds";
  @SerializedName(SERIALIZED_NAME_INTEGRATOR_IDS)
  private List<String> integratorIds = null;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public ManifestRequestShipment integratorIds(List<String> integratorIds) {
    this.integratorIds = integratorIds;
    return this;
  }

  public ManifestRequestShipment addIntegratorIdsItem(String integratorIdsItem) {
    if (this.integratorIds == null) {
      this.integratorIds = new ArrayList<String>();
    }
    this.integratorIds.add(integratorIdsItem);
    return this;
  }

   /**
   * Get integratorIds
   * @return integratorIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getIntegratorIds() {
    return integratorIds;
  }

  public void setIntegratorIds(List<String> integratorIds) {
    this.integratorIds = integratorIds;
  }

  public ManifestRequestShipment shipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Get shipmentNumber
   * @return shipmentNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getShipmentNumber() {
    return shipmentNumber;
  }

  public void setShipmentNumber(Integer shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestRequestShipment manifestRequestShipment = (ManifestRequestShipment) o;
    return Objects.equals(this.integratorIds, manifestRequestShipment.integratorIds) &&
        Objects.equals(this.shipmentNumber, manifestRequestShipment.shipmentNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integratorIds, shipmentNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestRequestShipment {\n");
    
    sb.append("    integratorIds: ").append(toIndentedString(integratorIds)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
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

