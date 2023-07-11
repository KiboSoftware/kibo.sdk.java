/*
 * Kibo AppDev Service
 * OpenAPI Spec for Kibo AppDev Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.appdevelopment.models;

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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PackageSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "applicationName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE_ID = "applicationTypeId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE_ID)
  private Integer applicationTypeId;

  public static final String SERIALIZED_NAME_MAJOR_VERSION = "majorVersion";
  @SerializedName(SERIALIZED_NAME_MAJOR_VERSION)
  private Integer majorVersion;

  public static final String SERIALIZED_NAME_MINOR_VERSION = "minorVersion";
  @SerializedName(SERIALIZED_NAME_MINOR_VERSION)
  private Integer minorVersion;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public PackageSummary() {
  }

  public PackageSummary id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Package Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Package Id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PackageSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Package Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Package Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PackageSummary applicationName(String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Application Name
   * @return applicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application Name")

  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public PackageSummary applicationTypeId(Integer applicationTypeId) {
    
    this.applicationTypeId = applicationTypeId;
    return this;
  }

   /**
   * Application Type Id
   * @return applicationTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application Type Id")

  public Integer getApplicationTypeId() {
    return applicationTypeId;
  }


  public void setApplicationTypeId(Integer applicationTypeId) {
    this.applicationTypeId = applicationTypeId;
  }


  public PackageSummary majorVersion(Integer majorVersion) {
    
    this.majorVersion = majorVersion;
    return this;
  }

   /**
   * Application Major Version
   * @return majorVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application Major Version")

  public Integer getMajorVersion() {
    return majorVersion;
  }


  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }


  public PackageSummary minorVersion(Integer minorVersion) {
    
    this.minorVersion = minorVersion;
    return this;
  }

   /**
   * Application Minor Version
   * @return minorVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application Minor Version")

  public Integer getMinorVersion() {
    return minorVersion;
  }


  public void setMinorVersion(Integer minorVersion) {
    this.minorVersion = minorVersion;
  }


  public PackageSummary revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Application Revision
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application Revision")

  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public PackageSummary isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * IsLocked
   * @return isLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IsLocked")

  public Boolean getIsLocked() {
    return isLocked;
  }


  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public PackageSummary applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ApplicationId
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ApplicationId")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageSummary packageSummary = (PackageSummary) o;
    return Objects.equals(this.id, packageSummary.id) &&
        Objects.equals(this.name, packageSummary.name) &&
        Objects.equals(this.applicationName, packageSummary.applicationName) &&
        Objects.equals(this.applicationTypeId, packageSummary.applicationTypeId) &&
        Objects.equals(this.majorVersion, packageSummary.majorVersion) &&
        Objects.equals(this.minorVersion, packageSummary.minorVersion) &&
        Objects.equals(this.revision, packageSummary.revision) &&
        Objects.equals(this.isLocked, packageSummary.isLocked) &&
        Objects.equals(this.applicationId, packageSummary.applicationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, applicationName, applicationTypeId, majorVersion, minorVersion, revision, isLocked, applicationId);
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
    sb.append("class PackageSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationTypeId: ").append(toIndentedString(applicationTypeId)).append("\n");
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
    sb.append("    minorVersion: ").append(toIndentedString(minorVersion)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("applicationName");
    openapiFields.add("applicationTypeId");
    openapiFields.add("majorVersion");
    openapiFields.add("minorVersion");
    openapiFields.add("revision");
    openapiFields.add("isLocked");
    openapiFields.add("applicationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PackageSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PackageSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackageSummary is not found in the empty JSON string", PackageSummary.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PackageSummary.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackageSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("applicationName") != null && !jsonObj.get("applicationName").isJsonNull()) && !jsonObj.get("applicationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackageSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackageSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackageSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackageSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PackageSummary>() {
           @Override
           public void write(JsonWriter out, PackageSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackageSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PackageSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PackageSummary
  * @throws IOException if the JSON string is invalid with respect to PackageSummary
  */
  public static PackageSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackageSummary.class);
  }

 /**
  * Convert an instance of PackageSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

