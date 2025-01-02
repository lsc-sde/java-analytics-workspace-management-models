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
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsWorkspaceBindingSpecClaims;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * V1AnalyticsWorkspaceBindingSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T10:14:00.712Z[Etc/UTC]")
public class V1AnalyticsWorkspaceBindingSpec {
  public static final String SERIALIZED_NAME_CLAIMS = "claims";
  @SerializedName(SERIALIZED_NAME_CLAIMS)
  private List<V1AnalyticsWorkspaceBindingSpecClaims> claims = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private LocalDate expires;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private String workspace;


  public V1AnalyticsWorkspaceBindingSpec claims(List<V1AnalyticsWorkspaceBindingSpecClaims> claims) {
    
    this.claims = claims;
    return this;
  }

  public V1AnalyticsWorkspaceBindingSpec addClaimsItem(V1AnalyticsWorkspaceBindingSpecClaims claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<>();
    }
    this.claims.add(claimsItem);
    return this;
  }

   /**
   * A list of claims to match other than username
   * @return claims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of claims to match other than username")

  public List<V1AnalyticsWorkspaceBindingSpecClaims> getClaims() {
    return claims;
  }


  public void setClaims(List<V1AnalyticsWorkspaceBindingSpecClaims> claims) {
    this.claims = claims;
  }


  public V1AnalyticsWorkspaceBindingSpec comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Any comments relating to this binding.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any comments relating to this binding.")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public V1AnalyticsWorkspaceBindingSpec expires(LocalDate expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * REQUIRED. The date at which this binding expires
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "REQUIRED. The date at which this binding expires")

  public LocalDate getExpires() {
    return expires;
  }


  public void setExpires(LocalDate expires) {
    this.expires = expires;
  }


  public V1AnalyticsWorkspaceBindingSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * The number of replicas to be setup by this resource
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of replicas to be setup by this resource")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public V1AnalyticsWorkspaceBindingSpec username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username to match
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username to match")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public V1AnalyticsWorkspaceBindingSpec workspace(String workspace) {
    
    this.workspace = workspace;
    return this;
  }

   /**
   * REQUIRED. The name of the workspace in kubernetes
   * @return workspace
  **/
  @ApiModelProperty(required = true, value = "REQUIRED. The name of the workspace in kubernetes")

  public String getWorkspace() {
    return workspace;
  }


  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceBindingSpec v1AnalyticsWorkspaceBindingSpec = (V1AnalyticsWorkspaceBindingSpec) o;
    return Objects.equals(this.claims, v1AnalyticsWorkspaceBindingSpec.claims) &&
        Objects.equals(this.comments, v1AnalyticsWorkspaceBindingSpec.comments) &&
        Objects.equals(this.expires, v1AnalyticsWorkspaceBindingSpec.expires) &&
        Objects.equals(this.replicas, v1AnalyticsWorkspaceBindingSpec.replicas) &&
        Objects.equals(this.username, v1AnalyticsWorkspaceBindingSpec.username) &&
        Objects.equals(this.workspace, v1AnalyticsWorkspaceBindingSpec.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, comments, expires, replicas, username, workspace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceBindingSpec {\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

