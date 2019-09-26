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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Version
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class Version {
  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private Integer major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Integer minor;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private Integer build;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_MAJOR_REVISION = "majorRevision";
  @SerializedName(SERIALIZED_NAME_MAJOR_REVISION)
  private Integer majorRevision;

  public static final String SERIALIZED_NAME_MINOR_REVISION = "minorRevision";
  @SerializedName(SERIALIZED_NAME_MINOR_REVISION)
  private Integer minorRevision;

   /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(value = "")
  public Integer getMajor() {
    return major;
  }

   /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(value = "")
  public Integer getMinor() {
    return minor;
  }

   /**
   * Get build
   * @return build
  **/
  @ApiModelProperty(value = "")
  public Integer getBuild() {
    return build;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public Integer getRevision() {
    return revision;
  }

   /**
   * Get majorRevision
   * @return majorRevision
  **/
  @ApiModelProperty(value = "")
  public Integer getMajorRevision() {
    return majorRevision;
  }

   /**
   * Get minorRevision
   * @return minorRevision
  **/
  @ApiModelProperty(value = "")
  public Integer getMinorRevision() {
    return minorRevision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.major, version.major) &&
        Objects.equals(this.minor, version.minor) &&
        Objects.equals(this.build, version.build) &&
        Objects.equals(this.revision, version.revision) &&
        Objects.equals(this.majorRevision, version.majorRevision) &&
        Objects.equals(this.minorRevision, version.minorRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, build, revision, majorRevision, minorRevision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    majorRevision: ").append(toIndentedString(majorRevision)).append("\n");
    sb.append("    minorRevision: ").append(toIndentedString(minorRevision)).append("\n");
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

