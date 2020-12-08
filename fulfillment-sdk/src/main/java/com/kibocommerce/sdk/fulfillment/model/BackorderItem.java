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
import org.threeten.bp.OffsetDateTime;

/**
 * BackorderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class BackorderItem {
  public static final String SERIALIZED_NAME_BACKORDER_RELEASE_DATE = "backorderReleaseDate";
  @SerializedName(SERIALIZED_NAME_BACKORDER_RELEASE_DATE)
  private OffsetDateTime backorderReleaseDate;

  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private Integer lineId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public BackorderItem backorderReleaseDate(OffsetDateTime backorderReleaseDate) {
    this.backorderReleaseDate = backorderReleaseDate;
    return this;
  }

   /**
   * Get backorderReleaseDate
   * @return backorderReleaseDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBackorderReleaseDate() {
    return backorderReleaseDate;
  }

  public void setBackorderReleaseDate(OffsetDateTime backorderReleaseDate) {
    this.backorderReleaseDate = backorderReleaseDate;
  }

  public BackorderItem lineId(Integer lineId) {
    this.lineId = lineId;
    return this;
  }

   /**
   * Get lineId
   * @return lineId
  **/
  @ApiModelProperty(value = "")
  public Integer getLineId() {
    return lineId;
  }

  public void setLineId(Integer lineId) {
    this.lineId = lineId;
  }

  public BackorderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackorderItem backorderItem = (BackorderItem) o;
    return Objects.equals(this.backorderReleaseDate, backorderItem.backorderReleaseDate) &&
        Objects.equals(this.lineId, backorderItem.lineId) &&
        Objects.equals(this.quantity, backorderItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backorderReleaseDate, lineId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackorderItem {\n");
    
    sb.append("    backorderReleaseDate: ").append(toIndentedString(backorderReleaseDate)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

