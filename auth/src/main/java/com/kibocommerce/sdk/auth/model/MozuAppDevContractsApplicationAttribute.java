/*
 * Kibo AppDev Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.auth.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsApplicationAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsApplicationAttribute {
  public static final String SERIALIZED_NAME_SUBSYSTEM = "subsystem";
  @SerializedName(SERIALIZED_NAME_SUBSYSTEM)
  private String subsystem;

  public static final String SERIALIZED_NAME_ATTRIBUTE_JSON = "attributeJson";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_JSON)
  private String attributeJson;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE_JSON = "productTypeJson";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_JSON)
  private String productTypeJson;

  public static final String SERIALIZED_NAME_IS_APPLIED_TO_BASE = "isAppliedToBase";
  @SerializedName(SERIALIZED_NAME_IS_APPLIED_TO_BASE)
  private Boolean isAppliedToBase;

  public static final String SERIALIZED_NAME_SOURCE_TENANT_ID = "sourceTenantId";
  @SerializedName(SERIALIZED_NAME_SOURCE_TENANT_ID)
  private Integer sourceTenantId;

  public static final String SERIALIZED_NAME_SOURCE_TENANT_NAME = "sourceTenantName";
  @SerializedName(SERIALIZED_NAME_SOURCE_TENANT_NAME)
  private String sourceTenantName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODES = "attributeCodes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODES)
  private String attributeCodes;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "packageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<MozuAppDevContractsAttribute> attributes = null;

  public MozuAppDevContractsApplicationAttribute subsystem(String subsystem) {
    this.subsystem = subsystem;
    return this;
  }

   /**
   * Get subsystem
   * @return subsystem
  **/
  @ApiModelProperty(value = "")
  public String getSubsystem() {
    return subsystem;
  }

  public void setSubsystem(String subsystem) {
    this.subsystem = subsystem;
  }

  public MozuAppDevContractsApplicationAttribute attributeJson(String attributeJson) {
    this.attributeJson = attributeJson;
    return this;
  }

   /**
   * Get attributeJson
   * @return attributeJson
  **/
  @ApiModelProperty(value = "")
  public String getAttributeJson() {
    return attributeJson;
  }

  public void setAttributeJson(String attributeJson) {
    this.attributeJson = attributeJson;
  }

  public MozuAppDevContractsApplicationAttribute productTypeJson(String productTypeJson) {
    this.productTypeJson = productTypeJson;
    return this;
  }

   /**
   * Get productTypeJson
   * @return productTypeJson
  **/
  @ApiModelProperty(value = "")
  public String getProductTypeJson() {
    return productTypeJson;
  }

  public void setProductTypeJson(String productTypeJson) {
    this.productTypeJson = productTypeJson;
  }

  public MozuAppDevContractsApplicationAttribute isAppliedToBase(Boolean isAppliedToBase) {
    this.isAppliedToBase = isAppliedToBase;
    return this;
  }

   /**
   * Get isAppliedToBase
   * @return isAppliedToBase
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsAppliedToBase() {
    return isAppliedToBase;
  }

  public void setIsAppliedToBase(Boolean isAppliedToBase) {
    this.isAppliedToBase = isAppliedToBase;
  }

  public MozuAppDevContractsApplicationAttribute sourceTenantId(Integer sourceTenantId) {
    this.sourceTenantId = sourceTenantId;
    return this;
  }

   /**
   * Get sourceTenantId
   * @return sourceTenantId
  **/
  @ApiModelProperty(value = "")
  public Integer getSourceTenantId() {
    return sourceTenantId;
  }

  public void setSourceTenantId(Integer sourceTenantId) {
    this.sourceTenantId = sourceTenantId;
  }

  public MozuAppDevContractsApplicationAttribute sourceTenantName(String sourceTenantName) {
    this.sourceTenantName = sourceTenantName;
    return this;
  }

   /**
   * Get sourceTenantName
   * @return sourceTenantName
  **/
  @ApiModelProperty(value = "")
  public String getSourceTenantName() {
    return sourceTenantName;
  }

  public void setSourceTenantName(String sourceTenantName) {
    this.sourceTenantName = sourceTenantName;
  }

  public MozuAppDevContractsApplicationAttribute attributeCodes(String attributeCodes) {
    this.attributeCodes = attributeCodes;
    return this;
  }

   /**
   * Get attributeCodes
   * @return attributeCodes
  **/
  @ApiModelProperty(value = "")
  public String getAttributeCodes() {
    return attributeCodes;
  }

  public void setAttributeCodes(String attributeCodes) {
    this.attributeCodes = attributeCodes;
  }

  public MozuAppDevContractsApplicationAttribute packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }

  public MozuAppDevContractsApplicationAttribute attributes(List<MozuAppDevContractsAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public MozuAppDevContractsApplicationAttribute addAttributesItem(MozuAppDevContractsAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<MozuAppDevContractsAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<MozuAppDevContractsAttribute> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsApplicationAttribute mozuAppDevContractsApplicationAttribute = (MozuAppDevContractsApplicationAttribute) o;
    return Objects.equals(this.subsystem, mozuAppDevContractsApplicationAttribute.subsystem) &&
        Objects.equals(this.attributeJson, mozuAppDevContractsApplicationAttribute.attributeJson) &&
        Objects.equals(this.productTypeJson, mozuAppDevContractsApplicationAttribute.productTypeJson) &&
        Objects.equals(this.isAppliedToBase, mozuAppDevContractsApplicationAttribute.isAppliedToBase) &&
        Objects.equals(this.sourceTenantId, mozuAppDevContractsApplicationAttribute.sourceTenantId) &&
        Objects.equals(this.sourceTenantName, mozuAppDevContractsApplicationAttribute.sourceTenantName) &&
        Objects.equals(this.attributeCodes, mozuAppDevContractsApplicationAttribute.attributeCodes) &&
        Objects.equals(this.packageId, mozuAppDevContractsApplicationAttribute.packageId) &&
        Objects.equals(this.attributes, mozuAppDevContractsApplicationAttribute.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subsystem, attributeJson, productTypeJson, isAppliedToBase, sourceTenantId, sourceTenantName, attributeCodes, packageId, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsApplicationAttribute {\n");
    
    sb.append("    subsystem: ").append(toIndentedString(subsystem)).append("\n");
    sb.append("    attributeJson: ").append(toIndentedString(attributeJson)).append("\n");
    sb.append("    productTypeJson: ").append(toIndentedString(productTypeJson)).append("\n");
    sb.append("    isAppliedToBase: ").append(toIndentedString(isAppliedToBase)).append("\n");
    sb.append("    sourceTenantId: ").append(toIndentedString(sourceTenantId)).append("\n");
    sb.append("    sourceTenantName: ").append(toIndentedString(sourceTenantName)).append("\n");
    sb.append("    attributeCodes: ").append(toIndentedString(attributeCodes)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
