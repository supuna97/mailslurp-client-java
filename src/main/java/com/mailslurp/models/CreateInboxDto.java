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
 * Options for creating an inbox. An inbox has a real email address that can send and receive emails. Inboxes can be permanent or expire at a given time. Inboxes are either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; mailboxes. &#x60;SMTP&#x60; inboxes are processed by a mail server running at &#x60;mailslurp.mx&#x60; while &#x60;HTTP&#x60; inboxes are processed by AWS SES backed mailservers. An inbox email address is randomly assigned by default ending in either &#x60;mailslurp.com&#x60; or (if &#x60;useDomainPool&#x60; is enabled) ending in a similar domain such as &#x60;mailslurp.xyz&#x60; (selected at random). To specify an address use a custom domain: either pass the &#x60;emailAddress&#x60; options with &#x60;&lt;your-recipient&gt;@&lt;your-domain&gt;&#x60;. To create a randomized address for your domain set the &#x60;domainName&#x60; to the domain you have verified or pass the &#x60;domainId&#x60;. Virtual inboxes prevent outbound sending and instead trap mail.
 */
@ApiModel(description = "Options for creating an inbox. An inbox has a real email address that can send and receive emails. Inboxes can be permanent or expire at a given time. Inboxes are either `SMTP` or `HTTP` mailboxes. `SMTP` inboxes are processed by a mail server running at `mailslurp.mx` while `HTTP` inboxes are processed by AWS SES backed mailservers. An inbox email address is randomly assigned by default ending in either `mailslurp.com` or (if `useDomainPool` is enabled) ending in a similar domain such as `mailslurp.xyz` (selected at random). To specify an address use a custom domain: either pass the `emailAddress` options with `<your-recipient>@<your-domain>`. To create a randomized address for your domain set the `domainName` to the domain you have verified or pass the `domainId`. Virtual inboxes prevent outbound sending and instead trap mail.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class CreateInboxDto {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private UUID domainId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_USE_DOMAIN_POOL = "useDomainPool";
  @SerializedName(SERIALIZED_NAME_USE_DOMAIN_POOL)
  private Boolean useDomainPool;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FAVOURITE = "favourite";
  @SerializedName(SERIALIZED_NAME_FAVOURITE)
  private Boolean favourite;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Long expiresIn;

  public static final String SERIALIZED_NAME_ALLOW_TEAM_ACCESS = "allowTeamAccess";
  @SerializedName(SERIALIZED_NAME_ALLOW_TEAM_ACCESS)
  private Boolean allowTeamAccess;

  /**
   * Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send).
   */
  @JsonAdapter(InboxTypeEnum.Adapter.class)
  public enum InboxTypeEnum {
    HTTP_INBOX("HTTP_INBOX"),
    
    SMTP_INBOX("SMTP_INBOX");

    private String value;

    InboxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InboxTypeEnum fromValue(String value) {
      for (InboxTypeEnum b : InboxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InboxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InboxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InboxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InboxTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INBOX_TYPE = "inboxType";
  @SerializedName(SERIALIZED_NAME_INBOX_TYPE)
  private InboxTypeEnum inboxType;

  public static final String SERIALIZED_NAME_VIRTUAL_INBOX = "virtualInbox";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_INBOX)
  private Boolean virtualInbox;

  public static final String SERIALIZED_NAME_USE_SHORT_ADDRESS = "useShortAddress";
  @SerializedName(SERIALIZED_NAME_USE_SHORT_ADDRESS)
  private Boolean useShortAddress;


  public CreateInboxDto emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as &#x60;123@mailslurp.com&#x60;. If you use the &#x60;useDomainPool&#x60; option when the email address is null it will generate an email address with a more varied domain ending such as &#x60;123@mailslurp.info&#x60; or &#x60;123@mailslurp.biz&#x60;. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so &#x60;SMTP&#x60; inboxes will only work with &#x60;SMTP&#x60; type domains. Avoid &#x60;SMTP&#x60; inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so `SMTP` inboxes will only work with `SMTP` type domains. Avoid `SMTP` inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public CreateInboxDto domainName(String domainName) {
    
    this.domainName = domainName;
    return this;
  }

   /**
   * FQDN domain name for the domain you have verified. Will be appended with a randomly assigned recipient name. Use the &#x60;emailAddress&#x60; option instead to specify the full custom inbox.
   * @return domainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FQDN domain name for the domain you have verified. Will be appended with a randomly assigned recipient name. Use the `emailAddress` option instead to specify the full custom inbox.")

  public String getDomainName() {
    return domainName;
  }


  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public CreateInboxDto domainId(UUID domainId) {
    
    this.domainId = domainId;
    return this;
  }

   /**
   * ID of custom domain to use for email address.
   * @return domainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of custom domain to use for email address.")

  public UUID getDomainId() {
    return domainId;
  }


  public void setDomainId(UUID domainId) {
    this.domainId = domainId;
  }


  public CreateInboxDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateInboxDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateInboxDto useDomainPool(Boolean useDomainPool) {
    
    this.useDomainPool = useDomainPool;
    return this;
  }

   /**
   * Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default &#x60;@mailslurp.com&#x60; email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in &#x60;@mailslurp.{world,info,xyz,...}&#x60; . This means a TLD is randomly selecting from a list of &#x60;.biz&#x60;, &#x60;.info&#x60;, &#x60;.xyz&#x60; etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of &#x60;@mailslurp.com&#x60; or custom email address provided by the emailAddress field. Note this feature is only available for &#x60;HTTP&#x60; inbox types.
   * @return useDomainPool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field. Note this feature is only available for `HTTP` inbox types.")

  public Boolean getUseDomainPool() {
    return useDomainPool;
  }


  public void setUseDomainPool(Boolean useDomainPool) {
    this.useDomainPool = useDomainPool;
  }


  public CreateInboxDto tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateInboxDto addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateInboxDto expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Optional inbox expiration date. If null then this inbox is permanent and the emails in it won&#39;t be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public CreateInboxDto favourite(Boolean favourite) {
    
    this.favourite = favourite;
    return this;
  }

   /**
   * Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering
   * @return favourite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering")

  public Boolean getFavourite() {
    return favourite;
  }


  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }


  public CreateInboxDto expiresIn(Long expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Number of milliseconds that inbox should exist for
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of milliseconds that inbox should exist for")

  public Long getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }


  public CreateInboxDto allowTeamAccess(Boolean allowTeamAccess) {
    
    this.allowTeamAccess = allowTeamAccess;
    return this;
  }

   /**
   * DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.
   * @return allowTeamAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.")

  public Boolean getAllowTeamAccess() {
    return allowTeamAccess;
  }


  public void setAllowTeamAccess(Boolean allowTeamAccess) {
    this.allowTeamAccess = allowTeamAccess;
  }


  public CreateInboxDto inboxType(InboxTypeEnum inboxType) {
    
    this.inboxType = inboxType;
    return this;
  }

   /**
   * Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send).
   * @return inboxType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send).")

  public InboxTypeEnum getInboxType() {
    return inboxType;
  }


  public void setInboxType(InboxTypeEnum inboxType) {
    this.inboxType = inboxType;
  }


  public CreateInboxDto virtualInbox(Boolean virtualInbox) {
    
    this.virtualInbox = virtualInbox;
    return this;
  }

   /**
   * Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending.
   * @return virtualInbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending.")

  public Boolean getVirtualInbox() {
    return virtualInbox;
  }


  public void setVirtualInbox(Boolean virtualInbox) {
    this.virtualInbox = virtualInbox;
  }


  public CreateInboxDto useShortAddress(Boolean useShortAddress) {
    
    this.useShortAddress = useShortAddress;
    return this;
  }

   /**
   * Use a shorter email address under 31 characters
   * @return useShortAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use a shorter email address under 31 characters")

  public Boolean getUseShortAddress() {
    return useShortAddress;
  }


  public void setUseShortAddress(Boolean useShortAddress) {
    this.useShortAddress = useShortAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInboxDto createInboxDto = (CreateInboxDto) o;
    return Objects.equals(this.emailAddress, createInboxDto.emailAddress) &&
        Objects.equals(this.domainName, createInboxDto.domainName) &&
        Objects.equals(this.domainId, createInboxDto.domainId) &&
        Objects.equals(this.name, createInboxDto.name) &&
        Objects.equals(this.description, createInboxDto.description) &&
        Objects.equals(this.useDomainPool, createInboxDto.useDomainPool) &&
        Objects.equals(this.tags, createInboxDto.tags) &&
        Objects.equals(this.expiresAt, createInboxDto.expiresAt) &&
        Objects.equals(this.favourite, createInboxDto.favourite) &&
        Objects.equals(this.expiresIn, createInboxDto.expiresIn) &&
        Objects.equals(this.allowTeamAccess, createInboxDto.allowTeamAccess) &&
        Objects.equals(this.inboxType, createInboxDto.inboxType) &&
        Objects.equals(this.virtualInbox, createInboxDto.virtualInbox) &&
        Objects.equals(this.useShortAddress, createInboxDto.useShortAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, domainName, domainId, name, description, useDomainPool, tags, expiresAt, favourite, expiresIn, allowTeamAccess, inboxType, virtualInbox, useShortAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInboxDto {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    useDomainPool: ").append(toIndentedString(useDomainPool)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    allowTeamAccess: ").append(toIndentedString(allowTeamAccess)).append("\n");
    sb.append("    inboxType: ").append(toIndentedString(inboxType)).append("\n");
    sb.append("    virtualInbox: ").append(toIndentedString(virtualInbox)).append("\n");
    sb.append("    useShortAddress: ").append(toIndentedString(useShortAddress)).append("\n");
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

