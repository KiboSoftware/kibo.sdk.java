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


package com.kibocommerce.kibo.sdk.java.auth.model;

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
import org.threeten.bp.OffsetDateTime;

/**
 * MozuCoreApiContractsAuditInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:01:23.422196-05:00[America/Chicago]")
public class MozuCoreApiContractsAuditInfo {
  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_UPDATE_BY = "updateBy";
  @SerializedName(SERIALIZED_NAME_UPDATE_BY)
  private String updateBy;

  public static final String SERIALIZED_NAME_CREATE_BY = "createBy";
  @SerializedName(SERIALIZED_NAME_CREATE_BY)
  private String createBy;

  public MozuCoreApiContractsAuditInfo updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public MozuCoreApiContractsAuditInfo createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public MozuCoreApiContractsAuditInfo updateBy(String updateBy) {
    this.updateBy = updateBy;
    return this;
  }

   /**
   * Get updateBy
   * @return updateBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public MozuCoreApiContractsAuditInfo createBy(String createBy) {
    this.createBy = createBy;
    return this;
  }

   /**
   * Get createBy
   * @return createBy
  **/
  @ApiModelProperty(value = "")
  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsAuditInfo mozuCoreApiContractsAuditInfo = (MozuCoreApiContractsAuditInfo) o;
    return Objects.equals(this.updateDate, mozuCoreApiContractsAuditInfo.updateDate) &&
        Objects.equals(this.createDate, mozuCoreApiContractsAuditInfo.createDate) &&
        Objects.equals(this.updateBy, mozuCoreApiContractsAuditInfo.updateBy) &&
        Objects.equals(this.createBy, mozuCoreApiContractsAuditInfo.createBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateDate, createDate, updateBy, createBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsAuditInfo {\n");
    
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
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

