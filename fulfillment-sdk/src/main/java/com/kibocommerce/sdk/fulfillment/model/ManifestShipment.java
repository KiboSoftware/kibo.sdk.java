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
import com.kibocommerce.sdk.fulfillment.model.Destination;
import com.kibocommerce.sdk.fulfillment.model.ModelPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ManifestShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class ManifestShipment {
  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private Destination destination = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ORDER_ID = "externalOrderId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORDER_ID)
  private String externalOrderId;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<ModelPackage> packages = null;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBER = "shipmentNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBER)
  private Integer shipmentNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private String shipmentType;

  public ManifestShipment destination(Destination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public ManifestShipment externalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
    return this;
  }

   /**
   * Get externalOrderId
   * @return externalOrderId
  **/
  @ApiModelProperty(value = "")
  public String getExternalOrderId() {
    return externalOrderId;
  }

  public void setExternalOrderId(String externalOrderId) {
    this.externalOrderId = externalOrderId;
  }

  public ManifestShipment fulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @ApiModelProperty(value = "")
  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }

  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }

  public ManifestShipment orderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public ManifestShipment packages(List<ModelPackage> packages) {
    this.packages = packages;
    return this;
  }

  public ManifestShipment addPackagesItem(ModelPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<ModelPackage>();
    }
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(value = "")
  public List<ModelPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<ModelPackage> packages) {
    this.packages = packages;
  }

  public ManifestShipment shipmentNumber(Integer shipmentNumber) {
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

  public ManifestShipment shipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(value = "")
  public String getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestShipment manifestShipment = (ManifestShipment) o;
    return Objects.equals(this.destination, manifestShipment.destination) &&
        Objects.equals(this.externalOrderId, manifestShipment.externalOrderId) &&
        Objects.equals(this.fulfillmentLocationCode, manifestShipment.fulfillmentLocationCode) &&
        Objects.equals(this.orderNumber, manifestShipment.orderNumber) &&
        Objects.equals(this.packages, manifestShipment.packages) &&
        Objects.equals(this.shipmentNumber, manifestShipment.shipmentNumber) &&
        Objects.equals(this.shipmentType, manifestShipment.shipmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, externalOrderId, fulfillmentLocationCode, orderNumber, packages, shipmentNumber, shipmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestShipment {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    externalOrderId: ").append(toIndentedString(externalOrderId)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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

