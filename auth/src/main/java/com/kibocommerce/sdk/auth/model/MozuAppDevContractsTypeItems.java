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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsTypeItem;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsValidationItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsTypeItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsTypeItems {
  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private MozuAppDevContractsTypeItem selected = null;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private List<MozuAppDevContractsTypeItem> available = null;

  public static final String SERIALIZED_NAME_VALIDATION_ITEMS = "validationItems";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ITEMS)
  private List<MozuAppDevContractsValidationItem> validationItems = null;

  public MozuAppDevContractsTypeItems selected(MozuAppDevContractsTypeItem selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsTypeItem getSelected() {
    return selected;
  }

  public void setSelected(MozuAppDevContractsTypeItem selected) {
    this.selected = selected;
  }

  public MozuAppDevContractsTypeItems available(List<MozuAppDevContractsTypeItem> available) {
    this.available = available;
    return this;
  }

  public MozuAppDevContractsTypeItems addAvailableItem(MozuAppDevContractsTypeItem availableItem) {
    if (this.available == null) {
      this.available = new ArrayList<MozuAppDevContractsTypeItem>();
    }
    this.available.add(availableItem);
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsTypeItem> getAvailable() {
    return available;
  }

  public void setAvailable(List<MozuAppDevContractsTypeItem> available) {
    this.available = available;
  }

  public MozuAppDevContractsTypeItems validationItems(List<MozuAppDevContractsValidationItem> validationItems) {
    this.validationItems = validationItems;
    return this;
  }

  public MozuAppDevContractsTypeItems addValidationItemsItem(MozuAppDevContractsValidationItem validationItemsItem) {
    if (this.validationItems == null) {
      this.validationItems = new ArrayList<MozuAppDevContractsValidationItem>();
    }
    this.validationItems.add(validationItemsItem);
    return this;
  }

   /**
   * Get validationItems
   * @return validationItems
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsValidationItem> getValidationItems() {
    return validationItems;
  }

  public void setValidationItems(List<MozuAppDevContractsValidationItem> validationItems) {
    this.validationItems = validationItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsTypeItems mozuAppDevContractsTypeItems = (MozuAppDevContractsTypeItems) o;
    return Objects.equals(this.selected, mozuAppDevContractsTypeItems.selected) &&
        Objects.equals(this.available, mozuAppDevContractsTypeItems.available) &&
        Objects.equals(this.validationItems, mozuAppDevContractsTypeItems.validationItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selected, available, validationItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsTypeItems {\n");
    
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    validationItems: ").append(toIndentedString(validationItems)).append("\n");
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

