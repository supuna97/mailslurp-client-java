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
 * Email alias representation
 */
@ApiModel(description = "Email alias representation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class AliasDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_MASKED_EMAIL_ADDRESS = "maskedEmailAddress";
  @SerializedName(SERIALIZED_NAME_MASKED_EMAIL_ADDRESS)
  private String maskedEmailAddress;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_INBOX_ID = "inboxId";
  @SerializedName(SERIALIZED_NAME_INBOX_ID)
  private UUID inboxId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USE_THREADS = "useThreads";
  @SerializedName(SERIALIZED_NAME_USE_THREADS)
  private Boolean useThreads;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "isVerified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public AliasDto id(UUID id) {
    
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


  public AliasDto emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The alias&#39;s email address for receiving email
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The alias's email address for receiving email")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AliasDto maskedEmailAddress(String maskedEmailAddress) {
    
    this.maskedEmailAddress = maskedEmailAddress;
    return this;
  }

   /**
   * The underlying email address that is hidden and will received forwarded email
   * @return maskedEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The underlying email address that is hidden and will received forwarded email")

  public String getMaskedEmailAddress() {
    return maskedEmailAddress;
  }


  public void setMaskedEmailAddress(String maskedEmailAddress) {
    this.maskedEmailAddress = maskedEmailAddress;
  }


  public AliasDto userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public AliasDto inboxId(UUID inboxId) {
    
    this.inboxId = inboxId;
    return this;
  }

   /**
   * Inbox that is associated with the alias
   * @return inboxId
  **/
  @ApiModelProperty(required = true, value = "Inbox that is associated with the alias")

  public UUID getInboxId() {
    return inboxId;
  }


  public void setInboxId(UUID inboxId) {
    this.inboxId = inboxId;
  }


  public AliasDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AliasDto useThreads(Boolean useThreads) {
    
    this.useThreads = useThreads;
    return this;
  }

   /**
   * If alias will generate response threads or not when email are received by it
   * @return useThreads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If alias will generate response threads or not when email are received by it")

  public Boolean getUseThreads() {
    return useThreads;
  }


  public void setUseThreads(Boolean useThreads) {
    this.useThreads = useThreads;
  }


  public AliasDto isVerified(Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account
   * @return isVerified
  **/
  @ApiModelProperty(required = true, value = "Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account")

  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public AliasDto createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AliasDto updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasDto aliasDto = (AliasDto) o;
    return Objects.equals(this.id, aliasDto.id) &&
        Objects.equals(this.emailAddress, aliasDto.emailAddress) &&
        Objects.equals(this.maskedEmailAddress, aliasDto.maskedEmailAddress) &&
        Objects.equals(this.userId, aliasDto.userId) &&
        Objects.equals(this.inboxId, aliasDto.inboxId) &&
        Objects.equals(this.name, aliasDto.name) &&
        Objects.equals(this.useThreads, aliasDto.useThreads) &&
        Objects.equals(this.isVerified, aliasDto.isVerified) &&
        Objects.equals(this.createdAt, aliasDto.createdAt) &&
        Objects.equals(this.updatedAt, aliasDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, maskedEmailAddress, userId, inboxId, name, useThreads, isVerified, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    maskedEmailAddress: ").append(toIndentedString(maskedEmailAddress)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    inboxId: ").append(toIndentedString(inboxId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    useThreads: ").append(toIndentedString(useThreads)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

