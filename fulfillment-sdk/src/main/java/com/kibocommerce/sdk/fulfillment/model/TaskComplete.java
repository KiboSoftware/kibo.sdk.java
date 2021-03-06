/*
 * Kibo Fulfillment API - Production Profile
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.model.HandleOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TaskComplete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class TaskComplete {
  public static final String SERIALIZED_NAME_HANDLE_OPTION = "handleOption";
  @SerializedName(SERIALIZED_NAME_HANDLE_OPTION)
  private HandleOption handleOption = null;

  public static final String SERIALIZED_NAME_TASK_BODY = "taskBody";
  @SerializedName(SERIALIZED_NAME_TASK_BODY)
  private Map<String, Object> taskBody = null;

  public TaskComplete handleOption(HandleOption handleOption) {
    this.handleOption = handleOption;
    return this;
  }

   /**
   * Get handleOption
   * @return handleOption
  **/
  @ApiModelProperty(value = "")
  public HandleOption getHandleOption() {
    return handleOption;
  }

  public void setHandleOption(HandleOption handleOption) {
    this.handleOption = handleOption;
  }

  public TaskComplete taskBody(Map<String, Object> taskBody) {
    this.taskBody = taskBody;
    return this;
  }

  public TaskComplete putTaskBodyItem(String key, Object taskBodyItem) {
    if (this.taskBody == null) {
      this.taskBody = new HashMap<String, Object>();
    }
    this.taskBody.put(key, taskBodyItem);
    return this;
  }

   /**
   * Get taskBody
   * @return taskBody
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getTaskBody() {
    return taskBody;
  }

  public void setTaskBody(Map<String, Object> taskBody) {
    this.taskBody = taskBody;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskComplete taskComplete = (TaskComplete) o;
    return Objects.equals(this.handleOption, taskComplete.handleOption) &&
        Objects.equals(this.taskBody, taskComplete.taskBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handleOption, taskBody);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskComplete {\n");
    
    sb.append("    handleOption: ").append(toIndentedString(handleOption)).append("\n");
    sb.append("    taskBody: ").append(toIndentedString(taskBody)).append("\n");
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

