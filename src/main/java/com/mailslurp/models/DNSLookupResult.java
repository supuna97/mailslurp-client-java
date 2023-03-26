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
 * DNS lookup result. Includes record type, time to live, raw response, and name value for the name server response.
 */
@ApiModel(description = "DNS lookup result. Includes record type, time to live, raw response, and name value for the name server response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-26T23:53:40.482Z[GMT]")
public class DNSLookupResult {
  /**
   * Domain Name Server Record Types
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    A("A"),
    
    NS("NS"),
    
    MD("MD"),
    
    MF("MF"),
    
    CNAME("CNAME"),
    
    SOA("SOA"),
    
    MB("MB"),
    
    MG("MG"),
    
    MR("MR"),
    
    NULL("NULL"),
    
    WKS("WKS"),
    
    PTR("PTR"),
    
    HINFO("HINFO"),
    
    MINFO("MINFO"),
    
    MX("MX"),
    
    TXT("TXT"),
    
    RP("RP"),
    
    AFSDB("AFSDB"),
    
    X25("X25"),
    
    ISDN("ISDN"),
    
    RT("RT"),
    
    NSAP("NSAP"),
    
    NSAP_PTR("NSAP_PTR"),
    
    SIG("SIG"),
    
    KEY("KEY"),
    
    PX("PX"),
    
    GPOS("GPOS"),
    
    AAAA("AAAA"),
    
    LOC("LOC"),
    
    NXT("NXT"),
    
    EID("EID"),
    
    NIMLOC("NIMLOC"),
    
    SRV("SRV"),
    
    ATMA("ATMA"),
    
    NAPTR("NAPTR"),
    
    KX("KX"),
    
    CERT("CERT"),
    
    A6("A6"),
    
    DNAME("DNAME"),
    
    SINK("SINK"),
    
    OPT("OPT"),
    
    APL("APL"),
    
    DS("DS"),
    
    SSHFP("SSHFP"),
    
    IPSECKEY("IPSECKEY"),
    
    RRSIG("RRSIG"),
    
    NSEC("NSEC"),
    
    DNSKEY("DNSKEY"),
    
    DHCID("DHCID"),
    
    NSEC3("NSEC3"),
    
    NSEC3PARAM("NSEC3PARAM"),
    
    TLSA("TLSA"),
    
    SMIMEA("SMIMEA"),
    
    HIP("HIP"),
    
    NINFO("NINFO"),
    
    RKEY("RKEY"),
    
    TALINK("TALINK"),
    
    CDS("CDS"),
    
    CDNSKEY("CDNSKEY"),
    
    OPENPGPKEY("OPENPGPKEY"),
    
    CSYNC("CSYNC"),
    
    ZONEMD("ZONEMD"),
    
    SVCB("SVCB"),
    
    HTTPS("HTTPS"),
    
    SPF("SPF"),
    
    UINFO("UINFO"),
    
    UID("UID"),
    
    GID("GID"),
    
    UNSPEC("UNSPEC"),
    
    NID("NID"),
    
    L32("L32"),
    
    L64("L64"),
    
    LP("LP"),
    
    EUI48("EUI48"),
    
    EUI64("EUI64"),
    
    TKEY("TKEY"),
    
    TSIG("TSIG"),
    
    IXFR("IXFR"),
    
    AXFR("AXFR"),
    
    MAILB("MAILB"),
    
    MAILA("MAILA"),
    
    ANY("ANY"),
    
    URI("URI"),
    
    CAA("CAA"),
    
    AVC("AVC"),
    
    DOA("DOA"),
    
    AMTRELAY("AMTRELAY"),
    
    TA("TA"),
    
    DLV("DLV");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecordTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECORD_TYPE = "recordType";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private RecordTypeEnum recordType;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl;

  public static final String SERIALIZED_NAME_RECORD_ENTRIES = "recordEntries";
  @SerializedName(SERIALIZED_NAME_RECORD_ENTRIES)
  private List<String> recordEntries = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DNSLookupResult recordType(RecordTypeEnum recordType) {
    
    this.recordType = recordType;
    return this;
  }

   /**
   * Domain Name Server Record Types
   * @return recordType
  **/
  @ApiModelProperty(required = true, value = "Domain Name Server Record Types")

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public DNSLookupResult ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public DNSLookupResult recordEntries(List<String> recordEntries) {
    
    this.recordEntries = recordEntries;
    return this;
  }

  public DNSLookupResult addRecordEntriesItem(String recordEntriesItem) {
    this.recordEntries.add(recordEntriesItem);
    return this;
  }

   /**
   * Get recordEntries
   * @return recordEntries
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getRecordEntries() {
    return recordEntries;
  }


  public void setRecordEntries(List<String> recordEntries) {
    this.recordEntries = recordEntries;
  }


  public DNSLookupResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSLookupResult dnSLookupResult = (DNSLookupResult) o;
    return Objects.equals(this.recordType, dnSLookupResult.recordType) &&
        Objects.equals(this.ttl, dnSLookupResult.ttl) &&
        Objects.equals(this.recordEntries, dnSLookupResult.recordEntries) &&
        Objects.equals(this.name, dnSLookupResult.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, ttl, recordEntries, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSLookupResult {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    recordEntries: ").append(toIndentedString(recordEntries)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

