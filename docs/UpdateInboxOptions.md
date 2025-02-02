

# UpdateInboxOptions

Options for updating inbox properties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the inbox and used as the sender name when sending emails .Displayed in the dashboard for easier search |  [optional]
**description** | **String** | Description of an inbox for labelling and searching purposes |  [optional]
**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime) | Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won&#39;t be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email. |  [optional]
**favourite** | **Boolean** | Is the inbox a favorite inbox. Make an inbox a favorite is typically done in the dashboard for quick access or filtering |  [optional]



