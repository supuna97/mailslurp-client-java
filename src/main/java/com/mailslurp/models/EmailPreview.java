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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Preview of an email message. For full message (including body and attachments) call the &#x60;getEmail&#x60; or other email endpoints with the provided email ID.
 */
@ApiModel(description = "Preview of an email message. For full message (including body and attachments) call the `getEmail` or other email endpoints with the provided email ID.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class EmailPreview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private UUID domainId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<>();

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;


  public EmailPreview id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the email entity
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the email entity")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EmailPreview domainId(UUID domainId) {
    
    this.domainId = domainId;
    return this;
  }

   /**
   * ID of the domain that received the email
   * @return domainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the domain that received the email")

  public UUID getDomainId() {
    return domainId;
  }


  public void setDomainId(UUID domainId) {
    this.domainId = domainId;
  }


  public EmailPreview subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the email message as specified by SMTP subject header
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject line of the email message as specified by SMTP subject header")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailPreview to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public EmailPreview addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * List of &#x60;To&#x60; recipient email addresses that the email was addressed to. See recipients object for names.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "List of `To` recipient email addresses that the email was addressed to. See recipients object for names.")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public EmailPreview from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Who the email was sent from. An email address - see fromName for the sender name.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who the email was sent from. An email address - see fromName for the sender name.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public EmailPreview bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public EmailPreview addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * List of &#x60;BCC&#x60; recipients email addresses that the email was addressed to. See recipients object for names.
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names.")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public EmailPreview cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public EmailPreview addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * List of &#x60;CC&#x60; recipients email addresses that the email was addressed to. See recipients object for names.
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of `CC` recipients email addresses that the email was addressed to. See recipients object for names.")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public EmailPreview createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When was the email received by MailSlurp
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "When was the email received by MailSlurp")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EmailPreview read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks.
   * @return read
  **/
  @ApiModelProperty(required = true, value = "Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks.")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public EmailPreview attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public EmailPreview addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPreview emailPreview = (EmailPreview) o;
    return Objects.equals(this.id, emailPreview.id) &&
        Objects.equals(this.domainId, emailPreview.domainId) &&
        Objects.equals(this.subject, emailPreview.subject) &&
        Objects.equals(this.to, emailPreview.to) &&
        Objects.equals(this.from, emailPreview.from) &&
        Objects.equals(this.bcc, emailPreview.bcc) &&
        Objects.equals(this.cc, emailPreview.cc) &&
        Objects.equals(this.createdAt, emailPreview.createdAt) &&
        Objects.equals(this.read, emailPreview.read) &&
        Objects.equals(this.attachments, emailPreview.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domainId, subject, to, from, bcc, cc, createdAt, read, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPreview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

