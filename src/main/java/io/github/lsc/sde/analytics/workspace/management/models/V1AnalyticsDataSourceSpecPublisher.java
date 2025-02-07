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
import io.github.lsc.sde.analytics.workspace.management.models.V1AnalyticsDataSourceSpecPublisherContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1AnalyticsDataSourceSpecPublisher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-20T11:03:36.264Z[Etc/UTC]")
public class V1AnalyticsDataSourceSpecPublisher {
  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private V1AnalyticsDataSourceSpecPublisherContact contact;

  public static final String SERIALIZED_NAME_ORGANISATION = "organisation";
  @SerializedName(SERIALIZED_NAME_ORGANISATION)
  private String organisation;


  public V1AnalyticsDataSourceSpecPublisher contact(V1AnalyticsDataSourceSpecPublisherContact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1AnalyticsDataSourceSpecPublisherContact getContact() {
    return contact;
  }


  public void setContact(V1AnalyticsDataSourceSpecPublisherContact contact) {
    this.contact = contact;
  }


  public V1AnalyticsDataSourceSpecPublisher organisation(String organisation) {
    
    this.organisation = organisation;
    return this;
  }

   /**
   * Name of the organisation
   * @return organisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the organisation")

  public String getOrganisation() {
    return organisation;
  }


  public void setOrganisation(String organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AnalyticsDataSourceSpecPublisher v1AnalyticsDataSourceSpecPublisher = (V1AnalyticsDataSourceSpecPublisher) o;
    return Objects.equals(this.contact, v1AnalyticsDataSourceSpecPublisher.contact) &&
        Objects.equals(this.organisation, v1AnalyticsDataSourceSpecPublisher.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, organisation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AnalyticsDataSourceSpecPublisher {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

