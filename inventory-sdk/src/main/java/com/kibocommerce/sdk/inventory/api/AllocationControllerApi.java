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


import com.kibocommerce.sdk.inventory.model.AllocateInventoryRequest;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import com.kibocommerce.sdk.inventory.model.InlineResponse500;
import com.kibocommerce.sdk.inventory.model.JobQueueResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllocationControllerApi {
    private ApiClient apiClient;

    public AllocationControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AllocationControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for allocateInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call allocateInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/allocate/";

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
    private com.squareup.okhttp.Call allocateInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling allocateInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling allocateInventory(Async)");
        }
        

        com.squareup.okhttp.Call call = allocateInventoryCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return JobQueueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobQueueResponse allocateInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<JobQueueResponse> resp = allocateInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return resp.getData();
    }

    /**
     * 
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;JobQueueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobQueueResponse> allocateInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        com.squareup.okhttp.Call call = allocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null, null);
        Type localVarReturnType = new TypeToken<JobQueueResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Allocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call allocateInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<JobQueueResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = allocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobQueueResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deallocateInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deallocateInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/deallocate/";

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
    private com.squareup.okhttp.Call deallocateInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deallocateInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling deallocateInventory(Async)");
        }
        

        com.squareup.okhttp.Call call = deallocateInventoryCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BaseResponse deallocateInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<BaseResponse> resp = deallocateInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return resp.getData();
    }

    /**
     * 
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BaseResponse> deallocateInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        com.squareup.okhttp.Call call = deallocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deallocates inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deallocateInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<BaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deallocateInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fulfillInventory
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fulfillInventoryCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = allocateInventoryRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/fulfill/";

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
    private com.squareup.okhttp.Call fulfillInventoryValidateBeforeCall(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling fulfillInventory(Async)");
        }
        
        // verify the required parameter 'allocateInventoryRequest' is set
        if (allocateInventoryRequest == null) {
            throw new ApiException("Missing the required parameter 'allocateInventoryRequest' when calling fulfillInventory(Async)");
        }
        

        com.squareup.okhttp.Call call = fulfillInventoryCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BaseResponse fulfillInventory(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        ApiResponse<BaseResponse> resp = fulfillInventoryWithHttpInfo(xVolTenant, allocateInventoryRequest);
        return resp.getData();
    }

    /**
     * 
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BaseResponse> fulfillInventoryWithHttpInfo(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest) throws ApiException {
        com.squareup.okhttp.Call call = fulfillInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, null, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fulfills inventory based on the given request
     * @param xVolTenant Tenant ID (required)
     * @param allocateInventoryRequest Request to allocate inventory (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fulfillInventoryAsync(Integer xVolTenant, AllocateInventoryRequest allocateInventoryRequest, final ApiCallback<BaseResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fulfillInventoryValidateBeforeCall(xVolTenant, allocateInventoryRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
