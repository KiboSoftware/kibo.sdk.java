/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

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
import java.util.ArrayList;
import java.util.List;
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
 * Response for getting a job
 */
@ApiModel(description = "Response for getting a job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobQueueResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_JOB_I_D = "jobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private Integer jobID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private Integer tenantID;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  /**
   * Purpose of the job
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REFRESH("REFRESH"),
    
    ADJUST("ADJUST"),
    
    RELEASE_SHIPMENTS("RELEASE_SHIPMENTS"),
    
    CREATE_PICK_WAVE("CREATE_PICK_WAVE"),
    
    CLOSE_PICK_WAVE("CLOSE_PICK_WAVE"),
    
    PUT_AWAY_FILE("PUT_AWAY_FILE"),
    
    SHORT_PICK_ERROR("SHORT_PICK_ERROR"),
    
    BIN_AUDIT_START("BIN_AUDIT_START"),
    
    BIN_AUDIT_COMPLETION("BIN_AUDIT_COMPLETION"),
    
    CREATE_BIN_AUDIT("CREATE_BIN_AUDIT"),
    
    RELEASE_PENDING_ITEMS("RELEASE_PENDING_ITEMS"),
    
    ALLOCATE("ALLOCATE"),
    
    DEALLOCATE("DEALLOCATE"),
    
    FULFILL("FULFILL"),
    
    DELETE("DELETE");

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

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private String added;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private String started;

  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private String finished;

  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_HAS_DATA = "hasData";
  @SerializedName(SERIALIZED_NAME_HAS_DATA)
  private Boolean hasData;

  public static final String SERIALIZED_NAME_ITEM_COUNT = "itemCount";
  @SerializedName(SERIALIZED_NAME_ITEM_COUNT)
  private Integer itemCount;

  /**
   * Current status of job completion
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    WORKING("WORKING"),
    
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED");

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public JobQueueResponse() {
  }

  public JobQueueResponse jobID(Integer jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Internal identifier that uniquely identifies a single job
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal identifier that uniquely identifies a single job")

  public Integer getJobID() {
    return jobID;
  }


  public void setJobID(Integer jobID) {
    this.jobID = jobID;
  }


  public JobQueueResponse tenantID(Integer tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Unique internal identifier of the tenant that owns the job
   * @return tenantID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique internal identifier of the tenant that owns the job")

  public Integer getTenantID() {
    return tenantID;
  }


  public void setTenantID(Integer tenantID) {
    this.tenantID = tenantID;
  }


  public JobQueueResponse locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Unique internal Identifier of the owning location
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique internal Identifier of the owning location")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public JobQueueResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Purpose of the job
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Purpose of the job")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public JobQueueResponse added(String added) {
    
    this.added = added;
    return this;
  }

   /**
   * Time and date the job was added to the queue in ISO8601 format in UTC
   * @return added
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time and date the job was added to the queue in ISO8601 format in UTC")

  public String getAdded() {
    return added;
  }


  public void setAdded(String added) {
    this.added = added;
  }


  public JobQueueResponse started(String started) {
    
    this.started = started;
    return this;
  }

   /**
   * Time and date the job was started in ISO8601 format in UTC
   * @return started
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time and date the job was started in ISO8601 format in UTC")

  public String getStarted() {
    return started;
  }


  public void setStarted(String started) {
    this.started = started;
  }


  public JobQueueResponse finished(String finished) {
    
    this.finished = finished;
    return this;
  }

   /**
   * Time and date the job was finished in ISO8601 format in UTC
   * @return finished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time and date the job was finished in ISO8601 format in UTC")

  public String getFinished() {
    return finished;
  }


  public void setFinished(String finished) {
    this.finished = finished;
  }


  public JobQueueResponse originalFilename(String originalFilename) {
    
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * The full name of the file that was picked up at the secure droppoint server before being split up by location. Applies only to refresh and adjust jobs created via file fetch process
   * @return originalFilename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name of the file that was picked up at the secure droppoint server before being split up by location. Applies only to refresh and adjust jobs created via file fetch process")

  public String getOriginalFilename() {
    return originalFilename;
  }


  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  public JobQueueResponse hasData(Boolean hasData) {
    
    this.hasData = hasData;
    return this;
  }

   /**
   * True if the job was not created from a fetched file
   * @return hasData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the job was not created from a fetched file")

  public Boolean getHasData() {
    return hasData;
  }


  public void setHasData(Boolean hasData) {
    this.hasData = hasData;
  }


  public JobQueueResponse itemCount(Integer itemCount) {
    
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The number of items processed, only for job types REFRESH and ADJUST
   * @return itemCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items processed, only for job types REFRESH and ADJUST")

  public Integer getItemCount() {
    return itemCount;
  }


  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  public JobQueueResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current status of job completion
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current status of job completion")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public JobQueueResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Flag for success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for success")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public JobQueueResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public JobQueueResponse addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * List of messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of messages")

  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  public JobQueueResponse numResults(Integer numResults) {
    
    this.numResults = numResults;
    return this;
  }

   /**
   * Number of results
   * @return numResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of results")

  public Integer getNumResults() {
    return numResults;
  }


  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobQueueResponse jobQueueResponse = (JobQueueResponse) o;
    return Objects.equals(this.jobID, jobQueueResponse.jobID) &&
        Objects.equals(this.tenantID, jobQueueResponse.tenantID) &&
        Objects.equals(this.locationCode, jobQueueResponse.locationCode) &&
        Objects.equals(this.type, jobQueueResponse.type) &&
        Objects.equals(this.added, jobQueueResponse.added) &&
        Objects.equals(this.started, jobQueueResponse.started) &&
        Objects.equals(this.finished, jobQueueResponse.finished) &&
        Objects.equals(this.originalFilename, jobQueueResponse.originalFilename) &&
        Objects.equals(this.hasData, jobQueueResponse.hasData) &&
        Objects.equals(this.itemCount, jobQueueResponse.itemCount) &&
        Objects.equals(this.status, jobQueueResponse.status) &&
        Objects.equals(this.success, jobQueueResponse.success) &&
        Objects.equals(this.messages, jobQueueResponse.messages) &&
        Objects.equals(this.numResults, jobQueueResponse.numResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobID, tenantID, locationCode, type, added, started, finished, originalFilename, hasData, itemCount, status, success, messages, numResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobQueueResponse {\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    hasData: ").append(toIndentedString(hasData)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
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
    openapiFields.add("jobID");
    openapiFields.add("tenantID");
    openapiFields.add("locationCode");
    openapiFields.add("type");
    openapiFields.add("added");
    openapiFields.add("started");
    openapiFields.add("finished");
    openapiFields.add("originalFilename");
    openapiFields.add("hasData");
    openapiFields.add("itemCount");
    openapiFields.add("status");
    openapiFields.add("success");
    openapiFields.add("messages");
    openapiFields.add("numResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobQueueResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobQueueResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobQueueResponse is not found in the empty JSON string", JobQueueResponse.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!JobQueueResponse.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobQueueResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("added") != null && !jsonObj.get("added").isJsonNull()) && !jsonObj.get("added").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added").toString()));
      }
      if ((jsonObj.get("started") != null && !jsonObj.get("started").isJsonNull()) && !jsonObj.get("started").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `started` to be a primitive type in the JSON string but got `%s`", jsonObj.get("started").toString()));
      }
      if ((jsonObj.get("finished") != null && !jsonObj.get("finished").isJsonNull()) && !jsonObj.get("finished").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finished` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finished").toString()));
      }
      if ((jsonObj.get("originalFilename") != null && !jsonObj.get("originalFilename").isJsonNull()) && !jsonObj.get("originalFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFilename").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobQueueResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobQueueResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobQueueResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobQueueResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobQueueResponse>() {
           @Override
           public void write(JsonWriter out, JobQueueResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobQueueResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobQueueResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobQueueResponse
  * @throws IOException if the JSON string is invalid with respect to JobQueueResponse
  */
  public static JobQueueResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobQueueResponse.class);
  }

 /**
  * Convert an instance of JobQueueResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
