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
 * MozuCoreApiContractsPhone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuCoreApiContractsPhone {
  public static final String SERIALIZED_NAME_HOME = "home";
  @SerializedName(SERIALIZED_NAME_HOME)
  private String home;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  private String work;

  public MozuCoreApiContractsPhone home(String home) {
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @ApiModelProperty(value = "")
  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public MozuCoreApiContractsPhone mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(value = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public MozuCoreApiContractsPhone work(String work) {
    this.work = work;
    return this;
  }

   /**
   * Get work
   * @return work
  **/
  @ApiModelProperty(value = "")
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuCoreApiContractsPhone mozuCoreApiContractsPhone = (MozuCoreApiContractsPhone) o;
    return Objects.equals(this.home, mozuCoreApiContractsPhone.home) &&
        Objects.equals(this.mobile, mozuCoreApiContractsPhone.mobile) &&
        Objects.equals(this.work, mozuCoreApiContractsPhone.work);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, mobile, work);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuCoreApiContractsPhone {\n");
    
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
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
