/*
 * Kibo Location Admin Service
 * OpenAPI Spec for Kibo Location Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.locationadmin.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.locationadmin.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.locationadmin.models.LocationGroupCollection;
import com.kibocommerce.sdk.locationadmin.models.LocationLocationGroup;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LocationGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public LocationGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationGroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public LocationGroupApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public LocationGroupApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public LocationGroupApi(Builder builder) {
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
     * Build call for addLocationGroup
     * @param locationLocationGroup  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLocationGroupCall(LocationLocationGroup locationLocationGroup, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = locationLocationGroup;

        // create path and map variables
        String localVarPath = "/commerce/admin/locationGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call addLocationGroupValidateBeforeCall(LocationLocationGroup locationLocationGroup, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addLocationGroupCall(locationLocationGroup, _callback);
        return localVarCall;

    }

    /**
     * Add Location Group
     * Add a location group.
     * @param locationLocationGroup  (optional)
     * @return LocationLocationGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LocationLocationGroup addLocationGroup(LocationLocationGroup locationLocationGroup) throws ApiException {
        ApiResponse<LocationLocationGroup> localVarResp = addLocationGroupWithHttpInfo(locationLocationGroup);
        return localVarResp.getData();
    }

    /**
     * Add Location Group
     * Add a location group.
     * @param locationLocationGroup  (optional)
     * @return ApiResponse&lt;LocationLocationGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocationLocationGroup> addLocationGroupWithHttpInfo(LocationLocationGroup locationLocationGroup) throws ApiException {
        okhttp3.Call localVarCall = addLocationGroupValidateBeforeCall(locationLocationGroup, null);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Location Group (asynchronously)
     * Add a location group.
     * @param locationLocationGroup  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addLocationGroupAsync(LocationLocationGroup locationLocationGroup, final ApiCallback<LocationLocationGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = addLocationGroupValidateBeforeCall(locationLocationGroup, _callback);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteLocationGroup
     * @param locationGroupCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLocationGroupCall(String locationGroupCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/admin/locationGroups/{locationGroupCode}"
            .replaceAll("\\{" + "locationGroupCode" + "\\}", localVarApiClient.escapeString(locationGroupCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call deleteLocationGroupValidateBeforeCall(String locationGroupCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'locationGroupCode' is set
        if (locationGroupCode == null) {
            throw new ApiException("Missing the required parameter 'locationGroupCode' when calling deleteLocationGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deleteLocationGroupCall(locationGroupCode, _callback);
        return localVarCall;

    }

    /**
     * Delete Location Group
     * Deletes a location group specified by location group code.
     * @param locationGroupCode  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void deleteLocationGroup(String locationGroupCode) throws ApiException {
        deleteLocationGroupWithHttpInfo(locationGroupCode);
    }

    /**
     * Delete Location Group
     * Deletes a location group specified by location group code.
     * @param locationGroupCode  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteLocationGroupWithHttpInfo(String locationGroupCode) throws ApiException {
        okhttp3.Call localVarCall = deleteLocationGroupValidateBeforeCall(locationGroupCode, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Location Group (asynchronously)
     * Deletes a location group specified by location group code.
     * @param locationGroupCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteLocationGroupAsync(String locationGroupCode, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteLocationGroupValidateBeforeCall(locationGroupCode, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLocationGroup
     * @param locationGroupCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationGroupCall(String locationGroupCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/admin/locationGroups/{locationGroupCode}"
            .replaceAll("\\{" + "locationGroupCode" + "\\}", localVarApiClient.escapeString(locationGroupCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLocationGroupValidateBeforeCall(String locationGroupCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'locationGroupCode' is set
        if (locationGroupCode == null) {
            throw new ApiException("Missing the required parameter 'locationGroupCode' when calling getLocationGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getLocationGroupCall(locationGroupCode, _callback);
        return localVarCall;

    }

    /**
     * Get Location Group
     * Gets a location group by code.
     * @param locationGroupCode  (required)
     * @return LocationLocationGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LocationLocationGroup getLocationGroup(String locationGroupCode) throws ApiException {
        ApiResponse<LocationLocationGroup> localVarResp = getLocationGroupWithHttpInfo(locationGroupCode);
        return localVarResp.getData();
    }

    /**
     * Get Location Group
     * Gets a location group by code.
     * @param locationGroupCode  (required)
     * @return ApiResponse&lt;LocationLocationGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocationLocationGroup> getLocationGroupWithHttpInfo(String locationGroupCode) throws ApiException {
        okhttp3.Call localVarCall = getLocationGroupValidateBeforeCall(locationGroupCode, null);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Location Group (asynchronously)
     * Gets a location group by code.
     * @param locationGroupCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationGroupAsync(String locationGroupCode, final ApiCallback<LocationLocationGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLocationGroupValidateBeforeCall(locationGroupCode, _callback);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLocationGroups
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationGroupsCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/admin/locationGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startIndex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startIndex", startIndex));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/plain"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLocationGroupsValidateBeforeCall(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getLocationGroupsCall(startIndex, pageSize, sortBy, filter, _callback);
        return localVarCall;

    }

    /**
     * Get Location Groups
     * Gets a collection of location groups.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @return LocationGroupCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LocationGroupCollection getLocationGroups(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        ApiResponse<LocationGroupCollection> localVarResp = getLocationGroupsWithHttpInfo(startIndex, pageSize, sortBy, filter);
        return localVarResp.getData();
    }

    /**
     * Get Location Groups
     * Gets a collection of location groups.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @return ApiResponse&lt;LocationGroupCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocationGroupCollection> getLocationGroupsWithHttpInfo(Integer startIndex, Integer pageSize, String sortBy, String filter) throws ApiException {
        okhttp3.Call localVarCall = getLocationGroupsValidateBeforeCall(startIndex, pageSize, sortBy, filter, null);
        Type localVarReturnType = new TypeToken<LocationGroupCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Location Groups (asynchronously)
     * Gets a collection of location groups.
     * @param startIndex  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sortBy  (optional)
     * @param filter  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationGroupsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, final ApiCallback<LocationGroupCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLocationGroupsValidateBeforeCall(startIndex, pageSize, sortBy, filter, _callback);
        Type localVarReturnType = new TypeToken<LocationGroupCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateLocationGroup
     * @param locationGroupCode  (required)
     * @param locationLocationGroup  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocationGroupCall(String locationGroupCode, LocationLocationGroup locationLocationGroup, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = locationLocationGroup;

        // create path and map variables
        String localVarPath = "/commerce/admin/locationGroups/{locationGroupCode}"
            .replaceAll("\\{" + "locationGroupCode" + "\\}", localVarApiClient.escapeString(locationGroupCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>(localHeaders);
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call updateLocationGroupValidateBeforeCall(String locationGroupCode, LocationLocationGroup locationLocationGroup, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'locationGroupCode' is set
        if (locationGroupCode == null) {
            throw new ApiException("Missing the required parameter 'locationGroupCode' when calling updateLocationGroup(Async)");
        }
        

        okhttp3.Call localVarCall = updateLocationGroupCall(locationGroupCode, locationLocationGroup, _callback);
        return localVarCall;

    }

    /**
     * Update Location Group
     * Update an existing location group.
     * @param locationGroupCode  (required)
     * @param locationLocationGroup  (optional)
     * @return LocationLocationGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public LocationLocationGroup updateLocationGroup(String locationGroupCode, LocationLocationGroup locationLocationGroup) throws ApiException {
        ApiResponse<LocationLocationGroup> localVarResp = updateLocationGroupWithHttpInfo(locationGroupCode, locationLocationGroup);
        return localVarResp.getData();
    }

    /**
     * Update Location Group
     * Update an existing location group.
     * @param locationGroupCode  (required)
     * @param locationLocationGroup  (optional)
     * @return ApiResponse&lt;LocationLocationGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocationLocationGroup> updateLocationGroupWithHttpInfo(String locationGroupCode, LocationLocationGroup locationLocationGroup) throws ApiException {
        okhttp3.Call localVarCall = updateLocationGroupValidateBeforeCall(locationGroupCode, locationLocationGroup, null);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Location Group (asynchronously)
     * Update an existing location group.
     * @param locationGroupCode  (required)
     * @param locationLocationGroup  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateLocationGroupAsync(String locationGroupCode, LocationLocationGroup locationLocationGroup, final ApiCallback<LocationLocationGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLocationGroupValidateBeforeCall(locationGroupCode, locationLocationGroup, _callback);
        Type localVarReturnType = new TypeToken<LocationLocationGroup>(){}.getType();
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
        public LocationGroupApi build() {
            return new LocationGroupApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}