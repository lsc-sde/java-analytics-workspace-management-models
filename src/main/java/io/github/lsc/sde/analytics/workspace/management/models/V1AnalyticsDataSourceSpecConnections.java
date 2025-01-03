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
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsDataSourceSpecConnectionString;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsDataSourceSpecDatabricksConnection;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsDataSourceSpecRoCrate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AnalyticsDataSourceSpecConnections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T09:52:21.861Z[Etc/UTC]")
public class V1AnalyticsDataSourceSpecConnections {
  public static final String SERIALIZED_NAME_CONNECTION_STRING = "connectionString";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STRING)
  private V1AnalyticsDataSourceSpecConnectionString connectionString;

  public static final String SERIALIZED_NAME_DATABRICKS_CONNECTION = "databricksConnection";
  @SerializedName(SERIALIZED_NAME_DATABRICKS_CONNECTION)
  private V1AnalyticsDataSourceSpecDatabricksConnection databricksConnection;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RO_CRATE = "roCrate";
  @SerializedName(SERIALIZED_NAME_RO_CRATE)
  private V1AnalyticsDataSourceSpecRoCrate roCrate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1AnalyticsDataSourceSpecConnections connectionString(V1AnalyticsDataSourceSpecConnectionString connectionString) {
    
    this.connectionString = connectionString;
    return this;
  }

   /**
   * Get connectionString
   * @return connectionString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsDataSourceSpecConnectionString getConnectionString() {
    return connectionString;
  }


  public void setConnectionString(V1AnalyticsDataSourceSpecConnectionString connectionString) {
    this.connectionString = connectionString;
  }


  public V1AnalyticsDataSourceSpecConnections databricksConnection(V1AnalyticsDataSourceSpecDatabricksConnection databricksConnection) {
    
    this.databricksConnection = databricksConnection;
    return this;
  }

   /**
   * Get databricksConnection
   * @return databricksConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsDataSourceSpecDatabricksConnection getDatabricksConnection() {
    return databricksConnection;
  }


  public void setDatabricksConnection(V1AnalyticsDataSourceSpecDatabricksConnection databricksConnection) {
    this.databricksConnection = databricksConnection;
  }


  public V1AnalyticsDataSourceSpecConnections name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the connection
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the connection")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1AnalyticsDataSourceSpecConnections roCrate(V1AnalyticsDataSourceSpecRoCrate roCrate) {
    
    this.roCrate = roCrate;
    return this;
  }

   /**
   * Get roCrate
   * @return roCrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsDataSourceSpecRoCrate getRoCrate() {
    return roCrate;
  }


  public void setRoCrate(V1AnalyticsDataSourceSpecRoCrate roCrate) {
    this.roCrate = roCrate;
  }


  public V1AnalyticsDataSourceSpecConnections type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of description being configured
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of description being configured")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsDataSourceSpecConnections v1AnalyticsDataSourceSpecConnections = (V1AnalyticsDataSourceSpecConnections) o;
    return Objects.equals(this.connectionString, v1AnalyticsDataSourceSpecConnections.connectionString) &&
        Objects.equals(this.databricksConnection, v1AnalyticsDataSourceSpecConnections.databricksConnection) &&
        Objects.equals(this.name, v1AnalyticsDataSourceSpecConnections.name) &&
        Objects.equals(this.roCrate, v1AnalyticsDataSourceSpecConnections.roCrate) &&
        Objects.equals(this.type, v1AnalyticsDataSourceSpecConnections.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionString, databricksConnection, name, roCrate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsDataSourceSpecConnections {\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
    sb.append("    databricksConnection: ").append(toIndentedString(databricksConnection)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roCrate: ").append(toIndentedString(roCrate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
