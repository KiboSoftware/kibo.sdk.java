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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsLocalizedImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MozuAppDevContractsLocalizedCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsLocalizedCategory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private MozuAppDevContractsLocalizedImage image = null;

  public MozuAppDevContractsLocalizedCategory id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MozuAppDevContractsLocalizedCategory localeCode(String localeCode) {
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Get localeCode
   * @return localeCode
  **/
  @ApiModelProperty(value = "")
  public String getLocaleCode() {
    return localeCode;
  }

  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }

  public MozuAppDevContractsLocalizedCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MozuAppDevContractsLocalizedCategory image(MozuAppDevContractsLocalizedImage image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public MozuAppDevContractsLocalizedImage getImage() {
    return image;
  }

  public void setImage(MozuAppDevContractsLocalizedImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsLocalizedCategory mozuAppDevContractsLocalizedCategory = (MozuAppDevContractsLocalizedCategory) o;
    return Objects.equals(this.id, mozuAppDevContractsLocalizedCategory.id) &&
        Objects.equals(this.localeCode, mozuAppDevContractsLocalizedCategory.localeCode) &&
        Objects.equals(this.name, mozuAppDevContractsLocalizedCategory.name) &&
        Objects.equals(this.image, mozuAppDevContractsLocalizedCategory.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, localeCode, name, image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsLocalizedCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
