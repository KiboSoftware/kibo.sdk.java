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
import com.kibocommerce.sdk.inventory.model.Audit;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuditSearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class AuditSearchResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_AUDITS = "audits";
  @SerializedName(SERIALIZED_NAME_AUDITS)
  private List<Audit> audits = null;

  public AuditSearchResponse audits(List<Audit> audits) {
    this.audits = audits;
    return this;
  }

  public AuditSearchResponse addAuditsItem(Audit auditsItem) {
    if (this.audits == null) {
      this.audits = new ArrayList<Audit>();
    }
    this.audits.add(auditsItem);
    return this;
  }

   /**
   * List of found audits
   * @return audits
  **/
  @ApiModelProperty(value = "List of found audits")
  public List<Audit> getAudits() {
    return audits;
  }

  public void setAudits(List<Audit> audits) {
    this.audits = audits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditSearchResponse auditSearchResponse = (AuditSearchResponse) o;
    return Objects.equals(this.audits, auditSearchResponse.audits) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audits, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditSearchResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    audits: ").append(toIndentedString(audits)).append("\n");
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

