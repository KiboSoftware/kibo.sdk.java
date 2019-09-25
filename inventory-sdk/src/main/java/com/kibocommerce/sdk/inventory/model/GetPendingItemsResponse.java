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
import com.kibocommerce.sdk.inventory.model.PendingItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Get Pending Items Response
 */
@ApiModel(description = "Get Pending Items Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:31:58.472-05:00[America/Chicago]")
public class GetPendingItemsResponse {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PER_PAGE = "perPage";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_PREV_PAGE = "prevPage";
  @SerializedName(SERIALIZED_NAME_PREV_PAGE)
  private Integer prevPage;

  /**
   * Field to sort by
   */
  @JsonAdapter(SortByEnum.Adapter.class)
  public enum SortByEnum {
    QUANTITY("QUANTITY"),
    
    FROM("FROM"),
    
    TO("TO"),
    
    TYPE("TYPE"),
    
    ORDER_ID("ORDER_ID"),
    
    WEIGHT("WEIGHT");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortByEnum fromValue(String text) {
      for (SortByEnum b : SortByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SortByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortByEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortByEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private SortByEnum sortBy;

  public static final String SERIALIZED_NAME_SORT_ASCENDING = "sortAscending";
  @SerializedName(SERIALIZED_NAME_SORT_ASCENDING)
  private Boolean sortAscending;

  public static final String SERIALIZED_NAME_PENDING_ITEMS = "pendingItems";
  @SerializedName(SERIALIZED_NAME_PENDING_ITEMS)
  private List<PendingItem> pendingItems = null;

  public GetPendingItemsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total Count of pending items
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total Count of pending items")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public GetPendingItemsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number
   * @return page
  **/
  @ApiModelProperty(value = "Page number")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public GetPendingItemsResponse perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Number per page
   * @return perPage
  **/
  @ApiModelProperty(value = "Number per page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public GetPendingItemsResponse prevPage(Integer prevPage) {
    this.prevPage = prevPage;
    return this;
  }

   /**
   * Previous page
   * @return prevPage
  **/
  @ApiModelProperty(value = "Previous page")
  public Integer getPrevPage() {
    return prevPage;
  }

  public void setPrevPage(Integer prevPage) {
    this.prevPage = prevPage;
  }

  public GetPendingItemsResponse sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Field to sort by
   * @return sortBy
  **/
  @ApiModelProperty(value = "Field to sort by")
  public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }

  public GetPendingItemsResponse sortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
    return this;
  }

   /**
   * Flag to sort by ascending
   * @return sortAscending
  **/
  @ApiModelProperty(value = "Flag to sort by ascending")
  public Boolean getSortAscending() {
    return sortAscending;
  }

  public void setSortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
  }

  public GetPendingItemsResponse pendingItems(List<PendingItem> pendingItems) {
    this.pendingItems = pendingItems;
    return this;
  }

  public GetPendingItemsResponse addPendingItemsItem(PendingItem pendingItemsItem) {
    if (this.pendingItems == null) {
      this.pendingItems = new ArrayList<PendingItem>();
    }
    this.pendingItems.add(pendingItemsItem);
    return this;
  }

   /**
   * List of pending items
   * @return pendingItems
  **/
  @ApiModelProperty(value = "List of pending items")
  public List<PendingItem> getPendingItems() {
    return pendingItems;
  }

  public void setPendingItems(List<PendingItem> pendingItems) {
    this.pendingItems = pendingItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPendingItemsResponse getPendingItemsResponse = (GetPendingItemsResponse) o;
    return Objects.equals(this.totalCount, getPendingItemsResponse.totalCount) &&
        Objects.equals(this.page, getPendingItemsResponse.page) &&
        Objects.equals(this.perPage, getPendingItemsResponse.perPage) &&
        Objects.equals(this.prevPage, getPendingItemsResponse.prevPage) &&
        Objects.equals(this.sortBy, getPendingItemsResponse.sortBy) &&
        Objects.equals(this.sortAscending, getPendingItemsResponse.sortAscending) &&
        Objects.equals(this.pendingItems, getPendingItemsResponse.pendingItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, page, perPage, prevPage, sortBy, sortAscending, pendingItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPendingItemsResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortAscending: ").append(toIndentedString(sortAscending)).append("\n");
    sb.append("    pendingItems: ").append(toIndentedString(pendingItems)).append("\n");
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

