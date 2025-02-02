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
import com.mailslurp.models.UserInfoDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserControllerApi
 */
@Ignore
public class UserControllerApiTest {

    private final UserControllerApi api = new UserControllerApi();

    
    /**
     * 
     *
     * Utility function to extract properties from JSON objects in language where this is cumbersome.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonPropertyAsStringTest() throws ApiException {
        String property = null;
        Object body = null;
        String response = api.getJsonPropertyAsString(property, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get account information for your user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserInfoTest() throws ApiException {
        UserInfoDto response = api.getUserInfo();

        // TODO: test validations
    }
    
}
