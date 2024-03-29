/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;

import com.kibocommerce.sdk.inventory.ApiCallback;
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.ApiResponse;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.Pair;
import com.kibocommerce.sdk.inventory.ProgressRequestBody;
import com.kibocommerce.sdk.inventory.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.inventory.model.BaseResponse;
import com.kibocommerce.sdk.inventory.model.DeletedResponse;
import com.kibocommerce.sdk.inventory.model.FetchFileConfigRequest;
import com.kibocommerce.sdk.inventory.model.FetchFileConnectionResponse;
import com.kibocommerce.sdk.inventory.model.MFetchFileConfig;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FetchFileConfigControllerApi {
    private ApiClient apiClient;

    public FetchFileConfigControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FetchFileConfigControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteFetchConfig
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFetchConfigCall(Integer xVolTenant, Long fetchFileConfigID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/config/fetchfile/{fetchFileConfigID}"
            .replaceAll("\\{" + "fetchFileConfigID" + "\\}", apiClient.escapeString(fetchFileConfigID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFetchConfigValidateBeforeCall(Integer xVolTenant, Long fetchFileConfigID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deleteFetchConfig(Async)");
        }
        
        // verify the required parameter 'fetchFileConfigID' is set
        if (fetchFileConfigID == null) {
            throw new ApiException("Missing the required parameter 'fetchFileConfigID' when calling deleteFetchConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteFetchConfigCall(xVolTenant, fetchFileConfigID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Deletes a fetch file config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @return DeletedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedResponse deleteFetchConfig(Integer xVolTenant, Long fetchFileConfigID) throws ApiException {
        ApiResponse<DeletedResponse> resp = deleteFetchConfigWithHttpInfo(xVolTenant, fetchFileConfigID);
        return resp.getData();
    }

    /**
     * 
     * Deletes a fetch file config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @return ApiResponse&lt;DeletedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedResponse> deleteFetchConfigWithHttpInfo(Integer xVolTenant, Long fetchFileConfigID) throws ApiException {
        com.squareup.okhttp.Call call = deleteFetchConfigValidateBeforeCall(xVolTenant, fetchFileConfigID, null, null);
        Type localVarReturnType = new TypeToken<DeletedResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deletes a fetch file config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFetchConfigAsync(Integer xVolTenant, Long fetchFileConfigID, final ApiCallback<DeletedResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFetchConfigValidateBeforeCall(xVolTenant, fetchFileConfigID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFetchConfig
     * @param xVolTenant Tenant ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFetchConfigCall(Integer xVolTenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/config/fetchfile/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFetchConfigValidateBeforeCall(Integer xVolTenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getFetchConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = getFetchConfigCall(xVolTenant, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get the Fetch File Configs for the current tenant
     * @param xVolTenant Tenant ID (required)
     * @return MFetchFileConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MFetchFileConfig getFetchConfig(Integer xVolTenant) throws ApiException {
        ApiResponse<MFetchFileConfig> resp = getFetchConfigWithHttpInfo(xVolTenant);
        return resp.getData();
    }

    /**
     * 
     * Get the Fetch File Configs for the current tenant
     * @param xVolTenant Tenant ID (required)
     * @return ApiResponse&lt;MFetchFileConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MFetchFileConfig> getFetchConfigWithHttpInfo(Integer xVolTenant) throws ApiException {
        com.squareup.okhttp.Call call = getFetchConfigValidateBeforeCall(xVolTenant, null, null);
        Type localVarReturnType = new TypeToken<MFetchFileConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the Fetch File Configs for the current tenant
     * @param xVolTenant Tenant ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFetchConfigAsync(Integer xVolTenant, final ApiCallback<MFetchFileConfig> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFetchConfigValidateBeforeCall(xVolTenant, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MFetchFileConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for saveFetchConfig
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigRequest Request to fetch file configs (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveFetchConfigCall(Integer xVolTenant, FetchFileConfigRequest fetchFileConfigRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fetchFileConfigRequest;

        // create path and map variables
        String localVarPath = "/v1/config/fetchfile/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveFetchConfigValidateBeforeCall(Integer xVolTenant, FetchFileConfigRequest fetchFileConfigRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling saveFetchConfig(Async)");
        }
        
        // verify the required parameter 'fetchFileConfigRequest' is set
        if (fetchFileConfigRequest == null) {
            throw new ApiException("Missing the required parameter 'fetchFileConfigRequest' when calling saveFetchConfig(Async)");
        }
        

        com.squareup.okhttp.Call call = saveFetchConfigCall(xVolTenant, fetchFileConfigRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Save a new Fetch File Config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigRequest Request to fetch file configs (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BaseResponse saveFetchConfig(Integer xVolTenant, FetchFileConfigRequest fetchFileConfigRequest) throws ApiException {
        ApiResponse<BaseResponse> resp = saveFetchConfigWithHttpInfo(xVolTenant, fetchFileConfigRequest);
        return resp.getData();
    }

    /**
     * 
     * Save a new Fetch File Config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigRequest Request to fetch file configs (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BaseResponse> saveFetchConfigWithHttpInfo(Integer xVolTenant, FetchFileConfigRequest fetchFileConfigRequest) throws ApiException {
        com.squareup.okhttp.Call call = saveFetchConfigValidateBeforeCall(xVolTenant, fetchFileConfigRequest, null, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Save a new Fetch File Config
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigRequest Request to fetch file configs (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveFetchConfigAsync(Integer xVolTenant, FetchFileConfigRequest fetchFileConfigRequest, final ApiCallback<BaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = saveFetchConfigValidateBeforeCall(xVolTenant, fetchFileConfigRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for testConnection
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call testConnectionCall(Integer xVolTenant, Long fetchFileConfigID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/config/fetchfile/testConnection/{fetchFileConfigID}"
            .replaceAll("\\{" + "fetchFileConfigID" + "\\}", apiClient.escapeString(fetchFileConfigID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call testConnectionValidateBeforeCall(Integer xVolTenant, Long fetchFileConfigID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling testConnection(Async)");
        }
        
        // verify the required parameter 'fetchFileConfigID' is set
        if (fetchFileConfigID == null) {
            throw new ApiException("Missing the required parameter 'fetchFileConfigID' when calling testConnection(Async)");
        }
        

        com.squareup.okhttp.Call call = testConnectionCall(xVolTenant, fetchFileConfigID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Attempts to connect to a fetch file endpoint and lists current files if successful
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @return FetchFileConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FetchFileConnectionResponse testConnection(Integer xVolTenant, Long fetchFileConfigID) throws ApiException {
        ApiResponse<FetchFileConnectionResponse> resp = testConnectionWithHttpInfo(xVolTenant, fetchFileConfigID);
        return resp.getData();
    }

    /**
     * 
     * Attempts to connect to a fetch file endpoint and lists current files if successful
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @return ApiResponse&lt;FetchFileConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FetchFileConnectionResponse> testConnectionWithHttpInfo(Integer xVolTenant, Long fetchFileConfigID) throws ApiException {
        com.squareup.okhttp.Call call = testConnectionValidateBeforeCall(xVolTenant, fetchFileConfigID, null, null);
        Type localVarReturnType = new TypeToken<FetchFileConnectionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Attempts to connect to a fetch file endpoint and lists current files if successful
     * @param xVolTenant Tenant ID (required)
     * @param fetchFileConfigID Id of fetch file config (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call testConnectionAsync(Integer xVolTenant, Long fetchFileConfigID, final ApiCallback<FetchFileConnectionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = testConnectionValidateBeforeCall(xVolTenant, fetchFileConfigID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FetchFileConnectionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
