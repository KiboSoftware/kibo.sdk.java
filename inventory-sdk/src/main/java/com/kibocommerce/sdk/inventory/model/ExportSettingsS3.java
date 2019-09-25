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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Export Settings S3
 */
@ApiModel(description = "Export Settings S3")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class ExportSettingsS3 {
  public static final String SERIALIZED_NAME_EXPORT_SETTINGS_I_D = "exportSettingsID";
  @SerializedName(SERIALIZED_NAME_EXPORT_SETTINGS_I_D)
  private Integer exportSettingsID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_S3_KEY = "s3Key";
  @SerializedName(SERIALIZED_NAME_S3_KEY)
  private String s3Key;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public ExportSettingsS3 exportSettingsID(Integer exportSettingsID) {
    this.exportSettingsID = exportSettingsID;
    return this;
  }

   /**
   * Export Settings ID
   * @return exportSettingsID
  **/
  @ApiModelProperty(value = "Export Settings ID")
  public Integer getExportSettingsID() {
    return exportSettingsID;
  }

  public void setExportSettingsID(Integer exportSettingsID) {
    this.exportSettingsID = exportSettingsID;
  }

  public ExportSettingsS3 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Export Settings S3 Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Export Settings S3 Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExportSettingsS3 active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Flag for Active State
   * @return active
  **/
  @ApiModelProperty(value = "Flag for Active State")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ExportSettingsS3 region(String region) {
    this.region = region;
    return this;
  }

   /**
   * S3 Region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "S3 Region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ExportSettingsS3 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * S3 Version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "S3 Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ExportSettingsS3 s3Key(String s3Key) {
    this.s3Key = s3Key;
    return this;
  }

   /**
   * S3 Key
   * @return s3Key
  **/
  @ApiModelProperty(value = "S3 Key")
  public String getS3Key() {
    return s3Key;
  }

  public void setS3Key(String s3Key) {
    this.s3Key = s3Key;
  }

  public ExportSettingsS3 secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * S3 Secret
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "S3 Secret")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public ExportSettingsS3 bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * S3 Bucket (directory)
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "S3 Bucket (directory)")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportSettingsS3 exportSettingsS3 = (ExportSettingsS3) o;
    return Objects.equals(this.exportSettingsID, exportSettingsS3.exportSettingsID) &&
        Objects.equals(this.name, exportSettingsS3.name) &&
        Objects.equals(this.active, exportSettingsS3.active) &&
        Objects.equals(this.region, exportSettingsS3.region) &&
        Objects.equals(this.version, exportSettingsS3.version) &&
        Objects.equals(this.s3Key, exportSettingsS3.s3Key) &&
        Objects.equals(this.secret, exportSettingsS3.secret) &&
        Objects.equals(this.bucket, exportSettingsS3.bucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportSettingsID, name, active, region, version, s3Key, secret, bucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportSettingsS3 {\n");
    
    sb.append("    exportSettingsID: ").append(toIndentedString(exportSettingsID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    s3Key: ").append(toIndentedString(s3Key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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

