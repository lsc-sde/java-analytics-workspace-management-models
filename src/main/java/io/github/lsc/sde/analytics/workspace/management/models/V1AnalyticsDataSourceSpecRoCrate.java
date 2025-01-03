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
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsDataSourceSpecRoCrateRepo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AnalyticsDataSourceSpecRoCrate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T09:52:21.861Z[Etc/UTC]")
public class V1AnalyticsDataSourceSpecRoCrate {
  public static final String SERIALIZED_NAME_REPO = "repo";
  @SerializedName(SERIALIZED_NAME_REPO)
  private V1AnalyticsDataSourceSpecRoCrateRepo repo;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private Object spec;


  public V1AnalyticsDataSourceSpecRoCrate repo(V1AnalyticsDataSourceSpecRoCrateRepo repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsDataSourceSpecRoCrateRepo getRepo() {
    return repo;
  }


  public void setRepo(V1AnalyticsDataSourceSpecRoCrateRepo repo) {
    this.repo = repo;
  }


  public V1AnalyticsDataSourceSpecRoCrate spec(Object spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSpec() {
    return spec;
  }


  public void setSpec(Object spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsDataSourceSpecRoCrate v1AnalyticsDataSourceSpecRoCrate = (V1AnalyticsDataSourceSpecRoCrate) o;
    return Objects.equals(this.repo, v1AnalyticsDataSourceSpecRoCrate.repo) &&
        Objects.equals(this.spec, v1AnalyticsDataSourceSpecRoCrate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repo, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsDataSourceSpecRoCrate {\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

