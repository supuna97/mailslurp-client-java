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
import java.util.UUID;

/**
 * NEW_SMS webhook payload. Sent to your webhook url endpoint via HTTP POST when an sms is received by the phone number that your webhook is attached to. Use the SMS ID to fetch the full SMS details.
 */
@ApiModel(description = "NEW_SMS webhook payload. Sent to your webhook url endpoint via HTTP POST when an sms is received by the phone number that your webhook is attached to. Use the SMS ID to fetch the full SMS details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class WebhookNewSmsPayload {
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

  public static final String SERIALIZED_NAME_SMS_ID = "smsId";
  @SerializedName(SERIALIZED_NAME_SMS_ID)
  private UUID smsId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private UUID phoneNumber;

  public static final String SERIALIZED_NAME_TO_NUMBER = "toNumber";
  @SerializedName(SERIALIZED_NAME_TO_NUMBER)
  private String toNumber;

  public static final String SERIALIZED_NAME_FROM_NUMBER = "fromNumber";
  @SerializedName(SERIALIZED_NAME_FROM_NUMBER)
  private String fromNumber;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;


  public WebhookNewSmsPayload messageId(String messageId) {
    
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


  public WebhookNewSmsPayload webhookId(UUID webhookId) {
    
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


  public WebhookNewSmsPayload eventName(EventNameEnum eventName) {
    
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


  public WebhookNewSmsPayload webhookName(String webhookName) {
    
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


  public WebhookNewSmsPayload smsId(UUID smsId) {
    
    this.smsId = smsId;
    return this;
  }

   /**
   * ID of SMS message
   * @return smsId
  **/
  @ApiModelProperty(required = true, value = "ID of SMS message")

  public UUID getSmsId() {
    return smsId;
  }


  public void setSmsId(UUID smsId) {
    this.smsId = smsId;
  }


  public WebhookNewSmsPayload userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User ID of event
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "User ID of event")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public WebhookNewSmsPayload phoneNumber(UUID phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * ID of phone number receiving SMS
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "ID of phone number receiving SMS")

  public UUID getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(UUID phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public WebhookNewSmsPayload toNumber(String toNumber) {
    
    this.toNumber = toNumber;
    return this;
  }

   /**
   * Recipient phone number
   * @return toNumber
  **/
  @ApiModelProperty(required = true, value = "Recipient phone number")

  public String getToNumber() {
    return toNumber;
  }


  public void setToNumber(String toNumber) {
    this.toNumber = toNumber;
  }


  public WebhookNewSmsPayload fromNumber(String fromNumber) {
    
    this.fromNumber = fromNumber;
    return this;
  }

   /**
   * Sender phone number
   * @return fromNumber
  **/
  @ApiModelProperty(required = true, value = "Sender phone number")

  public String getFromNumber() {
    return fromNumber;
  }


  public void setFromNumber(String fromNumber) {
    this.fromNumber = fromNumber;
  }


  public WebhookNewSmsPayload body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * SMS message body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "SMS message body")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public WebhookNewSmsPayload read(Boolean read) {
    
    this.read = read;
    return this;
  }

   /**
   * SMS has been read
   * @return read
  **/
  @ApiModelProperty(required = true, value = "SMS has been read")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookNewSmsPayload webhookNewSmsPayload = (WebhookNewSmsPayload) o;
    return Objects.equals(this.messageId, webhookNewSmsPayload.messageId) &&
        Objects.equals(this.webhookId, webhookNewSmsPayload.webhookId) &&
        Objects.equals(this.eventName, webhookNewSmsPayload.eventName) &&
        Objects.equals(this.webhookName, webhookNewSmsPayload.webhookName) &&
        Objects.equals(this.smsId, webhookNewSmsPayload.smsId) &&
        Objects.equals(this.userId, webhookNewSmsPayload.userId) &&
        Objects.equals(this.phoneNumber, webhookNewSmsPayload.phoneNumber) &&
        Objects.equals(this.toNumber, webhookNewSmsPayload.toNumber) &&
        Objects.equals(this.fromNumber, webhookNewSmsPayload.fromNumber) &&
        Objects.equals(this.body, webhookNewSmsPayload.body) &&
        Objects.equals(this.read, webhookNewSmsPayload.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, webhookId, eventName, webhookName, smsId, userId, phoneNumber, toNumber, fromNumber, body, read);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookNewSmsPayload {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    smsId: ").append(toIndentedString(smsId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    toNumber: ").append(toIndentedString(toNumber)).append("\n");
    sb.append("    fromNumber: ").append(toIndentedString(fromNumber)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

