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
import java.time.LocalDate;

/**
 * REQUIRED. An object describing variables which are validated to ensure that the workspace is still valid
 */
@ApiModel(description = "REQUIRED. An object describing variables which are validated to ensure that the workspace is still valid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T12:18:31.084Z[Etc/UTC]")
public class V1AnalyticsWorkspaceSpecValidity {
  public static final String SERIALIZED_NAME_AVAILABLE_FROM = "availableFrom";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FROM)
  private LocalDate availableFrom;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private LocalDate expires;


  public V1AnalyticsWorkspaceSpecValidity availableFrom(LocalDate availableFrom) {
    
    this.availableFrom = availableFrom;
    return this;
  }

   /**
   * The date that the workspace is valid from
   * @return availableFrom
  **/
  @ApiModelProperty(required = true, value = "The date that the workspace is valid from")

  public LocalDate getAvailableFrom() {
    return availableFrom;
  }


  public void setAvailableFrom(LocalDate availableFrom) {
    this.availableFrom = availableFrom;
  }


  public V1AnalyticsWorkspaceSpecValidity expires(LocalDate expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * The date that the workspace expires
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "The date that the workspace expires")

  public LocalDate getExpires() {
    return expires;
  }


  public void setExpires(LocalDate expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsWorkspaceSpecValidity v1AnalyticsWorkspaceSpecValidity = (V1AnalyticsWorkspaceSpecValidity) o;
    return Objects.equals(this.availableFrom, v1AnalyticsWorkspaceSpecValidity.availableFrom) &&
        Objects.equals(this.expires, v1AnalyticsWorkspaceSpecValidity.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableFrom, expires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsWorkspaceSpecValidity {\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

