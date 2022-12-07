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
import com.kibocommerce.sdk.inventory.model.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request and response object for a tag category
 */
@ApiModel(description = "Request and response object for a tag category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class TagCategory {
  public static final String SERIALIZED_NAME_TAG_CATEGORY_I_D = "tagCategoryID";
  @SerializedName(SERIALIZED_NAME_TAG_CATEGORY_I_D)
  private Integer tagCategoryID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_DELETION_JOB_IDS = "deletion_job_ids";
  @SerializedName(SERIALIZED_NAME_DELETION_JOB_IDS)
  private List<Integer> deletionJobIds = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public TagCategory tagCategoryID(Integer tagCategoryID) {
    this.tagCategoryID = tagCategoryID;
    return this;
  }

   /**
   * Tag Category ID
   * @return tagCategoryID
  **/
  @ApiModelProperty(value = "Tag Category ID")
  public Integer getTagCategoryID() {
    return tagCategoryID;
  }

  public void setTagCategoryID(Integer tagCategoryID) {
    this.tagCategoryID = tagCategoryID;
  }

  public TagCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tag Category Name
   * @return name
  **/
  @ApiModelProperty(value = "Tag Category Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagCategory created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date tag category was created.
   * @return created
  **/
  @ApiModelProperty(value = "Date tag category was created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public TagCategory deletionJobIds(List<Integer> deletionJobIds) {
    this.deletionJobIds = deletionJobIds;
    return this;
  }

  public TagCategory addDeletionJobIdsItem(Integer deletionJobIdsItem) {
    if (this.deletionJobIds == null) {
      this.deletionJobIds = new ArrayList<Integer>();
    }
    this.deletionJobIds.add(deletionJobIdsItem);
    return this;
  }

   /**
   * List of deletion job ID&#39;s
   * @return deletionJobIds
  **/
  @ApiModelProperty(value = "List of deletion job ID's")
  public List<Integer> getDeletionJobIds() {
    return deletionJobIds;
  }

  public void setDeletionJobIds(List<Integer> deletionJobIds) {
    this.deletionJobIds = deletionJobIds;
  }

  public TagCategory tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public TagCategory addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags within this category
   * @return tags
  **/
  @ApiModelProperty(value = "Tags within this category")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagCategory tagCategory = (TagCategory) o;
    return Objects.equals(this.tagCategoryID, tagCategory.tagCategoryID) &&
        Objects.equals(this.name, tagCategory.name) &&
        Objects.equals(this.created, tagCategory.created) &&
        Objects.equals(this.deletionJobIds, tagCategory.deletionJobIds) &&
        Objects.equals(this.tags, tagCategory.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagCategoryID, name, created, deletionJobIds, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagCategory {\n");
    
    sb.append("    tagCategoryID: ").append(toIndentedString(tagCategoryID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deletionJobIds: ").append(toIndentedString(deletionJobIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
