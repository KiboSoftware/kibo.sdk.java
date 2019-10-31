/*
 * Kibo Fulfillment API
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
import com.kibocommerce.sdk.fulfillment.model.Link;
import com.kibocommerce.sdk.fulfillment.model.ResourceOfWorkflowProcess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourcesOfResourceOfWorkflowProcess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-31T10:37:23.152728-05:00[America/Chicago]")
public class ResourcesOfResourceOfWorkflowProcess {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private List<ResourceOfWorkflowProcess> embedded = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = null;

  public ResourcesOfResourceOfWorkflowProcess embedded(List<ResourceOfWorkflowProcess> embedded) {
    this.embedded = embedded;
    return this;
  }

  public ResourcesOfResourceOfWorkflowProcess addEmbeddedItem(ResourceOfWorkflowProcess embeddedItem) {
    if (this.embedded == null) {
      this.embedded = new ArrayList<ResourceOfWorkflowProcess>();
    }
    this.embedded.add(embeddedItem);
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public List<ResourceOfWorkflowProcess> getEmbedded() {
    return embedded;
  }

  public void setEmbedded(List<ResourceOfWorkflowProcess> embedded) {
    this.embedded = embedded;
  }

  public ResourcesOfResourceOfWorkflowProcess links(Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public ResourcesOfResourceOfWorkflowProcess putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, Link>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Map<String, Link> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesOfResourceOfWorkflowProcess resourcesOfResourceOfWorkflowProcess = (ResourcesOfResourceOfWorkflowProcess) o;
    return Objects.equals(this.embedded, resourcesOfResourceOfWorkflowProcess.embedded) &&
        Objects.equals(this.links, resourcesOfResourceOfWorkflowProcess.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesOfResourceOfWorkflowProcess {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

