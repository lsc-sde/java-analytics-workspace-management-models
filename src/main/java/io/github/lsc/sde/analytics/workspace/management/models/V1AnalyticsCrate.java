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
import io.github.lsc.sde.analytics.workspace.management.models.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsCrateSpec;
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsCrateStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AnalyticsCrate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T09:52:21.861Z[Etc/UTC]")
public class V1AnalyticsCrate {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1AnalyticsCrateSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private V1AnalyticsCrateStatus status;


  public V1AnalyticsCrate apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1AnalyticsCrate kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1AnalyticsCrate metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 getMetadata() {
    return metadata;
  }


  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }


  public V1AnalyticsCrate spec(V1AnalyticsCrateSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsCrateSpec getSpec() {
    return spec;
  }


  public void setSpec(V1AnalyticsCrateSpec spec) {
    this.spec = spec;
  }


  public V1AnalyticsCrate status(V1AnalyticsCrateStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsCrateStatus getStatus() {
    return status;
  }


  public void setStatus(V1AnalyticsCrateStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsCrate v1AnalyticsCrate = (V1AnalyticsCrate) o;
    return Objects.equals(this.apiVersion, v1AnalyticsCrate.apiVersion) &&
        Objects.equals(this.kind, v1AnalyticsCrate.kind) &&
        Objects.equals(this.metadata, v1AnalyticsCrate.metadata) &&
        Objects.equals(this.spec, v1AnalyticsCrate.spec) &&
        Objects.equals(this.status, v1AnalyticsCrate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsCrate {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

