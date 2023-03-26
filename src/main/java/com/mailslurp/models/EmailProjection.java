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
 * A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the &#x60;getEmail&#x60; method with the email projection&#39;s ID. See &#x60;EmailDto&#x60; for documentation on projection properties.
 */
@ApiModel(description = "A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class EmailProjection {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = new ArrayList<>();

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private UUID domainId;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_BODY_EXCERPT = "bodyExcerpt";
  @SerializedName(SERIALIZED_NAME_BODY_EXCERPT)
  private String bodyExcerpt;

  public static final String SERIALIZED_NAME_TEAM_ACCESS = "teamAccess";
  @SerializedName(SERIALIZED_NAME_TEAM_ACCESS)
  private Boolean teamAccess;

  public static final String SERIALIZED_NAME_BODY_M_D5_HASH = "bodyMD5Hash";
  @SerializedName(SERIALIZED_NAME_BODY_M_D5_HASH)
  private String bodyMD5Hash;


  public EmailProjection id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EmailProjection from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public EmailProjection subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailProjection attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public EmailProjection addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public EmailProjection inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Get inboxId
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public EmailProjection createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EmailProjection to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public EmailProjection addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public EmailProjection bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public EmailProjection addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public EmailProjection cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public EmailProjection addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public EmailProjection domainId(UUID domainId) {
    
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getDomainId() {
    return domainId;
  }


  public void setDomainId(UUID domainId) {
    this.domainId = domainId;
  }


  public EmailProjection read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  public EmailProjection bodyExcerpt(String bodyExcerpt) {
    
    this.bodyExcerpt = bodyExcerpt;
    return this;
  }

   /**
   * Get bodyExcerpt
   * @return bodyExcerpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBodyExcerpt() {
    return bodyExcerpt;
  }


  public void setBodyExcerpt(String bodyExcerpt) {
    this.bodyExcerpt = bodyExcerpt;
  }


  public EmailProjection teamAccess(Boolean teamAccess) {
    
    this.teamAccess = teamAccess;
    return this;
  }

   /**
   * Get teamAccess
   * @return teamAccess
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getTeamAccess() {
    return teamAccess;
  }


  public void setTeamAccess(Boolean teamAccess) {
    this.teamAccess = teamAccess;
  }


  public EmailProjection bodyMD5Hash(String bodyMD5Hash) {
    
    this.bodyMD5Hash = bodyMD5Hash;
    return this;
  }

   /**
   * Get bodyMD5Hash
   * @return bodyMD5Hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBodyMD5Hash() {
    return bodyMD5Hash;
  }


  public void setBodyMD5Hash(String bodyMD5Hash) {
    this.bodyMD5Hash = bodyMD5Hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailProjection emailProjection = (EmailProjection) o;
    return Objects.equals(this.id, emailProjection.id) &&
        Objects.equals(this.from, emailProjection.from) &&
        Objects.equals(this.subject, emailProjection.subject) &&
        Objects.equals(this.attachments, emailProjection.attachments) &&
        Objects.equals(this.inboxId, emailProjection.inboxId) &&
        Objects.equals(this.createdAt, emailProjection.createdAt) &&
        Objects.equals(this.to, emailProjection.to) &&
        Objects.equals(this.bcc, emailProjection.bcc) &&
        Objects.equals(this.cc, emailProjection.cc) &&
        Objects.equals(this.domainId, emailProjection.domainId) &&
        Objects.equals(this.read, emailProjection.read) &&
        Objects.equals(this.bodyExcerpt, emailProjection.bodyExcerpt) &&
        Objects.equals(this.teamAccess, emailProjection.teamAccess) &&
        Objects.equals(this.bodyMD5Hash, emailProjection.bodyMD5Hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, subject, attachments, inboxId, createdAt, to, bcc, cc, domainId, read, bodyExcerpt, teamAccess, bodyMD5Hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailProjection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    bodyExcerpt: ").append(toIndentedString(bodyExcerpt)).append("\n");
    sb.append("    teamAccess: ").append(toIndentedString(teamAccess)).append("\n");
    sb.append("    bodyMD5Hash: ").append(toIndentedString(bodyMD5Hash)).append("\n");
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

