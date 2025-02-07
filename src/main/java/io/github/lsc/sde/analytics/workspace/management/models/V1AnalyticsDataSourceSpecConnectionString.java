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
 * V1AnalyticsDataSourceSpecConnectionString
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsDataSourceSpecConnectionString {
  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public V1AnalyticsDataSourceSpecConnectionString secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * If the connection string contains secrets, populate a secret and reference it here
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the connection string contains secrets, populate a secret and reference it here")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1AnalyticsDataSourceSpecConnectionString value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * If the connection string doesn&#39;t contain secrets, populate it here.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the connection string doesn't contain secrets, populate it here.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsDataSourceSpecConnectionString v1AnalyticsDataSourceSpecConnectionString = (V1AnalyticsDataSourceSpecConnectionString) o;
    return Objects.equals(this.secretName, v1AnalyticsDataSourceSpecConnectionString.secretName) &&
        Objects.equals(this.value, v1AnalyticsDataSourceSpecConnectionString.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsDataSourceSpecConnectionString {\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

