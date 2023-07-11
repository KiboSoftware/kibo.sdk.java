/*
 * Kibo Location Admin Service
 * OpenAPI Spec for Kibo Location Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.locationadmin.models;

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
 * ShippingOriginContact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingOriginContact implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME_OR_INITIAL = "middleNameOrInitial";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME_OR_INITIAL)
  private String middleNameOrInitial;

  public static final String SERIALIZED_NAME_LAST_NAME_OR_SURNAME = "lastNameOrSurname";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_OR_SURNAME)
  private String lastNameOrSurname;

  public static final String SERIALIZED_NAME_COMPANY_OR_ORGANIZATION = "companyOrOrganization";
  @SerializedName(SERIALIZED_NAME_COMPANY_OR_ORGANIZATION)
  private String companyOrOrganization;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public ShippingOriginContact() {
  }

  public ShippingOriginContact firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ShippingOriginContact middleNameOrInitial(String middleNameOrInitial) {
    
    this.middleNameOrInitial = middleNameOrInitial;
    return this;
  }

   /**
   * Get middleNameOrInitial
   * @return middleNameOrInitial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleNameOrInitial() {
    return middleNameOrInitial;
  }


  public void setMiddleNameOrInitial(String middleNameOrInitial) {
    this.middleNameOrInitial = middleNameOrInitial;
  }


  public ShippingOriginContact lastNameOrSurname(String lastNameOrSurname) {
    
    this.lastNameOrSurname = lastNameOrSurname;
    return this;
  }

   /**
   * Get lastNameOrSurname
   * @return lastNameOrSurname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastNameOrSurname() {
    return lastNameOrSurname;
  }


  public void setLastNameOrSurname(String lastNameOrSurname) {
    this.lastNameOrSurname = lastNameOrSurname;
  }


  public ShippingOriginContact companyOrOrganization(String companyOrOrganization) {
    
    this.companyOrOrganization = companyOrOrganization;
    return this;
  }

   /**
   * Get companyOrOrganization
   * @return companyOrOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyOrOrganization() {
    return companyOrOrganization;
  }


  public void setCompanyOrOrganization(String companyOrOrganization) {
    this.companyOrOrganization = companyOrOrganization;
  }


  public ShippingOriginContact phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ShippingOriginContact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOriginContact shippingOriginContact = (ShippingOriginContact) o;
    return Objects.equals(this.firstName, shippingOriginContact.firstName) &&
        Objects.equals(this.middleNameOrInitial, shippingOriginContact.middleNameOrInitial) &&
        Objects.equals(this.lastNameOrSurname, shippingOriginContact.lastNameOrSurname) &&
        Objects.equals(this.companyOrOrganization, shippingOriginContact.companyOrOrganization) &&
        Objects.equals(this.phoneNumber, shippingOriginContact.phoneNumber) &&
        Objects.equals(this.email, shippingOriginContact.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleNameOrInitial, lastNameOrSurname, companyOrOrganization, phoneNumber, email);
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
    sb.append("class ShippingOriginContact {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleNameOrInitial: ").append(toIndentedString(middleNameOrInitial)).append("\n");
    sb.append("    lastNameOrSurname: ").append(toIndentedString(lastNameOrSurname)).append("\n");
    sb.append("    companyOrOrganization: ").append(toIndentedString(companyOrOrganization)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("middleNameOrInitial");
    openapiFields.add("lastNameOrSurname");
    openapiFields.add("companyOrOrganization");
    openapiFields.add("phoneNumber");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingOriginContact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingOriginContact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingOriginContact is not found in the empty JSON string", ShippingOriginContact.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingOriginContact.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingOriginContact` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleNameOrInitial") != null && !jsonObj.get("middleNameOrInitial").isJsonNull()) && !jsonObj.get("middleNameOrInitial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleNameOrInitial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleNameOrInitial").toString()));
      }
      if ((jsonObj.get("lastNameOrSurname") != null && !jsonObj.get("lastNameOrSurname").isJsonNull()) && !jsonObj.get("lastNameOrSurname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastNameOrSurname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastNameOrSurname").toString()));
      }
      if ((jsonObj.get("companyOrOrganization") != null && !jsonObj.get("companyOrOrganization").isJsonNull()) && !jsonObj.get("companyOrOrganization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyOrOrganization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyOrOrganization").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingOriginContact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingOriginContact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingOriginContact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingOriginContact.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingOriginContact>() {
           @Override
           public void write(JsonWriter out, ShippingOriginContact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingOriginContact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingOriginContact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingOriginContact
  * @throws IOException if the JSON string is invalid with respect to ShippingOriginContact
  */
  public static ShippingOriginContact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingOriginContact.class);
  }

 /**
  * Convert an instance of ShippingOriginContact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

