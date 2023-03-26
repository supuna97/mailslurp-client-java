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
 * Inbox forwarder. Describes how an inbox will forward matching emails to designated recipients.
 */
@ApiModel(description = "Inbox forwarder. Describes how an inbox will forward matching emails to designated recipients.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class InboxForwarderDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Which field to match against
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

  public static final String SERIALIZED_NAME_FORWARD_TO_RECIPIENTS = "forwardToRecipients";
  @SerializedName(SERIALIZED_NAME_FORWARD_TO_RECIPIENTS)
  private List<String> forwardToRecipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;


  public InboxForwarderDto id(UUID id) {
    
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


  public InboxForwarderDto inboxId(UUID inboxId) {
    
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


  public InboxForwarderDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of inbox forwarder
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of inbox forwarder")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InboxForwarderDto field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * Which field to match against
   * @return field
  **/
  @ApiModelProperty(required = true, value = "Which field to match against")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public InboxForwarderDto match(String match) {
    
    this.match = match;
    return this;
  }

   /**
   * Wild-card type pattern to apply to field
   * @return match
  **/
  @ApiModelProperty(required = true, value = "Wild-card type pattern to apply to field")

  public String getMatch() {
    return match;
  }


  public void setMatch(String match) {
    this.match = match;
  }


  public InboxForwarderDto forwardToRecipients(List<String> forwardToRecipients) {
    
    this.forwardToRecipients = forwardToRecipients;
    return this;
  }

  public InboxForwarderDto addForwardToRecipientsItem(String forwardToRecipientsItem) {
    this.forwardToRecipients.add(forwardToRecipientsItem);
    return this;
  }

   /**
   * Who to send forwarded email to
   * @return forwardToRecipients
  **/
  @ApiModelProperty(required = true, value = "Who to send forwarded email to")

  public List<String> getForwardToRecipients() {
    return forwardToRecipients;
  }


  public void setForwardToRecipients(List<String> forwardToRecipients) {
    this.forwardToRecipients = forwardToRecipients;
  }


  public InboxForwarderDto createdAt(OffsetDateTime createdAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboxForwarderDto inboxForwarderDto = (InboxForwarderDto) o;
    return Objects.equals(this.id, inboxForwarderDto.id) &&
        Objects.equals(this.inboxId, inboxForwarderDto.inboxId) &&
        Objects.equals(this.name, inboxForwarderDto.name) &&
        Objects.equals(this.field, inboxForwarderDto.field) &&
        Objects.equals(this.match, inboxForwarderDto.match) &&
        Objects.equals(this.forwardToRecipients, inboxForwarderDto.forwardToRecipients) &&
        Objects.equals(this.createdAt, inboxForwarderDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inboxId, name, field, match, forwardToRecipients, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxForwarderDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    forwardToRecipients: ").append(toIndentedString(forwardToRecipients)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
