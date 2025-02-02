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

/**
 * Options for exporting user data
 */
@ApiModel(description = "Options for exporting user data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class ExportOptions {
  /**
   * Gets or Sets outputFormat
   */
  @JsonAdapter(OutputFormatEnum.Adapter.class)
  public enum OutputFormatEnum {
    DEFAULT("CSV_DEFAULT"),
    
    EXCEL("CSV_EXCEL");

    private String value;

    OutputFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputFormatEnum fromValue(String value) {
      for (OutputFormatEnum b : OutputFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutputFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutputFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "outputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  private OutputFormatEnum outputFormat;

  public static final String SERIALIZED_NAME_EXCLUDE_PREVIOUSLY_EXPORTED = "excludePreviouslyExported";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PREVIOUSLY_EXPORTED)
  private Boolean excludePreviouslyExported;

  public static final String SERIALIZED_NAME_CREATED_EARLIEST_TIME = "createdEarliestTime";
  @SerializedName(SERIALIZED_NAME_CREATED_EARLIEST_TIME)
  private OffsetDateTime createdEarliestTime;

  public static final String SERIALIZED_NAME_CREATED_OLDEST_TIME = "createdOldestTime";
  @SerializedName(SERIALIZED_NAME_CREATED_OLDEST_TIME)
  private OffsetDateTime createdOldestTime;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_LIST_SEPARATOR_TOKEN = "listSeparatorToken";
  @SerializedName(SERIALIZED_NAME_LIST_SEPARATOR_TOKEN)
  private String listSeparatorToken;


  public ExportOptions outputFormat(OutputFormatEnum outputFormat) {
    
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * Get outputFormat
   * @return outputFormat
  **/
  @ApiModelProperty(required = true, value = "")

  public OutputFormatEnum getOutputFormat() {
    return outputFormat;
  }


  public void setOutputFormat(OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
  }


  public ExportOptions excludePreviouslyExported(Boolean excludePreviouslyExported) {
    
    this.excludePreviouslyExported = excludePreviouslyExported;
    return this;
  }

   /**
   * Get excludePreviouslyExported
   * @return excludePreviouslyExported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExcludePreviouslyExported() {
    return excludePreviouslyExported;
  }


  public void setExcludePreviouslyExported(Boolean excludePreviouslyExported) {
    this.excludePreviouslyExported = excludePreviouslyExported;
  }


  public ExportOptions createdEarliestTime(OffsetDateTime createdEarliestTime) {
    
    this.createdEarliestTime = createdEarliestTime;
    return this;
  }

   /**
   * Get createdEarliestTime
   * @return createdEarliestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedEarliestTime() {
    return createdEarliestTime;
  }


  public void setCreatedEarliestTime(OffsetDateTime createdEarliestTime) {
    this.createdEarliestTime = createdEarliestTime;
  }


  public ExportOptions createdOldestTime(OffsetDateTime createdOldestTime) {
    
    this.createdOldestTime = createdOldestTime;
    return this;
  }

   /**
   * Get createdOldestTime
   * @return createdOldestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedOldestTime() {
    return createdOldestTime;
  }


  public void setCreatedOldestTime(OffsetDateTime createdOldestTime) {
    this.createdOldestTime = createdOldestTime;
  }


  public ExportOptions filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public ExportOptions listSeparatorToken(String listSeparatorToken) {
    
    this.listSeparatorToken = listSeparatorToken;
    return this;
  }

   /**
   * Get listSeparatorToken
   * @return listSeparatorToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListSeparatorToken() {
    return listSeparatorToken;
  }


  public void setListSeparatorToken(String listSeparatorToken) {
    this.listSeparatorToken = listSeparatorToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportOptions exportOptions = (ExportOptions) o;
    return Objects.equals(this.outputFormat, exportOptions.outputFormat) &&
        Objects.equals(this.excludePreviouslyExported, exportOptions.excludePreviouslyExported) &&
        Objects.equals(this.createdEarliestTime, exportOptions.createdEarliestTime) &&
        Objects.equals(this.createdOldestTime, exportOptions.createdOldestTime) &&
        Objects.equals(this.filter, exportOptions.filter) &&
        Objects.equals(this.listSeparatorToken, exportOptions.listSeparatorToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputFormat, excludePreviouslyExported, createdEarliestTime, createdOldestTime, filter, listSeparatorToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOptions {\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    excludePreviouslyExported: ").append(toIndentedString(excludePreviouslyExported)).append("\n");
    sb.append("    createdEarliestTime: ").append(toIndentedString(createdEarliestTime)).append("\n");
    sb.append("    createdOldestTime: ").append(toIndentedString(createdOldestTime)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    listSeparatorToken: ").append(toIndentedString(listSeparatorToken)).append("\n");
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

