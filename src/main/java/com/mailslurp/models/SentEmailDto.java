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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Sent email details
 */
@ApiModel(description = "Sent email details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class SentEmailDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private UUID domainId;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY_M_D5_HASH = "bodyMD5Hash";
  @SerializedName(SERIALIZED_NAME_BODY_M_D5_HASH)
  private String bodyMD5Hash;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_TO_CONTACTS = "toContacts";
  @SerializedName(SERIALIZED_NAME_TO_CONTACTS)
  private List<UUID> toContacts = null;

  public static final String SERIALIZED_NAME_TO_GROUP = "toGroup";
  @SerializedName(SERIALIZED_NAME_TO_GROUP)
  private UUID toGroup;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_PIXEL_IDS = "pixelIds";
  @SerializedName(SERIALIZED_NAME_PIXEL_IDS)
  private List<UUID> pixelIds = null;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_MESSAGE_IDS = "messageIds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_IDS)
  private List<String> messageIds = null;

  public static final String SERIALIZED_NAME_VIRTUAL_SEND = "virtualSend";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_SEND)
  private Boolean virtualSend;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLES = "templateVariables";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLES)
  private Map<String, Object> templateVariables = null;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private Boolean html;


  public SentEmailDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of sent email
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of sent email")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SentEmailDto userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User ID
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "User ID")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public SentEmailDto inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Inbox ID email was sent from
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "Inbox ID email was sent from")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public SentEmailDto domainId(UUID domainId) {
    
    this.domainId = domainId;
    return this;
  }

   /**
   * Domain ID
   * @return domainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Domain ID")

  public UUID getDomainId() {
    return domainId;
  }


  public void setDomainId(UUID domainId) {
    this.domainId = domainId;
  }


  public SentEmailDto to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public SentEmailDto addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Recipients email was sent to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recipients email was sent to")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public SentEmailDto from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Sent from address
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sent from address")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SentEmailDto replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public SentEmailDto cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public SentEmailDto addCcItem(String ccItem) {
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


  public SentEmailDto bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public SentEmailDto addBccItem(String bccItem) {
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


  public SentEmailDto attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public SentEmailDto addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Array of IDs of attachments that were sent with this email
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of IDs of attachments that were sent with this email")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public SentEmailDto subject(String subject) {
    
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


  public SentEmailDto bodyMD5Hash(String bodyMD5Hash) {
    
    this.bodyMD5Hash = bodyMD5Hash;
    return this;
  }

   /**
   * MD5 Hash
   * @return bodyMD5Hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MD5 Hash")

  public String getBodyMD5Hash() {
    return bodyMD5Hash;
  }


  public void setBodyMD5Hash(String bodyMD5Hash) {
    this.bodyMD5Hash = bodyMD5Hash;
  }


  public SentEmailDto body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Sent email body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sent email body")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public SentEmailDto toContacts(List<UUID> toContacts) {
    
    this.toContacts = toContacts;
    return this;
  }

  public SentEmailDto addToContactsItem(UUID toContactsItem) {
    if (this.toContacts == null) {
      this.toContacts = new ArrayList<>();
    }
    this.toContacts.add(toContactsItem);
    return this;
  }

   /**
   * Get toContacts
   * @return toContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getToContacts() {
    return toContacts;
  }


  public void setToContacts(List<UUID> toContacts) {
    this.toContacts = toContacts;
  }


  public SentEmailDto toGroup(UUID toGroup) {
    
    this.toGroup = toGroup;
    return this;
  }

   /**
   * Get toGroup
   * @return toGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getToGroup() {
    return toGroup;
  }


  public void setToGroup(UUID toGroup) {
    this.toGroup = toGroup;
  }


  public SentEmailDto charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Get charset
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public SentEmailDto isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Get isHTML
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public SentEmailDto sentAt(OffsetDateTime sentAt) {
    
    this.sentAt = sentAt;
    return this;
  }

   /**
   * Get sentAt
   * @return sentAt
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getSentAt() {
    return sentAt;
  }


  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public SentEmailDto pixelIds(List<UUID> pixelIds) {
    
    this.pixelIds = pixelIds;
    return this;
  }

  public SentEmailDto addPixelIdsItem(UUID pixelIdsItem) {
    if (this.pixelIds == null) {
      this.pixelIds = new ArrayList<>();
    }
    this.pixelIds.add(pixelIdsItem);
    return this;
  }

   /**
   * Get pixelIds
   * @return pixelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getPixelIds() {
    return pixelIds;
  }


  public void setPixelIds(List<UUID> pixelIds) {
    this.pixelIds = pixelIds;
  }


  public SentEmailDto messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public SentEmailDto messageIds(List<String> messageIds) {
    
    this.messageIds = messageIds;
    return this;
  }

  public SentEmailDto addMessageIdsItem(String messageIdsItem) {
    if (this.messageIds == null) {
      this.messageIds = new ArrayList<>();
    }
    this.messageIds.add(messageIdsItem);
    return this;
  }

   /**
   * Get messageIds
   * @return messageIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessageIds() {
    return messageIds;
  }


  public void setMessageIds(List<String> messageIds) {
    this.messageIds = messageIds;
  }


  public SentEmailDto virtualSend(Boolean virtualSend) {
    
    this.virtualSend = virtualSend;
    return this;
  }

   /**
   * Get virtualSend
   * @return virtualSend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVirtualSend() {
    return virtualSend;
  }


  public void setVirtualSend(Boolean virtualSend) {
    this.virtualSend = virtualSend;
  }


  public SentEmailDto templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public SentEmailDto templateVariables(Map<String, Object> templateVariables) {
    
    this.templateVariables = templateVariables;
    return this;
  }

  public SentEmailDto putTemplateVariablesItem(String key, Object templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new HashMap<>();
    }
    this.templateVariables.put(key, templateVariablesItem);
    return this;
  }

   /**
   * Get templateVariables
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getTemplateVariables() {
    return templateVariables;
  }


  public void setTemplateVariables(Map<String, Object> templateVariables) {
    this.templateVariables = templateVariables;
  }


  public SentEmailDto html(Boolean html) {
    
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHtml() {
    return html;
  }


  public void setHtml(Boolean html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentEmailDto sentEmailDto = (SentEmailDto) o;
    return Objects.equals(this.id, sentEmailDto.id) &&
        Objects.equals(this.userId, sentEmailDto.userId) &&
        Objects.equals(this.inboxId, sentEmailDto.inboxId) &&
        Objects.equals(this.domainId, sentEmailDto.domainId) &&
        Objects.equals(this.to, sentEmailDto.to) &&
        Objects.equals(this.from, sentEmailDto.from) &&
        Objects.equals(this.replyTo, sentEmailDto.replyTo) &&
        Objects.equals(this.cc, sentEmailDto.cc) &&
        Objects.equals(this.bcc, sentEmailDto.bcc) &&
        Objects.equals(this.attachments, sentEmailDto.attachments) &&
        Objects.equals(this.subject, sentEmailDto.subject) &&
        Objects.equals(this.bodyMD5Hash, sentEmailDto.bodyMD5Hash) &&
        Objects.equals(this.body, sentEmailDto.body) &&
        Objects.equals(this.toContacts, sentEmailDto.toContacts) &&
        Objects.equals(this.toGroup, sentEmailDto.toGroup) &&
        Objects.equals(this.charset, sentEmailDto.charset) &&
        Objects.equals(this.isHTML, sentEmailDto.isHTML) &&
        Objects.equals(this.sentAt, sentEmailDto.sentAt) &&
        Objects.equals(this.pixelIds, sentEmailDto.pixelIds) &&
        Objects.equals(this.messageId, sentEmailDto.messageId) &&
        Objects.equals(this.messageIds, sentEmailDto.messageIds) &&
        Objects.equals(this.virtualSend, sentEmailDto.virtualSend) &&
        Objects.equals(this.templateId, sentEmailDto.templateId) &&
        Objects.equals(this.templateVariables, sentEmailDto.templateVariables) &&
        Objects.equals(this.html, sentEmailDto.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, inboxId, domainId, to, from, replyTo, cc, bcc, attachments, subject, bodyMD5Hash, body, toContacts, toGroup, charset, isHTML, sentAt, pixelIds, messageId, messageIds, virtualSend, templateId, templateVariables, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentEmailDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    bodyMD5Hash: ").append(toIndentedString(bodyMD5Hash)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    toContacts: ").append(toIndentedString(toContacts)).append("\n");
    sb.append("    toGroup: ").append(toIndentedString(toGroup)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    pixelIds: ").append(toIndentedString(pixelIds)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageIds: ").append(toIndentedString(messageIds)).append("\n");
    sb.append("    virtualSend: ").append(toIndentedString(virtualSend)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

