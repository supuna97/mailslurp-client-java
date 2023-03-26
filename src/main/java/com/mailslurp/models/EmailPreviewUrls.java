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
 * URLs for email body
 */
@ApiModel(description = "URLs for email body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class EmailPreviewUrls {
  public static final String SERIALIZED_NAME_RAW_SMTP_MESSAGE_URL = "rawSmtpMessageUrl";
  @SerializedName(SERIALIZED_NAME_RAW_SMTP_MESSAGE_URL)
  private String rawSmtpMessageUrl;

  public static final String SERIALIZED_NAME_PLAIN_HTML_BODY_URL = "plainHtmlBodyUrl";
  @SerializedName(SERIALIZED_NAME_PLAIN_HTML_BODY_URL)
  private String plainHtmlBodyUrl;


  public EmailPreviewUrls rawSmtpMessageUrl(String rawSmtpMessageUrl) {
    
    this.rawSmtpMessageUrl = rawSmtpMessageUrl;
    return this;
  }

   /**
   * Get rawSmtpMessageUrl
   * @return rawSmtpMessageUrl
  **/
  @ApiModelProperty(required = true, value = "")

  public String getRawSmtpMessageUrl() {
    return rawSmtpMessageUrl;
  }


  public void setRawSmtpMessageUrl(String rawSmtpMessageUrl) {
    this.rawSmtpMessageUrl = rawSmtpMessageUrl;
  }


  public EmailPreviewUrls plainHtmlBodyUrl(String plainHtmlBodyUrl) {
    
    this.plainHtmlBodyUrl = plainHtmlBodyUrl;
    return this;
  }

   /**
   * Get plainHtmlBodyUrl
   * @return plainHtmlBodyUrl
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPlainHtmlBodyUrl() {
    return plainHtmlBodyUrl;
  }


  public void setPlainHtmlBodyUrl(String plainHtmlBodyUrl) {
    this.plainHtmlBodyUrl = plainHtmlBodyUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPreviewUrls emailPreviewUrls = (EmailPreviewUrls) o;
    return Objects.equals(this.rawSmtpMessageUrl, emailPreviewUrls.rawSmtpMessageUrl) &&
        Objects.equals(this.plainHtmlBodyUrl, emailPreviewUrls.plainHtmlBodyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawSmtpMessageUrl, plainHtmlBodyUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPreviewUrls {\n");
    sb.append("    rawSmtpMessageUrl: ").append(toIndentedString(rawSmtpMessageUrl)).append("\n");
    sb.append("    plainHtmlBodyUrl: ").append(toIndentedString(plainHtmlBodyUrl)).append("\n");
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

