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
import java.util.UUID;

/**
 * Update group contacts options. Pass a list of contact ids to replace existing group contacts.
 */
@ApiModel(description = "Update group contacts options. Pass a list of contact ids to replace existing group contacts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class UpdateGroupContacts {
  public static final String SERIALIZED_NAME_CONTACT_IDS = "contactIds";
  @SerializedName(SERIALIZED_NAME_CONTACT_IDS)
  private List<UUID> contactIds = new ArrayList<>();


  public UpdateGroupContacts contactIds(List<UUID> contactIds) {
    
    this.contactIds = contactIds;
    return this;
  }

  public UpdateGroupContacts addContactIdsItem(UUID contactIdsItem) {
    this.contactIds.add(contactIdsItem);
    return this;
  }

   /**
   * Get contactIds
   * @return contactIds
  **/
  @ApiModelProperty(required = true, value = "")

  public List<UUID> getContactIds() {
    return contactIds;
  }


  public void setContactIds(List<UUID> contactIds) {
    this.contactIds = contactIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupContacts updateGroupContacts = (UpdateGroupContacts) o;
    return Objects.equals(this.contactIds, updateGroupContacts.contactIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupContacts {\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
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

