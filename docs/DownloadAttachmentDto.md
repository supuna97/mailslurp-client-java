

# DownloadAttachmentDto

Content of attachment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64FileContents** | **String** | Base64 encoded string of attachment bytes. Decode the base64 encoded string to get the raw contents. If the file has a content type such as &#x60;text/html&#x60; you can read the contents directly by converting it to string using &#x60;utf-8&#x60; encoding. | 
**contentType** | **String** | Content type of attachment. Examples are &#x60;image/png&#x60;, &#x60;application/msword&#x60;, &#x60;text/csv&#x60; etc. | 
**sizeBytes** | **Long** | Size in bytes of attachment content | 



