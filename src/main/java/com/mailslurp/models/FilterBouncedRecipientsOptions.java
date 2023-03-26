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
import java.util.ArrayList;
import java.util.List;

/**
 * Options for filtering bounced email recipients
 */
@ApiModel(description = "Options for filtering bounced email recipients")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class FilterBouncedRecipientsOptions {
  public static final String SERIALIZED_NAME_EMAIL_RECIPIENTS = "emailRecipients";
  @SerializedName(SERIALIZED_NAME_EMAIL_RECIPIENTS)
  private List<String> emailRecipients = new ArrayList<>();


  public FilterBouncedRecipientsOptions emailRecipients(List<String> emailRecipients) {
    
    this.emailRecipients = emailRecipients;
    return this;
  }

  public FilterBouncedRecipientsOptions addEmailRecipientsItem(String emailRecipientsItem) {
    this.emailRecipients.add(emailRecipientsItem);
    return this;
  }

   /**
   * Get emailRecipients
   * @return emailRecipients
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getEmailRecipients() {
    return emailRecipients;
  }


  public void setEmailRecipients(List<String> emailRecipients) {
    this.emailRecipients = emailRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterBouncedRecipientsOptions filterBouncedRecipientsOptions = (FilterBouncedRecipientsOptions) o;
    return Objects.equals(this.emailRecipients, filterBouncedRecipientsOptions.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterBouncedRecipientsOptions {\n");
    sb.append("    emailRecipients: ").append(toIndentedString(emailRecipients)).append("\n");
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

