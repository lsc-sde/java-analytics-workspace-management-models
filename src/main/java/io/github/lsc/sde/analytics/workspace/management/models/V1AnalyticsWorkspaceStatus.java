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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1AnalyticsWorkspaceStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsWorkspaceStatus {
  public static final String SERIALIZED_NAME_ADDITIONAL_STORAGE = "additionalStorage";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_STORAGE)
  private Map<String, String> additionalStorage = null;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private String persistentVolumeClaim;

  public static final String SERIALIZED_NAME_STATUS_TEXT = "statusText";
  @SerializedName(SERIALIZED_NAME_STATUS_TEXT)
  private String statusText;


  public V1AnalyticsWorkspaceStatus additionalStorage(Map<String, String> additionalStorage) {
    
    this.additionalStorage = additionalStorage;
    return this;
  }

  public V1AnalyticsWorkspaceStatus putAdditionalStorageItem(String key, String additionalStorageItem) {
    if (this.additionalStorage == null) {
      this.additionalStorage = new HashMap<>();
    }
    this.additionalStorage.put(key, additionalStorageItem);
    return this;
  }

   /**
   * A map of storage alongside the name of the matching Persistent Volume Claim
   * @return additionalStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of storage alongside the name of the matching Persistent Volume Claim")

  public Map<String, String> getAdditionalStorage() {
    return additionalStorage;
  }


  public void setAdditionalStorage(Map<String, String> additionalStorage) {
    this.additionalStorage = additionalStorage;
  }


  public V1AnalyticsWorkspaceStatus persistentVolumeClaim(String persistentVolumeClaim) {
    
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * The Persistent Volume Claim associated with this workspace
   * @return persistentVolumeClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Persistent Volume Claim associated with this workspace")

  public String getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }


  public void setPersistentVolumeClaim(String persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public V1AnalyticsWorkspaceStatus statusText(String statusText) {
    
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
    V1AnalyticsWorkspaceStatus v1AnalyticsWorkspaceStatus = (V1AnalyticsWorkspaceStatus) o;
    return Objects.equals(this.additionalStorage, v1AnalyticsWorkspaceStatus.additionalStorage) &&
        Objects.equals(this.persistentVolumeClaim, v1AnalyticsWorkspaceStatus.persistentVolumeClaim) &&
        Objects.equals(this.statusText, v1AnalyticsWorkspaceStatus.statusText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalStorage, persistentVolumeClaim, statusText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceStatus {\n");
    sb.append("    additionalStorage: ").append(toIndentedString(additionalStorage)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
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

