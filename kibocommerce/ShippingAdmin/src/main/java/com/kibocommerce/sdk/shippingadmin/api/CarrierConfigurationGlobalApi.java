/*
 * Kibo Shipping Admin Service
 * OpenAPI Spec for Kibo Shipping Admin Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingadmin.api;
import com.kibocommerce.sdk.common.*;

import com.kibocommerce.sdk.common.ApiCallback;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.ApiException;
import com.kibocommerce.sdk.common.ApiResponse;
import com.kibocommerce.sdk.common.Configuration;

import com.kibocommerce.sdk.common.Pair;
import com.kibocommerce.sdk.common.ProgressRequestBody;
import com.kibocommerce.sdk.common.ProgressResponseBody;

import com.kibocommerce.sdk.shippingadmin.ServerConfiguration;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.shippingadmin.models.ServiceType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CarrierConfigurationGlobalApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;
    private static String localServerBaseTemplate = ServerConfiguration.defaultServerTemplate;
    private Map<String, String> localHeaders = new HashMap<String, String>();

    public CarrierConfigurationGlobalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CarrierConfigurationGlobalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }
    public CarrierConfigurationGlobalApi(KiboConfiguration configuration) {
        this(configuration.getServerForTemplate(localServerBaseTemplate),
            configuration.getClient(),
            configuration.getHeaders()
        );
    }
    public CarrierConfigurationGlobalApi(String baseUrl, ApiClient apiClient, Map<String, String> headers) {
        this.localCustomBaseUrl = baseUrl;
        this.localVarApiClient = apiClient;
        this.localHeaders = headers;
    }
    public CarrierConfigurationGlobalApi(Builder builder) {
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
     * Build call for getAllServiceTypes
     * @param localeCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllServiceTypesCall(String localeCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/global/carriers/serviceTypes/{localeCode}"
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getAllServiceTypesValidateBeforeCall(String localeCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getAllServiceTypes(Async)");
        }
        

        okhttp3.Call localVarCall = getAllServiceTypesCall(localeCode, _callback);
        return localVarCall;

    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param localeCode  (required)
     * @return List&lt;ServiceType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<ServiceType> getAllServiceTypes(String localeCode) throws ApiException {
        ApiResponse<List<ServiceType>> localVarResp = getAllServiceTypesWithHttpInfo(localeCode);
        return localVarResp.getData();
    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param localeCode  (required)
     * @return ApiResponse&lt;List&lt;ServiceType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ServiceType>> getAllServiceTypesWithHttpInfo(String localeCode) throws ApiException {
        okhttp3.Call localVarCall = getAllServiceTypesValidateBeforeCall(localeCode, null);
        Type localVarReturnType = new TypeToken<List<ServiceType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers (asynchronously)
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param localeCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllServiceTypesAsync(String localeCode, final ApiCallback<List<ServiceType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllServiceTypesValidateBeforeCall(localeCode, _callback);
        Type localVarReturnType = new TypeToken<List<ServiceType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCarrierServiceTypes
     * @param carrierId  (required)
     * @param localeCode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierServiceTypesCall(String carrierId, String localeCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/commerce/shipping/global/carriers/{carrierId}/serviceTypes/{localeCode}"
            .replaceAll("\\{" + "carrierId" + "\\}", localVarApiClient.escapeString(carrierId.toString()))
            .replaceAll("\\{" + "localeCode" + "\\}", localVarApiClient.escapeString(localeCode.toString()));

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
    private okhttp3.Call getCarrierServiceTypesValidateBeforeCall(String carrierId, String localeCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'carrierId' is set
        if (carrierId == null) {
            throw new ApiException("Missing the required parameter 'carrierId' when calling getCarrierServiceTypes(Async)");
        }
        
        // verify the required parameter 'localeCode' is set
        if (localeCode == null) {
            throw new ApiException("Missing the required parameter 'localeCode' when calling getCarrierServiceTypes(Async)");
        }
        

        okhttp3.Call localVarCall = getCarrierServiceTypesCall(carrierId, localeCode, _callback);
        return localVarCall;

    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param carrierId  (required)
     * @param localeCode  (required)
     * @return List&lt;ServiceType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<ServiceType> getCarrierServiceTypes(String carrierId, String localeCode) throws ApiException {
        ApiResponse<List<ServiceType>> localVarResp = getCarrierServiceTypesWithHttpInfo(carrierId, localeCode);
        return localVarResp.getData();
    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param carrierId  (required)
     * @param localeCode  (required)
     * @return ApiResponse&lt;List&lt;ServiceType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ServiceType>> getCarrierServiceTypesWithHttpInfo(String carrierId, String localeCode) throws ApiException {
        okhttp3.Call localVarCall = getCarrierServiceTypesValidateBeforeCall(carrierId, localeCode, null);
        Type localVarReturnType = new TypeToken<List<ServiceType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Used for retrieving the available service types for the Mozu Default Application carriers (asynchronously)
     * Used for retrieving the available service types for the Mozu Default Application carriers
     * @param carrierId  (required)
     * @param localeCode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCarrierServiceTypesAsync(String carrierId, String localeCode, final ApiCallback<List<ServiceType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCarrierServiceTypesValidateBeforeCall(carrierId, localeCode, _callback);
        Type localVarReturnType = new TypeToken<List<ServiceType>>(){}.getType();
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
        public CarrierConfigurationGlobalApi build() {
            return new CarrierConfigurationGlobalApi(this);
        }
    }
    public static Builder builder() {

        return new Builder();
    }
}
