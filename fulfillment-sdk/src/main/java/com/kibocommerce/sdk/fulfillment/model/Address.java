/*
 * Kibo Fulfillment API
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-02T09:23:50.115103-05:00[America/Chicago]")
public class Address {
  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_ADDRESS3 = "address3";
  @SerializedName(SERIALIZED_NAME_ADDRESS3)
  private String address3;

  public static final String SERIALIZED_NAME_ADDRESS4 = "address4";
  @SerializedName(SERIALIZED_NAME_ADDRESS4)
  private String address4;

  /**
   * Gets or Sets addressType
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    COMMERCIAL("Commercial"),
    
    RESIDENTIAL("Residential");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private AddressTypeEnum addressType;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CITY_OR_TOWN = "cityOrTown";
  @SerializedName(SERIALIZED_NAME_CITY_OR_TOWN)
  private String cityOrTown;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_IS_VALIDATED = "isValidated";
  @SerializedName(SERIALIZED_NAME_IS_VALIDATED)
  private Boolean isValidated;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_POSTAL_OR_ZIP_CODE = "postalOrZipCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_OR_ZIP_CODE)
  private String postalOrZipCode;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE = "stateOrProvince";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE)
  private String stateOrProvince;

  public Address address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Address address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Address address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Get address3
   * @return address3
  **/
  @ApiModelProperty(value = "")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Address address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Get address4
   * @return address4
  **/
  @ApiModelProperty(value = "")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Address addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public Address attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Address putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public Address cityOrTown(String cityOrTown) {
    this.cityOrTown = cityOrTown;
    return this;
  }

   /**
   * Get cityOrTown
   * @return cityOrTown
  **/
  @ApiModelProperty(value = "")
  public String getCityOrTown() {
    return cityOrTown;
  }

  public void setCityOrTown(String cityOrTown) {
    this.cityOrTown = cityOrTown;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

   /**
   * Get isValidated
   * @return isValidated
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsValidated() {
    return isValidated;
  }

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }

  public Address latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Address longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Address postalOrZipCode(String postalOrZipCode) {
    this.postalOrZipCode = postalOrZipCode;
    return this;
  }

   /**
   * Get postalOrZipCode
   * @return postalOrZipCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalOrZipCode() {
    return postalOrZipCode;
  }

  public void setPostalOrZipCode(String postalOrZipCode) {
    this.postalOrZipCode = postalOrZipCode;
  }

  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * Get stateOrProvince
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.address2, address.address2) &&
        Objects.equals(this.address3, address.address3) &&
        Objects.equals(this.address4, address.address4) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.attributes, address.attributes) &&
        Objects.equals(this.cityOrTown, address.cityOrTown) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.isValidated, address.isValidated) &&
        Objects.equals(this.latitude, address.latitude) &&
        Objects.equals(this.longitude, address.longitude) &&
        Objects.equals(this.postalOrZipCode, address.postalOrZipCode) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, addressType, attributes, cityOrTown, countryCode, isValidated, latitude, longitude, postalOrZipCode, stateOrProvince);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    cityOrTown: ").append(toIndentedString(cityOrTown)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    postalOrZipCode: ").append(toIndentedString(postalOrZipCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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
