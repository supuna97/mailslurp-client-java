

# WebhookProjection

Representation of a webhook
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  | 
**url** | **String** |  | 
**inboxId** | [**UUID**](UUID) |  |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**phoneNumberId** | [**UUID**](UUID) |  |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;
DELIVERY_STATUS | &quot;DELIVERY_STATUS&quot;
BOUNCE | &quot;BOUNCE&quot;
BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot;
NEW_SMS | &quot;NEW_SMS&quot;



