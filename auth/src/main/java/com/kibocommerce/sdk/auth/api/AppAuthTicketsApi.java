/*
 * Kibo AppDev Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.auth.api;

import com.kibocommerce.sdk.auth.ApiCallback;
import com.kibocommerce.sdk.auth.ApiClient;
import com.kibocommerce.sdk.auth.ApiException;
import com.kibocommerce.sdk.auth.ApiResponse;
import com.kibocommerce.sdk.auth.Configuration;
import com.kibocommerce.sdk.auth.Pair;
import com.kibocommerce.sdk.auth.ProgressRequestBody;
import com.kibocommerce.sdk.auth.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.auth.model.MozuAppDevContractsOAuthAccessTokenResponse;
import com.kibocommerce.sdk.auth.model.MozuAppDevContractsOauthAuthRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppAuthTicketsApi {
    private ApiClient apiClient;

    public AppAuthTicketsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppAuthTicketsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oauthAuthenticateApp
     * @param xVolTenant  (optional)
     * @param xVolSite  (optional)
     * @param mozuAppDevContractsOauthAuthRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthAuthenticateAppCall(Integer xVolTenant, Integer xVolSite, MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mozuAppDevContractsOauthAuthRequest;

        // create path and map variables
        String localVarPath = "/platform/applications/authtickets/oauth";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call oauthAuthenticateAppValidateBeforeCall(Integer xVolTenant, Integer xVolSite, MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = oauthAuthenticateAppCall(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param xVolTenant  (optional)
     * @param xVolSite  (optional)
     * @param mozuAppDevContractsOauthAuthRequest  (optional)
     * @return MozuAppDevContractsOAuthAccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MozuAppDevContractsOAuthAccessTokenResponse oauthAuthenticateApp(Integer xVolTenant, Integer xVolSite, MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest) throws ApiException {
        ApiResponse<MozuAppDevContractsOAuthAccessTokenResponse> resp = oauthAuthenticateAppWithHttpInfo(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param xVolTenant  (optional)
     * @param xVolSite  (optional)
     * @param mozuAppDevContractsOauthAuthRequest  (optional)
     * @return ApiResponse&lt;MozuAppDevContractsOAuthAccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MozuAppDevContractsOAuthAccessTokenResponse> oauthAuthenticateAppWithHttpInfo(Integer xVolTenant, Integer xVolSite, MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest) throws ApiException {
        com.squareup.okhttp.Call call = oauthAuthenticateAppValidateBeforeCall(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest, null, null);
        Type localVarReturnType = new TypeToken<MozuAppDevContractsOAuthAccessTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xVolTenant  (optional)
     * @param xVolSite  (optional)
     * @param mozuAppDevContractsOauthAuthRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthAuthenticateAppAsync(Integer xVolTenant, Integer xVolSite, MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest, final ApiCallback<MozuAppDevContractsOAuthAccessTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = oauthAuthenticateAppValidateBeforeCall(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MozuAppDevContractsOAuthAccessTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
