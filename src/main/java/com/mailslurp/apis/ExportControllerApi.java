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


import com.mailslurp.models.ExportLink;
import com.mailslurp.models.ExportOptions;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportControllerApi {
    private ApiClient localVarApiClient;

    public ExportControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExportControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for exportEntities
     * @param exportType  (required)
     * @param apiKey  (required)
     * @param outputFormat  (required)
     * @param filter  (optional)
     * @param listSeparatorToken  (optional)
     * @param excludePreviouslyExported  (optional)
     * @param createdEarliestTime  (optional)
     * @param createdOldestTime  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportEntitiesCall(String exportType, String apiKey, String outputFormat, String filter, String listSeparatorToken, Boolean excludePreviouslyExported, OffsetDateTime createdEarliestTime, OffsetDateTime createdOldestTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exportType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exportType", exportType));
        }

        if (apiKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apiKey", apiKey));
        }

        if (outputFormat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputFormat", outputFormat));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (listSeparatorToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("listSeparatorToken", listSeparatorToken));
        }

        if (excludePreviouslyExported != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("excludePreviouslyExported", excludePreviouslyExported));
        }

        if (createdEarliestTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdEarliestTime", createdEarliestTime));
        }

        if (createdOldestTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdOldestTime", createdOldestTime));
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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportEntitiesValidateBeforeCall(String exportType, String apiKey, String outputFormat, String filter, String listSeparatorToken, Boolean excludePreviouslyExported, OffsetDateTime createdEarliestTime, OffsetDateTime createdOldestTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'exportType' is set
        if (exportType == null) {
            throw new ApiException("Missing the required parameter 'exportType' when calling exportEntities(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling exportEntities(Async)");
        }
        
        // verify the required parameter 'outputFormat' is set
        if (outputFormat == null) {
            throw new ApiException("Missing the required parameter 'outputFormat' when calling exportEntities(Async)");
        }
        

        okhttp3.Call localVarCall = exportEntitiesCall(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime, _callback);
        return localVarCall;

    }

    /**
     * Export inboxes link callable via browser
     * 
     * @param exportType  (required)
     * @param apiKey  (required)
     * @param outputFormat  (required)
     * @param filter  (optional)
     * @param listSeparatorToken  (optional)
     * @param excludePreviouslyExported  (optional)
     * @param createdEarliestTime  (optional)
     * @param createdOldestTime  (optional)
     * @return List&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<byte[]> exportEntities(String exportType, String apiKey, String outputFormat, String filter, String listSeparatorToken, Boolean excludePreviouslyExported, OffsetDateTime createdEarliestTime, OffsetDateTime createdOldestTime) throws ApiException {
        ApiResponse<List<byte[]>> localVarResp = exportEntitiesWithHttpInfo(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime);
        return localVarResp.getData();
    }

    /**
     * Export inboxes link callable via browser
     * 
     * @param exportType  (required)
     * @param apiKey  (required)
     * @param outputFormat  (required)
     * @param filter  (optional)
     * @param listSeparatorToken  (optional)
     * @param excludePreviouslyExported  (optional)
     * @param createdEarliestTime  (optional)
     * @param createdOldestTime  (optional)
     * @return ApiResponse&lt;List&lt;byte[]&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<byte[]>> exportEntitiesWithHttpInfo(String exportType, String apiKey, String outputFormat, String filter, String listSeparatorToken, Boolean excludePreviouslyExported, OffsetDateTime createdEarliestTime, OffsetDateTime createdOldestTime) throws ApiException {
        okhttp3.Call localVarCall = exportEntitiesValidateBeforeCall(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime, null);
        Type localVarReturnType = new TypeToken<List<byte[]>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Export inboxes link callable via browser (asynchronously)
     * 
     * @param exportType  (required)
     * @param apiKey  (required)
     * @param outputFormat  (required)
     * @param filter  (optional)
     * @param listSeparatorToken  (optional)
     * @param excludePreviouslyExported  (optional)
     * @param createdEarliestTime  (optional)
     * @param createdOldestTime  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportEntitiesAsync(String exportType, String apiKey, String outputFormat, String filter, String listSeparatorToken, Boolean excludePreviouslyExported, OffsetDateTime createdEarliestTime, OffsetDateTime createdOldestTime, final ApiCallback<List<byte[]>> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportEntitiesValidateBeforeCall(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime, _callback);
        Type localVarReturnType = new TypeToken<List<byte[]>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExportLink
     * @param exportType  (required)
     * @param exportOptions  (required)
     * @param apiKey  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExportLinkCall(String exportType, ExportOptions exportOptions, String apiKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = exportOptions;

        // create path and map variables
        String localVarPath = "/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exportType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exportType", exportType));
        }

        if (apiKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apiKey", apiKey));
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExportLinkValidateBeforeCall(String exportType, ExportOptions exportOptions, String apiKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'exportType' is set
        if (exportType == null) {
            throw new ApiException("Missing the required parameter 'exportType' when calling getExportLink(Async)");
        }
        
        // verify the required parameter 'exportOptions' is set
        if (exportOptions == null) {
            throw new ApiException("Missing the required parameter 'exportOptions' when calling getExportLink(Async)");
        }
        

        okhttp3.Call localVarCall = getExportLinkCall(exportType, exportOptions, apiKey, _callback);
        return localVarCall;

    }

    /**
     * Get export link
     * 
     * @param exportType  (required)
     * @param exportOptions  (required)
     * @param apiKey  (optional)
     * @return ExportLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ExportLink getExportLink(String exportType, ExportOptions exportOptions, String apiKey) throws ApiException {
        ApiResponse<ExportLink> localVarResp = getExportLinkWithHttpInfo(exportType, exportOptions, apiKey);
        return localVarResp.getData();
    }

    /**
     * Get export link
     * 
     * @param exportType  (required)
     * @param exportOptions  (required)
     * @param apiKey  (optional)
     * @return ApiResponse&lt;ExportLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExportLink> getExportLinkWithHttpInfo(String exportType, ExportOptions exportOptions, String apiKey) throws ApiException {
        okhttp3.Call localVarCall = getExportLinkValidateBeforeCall(exportType, exportOptions, apiKey, null);
        Type localVarReturnType = new TypeToken<ExportLink>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get export link (asynchronously)
     * 
     * @param exportType  (required)
     * @param exportOptions  (required)
     * @param apiKey  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExportLinkAsync(String exportType, ExportOptions exportOptions, String apiKey, final ApiCallback<ExportLink> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExportLinkValidateBeforeCall(exportType, exportOptions, apiKey, _callback);
        Type localVarReturnType = new TypeToken<ExportLink>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
