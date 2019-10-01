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
import com.kibocommerce.sdk.fulfillment.model.AuditInfo;
import com.kibocommerce.sdk.fulfillment.model.Link;
import com.kibocommerce.sdk.fulfillment.model.PickWaveContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourceOfPickWave
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-01T15:17:07.337463-05:00[America/Chicago]")
public class ResourceOfPickWave {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<PickWaveContent> contents = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_MAX_SHIPMENTS = "maxShipments";
  @SerializedName(SERIALIZED_NAME_MAX_SHIPMENTS)
  private Integer maxShipments;

  public static final String SERIALIZED_NAME_PARENT_PICK_WAVE_NUMBER = "parentPickWaveNumber";
  @SerializedName(SERIALIZED_NAME_PARENT_PICK_WAVE_NUMBER)
  private Integer parentPickWaveNumber;

  /**
   * Gets or Sets pickType
   */
  @JsonAdapter(PickTypeEnum.Adapter.class)
  public enum PickTypeEnum {
    SPECIAL("SPECIAL"),
    
    NORMAL("NORMAL"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    PickTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickTypeEnum fromValue(String text) {
      for (PickTypeEnum b : PickTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PickTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PickTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_TYPE = "pickType";
  @SerializedName(SERIALIZED_NAME_PICK_TYPE)
  private PickTypeEnum pickType;

  public static final String SERIALIZED_NAME_PICK_WAVE_ID = "pickWaveId";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_ID)
  private String pickWaveId;

  public static final String SERIALIZED_NAME_PICK_WAVE_NUMBER = "pickWaveNumber";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_NUMBER)
  private Integer pickWaveNumber;

  /**
   * Gets or Sets pickWaveStatus
   */
  @JsonAdapter(PickWaveStatusEnum.Adapter.class)
  public enum PickWaveStatusEnum {
    ERROR("ERROR"),
    
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    CLOSED("CLOSED"),
    
    PENDING_RECOVERY("PENDING_RECOVERY");

    private String value;

    PickWaveStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickWaveStatusEnum fromValue(String text) {
      for (PickWaveStatusEnum b : PickWaveStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PickWaveStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickWaveStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickWaveStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PickWaveStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_WAVE_STATUS = "pickWaveStatus";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_STATUS)
  private PickWaveStatusEnum pickWaveStatus;

  public static final String SERIALIZED_NAME_RECOVERY_PICK_WAVE_NUMBER = "recoveryPickWaveNumber";
  @SerializedName(SERIALIZED_NAME_RECOVERY_PICK_WAVE_NUMBER)
  private Integer recoveryPickWaveNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBERS = "shipmentNumbers";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBERS)
  private List<Integer> shipmentNumbers = null;

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private String shipmentType;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ResourceOfPickWave links(Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public ResourceOfPickWave putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, Link>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Map<String, Link> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }

  public ResourceOfPickWave attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ResourceOfPickWave putAttributesItem(String key, Object attributesItem) {
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

  public ResourceOfPickWave auditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @ApiModelProperty(value = "")
  public AuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }

  public ResourceOfPickWave contents(List<PickWaveContent> contents) {
    this.contents = contents;
    return this;
  }

  public ResourceOfPickWave addContentsItem(PickWaveContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<PickWaveContent>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @ApiModelProperty(value = "")
  public List<PickWaveContent> getContents() {
    return contents;
  }

  public void setContents(List<PickWaveContent> contents) {
    this.contents = contents;
  }

  public ResourceOfPickWave fulfillmentLocationCode(String fulfillmentLocationCode) {
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

  public ResourceOfPickWave maxShipments(Integer maxShipments) {
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

  public ResourceOfPickWave parentPickWaveNumber(Integer parentPickWaveNumber) {
    this.parentPickWaveNumber = parentPickWaveNumber;
    return this;
  }

   /**
   * Get parentPickWaveNumber
   * @return parentPickWaveNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getParentPickWaveNumber() {
    return parentPickWaveNumber;
  }

  public void setParentPickWaveNumber(Integer parentPickWaveNumber) {
    this.parentPickWaveNumber = parentPickWaveNumber;
  }

  public ResourceOfPickWave pickType(PickTypeEnum pickType) {
    this.pickType = pickType;
    return this;
  }

   /**
   * Get pickType
   * @return pickType
  **/
  @ApiModelProperty(value = "")
  public PickTypeEnum getPickType() {
    return pickType;
  }

  public void setPickType(PickTypeEnum pickType) {
    this.pickType = pickType;
  }

  public ResourceOfPickWave pickWaveId(String pickWaveId) {
    this.pickWaveId = pickWaveId;
    return this;
  }

   /**
   * Get pickWaveId
   * @return pickWaveId
  **/
  @ApiModelProperty(value = "")
  public String getPickWaveId() {
    return pickWaveId;
  }

  public void setPickWaveId(String pickWaveId) {
    this.pickWaveId = pickWaveId;
  }

  public ResourceOfPickWave pickWaveNumber(Integer pickWaveNumber) {
    this.pickWaveNumber = pickWaveNumber;
    return this;
  }

   /**
   * Get pickWaveNumber
   * @return pickWaveNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPickWaveNumber() {
    return pickWaveNumber;
  }

  public void setPickWaveNumber(Integer pickWaveNumber) {
    this.pickWaveNumber = pickWaveNumber;
  }

  public ResourceOfPickWave pickWaveStatus(PickWaveStatusEnum pickWaveStatus) {
    this.pickWaveStatus = pickWaveStatus;
    return this;
  }

   /**
   * Get pickWaveStatus
   * @return pickWaveStatus
  **/
  @ApiModelProperty(value = "")
  public PickWaveStatusEnum getPickWaveStatus() {
    return pickWaveStatus;
  }

  public void setPickWaveStatus(PickWaveStatusEnum pickWaveStatus) {
    this.pickWaveStatus = pickWaveStatus;
  }

  public ResourceOfPickWave recoveryPickWaveNumber(Integer recoveryPickWaveNumber) {
    this.recoveryPickWaveNumber = recoveryPickWaveNumber;
    return this;
  }

   /**
   * Get recoveryPickWaveNumber
   * @return recoveryPickWaveNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getRecoveryPickWaveNumber() {
    return recoveryPickWaveNumber;
  }

  public void setRecoveryPickWaveNumber(Integer recoveryPickWaveNumber) {
    this.recoveryPickWaveNumber = recoveryPickWaveNumber;
  }

  public ResourceOfPickWave shipmentNumbers(List<Integer> shipmentNumbers) {
    this.shipmentNumbers = shipmentNumbers;
    return this;
  }

  public ResourceOfPickWave addShipmentNumbersItem(Integer shipmentNumbersItem) {
    if (this.shipmentNumbers == null) {
      this.shipmentNumbers = new ArrayList<Integer>();
    }
    this.shipmentNumbers.add(shipmentNumbersItem);
    return this;
  }

   /**
   * Get shipmentNumbers
   * @return shipmentNumbers
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getShipmentNumbers() {
    return shipmentNumbers;
  }

  public void setShipmentNumbers(List<Integer> shipmentNumbers) {
    this.shipmentNumbers = shipmentNumbers;
  }

  public ResourceOfPickWave shipmentType(String shipmentType) {
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

  public ResourceOfPickWave siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public ResourceOfPickWave tenantId(Integer tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public Integer getTenantId() {
    return tenantId;
  }

  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }

  public ResourceOfPickWave userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceOfPickWave resourceOfPickWave = (ResourceOfPickWave) o;
    return Objects.equals(this.links, resourceOfPickWave.links) &&
        Objects.equals(this.attributes, resourceOfPickWave.attributes) &&
        Objects.equals(this.auditInfo, resourceOfPickWave.auditInfo) &&
        Objects.equals(this.contents, resourceOfPickWave.contents) &&
        Objects.equals(this.fulfillmentLocationCode, resourceOfPickWave.fulfillmentLocationCode) &&
        Objects.equals(this.maxShipments, resourceOfPickWave.maxShipments) &&
        Objects.equals(this.parentPickWaveNumber, resourceOfPickWave.parentPickWaveNumber) &&
        Objects.equals(this.pickType, resourceOfPickWave.pickType) &&
        Objects.equals(this.pickWaveId, resourceOfPickWave.pickWaveId) &&
        Objects.equals(this.pickWaveNumber, resourceOfPickWave.pickWaveNumber) &&
        Objects.equals(this.pickWaveStatus, resourceOfPickWave.pickWaveStatus) &&
        Objects.equals(this.recoveryPickWaveNumber, resourceOfPickWave.recoveryPickWaveNumber) &&
        Objects.equals(this.shipmentNumbers, resourceOfPickWave.shipmentNumbers) &&
        Objects.equals(this.shipmentType, resourceOfPickWave.shipmentType) &&
        Objects.equals(this.siteId, resourceOfPickWave.siteId) &&
        Objects.equals(this.tenantId, resourceOfPickWave.tenantId) &&
        Objects.equals(this.userId, resourceOfPickWave.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, attributes, auditInfo, contents, fulfillmentLocationCode, maxShipments, parentPickWaveNumber, pickType, pickWaveId, pickWaveNumber, pickWaveStatus, recoveryPickWaveNumber, shipmentNumbers, shipmentType, siteId, tenantId, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceOfPickWave {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    maxShipments: ").append(toIndentedString(maxShipments)).append("\n");
    sb.append("    parentPickWaveNumber: ").append(toIndentedString(parentPickWaveNumber)).append("\n");
    sb.append("    pickType: ").append(toIndentedString(pickType)).append("\n");
    sb.append("    pickWaveId: ").append(toIndentedString(pickWaveId)).append("\n");
    sb.append("    pickWaveNumber: ").append(toIndentedString(pickWaveNumber)).append("\n");
    sb.append("    pickWaveStatus: ").append(toIndentedString(pickWaveStatus)).append("\n");
    sb.append("    recoveryPickWaveNumber: ").append(toIndentedString(recoveryPickWaveNumber)).append("\n");
    sb.append("    shipmentNumbers: ").append(toIndentedString(shipmentNumbers)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

