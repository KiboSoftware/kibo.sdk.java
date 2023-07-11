/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Image or video associated with a category.
 */
@ApiModel(description = "Image or video associated with a category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoryImage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMAGE_LABEL = "imageLabel";
  @SerializedName(SERIALIZED_NAME_IMAGE_LABEL)
  private String imageLabel;

  public static final String SERIALIZED_NAME_ALT_TEXT = "altText";
  @SerializedName(SERIALIZED_NAME_ALT_TEXT)
  private String altText;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_CMS_ID = "cmsId";
  @SerializedName(SERIALIZED_NAME_CMS_ID)
  private String cmsId;

  public static final String SERIALIZED_NAME_VIDEO_URL = "videoUrl";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public CategoryImage() {
  }

  public CategoryImage imageLabel(String imageLabel) {
    
    this.imageLabel = imageLabel;
    return this;
  }

   /**
   * Image title.  Unicode data with a maximum length of 50 characters.
   * @return imageLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image title.  Unicode data with a maximum length of 50 characters.")

  public String getImageLabel() {
    return imageLabel;
  }


  public void setImageLabel(String imageLabel) {
    this.imageLabel = imageLabel;
  }


  public CategoryImage altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * Descriptive text associated with the image. Unicode data with a maximum length of 200 characters.
   * @return altText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Descriptive text associated with the image. Unicode data with a maximum length of 200 characters.")

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }


  public CategoryImage imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image URL. Unicode data with a maximum length of 4000 characters.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image URL. Unicode data with a maximum length of 4000 characters.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public CategoryImage cmsId(String cmsId) {
    
    this.cmsId = cmsId;
    return this;
  }

   /**
   * Id of the image in the CMS.
   * @return cmsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the image in the CMS.")

  public String getCmsId() {
    return cmsId;
  }


  public void setCmsId(String cmsId) {
    this.cmsId = cmsId;
  }


  public CategoryImage videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * URL of the video. Unicode data with a maximum length of 4000 characters.
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the video. Unicode data with a maximum length of 4000 characters.")

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public CategoryImage mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Type of media. Used by the client to determine how to render the image or video or what have you.
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of media. Used by the client to determine how to render the image or video or what have you.")

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public CategoryImage sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * For categories with multiple images, the sequence is the order in which this image appears. Whole number data. Required.
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For categories with multiple images, the sequence is the order in which this image appears. Whole number data. Required.")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryImage categoryImage = (CategoryImage) o;
    return Objects.equals(this.imageLabel, categoryImage.imageLabel) &&
        Objects.equals(this.altText, categoryImage.altText) &&
        Objects.equals(this.imageUrl, categoryImage.imageUrl) &&
        Objects.equals(this.cmsId, categoryImage.cmsId) &&
        Objects.equals(this.videoUrl, categoryImage.videoUrl) &&
        Objects.equals(this.mediaType, categoryImage.mediaType) &&
        Objects.equals(this.sequence, categoryImage.sequence);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageLabel, altText, imageUrl, cmsId, videoUrl, mediaType, sequence);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryImage {\n");
    sb.append("    imageLabel: ").append(toIndentedString(imageLabel)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    cmsId: ").append(toIndentedString(cmsId)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("imageLabel");
    openapiFields.add("altText");
    openapiFields.add("imageUrl");
    openapiFields.add("cmsId");
    openapiFields.add("videoUrl");
    openapiFields.add("mediaType");
    openapiFields.add("sequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CategoryImage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CategoryImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoryImage is not found in the empty JSON string", CategoryImage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CategoryImage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CategoryImage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("imageLabel") != null && !jsonObj.get("imageLabel").isJsonNull()) && !jsonObj.get("imageLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageLabel").toString()));
      }
      if ((jsonObj.get("altText") != null && !jsonObj.get("altText").isJsonNull()) && !jsonObj.get("altText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `altText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("altText").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("cmsId") != null && !jsonObj.get("cmsId").isJsonNull()) && !jsonObj.get("cmsId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmsId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cmsId").toString()));
      }
      if ((jsonObj.get("videoUrl") != null && !jsonObj.get("videoUrl").isJsonNull()) && !jsonObj.get("videoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("videoUrl").toString()));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CategoryImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CategoryImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CategoryImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CategoryImage.class));

       return (TypeAdapter<T>) new TypeAdapter<CategoryImage>() {
           @Override
           public void write(JsonWriter out, CategoryImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CategoryImage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CategoryImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CategoryImage
  * @throws IOException if the JSON string is invalid with respect to CategoryImage
  */
  public static CategoryImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoryImage.class);
  }

 /**
  * Convert an instance of CategoryImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

