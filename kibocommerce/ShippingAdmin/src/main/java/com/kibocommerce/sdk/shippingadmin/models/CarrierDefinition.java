/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.shippingadmin.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.shippingadmin.models.CarrierCredentialSetMetadata;
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
 * A carrier definition including config field metadata.  Can either be a built-in system carrier or an Extensible Carrier installed via a &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierInstallation\&quot;&gt;carrier installation&lt;/see&gt;.
 */
@ApiModel(description = "A carrier definition including config field metadata.  Can either be a built-in system carrier or an Extensible Carrier installed via a <see cref=\"T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierInstallation\">carrier installation</see>.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CarrierDefinition implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrierId";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_IS_BUILT_IN = "isBuiltIn";
  @SerializedName(SERIALIZED_NAME_IS_BUILT_IN)
  private Boolean isBuiltIn;

  public static final String SERIALIZED_NAME_CERTIFIED = "certified";
  @SerializedName(SERIALIZED_NAME_CERTIFIED)
  private Boolean certified;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_CONFIG_FIELDS = "configFields";
  @SerializedName(SERIALIZED_NAME_CONFIG_FIELDS)
  private List<CarrierCredentialSetMetadata> configFields = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CarrierDefinition() {
  }

  public CarrierDefinition carrierId(String carrierId) {
    
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public CarrierDefinition isBuiltIn(Boolean isBuiltIn) {
    
    this.isBuiltIn = isBuiltIn;
    return this;
  }

   /**
   * Get isBuiltIn
   * @return isBuiltIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }


  public void setIsBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
  }


  public CarrierDefinition certified(Boolean certified) {
    
    this.certified = certified;
    return this;
  }

   /**
   * Get certified
   * @return certified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCertified() {
    return certified;
  }


  public void setCertified(Boolean certified) {
    this.certified = certified;
  }


  public CarrierDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CarrierDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CarrierDefinition logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public CarrierDefinition configFields(List<CarrierCredentialSetMetadata> configFields) {
    
    this.configFields = configFields;
    return this;
  }

  public CarrierDefinition addConfigFieldsItem(CarrierCredentialSetMetadata configFieldsItem) {
    if (this.configFields == null) {
      this.configFields = new ArrayList<>();
    }
    this.configFields.add(configFieldsItem);
    return this;
  }

   /**
   * Get configFields
   * @return configFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CarrierCredentialSetMetadata> getConfigFields() {
    return configFields;
  }


  public void setConfigFields(List<CarrierCredentialSetMetadata> configFields) {
    this.configFields = configFields;
  }


  public CarrierDefinition auditInfo(AdminUserAuditInfo auditInfo) {
    
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
    CarrierDefinition carrierDefinition = (CarrierDefinition) o;
    return Objects.equals(this.carrierId, carrierDefinition.carrierId) &&
        Objects.equals(this.isBuiltIn, carrierDefinition.isBuiltIn) &&
        Objects.equals(this.certified, carrierDefinition.certified) &&
        Objects.equals(this.name, carrierDefinition.name) &&
        Objects.equals(this.description, carrierDefinition.description) &&
        Objects.equals(this.logoUrl, carrierDefinition.logoUrl) &&
        Objects.equals(this.configFields, carrierDefinition.configFields) &&
        Objects.equals(this.auditInfo, carrierDefinition.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, isBuiltIn, certified, name, description, logoUrl, configFields, auditInfo);
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
    sb.append("class CarrierDefinition {\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    certified: ").append(toIndentedString(certified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    configFields: ").append(toIndentedString(configFields)).append("\n");
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
    openapiFields.add("carrierId");
    openapiFields.add("isBuiltIn");
    openapiFields.add("certified");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("logoUrl");
    openapiFields.add("configFields");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CarrierDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CarrierDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CarrierDefinition is not found in the empty JSON string", CarrierDefinition.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CarrierDefinition.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CarrierDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("carrierId") != null && !jsonObj.get("carrierId").isJsonNull()) && !jsonObj.get("carrierId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull()) && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
      if (jsonObj.get("configFields") != null && !jsonObj.get("configFields").isJsonNull()) {
        JsonArray jsonArrayconfigFields = jsonObj.getAsJsonArray("configFields");
        if (jsonArrayconfigFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configFields` to be an array in the JSON string but got `%s`", jsonObj.get("configFields").toString()));
          }

          // validate the optional field `configFields` (array)
          for (int i = 0; i < jsonArrayconfigFields.size(); i++) {
            CarrierCredentialSetMetadata.validateJsonObject(jsonArrayconfigFields.get(i).getAsJsonObject());
          };
        }
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
       if (!CarrierDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarrierDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarrierDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarrierDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<CarrierDefinition>() {
           @Override
           public void write(JsonWriter out, CarrierDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarrierDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarrierDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarrierDefinition
  * @throws IOException if the JSON string is invalid with respect to CarrierDefinition
  */
  public static CarrierDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarrierDefinition.class);
  }

 /**
  * Convert an instance of CarrierDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

