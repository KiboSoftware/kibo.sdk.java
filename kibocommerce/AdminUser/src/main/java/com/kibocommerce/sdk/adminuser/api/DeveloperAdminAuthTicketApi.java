/*
 * Kibo Admin User Service
 * OpenAPI Spec for Kibo Admin User Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.adminuser.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.adminuser.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.adminuser.models.DeveloperAdminUserAuthTicket;
import com.kibocommerce.sdk.adminuser.models.UserAuthInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DeveloperAdminAuthTicketApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public DeveloperAdminAuthTicketApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeveloperAdminAuthTicketApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public DeveloperAdminAuthTicketApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public DeveloperAdminAuthTicketApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public DeveloperAdminAuthTicketApi(Builder builder) {
        this.localCustomBaseUrl = builder.configuration.getServerForTemplate(localServerBaseTemplate);
        this.localVarApiClient = builder.configuration.getClient();
        this.localHeaders = builder.configuration.getHeaders();
    }
    public ApiClient getApiClient() {
        return localVarApiClient;
    }
    public Map<String, String> getHeaders(){
        return localHeaders;
    }
    public void setHeaders(Map<String, String> headers){
        this.localHeaders = headers;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createDeveloperUserAuthTicket
     * @param developerAccountId The users developer account Id (optional)
     * @param userAuthInfo User&#39;s email address and password. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDeveloperUserAuthTicketCall(Integer developerAccountId, UserAuthInfo userAuthInfo, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = userAuthInfo;

        // create path and map variables
        String localVarPath = "/platform/developer/authtickets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (developerAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developerAccountId", developerAccountId));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createDeveloperUserAuthTicketValidateBeforeCall(Integer developerAccountId, UserAuthInfo userAuthInfo, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createDeveloperUserAuthTicketCall(developerAccountId, userAuthInfo, _callback);
        return localVarCall;

    }

    /**
     * Create Developer User Auth Ticket
     * Authenticates a user for a particular tenant given a set of user credentials adn a tenantId.
     * @param developerAccountId The users developer account Id (optional)
     * @param userAuthInfo User&#39;s email address and password. (optional)
     * @return DeveloperAdminUserAuthTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(Integer developerAccountId, UserAuthInfo userAuthInfo) throws ApiException {
        ApiResponse<DeveloperAdminUserAuthTicket> localVarResp = createDeveloperUserAuthTicketWithHttpInfo(developerAccountId, userAuthInfo);
        return localVarResp.getData();
    }

    /**
     * Create Developer User Auth Ticket
     * Authenticates a user for a particular tenant given a set of user credentials adn a tenantId.
     * @param developerAccountId The users developer account Id (optional)
     * @param userAuthInfo User&#39;s email address and password. (optional)
     * @return ApiResponse&lt;DeveloperAdminUserAuthTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeveloperAdminUserAuthTicket> createDeveloperUserAuthTicketWithHttpInfo(Integer developerAccountId, UserAuthInfo userAuthInfo) throws ApiException {
        okhttp3.Call localVarCall = createDeveloperUserAuthTicketValidateBeforeCall(developerAccountId, userAuthInfo, null);
        Type localVarReturnType = new TypeToken<DeveloperAdminUserAuthTicket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Developer User Auth Ticket (asynchronously)
     * Authenticates a user for a particular tenant given a set of user credentials adn a tenantId.
     * @param developerAccountId The users developer account Id (optional)
     * @param userAuthInfo User&#39;s email address and password. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDeveloperUserAuthTicketAsync(Integer developerAccountId, UserAuthInfo userAuthInfo, final ApiCallback<DeveloperAdminUserAuthTicket> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDeveloperUserAuthTicketValidateBeforeCall(developerAccountId, userAuthInfo, _callback);
        Type localVarReturnType = new TypeToken<DeveloperAdminUserAuthTicket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserAuthTicket
     * @param refreshToken The refresh token to delete. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserAuthTicketCall(String refreshToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/developer/authtickets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (refreshToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("refreshToken", refreshToken));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserAuthTicketValidateBeforeCall(String refreshToken, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = deleteUserAuthTicketCall(refreshToken, _callback);
        return localVarCall;

    }

    /**
     * Delete User Auth Ticket
     * Logs out a user by deleting the refresh token
     * @param refreshToken The refresh token to delete. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deleteUserAuthTicket(String refreshToken) throws ApiException {
        deleteUserAuthTicketWithHttpInfo(refreshToken);
    }

    /**
     * Delete User Auth Ticket
     * Logs out a user by deleting the refresh token
     * @param refreshToken The refresh token to delete. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserAuthTicketWithHttpInfo(String refreshToken) throws ApiException {
        okhttp3.Call localVarCall = deleteUserAuthTicketValidateBeforeCall(refreshToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete User Auth Ticket (asynchronously)
     * Logs out a user by deleting the refresh token
     * @param refreshToken The refresh token to delete. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserAuthTicketAsync(String refreshToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserAuthTicketValidateBeforeCall(refreshToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for refreshDeveloperAuthTicket
     * @param developerAccountId The users developer account Id (optional)
     * @param developerAdminUserAuthTicket An existing valid auth ticket containing the refresh token. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call refreshDeveloperAuthTicketCall(Integer developerAccountId, DeveloperAdminUserAuthTicket developerAdminUserAuthTicket, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = developerAdminUserAuthTicket;

        // create path and map variables
        String localVarPath = "/platform/developer/authtickets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (developerAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developerAccountId", developerAccountId));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth", "clientOauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call refreshDeveloperAuthTicketValidateBeforeCall(Integer developerAccountId, DeveloperAdminUserAuthTicket developerAdminUserAuthTicket, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = refreshDeveloperAuthTicketCall(developerAccountId, developerAdminUserAuthTicket, _callback);
        return localVarCall;

    }

    /**
     * Refresh Developer Auth Ticket
     * Reauthenticates the current user for a different tenant. If the user does not have access to the tenant, the operation fails.
     * @param developerAccountId The users developer account Id (optional)
     * @param developerAdminUserAuthTicket An existing valid auth ticket containing the refresh token. (optional)
     * @return DeveloperAdminUserAuthTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(Integer developerAccountId, DeveloperAdminUserAuthTicket developerAdminUserAuthTicket) throws ApiException {
        ApiResponse<DeveloperAdminUserAuthTicket> localVarResp = refreshDeveloperAuthTicketWithHttpInfo(developerAccountId, developerAdminUserAuthTicket);
        return localVarResp.getData();
    }

    /**
     * Refresh Developer Auth Ticket
     * Reauthenticates the current user for a different tenant. If the user does not have access to the tenant, the operation fails.
     * @param developerAccountId The users developer account Id (optional)
     * @param developerAdminUserAuthTicket An existing valid auth ticket containing the refresh token. (optional)
     * @return ApiResponse&lt;DeveloperAdminUserAuthTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeveloperAdminUserAuthTicket> refreshDeveloperAuthTicketWithHttpInfo(Integer developerAccountId, DeveloperAdminUserAuthTicket developerAdminUserAuthTicket) throws ApiException {
        okhttp3.Call localVarCall = refreshDeveloperAuthTicketValidateBeforeCall(developerAccountId, developerAdminUserAuthTicket, null);
        Type localVarReturnType = new TypeToken<DeveloperAdminUserAuthTicket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Refresh Developer Auth Ticket (asynchronously)
     * Reauthenticates the current user for a different tenant. If the user does not have access to the tenant, the operation fails.
     * @param developerAccountId The users developer account Id (optional)
     * @param developerAdminUserAuthTicket An existing valid auth ticket containing the refresh token. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call refreshDeveloperAuthTicketAsync(Integer developerAccountId, DeveloperAdminUserAuthTicket developerAdminUserAuthTicket, final ApiCallback<DeveloperAdminUserAuthTicket> _callback) throws ApiException {

        okhttp3.Call localVarCall = refreshDeveloperAuthTicketValidateBeforeCall(developerAccountId, developerAdminUserAuthTicket, _callback);
        Type localVarReturnType = new TypeToken<DeveloperAdminUserAuthTicket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class Builder {
        private KiboConfiguration configuration;
        private Map<String, String> customHeaders;
        public Builder() {
        }
        public Builder withHeaders(Map<String, String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder withConfig(KiboConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public DeveloperAdminAuthTicketApi build() {
            return new DeveloperAdminAuthTicketApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}