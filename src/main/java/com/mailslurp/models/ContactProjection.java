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
 * Email contact for address book
 */
@ApiModel(description = "Email contact for address book")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class ContactProjection {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private UUID groupId;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<String> emailAddresses = null;

  public static final String SERIALIZED_NAME_OPT_OUT = "optOut";
  @SerializedName(SERIALIZED_NAME_OPT_OUT)
  private Boolean optOut;


  public ContactProjection id(UUID id) {
    
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


  public ContactProjection groupId(UUID groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getGroupId() {
    return groupId;
  }


  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }


  public ContactProjection emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ContactProjection createdAt(OffsetDateTime createdAt) {
    
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


  public ContactProjection firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ContactProjection lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ContactProjection company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public ContactProjection emailAddresses(List<String> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public ContactProjection addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public ContactProjection optOut(Boolean optOut) {
    
    this.optOut = optOut;
    return this;
  }

   /**
   * Get optOut
   * @return optOut
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getOptOut() {
    return optOut;
  }


  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactProjection contactProjection = (ContactProjection) o;
    return Objects.equals(this.id, contactProjection.id) &&
        Objects.equals(this.groupId, contactProjection.groupId) &&
        Objects.equals(this.emailAddress, contactProjection.emailAddress) &&
        Objects.equals(this.createdAt, contactProjection.createdAt) &&
        Objects.equals(this.firstName, contactProjection.firstName) &&
        Objects.equals(this.lastName, contactProjection.lastName) &&
        Objects.equals(this.company, contactProjection.company) &&
        Objects.equals(this.emailAddresses, contactProjection.emailAddresses) &&
        Objects.equals(this.optOut, contactProjection.optOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, emailAddress, createdAt, firstName, lastName, company, emailAddresses, optOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactProjection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
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

