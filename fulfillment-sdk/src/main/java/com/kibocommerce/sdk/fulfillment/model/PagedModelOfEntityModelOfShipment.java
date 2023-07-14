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
import com.kibocommerce.sdk.fulfillment.model.EntityModelOfShipment;
import com.kibocommerce.sdk.fulfillment.model.Links;
import com.kibocommerce.sdk.fulfillment.model.PageMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PagedModelOfEntityModelOfShipment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class PagedModelOfEntityModelOfShipment {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private Map<String, List<EntityModelOfShipment>> embedded = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private PageMetadata page = null;

  public PagedModelOfEntityModelOfShipment embedded(Map<String, List<EntityModelOfShipment>> embedded) {
    this.embedded = embedded;
    return this;
  }

  public PagedModelOfEntityModelOfShipment putEmbeddedItem(String key, List<EntityModelOfShipment> embeddedItem) {
    if (this.embedded == null) {
      this.embedded = new HashMap<String, List<EntityModelOfShipment>>();
    }
    this.embedded.put(key, embeddedItem);
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<EntityModelOfShipment>> getEmbedded() {
    return embedded;
  }

  public void setEmbedded(Map<String, List<EntityModelOfShipment>> embedded) {
    this.embedded = embedded;
  }

  public PagedModelOfEntityModelOfShipment links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public PagedModelOfEntityModelOfShipment page(PageMetadata page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public PageMetadata getPage() {
    return page;
  }

  public void setPage(PageMetadata page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelOfEntityModelOfShipment pagedModelOfEntityModelOfShipment = (PagedModelOfEntityModelOfShipment) o;
    return Objects.equals(this.embedded, pagedModelOfEntityModelOfShipment.embedded) &&
        Objects.equals(this.links, pagedModelOfEntityModelOfShipment.links) &&
        Objects.equals(this.page, pagedModelOfEntityModelOfShipment.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelOfEntityModelOfShipment {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
