/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.catalogadministration.models.AttributeSearchSettings;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeMetadataItem;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeValidation;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeVocabularyValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kibocommerce.sdk.common.JSON;

/**
 * Attribute
 */
@ApiModel(description = "Attribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsAttribute implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADMIN_NAME = "adminName";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attributeCode";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_IS_VALUE_MAPPING_ATTRIBUTE = "isValueMappingAttribute";
  @SerializedName(SERIALIZED_NAME_IS_VALUE_MAPPING_ATTRIBUTE)
  private Boolean isValueMappingAttribute;

  public static final String SERIALIZED_NAME_VALUE_MAPPING_ATTRIBUTE_F_Q_N = "valueMappingAttributeFQN";
  @SerializedName(SERIALIZED_NAME_VALUE_MAPPING_ATTRIBUTE_F_Q_N)
  private String valueMappingAttributeFQN;

  public static final String SERIALIZED_NAME_ATTRIBUTE_SEQUENCE = "attributeSequence";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_SEQUENCE)
  private Integer attributeSequence;

  public static final String SERIALIZED_NAME_ATTRIBUTE_DATA_TYPE_SEQUENCE = "attributeDataTypeSequence";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DATA_TYPE_SEQUENCE)
  private Integer attributeDataTypeSequence;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "inputType";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  private String inputType;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_IS_OPTION = "isOption";
  @SerializedName(SERIALIZED_NAME_IS_OPTION)
  private Boolean isOption;

  public static final String SERIALIZED_NAME_IS_EXTRA = "isExtra";
  @SerializedName(SERIALIZED_NAME_IS_EXTRA)
  private Boolean isExtra;

  public static final String SERIALIZED_NAME_IS_PROPERTY = "isProperty";
  @SerializedName(SERIALIZED_NAME_IS_PROPERTY)
  private Boolean isProperty;

  public static final String SERIALIZED_NAME_AVAILABLE_FOR_ORDER_ROUTING = "availableForOrderRouting";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FOR_ORDER_ROUTING)
  private Boolean availableForOrderRouting;

  public static final String SERIALIZED_NAME_ATTRIBUTE_METADATA = "attributeMetadata";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_METADATA)
  private List<CatalogAdminsAttributeMetadataItem> attributeMetadata = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private CatalogAdminsAttributeLocalizedContent content;

  public static final String SERIALIZED_NAME_LOCALIZED_CONTENT = "localizedContent";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_CONTENT)
  private List<CatalogAdminsAttributeLocalizedContent> localizedContent = null;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private CatalogAdminsAttributeValidation validation;

  public static final String SERIALIZED_NAME_VOCABULARY_VALUES = "vocabularyValues";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_VALUES)
  private List<CatalogAdminsAttributeVocabularyValue> vocabularyValues = null;

  public static final String SERIALIZED_NAME_SEARCH_SETTINGS = "searchSettings";
  @SerializedName(SERIALIZED_NAME_SEARCH_SETTINGS)
  private AttributeSearchSettings searchSettings;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CatalogAdminsAttribute() {
  }

  public CatalogAdminsAttribute adminName(String adminName) {
    
    this.adminName = adminName;
    return this;
  }

   /**
   * Name of the product displayed in the admin, This field does not need to be unqiue, but is required. It can include spaces...and is limited to a length of 50.
   * @return adminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the product displayed in the admin, This field does not need to be unqiue, but is required. It can include spaces...and is limited to a length of 50.")

  public String getAdminName() {
    return adminName;
  }


  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public CatalogAdminsAttribute namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * NameSpace, each application creating attributes will have a uniqe namespace to avoid name (Code) collisions. The namespace provided must be a valid registered  namespace. If no namespace is specified it is assumed to be the namespace of the Tenant.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NameSpace, each application creating attributes will have a uniqe namespace to avoid name (Code) collisions. The namespace provided must be a valid registered  namespace. If no namespace is specified it is assumed to be the namespace of the Tenant.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public CatalogAdminsAttribute attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * Unique identifier of the Attribute. Must be unique within a namespace and cannot be changed once the attribute is created. This value will be generated and match the attribute  sequence if not provided on create.
   * @return attributeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Attribute. Must be unique within a namespace and cannot be changed once the attribute is created. This value will be generated and match the attribute  sequence if not provided on create.")

  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  public CatalogAdminsAttribute attributeFQN(String attributeFQN) {
    
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * Attribute fully qualified name, Read only value that combines namespace and attribute code as NameSpace~AttributeCode
   * @return attributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute fully qualified name, Read only value that combines namespace and attribute code as NameSpace~AttributeCode")

  public String getAttributeFQN() {
    return attributeFQN;
  }


  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }


  public CatalogAdminsAttribute isValueMappingAttribute(Boolean isValueMappingAttribute) {
    
    this.isValueMappingAttribute = isValueMappingAttribute;
    return this;
  }

   /**
   * Specifies if this attribute can can be used to generalize values of another attribute
   * @return isValueMappingAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this attribute can can be used to generalize values of another attribute")

  public Boolean getIsValueMappingAttribute() {
    return isValueMappingAttribute;
  }


  public void setIsValueMappingAttribute(Boolean isValueMappingAttribute) {
    this.isValueMappingAttribute = isValueMappingAttribute;
  }


  public CatalogAdminsAttribute valueMappingAttributeFQN(String valueMappingAttributeFQN) {
    
    this.valueMappingAttributeFQN = valueMappingAttributeFQN;
    return this;
  }

   /**
   * Attribute fully qualified name of a corresponding value mapping atribuite
   * @return valueMappingAttributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute fully qualified name of a corresponding value mapping atribuite")

  public String getValueMappingAttributeFQN() {
    return valueMappingAttributeFQN;
  }


  public void setValueMappingAttributeFQN(String valueMappingAttributeFQN) {
    this.valueMappingAttributeFQN = valueMappingAttributeFQN;
  }


  public CatalogAdminsAttribute attributeSequence(Integer attributeSequence) {
    
    this.attributeSequence = attributeSequence;
    return this;
  }

   /**
   * Read only System generated monotonically increasing unique sequence for each attribute created.
   * @return attributeSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only System generated monotonically increasing unique sequence for each attribute created.")

  public Integer getAttributeSequence() {
    return attributeSequence;
  }


  public void setAttributeSequence(Integer attributeSequence) {
    this.attributeSequence = attributeSequence;
  }


  public CatalogAdminsAttribute attributeDataTypeSequence(Integer attributeDataTypeSequence) {
    
    this.attributeDataTypeSequence = attributeDataTypeSequence;
    return this;
  }

   /**
   * Read only System generated monotonically increasing unique sequence for each attribute,DataType created (this is used to optimize indexed field names in search).
   * @return attributeDataTypeSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only System generated monotonically increasing unique sequence for each attribute,DataType created (this is used to optimize indexed field names in search).")

  public Integer getAttributeDataTypeSequence() {
    return attributeDataTypeSequence;
  }


  public void setAttributeDataTypeSequence(Integer attributeDataTypeSequence) {
    this.attributeDataTypeSequence = attributeDataTypeSequence;
  }


  public CatalogAdminsAttribute masterCatalogId(Integer masterCatalogId) {
    
    this.masterCatalogId = masterCatalogId;
    return this;
  }

   /**
   * Indentifier of the master that this attribute is a member of. System-supplied and read-only. Attributes will be created in the MasterCatalog of the supplied context.
   * @return masterCatalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indentifier of the master that this attribute is a member of. System-supplied and read-only. Attributes will be created in the MasterCatalog of the supplied context.")

  public Integer getMasterCatalogId() {
    return masterCatalogId;
  }


  public void setMasterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
  }


  public CatalogAdminsAttribute inputType(String inputType) {
    
    this.inputType = inputType;
    return this;
  }

   /**
   * The InputType type of the attribute. Must be a valid value for InputType defined in InputTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create
   * @return inputType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The InputType type of the attribute. Must be a valid value for InputType defined in InputTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create")

  public String getInputType() {
    return inputType;
  }


  public void setInputType(String inputType) {
    this.inputType = inputType;
  }


  public CatalogAdminsAttribute valueType(String valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The ValueType of the attribute.  Must be a valid value for ValueType defined in ValueTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ValueType of the attribute.  Must be a valid value for ValueType defined in ValueTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create")

  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public CatalogAdminsAttribute dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * The DataType of the attribute.  Must be a valid value for DataType defined in DataTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DataType of the attribute.  Must be a valid value for DataType defined in DataTypeTypeConst and the combination of types set must match an entry in the AttributeTypeRules resource.   This value cannot be changed after create")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public CatalogAdminsAttribute isOption(Boolean isOption) {
    
    this.isOption = isOption;
    return this;
  }

   /**
   * Specifies if this attribute can have a usage type of Option in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.
   * @return isOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this attribute can have a usage type of Option in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.")

  public Boolean getIsOption() {
    return isOption;
  }


  public void setIsOption(Boolean isOption) {
    this.isOption = isOption;
  }


  public CatalogAdminsAttribute isExtra(Boolean isExtra) {
    
    this.isExtra = isExtra;
    return this;
  }

   /**
   * Specifies if this attribute can have a usage type of Extra in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.
   * @return isExtra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this attribute can have a usage type of Extra in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.")

  public Boolean getIsExtra() {
    return isExtra;
  }


  public void setIsExtra(Boolean isExtra) {
    this.isExtra = isExtra;
  }


  public CatalogAdminsAttribute isProperty(Boolean isProperty) {
    
    this.isProperty = isProperty;
    return this;
  }

   /**
   * Specifies if this attribute can have a usage type of Property in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.
   * @return isProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this attribute can have a usage type of Property in a ProductType. This value can only be true when when it matches an AttributeTypeRule in the AttributeTypeRules resource.")

  public Boolean getIsProperty() {
    return isProperty;
  }


  public void setIsProperty(Boolean isProperty) {
    this.isProperty = isProperty;
  }


  public CatalogAdminsAttribute availableForOrderRouting(Boolean availableForOrderRouting) {
    
    this.availableForOrderRouting = availableForOrderRouting;
    return this;
  }

   /**
   * Specifies if this attribute is available for order routing
   * @return availableForOrderRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this attribute is available for order routing")

  public Boolean getAvailableForOrderRouting() {
    return availableForOrderRouting;
  }


  public void setAvailableForOrderRouting(Boolean availableForOrderRouting) {
    this.availableForOrderRouting = availableForOrderRouting;
  }


  public CatalogAdminsAttribute attributeMetadata(List<CatalogAdminsAttributeMetadataItem> attributeMetadata) {
    
    this.attributeMetadata = attributeMetadata;
    return this;
  }

  public CatalogAdminsAttribute addAttributeMetadataItem(CatalogAdminsAttributeMetadataItem attributeMetadataItem) {
    if (this.attributeMetadata == null) {
      this.attributeMetadata = new ArrayList<>();
    }
    this.attributeMetadata.add(attributeMetadataItem);
    return this;
  }

   /**
   * Attribute Metadata. This list can contain opaque data (key value pairs) that can be used as a property bag for UI concerns.
   * @return attributeMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute Metadata. This list can contain opaque data (key value pairs) that can be used as a property bag for UI concerns.")

  public List<CatalogAdminsAttributeMetadataItem> getAttributeMetadata() {
    return attributeMetadata;
  }


  public void setAttributeMetadata(List<CatalogAdminsAttributeMetadataItem> attributeMetadata) {
    this.attributeMetadata = attributeMetadata;
  }


  public CatalogAdminsAttribute content(CatalogAdminsAttributeLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsAttributeLocalizedContent getContent() {
    return content;
  }


  public void setContent(CatalogAdminsAttributeLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsAttribute localizedContent(List<CatalogAdminsAttributeLocalizedContent> localizedContent) {
    
    this.localizedContent = localizedContent;
    return this;
  }

  public CatalogAdminsAttribute addLocalizedContentItem(CatalogAdminsAttributeLocalizedContent localizedContentItem) {
    if (this.localizedContent == null) {
      this.localizedContent = new ArrayList<>();
    }
    this.localizedContent.add(localizedContentItem);
    return this;
  }

   /**
   * The Content of an attribute. This content is always in the default language of the MasterCatalog.
   * @return localizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Content of an attribute. This content is always in the default language of the MasterCatalog.")

  public List<CatalogAdminsAttributeLocalizedContent> getLocalizedContent() {
    return localizedContent;
  }


  public void setLocalizedContent(List<CatalogAdminsAttributeLocalizedContent> localizedContent) {
    this.localizedContent = localizedContent;
  }


  public CatalogAdminsAttribute validation(CatalogAdminsAttributeValidation validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsAttributeValidation getValidation() {
    return validation;
  }


  public void setValidation(CatalogAdminsAttributeValidation validation) {
    this.validation = validation;
  }


  public CatalogAdminsAttribute vocabularyValues(List<CatalogAdminsAttributeVocabularyValue> vocabularyValues) {
    
    this.vocabularyValues = vocabularyValues;
    return this;
  }

  public CatalogAdminsAttribute addVocabularyValuesItem(CatalogAdminsAttributeVocabularyValue vocabularyValuesItem) {
    if (this.vocabularyValues == null) {
      this.vocabularyValues = new ArrayList<>();
    }
    this.vocabularyValues.add(vocabularyValuesItem);
    return this;
  }

   /**
   * The list of Values for this attribute. Only available for ValueType:PredefinedVocabulary
   * @return vocabularyValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Values for this attribute. Only available for ValueType:PredefinedVocabulary")

  public List<CatalogAdminsAttributeVocabularyValue> getVocabularyValues() {
    return vocabularyValues;
  }


  public void setVocabularyValues(List<CatalogAdminsAttributeVocabularyValue> vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
  }


  public CatalogAdminsAttribute searchSettings(AttributeSearchSettings searchSettings) {
    
    this.searchSettings = searchSettings;
    return this;
  }

   /**
   * Get searchSettings
   * @return searchSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeSearchSettings getSearchSettings() {
    return searchSettings;
  }


  public void setSearchSettings(AttributeSearchSettings searchSettings) {
    this.searchSettings = searchSettings;
  }


  public CatalogAdminsAttribute auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsAttribute catalogAdminsAttribute = (CatalogAdminsAttribute) o;
    return Objects.equals(this.adminName, catalogAdminsAttribute.adminName) &&
        Objects.equals(this.namespace, catalogAdminsAttribute.namespace) &&
        Objects.equals(this.attributeCode, catalogAdminsAttribute.attributeCode) &&
        Objects.equals(this.attributeFQN, catalogAdminsAttribute.attributeFQN) &&
        Objects.equals(this.isValueMappingAttribute, catalogAdminsAttribute.isValueMappingAttribute) &&
        Objects.equals(this.valueMappingAttributeFQN, catalogAdminsAttribute.valueMappingAttributeFQN) &&
        Objects.equals(this.attributeSequence, catalogAdminsAttribute.attributeSequence) &&
        Objects.equals(this.attributeDataTypeSequence, catalogAdminsAttribute.attributeDataTypeSequence) &&
        Objects.equals(this.masterCatalogId, catalogAdminsAttribute.masterCatalogId) &&
        Objects.equals(this.inputType, catalogAdminsAttribute.inputType) &&
        Objects.equals(this.valueType, catalogAdminsAttribute.valueType) &&
        Objects.equals(this.dataType, catalogAdminsAttribute.dataType) &&
        Objects.equals(this.isOption, catalogAdminsAttribute.isOption) &&
        Objects.equals(this.isExtra, catalogAdminsAttribute.isExtra) &&
        Objects.equals(this.isProperty, catalogAdminsAttribute.isProperty) &&
        Objects.equals(this.availableForOrderRouting, catalogAdminsAttribute.availableForOrderRouting) &&
        Objects.equals(this.attributeMetadata, catalogAdminsAttribute.attributeMetadata) &&
        Objects.equals(this.content, catalogAdminsAttribute.content) &&
        Objects.equals(this.localizedContent, catalogAdminsAttribute.localizedContent) &&
        Objects.equals(this.validation, catalogAdminsAttribute.validation) &&
        Objects.equals(this.vocabularyValues, catalogAdminsAttribute.vocabularyValues) &&
        Objects.equals(this.searchSettings, catalogAdminsAttribute.searchSettings) &&
        Objects.equals(this.auditInfo, catalogAdminsAttribute.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminName, namespace, attributeCode, attributeFQN, isValueMappingAttribute, valueMappingAttributeFQN, attributeSequence, attributeDataTypeSequence, masterCatalogId, inputType, valueType, dataType, isOption, isExtra, isProperty, availableForOrderRouting, attributeMetadata, content, localizedContent, validation, vocabularyValues, searchSettings, auditInfo);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogAdminsAttribute {\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    isValueMappingAttribute: ").append(toIndentedString(isValueMappingAttribute)).append("\n");
    sb.append("    valueMappingAttributeFQN: ").append(toIndentedString(valueMappingAttributeFQN)).append("\n");
    sb.append("    attributeSequence: ").append(toIndentedString(attributeSequence)).append("\n");
    sb.append("    attributeDataTypeSequence: ").append(toIndentedString(attributeDataTypeSequence)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    isOption: ").append(toIndentedString(isOption)).append("\n");
    sb.append("    isExtra: ").append(toIndentedString(isExtra)).append("\n");
    sb.append("    isProperty: ").append(toIndentedString(isProperty)).append("\n");
    sb.append("    availableForOrderRouting: ").append(toIndentedString(availableForOrderRouting)).append("\n");
    sb.append("    attributeMetadata: ").append(toIndentedString(attributeMetadata)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    localizedContent: ").append(toIndentedString(localizedContent)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    vocabularyValues: ").append(toIndentedString(vocabularyValues)).append("\n");
    sb.append("    searchSettings: ").append(toIndentedString(searchSettings)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("adminName");
    openapiFields.add("namespace");
    openapiFields.add("attributeCode");
    openapiFields.add("attributeFQN");
    openapiFields.add("isValueMappingAttribute");
    openapiFields.add("valueMappingAttributeFQN");
    openapiFields.add("attributeSequence");
    openapiFields.add("attributeDataTypeSequence");
    openapiFields.add("masterCatalogId");
    openapiFields.add("inputType");
    openapiFields.add("valueType");
    openapiFields.add("dataType");
    openapiFields.add("isOption");
    openapiFields.add("isExtra");
    openapiFields.add("isProperty");
    openapiFields.add("availableForOrderRouting");
    openapiFields.add("attributeMetadata");
    openapiFields.add("content");
    openapiFields.add("localizedContent");
    openapiFields.add("validation");
    openapiFields.add("vocabularyValues");
    openapiFields.add("searchSettings");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsAttribute is not found in the empty JSON string", CatalogAdminsAttribute.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsAttribute.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("adminName") != null && !jsonObj.get("adminName").isJsonNull()) && !jsonObj.get("adminName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adminName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adminName").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("attributeCode") != null && !jsonObj.get("attributeCode").isJsonNull()) && !jsonObj.get("attributeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeCode").toString()));
      }
      if ((jsonObj.get("attributeFQN") != null && !jsonObj.get("attributeFQN").isJsonNull()) && !jsonObj.get("attributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeFQN").toString()));
      }
      if ((jsonObj.get("valueMappingAttributeFQN") != null && !jsonObj.get("valueMappingAttributeFQN").isJsonNull()) && !jsonObj.get("valueMappingAttributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueMappingAttributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueMappingAttributeFQN").toString()));
      }
      if ((jsonObj.get("inputType") != null && !jsonObj.get("inputType").isJsonNull()) && !jsonObj.get("inputType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputType").toString()));
      }
      if ((jsonObj.get("valueType") != null && !jsonObj.get("valueType").isJsonNull()) && !jsonObj.get("valueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueType").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if (jsonObj.get("attributeMetadata") != null && !jsonObj.get("attributeMetadata").isJsonNull()) {
        JsonArray jsonArrayattributeMetadata = jsonObj.getAsJsonArray("attributeMetadata");
        if (jsonArrayattributeMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributeMetadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributeMetadata` to be an array in the JSON string but got `%s`", jsonObj.get("attributeMetadata").toString()));
          }

          // validate the optional field `attributeMetadata` (array)
          for (int i = 0; i < jsonArrayattributeMetadata.size(); i++) {
            CatalogAdminsAttributeMetadataItem.validateJsonObject(jsonArrayattributeMetadata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        CatalogAdminsAttributeLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if (jsonObj.get("localizedContent") != null && !jsonObj.get("localizedContent").isJsonNull()) {
        JsonArray jsonArraylocalizedContent = jsonObj.getAsJsonArray("localizedContent");
        if (jsonArraylocalizedContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedContent").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedContent` to be an array in the JSON string but got `%s`", jsonObj.get("localizedContent").toString()));
          }

          // validate the optional field `localizedContent` (array)
          for (int i = 0; i < jsonArraylocalizedContent.size(); i++) {
            CatalogAdminsAttributeLocalizedContent.validateJsonObject(jsonArraylocalizedContent.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `validation`
      if (jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) {
        CatalogAdminsAttributeValidation.validateJsonObject(jsonObj.getAsJsonObject("validation"));
      }
      if (jsonObj.get("vocabularyValues") != null && !jsonObj.get("vocabularyValues").isJsonNull()) {
        JsonArray jsonArrayvocabularyValues = jsonObj.getAsJsonArray("vocabularyValues");
        if (jsonArrayvocabularyValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vocabularyValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vocabularyValues` to be an array in the JSON string but got `%s`", jsonObj.get("vocabularyValues").toString()));
          }

          // validate the optional field `vocabularyValues` (array)
          for (int i = 0; i < jsonArrayvocabularyValues.size(); i++) {
            CatalogAdminsAttributeVocabularyValue.validateJsonObject(jsonArrayvocabularyValues.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `searchSettings`
      if (jsonObj.get("searchSettings") != null && !jsonObj.get("searchSettings").isJsonNull()) {
        AttributeSearchSettings.validateJsonObject(jsonObj.getAsJsonObject("searchSettings"));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsAttribute>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsAttribute
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsAttribute
  */
  public static CatalogAdminsAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsAttribute.class);
  }

 /**
  * Convert an instance of CatalogAdminsAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

