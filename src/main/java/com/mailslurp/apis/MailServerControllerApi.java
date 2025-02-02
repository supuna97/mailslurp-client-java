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


import com.mailslurp.models.DNSLookupOptions;
import com.mailslurp.models.DNSLookupResults;
import com.mailslurp.models.DescribeDomainOptions;
import com.mailslurp.models.DescribeMailServerDomainResult;
import com.mailslurp.models.EmailVerificationResult;
import com.mailslurp.models.IPAddressResult;
import com.mailslurp.models.VerifyEmailAddressOptions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailServerControllerApi {
    private ApiClient localVarApiClient;

    public MailServerControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MailServerControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for describeMailServerDomain
     * @param describeDomainOptions  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call describeMailServerDomainCall(DescribeDomainOptions describeDomainOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = describeDomainOptions;

        // create path and map variables
        String localVarPath = "/mail-server/describe/domain";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call describeMailServerDomainValidateBeforeCall(DescribeDomainOptions describeDomainOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'describeDomainOptions' is set
        if (describeDomainOptions == null) {
            throw new ApiException("Missing the required parameter 'describeDomainOptions' when calling describeMailServerDomain(Async)");
        }
        

        okhttp3.Call localVarCall = describeMailServerDomainCall(describeDomainOptions, _callback);
        return localVarCall;

    }

    /**
     * Get DNS Mail Server records for a domain
     * 
     * @param describeDomainOptions  (required)
     * @return DescribeMailServerDomainResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DescribeMailServerDomainResult describeMailServerDomain(DescribeDomainOptions describeDomainOptions) throws ApiException {
        ApiResponse<DescribeMailServerDomainResult> localVarResp = describeMailServerDomainWithHttpInfo(describeDomainOptions);
        return localVarResp.getData();
    }

    /**
     * Get DNS Mail Server records for a domain
     * 
     * @param describeDomainOptions  (required)
     * @return ApiResponse&lt;DescribeMailServerDomainResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DescribeMailServerDomainResult> describeMailServerDomainWithHttpInfo(DescribeDomainOptions describeDomainOptions) throws ApiException {
        okhttp3.Call localVarCall = describeMailServerDomainValidateBeforeCall(describeDomainOptions, null);
        Type localVarReturnType = new TypeToken<DescribeMailServerDomainResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get DNS Mail Server records for a domain (asynchronously)
     * 
     * @param describeDomainOptions  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call describeMailServerDomainAsync(DescribeDomainOptions describeDomainOptions, final ApiCallback<DescribeMailServerDomainResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = describeMailServerDomainValidateBeforeCall(describeDomainOptions, _callback);
        Type localVarReturnType = new TypeToken<DescribeMailServerDomainResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDnsLookup
     * @param dnSLookupOptions  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDnsLookupCall(DNSLookupOptions dnSLookupOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = dnSLookupOptions;

        // create path and map variables
        String localVarPath = "/mail-server/describe/dns-lookup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call getDnsLookupValidateBeforeCall(DNSLookupOptions dnSLookupOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dnSLookupOptions' is set
        if (dnSLookupOptions == null) {
            throw new ApiException("Missing the required parameter 'dnSLookupOptions' when calling getDnsLookup(Async)");
        }
        

        okhttp3.Call localVarCall = getDnsLookupCall(dnSLookupOptions, _callback);
        return localVarCall;

    }

    /**
     * Lookup DNS records for a domain
     * 
     * @param dnSLookupOptions  (required)
     * @return DNSLookupResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DNSLookupResults getDnsLookup(DNSLookupOptions dnSLookupOptions) throws ApiException {
        ApiResponse<DNSLookupResults> localVarResp = getDnsLookupWithHttpInfo(dnSLookupOptions);
        return localVarResp.getData();
    }

    /**
     * Lookup DNS records for a domain
     * 
     * @param dnSLookupOptions  (required)
     * @return ApiResponse&lt;DNSLookupResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DNSLookupResults> getDnsLookupWithHttpInfo(DNSLookupOptions dnSLookupOptions) throws ApiException {
        okhttp3.Call localVarCall = getDnsLookupValidateBeforeCall(dnSLookupOptions, null);
        Type localVarReturnType = new TypeToken<DNSLookupResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lookup DNS records for a domain (asynchronously)
     * 
     * @param dnSLookupOptions  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDnsLookupAsync(DNSLookupOptions dnSLookupOptions, final ApiCallback<DNSLookupResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDnsLookupValidateBeforeCall(dnSLookupOptions, _callback);
        Type localVarReturnType = new TypeToken<DNSLookupResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIpAddress
     * @param name  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIpAddressCall(String name, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/mail-server/describe/ip-address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
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
    private okhttp3.Call getIpAddressValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getIpAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getIpAddressCall(name, _callback);
        return localVarCall;

    }

    /**
     * Get IP address for a domain
     * 
     * @param name  (required)
     * @return IPAddressResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public IPAddressResult getIpAddress(String name) throws ApiException {
        ApiResponse<IPAddressResult> localVarResp = getIpAddressWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Get IP address for a domain
     * 
     * @param name  (required)
     * @return ApiResponse&lt;IPAddressResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IPAddressResult> getIpAddressWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = getIpAddressValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<IPAddressResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get IP address for a domain (asynchronously)
     * 
     * @param name  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIpAddressAsync(String name, final ApiCallback<IPAddressResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIpAddressValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<IPAddressResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verifyEmailAddress
     * @param verifyEmailAddressOptions  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call verifyEmailAddressCall(VerifyEmailAddressOptions verifyEmailAddressOptions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = verifyEmailAddressOptions;

        // create path and map variables
        String localVarPath = "/mail-server/verify/email-address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call verifyEmailAddressValidateBeforeCall(VerifyEmailAddressOptions verifyEmailAddressOptions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'verifyEmailAddressOptions' is set
        if (verifyEmailAddressOptions == null) {
            throw new ApiException("Missing the required parameter 'verifyEmailAddressOptions' when calling verifyEmailAddress(Async)");
        }
        

        okhttp3.Call localVarCall = verifyEmailAddressCall(verifyEmailAddressOptions, _callback);
        return localVarCall;

    }

    /**
     * Deprecated. Use the EmailVerificationController methods for more accurate and reliable functionality. Verify the existence of an email address at a given mail server.
     * 
     * @param verifyEmailAddressOptions  (required)
     * @return EmailVerificationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public EmailVerificationResult verifyEmailAddress(VerifyEmailAddressOptions verifyEmailAddressOptions) throws ApiException {
        ApiResponse<EmailVerificationResult> localVarResp = verifyEmailAddressWithHttpInfo(verifyEmailAddressOptions);
        return localVarResp.getData();
    }

    /**
     * Deprecated. Use the EmailVerificationController methods for more accurate and reliable functionality. Verify the existence of an email address at a given mail server.
     * 
     * @param verifyEmailAddressOptions  (required)
     * @return ApiResponse&lt;EmailVerificationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<EmailVerificationResult> verifyEmailAddressWithHttpInfo(VerifyEmailAddressOptions verifyEmailAddressOptions) throws ApiException {
        okhttp3.Call localVarCall = verifyEmailAddressValidateBeforeCall(verifyEmailAddressOptions, null);
        Type localVarReturnType = new TypeToken<EmailVerificationResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deprecated. Use the EmailVerificationController methods for more accurate and reliable functionality. Verify the existence of an email address at a given mail server. (asynchronously)
     * 
     * @param verifyEmailAddressOptions  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call verifyEmailAddressAsync(VerifyEmailAddressOptions verifyEmailAddressOptions, final ApiCallback<EmailVerificationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyEmailAddressValidateBeforeCall(verifyEmailAddressOptions, _callback);
        Type localVarReturnType = new TypeToken<EmailVerificationResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
