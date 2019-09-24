/*
 * Kibo Admin User Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.kibo.sdk.java.auth.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.kibo.sdk.java.auth.model.AuditInfo;
import com.kibocommerce.kibo.sdk.java.auth.model.Behavior;
import com.kibocommerce.kibo.sdk.java.auth.model.Owner;
import com.kibocommerce.kibo.sdk.java.auth.model.Resource;
import com.kibocommerce.kibo.sdk.java.auth.model.UserScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T10:12:53.586362-05:00[America/Chicago]")
public class Role {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_SYSTEM_ROLE = "isSystemRole";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM_ROLE)
  private Boolean isSystemRole;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<Behavior> behaviors = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<Resource> resources = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USER_SCOPE = "userScope";
  @SerializedName(SERIALIZED_NAME_USER_SCOPE)
  private UserScope userScope = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private Owner owner = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo = null;

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role isSystemRole(Boolean isSystemRole) {
    this.isSystemRole = isSystemRole;
    return this;
  }

   /**
   * Get isSystemRole
   * @return isSystemRole
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsSystemRole() {
    return isSystemRole;
  }

  public void setIsSystemRole(Boolean isSystemRole) {
    this.isSystemRole = isSystemRole;
  }

  public Role behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public Role addBehaviorsItem(Behavior behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<Behavior>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * Get behaviors
   * @return behaviors
  **/
  @ApiModelProperty(value = "")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  public Role resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public Role addResourcesItem(Resource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<Resource>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public Role tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Role addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Role id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Role userScope(UserScope userScope) {
    this.userScope = userScope;
    return this;
  }

   /**
   * Get userScope
   * @return userScope
  **/
  @ApiModelProperty(value = "")
  public UserScope getUserScope() {
    return userScope;
  }

  public void setUserScope(UserScope userScope) {
    this.userScope = userScope;
  }

  public Role owner(Owner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public Role auditInfo(AuditInfo auditInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.name, role.name) &&
        Objects.equals(this.isSystemRole, role.isSystemRole) &&
        Objects.equals(this.behaviors, role.behaviors) &&
        Objects.equals(this.resources, role.resources) &&
        Objects.equals(this.tags, role.tags) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.userScope, role.userScope) &&
        Objects.equals(this.owner, role.owner) &&
        Objects.equals(this.auditInfo, role.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isSystemRole, behaviors, resources, tags, id, userScope, owner, auditInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isSystemRole: ").append(toIndentedString(isSystemRole)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userScope: ").append(toIndentedString(userScope)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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

