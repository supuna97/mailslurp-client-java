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


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.AttachmentMetaData;
import com.mailslurp.models.ContentMatchOptions;
import com.mailslurp.models.CountDto;
import com.mailslurp.models.DownloadAttachmentDto;
import com.mailslurp.models.Email;
import com.mailslurp.models.EmailContentMatchResult;
import com.mailslurp.models.EmailHtmlDto;
import com.mailslurp.models.EmailLinksResult;
import com.mailslurp.models.EmailPreview;
import com.mailslurp.models.EmailPreviewUrls;
import com.mailslurp.models.EmailTextLinesResult;
import com.mailslurp.models.ForwardEmailOptions;
import com.mailslurp.models.GravatarUrl;
import com.mailslurp.models.ImapFlagOperationOptions;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageEmailProjection;
import com.mailslurp.models.RawEmailJson;
import com.mailslurp.models.ReplyToEmailOptions;
import com.mailslurp.models.SendEmailOptions;
import com.mailslurp.models.SentEmailDto;
import java.util.UUID;
import com.mailslurp.models.UnreadCount;
import com.mailslurp.models.ValidationDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailControllerApi
 */
@Ignore
public class EmailControllerApiTest {

    private final EmailControllerApi api = new EmailControllerApi();

    
    /**
     * Set IMAP flags associated with a message. Only supports &#39;\\Seen&#39; flag.
     *
     * Apply RFC3501 section-2.3.2 IMAP flag operations on an email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applyImapFlagOperationTest() throws ApiException {
        UUID emailId = null;
        ImapFlagOperationOptions imapFlagOperationOptions = null;
        EmailPreview response = api.applyImapFlagOperation(emailId, imapFlagOperationOptions);

        // TODO: test validations
    }
    
    /**
     * Delete all emails in all inboxes.
     *
     * Deletes all emails in your account. Be careful as emails cannot be recovered
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllEmailsTest() throws ApiException {
        api.deleteAllEmails();

        // TODO: test validations
    }
    
    /**
     * Delete an email
     *
     * Deletes an email and removes it from the inbox. Deleted emails cannot be recovered.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailTest() throws ApiException {
        UUID emailId = null;
        api.deleteEmail(emailId);

        // TODO: test validations
    }
    
    /**
     * Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.
     *
     * Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAttachmentTest() throws ApiException {
        UUID emailId = null;
        String attachmentId = null;
        String apiKey = null;
        byte[] response = api.downloadAttachment(emailId, attachmentId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Get email attachment as base64 encoded string as an alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.
     *
     * Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAttachmentBase64Test() throws ApiException {
        UUID emailId = null;
        String attachmentId = null;
        DownloadAttachmentDto response = api.downloadAttachmentBase64(emailId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get email body as string. Returned as &#x60;plain/text&#x60; with content type header.
     *
     * Returns the specified email body for a given email as a string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadBodyTest() throws ApiException {
        UUID emailId = null;
        String response = api.downloadBody(emailId);

        // TODO: test validations
    }
    
    /**
     * Get email body in bytes. Returned as &#x60;octet-stream&#x60; with content type header.
     *
     * Returns the specified email body for a given email as a stream / array of bytes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadBodyBytesTest() throws ApiException {
        UUID emailId = null;
        byte[] response = api.downloadBodyBytes(emailId);

        // TODO: test validations
    }
    
    /**
     * Forward email to recipients
     *
     * Forward an existing email to new recipients. The sender of the email will be the inbox that received the email you are forwarding. You can override the sender with the &#x60;from&#x60; option. Note you must have access to the from address in MailSlurp to use the override. For more control consider fetching the email and sending it a new using the send email endpoints.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forwardEmailTest() throws ApiException {
        UUID emailId = null;
        ForwardEmailOptions forwardEmailOptions = null;
        SentEmailDto response = api.forwardEmail(emailId, forwardEmailOptions);

        // TODO: test validations
    }
    
    /**
     * Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.
     *
     * Returns the metadata such as name and content-type for a given attachment and email.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentMetaDataTest() throws ApiException {
        UUID emailId = null;
        String attachmentId = null;
        AttachmentMetaData response = api.getAttachmentMetaData(emailId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get email content including headers and body. Expects email to exist by ID. For emails that may not have arrived yet use the WaitForController.
     *
     * Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawEmail endpoints
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailTest() throws ApiException {
        UUID emailId = null;
        Boolean decode = null;
        Email response = api.getEmail(emailId, decode);

        // TODO: test validations
    }
    
    /**
     * Get all email attachment metadata. Metadata includes name and size of attachments.
     *
     * Returns an array of attachment metadata such as name and content-type for a given email if present.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailAttachmentsTest() throws ApiException {
        UUID emailId = null;
        List<AttachmentMetaData> response = api.getEmailAttachments(emailId);

        // TODO: test validations
    }
    
    /**
     * Get email content regex pattern match results. Runs regex against email body and returns match groups.
     *
     * Return the matches for a given Java style regex pattern. Do not include the typical &#x60;/&#x60; at start or end of regex in some languages. Given an example &#x60;your code is: 12345&#x60; the pattern to extract match looks like &#x60;code is: (\\d{6})&#x60;. This will return an array of matches with the first matching the entire pattern and the subsequent matching the groups: &#x60;[&#39;code is: 123456&#39;, &#39;123456&#39;]&#x60; See https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html for more information of available patterns. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailContentMatchTest() throws ApiException {
        UUID emailId = null;
        ContentMatchOptions contentMatchOptions = null;
        EmailContentMatchResult response = api.getEmailContentMatch(emailId, contentMatchOptions);

        // TODO: test validations
    }
    
    /**
     * Get email count
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailCountTest() throws ApiException {
        CountDto response = api.getEmailCount();

        // TODO: test validations
    }
    
    /**
     * Get email content as HTML. For displaying emails in browser context.
     *
     * Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: &#x60;?apiKey&#x3D;xxx&#x60;. Returns content-type &#x60;text/html;charset&#x3D;utf-8&#x60; so you must call expecting that content response not JSON. For JSON response see the &#x60;getEmailHTMLJson&#x60; method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailHTMLTest() throws ApiException {
        UUID emailId = null;
        Boolean decode = null;
        String response = api.getEmailHTML(emailId, decode);

        // TODO: test validations
    }
    
    /**
     * Get email content as HTML in JSON wrapper. For fetching entity decoded HTML content
     *
     * Retrieve email content as HTML response. Decodes quoted-printable entities and converts charset to UTF-8. Returns content-type &#x60;application/json;charset&#x3D;utf-8&#x60; so you must call expecting that content response not JSON.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailHTMLJsonTest() throws ApiException {
        UUID emailId = null;
        Boolean decode = null;
        EmailHtmlDto response = api.getEmailHTMLJson(emailId, decode);

        // TODO: test validations
    }
    
    /**
     * Parse and return text from an email, stripping HTML and decoding encoded characters
     *
     * Parse an email body and return the content as an array of text. HTML parsing uses JSoup which supports JQuery/CSS style selectors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailHTMLQueryTest() throws ApiException {
        UUID emailId = null;
        String htmlSelector = null;
        EmailTextLinesResult response = api.getEmailHTMLQuery(emailId, htmlSelector);

        // TODO: test validations
    }
    
    /**
     * Parse and return list of links found in an email (only works for HTML content)
     *
     * HTML parsing uses JSoup and UNIX line separators. Searches content for href attributes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailLinksTest() throws ApiException {
        UUID emailId = null;
        EmailLinksResult response = api.getEmailLinks(emailId);

        // TODO: test validations
    }
    
    /**
     * Get email URLs for viewing in browser or downloading
     *
     * Get a list of URLs for email content as text/html or raw SMTP message for viewing the message in a browser.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailPreviewURLsTest() throws ApiException {
        UUID emailId = null;
        EmailPreviewUrls response = api.getEmailPreviewURLs(emailId);

        // TODO: test validations
    }
    
    /**
     * Parse and return text from an email, stripping HTML and decoding encoded characters
     *
     * Parse an email body and return the content as an array of strings. HTML parsing uses JSoup and UNIX line separators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailTextLinesTest() throws ApiException {
        UUID emailId = null;
        Boolean decodeHtmlEntities = null;
        String lineSeparator = null;
        EmailTextLinesResult response = api.getEmailTextLines(emailId, decodeHtmlEntities, lineSeparator);

        // TODO: test validations
    }
    
    /**
     * Get all emails in all inboxes in paginated form. Email API list all.
     *
     * By default returns all emails across all inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsPaginatedTest() throws ApiException {
        List<UUID> inboxId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        Boolean unreadOnly = null;
        String searchFilter = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageEmailProjection response = api.getEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get gravatar url for email address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGravatarUrlForEmailAddressTest() throws ApiException {
        String emailAddress = null;
        String size = null;
        GravatarUrl response = api.getGravatarUrlForEmailAddress(emailAddress, size);

        // TODO: test validations
    }
    
    /**
     * Get latest email in all inboxes. Most recently received.
     *
     * Get the newest email in all inboxes or in a passed set of inbox IDs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestEmailTest() throws ApiException {
        List<UUID> inboxIds = null;
        Email response = api.getLatestEmail(inboxIds);

        // TODO: test validations
    }
    
    /**
     * Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.
     *
     * Get the newest email in all inboxes or in a passed set of inbox IDs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestEmailInInbox1Test() throws ApiException {
        UUID inboxId = null;
        Email response = api.getLatestEmailInInbox1(inboxId);

        // TODO: test validations
    }
    
    /**
     * Get all organization emails. List team or shared test email accounts
     *
     * By default returns all emails across all team inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationEmailsPaginatedTest() throws ApiException {
        List<UUID> inboxId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        Boolean unreadOnly = null;
        String searchFilter = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageEmailProjection response = api.getOrganizationEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before);

        // TODO: test validations
    }
    
    /**
     * Get raw email string. Returns unparsed raw SMTP message with headers and body.
     *
     * Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawEmailContentsTest() throws ApiException {
        UUID emailId = null;
        String response = api.getRawEmailContents(emailId);

        // TODO: test validations
    }
    
    /**
     * Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.
     *
     * Returns a raw, unparsed, and unprocessed email wrapped in a JSON response object for easier handling when compared with the getRawEmail text/plain response
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRawEmailJsonTest() throws ApiException {
        UUID emailId = null;
        RawEmailJson response = api.getRawEmailJson(emailId);

        // TODO: test validations
    }
    
    /**
     * Get unread email count
     *
     * Get number of emails unread. Unread means has not been viewed in dashboard or returned in an email API response
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnreadEmailCountTest() throws ApiException {
        UnreadCount response = api.getUnreadEmailCount();

        // TODO: test validations
    }
    
    /**
     * Mark an email as read on unread
     *
     * Marks an email as read or unread. Pass boolean read flag to set value. This is useful if you want to read an email but keep it as unread
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void markAsReadTest() throws ApiException {
        UUID emailId = null;
        Boolean read = null;
        EmailPreview response = api.markAsRead(emailId, read);

        // TODO: test validations
    }
    
    /**
     * Reply to an email
     *
     * Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails &#x60;to&#x60;, &#x60;cc&#x60;, and &#x60;bcc&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replyToEmailTest() throws ApiException {
        UUID emailId = null;
        ReplyToEmailOptions replyToEmailOptions = null;
        SentEmailDto response = api.replyToEmail(emailId, replyToEmailOptions);

        // TODO: test validations
    }
    
    /**
     * Send email
     *
     * Alias for &#x60;InboxController.sendEmail&#x60; method - see original method for full details. Sends an email from a given inbox that you have created. If no inbox is supplied a random inbox will be created for you and used to send the email.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendEmailSourceOptionalTest() throws ApiException {
        SendEmailOptions sendEmailOptions = null;
        UUID inboxId = null;
        Boolean useDomainPool = null;
        Boolean virtualSend = null;
        api.sendEmailSourceOptional(sendEmailOptions, inboxId, useDomainPool, virtualSend);

        // TODO: test validations
    }
    
    /**
     * Validate email HTML contents
     *
     * Validate the HTML content of email if HTML is found. Considered valid if no HTML is present.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateEmailTest() throws ApiException {
        UUID emailId = null;
        ValidationDto response = api.validateEmail(emailId);

        // TODO: test validations
    }
    
}
