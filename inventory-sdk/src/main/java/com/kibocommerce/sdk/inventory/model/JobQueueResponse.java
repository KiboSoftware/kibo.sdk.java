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


package com.kibocommerce.sdk.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * JobQueueResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-07T16:32:28.052447-06:00[America/Chicago]")
public class JobQueueResponse extends BaseResponse {
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

  public JobQueueResponse jobID(Integer jobID) {
    this.jobID = jobID;
    return this;
  }

   /**
   * Internal identifier that uniquely identifies a single job
   * @return jobID
  **/
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
  @ApiModelProperty(value = "Current status of job completion")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobID, tenantID, locationCode, type, added, started, finished, originalFilename, hasData, itemCount, status, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobQueueResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

