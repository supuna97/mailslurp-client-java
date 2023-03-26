/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.models;

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
 * Results of inbox forwarder test
 */
@ApiModel(description = "Results of inbox forwarder test")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class InboxForwarderTestResult {
  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private Map<String, Boolean> matches = new HashMap<>();

  public static final String SERIALIZED_NAME_DOES_MATCH = "doesMatch";
  @SerializedName(SERIALIZED_NAME_DOES_MATCH)
  private Boolean doesMatch;


  public InboxForwarderTestResult matches(Map<String, Boolean> matches) {
    
    this.matches = matches;
    return this;
  }

  public InboxForwarderTestResult putMatchesItem(String key, Boolean matchesItem) {
    this.matches.put(key, matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Boolean> getMatches() {
    return matches;
  }


  public void setMatches(Map<String, Boolean> matches) {
    this.matches = matches;
  }


  public InboxForwarderTestResult doesMatch(Boolean doesMatch) {
    
    this.doesMatch = doesMatch;
    return this;
  }

   /**
   * Get doesMatch
   * @return doesMatch
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getDoesMatch() {
    return doesMatch;
  }


  public void setDoesMatch(Boolean doesMatch) {
    this.doesMatch = doesMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboxForwarderTestResult inboxForwarderTestResult = (InboxForwarderTestResult) o;
    return Objects.equals(this.matches, inboxForwarderTestResult.matches) &&
        Objects.equals(this.doesMatch, inboxForwarderTestResult.doesMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches, doesMatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxForwarderTestResult {\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    doesMatch: ").append(toIndentedString(doesMatch)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

