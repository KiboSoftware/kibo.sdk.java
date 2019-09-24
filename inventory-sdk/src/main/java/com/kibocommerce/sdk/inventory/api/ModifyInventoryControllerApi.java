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


import com.kibocommerce.sdk.inventory.model.AdjustRequest;
import com.kibocommerce.sdk.inventory.model.DeleteItemRequest;
import com.kibocommerce.sdk.inventory.model.DeleteItemResponse;
import com.kibocommerce.sdk.inventory.model.InlineResponse404;
import com.kibocommerce.sdk.inventory.model.InventoryResponse;
import com.kibocommerce.sdk.inventory.model.RefreshRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModifyInventoryControllerApi {
    private ApiClient apiClient;

    public ModifyInventoryControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModifyInventoryControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for adjust
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call adjustCall(Integer xVolTenant, AdjustRequest adjustRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = adjustRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/adjust/";

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
    private com.squareup.okhttp.Call adjustValidateBeforeCall(Integer xVolTenant, AdjustRequest adjustRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling adjust(Async)");
        }
        
        // verify the required parameter 'adjustRequest' is set
        if (adjustRequest == null) {
            throw new ApiException("Missing the required parameter 'adjustRequest' when calling adjust(Async)");
        }
        

        com.squareup.okhttp.Call call = adjustCall(xVolTenant, adjustRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Adjust Inventory
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer adjust(Integer xVolTenant, AdjustRequest adjustRequest) throws ApiException {
        ApiResponse<Integer> resp = adjustWithHttpInfo(xVolTenant, adjustRequest);
        return resp.getData();
    }

    /**
     * 
     * Adjust Inventory
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> adjustWithHttpInfo(Integer xVolTenant, AdjustRequest adjustRequest) throws ApiException {
        com.squareup.okhttp.Call call = adjustValidateBeforeCall(xVolTenant, adjustRequest, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Adjust Inventory
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call adjustAsync(Integer xVolTenant, AdjustRequest adjustRequest, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = adjustValidateBeforeCall(xVolTenant, adjustRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param xVolTenant Tenant ID (required)
     * @param deleteItemRequest Request to delete item(s) (required)
     * @param xVolSite Site ID (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Integer xVolTenant, DeleteItemRequest deleteItemRequest, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deleteItemRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/delete/";

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Integer xVolTenant, DeleteItemRequest deleteItemRequest, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling delete(Async)");
        }
        
        // verify the required parameter 'deleteItemRequest' is set
        if (deleteItemRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteItemRequest' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(xVolTenant, deleteItemRequest, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Delete Inventory
     * @param xVolTenant Tenant ID (required)
     * @param deleteItemRequest Request to delete item(s) (required)
     * @param xVolSite Site ID (optional)
     * @return DeleteItemResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteItemResponse delete(Integer xVolTenant, DeleteItemRequest deleteItemRequest, Integer xVolSite) throws ApiException {
        ApiResponse<DeleteItemResponse> resp = deleteWithHttpInfo(xVolTenant, deleteItemRequest, xVolSite);
        return resp.getData();
    }

    /**
     * 
     * Delete Inventory
     * @param xVolTenant Tenant ID (required)
     * @param deleteItemRequest Request to delete item(s) (required)
     * @param xVolSite Site ID (optional)
     * @return ApiResponse&lt;DeleteItemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteItemResponse> deleteWithHttpInfo(Integer xVolTenant, DeleteItemRequest deleteItemRequest, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(xVolTenant, deleteItemRequest, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<DeleteItemResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete Inventory
     * @param xVolTenant Tenant ID (required)
     * @param deleteItemRequest Request to delete item(s) (required)
     * @param xVolSite Site ID (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(Integer xVolTenant, DeleteItemRequest deleteItemRequest, Integer xVolSite, final ApiCallback<DeleteItemResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(xVolTenant, deleteItemRequest, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteItemResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refresh
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call refreshCall(Integer xVolTenant, RefreshRequest refreshRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refreshRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/refresh/";

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
    private com.squareup.okhttp.Call refreshValidateBeforeCall(Integer xVolTenant, RefreshRequest refreshRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling refresh(Async)");
        }
        
        // verify the required parameter 'refreshRequest' is set
        if (refreshRequest == null) {
            throw new ApiException("Missing the required parameter 'refreshRequest' when calling refresh(Async)");
        }
        

        com.squareup.okhttp.Call call = refreshCall(xVolTenant, refreshRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Refresh Inventory
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer refresh(Integer xVolTenant, RefreshRequest refreshRequest) throws ApiException {
        ApiResponse<Integer> resp = refreshWithHttpInfo(xVolTenant, refreshRequest);
        return resp.getData();
    }

    /**
     * 
     * Refresh Inventory
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> refreshWithHttpInfo(Integer xVolTenant, RefreshRequest refreshRequest) throws ApiException {
        com.squareup.okhttp.Call call = refreshValidateBeforeCall(xVolTenant, refreshRequest, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Refresh Inventory
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refreshAsync(Integer xVolTenant, RefreshRequest refreshRequest, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refreshValidateBeforeCall(xVolTenant, refreshRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for syncAdjust
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call syncAdjustCall(Integer xVolTenant, AdjustRequest adjustRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = adjustRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/sync-adjust/";

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
    private com.squareup.okhttp.Call syncAdjustValidateBeforeCall(Integer xVolTenant, AdjustRequest adjustRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling syncAdjust(Async)");
        }
        
        // verify the required parameter 'adjustRequest' is set
        if (adjustRequest == null) {
            throw new ApiException("Missing the required parameter 'adjustRequest' when calling syncAdjust(Async)");
        }
        

        com.squareup.okhttp.Call call = syncAdjustCall(xVolTenant, adjustRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Adjust Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @return List&lt;InventoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InventoryResponse> syncAdjust(Integer xVolTenant, AdjustRequest adjustRequest) throws ApiException {
        ApiResponse<List<InventoryResponse>> resp = syncAdjustWithHttpInfo(xVolTenant, adjustRequest);
        return resp.getData();
    }

    /**
     * 
     * Adjust Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @return ApiResponse&lt;List&lt;InventoryResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InventoryResponse>> syncAdjustWithHttpInfo(Integer xVolTenant, AdjustRequest adjustRequest) throws ApiException {
        com.squareup.okhttp.Call call = syncAdjustValidateBeforeCall(xVolTenant, adjustRequest, null, null);
        Type localVarReturnType = new TypeToken<List<InventoryResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Adjust Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param adjustRequest Request to adjust inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call syncAdjustAsync(Integer xVolTenant, AdjustRequest adjustRequest, final ApiCallback<List<InventoryResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = syncAdjustValidateBeforeCall(xVolTenant, adjustRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InventoryResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for syncRefresh
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call syncRefreshCall(Integer xVolTenant, RefreshRequest refreshRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refreshRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/sync-refresh/";

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
    private com.squareup.okhttp.Call syncRefreshValidateBeforeCall(Integer xVolTenant, RefreshRequest refreshRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling syncRefresh(Async)");
        }
        
        // verify the required parameter 'refreshRequest' is set
        if (refreshRequest == null) {
            throw new ApiException("Missing the required parameter 'refreshRequest' when calling syncRefresh(Async)");
        }
        

        com.squareup.okhttp.Call call = syncRefreshCall(xVolTenant, refreshRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Refresh Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @return List&lt;InventoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InventoryResponse> syncRefresh(Integer xVolTenant, RefreshRequest refreshRequest) throws ApiException {
        ApiResponse<List<InventoryResponse>> resp = syncRefreshWithHttpInfo(xVolTenant, refreshRequest);
        return resp.getData();
    }

    /**
     * 
     * Refresh Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @return ApiResponse&lt;List&lt;InventoryResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InventoryResponse>> syncRefreshWithHttpInfo(Integer xVolTenant, RefreshRequest refreshRequest) throws ApiException {
        com.squareup.okhttp.Call call = syncRefreshValidateBeforeCall(xVolTenant, refreshRequest, null, null);
        Type localVarReturnType = new TypeToken<List<InventoryResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Refresh Inventory - synchronous
     * @param xVolTenant Tenant ID (required)
     * @param refreshRequest Request to refresh inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call syncRefreshAsync(Integer xVolTenant, RefreshRequest refreshRequest, final ApiCallback<List<InventoryResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = syncRefreshValidateBeforeCall(xVolTenant, refreshRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InventoryResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}