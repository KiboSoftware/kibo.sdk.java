/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.models.InventoryTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kibocommerce.sdk.common.JSON;

/**
 * Request and response object for a tag category
 */
@ApiModel(description = "Request and response object for a tag category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TagCategory implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private List<InventoryTag> tags = null;

  public TagCategory() {
  }

  public TagCategory tagCategoryID(Integer tagCategoryID) {
    
    this.tagCategoryID = tagCategoryID;
    return this;
  }

   /**
   * Tag Category ID
   * @return tagCategoryID
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
      this.deletionJobIds = new ArrayList<>();
    }
    this.deletionJobIds.add(deletionJobIdsItem);
    return this;
  }

   /**
   * List of deletion job ID&#39;s
   * @return deletionJobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of deletion job ID's")

  public List<Integer> getDeletionJobIds() {
    return deletionJobIds;
  }


  public void setDeletionJobIds(List<Integer> deletionJobIds) {
    this.deletionJobIds = deletionJobIds;
  }


  public TagCategory tags(List<InventoryTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public TagCategory addTagsItem(InventoryTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags within this category
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags within this category")

  public List<InventoryTag> getTags() {
    return tags;
  }


  public void setTags(List<InventoryTag> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tagCategoryID");
    openapiFields.add("name");
    openapiFields.add("created");
    openapiFields.add("deletion_job_ids");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagCategory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagCategory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagCategory is not found in the empty JSON string", TagCategory.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TagCategory.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagCategory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("deletion_job_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletion_job_ids` to be an array in the JSON string but got `%s`", jsonObj.get("deletion_job_ids").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            InventoryTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<TagCategory>() {
           @Override
           public void write(JsonWriter out, TagCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagCategory
  * @throws IOException if the JSON string is invalid with respect to TagCategory
  */
  public static TagCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagCategory.class);
  }

 /**
  * Convert an instance of TagCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
