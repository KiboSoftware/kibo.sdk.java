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


package com.kibocommerce.kibo.sdk.java.auth.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.kibo.sdk.java.auth.model.MozuReferenceContractsCountry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuReferenceContractsCountryCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuReferenceContractsCountryCollection {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<MozuReferenceContractsCountry> items = null;

  public MozuReferenceContractsCountryCollection totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public MozuReferenceContractsCountryCollection items(List<MozuReferenceContractsCountry> items) {
    this.items = items;
    return this;
  }

  public MozuReferenceContractsCountryCollection addItemsItem(MozuReferenceContractsCountry itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MozuReferenceContractsCountry>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<MozuReferenceContractsCountry> getItems() {
    return items;
  }

  public void setItems(List<MozuReferenceContractsCountry> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuReferenceContractsCountryCollection mozuReferenceContractsCountryCollection = (MozuReferenceContractsCountryCollection) o;
    return Objects.equals(this.totalCount, mozuReferenceContractsCountryCollection.totalCount) &&
        Objects.equals(this.items, mozuReferenceContractsCountryCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuReferenceContractsCountryCollection {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

