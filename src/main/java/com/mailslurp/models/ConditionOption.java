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

/**
 * Options for matching emails in an inbox based on a condition such as &#x60;HAS_ATTACHMENTS&#x3D;TRUE&#x60;
 */
@ApiModel(description = "Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class ConditionOption {
  /**
   * Condition of an email object that can be used to filter results
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    HAS_ATTACHMENTS("HAS_ATTACHMENTS");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConditionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private ConditionEnum condition;

  /**
   * Expected condition value
   */
  @JsonAdapter(ValueEnum.Adapter.class)
  public enum ValueEnum {
    TRUE("TRUE"),
    
    FALSE("FALSE");

    private String value;

    ValueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private ValueEnum value;


  public ConditionOption condition(ConditionEnum condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Condition of an email object that can be used to filter results
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "Condition of an email object that can be used to filter results")

  public ConditionEnum getCondition() {
    return condition;
  }


  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  public ConditionOption value(ValueEnum value) {
    
    this.value = value;
    return this;
  }

   /**
   * Expected condition value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Expected condition value")

  public ValueEnum getValue() {
    return value;
  }


  public void setValue(ValueEnum value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionOption conditionOption = (ConditionOption) o;
    return Objects.equals(this.condition, conditionOption.condition) &&
        Objects.equals(this.value, conditionOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionOption {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

