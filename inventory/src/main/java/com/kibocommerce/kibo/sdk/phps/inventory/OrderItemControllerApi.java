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


package com.kibocommerce.kibo.sdk.phps.inventory;

import com.kibocommerce.kibo.sdk.java.inventory.ApiCallback;
import com.kibocommerce.kibo.sdk.java.inventory.ApiClient;
import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
import com.kibocommerce.kibo.sdk.java.inventory.ApiResponse;
import com.kibocommerce.kibo.sdk.java.inventory.Configuration;
import com.kibocommerce.kibo.sdk.java.inventory.Pair;
import com.kibocommerce.kibo.sdk.java.inventory.ProgressRequestBody;
import com.kibocommerce.kibo.sdk.java.inventory.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.kibo.sdk.java.inventory.model.OrderItemInformation;
import com.kibocommerce.kibo.sdk.java.inventory.model.OrderItemInformationRequest;
import com.kibocommerce.kibo.sdk.java.inventory.model.OrderItemLogRequest;
import com.kibocommerce.kibo.sdk.java.inventory.model.OrderItemLogResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderItemControllerApi {
    private ApiClient apiClient;

    public OrderItemControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderItemControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOrderItemInformation
     * @param xVolTenant Tenant ID (required)
     * @param orderItemInformationRequest Request to retrieve order item information (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderItemInformationCall(Integer xVolTenant, OrderItemInformationRequest orderItemInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = orderItemInformationRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/getOrderItemInformation/";

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
    private com.squareup.okhttp.Call getOrderItemInformationValidateBeforeCall(Integer xVolTenant, OrderItemInformationRequest orderItemInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getOrderItemInformation(Async)");
        }
        
        // verify the required parameter 'orderItemInformationRequest' is set
        if (orderItemInformationRequest == null) {
            throw new ApiException("Missing the required parameter 'orderItemInformationRequest' when calling getOrderItemInformation(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrderItemInformationCall(xVolTenant, orderItemInformationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get Order Item Information
     * @param xVolTenant Tenant ID (required)
     * @param orderItemInformationRequest Request to retrieve order item information (required)
     * @return List&lt;OrderItemInformation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<OrderItemInformation> getOrderItemInformation(Integer xVolTenant, OrderItemInformationRequest orderItemInformationRequest) throws ApiException {
        ApiResponse<List<OrderItemInformation>> resp = getOrderItemInformationWithHttpInfo(xVolTenant, orderItemInformationRequest);
        return resp.getData();
    }

    /**
     * 
     * Get Order Item Information
     * @param xVolTenant Tenant ID (required)
     * @param orderItemInformationRequest Request to retrieve order item information (required)
     * @return ApiResponse&lt;List&lt;OrderItemInformation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<OrderItemInformation>> getOrderItemInformationWithHttpInfo(Integer xVolTenant, OrderItemInformationRequest orderItemInformationRequest) throws ApiException {
        com.squareup.okhttp.Call call = getOrderItemInformationValidateBeforeCall(xVolTenant, orderItemInformationRequest, null, null);
        Type localVarReturnType = new TypeToken<List<OrderItemInformation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get Order Item Information
     * @param xVolTenant Tenant ID (required)
     * @param orderItemInformationRequest Request to retrieve order item information (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrderItemInformationAsync(Integer xVolTenant, OrderItemInformationRequest orderItemInformationRequest, final ApiCallback<List<OrderItemInformation>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrderItemInformationValidateBeforeCall(xVolTenant, orderItemInformationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<OrderItemInformation>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrderItemLog
     * @param xVolTenant Tenant ID (required)
     * @param orderItemLogRequest Request to retrieve order item log(s) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderItemLogCall(Integer xVolTenant, OrderItemLogRequest orderItemLogRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = orderItemLogRequest;

        // create path and map variables
        String localVarPath = "/v5/inventory/getOrderItemLog/";

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
    private com.squareup.okhttp.Call getOrderItemLogValidateBeforeCall(Integer xVolTenant, OrderItemLogRequest orderItemLogRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getOrderItemLog(Async)");
        }
        
        // verify the required parameter 'orderItemLogRequest' is set
        if (orderItemLogRequest == null) {
            throw new ApiException("Missing the required parameter 'orderItemLogRequest' when calling getOrderItemLog(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrderItemLogCall(xVolTenant, orderItemLogRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get Order Item Log
     * @param xVolTenant Tenant ID (required)
     * @param orderItemLogRequest Request to retrieve order item log(s) (required)
     * @return List&lt;OrderItemLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<OrderItemLogResponse> getOrderItemLog(Integer xVolTenant, OrderItemLogRequest orderItemLogRequest) throws ApiException {
        ApiResponse<List<OrderItemLogResponse>> resp = getOrderItemLogWithHttpInfo(xVolTenant, orderItemLogRequest);
        return resp.getData();
    }

    /**
     * 
     * Get Order Item Log
     * @param xVolTenant Tenant ID (required)
     * @param orderItemLogRequest Request to retrieve order item log(s) (required)
     * @return ApiResponse&lt;List&lt;OrderItemLogResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<OrderItemLogResponse>> getOrderItemLogWithHttpInfo(Integer xVolTenant, OrderItemLogRequest orderItemLogRequest) throws ApiException {
        com.squareup.okhttp.Call call = getOrderItemLogValidateBeforeCall(xVolTenant, orderItemLogRequest, null, null);
        Type localVarReturnType = new TypeToken<List<OrderItemLogResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get Order Item Log
     * @param xVolTenant Tenant ID (required)
     * @param orderItemLogRequest Request to retrieve order item log(s) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrderItemLogAsync(Integer xVolTenant, OrderItemLogRequest orderItemLogRequest, final ApiCallback<List<OrderItemLogResponse>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrderItemLogValidateBeforeCall(xVolTenant, orderItemLogRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<OrderItemLogResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
