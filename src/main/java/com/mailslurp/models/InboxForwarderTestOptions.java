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

/**
 * Options for testing an inbox forwarder against a value
 */
@ApiModel(description = "Options for testing an inbox forwarder against a value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class InboxForwarderTestOptions {
  public static final String SERIALIZED_NAME_TEST_VALUE = "testValue";
  @SerializedName(SERIALIZED_NAME_TEST_VALUE)
  private String testValue;


  public InboxForwarderTestOptions testValue(String testValue) {
    
    this.testValue = testValue;
    return this;
  }

   /**
   * Get testValue
   * @return testValue
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTestValue() {
    return testValue;
  }


  public void setTestValue(String testValue) {
    this.testValue = testValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboxForwarderTestOptions inboxForwarderTestOptions = (InboxForwarderTestOptions) o;
    return Objects.equals(this.testValue, inboxForwarderTestOptions.testValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxForwarderTestOptions {\n");
    sb.append("    testValue: ").append(toIndentedString(testValue)).append("\n");
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

