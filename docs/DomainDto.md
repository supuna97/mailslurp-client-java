

# DomainDto

Domain plus verification records and status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**userId** | [**UUID**](UUID) |  | 
**domain** | **String** | Custom domain name | 
**verificationToken** | **String** | Verification tokens | 
**dkimTokens** | **List&lt;String&gt;** | Unique token DKIM tokens | 
**isVerified** | **Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. | 
**domainNameRecords** | [**List&lt;DomainNameRecord&gt;**](DomainNameRecord) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. | 
**catchAllInboxId** | [**UUID**](UUID) | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. | 



## Enum: DomainTypeEnum

Name | Value
---- | -----
HTTP_INBOX | &quot;HTTP_INBOX&quot;
SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot;



