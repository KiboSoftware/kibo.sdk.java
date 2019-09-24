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


import com.kibocommerce.kibo.sdk.java.auth.model.RoleCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicRoleApi {
    private ApiClient apiClient;

    public PublicRoleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicRoleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getRoles
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRolesCall(Integer xVolTenant, String filter, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/platform/adminuser/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRolesValidateBeforeCall(Integer xVolTenant, String filter, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getRoles(Async)");
        }
        

        com.squareup.okhttp.Call call = getRolesCall(xVolTenant, filter, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param xVolSite  (optional)
     * @return RoleCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RoleCollection getRoles(Integer xVolTenant, String filter, Integer xVolSite) throws ApiException {
        ApiResponse<RoleCollection> resp = getRolesWithHttpInfo(xVolTenant, filter, xVolSite);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;RoleCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RoleCollection> getRolesWithHttpInfo(Integer xVolTenant, String filter, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getRolesValidateBeforeCall(xVolTenant, filter, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<RoleCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRolesAsync(Integer xVolTenant, String filter, Integer xVolSite, final ApiCallback<RoleCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRolesValidateBeforeCall(xVolTenant, filter, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RoleCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}