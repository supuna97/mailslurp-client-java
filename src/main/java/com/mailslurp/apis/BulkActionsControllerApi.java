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

import com.mailslurp.clients.ApiCallback;
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.ApiResponse;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.Pair;
import com.mailslurp.clients.ProgressRequestBody;
import com.mailslurp.clients.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mailslurp.models.BulkSendEmailOptions;
import com.mailslurp.models.InboxDto;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BulkActionsControllerApi {
    private ApiClient localVarApiClient;

    public BulkActionsControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BulkActionsControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for bulkCreateInboxes
     * @param count Number of inboxes to be created in bulk (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkCreateInboxesCall(Integer count, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bulk/inboxes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkCreateInboxesValidateBeforeCall(Integer count, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling bulkCreateInboxes(Async)");
        }
        

        okhttp3.Call localVarCall = bulkCreateInboxesCall(count, _callback);
        return localVarCall;

    }

    /**
     * Bulk create Inboxes (email addresses)
     * 
     * @param count Number of inboxes to be created in bulk (required)
     * @return List&lt;InboxDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public List<InboxDto> bulkCreateInboxes(Integer count) throws ApiException {
        ApiResponse<List<InboxDto>> localVarResp = bulkCreateInboxesWithHttpInfo(count);
        return localVarResp.getData();
    }

    /**
     * Bulk create Inboxes (email addresses)
     * 
     * @param count Number of inboxes to be created in bulk (required)
     * @return ApiResponse&lt;List&lt;InboxDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InboxDto>> bulkCreateInboxesWithHttpInfo(Integer count) throws ApiException {
        okhttp3.Call localVarCall = bulkCreateInboxesValidateBeforeCall(count, null);
        Type localVarReturnType = new TypeToken<List<InboxDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk create Inboxes (email addresses) (asynchronously)
     * 
     * @param count Number of inboxes to be created in bulk (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkCreateInboxesAsync(Integer count, final ApiCallback<List<InboxDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkCreateInboxesValidateBeforeCall(count, _callback);
        Type localVarReturnType = new TypeToken<List<InboxDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkDeleteInboxes
     * @param UUID  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDeleteInboxesCall(List<UUID> UUID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = UUID;

        // create path and map variables
        String localVarPath = "/bulk/inboxes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkDeleteInboxesValidateBeforeCall(List<UUID> UUID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'UUID' is set
        if (UUID == null) {
            throw new ApiException("Missing the required parameter 'UUID' when calling bulkDeleteInboxes(Async)");
        }
        

        okhttp3.Call localVarCall = bulkDeleteInboxesCall(UUID, _callback);
        return localVarCall;

    }

    /**
     * Bulk Delete Inboxes
     * 
     * @param UUID  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public void bulkDeleteInboxes(List<UUID> UUID) throws ApiException {
        bulkDeleteInboxesWithHttpInfo(UUID);
    }

    /**
     * Bulk Delete Inboxes
     * 
     * @param UUID  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> bulkDeleteInboxesWithHttpInfo(List<UUID> UUID) throws ApiException {
        okhttp3.Call localVarCall = bulkDeleteInboxesValidateBeforeCall(UUID, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Bulk Delete Inboxes (asynchronously)
     * 
     * @param UUID  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkDeleteInboxesAsync(List<UUID> UUID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkDeleteInboxesValidateBeforeCall(UUID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for bulkSendEmails
     * @param bulkSendEmailOptions  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkSendEmailsCall(BulkSendEmailOptions bulkSendEmailOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = bulkSendEmailOptions;

        // create path and map variables
        String localVarPath = "/bulk/send";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkSendEmailsValidateBeforeCall(BulkSendEmailOptions bulkSendEmailOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'bulkSendEmailOptions' is set
        if (bulkSendEmailOptions == null) {
            throw new ApiException("Missing the required parameter 'bulkSendEmailOptions' when calling bulkSendEmails(Async)");
        }
        

        okhttp3.Call localVarCall = bulkSendEmailsCall(bulkSendEmailOptions, _callback);
        return localVarCall;

    }

    /**
     * Bulk Send Emails
     * 
     * @param bulkSendEmailOptions  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public void bulkSendEmails(BulkSendEmailOptions bulkSendEmailOptions) throws ApiException {
        bulkSendEmailsWithHttpInfo(bulkSendEmailOptions);
    }

    /**
     * Bulk Send Emails
     * 
     * @param bulkSendEmailOptions  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> bulkSendEmailsWithHttpInfo(BulkSendEmailOptions bulkSendEmailOptions) throws ApiException {
        okhttp3.Call localVarCall = bulkSendEmailsValidateBeforeCall(bulkSendEmailOptions, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Bulk Send Emails (asynchronously)
     * 
     * @param bulkSendEmailOptions  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkSendEmailsAsync(BulkSendEmailOptions bulkSendEmailOptions, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkSendEmailsValidateBeforeCall(bulkSendEmailOptions, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
