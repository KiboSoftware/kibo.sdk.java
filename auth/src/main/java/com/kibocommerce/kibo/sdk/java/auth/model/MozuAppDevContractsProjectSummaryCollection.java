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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsProjectSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsProjectSummaryCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuAppDevContractsProjectSummaryCollection {
  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "pageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<MozuAppDevContractsProjectSummary> items = null;

  public MozuAppDevContractsProjectSummaryCollection startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MozuAppDevContractsProjectSummaryCollection pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public MozuAppDevContractsProjectSummaryCollection pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public MozuAppDevContractsProjectSummaryCollection totalCount(Integer totalCount) {
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

  public MozuAppDevContractsProjectSummaryCollection items(List<MozuAppDevContractsProjectSummary> items) {
    this.items = items;
    return this;
  }

  public MozuAppDevContractsProjectSummaryCollection addItemsItem(MozuAppDevContractsProjectSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MozuAppDevContractsProjectSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsProjectSummary> getItems() {
    return items;
  }

  public void setItems(List<MozuAppDevContractsProjectSummary> items) {
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
    MozuAppDevContractsProjectSummaryCollection mozuAppDevContractsProjectSummaryCollection = (MozuAppDevContractsProjectSummaryCollection) o;
    return Objects.equals(this.startIndex, mozuAppDevContractsProjectSummaryCollection.startIndex) &&
        Objects.equals(this.pageSize, mozuAppDevContractsProjectSummaryCollection.pageSize) &&
        Objects.equals(this.pageCount, mozuAppDevContractsProjectSummaryCollection.pageCount) &&
        Objects.equals(this.totalCount, mozuAppDevContractsProjectSummaryCollection.totalCount) &&
        Objects.equals(this.items, mozuAppDevContractsProjectSummaryCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, pageSize, pageCount, totalCount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsProjectSummaryCollection {\n");
    
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
