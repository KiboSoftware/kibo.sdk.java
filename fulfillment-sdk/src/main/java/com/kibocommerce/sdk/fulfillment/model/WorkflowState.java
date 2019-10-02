/*
 * Kibo Fulfillment API
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
import com.kibocommerce.sdk.fulfillment.model.AuditInfo;
import com.kibocommerce.sdk.fulfillment.model.Task;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * WorkflowState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-02T08:12:12.452367-05:00[America/Chicago]")
public class WorkflowState {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo = null;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private OffsetDateTime completedDate;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_SHIPMENT_STATE = "shipmentState";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATE)
  private String shipmentState;

  public static final String SERIALIZED_NAME_TASK_LIST = "taskList";
  @SerializedName(SERIALIZED_NAME_TASK_LIST)
  private List<Task> taskList = null;

  public WorkflowState attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkflowState putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public WorkflowState auditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @ApiModelProperty(value = "")
  public AuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }

  public WorkflowState completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public WorkflowState processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public WorkflowState shipmentState(String shipmentState) {
    this.shipmentState = shipmentState;
    return this;
  }

   /**
   * Get shipmentState
   * @return shipmentState
  **/
  @ApiModelProperty(value = "")
  public String getShipmentState() {
    return shipmentState;
  }

  public void setShipmentState(String shipmentState) {
    this.shipmentState = shipmentState;
  }

  public WorkflowState taskList(List<Task> taskList) {
    this.taskList = taskList;
    return this;
  }

  public WorkflowState addTaskListItem(Task taskListItem) {
    if (this.taskList == null) {
      this.taskList = new ArrayList<Task>();
    }
    this.taskList.add(taskListItem);
    return this;
  }

   /**
   * Get taskList
   * @return taskList
  **/
  @ApiModelProperty(value = "")
  public List<Task> getTaskList() {
    return taskList;
  }

  public void setTaskList(List<Task> taskList) {
    this.taskList = taskList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowState workflowState = (WorkflowState) o;
    return Objects.equals(this.attributes, workflowState.attributes) &&
        Objects.equals(this.auditInfo, workflowState.auditInfo) &&
        Objects.equals(this.completedDate, workflowState.completedDate) &&
        Objects.equals(this.processInstanceId, workflowState.processInstanceId) &&
        Objects.equals(this.shipmentState, workflowState.shipmentState) &&
        Objects.equals(this.taskList, workflowState.taskList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, auditInfo, completedDate, processInstanceId, shipmentState, taskList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowState {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    shipmentState: ").append(toIndentedString(shipmentState)).append("\n");
    sb.append("    taskList: ").append(toIndentedString(taskList)).append("\n");
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

