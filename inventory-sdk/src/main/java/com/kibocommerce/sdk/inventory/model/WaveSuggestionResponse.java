/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.model.WaveSuggestionShipment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Wave suggestion response
 */
@ApiModel(description = "Wave suggestion response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class WaveSuggestionResponse {
  public static final String SERIALIZED_NAME_SHIPMENTS = "shipments";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS)
  private List<WaveSuggestionShipment> shipments = null;

  public WaveSuggestionResponse shipments(List<WaveSuggestionShipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public WaveSuggestionResponse addShipmentsItem(WaveSuggestionShipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<WaveSuggestionShipment>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * List of wave shipment suggestions
   * @return shipments
  **/
  @ApiModelProperty(value = "List of wave shipment suggestions")
  public List<WaveSuggestionShipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<WaveSuggestionShipment> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaveSuggestionResponse waveSuggestionResponse = (WaveSuggestionResponse) o;
    return Objects.equals(this.shipments, waveSuggestionResponse.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaveSuggestionResponse {\n");
    
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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

