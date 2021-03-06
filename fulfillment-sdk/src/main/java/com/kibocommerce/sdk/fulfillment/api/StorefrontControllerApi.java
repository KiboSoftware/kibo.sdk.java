/*
 * Kibo Fulfillment API - Production Profile
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.api;

import com.kibocommerce.sdk.fulfillment.ApiCallback;
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.ApiResponse;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.Pair;
import com.kibocommerce.sdk.fulfillment.ProgressRequestBody;
import com.kibocommerce.sdk.fulfillment.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kibocommerce.sdk.fulfillment.model.EntityModelOfShipment;
import com.kibocommerce.sdk.fulfillment.model.PagedModelOfEntityModelOfShipment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorefrontControllerApi {
    private ApiClient apiClient;

    public StorefrontControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StorefrontControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getShipmentUsingGET1
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentUsingGET1Call(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/fulfillment/storefront/shipments/{shipmentNumber}"
            .replaceAll("\\{" + "shipmentNumber" + "\\}", apiClient.escapeString(shipmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolSite != null) {
            localVarHeaderParams.put("x-vol-site", apiClient.parameterToString(xVolSite));
        }

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call getShipmentUsingGET1ValidateBeforeCall(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentNumber' is set
        if (shipmentNumber == null) {
            throw new ApiException("Missing the required parameter 'shipmentNumber' when calling getShipmentUsingGET1(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getShipmentUsingGET1(Async)");
        }
        

        com.squareup.okhttp.Call call = getShipmentUsingGET1Call(shipmentNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getShipment
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return EntityModelOfShipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityModelOfShipment getShipmentUsingGET1(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        ApiResponse<EntityModelOfShipment> resp = getShipmentUsingGET1WithHttpInfo(shipmentNumber, xVolTenant, xVolSite);
        return resp.getData();
    }

    /**
     * getShipment
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;EntityModelOfShipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityModelOfShipment> getShipmentUsingGET1WithHttpInfo(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentUsingGET1ValidateBeforeCall(shipmentNumber, xVolTenant, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<EntityModelOfShipment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getShipment (asynchronously)
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentUsingGET1Async(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ApiCallback<EntityModelOfShipment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShipmentUsingGET1ValidateBeforeCall(shipmentNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityModelOfShipment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getShipmentsUsingGET1
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param isLate  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param quickSearch  (optional)
     * @param sort  (optional)
     * @param workflowTaskName  (optional)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentsUsingGET1Call(Integer xVolTenant, String filter, Boolean isLate, Integer page, Integer pageSize, String quickSearch, String sort, String workflowTaskName, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/fulfillment/storefront/shipments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        }

        if (isLate != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("isLate", isLate));
        }

        if (page != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        }

        if (quickSearch != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("quickSearch", quickSearch));
        }

        if (sort != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        }

        if (workflowTaskName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("workflowTaskName", workflowTaskName));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xVolSite != null) {
            localVarHeaderParams.put("x-vol-site", apiClient.parameterToString(xVolSite));
        }

        if (xVolTenant != null) {
            localVarHeaderParams.put("x-vol-tenant", apiClient.parameterToString(xVolTenant));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call getShipmentsUsingGET1ValidateBeforeCall(Integer xVolTenant, String filter, Boolean isLate, Integer page, Integer pageSize, String quickSearch, String sort, String workflowTaskName, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getShipmentsUsingGET1(Async)");
        }
        

        com.squareup.okhttp.Call call = getShipmentsUsingGET1Call(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getShipments
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param isLate  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param quickSearch  (optional)
     * @param sort  (optional)
     * @param workflowTaskName  (optional)
     * @param xVolSite  (optional)
     * @return PagedModelOfEntityModelOfShipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PagedModelOfEntityModelOfShipment getShipmentsUsingGET1(Integer xVolTenant, String filter, Boolean isLate, Integer page, Integer pageSize, String quickSearch, String sort, String workflowTaskName, Integer xVolSite) throws ApiException {
        ApiResponse<PagedModelOfEntityModelOfShipment> resp = getShipmentsUsingGET1WithHttpInfo(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite);
        return resp.getData();
    }

    /**
     * getShipments
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param isLate  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param quickSearch  (optional)
     * @param sort  (optional)
     * @param workflowTaskName  (optional)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;PagedModelOfEntityModelOfShipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PagedModelOfEntityModelOfShipment> getShipmentsUsingGET1WithHttpInfo(Integer xVolTenant, String filter, Boolean isLate, Integer page, Integer pageSize, String quickSearch, String sort, String workflowTaskName, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentsUsingGET1ValidateBeforeCall(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<PagedModelOfEntityModelOfShipment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getShipments (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param filter  (optional)
     * @param isLate  (optional)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param quickSearch  (optional)
     * @param sort  (optional)
     * @param workflowTaskName  (optional)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentsUsingGET1Async(Integer xVolTenant, String filter, Boolean isLate, Integer page, Integer pageSize, String quickSearch, String sort, String workflowTaskName, Integer xVolSite, final ApiCallback<PagedModelOfEntityModelOfShipment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShipmentsUsingGET1ValidateBeforeCall(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PagedModelOfEntityModelOfShipment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
