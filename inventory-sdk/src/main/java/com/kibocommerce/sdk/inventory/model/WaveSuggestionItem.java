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
import com.kibocommerce.sdk.inventory.model.WaveItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WaveSuggestionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-25T11:56:03.255426-05:00[America/Chicago]")
public class WaveSuggestionItem extends WaveItem {
  public static final String SERIALIZED_NAME_BIN_NAME = "binName";
  @SerializedName(SERIALIZED_NAME_BIN_NAME)
  private String binName;

  public WaveSuggestionItem binName(String binName) {
    this.binName = binName;
    return this;
  }

   /**
   * Bin Name
   * @return binName
  **/
  @ApiModelProperty(required = true, value = "Bin Name")
  public String getBinName() {
    return binName;
  }

  public void setBinName(String binName) {
    this.binName = binName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaveSuggestionItem waveSuggestionItem = (WaveSuggestionItem) o;
    return Objects.equals(this.binName, waveSuggestionItem.binName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaveSuggestionItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    binName: ").append(toIndentedString(binName)).append("\n");
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

