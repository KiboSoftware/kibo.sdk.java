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
import com.kibocommerce.sdk.fulfillment.model.PickWaveBinRange;
import com.kibocommerce.sdk.fulfillment.model.PickWaveProductMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * CreatePickWave
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-02T08:12:12.452367-05:00[America/Chicago]")
public class CreatePickWave {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_BIN_RANGES = "binRanges";
  @SerializedName(SERIALIZED_NAME_BIN_RANGES)
  private List<PickWaveBinRange> binRanges = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_INCLUDE_ZERO_INVENTORY = "includeZeroInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ZERO_INVENTORY)
  private Boolean includeZeroInventory;

  public static final String SERIALIZED_NAME_LOCK_WAVE = "lockWave";
  @SerializedName(SERIALIZED_NAME_LOCK_WAVE)
  private Boolean lockWave;

  public static final String SERIALIZED_NAME_MAX_SHIPMENTS = "maxShipments";
  @SerializedName(SERIALIZED_NAME_MAX_SHIPMENTS)
  private Integer maxShipments;

  /**
   * Gets or Sets pickWaveType
   */
  @JsonAdapter(PickWaveTypeEnum.Adapter.class)
  public enum PickWaveTypeEnum {
    SPECIAL("SPECIAL"),
    
    NORMAL("NORMAL"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    PickWaveTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickWaveTypeEnum fromValue(String text) {
      for (PickWaveTypeEnum b : PickWaveTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PickWaveTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickWaveTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickWaveTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PickWaveTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_WAVE_TYPE = "pickWaveType";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_TYPE)
  private PickWaveTypeEnum pickWaveType;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<PickWaveProductMatch> products = null;

  public static final String SERIALIZED_NAME_SHIPMENT_DATE_END = "shipmentDateEnd";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE_END)
  private OffsetDateTime shipmentDateEnd;

  public static final String SERIALIZED_NAME_SHIPMENT_DATE_START = "shipmentDateStart";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE_START)
  private OffsetDateTime shipmentDateStart;

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private String shipmentType;

  /**
   * Gets or Sets shippingOption
   */
  @JsonAdapter(ShippingOptionEnum.Adapter.class)
  public enum ShippingOptionEnum {
    STANDARD_ONLY("STANDARD_ONLY"),
    
    EXPRESS_ONLY("EXPRESS_ONLY"),
    
    ALL("ALL");

    private String value;

    ShippingOptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingOptionEnum fromValue(String text) {
      for (ShippingOptionEnum b : ShippingOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingOptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingOptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingOptionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShippingOptionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_OPTION = "shippingOption";
  @SerializedName(SERIALIZED_NAME_SHIPPING_OPTION)
  private ShippingOptionEnum shippingOption;

  public CreatePickWave attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public CreatePickWave putAttributesItem(String key, Object attributesItem) {
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

  public CreatePickWave binRanges(List<PickWaveBinRange> binRanges) {
    this.binRanges = binRanges;
    return this;
  }

  public CreatePickWave addBinRangesItem(PickWaveBinRange binRangesItem) {
    if (this.binRanges == null) {
      this.binRanges = new ArrayList<PickWaveBinRange>();
    }
    this.binRanges.add(binRangesItem);
    return this;
  }

   /**
   * Get binRanges
   * @return binRanges
  **/
  @ApiModelProperty(value = "")
  public List<PickWaveBinRange> getBinRanges() {
    return binRanges;
  }

  public void setBinRanges(List<PickWaveBinRange> binRanges) {
    this.binRanges = binRanges;
  }

  public CreatePickWave fulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @ApiModelProperty(value = "")
  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }

  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }

  public CreatePickWave includeZeroInventory(Boolean includeZeroInventory) {
    this.includeZeroInventory = includeZeroInventory;
    return this;
  }

   /**
   * Get includeZeroInventory
   * @return includeZeroInventory
  **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeZeroInventory() {
    return includeZeroInventory;
  }

  public void setIncludeZeroInventory(Boolean includeZeroInventory) {
    this.includeZeroInventory = includeZeroInventory;
  }

  public CreatePickWave lockWave(Boolean lockWave) {
    this.lockWave = lockWave;
    return this;
  }

   /**
   * Get lockWave
   * @return lockWave
  **/
  @ApiModelProperty(value = "")
  public Boolean getLockWave() {
    return lockWave;
  }

  public void setLockWave(Boolean lockWave) {
    this.lockWave = lockWave;
  }

  public CreatePickWave maxShipments(Integer maxShipments) {
    this.maxShipments = maxShipments;
    return this;
  }

   /**
   * Get maxShipments
   * @return maxShipments
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxShipments() {
    return maxShipments;
  }

  public void setMaxShipments(Integer maxShipments) {
    this.maxShipments = maxShipments;
  }

  public CreatePickWave pickWaveType(PickWaveTypeEnum pickWaveType) {
    this.pickWaveType = pickWaveType;
    return this;
  }

   /**
   * Get pickWaveType
   * @return pickWaveType
  **/
  @ApiModelProperty(value = "")
  public PickWaveTypeEnum getPickWaveType() {
    return pickWaveType;
  }

  public void setPickWaveType(PickWaveTypeEnum pickWaveType) {
    this.pickWaveType = pickWaveType;
  }

  public CreatePickWave products(List<PickWaveProductMatch> products) {
    this.products = products;
    return this;
  }

  public CreatePickWave addProductsItem(PickWaveProductMatch productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<PickWaveProductMatch>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")
  public List<PickWaveProductMatch> getProducts() {
    return products;
  }

  public void setProducts(List<PickWaveProductMatch> products) {
    this.products = products;
  }

  public CreatePickWave shipmentDateEnd(OffsetDateTime shipmentDateEnd) {
    this.shipmentDateEnd = shipmentDateEnd;
    return this;
  }

   /**
   * Get shipmentDateEnd
   * @return shipmentDateEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShipmentDateEnd() {
    return shipmentDateEnd;
  }

  public void setShipmentDateEnd(OffsetDateTime shipmentDateEnd) {
    this.shipmentDateEnd = shipmentDateEnd;
  }

  public CreatePickWave shipmentDateStart(OffsetDateTime shipmentDateStart) {
    this.shipmentDateStart = shipmentDateStart;
    return this;
  }

   /**
   * Get shipmentDateStart
   * @return shipmentDateStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShipmentDateStart() {
    return shipmentDateStart;
  }

  public void setShipmentDateStart(OffsetDateTime shipmentDateStart) {
    this.shipmentDateStart = shipmentDateStart;
  }

  public CreatePickWave shipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(value = "")
  public String getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }

  public CreatePickWave shippingOption(ShippingOptionEnum shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

   /**
   * Get shippingOption
   * @return shippingOption
  **/
  @ApiModelProperty(value = "")
  public ShippingOptionEnum getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(ShippingOptionEnum shippingOption) {
    this.shippingOption = shippingOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePickWave createPickWave = (CreatePickWave) o;
    return Objects.equals(this.attributes, createPickWave.attributes) &&
        Objects.equals(this.binRanges, createPickWave.binRanges) &&
        Objects.equals(this.fulfillmentLocationCode, createPickWave.fulfillmentLocationCode) &&
        Objects.equals(this.includeZeroInventory, createPickWave.includeZeroInventory) &&
        Objects.equals(this.lockWave, createPickWave.lockWave) &&
        Objects.equals(this.maxShipments, createPickWave.maxShipments) &&
        Objects.equals(this.pickWaveType, createPickWave.pickWaveType) &&
        Objects.equals(this.products, createPickWave.products) &&
        Objects.equals(this.shipmentDateEnd, createPickWave.shipmentDateEnd) &&
        Objects.equals(this.shipmentDateStart, createPickWave.shipmentDateStart) &&
        Objects.equals(this.shipmentType, createPickWave.shipmentType) &&
        Objects.equals(this.shippingOption, createPickWave.shippingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, binRanges, fulfillmentLocationCode, includeZeroInventory, lockWave, maxShipments, pickWaveType, products, shipmentDateEnd, shipmentDateStart, shipmentType, shippingOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePickWave {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    binRanges: ").append(toIndentedString(binRanges)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    includeZeroInventory: ").append(toIndentedString(includeZeroInventory)).append("\n");
    sb.append("    lockWave: ").append(toIndentedString(lockWave)).append("\n");
    sb.append("    maxShipments: ").append(toIndentedString(maxShipments)).append("\n");
    sb.append("    pickWaveType: ").append(toIndentedString(pickWaveType)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    shipmentDateEnd: ").append(toIndentedString(shipmentDateEnd)).append("\n");
    sb.append("    shipmentDateStart: ").append(toIndentedString(shipmentDateStart)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
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

