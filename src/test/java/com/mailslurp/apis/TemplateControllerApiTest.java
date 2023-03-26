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
import com.mailslurp.models.CreateTemplateOptions;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageTemplateProjection;
import com.mailslurp.models.TemplateDto;
import com.mailslurp.models.TemplatePreview;
import com.mailslurp.models.TemplateProjection;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateControllerApi
 */
@Ignore
public class TemplateControllerApiTest {

    private final TemplateControllerApi api = new TemplateControllerApi();

    
    /**
     * Create a Template
     *
     * Create an email template with variables for use with templated transactional emails.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTemplateTest() throws ApiException {
        CreateTemplateOptions createTemplateOptions = null;
        TemplateDto response = api.createTemplate(createTemplateOptions);

        // TODO: test validations
    }
    
    /**
     * Delete email template
     *
     * Delete template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateTest() throws ApiException {
        UUID templateId = null;
        api.deleteTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * List templates
     *
     * Get all templates in paginated format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTemplatesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageTemplateProjection response = api.getAllTemplates(page, size, sort, since, before);

        // TODO: test validations
    }
    
    /**
     * Get template
     *
     * Get email template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateTest() throws ApiException {
        UUID templateId = null;
        TemplateDto response = api.getTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * Get template preview HTML
     *
     * Get email template preview with passed template variables in HTML format for browsers. Pass template variables as query params.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatePreviewHtmlTest() throws ApiException {
        UUID templateId = null;
        String response = api.getTemplatePreviewHtml(templateId);

        // TODO: test validations
    }
    
    /**
     * Get template preview Json
     *
     * Get email template preview with passed template variables in JSON format. Pass template variables as query params.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatePreviewJsonTest() throws ApiException {
        UUID templateId = null;
        TemplatePreview response = api.getTemplatePreviewJson(templateId);

        // TODO: test validations
    }
    
    /**
     * List templates
     *
     * Get all templates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesTest() throws ApiException {
        List<TemplateProjection> response = api.getTemplates();

        // TODO: test validations
    }
    
    /**
     * Update template
     *
     * Update email template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTemplateTest() throws ApiException {
        UUID templateId = null;
        CreateTemplateOptions createTemplateOptions = null;
        TemplateDto response = api.updateTemplate(templateId, createTemplateOptions);

        // TODO: test validations
    }
    
}
