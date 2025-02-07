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
 * V1AnalyticsWorkspaceBindingStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsWorkspaceBindingStatus {
  public static final String SERIALIZED_NAME_DEPLOYMENT_NAME = "deploymentName";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_NAME)
  private String deploymentName;

  public static final String SERIALIZED_NAME_LAST_ACTIVE_CHECK = "lastActiveCheck";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVE_CHECK)
  private String lastActiveCheck;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_STATUS_TEXT = "statusText";
  @SerializedName(SERIALIZED_NAME_STATUS_TEXT)
  private String statusText;


  public V1AnalyticsWorkspaceBindingStatus deploymentName(String deploymentName) {
    
    this.deploymentName = deploymentName;
    return this;
  }

   /**
   * Get deploymentName
   * @return deploymentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentName() {
    return deploymentName;
  }


  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }


  public V1AnalyticsWorkspaceBindingStatus lastActiveCheck(String lastActiveCheck) {
    
    this.lastActiveCheck = lastActiveCheck;
    return this;
  }

   /**
   * Get lastActiveCheck
   * @return lastActiveCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastActiveCheck() {
    return lastActiveCheck;
  }


  public void setLastActiveCheck(String lastActiveCheck) {
    this.lastActiveCheck = lastActiveCheck;
  }


  public V1AnalyticsWorkspaceBindingStatus replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1AnalyticsWorkspaceBindingStatus statusText(String statusText) {
    
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusText() {
    return statusText;
  }


  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceBindingStatus v1AnalyticsWorkspaceBindingStatus = (V1AnalyticsWorkspaceBindingStatus) o;
    return Objects.equals(this.deploymentName, v1AnalyticsWorkspaceBindingStatus.deploymentName) &&
        Objects.equals(this.lastActiveCheck, v1AnalyticsWorkspaceBindingStatus.lastActiveCheck) &&
        Objects.equals(this.replicas, v1AnalyticsWorkspaceBindingStatus.replicas) &&
        Objects.equals(this.statusText, v1AnalyticsWorkspaceBindingStatus.statusText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentName, lastActiveCheck, replicas, statusText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceBindingStatus {\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    lastActiveCheck: ").append(toIndentedString(lastActiveCheck)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
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

