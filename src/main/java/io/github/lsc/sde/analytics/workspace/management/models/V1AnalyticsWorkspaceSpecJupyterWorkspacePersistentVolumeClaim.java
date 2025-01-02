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
 * V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T13:36:45.687Z[Etc/UTC]")
public class V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;


  public V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the default persistent volume claim to associate with this workspace.  If not populated, it will use the workspace name to generate a new name for the PVC automatically 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the default persistent volume claim to associate with this workspace.  If not populated, it will use the workspace name to generate a new name for the PVC automatically ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * The name of the storage class to create the persistent volume claim.  If not populated, it will default to the system default  This is only applied when a PVC is initially created, it is ignored otherwise. 
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the storage class to create the persistent volume claim.  If not populated, it will default to the system default  This is only applied when a PVC is initially created, it is ignored otherwise. ")

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim v1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim = (V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim) o;
    return Objects.equals(this.name, v1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim.name) &&
        Objects.equals(this.storageClassName, v1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim.storageClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, storageClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
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

