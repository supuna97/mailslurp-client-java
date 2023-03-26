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
import java.util.UUID;

/**
 * Options for updating an inbox replier
 */
@ApiModel(description = "Options for updating an inbox replier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class UpdateInboxReplierOptions {
  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Field to match against to trigger inbox replier for inbound email
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    RECIPIENTS("RECIPIENTS"),
    
    SENDER("SENDER"),
    
    SUBJECT("SUBJECT"),
    
    ATTACHMENTS("ATTACHMENTS");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String value) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldEnum field;

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private String match;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_IGNORE_REPLY_TO = "ignoreReplyTo";
  @SerializedName(SERIALIZED_NAME_IGNORE_REPLY_TO)
  private Boolean ignoreReplyTo;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLES = "templateVariables";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLES)
  private Map<String, Object> templateVariables = null;


  public UpdateInboxReplierOptions inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Inbox ID to attach replier to
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "Inbox ID to attach replier to")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public UpdateInboxReplierOptions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name for replier
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name for replier")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateInboxReplierOptions field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * Field to match against to trigger inbox replier for inbound email
   * @return field
  **/
  @ApiModelProperty(required = true, value = "Field to match against to trigger inbox replier for inbound email")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public UpdateInboxReplierOptions match(String match) {
    
    this.match = match;
    return this;
  }

   /**
   * String or wildcard style match for field specified when evaluating reply rules
   * @return match
  **/
  @ApiModelProperty(required = true, value = "String or wildcard style match for field specified when evaluating reply rules")

  public String getMatch() {
    return match;
  }


  public void setMatch(String match) {
    this.match = match;
  }


  public UpdateInboxReplierOptions replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Reply-to email address when sending replying
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reply-to email address when sending replying")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public UpdateInboxReplierOptions subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject override when replying to email
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject override when replying to email")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public UpdateInboxReplierOptions from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Send email from address
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send email from address")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public UpdateInboxReplierOptions charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Email reply charset
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email reply charset")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public UpdateInboxReplierOptions isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Send HTML email
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send HTML email")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public UpdateInboxReplierOptions ignoreReplyTo(Boolean ignoreReplyTo) {
    
    this.ignoreReplyTo = ignoreReplyTo;
    return this;
  }

   /**
   * Ignore sender replyTo when responding. Send directly to the sender if enabled.
   * @return ignoreReplyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ignore sender replyTo when responding. Send directly to the sender if enabled.")

  public Boolean getIgnoreReplyTo() {
    return ignoreReplyTo;
  }


  public void setIgnoreReplyTo(Boolean ignoreReplyTo) {
    this.ignoreReplyTo = ignoreReplyTo;
  }


  public UpdateInboxReplierOptions body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Email body for reply
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email body for reply")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public UpdateInboxReplierOptions templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * ID of template to use when sending a reply
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of template to use when sending a reply")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public UpdateInboxReplierOptions templateVariables(Map<String, Object> templateVariables) {
    
    this.templateVariables = templateVariables;
    return this;
  }

  public UpdateInboxReplierOptions putTemplateVariablesItem(String key, Object templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new HashMap<>();
    }
    this.templateVariables.put(key, templateVariablesItem);
    return this;
  }

   /**
   * Template variable values
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template variable values")

  public Map<String, Object> getTemplateVariables() {
    return templateVariables;
  }


  public void setTemplateVariables(Map<String, Object> templateVariables) {
    this.templateVariables = templateVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboxReplierOptions updateInboxReplierOptions = (UpdateInboxReplierOptions) o;
    return Objects.equals(this.inboxId, updateInboxReplierOptions.inboxId) &&
        Objects.equals(this.name, updateInboxReplierOptions.name) &&
        Objects.equals(this.field, updateInboxReplierOptions.field) &&
        Objects.equals(this.match, updateInboxReplierOptions.match) &&
        Objects.equals(this.replyTo, updateInboxReplierOptions.replyTo) &&
        Objects.equals(this.subject, updateInboxReplierOptions.subject) &&
        Objects.equals(this.from, updateInboxReplierOptions.from) &&
        Objects.equals(this.charset, updateInboxReplierOptions.charset) &&
        Objects.equals(this.isHTML, updateInboxReplierOptions.isHTML) &&
        Objects.equals(this.ignoreReplyTo, updateInboxReplierOptions.ignoreReplyTo) &&
        Objects.equals(this.body, updateInboxReplierOptions.body) &&
        Objects.equals(this.templateId, updateInboxReplierOptions.templateId) &&
        Objects.equals(this.templateVariables, updateInboxReplierOptions.templateVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboxId, name, field, match, replyTo, subject, from, charset, isHTML, ignoreReplyTo, body, templateId, templateVariables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboxReplierOptions {\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    ignoreReplyTo: ").append(toIndentedString(ignoreReplyTo)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
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

