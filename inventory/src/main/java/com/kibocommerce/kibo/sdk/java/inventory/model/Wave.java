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


package com.kibocommerce.kibo.sdk.java.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.kibo.sdk.java.inventory.model.WaveContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Wave Model
 */
@ApiModel(description = "Wave Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T11:18:39.656-05:00[America/Chicago]")
public class Wave {
  public static final String SERIALIZED_NAME_WAVE_I_D = "waveID";
  @SerializedName(SERIALIZED_NAME_WAVE_I_D)
  private Integer waveID;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Integer locationID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  /**
   * Order Type of the wave
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    ISPU("ISPU"),
    
    STH("STH"),
    
    TISPU("TISPU"),
    
    TRANSFER("TRANSFER"),
    
    DELIVERY("DELIVERY");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String text) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER_TYPE = "orderType";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrderTypeEnum orderType;

  /**
   * Type of wave
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NORMAL("NORMAL"),
    
    SPECIAL("SPECIAL"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Status of the wave
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ERROR("ERROR"),
    
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    CLOSED("CLOSED"),
    
    PENDING_RECOVERY("PENDING_RECOVERY");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<WaveContent> contents = null;

  public static final String SERIALIZED_NAME_RECOVERY_WAVE_I_D = "recoveryWaveID";
  @SerializedName(SERIALIZED_NAME_RECOVERY_WAVE_I_D)
  private Integer recoveryWaveID;

  public Wave waveID(Integer waveID) {
    this.waveID = waveID;
    return this;
  }

   /**
   * Wave Identifier
   * @return waveID
  **/
  @ApiModelProperty(value = "Wave Identifier")
  public Integer getWaveID() {
    return waveID;
  }

  public void setWaveID(Integer waveID) {
    this.waveID = waveID;
  }

  public Wave locationID(Integer locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Location Identifier
   * @return locationID
  **/
  @ApiModelProperty(value = "Location Identifier")
  public Integer getLocationID() {
    return locationID;
  }

  public void setLocationID(Integer locationID) {
    this.locationID = locationID;
  }

  public Wave created(String created) {
    this.created = created;
    return this;
  }

   /**
   * When the wave was created
   * @return created
  **/
  @ApiModelProperty(value = "When the wave was created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Wave userID(Integer userID) {
    this.userID = userID;
    return this;
  }

   /**
   * User Identifier for the wave creator
   * @return userID
  **/
  @ApiModelProperty(value = "User Identifier for the wave creator")
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public Wave orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Order Type of the wave
   * @return orderType
  **/
  @ApiModelProperty(value = "Order Type of the wave")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public Wave type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of wave
   * @return type
  **/
  @ApiModelProperty(value = "Type of wave")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Wave status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the wave
   * @return status
  **/
  @ApiModelProperty(value = "Status of the wave")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Wave contents(List<WaveContent> contents) {
    this.contents = contents;
    return this;
  }

  public Wave addContentsItem(WaveContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<WaveContent>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * List of Wave Contents
   * @return contents
  **/
  @ApiModelProperty(value = "List of Wave Contents")
  public List<WaveContent> getContents() {
    return contents;
  }

  public void setContents(List<WaveContent> contents) {
    this.contents = contents;
  }

  public Wave recoveryWaveID(Integer recoveryWaveID) {
    this.recoveryWaveID = recoveryWaveID;
    return this;
  }

   /**
   * Wave Recovery Identifier
   * @return recoveryWaveID
  **/
  @ApiModelProperty(value = "Wave Recovery Identifier")
  public Integer getRecoveryWaveID() {
    return recoveryWaveID;
  }

  public void setRecoveryWaveID(Integer recoveryWaveID) {
    this.recoveryWaveID = recoveryWaveID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wave wave = (Wave) o;
    return Objects.equals(this.waveID, wave.waveID) &&
        Objects.equals(this.locationID, wave.locationID) &&
        Objects.equals(this.created, wave.created) &&
        Objects.equals(this.userID, wave.userID) &&
        Objects.equals(this.orderType, wave.orderType) &&
        Objects.equals(this.type, wave.type) &&
        Objects.equals(this.status, wave.status) &&
        Objects.equals(this.contents, wave.contents) &&
        Objects.equals(this.recoveryWaveID, wave.recoveryWaveID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waveID, locationID, created, userID, orderType, type, status, contents, recoveryWaveID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wave {\n");
    
    sb.append("    waveID: ").append(toIndentedString(waveID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    recoveryWaveID: ").append(toIndentedString(recoveryWaveID)).append("\n");
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

