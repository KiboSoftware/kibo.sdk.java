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
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LocationGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class LocationGroupResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_LOCATION_GROUP_I_D = "locationGroupID";
  @SerializedName(SERIALIZED_NAME_LOCATION_GROUP_I_D)
  private Integer locationGroupID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_LOCATION_GROUP_CODE = "locationGroupCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_GROUP_CODE)
  private String locationGroupCode;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_ADMIN_LOCATION_GROUP_I_D = "adminLocationGroupID";
  @SerializedName(SERIALIZED_NAME_ADMIN_LOCATION_GROUP_I_D)
  private Integer adminLocationGroupID;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<Integer> sites = null;

  public static final String SERIALIZED_NAME_LOCATION_CODES = "locationCodes";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODES)
  private List<String> locationCodes = null;

  public LocationGroupResponse locationGroupID(Integer locationGroupID) {
    this.locationGroupID = locationGroupID;
    return this;
  }

   /**
   * Location Group ID
   * @return locationGroupID
  **/
  @ApiModelProperty(value = "Location Group ID")
  public Integer getLocationGroupID() {
    return locationGroupID;
  }

  public void setLocationGroupID(Integer locationGroupID) {
    this.locationGroupID = locationGroupID;
  }

  public LocationGroupResponse tenantID(Integer tenantID) {
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantID
  **/
  @ApiModelProperty(value = "Tenant ID")
  public Integer getTenantID() {
    return tenantID;
  }

  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }

  public LocationGroupResponse locationGroupCode(String locationGroupCode) {
    this.locationGroupCode = locationGroupCode;
    return this;
  }

   /**
   * Location Group Code
   * @return locationGroupCode
  **/
  @ApiModelProperty(value = "Location Group Code")
  public String getLocationGroupCode() {
    return locationGroupCode;
  }

  public void setLocationGroupCode(String locationGroupCode) {
    this.locationGroupCode = locationGroupCode;
  }

  public LocationGroupResponse created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created
   * @return created
  **/
  @ApiModelProperty(value = "Created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public LocationGroupResponse adminLocationGroupID(Integer adminLocationGroupID) {
    this.adminLocationGroupID = adminLocationGroupID;
    return this;
  }

   /**
   * Admin Location Group ID
   * @return adminLocationGroupID
  **/
  @ApiModelProperty(value = "Admin Location Group ID")
  public Integer getAdminLocationGroupID() {
    return adminLocationGroupID;
  }

  public void setAdminLocationGroupID(Integer adminLocationGroupID) {
    this.adminLocationGroupID = adminLocationGroupID;
  }

  public LocationGroupResponse sites(List<Integer> sites) {
    this.sites = sites;
    return this;
  }

  public LocationGroupResponse addSitesItem(Integer sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<Integer>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * Site IDs
   * @return sites
  **/
  @ApiModelProperty(value = "Site IDs")
  public List<Integer> getSites() {
    return sites;
  }

  public void setSites(List<Integer> sites) {
    this.sites = sites;
  }

  public LocationGroupResponse locationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
    return this;
  }

  public LocationGroupResponse addLocationCodesItem(String locationCodesItem) {
    if (this.locationCodes == null) {
      this.locationCodes = new ArrayList<String>();
    }
    this.locationCodes.add(locationCodesItem);
    return this;
  }

   /**
   * Location IDs
   * @return locationCodes
  **/
  @ApiModelProperty(value = "Location IDs")
  public List<String> getLocationCodes() {
    return locationCodes;
  }

  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationGroupResponse locationGroupResponse = (LocationGroupResponse) o;
    return Objects.equals(this.locationGroupID, locationGroupResponse.locationGroupID) &&
        Objects.equals(this.tenantID, locationGroupResponse.tenantID) &&
        Objects.equals(this.locationGroupCode, locationGroupResponse.locationGroupCode) &&
        Objects.equals(this.created, locationGroupResponse.created) &&
        Objects.equals(this.adminLocationGroupID, locationGroupResponse.adminLocationGroupID) &&
        Objects.equals(this.sites, locationGroupResponse.sites) &&
        Objects.equals(this.locationCodes, locationGroupResponse.locationCodes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationGroupID, tenantID, locationGroupCode, created, adminLocationGroupID, sites, locationCodes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationGroupResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    locationGroupID: ").append(toIndentedString(locationGroupID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    locationGroupCode: ").append(toIndentedString(locationGroupCode)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    adminLocationGroupID: ").append(toIndentedString(adminLocationGroupID)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
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

