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
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsAttributeVocabularyValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MozuAppDevContractsAttributeDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class MozuAppDevContractsAttributeDefinition {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attributeCode";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_ATTRIBUTE_FQN = "attributeFqn";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_FQN)
  private String attributeFqn;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "inputType";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  private String inputType;

  public static final String SERIALIZED_NAME_IS_READ_ONLY = "isReadOnly";
  @SerializedName(SERIALIZED_NAME_IS_READ_ONLY)
  private Boolean isReadOnly;

  public static final String SERIALIZED_NAME_VOCABULARY_VALUES = "vocabularyValues";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_VALUES)
  private List<MozuAppDevContractsAttributeVocabularyValue> vocabularyValues = null;

  public MozuAppDevContractsAttributeDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public MozuAppDevContractsAttributeDefinition attributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Get attributeCode
   * @return attributeCode
  **/
  @ApiModelProperty(value = "")
  public String getAttributeCode() {
    return attributeCode;
  }

  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }

  public MozuAppDevContractsAttributeDefinition attributeFqn(String attributeFqn) {
    this.attributeFqn = attributeFqn;
    return this;
  }

   /**
   * Get attributeFqn
   * @return attributeFqn
  **/
  @ApiModelProperty(value = "")
  public String getAttributeFqn() {
    return attributeFqn;
  }

  public void setAttributeFqn(String attributeFqn) {
    this.attributeFqn = attributeFqn;
  }

  public MozuAppDevContractsAttributeDefinition dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public MozuAppDevContractsAttributeDefinition inputType(String inputType) {
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

  public MozuAppDevContractsAttributeDefinition isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

   /**
   * Get isReadOnly
   * @return isReadOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public MozuAppDevContractsAttributeDefinition vocabularyValues(List<MozuAppDevContractsAttributeVocabularyValue> vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
    return this;
  }

  public MozuAppDevContractsAttributeDefinition addVocabularyValuesItem(MozuAppDevContractsAttributeVocabularyValue vocabularyValuesItem) {
    if (this.vocabularyValues == null) {
      this.vocabularyValues = new ArrayList<MozuAppDevContractsAttributeVocabularyValue>();
    }
    this.vocabularyValues.add(vocabularyValuesItem);
    return this;
  }

   /**
   * Get vocabularyValues
   * @return vocabularyValues
  **/
  @ApiModelProperty(value = "")
  public List<MozuAppDevContractsAttributeVocabularyValue> getVocabularyValues() {
    return vocabularyValues;
  }

  public void setVocabularyValues(List<MozuAppDevContractsAttributeVocabularyValue> vocabularyValues) {
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
    MozuAppDevContractsAttributeDefinition mozuAppDevContractsAttributeDefinition = (MozuAppDevContractsAttributeDefinition) o;
    return Objects.equals(this.namespace, mozuAppDevContractsAttributeDefinition.namespace) &&
        Objects.equals(this.attributeCode, mozuAppDevContractsAttributeDefinition.attributeCode) &&
        Objects.equals(this.attributeFqn, mozuAppDevContractsAttributeDefinition.attributeFqn) &&
        Objects.equals(this.dataType, mozuAppDevContractsAttributeDefinition.dataType) &&
        Objects.equals(this.inputType, mozuAppDevContractsAttributeDefinition.inputType) &&
        Objects.equals(this.isReadOnly, mozuAppDevContractsAttributeDefinition.isReadOnly) &&
        Objects.equals(this.vocabularyValues, mozuAppDevContractsAttributeDefinition.vocabularyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, attributeCode, attributeFqn, dataType, inputType, isReadOnly, vocabularyValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MozuAppDevContractsAttributeDefinition {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    attributeFqn: ").append(toIndentedString(attributeFqn)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
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
