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
import com.kibocommerce.sdk.inventory.model.AuditItemQuantity;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * AuditItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:31:33.449-05:00[America/Chicago]")
public class AuditItem extends BaseResponse {
  public static final String SERIALIZED_NAME_AUDIT_ITEM_I_D = "auditItemID";
  @SerializedName(SERIALIZED_NAME_AUDIT_ITEM_I_D)
  private Integer auditItemID;

  public static final String SERIALIZED_NAME_BIN_NAME = "binName";
  @SerializedName(SERIALIZED_NAME_BIN_NAME)
  private String binName;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private AuditItemQuantity product = null;

  public AuditItem auditItemID(Integer auditItemID) {
    this.auditItemID = auditItemID;
    return this;
  }

   /**
   * Audit Item identifier
   * @return auditItemID
  **/
  @ApiModelProperty(value = "Audit Item identifier")
  public Integer getAuditItemID() {
    return auditItemID;
  }

  public void setAuditItemID(Integer auditItemID) {
    this.auditItemID = auditItemID;
  }

  public AuditItem binName(String binName) {
    this.binName = binName;
    return this;
  }

   /**
   * Bin Name
   * @return binName
  **/
  @ApiModelProperty(value = "Bin Name")
  public String getBinName() {
    return binName;
  }

  public void setBinName(String binName) {
    this.binName = binName;
  }

  public AuditItem product(AuditItemQuantity product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public AuditItemQuantity getProduct() {
    return product;
  }

  public void setProduct(AuditItemQuantity product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditItem auditItem = (AuditItem) o;
    return Objects.equals(this.auditItemID, auditItem.auditItemID) &&
        Objects.equals(this.binName, auditItem.binName) &&
        Objects.equals(this.product, auditItem.product) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditItemID, binName, product, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditItemID: ").append(toIndentedString(auditItemID)).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
