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
 * MozuAppDevContractsAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:21:37.137-05:00[America/Chicago]")
public class MozuAppDevContractsAttribute {
  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attributeId";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
  private Integer attributeId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_FQN = "fqn";
  @SerializedName(SERIALIZED_NAME_FQN)
  private String fqn;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_VOCABULARY_JSON = "vocabularyJson";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_JSON)
  private String vocabularyJson;

  public static final String SERIALIZED_NAME_APPLICATION_ATTRIBUTE_ID = "applicationAttributeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ATTRIBUTE_ID)
  private Integer applicationAttributeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "inputType";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  private String inputType;

  public static final String SERIALIZED_NAME_ADMIN_NAME = "adminName";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_VOCABULARY_VALUES = "vocabularyValues";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_VALUES)
  private String vocabularyValues;

  public MozuAppDevContractsAttribute attributeId(Integer attributeId) {
    this.attributeId = attributeId;
    return this;
  }

   /**
   * Get attributeId
   * @return attributeId
  **/
  @ApiModelProperty(value = "")
  public Integer getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

  public MozuAppDevContractsAttribute code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public MozuAppDevContractsAttribute type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MozuAppDevContractsAttribute fqn(String fqn) {
    this.fqn = fqn;
    return this;
  }

   /**
   * Get fqn
   * @return fqn
  **/
  @ApiModelProperty(value = "")
  public String getFqn() {
    return fqn;
  }

  public void setFqn(String fqn) {
    this.fqn = fqn;
  }

  public MozuAppDevContractsAttribute sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public MozuAppDevContractsAttribute vocabularyJson(String vocabularyJson) {
    this.vocabularyJson = vocabularyJson;
    return this;
  }

   /**
   * Get vocabularyJson
   * @return vocabularyJson
  **/
  @ApiModelProperty(value = "")
  public String getVocabularyJson() {
    return vocabularyJson;
  }

  public void setVocabularyJson(String vocabularyJson) {
    this.vocabularyJson = vocabularyJson;
  }

  public MozuAppDevContractsAttribute applicationAttributeId(Integer applicationAttributeId) {
    this.applicationAttributeId = applicationAttributeId;
    return this;
  }

   /**
   * Get applicationAttributeId
   * @return applicationAttributeId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationAttributeId() {
    return applicationAttributeId;
  }

  public void setApplicationAttributeId(Integer applicationAttributeId) {
    this.applicationAttributeId = applicationAttributeId;
  }

  public MozuAppDevContractsAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MozuAppDevContractsAttribute inputType(String inputType) {
    this.inputType = inputType;
    return this;
  }

   /**
   * Get inputType
   * @return inputType
  **/
  @ApiModelProperty(value = "")
  public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public MozuAppDevContractsAttribute adminName(String adminName) {
    this.adminName = adminName;
    return this;
  }

   /**
   * Get adminName
   * @return adminName
  **/
  @ApiModelProperty(value = "")
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public MozuAppDevContractsAttribute vocabularyValues(String vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
    return this;
  }

   /**
   * Get vocabularyValues
   * @return vocabularyValues
  **/
  @ApiModelProperty(value = "")
  public String getVocabularyValues() {
    return vocabularyValues;
  }

  public void setVocabularyValues(String vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MozuAppDevContractsAttribute mozuAppDevContractsAttribute = (MozuAppDevContractsAttribute) o;
    return Objects.equals(this.attributeId, mozuAppDevContractsAttribute.attributeId) &&
        Objects.equals(this.code, mozuAppDevContractsAttribute.code) &&
        Objects.equals(this.type, mozuAppDevContractsAttribute.type) &&
        Objects.equals(this.fqn, mozuAppDevContractsAttribute.fqn) &&
        Objects.equals(this.sequence, mozuAppDevContractsAttribute.sequence) &&
        Objects.equals(this.vocabularyJson, mozuAppDevContractsAttribute.vocabularyJson) &&
        Objects.equals(this.applicationAttributeId, mozuAppDevContractsAttribute.applicationAttributeId) &&
        Objects.equals(this.name, mozuAppDevContractsAttribute.name) &&
        Objects.equals(this.inputType, mozuAppDevContractsAttribute.inputType) &&
        Objects.equals(this.adminName, mozuAppDevContractsAttribute.adminName) &&
        Objects.equals(this.vocabularyValues, mozuAppDevContractsAttribute.vocabularyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, code, type, fqn, sequence, vocabularyJson, applicationAttributeId, name, inputType, adminName, vocabularyValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsAttribute {\n");
    
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    vocabularyJson: ").append(toIndentedString(vocabularyJson)).append("\n");
    sb.append("    applicationAttributeId: ").append(toIndentedString(applicationAttributeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    vocabularyValues: ").append(toIndentedString(vocabularyValues)).append("\n");
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
