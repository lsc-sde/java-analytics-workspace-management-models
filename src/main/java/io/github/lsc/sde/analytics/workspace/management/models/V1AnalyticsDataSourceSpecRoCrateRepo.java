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
 * V1AnalyticsDataSourceSpecRoCrateRepo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T09:52:21.861Z[Etc/UTC]")
public class V1AnalyticsDataSourceSpecRoCrateRepo {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1AnalyticsDataSourceSpecRoCrateRepo path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path where the ro-crate file is found on the repo
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path where the ro-crate file is found on the repo")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1AnalyticsDataSourceSpecRoCrateRepo secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * The key of the secret used when accessing the repo
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the secret used when accessing the repo")

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public V1AnalyticsDataSourceSpecRoCrateRepo secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * The name of the secret used when accessing the repo
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the secret used when accessing the repo")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1AnalyticsDataSourceSpecRoCrateRepo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL to the github repo
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the github repo")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsDataSourceSpecRoCrateRepo v1AnalyticsDataSourceSpecRoCrateRepo = (V1AnalyticsDataSourceSpecRoCrateRepo) o;
    return Objects.equals(this.path, v1AnalyticsDataSourceSpecRoCrateRepo.path) &&
        Objects.equals(this.secretKey, v1AnalyticsDataSourceSpecRoCrateRepo.secretKey) &&
        Objects.equals(this.secretName, v1AnalyticsDataSourceSpecRoCrateRepo.secretName) &&
        Objects.equals(this.url, v1AnalyticsDataSourceSpecRoCrateRepo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, secretKey, secretName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsDataSourceSpecRoCrateRepo {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

