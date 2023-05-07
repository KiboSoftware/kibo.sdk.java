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
 * Location Request Object
 */
@ApiModel(description = "Location Request Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class LocationRequest {
  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_EXPRESS = "express";
  @SerializedName(SERIALIZED_NAME_EXPRESS)
  private Boolean express;

  public static final String SERIALIZED_NAME_INCLUDE_IN_LOCATION_EXPORT = "includeInLocationExport";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_LOCATION_EXPORT)
  private Boolean includeInLocationExport;

  public static final String SERIALIZED_NAME_INCLUDE_IN_AGGREGATE = "includeInAggregate";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_AGGREGATE)
  private Boolean includeInAggregate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private Boolean directShip;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_TRANSFER_ENABLED = "transferEnabled";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ENABLED)
  private Boolean transferEnabled;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Float latitude = null;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Float longitude = null;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_WMS_ENABLED = "wmsEnabled";
  @SerializedName(SERIALIZED_NAME_WMS_ENABLED)
  private Boolean wmsEnabled;

  public LocationRequest tenantID(Integer tenantID) {
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantID
  **/
  @ApiModelProperty(required = true, value = "Tenant ID")
  public Integer getTenantID() {
    return tenantID;
  }

  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }

  public LocationRequest locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @ApiModelProperty(required = true, value = "Location Code")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public LocationRequest express(Boolean express) {
    this.express = express;
    return this;
  }

   /**
   * Flag for whether the location is express enabled or not
   * @return express
  **/
  @ApiModelProperty(value = "Flag for whether the location is express enabled or not")
  public Boolean getExpress() {
    return express;
  }

  public void setExpress(Boolean express) {
    this.express = express;
  }

  public LocationRequest includeInLocationExport(Boolean includeInLocationExport) {
    this.includeInLocationExport = includeInLocationExport;
    return this;
  }

   /**
   * Flag for whether the location is to be included in location exports
   * @return includeInLocationExport
  **/
  @ApiModelProperty(value = "Flag for whether the location is to be included in location exports")
  public Boolean getIncludeInLocationExport() {
    return includeInLocationExport;
  }

  public void setIncludeInLocationExport(Boolean includeInLocationExport) {
    this.includeInLocationExport = includeInLocationExport;
  }

  public LocationRequest includeInAggregate(Boolean includeInAggregate) {
    this.includeInAggregate = includeInAggregate;
    return this;
  }

   /**
   * Flag for whether the location is to be included in aggregate exports
   * @return includeInAggregate
  **/
  @ApiModelProperty(value = "Flag for whether the location is to be included in aggregate exports")
  public Boolean getIncludeInAggregate() {
    return includeInAggregate;
  }

  public void setIncludeInAggregate(Boolean includeInAggregate) {
    this.includeInAggregate = includeInAggregate;
  }

  public LocationRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Flag for whether the location is active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Flag for whether the location is active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public LocationRequest directShip(Boolean directShip) {
    this.directShip = directShip;
    return this;
  }

   /**
   * Flag for whether the location allows Direct Ship (STH) orders
   * @return directShip
  **/
  @ApiModelProperty(required = true, value = "Flag for whether the location allows Direct Ship (STH) orders")
  public Boolean getDirectShip() {
    return directShip;
  }

  public void setDirectShip(Boolean directShip) {
    this.directShip = directShip;
  }

  public LocationRequest pickup(Boolean pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Flag for whether the location allows Pickup (BOPIS) orders
   * @return pickup
  **/
  @ApiModelProperty(required = true, value = "Flag for whether the location allows Pickup (BOPIS) orders")
  public Boolean getPickup() {
    return pickup;
  }

  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }

  public LocationRequest transferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
    return this;
  }

   /**
   * Flag for whether the location allows Transfer orders
   * @return transferEnabled
  **/
  @ApiModelProperty(value = "Flag for whether the location allows Transfer orders")
  public Boolean getTransferEnabled() {
    return transferEnabled;
  }

  public void setTransferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
  }

  public LocationRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal Code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public LocationRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country Code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public LocationRequest latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public LocationRequest longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public LocationRequest locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Location Name
   * @return locationName
  **/
  @ApiModelProperty(required = true, value = "Location Name")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public LocationRequest wmsEnabled(Boolean wmsEnabled) {
    this.wmsEnabled = wmsEnabled;
    return this;
  }

   /**
   * Flag for whether the location is WMS Enabled
   * @return wmsEnabled
  **/
  @ApiModelProperty(value = "Flag for whether the location is WMS Enabled")
  public Boolean getWmsEnabled() {
    return wmsEnabled;
  }

  public void setWmsEnabled(Boolean wmsEnabled) {
    this.wmsEnabled = wmsEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationRequest locationRequest = (LocationRequest) o;
    return Objects.equals(this.tenantID, locationRequest.tenantID) &&
        Objects.equals(this.locationCode, locationRequest.locationCode) &&
        Objects.equals(this.express, locationRequest.express) &&
        Objects.equals(this.includeInLocationExport, locationRequest.includeInLocationExport) &&
        Objects.equals(this.includeInAggregate, locationRequest.includeInAggregate) &&
        Objects.equals(this.active, locationRequest.active) &&
        Objects.equals(this.directShip, locationRequest.directShip) &&
        Objects.equals(this.pickup, locationRequest.pickup) &&
        Objects.equals(this.transferEnabled, locationRequest.transferEnabled) &&
        Objects.equals(this.postalCode, locationRequest.postalCode) &&
        Objects.equals(this.countryCode, locationRequest.countryCode) &&
        Objects.equals(this.latitude, locationRequest.latitude) &&
        Objects.equals(this.longitude, locationRequest.longitude) &&
        Objects.equals(this.locationName, locationRequest.locationName) &&
        Objects.equals(this.wmsEnabled, locationRequest.wmsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantID, locationCode, express, includeInLocationExport, includeInAggregate, active, directShip, pickup, transferEnabled, postalCode, countryCode, latitude, longitude, locationName, wmsEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationRequest {\n");
    
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    express: ").append(toIndentedString(express)).append("\n");
    sb.append("    includeInLocationExport: ").append(toIndentedString(includeInLocationExport)).append("\n");
    sb.append("    includeInAggregate: ").append(toIndentedString(includeInAggregate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    transferEnabled: ").append(toIndentedString(transferEnabled)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    wmsEnabled: ").append(toIndentedString(wmsEnabled)).append("\n");
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

