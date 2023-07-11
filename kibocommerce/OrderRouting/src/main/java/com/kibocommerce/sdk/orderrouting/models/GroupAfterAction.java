/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.orderrouting.models.UserContextInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * GroupAfterAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupAfterAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_I_D = "actionID";
  @SerializedName(SERIALIZED_NAME_ACTION_I_D)
  private Integer actionID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATOR_USERNAME = "creatorUsername";
  @SerializedName(SERIALIZED_NAME_CREATOR_USERNAME)
  private String creatorUsername;

  public static final String SERIALIZED_NAME_ENVIRONMENT_I_D = "environmentID";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_I_D)
  private Integer environmentID;

  /**
   * Gets or Sets failoverAction
   */
  @JsonAdapter(FailoverActionEnum.Adapter.class)
  public enum FailoverActionEnum {
    LINE_ITEM_SPLIT_ASSIGN_IF_FULFILLED("LINE_ITEM_SPLIT_ASSIGN_IF_FULFILLED"),
    
    LINE_ITEM_SPLIT_CANCEL_WITHOUT_INVENTORY("LINE_ITEM_SPLIT_CANCEL_WITHOUT_INVENTORY"),
    
    QUANTITY_SPLIT_ASSIGN_IF_FULFILLED("QUANTITY_SPLIT_ASSIGN_IF_FULFILLED"),
    
    QUANTITY_SPLIT_CANCEL_WITHOUT_INVENTORY("QUANTITY_SPLIT_CANCEL_WITHOUT_INVENTORY"),
    
    CANCEL_ORDER("CANCEL_ORDER"),
    
    ASSIGN_TO_CUSTOMER_CARE("ASSIGN_TO_CUSTOMER_CARE"),
    
    ASSIGN_TO_GROUP("ASSIGN_TO_GROUP"),
    
    LINE_ITEM_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY("LINE_ITEM_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY"),
    
    QUANTITY_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY("QUANTITY_SPLIT_ASSIGN_CUSTOMER_CARE_WITHOUT_INVENTORY"),
    
    SEND_ORDER_TO_BIDDING("SEND_ORDER_TO_BIDDING"),
    
    LINE_ITEM_SPLIT_BACKORDER_WITHOUT_INVENTORY("LINE_ITEM_SPLIT_BACKORDER_WITHOUT_INVENTORY"),
    
    QUANTITY_SPLIT_BACKORDER_WITHOUT_INVENTORY("QUANTITY_SPLIT_BACKORDER_WITHOUT_INVENTORY"),
    
    ASSIGN_TO_BACKORDER("ASSIGN_TO_BACKORDER");

    private String value;

    FailoverActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FailoverActionEnum fromValue(String value) {
      for (FailoverActionEnum b : FailoverActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FailoverActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailoverActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FailoverActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FailoverActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FAILOVER_ACTION = "failoverAction";
  @SerializedName(SERIALIZED_NAME_FAILOVER_ACTION)
  private FailoverActionEnum failoverAction;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH_STRING = "pathString";
  @SerializedName(SERIALIZED_NAME_PATH_STRING)
  private String pathString;

  public static final String SERIALIZED_NAME_PERSISTED = "persisted";
  @SerializedName(SERIALIZED_NAME_PERSISTED)
  private Boolean persisted;

  /**
   * Gets or Sets restartAttempt
   */
  @JsonAdapter(RestartAttemptEnum.Adapter.class)
  public enum RestartAttemptEnum {
    START_AT_BEGINNING("START_AT_BEGINNING"),
    
    CURRENT_GROUP("CURRENT_GROUP"),
    
    GROUP_RANK("GROUP_RANK");

    private String value;

    RestartAttemptEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestartAttemptEnum fromValue(String value) {
      for (RestartAttemptEnum b : RestartAttemptEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestartAttemptEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestartAttemptEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestartAttemptEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestartAttemptEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESTART_ATTEMPT = "restartAttempt";
  @SerializedName(SERIALIZED_NAME_RESTART_ATTEMPT)
  private RestartAttemptEnum restartAttempt;

  public static final String SERIALIZED_NAME_SITE_I_D = "siteID";
  @SerializedName(SERIALIZED_NAME_SITE_I_D)
  private Integer siteID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_UPDATER_USERNAME = "updaterUsername";
  @SerializedName(SERIALIZED_NAME_UPDATER_USERNAME)
  private String updaterUsername;

  public static final String SERIALIZED_NAME_USER_CONTEXT = "userContext";
  @SerializedName(SERIALIZED_NAME_USER_CONTEXT)
  private UserContextInformation userContext;

  public GroupAfterAction() {
  }

  public GroupAfterAction actionID(Integer actionID) {
    
    this.actionID = actionID;
    return this;
  }

   /**
   * Get actionID
   * @return actionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getActionID() {
    return actionID;
  }


  public void setActionID(Integer actionID) {
    this.actionID = actionID;
  }


  public GroupAfterAction created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public GroupAfterAction creatorUsername(String creatorUsername) {
    
    this.creatorUsername = creatorUsername;
    return this;
  }

   /**
   * Get creatorUsername
   * @return creatorUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatorUsername() {
    return creatorUsername;
  }


  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }


  public GroupAfterAction environmentID(Integer environmentID) {
    
    this.environmentID = environmentID;
    return this;
  }

   /**
   * Get environmentID
   * @return environmentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEnvironmentID() {
    return environmentID;
  }


  public void setEnvironmentID(Integer environmentID) {
    this.environmentID = environmentID;
  }


  public GroupAfterAction failoverAction(FailoverActionEnum failoverAction) {
    
    this.failoverAction = failoverAction;
    return this;
  }

   /**
   * Get failoverAction
   * @return failoverAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FailoverActionEnum getFailoverAction() {
    return failoverAction;
  }


  public void setFailoverAction(FailoverActionEnum failoverAction) {
    this.failoverAction = failoverAction;
  }


  public GroupAfterAction name(String name) {
    
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


  public GroupAfterAction pathString(String pathString) {
    
    this.pathString = pathString;
    return this;
  }

   /**
   * Get pathString
   * @return pathString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathString() {
    return pathString;
  }


  public void setPathString(String pathString) {
    this.pathString = pathString;
  }


  public GroupAfterAction persisted(Boolean persisted) {
    
    this.persisted = persisted;
    return this;
  }

   /**
   * Get persisted
   * @return persisted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPersisted() {
    return persisted;
  }


  public void setPersisted(Boolean persisted) {
    this.persisted = persisted;
  }


  public GroupAfterAction restartAttempt(RestartAttemptEnum restartAttempt) {
    
    this.restartAttempt = restartAttempt;
    return this;
  }

   /**
   * Get restartAttempt
   * @return restartAttempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RestartAttemptEnum getRestartAttempt() {
    return restartAttempt;
  }


  public void setRestartAttempt(RestartAttemptEnum restartAttempt) {
    this.restartAttempt = restartAttempt;
  }


  public GroupAfterAction siteID(Integer siteID) {
    
    this.siteID = siteID;
    return this;
  }

   /**
   * Get siteID
   * @return siteID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteID() {
    return siteID;
  }


  public void setSiteID(Integer siteID) {
    this.siteID = siteID;
  }


  public GroupAfterAction tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Get tenantID
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public GroupAfterAction updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public GroupAfterAction updaterUsername(String updaterUsername) {
    
    this.updaterUsername = updaterUsername;
    return this;
  }

   /**
   * Get updaterUsername
   * @return updaterUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdaterUsername() {
    return updaterUsername;
  }


  public void setUpdaterUsername(String updaterUsername) {
    this.updaterUsername = updaterUsername;
  }


  public GroupAfterAction userContext(UserContextInformation userContext) {
    
    this.userContext = userContext;
    return this;
  }

   /**
   * Get userContext
   * @return userContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserContextInformation getUserContext() {
    return userContext;
  }


  public void setUserContext(UserContextInformation userContext) {
    this.userContext = userContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAfterAction groupAfterAction = (GroupAfterAction) o;
    return Objects.equals(this.actionID, groupAfterAction.actionID) &&
        Objects.equals(this.created, groupAfterAction.created) &&
        Objects.equals(this.creatorUsername, groupAfterAction.creatorUsername) &&
        Objects.equals(this.environmentID, groupAfterAction.environmentID) &&
        Objects.equals(this.failoverAction, groupAfterAction.failoverAction) &&
        Objects.equals(this.name, groupAfterAction.name) &&
        Objects.equals(this.pathString, groupAfterAction.pathString) &&
        Objects.equals(this.persisted, groupAfterAction.persisted) &&
        Objects.equals(this.restartAttempt, groupAfterAction.restartAttempt) &&
        Objects.equals(this.siteID, groupAfterAction.siteID) &&
        Objects.equals(this.tenantID, groupAfterAction.tenantID) &&
        Objects.equals(this.updated, groupAfterAction.updated) &&
        Objects.equals(this.updaterUsername, groupAfterAction.updaterUsername) &&
        Objects.equals(this.userContext, groupAfterAction.userContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionID, created, creatorUsername, environmentID, failoverAction, name, pathString, persisted, restartAttempt, siteID, tenantID, updated, updaterUsername, userContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAfterAction {\n");
    sb.append("    actionID: ").append(toIndentedString(actionID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorUsername: ").append(toIndentedString(creatorUsername)).append("\n");
    sb.append("    environmentID: ").append(toIndentedString(environmentID)).append("\n");
    sb.append("    failoverAction: ").append(toIndentedString(failoverAction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathString: ").append(toIndentedString(pathString)).append("\n");
    sb.append("    persisted: ").append(toIndentedString(persisted)).append("\n");
    sb.append("    restartAttempt: ").append(toIndentedString(restartAttempt)).append("\n");
    sb.append("    siteID: ").append(toIndentedString(siteID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updaterUsername: ").append(toIndentedString(updaterUsername)).append("\n");
    sb.append("    userContext: ").append(toIndentedString(userContext)).append("\n");
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
    openapiFields.add("actionID");
    openapiFields.add("created");
    openapiFields.add("creatorUsername");
    openapiFields.add("environmentID");
    openapiFields.add("failoverAction");
    openapiFields.add("name");
    openapiFields.add("pathString");
    openapiFields.add("persisted");
    openapiFields.add("restartAttempt");
    openapiFields.add("siteID");
    openapiFields.add("tenantID");
    openapiFields.add("updated");
    openapiFields.add("updaterUsername");
    openapiFields.add("userContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupAfterAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupAfterAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupAfterAction is not found in the empty JSON string", GroupAfterAction.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!GroupAfterAction.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupAfterAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("creatorUsername") != null && !jsonObj.get("creatorUsername").isJsonNull()) && !jsonObj.get("creatorUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorUsername").toString()));
      }
      if ((jsonObj.get("failoverAction") != null && !jsonObj.get("failoverAction").isJsonNull()) && !jsonObj.get("failoverAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failoverAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failoverAction").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pathString") != null && !jsonObj.get("pathString").isJsonNull()) && !jsonObj.get("pathString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pathString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pathString").toString()));
      }
      if ((jsonObj.get("restartAttempt") != null && !jsonObj.get("restartAttempt").isJsonNull()) && !jsonObj.get("restartAttempt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restartAttempt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restartAttempt").toString()));
      }
      if ((jsonObj.get("updaterUsername") != null && !jsonObj.get("updaterUsername").isJsonNull()) && !jsonObj.get("updaterUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updaterUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updaterUsername").toString()));
      }
      // validate the optional field `userContext`
      if (jsonObj.get("userContext") != null && !jsonObj.get("userContext").isJsonNull()) {
        UserContextInformation.validateJsonObject(jsonObj.getAsJsonObject("userContext"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupAfterAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupAfterAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupAfterAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupAfterAction.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupAfterAction>() {
           @Override
           public void write(JsonWriter out, GroupAfterAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupAfterAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupAfterAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupAfterAction
  * @throws IOException if the JSON string is invalid with respect to GroupAfterAction
  */
  public static GroupAfterAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupAfterAction.class);
  }

 /**
  * Convert an instance of GroupAfterAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

