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
import java.util.ArrayList;
import java.util.List;

/**
 * FetchFileConnectionResponse
 */
@ApiModel(description = "FetchFileConnectionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class FetchFileConnectionResponse {
  public static final String SERIALIZED_NAME_FTP_FILES = "ftpFiles";
  @SerializedName(SERIALIZED_NAME_FTP_FILES)
  private List<String> ftpFiles = null;

  public static final String SERIALIZED_NAME_FTP_ARCHIVE_FILES = "ftpArchiveFiles";
  @SerializedName(SERIALIZED_NAME_FTP_ARCHIVE_FILES)
  private List<String> ftpArchiveFiles = null;

  public static final String SERIALIZED_NAME_S3_FILES = "s3Files";
  @SerializedName(SERIALIZED_NAME_S3_FILES)
  private List<String> s3Files = null;

  public static final String SERIALIZED_NAME_S3_ARCHIVE_FILES = "s3ArchiveFiles";
  @SerializedName(SERIALIZED_NAME_S3_ARCHIVE_FILES)
  private List<String> s3ArchiveFiles = null;

  public FetchFileConnectionResponse ftpFiles(List<String> ftpFiles) {
    this.ftpFiles = ftpFiles;
    return this;
  }

  public FetchFileConnectionResponse addFtpFilesItem(String ftpFilesItem) {
    if (this.ftpFiles == null) {
      this.ftpFiles = new ArrayList<String>();
    }
    this.ftpFiles.add(ftpFilesItem);
    return this;
  }

   /**
   * List of files found on the specified sftp directory
   * @return ftpFiles
  **/
  @ApiModelProperty(value = "List of files found on the specified sftp directory")
  public List<String> getFtpFiles() {
    return ftpFiles;
  }

  public void setFtpFiles(List<String> ftpFiles) {
    this.ftpFiles = ftpFiles;
  }

  public FetchFileConnectionResponse ftpArchiveFiles(List<String> ftpArchiveFiles) {
    this.ftpArchiveFiles = ftpArchiveFiles;
    return this;
  }

  public FetchFileConnectionResponse addFtpArchiveFilesItem(String ftpArchiveFilesItem) {
    if (this.ftpArchiveFiles == null) {
      this.ftpArchiveFiles = new ArrayList<String>();
    }
    this.ftpArchiveFiles.add(ftpArchiveFilesItem);
    return this;
  }

   /**
   * List of files found on the specified sftp archive directory
   * @return ftpArchiveFiles
  **/
  @ApiModelProperty(value = "List of files found on the specified sftp archive directory")
  public List<String> getFtpArchiveFiles() {
    return ftpArchiveFiles;
  }

  public void setFtpArchiveFiles(List<String> ftpArchiveFiles) {
    this.ftpArchiveFiles = ftpArchiveFiles;
  }

  public FetchFileConnectionResponse s3Files(List<String> s3Files) {
    this.s3Files = s3Files;
    return this;
  }

  public FetchFileConnectionResponse addS3FilesItem(String s3FilesItem) {
    if (this.s3Files == null) {
      this.s3Files = new ArrayList<String>();
    }
    this.s3Files.add(s3FilesItem);
    return this;
  }

   /**
   * List of files found on the specified s3 bucket/path
   * @return s3Files
  **/
  @ApiModelProperty(value = "List of files found on the specified s3 bucket/path")
  public List<String> getS3Files() {
    return s3Files;
  }

  public void setS3Files(List<String> s3Files) {
    this.s3Files = s3Files;
  }

  public FetchFileConnectionResponse s3ArchiveFiles(List<String> s3ArchiveFiles) {
    this.s3ArchiveFiles = s3ArchiveFiles;
    return this;
  }

  public FetchFileConnectionResponse addS3ArchiveFilesItem(String s3ArchiveFilesItem) {
    if (this.s3ArchiveFiles == null) {
      this.s3ArchiveFiles = new ArrayList<String>();
    }
    this.s3ArchiveFiles.add(s3ArchiveFilesItem);
    return this;
  }

   /**
   * List of files found on the specified s3 archive bucket/path
   * @return s3ArchiveFiles
  **/
  @ApiModelProperty(value = "List of files found on the specified s3 archive bucket/path")
  public List<String> getS3ArchiveFiles() {
    return s3ArchiveFiles;
  }

  public void setS3ArchiveFiles(List<String> s3ArchiveFiles) {
    this.s3ArchiveFiles = s3ArchiveFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchFileConnectionResponse fetchFileConnectionResponse = (FetchFileConnectionResponse) o;
    return Objects.equals(this.ftpFiles, fetchFileConnectionResponse.ftpFiles) &&
        Objects.equals(this.ftpArchiveFiles, fetchFileConnectionResponse.ftpArchiveFiles) &&
        Objects.equals(this.s3Files, fetchFileConnectionResponse.s3Files) &&
        Objects.equals(this.s3ArchiveFiles, fetchFileConnectionResponse.s3ArchiveFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ftpFiles, ftpArchiveFiles, s3Files, s3ArchiveFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchFileConnectionResponse {\n");
    
    sb.append("    ftpFiles: ").append(toIndentedString(ftpFiles)).append("\n");
    sb.append("    ftpArchiveFiles: ").append(toIndentedString(ftpArchiveFiles)).append("\n");
    sb.append("    s3Files: ").append(toIndentedString(s3Files)).append("\n");
    sb.append("    s3ArchiveFiles: ").append(toIndentedString(s3ArchiveFiles)).append("\n");
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

