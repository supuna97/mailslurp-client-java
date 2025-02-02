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

/**
 * Result of validating a list of email addresses
 */
@ApiModel(description = "Result of validating a list of email addresses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class ValidateEmailAddressListResult {
  public static final String SERIALIZED_NAME_VALID_EMAIL_ADDRESSES = "validEmailAddresses";
  @SerializedName(SERIALIZED_NAME_VALID_EMAIL_ADDRESSES)
  private List<String> validEmailAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVALID_EMAIL_ADDRESSES = "invalidEmailAddresses";
  @SerializedName(SERIALIZED_NAME_INVALID_EMAIL_ADDRESSES)
  private List<String> invalidEmailAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT_MAP_EMAIL_ADDRESS_IS_VALID = "resultMapEmailAddressIsValid";
  @SerializedName(SERIALIZED_NAME_RESULT_MAP_EMAIL_ADDRESS_IS_VALID)
  private Map<String, Boolean> resultMapEmailAddressIsValid = new HashMap<>();


  public ValidateEmailAddressListResult validEmailAddresses(List<String> validEmailAddresses) {
    
    this.validEmailAddresses = validEmailAddresses;
    return this;
  }

  public ValidateEmailAddressListResult addValidEmailAddressesItem(String validEmailAddressesItem) {
    this.validEmailAddresses.add(validEmailAddressesItem);
    return this;
  }

   /**
   * Get validEmailAddresses
   * @return validEmailAddresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getValidEmailAddresses() {
    return validEmailAddresses;
  }


  public void setValidEmailAddresses(List<String> validEmailAddresses) {
    this.validEmailAddresses = validEmailAddresses;
  }


  public ValidateEmailAddressListResult invalidEmailAddresses(List<String> invalidEmailAddresses) {
    
    this.invalidEmailAddresses = invalidEmailAddresses;
    return this;
  }

  public ValidateEmailAddressListResult addInvalidEmailAddressesItem(String invalidEmailAddressesItem) {
    this.invalidEmailAddresses.add(invalidEmailAddressesItem);
    return this;
  }

   /**
   * Get invalidEmailAddresses
   * @return invalidEmailAddresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getInvalidEmailAddresses() {
    return invalidEmailAddresses;
  }


  public void setInvalidEmailAddresses(List<String> invalidEmailAddresses) {
    this.invalidEmailAddresses = invalidEmailAddresses;
  }


  public ValidateEmailAddressListResult resultMapEmailAddressIsValid(Map<String, Boolean> resultMapEmailAddressIsValid) {
    
    this.resultMapEmailAddressIsValid = resultMapEmailAddressIsValid;
    return this;
  }

  public ValidateEmailAddressListResult putResultMapEmailAddressIsValidItem(String key, Boolean resultMapEmailAddressIsValidItem) {
    this.resultMapEmailAddressIsValid.put(key, resultMapEmailAddressIsValidItem);
    return this;
  }

   /**
   * Get resultMapEmailAddressIsValid
   * @return resultMapEmailAddressIsValid
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, Boolean> getResultMapEmailAddressIsValid() {
    return resultMapEmailAddressIsValid;
  }


  public void setResultMapEmailAddressIsValid(Map<String, Boolean> resultMapEmailAddressIsValid) {
    this.resultMapEmailAddressIsValid = resultMapEmailAddressIsValid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateEmailAddressListResult validateEmailAddressListResult = (ValidateEmailAddressListResult) o;
    return Objects.equals(this.validEmailAddresses, validateEmailAddressListResult.validEmailAddresses) &&
        Objects.equals(this.invalidEmailAddresses, validateEmailAddressListResult.invalidEmailAddresses) &&
        Objects.equals(this.resultMapEmailAddressIsValid, validateEmailAddressListResult.resultMapEmailAddressIsValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validEmailAddresses, invalidEmailAddresses, resultMapEmailAddressIsValid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateEmailAddressListResult {\n");
    sb.append("    validEmailAddresses: ").append(toIndentedString(validEmailAddresses)).append("\n");
    sb.append("    invalidEmailAddresses: ").append(toIndentedString(invalidEmailAddresses)).append("\n");
    sb.append("    resultMapEmailAddressIsValid: ").append(toIndentedString(resultMapEmailAddressIsValid)).append("\n");
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

