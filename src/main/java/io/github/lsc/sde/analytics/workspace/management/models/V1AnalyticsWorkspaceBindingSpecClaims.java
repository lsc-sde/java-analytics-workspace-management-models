/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.lsc.sde.analytics.workspace.management.models;

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

/**
 * V1AnalyticsWorkspaceBindingSpecClaims
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T13:36:45.687Z[Etc/UTC]")
public class V1AnalyticsWorkspaceBindingSpecClaims {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public V1AnalyticsWorkspaceBindingSpecClaims name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the claim to look for
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the claim to look for")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1AnalyticsWorkspaceBindingSpecClaims operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator to match
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The operator to match")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1AnalyticsWorkspaceBindingSpecClaims value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value to match against
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to match against")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceBindingSpecClaims v1AnalyticsWorkspaceBindingSpecClaims = (V1AnalyticsWorkspaceBindingSpecClaims) o;
    return Objects.equals(this.name, v1AnalyticsWorkspaceBindingSpecClaims.name) &&
        Objects.equals(this.operator, v1AnalyticsWorkspaceBindingSpecClaims.operator) &&
        Objects.equals(this.value, v1AnalyticsWorkspaceBindingSpecClaims.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceBindingSpecClaims {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

}

