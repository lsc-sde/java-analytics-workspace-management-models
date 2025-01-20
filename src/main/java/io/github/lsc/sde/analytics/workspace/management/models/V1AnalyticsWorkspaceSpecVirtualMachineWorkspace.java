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
 * This is not yet implemented, it is to test validation of the CRD is functioning correctly
 */
@ApiModel(description = "This is not yet implemented, it is to test validation of the CRD is functioning correctly")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsWorkspaceSpecVirtualMachineWorkspace {
  public static final String SERIALIZED_NAME_MAX_HOSTS = "maxHosts";
  @SerializedName(SERIALIZED_NAME_MAX_HOSTS)
  private Object maxHosts;


  public V1AnalyticsWorkspaceSpecVirtualMachineWorkspace maxHosts(Object maxHosts) {
    
    this.maxHosts = maxHosts;
    return this;
  }

   /**
   * The maximum number of hosts
   * @return maxHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of hosts")

  public Object getMaxHosts() {
    return maxHosts;
  }


  public void setMaxHosts(Object maxHosts) {
    this.maxHosts = maxHosts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceSpecVirtualMachineWorkspace v1AnalyticsWorkspaceSpecVirtualMachineWorkspace = (V1AnalyticsWorkspaceSpecVirtualMachineWorkspace) o;
    return Objects.equals(this.maxHosts, v1AnalyticsWorkspaceSpecVirtualMachineWorkspace.maxHosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHosts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceSpecVirtualMachineWorkspace {\n");
    sb.append("    maxHosts: ").append(toIndentedString(maxHosts)).append("\n");
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

