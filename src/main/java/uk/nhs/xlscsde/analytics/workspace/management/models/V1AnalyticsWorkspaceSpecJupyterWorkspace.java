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


package uk.nhs.xlscsde.analytics.workspace.management.models;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uk.nhs.xlscsde.analytics.workspace.management.models.V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage;
import uk.nhs.xlscsde.analytics.workspace.management.models.V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim;

/**
 * Represents a jupyter workspace
 */
@ApiModel(description = "Represents a jupyter workspace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-02T12:40:31.595Z[Etc/UTC]")
public class V1AnalyticsWorkspaceSpecJupyterWorkspace {
  public static final String SERIALIZED_NAME_ADDITIONAL_STORAGE = "additionalStorage";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_STORAGE)
  private List<V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage> additionalStorage = null;

  public static final String SERIALIZED_NAME_DEFAULT_URI = "defaultUri";
  @SerializedName(SERIALIZED_NAME_DEFAULT_URI)
  private String defaultUri;

  public static final String SERIALIZED_NAME_EXTRA_LABELS = "extraLabels";
  @SerializedName(SERIALIZED_NAME_EXTRA_LABELS)
  private Map<String, String> extraLabels = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Object nodeSelector;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim persistentVolumeClaim;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Object resources;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private Object tolerations;


  public V1AnalyticsWorkspaceSpecJupyterWorkspace additionalStorage(List<V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage> additionalStorage) {
    
    this.additionalStorage = additionalStorage;
    return this;
  }

  public V1AnalyticsWorkspaceSpecJupyterWorkspace addAdditionalStorageItem(V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage additionalStorageItem) {
    if (this.additionalStorage == null) {
      this.additionalStorage = new ArrayList<>();
    }
    this.additionalStorage.add(additionalStorageItem);
    return this;
  }

   /**
   * A list of additional persistent volume claims to map to the pods created for this environment.   If the PVC doesn&#39;t already exist, it will be created with the options here. 
   * @return additionalStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of additional persistent volume claims to map to the pods created for this environment.   If the PVC doesn't already exist, it will be created with the options here. ")

  public List<V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage> getAdditionalStorage() {
    return additionalStorage;
  }


  public void setAdditionalStorage(List<V1AnalyticsWorkspaceSpecJupyterWorkspaceAdditionalStorage> additionalStorage) {
    this.additionalStorage = additionalStorage;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace defaultUri(String defaultUri) {
    
    this.defaultUri = defaultUri;
    return this;
  }

   /**
   * The URI that jupyter will use when the items are provisioned.
   * @return defaultUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI that jupyter will use when the items are provisioned.")

  public String getDefaultUri() {
    return defaultUri;
  }


  public void setDefaultUri(String defaultUri) {
    this.defaultUri = defaultUri;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace extraLabels(Map<String, String> extraLabels) {
    
    this.extraLabels = extraLabels;
    return this;
  }

  public V1AnalyticsWorkspaceSpecJupyterWorkspace putExtraLabelsItem(String key, String extraLabelsItem) {
    if (this.extraLabels == null) {
      this.extraLabels = new HashMap<>();
    }
    this.extraLabels.put(key, extraLabelsItem);
    return this;
  }

   /**
   * A map of labels to append to the pod created
   * @return extraLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of labels to append to the pod created")

  public Map<String, String> getExtraLabels() {
    return extraLabels;
  }


  public void setExtraLabels(Map<String, String> extraLabels) {
    this.extraLabels = extraLabels;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * The image used when provisioning the pod created by jupyter hub
   * @return image
  **/
  @ApiModelProperty(required = true, value = "The image used when provisioning the pod created by jupyter hub")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace nodeSelector(Object nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Object nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace persistentVolumeClaim(V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim persistentVolumeClaim) {
    
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }


  public void setPersistentVolumeClaim(V1AnalyticsWorkspaceSpecJupyterWorkspacePersistentVolumeClaim persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace resources(Object resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getResources() {
    return resources;
  }


  public void setResources(Object resources) {
    this.resources = resources;
  }


  public V1AnalyticsWorkspaceSpecJupyterWorkspace tolerations(Object tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

   /**
   * Get tolerations
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTolerations() {
    return tolerations;
  }


  public void setTolerations(Object tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceSpecJupyterWorkspace v1AnalyticsWorkspaceSpecJupyterWorkspace = (V1AnalyticsWorkspaceSpecJupyterWorkspace) o;
    return Objects.equals(this.additionalStorage, v1AnalyticsWorkspaceSpecJupyterWorkspace.additionalStorage) &&
        Objects.equals(this.defaultUri, v1AnalyticsWorkspaceSpecJupyterWorkspace.defaultUri) &&
        Objects.equals(this.extraLabels, v1AnalyticsWorkspaceSpecJupyterWorkspace.extraLabels) &&
        Objects.equals(this.image, v1AnalyticsWorkspaceSpecJupyterWorkspace.image) &&
        Objects.equals(this.nodeSelector, v1AnalyticsWorkspaceSpecJupyterWorkspace.nodeSelector) &&
        Objects.equals(this.persistentVolumeClaim, v1AnalyticsWorkspaceSpecJupyterWorkspace.persistentVolumeClaim) &&
        Objects.equals(this.resources, v1AnalyticsWorkspaceSpecJupyterWorkspace.resources) &&
        Objects.equals(this.tolerations, v1AnalyticsWorkspaceSpecJupyterWorkspace.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalStorage, defaultUri, extraLabels, image, nodeSelector, persistentVolumeClaim, resources, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceSpecJupyterWorkspace {\n");
    sb.append("    additionalStorage: ").append(toIndentedString(additionalStorage)).append("\n");
    sb.append("    defaultUri: ").append(toIndentedString(defaultUri)).append("\n");
    sb.append("    extraLabels: ").append(toIndentedString(extraLabels)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

