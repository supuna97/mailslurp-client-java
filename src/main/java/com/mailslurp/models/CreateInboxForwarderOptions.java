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
 * Options for creating an inbox forwarder
 */
@ApiModel(description = "Options for creating an inbox forwarder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class CreateInboxForwarderOptions {
  /**
   * Field to match against to trigger inbox forwarding for inbound email
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


  public CreateInboxForwarderOptions field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * Field to match against to trigger inbox forwarding for inbound email
   * @return field
  **/
  @ApiModelProperty(required = true, value = "Field to match against to trigger inbox forwarding for inbound email")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public CreateInboxForwarderOptions match(String match) {
    
    this.match = match;
    return this;
  }

   /**
   * String or wildcard style match for field specified when evaluating forwarding rules
   * @return match
  **/
  @ApiModelProperty(required = true, value = "String or wildcard style match for field specified when evaluating forwarding rules")

  public String getMatch() {
    return match;
  }


  public void setMatch(String match) {
    this.match = match;
  }


  public CreateInboxForwarderOptions forwardToRecipients(List<String> forwardToRecipients) {
    
    this.forwardToRecipients = forwardToRecipients;
    return this;
  }

  public CreateInboxForwarderOptions addForwardToRecipientsItem(String forwardToRecipientsItem) {
    this.forwardToRecipients.add(forwardToRecipientsItem);
    return this;
  }

   /**
   * Email addresses to forward an email to if it matches the field and match criteria of the forwarder
   * @return forwardToRecipients
  **/
  @ApiModelProperty(required = true, value = "Email addresses to forward an email to if it matches the field and match criteria of the forwarder")

  public List<String> getForwardToRecipients() {
    return forwardToRecipients;
  }


  public void setForwardToRecipients(List<String> forwardToRecipients) {
    this.forwardToRecipients = forwardToRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInboxForwarderOptions createInboxForwarderOptions = (CreateInboxForwarderOptions) o;
    return Objects.equals(this.field, createInboxForwarderOptions.field) &&
        Objects.equals(this.match, createInboxForwarderOptions.match) &&
        Objects.equals(this.forwardToRecipients, createInboxForwarderOptions.forwardToRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, match, forwardToRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInboxForwarderOptions {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    forwardToRecipients: ").append(toIndentedString(forwardToRecipients)).append("\n");
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

