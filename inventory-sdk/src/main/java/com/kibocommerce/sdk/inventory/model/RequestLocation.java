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
import java.math.BigDecimal;

/**
 * Request Location
 */
@ApiModel(description = "Request Location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:31:58.472-05:00[America/Chicago]")
public class RequestLocation {
  /**
   * Unit of distance used for radius
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    MILES("MILES"),
    
    KM("KM");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit = UnitEnum.MILES;

  public static final String SERIALIZED_NAME_RADIUS = "radius";
  @SerializedName(SERIALIZED_NAME_RADIUS)
  private BigDecimal radius;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public RequestLocation unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit of distance used for radius
   * @return unit
  **/
  @ApiModelProperty(value = "Unit of distance used for radius")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public RequestLocation radius(BigDecimal radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Distance from location
   * @return radius
  **/
  @ApiModelProperty(value = "Distance from location")
  public BigDecimal getRadius() {
    return radius;
  }

  public void setRadius(BigDecimal radius) {
    this.radius = radius;
  }

  public RequestLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal Code of this location
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal Code of this location")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public RequestLocation latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude coordinate of this location
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude coordinate of this location")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public RequestLocation longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude coordinate of this location
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude coordinate of this location")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public RequestLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code for this location
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country Code for this location")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RequestLocation locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code for this location. This being set will trigger GetInventoryByLocation
   * @return locationCode
  **/
  @ApiModelProperty(value = "Location Code for this location. This being set will trigger GetInventoryByLocation")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestLocation requestLocation = (RequestLocation) o;
    return Objects.equals(this.unit, requestLocation.unit) &&
        Objects.equals(this.radius, requestLocation.radius) &&
        Objects.equals(this.postalCode, requestLocation.postalCode) &&
        Objects.equals(this.latitude, requestLocation.latitude) &&
        Objects.equals(this.longitude, requestLocation.longitude) &&
        Objects.equals(this.countryCode, requestLocation.countryCode) &&
        Objects.equals(this.locationCode, requestLocation.locationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, radius, postalCode, latitude, longitude, countryCode, locationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestLocation {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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

