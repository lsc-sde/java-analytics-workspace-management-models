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
 * V1AnalyticsCrateSpecRepo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsCrateSpecRepo {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1AnalyticsCrateSpecRepo branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * The branch on the git repository to use
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The branch on the git repository to use")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public V1AnalyticsCrateSpecRepo secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * The key inside of the secret to use
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key inside of the secret to use")

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public V1AnalyticsCrateSpecRepo secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * The name of the secret containing any information required to connect to the git repo
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the secret containing any information required to connect to the git repo")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1AnalyticsCrateSpecRepo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the git repository
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the git repository")

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
    V1AnalyticsCrateSpecRepo v1AnalyticsCrateSpecRepo = (V1AnalyticsCrateSpecRepo) o;
    return Objects.equals(this.branch, v1AnalyticsCrateSpecRepo.branch) &&
        Objects.equals(this.secretKey, v1AnalyticsCrateSpecRepo.secretKey) &&
        Objects.equals(this.secretName, v1AnalyticsCrateSpecRepo.secretName) &&
        Objects.equals(this.url, v1AnalyticsCrateSpecRepo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, secretKey, secretName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsCrateSpecRepo {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

