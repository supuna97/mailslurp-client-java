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
 * EmergencyAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class EmergencyAddress {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customerName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  /**
   * Gets or Sets phoneCountry
   */
  @JsonAdapter(PhoneCountryEnum.Adapter.class)
  public enum PhoneCountryEnum {
    US("US"),
    
    GB("GB");

    private String value;

    PhoneCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneCountryEnum fromValue(String value) {
      for (PhoneCountryEnum b : PhoneCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneCountryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_COUNTRY = "phoneCountry";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY)
  private PhoneCountryEnum phoneCountry;

  public static final String SERIALIZED_NAME_ACCOUNT_SID = "accountSid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SID)
  private String accountSid;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public EmergencyAddress id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public EmergencyAddress sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * Get sid
   * @return sid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public EmergencyAddress userId(UUID userId) {
    
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


  public EmergencyAddress displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public EmergencyAddress customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public EmergencyAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public EmergencyAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public EmergencyAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public EmergencyAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public EmergencyAddress phoneCountry(PhoneCountryEnum phoneCountry) {
    
    this.phoneCountry = phoneCountry;
    return this;
  }

   /**
   * Get phoneCountry
   * @return phoneCountry
  **/
  @ApiModelProperty(required = true, value = "")

  public PhoneCountryEnum getPhoneCountry() {
    return phoneCountry;
  }


  public void setPhoneCountry(PhoneCountryEnum phoneCountry) {
    this.phoneCountry = phoneCountry;
  }


  public EmergencyAddress accountSid(String accountSid) {
    
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Get accountSid
   * @return accountSid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAccountSid() {
    return accountSid;
  }


  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public EmergencyAddress createdAt(OffsetDateTime createdAt) {
    
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


  public EmergencyAddress updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "")

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
    EmergencyAddress emergencyAddress = (EmergencyAddress) o;
    return Objects.equals(this.id, emergencyAddress.id) &&
        Objects.equals(this.sid, emergencyAddress.sid) &&
        Objects.equals(this.userId, emergencyAddress.userId) &&
        Objects.equals(this.displayName, emergencyAddress.displayName) &&
        Objects.equals(this.customerName, emergencyAddress.customerName) &&
        Objects.equals(this.address1, emergencyAddress.address1) &&
        Objects.equals(this.city, emergencyAddress.city) &&
        Objects.equals(this.region, emergencyAddress.region) &&
        Objects.equals(this.postalCode, emergencyAddress.postalCode) &&
        Objects.equals(this.phoneCountry, emergencyAddress.phoneCountry) &&
        Objects.equals(this.accountSid, emergencyAddress.accountSid) &&
        Objects.equals(this.createdAt, emergencyAddress.createdAt) &&
        Objects.equals(this.updatedAt, emergencyAddress.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sid, userId, displayName, customerName, address1, city, region, postalCode, phoneCountry, accountSid, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phoneCountry: ").append(toIndentedString(phoneCountry)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
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

