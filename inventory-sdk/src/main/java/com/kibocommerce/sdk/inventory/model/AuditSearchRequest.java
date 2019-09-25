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
import com.kibocommerce.sdk.inventory.model.BaseRequest;
import com.kibocommerce.sdk.inventory.model.DateRange;
import com.kibocommerce.sdk.inventory.model.ProductMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuditSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class AuditSearchRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_AUDIT_I_D = "auditID";
  @SerializedName(SERIALIZED_NAME_AUDIT_I_D)
  private Integer auditID;

  public static final String SERIALIZED_NAME_BIN_NAME = "binName";
  @SerializedName(SERIALIZED_NAME_BIN_NAME)
  private String binName;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "auditStatus";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_DATE_RANGE = "dateRange";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private DateRange dateRange = null;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ProductMatch> products = null;

  public AuditSearchRequest auditID(Integer auditID) {
    this.auditID = auditID;
    return this;
  }

   /**
   * Audit identifier
   * @return auditID
  **/
  @ApiModelProperty(value = "Audit identifier")
  public Integer getAuditID() {
    return auditID;
  }

  public void setAuditID(Integer auditID) {
    this.auditID = auditID;
  }

  public AuditSearchRequest binName(String binName) {
    this.binName = binName;
    return this;
  }

   /**
   * Name of the bin
   * @return binName
  **/
  @ApiModelProperty(value = "Name of the bin")
  public String getBinName() {
    return binName;
  }

  public void setBinName(String binName) {
    this.binName = binName;
  }

  public AuditSearchRequest auditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Audit Status
   * @return auditStatus
  **/
  @ApiModelProperty(value = "Audit Status")
  public String getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }

  public AuditSearchRequest dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @ApiModelProperty(value = "")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public AuditSearchRequest products(List<ProductMatch> products) {
    this.products = products;
    return this;
  }

  public AuditSearchRequest addProductsItem(ProductMatch productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<ProductMatch>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * List of matching products
   * @return products
  **/
  @ApiModelProperty(value = "List of matching products")
  public List<ProductMatch> getProducts() {
    return products;
  }

  public void setProducts(List<ProductMatch> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditSearchRequest auditSearchRequest = (AuditSearchRequest) o;
    return Objects.equals(this.auditID, auditSearchRequest.auditID) &&
        Objects.equals(this.binName, auditSearchRequest.binName) &&
        Objects.equals(this.auditStatus, auditSearchRequest.auditStatus) &&
        Objects.equals(this.dateRange, auditSearchRequest.dateRange) &&
        Objects.equals(this.products, auditSearchRequest.products) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditID, binName, auditStatus, dateRange, products, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditID: ").append(toIndentedString(auditID)).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

