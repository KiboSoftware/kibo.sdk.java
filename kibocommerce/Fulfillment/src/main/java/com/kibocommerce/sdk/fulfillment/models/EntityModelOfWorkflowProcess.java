/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.Links;
import com.kibocommerce.sdk.fulfillment.models.TaskDefinition;
import com.kibocommerce.sdk.fulfillment.models.WorkflowProcessVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * EntityModelOfWorkflowProcess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityModelOfWorkflowProcess implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CONTAINER_ALIAS = "containerAlias";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ALIAS)
  private String containerAlias;

  public static final String SERIALIZED_NAME_CONTAINER_ID = "containerId";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
  private String containerId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<TaskDefinition> tasks = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<WorkflowProcessVariable> variables = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public EntityModelOfWorkflowProcess() {
  }

  public EntityModelOfWorkflowProcess links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  public EntityModelOfWorkflowProcess attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public EntityModelOfWorkflowProcess putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public EntityModelOfWorkflowProcess containerAlias(String containerAlias) {
    
    this.containerAlias = containerAlias;
    return this;
  }

   /**
   * Get containerAlias
   * @return containerAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContainerAlias() {
    return containerAlias;
  }


  public void setContainerAlias(String containerAlias) {
    this.containerAlias = containerAlias;
  }


  public EntityModelOfWorkflowProcess containerId(String containerId) {
    
    this.containerId = containerId;
    return this;
  }

   /**
   * Get containerId
   * @return containerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContainerId() {
    return containerId;
  }


  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }


  public EntityModelOfWorkflowProcess id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityModelOfWorkflowProcess tasks(List<TaskDefinition> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public EntityModelOfWorkflowProcess addTasksItem(TaskDefinition tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaskDefinition> getTasks() {
    return tasks;
  }


  public void setTasks(List<TaskDefinition> tasks) {
    this.tasks = tasks;
  }


  public EntityModelOfWorkflowProcess variables(List<WorkflowProcessVariable> variables) {
    
    this.variables = variables;
    return this;
  }

  public EntityModelOfWorkflowProcess addVariablesItem(WorkflowProcessVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowProcessVariable> getVariables() {
    return variables;
  }


  public void setVariables(List<WorkflowProcessVariable> variables) {
    this.variables = variables;
  }


  public EntityModelOfWorkflowProcess version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityModelOfWorkflowProcess entityModelOfWorkflowProcess = (EntityModelOfWorkflowProcess) o;
    return Objects.equals(this.links, entityModelOfWorkflowProcess.links) &&
        Objects.equals(this.attributes, entityModelOfWorkflowProcess.attributes) &&
        Objects.equals(this.containerAlias, entityModelOfWorkflowProcess.containerAlias) &&
        Objects.equals(this.containerId, entityModelOfWorkflowProcess.containerId) &&
        Objects.equals(this.id, entityModelOfWorkflowProcess.id) &&
        Objects.equals(this.tasks, entityModelOfWorkflowProcess.tasks) &&
        Objects.equals(this.variables, entityModelOfWorkflowProcess.variables) &&
        Objects.equals(this.version, entityModelOfWorkflowProcess.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, attributes, containerAlias, containerId, id, tasks, variables, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityModelOfWorkflowProcess {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    containerAlias: ").append(toIndentedString(containerAlias)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("attributes");
    openapiFields.add("containerAlias");
    openapiFields.add("containerId");
    openapiFields.add("id");
    openapiFields.add("tasks");
    openapiFields.add("variables");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EntityModelOfWorkflowProcess
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EntityModelOfWorkflowProcess.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntityModelOfWorkflowProcess is not found in the empty JSON string", EntityModelOfWorkflowProcess.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!EntityModelOfWorkflowProcess.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntityModelOfWorkflowProcess` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        Links.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      if ((jsonObj.get("containerAlias") != null && !jsonObj.get("containerAlias").isJsonNull()) && !jsonObj.get("containerAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerAlias").toString()));
      }
      if ((jsonObj.get("containerId") != null && !jsonObj.get("containerId").isJsonNull()) && !jsonObj.get("containerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tasks` to be an array in the JSON string but got `%s`", jsonObj.get("tasks").toString()));
          }

          // validate the optional field `tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            TaskDefinition.validateJsonObject(jsonArraytasks.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("variables") != null && !jsonObj.get("variables").isJsonNull()) {
        JsonArray jsonArrayvariables = jsonObj.getAsJsonArray("variables");
        if (jsonArrayvariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variables` to be an array in the JSON string but got `%s`", jsonObj.get("variables").toString()));
          }

          // validate the optional field `variables` (array)
          for (int i = 0; i < jsonArrayvariables.size(); i++) {
            WorkflowProcessVariable.validateJsonObject(jsonArrayvariables.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntityModelOfWorkflowProcess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntityModelOfWorkflowProcess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntityModelOfWorkflowProcess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntityModelOfWorkflowProcess.class));

       return (TypeAdapter<T>) new TypeAdapter<EntityModelOfWorkflowProcess>() {
           @Override
           public void write(JsonWriter out, EntityModelOfWorkflowProcess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntityModelOfWorkflowProcess read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntityModelOfWorkflowProcess given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntityModelOfWorkflowProcess
  * @throws IOException if the JSON string is invalid with respect to EntityModelOfWorkflowProcess
  */
  public static EntityModelOfWorkflowProcess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntityModelOfWorkflowProcess.class);
  }

 /**
  * Convert an instance of EntityModelOfWorkflowProcess to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

