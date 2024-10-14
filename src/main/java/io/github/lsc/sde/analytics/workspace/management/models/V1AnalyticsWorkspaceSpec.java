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
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsWorkspaceSpecJupyterWorkspace;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsWorkspaceSpecValidity;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsWorkspaceSpecVirtualMachineWorkspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AnalyticsWorkspaceSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-14T14:18:25.662Z[Etc/UTC]")
public class V1AnalyticsWorkspaceSpec {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_JUPYTER_WORKSPACE = "jupyterWorkspace";
  @SerializedName(SERIALIZED_NAME_JUPYTER_WORKSPACE)
  private V1AnalyticsWorkspaceSpecJupyterWorkspace jupyterWorkspace;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private V1AnalyticsWorkspaceSpecValidity validity;

  public static final String SERIALIZED_NAME_VIRTUAL_MACHINE_WORKSPACE = "virtualMachineWorkspace";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_MACHINE_WORKSPACE)
  private V1AnalyticsWorkspaceSpecVirtualMachineWorkspace virtualMachineWorkspace;


  public V1AnalyticsWorkspaceSpec description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * REQUIRED. A simple description which can be multiple lines describing the workspace
   * @return description
  **/
  @ApiModelProperty(required = true, value = "REQUIRED. A simple description which can be multiple lines describing the workspace")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1AnalyticsWorkspaceSpec displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * REQUIRED. The short display name used as the title for the workspace.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "REQUIRED. The short display name used as the title for the workspace.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public V1AnalyticsWorkspaceSpec jupyterWorkspace(V1AnalyticsWorkspaceSpecJupyterWorkspace jupyterWorkspace) {
    
    this.jupyterWorkspace = jupyterWorkspace;
    return this;
  }

   /**
   * Get jupyterWorkspace
   * @return jupyterWorkspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsWorkspaceSpecJupyterWorkspace getJupyterWorkspace() {
    return jupyterWorkspace;
  }


  public void setJupyterWorkspace(V1AnalyticsWorkspaceSpecJupyterWorkspace jupyterWorkspace) {
    this.jupyterWorkspace = jupyterWorkspace;
  }


  public V1AnalyticsWorkspaceSpec validity(V1AnalyticsWorkspaceSpecValidity validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @ApiModelProperty(required = true, value = "")

  public V1AnalyticsWorkspaceSpecValidity getValidity() {
    return validity;
  }


  public void setValidity(V1AnalyticsWorkspaceSpecValidity validity) {
    this.validity = validity;
  }


  public V1AnalyticsWorkspaceSpec virtualMachineWorkspace(V1AnalyticsWorkspaceSpecVirtualMachineWorkspace virtualMachineWorkspace) {
    
    this.virtualMachineWorkspace = virtualMachineWorkspace;
    return this;
  }

   /**
   * Get virtualMachineWorkspace
   * @return virtualMachineWorkspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsWorkspaceSpecVirtualMachineWorkspace getVirtualMachineWorkspace() {
    return virtualMachineWorkspace;
  }


  public void setVirtualMachineWorkspace(V1AnalyticsWorkspaceSpecVirtualMachineWorkspace virtualMachineWorkspace) {
    this.virtualMachineWorkspace = virtualMachineWorkspace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceSpec v1AnalyticsWorkspaceSpec = (V1AnalyticsWorkspaceSpec) o;
    return Objects.equals(this.description, v1AnalyticsWorkspaceSpec.description) &&
        Objects.equals(this.displayName, v1AnalyticsWorkspaceSpec.displayName) &&
        Objects.equals(this.jupyterWorkspace, v1AnalyticsWorkspaceSpec.jupyterWorkspace) &&
        Objects.equals(this.validity, v1AnalyticsWorkspaceSpec.validity) &&
        Objects.equals(this.virtualMachineWorkspace, v1AnalyticsWorkspaceSpec.virtualMachineWorkspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, jupyterWorkspace, validity, virtualMachineWorkspace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceSpec {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    jupyterWorkspace: ").append(toIndentedString(jupyterWorkspace)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    virtualMachineWorkspace: ").append(toIndentedString(virtualMachineWorkspace)).append("\n");
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

