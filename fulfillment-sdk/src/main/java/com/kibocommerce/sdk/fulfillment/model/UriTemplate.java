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
import com.kibocommerce.sdk.fulfillment.model.TemplateVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UriTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:42:53.880-06:00[America/Chicago]")
public class UriTemplate {
  public static final String SERIALIZED_NAME_VARIABLE_NAMES = "variableNames";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAMES)
  private List<String> variableNames = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<TemplateVariable> variables = null;

  public UriTemplate variableNames(List<String> variableNames) {
    this.variableNames = variableNames;
    return this;
  }

  public UriTemplate addVariableNamesItem(String variableNamesItem) {
    if (this.variableNames == null) {
      this.variableNames = new ArrayList<String>();
    }
    this.variableNames.add(variableNamesItem);
    return this;
  }

   /**
   * Get variableNames
   * @return variableNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getVariableNames() {
    return variableNames;
  }

  public void setVariableNames(List<String> variableNames) {
    this.variableNames = variableNames;
  }

  public UriTemplate variables(List<TemplateVariable> variables) {
    this.variables = variables;
    return this;
  }

  public UriTemplate addVariablesItem(TemplateVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<TemplateVariable>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")
  public List<TemplateVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<TemplateVariable> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UriTemplate uriTemplate = (UriTemplate) o;
    return Objects.equals(this.variableNames, uriTemplate.variableNames) &&
        Objects.equals(this.variables, uriTemplate.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableNames, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UriTemplate {\n");
    
    sb.append("    variableNames: ").append(toIndentedString(variableNames)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

