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
import java.util.UUID;

/**
 * EMAIL_READ webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is read. This happens when an email is requested in full from the API or a user views the email in the dashboard.
 */
@ApiModel(description = "EMAIL_READ webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is read. This happens when an email is requested in full from the API or a user views the email in the dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class WebhookEmailReadPayload {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private UUID webhookId;

  /**
   * Name of the event type webhook is being triggered for.
   */
  @JsonAdapter(EventNameEnum.Adapter.class)
  public enum EventNameEnum {
    EMAIL_RECEIVED("EMAIL_RECEIVED"),
    
    NEW_EMAIL("NEW_EMAIL"),
    
    NEW_CONTACT("NEW_CONTACT"),
    
    NEW_ATTACHMENT("NEW_ATTACHMENT"),
    
    EMAIL_OPENED("EMAIL_OPENED"),
    
    EMAIL_READ("EMAIL_READ"),
    
    DELIVERY_STATUS("DELIVERY_STATUS"),
    
    BOUNCE("BOUNCE"),
    
    BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
    
    NEW_SMS("NEW_SMS");

    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventNameEnum fromValue(String value) {
      for (EventNameEnum b : EventNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private EventNameEnum eventName;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;

  public static final String SERIALIZED_NAME_EMAIL_ID = "emailId";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private UUID emailId;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_EMAIL_IS_READ = "emailIsRead";
  @SerializedName(SERIALIZED_NAME_EMAIL_IS_READ)
  private Boolean emailIsRead;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;


  public WebhookEmailReadPayload messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
   * @return messageId
  **/
  @ApiModelProperty(required = true, value = "Idempotent message ID. Store this ID locally or in a database to prevent message duplication.")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public WebhookEmailReadPayload webhookId(UUID webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * ID of webhook entity being triggered
   * @return webhookId
  **/
  @ApiModelProperty(required = true, value = "ID of webhook entity being triggered")

  public UUID getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(UUID webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookEmailReadPayload eventName(EventNameEnum eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Name of the event type webhook is being triggered for.
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "Name of the event type webhook is being triggered for.")

  public EventNameEnum getEventName() {
    return eventName;
  }


  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }


  public WebhookEmailReadPayload webhookName(String webhookName) {
    
    this.webhookName = webhookName;
    return this;
  }

   /**
   * Name of the webhook being triggered
   * @return webhookName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the webhook being triggered")

  public String getWebhookName() {
    return webhookName;
  }


  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }


  public WebhookEmailReadPayload emailId(UUID emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * ID of the email that was received. Use this ID for fetching the email with the &#x60;EmailController&#x60;.
   * @return emailId
  **/
  @ApiModelProperty(required = true, value = "ID of the email that was received. Use this ID for fetching the email with the `EmailController`.")

  public UUID getEmailId() {
    return emailId;
  }


  public void setEmailId(UUID emailId) {
    this.emailId = emailId;
  }


  public WebhookEmailReadPayload inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Id of the inbox
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "Id of the inbox")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public WebhookEmailReadPayload emailIsRead(Boolean emailIsRead) {
    
    this.emailIsRead = emailIsRead;
    return this;
  }

   /**
   * Is the email read
   * @return emailIsRead
  **/
  @ApiModelProperty(required = true, value = "Is the email read")

  public Boolean getEmailIsRead() {
    return emailIsRead;
  }


  public void setEmailIsRead(Boolean emailIsRead) {
    this.emailIsRead = emailIsRead;
  }


  public WebhookEmailReadPayload createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date time of event creation
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Date time of event creation")

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
    WebhookEmailReadPayload webhookEmailReadPayload = (WebhookEmailReadPayload) o;
    return Objects.equals(this.messageId, webhookEmailReadPayload.messageId) &&
        Objects.equals(this.webhookId, webhookEmailReadPayload.webhookId) &&
        Objects.equals(this.eventName, webhookEmailReadPayload.eventName) &&
        Objects.equals(this.webhookName, webhookEmailReadPayload.webhookName) &&
        Objects.equals(this.emailId, webhookEmailReadPayload.emailId) &&
        Objects.equals(this.inboxId, webhookEmailReadPayload.inboxId) &&
        Objects.equals(this.emailIsRead, webhookEmailReadPayload.emailIsRead) &&
        Objects.equals(this.createdAt, webhookEmailReadPayload.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, webhookId, eventName, webhookName, emailId, inboxId, emailIsRead, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEmailReadPayload {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    emailIsRead: ").append(toIndentedString(emailIsRead)).append("\n");
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

