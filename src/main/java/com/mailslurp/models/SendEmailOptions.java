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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Options for the email to be sent
 */
@ApiModel(description = "Options for the email to be sent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class SendEmailOptions {
  public static final String SERIALIZED_NAME_TO_CONTACTS = "toContacts";
  @SerializedName(SERIALIZED_NAME_TO_CONTACTS)
  private List<UUID> toContacts = null;

  public static final String SERIALIZED_NAME_TO_GROUP = "toGroup";
  @SerializedName(SERIALIZED_NAME_TO_GROUP)
  private UUID toGroup;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private Boolean html;

  public static final String SERIALIZED_NAME_IS_H_T_M_L = "isHTML";
  @SerializedName(SERIALIZED_NAME_IS_H_T_M_L)
  private Boolean isHTML;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_TEMPLATE_VARIABLES = "templateVariables";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_VARIABLES)
  private Map<String, Object> templateVariables = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private UUID template;

  /**
   * How an email should be sent based on its recipients
   */
  @JsonAdapter(SendStrategyEnum.Adapter.class)
  public enum SendStrategyEnum {
    SINGLE_MESSAGE("SINGLE_MESSAGE");

    private String value;

    SendStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendStrategyEnum fromValue(String value) {
      for (SendStrategyEnum b : SendStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SendStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_STRATEGY = "sendStrategy";
  @SerializedName(SERIALIZED_NAME_SEND_STRATEGY)
  private SendStrategyEnum sendStrategy;

  public static final String SERIALIZED_NAME_USE_INBOX_NAME = "useInboxName";
  @SerializedName(SERIALIZED_NAME_USE_INBOX_NAME)
  private Boolean useInboxName;

  public static final String SERIALIZED_NAME_ADD_TRACKING_PIXEL = "addTrackingPixel";
  @SerializedName(SERIALIZED_NAME_ADD_TRACKING_PIXEL)
  private Boolean addTrackingPixel;

  public static final String SERIALIZED_NAME_FILTER_BOUNCED_RECIPIENTS = "filterBouncedRecipients";
  @SerializedName(SERIALIZED_NAME_FILTER_BOUNCED_RECIPIENTS)
  private Boolean filterBouncedRecipients;

  /**
   * Validate recipient email addresses before sending
   */
  @JsonAdapter(ValidateEmailAddressesEnum.Adapter.class)
  public enum ValidateEmailAddressesEnum {
    VALIDATE_FILTER_REMOVE_INVALID("VALIDATE_FILTER_REMOVE_INVALID"),
    
    VALIDATE_ERROR_IF_INVALID("VALIDATE_ERROR_IF_INVALID"),
    
    NO_VALIDATION("NO_VALIDATION");

    private String value;

    ValidateEmailAddressesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidateEmailAddressesEnum fromValue(String value) {
      for (ValidateEmailAddressesEnum b : ValidateEmailAddressesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValidateEmailAddressesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidateEmailAddressesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidateEmailAddressesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidateEmailAddressesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATE_EMAIL_ADDRESSES = "validateEmailAddresses";
  @SerializedName(SERIALIZED_NAME_VALIDATE_EMAIL_ADDRESSES)
  private ValidateEmailAddressesEnum validateEmailAddresses;


  public SendEmailOptions toContacts(List<UUID> toContacts) {
    
    this.toContacts = toContacts;
    return this;
  }

  public SendEmailOptions addToContactsItem(UUID toContactsItem) {
    if (this.toContacts == null) {
      this.toContacts = new ArrayList<>();
    }
    this.toContacts.add(toContactsItem);
    return this;
  }

   /**
   * Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients.
   * @return toContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients.")

  public List<UUID> getToContacts() {
    return toContacts;
  }


  public void setToContacts(List<UUID> toContacts) {
    this.toContacts = toContacts;
  }


  public SendEmailOptions toGroup(UUID toGroup) {
    
    this.toGroup = toGroup;
    return this;
  }

   /**
   * Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients
   * @return toGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients")

  public UUID getToGroup() {
    return toGroup;
  }


  public void setToGroup(UUID toGroup) {
    this.toGroup = toGroup;
  }


  public SendEmailOptions to(List<String> to) {
    
    this.to = to;
    return this;
  }

  public SendEmailOptions addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destination email addresses. Each email address must be RFC 5322 format. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating). Be cautious when sending emails that your recipients exist. High bounce rates (meaning a high percentage of emails cannot be delivered because an address does not exist) can result in account freezing.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of destination email addresses. Each email address must be RFC 5322 format. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating). Be cautious when sending emails that your recipients exist. High bounce rates (meaning a high percentage of emails cannot be delivered because an address does not exist) can result in account freezing.")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    this.to = to;
  }


  public SendEmailOptions from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Optional from address. Email address is RFC 5322 format and may include a display name and email in angle brackets (&#x60;my@address.com&#x60; or &#x60;My inbox &lt;my@address.com&gt;&#x60;). If no sender is set the source inbox address will be used for this field. If you set &#x60;useInboxName&#x60; to &#x60;true&#x60; the from field will include the inbox name as a display name: &#x60;inbox_name &lt;inbox@address.com&gt;&#x60;. For this to work use the name field when creating an inbox. Beware of potential spam penalties when setting the from field to an address not used by the inbox. Your emails may get blocked by services if you impersonate another address. To use a custom email addresses use a custom domain. You can create domains with the DomainController. The domain must be verified in the dashboard before it can be used.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional from address. Email address is RFC 5322 format and may include a display name and email in angle brackets (`my@address.com` or `My inbox <my@address.com>`). If no sender is set the source inbox address will be used for this field. If you set `useInboxName` to `true` the from field will include the inbox name as a display name: `inbox_name <inbox@address.com>`. For this to work use the name field when creating an inbox. Beware of potential spam penalties when setting the from field to an address not used by the inbox. Your emails may get blocked by services if you impersonate another address. To use a custom email addresses use a custom domain. You can create domains with the DomainController. The domain must be verified in the dashboard before it can be used.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SendEmailOptions cc(List<String> cc) {
    
    this.cc = cc;
    return this;
  }

  public SendEmailOptions addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Optional list of cc destination email addresses
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of cc destination email addresses")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  public SendEmailOptions bcc(List<String> bcc) {
    
    this.bcc = bcc;
    return this;
  }

  public SendEmailOptions addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Optional list of bcc destination email addresses
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of bcc destination email addresses")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  public SendEmailOptions subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Optional email subject line
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional email subject line")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public SendEmailOptions replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Optional replyTo header
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional replyTo header")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public SendEmailOptions body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Optional contents of email. If body contains HTML then set &#x60;isHTML&#x60; to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with &#x60;toGroup&#x60; contact variables or &#x60;templateVariables&#x60; data. If you need more templating control consider creating a template and using the &#x60;template&#x60; property instead of the body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional contents of email. If body contains HTML then set `isHTML` to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with `toGroup` contact variables or `templateVariables` data. If you need more templating control consider creating a template and using the `template` property instead of the body.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public SendEmailOptions html(Boolean html) {
    
    this.html = html;
    return this;
  }

   /**
   * Optional HTML flag to indicate that contents is HTML. Set&#39;s a &#x60;content-type: text/html&#x60; for email. (Deprecated: use &#x60;isHTML&#x60; instead.)
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional HTML flag to indicate that contents is HTML. Set's a `content-type: text/html` for email. (Deprecated: use `isHTML` instead.)")

  public Boolean getHtml() {
    return html;
  }


  public void setHtml(Boolean html) {
    this.html = html;
  }


  public SendEmailOptions isHTML(Boolean isHTML) {
    
    this.isHTML = isHTML;
    return this;
  }

   /**
   * Optional HTML flag. If true the &#x60;content-type&#x60; of the email will be &#x60;text/html&#x60;. Set to true when sending HTML to ensure proper rending on email clients
   * @return isHTML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional HTML flag. If true the `content-type` of the email will be `text/html`. Set to true when sending HTML to ensure proper rending on email clients")

  public Boolean getIsHTML() {
    return isHTML;
  }


  public void setIsHTML(Boolean isHTML) {
    this.isHTML = isHTML;
  }


  public SendEmailOptions charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Optional charset
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional charset")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public SendEmailOptions attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public SendEmailOptions addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Optional list of attachment IDs to send with this email. You must first upload each attachment separately via method call or dashboard in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded. There are several ways to upload that support &#x60;multi-part form&#x60;, &#x60;base64 file encoding&#x60;, and octet stream binary uploads. See the &#x60;UploadController&#x60; for available methods. 
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of attachment IDs to send with this email. You must first upload each attachment separately via method call or dashboard in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded. There are several ways to upload that support `multi-part form`, `base64 file encoding`, and octet stream binary uploads. See the `UploadController` for available methods. ")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public SendEmailOptions templateVariables(Map<String, Object> templateVariables) {
    
    this.templateVariables = templateVariables;
    return this;
  }

  public SendEmailOptions putTemplateVariablesItem(String key, Object templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new HashMap<>();
    }
    this.templateVariables.put(key, templateVariablesItem);
    return this;
  }

   /**
   * Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found.
   * @return templateVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found.")

  public Map<String, Object> getTemplateVariables() {
    return templateVariables;
  }


  public void setTemplateVariables(Map<String, Object> templateVariables) {
    this.templateVariables = templateVariables;
  }


  public SendEmailOptions template(UUID template) {
    
    this.template = template;
    return this;
  }

   /**
   * Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of &#x60;templateVariables&#x60;. You can find which variables are needed by fetching the template itself or viewing it in the dashboard.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of `templateVariables`. You can find which variables are needed by fetching the template itself or viewing it in the dashboard.")

  public UUID getTemplate() {
    return template;
  }


  public void setTemplate(UUID template) {
    this.template = template;
  }


  public SendEmailOptions sendStrategy(SendStrategyEnum sendStrategy) {
    
    this.sendStrategy = sendStrategy;
    return this;
  }

   /**
   * How an email should be sent based on its recipients
   * @return sendStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How an email should be sent based on its recipients")

  public SendStrategyEnum getSendStrategy() {
    return sendStrategy;
  }


  public void setSendStrategy(SendStrategyEnum sendStrategy) {
    this.sendStrategy = sendStrategy;
  }


  public SendEmailOptions useInboxName(Boolean useInboxName) {
    
    this.useInboxName = useInboxName;
    return this;
  }

   /**
   * Use name of inbox as sender email address name. Will construct RFC 5322 email address with &#x60;Inbox name &lt;inbox@address.com&gt;&#x60; if the inbox has a name.
   * @return useInboxName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use name of inbox as sender email address name. Will construct RFC 5322 email address with `Inbox name <inbox@address.com>` if the inbox has a name.")

  public Boolean getUseInboxName() {
    return useInboxName;
  }


  public void setUseInboxName(Boolean useInboxName) {
    this.useInboxName = useInboxName;
  }


  public SendEmailOptions addTrackingPixel(Boolean addTrackingPixel) {
    
    this.addTrackingPixel = addTrackingPixel;
    return this;
  }

   /**
   * Add tracking pixel to email
   * @return addTrackingPixel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tracking pixel to email")

  public Boolean getAddTrackingPixel() {
    return addTrackingPixel;
  }


  public void setAddTrackingPixel(Boolean addTrackingPixel) {
    this.addTrackingPixel = addTrackingPixel;
  }


  public SendEmailOptions filterBouncedRecipients(Boolean filterBouncedRecipients) {
    
    this.filterBouncedRecipients = filterBouncedRecipients;
    return this;
  }

   /**
   * Filter recipients to remove any bounced recipients from to, bcc, and cc before sending
   * @return filterBouncedRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter recipients to remove any bounced recipients from to, bcc, and cc before sending")

  public Boolean getFilterBouncedRecipients() {
    return filterBouncedRecipients;
  }


  public void setFilterBouncedRecipients(Boolean filterBouncedRecipients) {
    this.filterBouncedRecipients = filterBouncedRecipients;
  }


  public SendEmailOptions validateEmailAddresses(ValidateEmailAddressesEnum validateEmailAddresses) {
    
    this.validateEmailAddresses = validateEmailAddresses;
    return this;
  }

   /**
   * Validate recipient email addresses before sending
   * @return validateEmailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Validate recipient email addresses before sending")

  public ValidateEmailAddressesEnum getValidateEmailAddresses() {
    return validateEmailAddresses;
  }


  public void setValidateEmailAddresses(ValidateEmailAddressesEnum validateEmailAddresses) {
    this.validateEmailAddresses = validateEmailAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmailOptions sendEmailOptions = (SendEmailOptions) o;
    return Objects.equals(this.toContacts, sendEmailOptions.toContacts) &&
        Objects.equals(this.toGroup, sendEmailOptions.toGroup) &&
        Objects.equals(this.to, sendEmailOptions.to) &&
        Objects.equals(this.from, sendEmailOptions.from) &&
        Objects.equals(this.cc, sendEmailOptions.cc) &&
        Objects.equals(this.bcc, sendEmailOptions.bcc) &&
        Objects.equals(this.subject, sendEmailOptions.subject) &&
        Objects.equals(this.replyTo, sendEmailOptions.replyTo) &&
        Objects.equals(this.body, sendEmailOptions.body) &&
        Objects.equals(this.html, sendEmailOptions.html) &&
        Objects.equals(this.isHTML, sendEmailOptions.isHTML) &&
        Objects.equals(this.charset, sendEmailOptions.charset) &&
        Objects.equals(this.attachments, sendEmailOptions.attachments) &&
        Objects.equals(this.templateVariables, sendEmailOptions.templateVariables) &&
        Objects.equals(this.template, sendEmailOptions.template) &&
        Objects.equals(this.sendStrategy, sendEmailOptions.sendStrategy) &&
        Objects.equals(this.useInboxName, sendEmailOptions.useInboxName) &&
        Objects.equals(this.addTrackingPixel, sendEmailOptions.addTrackingPixel) &&
        Objects.equals(this.filterBouncedRecipients, sendEmailOptions.filterBouncedRecipients) &&
        Objects.equals(this.validateEmailAddresses, sendEmailOptions.validateEmailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toContacts, toGroup, to, from, cc, bcc, subject, replyTo, body, html, isHTML, charset, attachments, templateVariables, template, sendStrategy, useInboxName, addTrackingPixel, filterBouncedRecipients, validateEmailAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailOptions {\n");
    sb.append("    toContacts: ").append(toIndentedString(toContacts)).append("\n");
    sb.append("    toGroup: ").append(toIndentedString(toGroup)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    isHTML: ").append(toIndentedString(isHTML)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
    sb.append("    useInboxName: ").append(toIndentedString(useInboxName)).append("\n");
    sb.append("    addTrackingPixel: ").append(toIndentedString(addTrackingPixel)).append("\n");
    sb.append("    filterBouncedRecipients: ").append(toIndentedString(filterBouncedRecipients)).append("\n");
    sb.append("    validateEmailAddresses: ").append(toIndentedString(validateEmailAddresses)).append("\n");
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

