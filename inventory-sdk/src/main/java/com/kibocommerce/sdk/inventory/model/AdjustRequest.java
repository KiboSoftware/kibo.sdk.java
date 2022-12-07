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
import com.kibocommerce.sdk.inventory.model.AdjustItem;
import com.kibocommerce.sdk.inventory.model.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AdjustRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class AdjustRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AdjustItem> items = null;

  public AdjustRequest items(List<AdjustItem> items) {
    this.items = items;
    return this;
  }

  public AdjustRequest addItemsItem(AdjustItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AdjustItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items to adjust
   * @return items
  **/
  @ApiModelProperty(value = "List of items to adjust")
  public List<AdjustItem> getItems() {
    return items;
  }

  public void setItems(List<AdjustItem> items) {
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
    AdjustRequest adjustRequest = (AdjustRequest) o;
    return Objects.equals(this.items, adjustRequest.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

