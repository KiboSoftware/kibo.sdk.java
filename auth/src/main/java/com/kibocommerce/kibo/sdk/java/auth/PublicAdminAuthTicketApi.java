/*
 * Kibo Admin User Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.kibo.sdk.java.auth;

import com.kibocommerce.kibo.sdk.java.auth.ApiCallback;
import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
import com.kibocommerce.kibo.sdk.java.auth.ApiException;
import com.kibocommerce.kibo.sdk.java.auth.ApiResponse;
import com.kibocommerce.kibo.sdk.java.auth.Configuration;
import com.kibocommerce.kibo.sdk.java.auth.Pair;
import com.kibocommerce.kibo.sdk.java.auth.ProgressRequestBody;
import com.kibocommerce.kibo.sdk.java.auth.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.kibo.sdk.java.auth.model.TenantAdminUserAuthTicket;
import com.kibocommerce.kibo.sdk.java.auth.model.UserAuthInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicAdminAuthTicketApi {
    private ApiClient apiClient;

    public PublicAdminAuthTicketApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicAdminAuthTicketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUserAuthTicket
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param userAuthInfo  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUserAuthTicketCall(Integer xVolTenant, Integer tenantId, Integer xVolSite, UserAuthInfo userAuthInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = userAuthInfo;

        // create path and map variables
        String localVarPath = "/platform/adminuser/authtickets/tenants";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        if (xVolSite != null) {
            localVarHeaderParams.put("x-vol-site", apiClient.parameterToString(xVolSite));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "x-vol-app-claims", "x-vol-user-claims" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createUserAuthTicketValidateBeforeCall(Integer xVolTenant, Integer tenantId, Integer xVolSite, UserAuthInfo userAuthInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling createUserAuthTicket(Async)");
        }
        

        com.squareup.okhttp.Call call = createUserAuthTicketCall(xVolTenant, tenantId, xVolSite, userAuthInfo, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param userAuthInfo  (optional)
     * @return TenantAdminUserAuthTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TenantAdminUserAuthTicket createUserAuthTicket(Integer xVolTenant, Integer tenantId, Integer xVolSite, UserAuthInfo userAuthInfo) throws ApiException {
        ApiResponse<TenantAdminUserAuthTicket> resp = createUserAuthTicketWithHttpInfo(xVolTenant, tenantId, xVolSite, userAuthInfo);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param userAuthInfo  (optional)
     * @return ApiResponse&lt;TenantAdminUserAuthTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TenantAdminUserAuthTicket> createUserAuthTicketWithHttpInfo(Integer xVolTenant, Integer tenantId, Integer xVolSite, UserAuthInfo userAuthInfo) throws ApiException {
        com.squareup.okhttp.Call call = createUserAuthTicketValidateBeforeCall(xVolTenant, tenantId, xVolSite, userAuthInfo, null, null);
        Type localVarReturnType = new TypeToken<TenantAdminUserAuthTicket>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param userAuthInfo  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUserAuthTicketAsync(Integer xVolTenant, Integer tenantId, Integer xVolSite, UserAuthInfo userAuthInfo, final ApiCallback<TenantAdminUserAuthTicket> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createUserAuthTicketValidateBeforeCall(xVolTenant, tenantId, xVolSite, userAuthInfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TenantAdminUserAuthTicket>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUserAuthTicket
     * @param xVolTenant  (required)
     * @param refreshToken  (optional)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserAuthTicketCall(Integer xVolTenant, String refreshToken, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/platform/adminuser/authtickets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (refreshToken != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("refreshToken", refreshToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        if (xVolSite != null) {
            localVarHeaderParams.put("x-vol-site", apiClient.parameterToString(xVolSite));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "x-vol-app-claims", "x-vol-user-claims" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserAuthTicketValidateBeforeCall(Integer xVolTenant, String refreshToken, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deleteUserAuthTicket(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUserAuthTicketCall(xVolTenant, refreshToken, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param refreshToken  (optional)
     * @param xVolSite  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUserAuthTicket(Integer xVolTenant, String refreshToken, Integer xVolSite) throws ApiException {
        deleteUserAuthTicketWithHttpInfo(xVolTenant, refreshToken, xVolSite);
    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param refreshToken  (optional)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUserAuthTicketWithHttpInfo(Integer xVolTenant, String refreshToken, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserAuthTicketValidateBeforeCall(xVolTenant, refreshToken, xVolSite, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param refreshToken  (optional)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserAuthTicketAsync(Integer xVolTenant, String refreshToken, Integer xVolSite, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteUserAuthTicketValidateBeforeCall(xVolTenant, refreshToken, xVolSite, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for refreshAuthTicket
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param tenantAdminUserAuthTicket  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refreshAuthTicketCall(Integer xVolTenant, Integer tenantId, Integer xVolSite, TenantAdminUserAuthTicket tenantAdminUserAuthTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tenantAdminUserAuthTicket;

        // create path and map variables
        String localVarPath = "/platform/adminuser/authtickets/tenants";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        if (xVolSite != null) {
            localVarHeaderParams.put("x-vol-site", apiClient.parameterToString(xVolSite));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "x-vol-app-claims", "x-vol-user-claims" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refreshAuthTicketValidateBeforeCall(Integer xVolTenant, Integer tenantId, Integer xVolSite, TenantAdminUserAuthTicket tenantAdminUserAuthTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling refreshAuthTicket(Async)");
        }
        

        com.squareup.okhttp.Call call = refreshAuthTicketCall(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param tenantAdminUserAuthTicket  (optional)
     * @return TenantAdminUserAuthTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TenantAdminUserAuthTicket refreshAuthTicket(Integer xVolTenant, Integer tenantId, Integer xVolSite, TenantAdminUserAuthTicket tenantAdminUserAuthTicket) throws ApiException {
        ApiResponse<TenantAdminUserAuthTicket> resp = refreshAuthTicketWithHttpInfo(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param tenantAdminUserAuthTicket  (optional)
     * @return ApiResponse&lt;TenantAdminUserAuthTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TenantAdminUserAuthTicket> refreshAuthTicketWithHttpInfo(Integer xVolTenant, Integer tenantId, Integer xVolSite, TenantAdminUserAuthTicket tenantAdminUserAuthTicket) throws ApiException {
        com.squareup.okhttp.Call call = refreshAuthTicketValidateBeforeCall(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket, null, null);
        Type localVarReturnType = new TypeToken<TenantAdminUserAuthTicket>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param tenantId  (optional)
     * @param xVolSite  (optional)
     * @param tenantAdminUserAuthTicket  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refreshAuthTicketAsync(Integer xVolTenant, Integer tenantId, Integer xVolSite, TenantAdminUserAuthTicket tenantAdminUserAuthTicket, final ApiCallback<TenantAdminUserAuthTicket> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = refreshAuthTicketValidateBeforeCall(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TenantAdminUserAuthTicket>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
