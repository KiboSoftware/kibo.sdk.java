/*
 * Kibo Fulfillment API
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


import com.kibocommerce.sdk.fulfillment.model.ClosePickWave;
import com.kibocommerce.sdk.fulfillment.model.CreatePickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourceOfPickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfPickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfShipment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickWaveControllerApi {
    private ApiClient apiClient;

    public PickWaveControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PickWaveControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for closePickWaveUsingPUT
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param closePickWave closePickWaveDto (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call closePickWaveUsingPUTCall(Integer pickWaveNumber, Integer xVolTenant, ClosePickWave closePickWave, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = closePickWave;

        // create path and map variables
        String localVarPath = "/commerce/pickwaves/{pickWaveNumber}/closed"
            .replaceAll("\\{" + "pickWaveNumber" + "\\}", apiClient.escapeString(pickWaveNumber.toString()));

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
            "application/xml", "application/json", "application/hal+json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call closePickWaveUsingPUTValidateBeforeCall(Integer pickWaveNumber, Integer xVolTenant, ClosePickWave closePickWave, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pickWaveNumber' is set
        if (pickWaveNumber == null) {
            throw new ApiException("Missing the required parameter 'pickWaveNumber' when calling closePickWaveUsingPUT(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling closePickWaveUsingPUT(Async)");
        }
        
        // verify the required parameter 'closePickWave' is set
        if (closePickWave == null) {
            throw new ApiException("Missing the required parameter 'closePickWave' when calling closePickWaveUsingPUT(Async)");
        }
        

        com.squareup.okhttp.Call call = closePickWaveUsingPUTCall(pickWaveNumber, xVolTenant, closePickWave, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * closePickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param closePickWave closePickWaveDto (required)
     * @param xVolSite  (optional)
     * @return ResourceOfPickWave
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceOfPickWave closePickWaveUsingPUT(Integer pickWaveNumber, Integer xVolTenant, ClosePickWave closePickWave, Integer xVolSite) throws ApiException {
        ApiResponse<ResourceOfPickWave> resp = closePickWaveUsingPUTWithHttpInfo(pickWaveNumber, xVolTenant, closePickWave, xVolSite);
        return resp.getData();
    }

    /**
     * closePickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param closePickWave closePickWaveDto (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;ResourceOfPickWave&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceOfPickWave> closePickWaveUsingPUTWithHttpInfo(Integer pickWaveNumber, Integer xVolTenant, ClosePickWave closePickWave, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = closePickWaveUsingPUTValidateBeforeCall(pickWaveNumber, xVolTenant, closePickWave, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * closePickWave (asynchronously)
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param closePickWave closePickWaveDto (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call closePickWaveUsingPUTAsync(Integer pickWaveNumber, Integer xVolTenant, ClosePickWave closePickWave, Integer xVolSite, final ApiCallback<ResourceOfPickWave> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = closePickWaveUsingPUTValidateBeforeCall(pickWaveNumber, xVolTenant, closePickWave, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPickWaveUsingPOST
     * @param xVolTenant  (required)
     * @param createPickWave createPickWaveDto (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPickWaveUsingPOSTCall(Integer xVolTenant, CreatePickWave createPickWave, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createPickWave;

        // create path and map variables
        String localVarPath = "/commerce/pickwaves";

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
            "application/xml", "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call createPickWaveUsingPOSTValidateBeforeCall(Integer xVolTenant, CreatePickWave createPickWave, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling createPickWaveUsingPOST(Async)");
        }
        
        // verify the required parameter 'createPickWave' is set
        if (createPickWave == null) {
            throw new ApiException("Missing the required parameter 'createPickWave' when calling createPickWaveUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = createPickWaveUsingPOSTCall(xVolTenant, createPickWave, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * createPickWave
     * 
     * @param xVolTenant  (required)
     * @param createPickWave createPickWaveDto (required)
     * @param xVolSite  (optional)
     * @return ResourceOfPickWave
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceOfPickWave createPickWaveUsingPOST(Integer xVolTenant, CreatePickWave createPickWave, Integer xVolSite) throws ApiException {
        ApiResponse<ResourceOfPickWave> resp = createPickWaveUsingPOSTWithHttpInfo(xVolTenant, createPickWave, xVolSite);
        return resp.getData();
    }

    /**
     * createPickWave
     * 
     * @param xVolTenant  (required)
     * @param createPickWave createPickWaveDto (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;ResourceOfPickWave&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceOfPickWave> createPickWaveUsingPOSTWithHttpInfo(Integer xVolTenant, CreatePickWave createPickWave, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = createPickWaveUsingPOSTValidateBeforeCall(xVolTenant, createPickWave, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * createPickWave (asynchronously)
     * 
     * @param xVolTenant  (required)
     * @param createPickWave createPickWaveDto (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPickWaveUsingPOSTAsync(Integer xVolTenant, CreatePickWave createPickWave, Integer xVolSite, final ApiCallback<ResourceOfPickWave> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPickWaveUsingPOSTValidateBeforeCall(xVolTenant, createPickWave, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOpenPickWavesUsingGET
     * @param fulfillmentLocationCode fulfillmentLocationCode (required)
     * @param xVolTenant  (required)
     * @param shipmentType shipmentType (optional)
     * @param userId userId (optional)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOpenPickWavesUsingGETCall(String fulfillmentLocationCode, Integer xVolTenant, String shipmentType, String userId, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/pickwaves/open/{fulfillmentLocationCode}"
            .replaceAll("\\{" + "fulfillmentLocationCode" + "\\}", apiClient.escapeString(fulfillmentLocationCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipmentType != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("shipmentType", shipmentType));
        }

        if (userId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
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
            "application/xml", "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call getOpenPickWavesUsingGETValidateBeforeCall(String fulfillmentLocationCode, Integer xVolTenant, String shipmentType, String userId, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fulfillmentLocationCode' is set
        if (fulfillmentLocationCode == null) {
            throw new ApiException("Missing the required parameter 'fulfillmentLocationCode' when calling getOpenPickWavesUsingGET(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getOpenPickWavesUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getOpenPickWavesUsingGETCall(fulfillmentLocationCode, xVolTenant, shipmentType, userId, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getOpenPickWaves
     * 
     * @param fulfillmentLocationCode fulfillmentLocationCode (required)
     * @param xVolTenant  (required)
     * @param shipmentType shipmentType (optional)
     * @param userId userId (optional)
     * @param xVolSite  (optional)
     * @return ResourcesOfPickWave
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourcesOfPickWave getOpenPickWavesUsingGET(String fulfillmentLocationCode, Integer xVolTenant, String shipmentType, String userId, Integer xVolSite) throws ApiException {
        ApiResponse<ResourcesOfPickWave> resp = getOpenPickWavesUsingGETWithHttpInfo(fulfillmentLocationCode, xVolTenant, shipmentType, userId, xVolSite);
        return resp.getData();
    }

    /**
     * getOpenPickWaves
     * 
     * @param fulfillmentLocationCode fulfillmentLocationCode (required)
     * @param xVolTenant  (required)
     * @param shipmentType shipmentType (optional)
     * @param userId userId (optional)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;ResourcesOfPickWave&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourcesOfPickWave> getOpenPickWavesUsingGETWithHttpInfo(String fulfillmentLocationCode, Integer xVolTenant, String shipmentType, String userId, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getOpenPickWavesUsingGETValidateBeforeCall(fulfillmentLocationCode, xVolTenant, shipmentType, userId, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<ResourcesOfPickWave>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getOpenPickWaves (asynchronously)
     * 
     * @param fulfillmentLocationCode fulfillmentLocationCode (required)
     * @param xVolTenant  (required)
     * @param shipmentType shipmentType (optional)
     * @param userId userId (optional)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOpenPickWavesUsingGETAsync(String fulfillmentLocationCode, Integer xVolTenant, String shipmentType, String userId, Integer xVolSite, final ApiCallback<ResourcesOfPickWave> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOpenPickWavesUsingGETValidateBeforeCall(fulfillmentLocationCode, xVolTenant, shipmentType, userId, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourcesOfPickWave>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPickWaveUsingGET
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPickWaveUsingGETCall(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/pickwaves/{pickWaveNumber}"
            .replaceAll("\\{" + "pickWaveNumber" + "\\}", apiClient.escapeString(pickWaveNumber.toString()));

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
            "application/xml", "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call getPickWaveUsingGETValidateBeforeCall(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pickWaveNumber' is set
        if (pickWaveNumber == null) {
            throw new ApiException("Missing the required parameter 'pickWaveNumber' when calling getPickWaveUsingGET(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getPickWaveUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getPickWaveUsingGETCall(pickWaveNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getPickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ResourceOfPickWave
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceOfPickWave getPickWaveUsingGET(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        ApiResponse<ResourceOfPickWave> resp = getPickWaveUsingGETWithHttpInfo(pickWaveNumber, xVolTenant, xVolSite);
        return resp.getData();
    }

    /**
     * getPickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;ResourceOfPickWave&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceOfPickWave> getPickWaveUsingGETWithHttpInfo(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getPickWaveUsingGETValidateBeforeCall(pickWaveNumber, xVolTenant, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getPickWave (asynchronously)
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPickWaveUsingGETAsync(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ApiCallback<ResourceOfPickWave> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPickWaveUsingGETValidateBeforeCall(pickWaveNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceOfPickWave>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getShipmentsInPickWaveUsingGET
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentsInPickWaveUsingGETCall(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/pickwaves/{pickWaveNumber}/shipments"
            .replaceAll("\\{" + "pickWaveNumber" + "\\}", apiClient.escapeString(pickWaveNumber.toString()));

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
            "application/xml", "application/json", "application/hal+json"
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
    private com.squareup.okhttp.Call getShipmentsInPickWaveUsingGETValidateBeforeCall(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pickWaveNumber' is set
        if (pickWaveNumber == null) {
            throw new ApiException("Missing the required parameter 'pickWaveNumber' when calling getShipmentsInPickWaveUsingGET(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getShipmentsInPickWaveUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getShipmentsInPickWaveUsingGETCall(pickWaveNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getShipmentsInPickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ResourcesOfShipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourcesOfShipment getShipmentsInPickWaveUsingGET(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        ApiResponse<ResourcesOfShipment> resp = getShipmentsInPickWaveUsingGETWithHttpInfo(pickWaveNumber, xVolTenant, xVolSite);
        return resp.getData();
    }

    /**
     * getShipmentsInPickWave
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;ResourcesOfShipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourcesOfShipment> getShipmentsInPickWaveUsingGETWithHttpInfo(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentsInPickWaveUsingGETValidateBeforeCall(pickWaveNumber, xVolTenant, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<ResourcesOfShipment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getShipmentsInPickWave (asynchronously)
     * 
     * @param pickWaveNumber pickWaveNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentsInPickWaveUsingGETAsync(Integer pickWaveNumber, Integer xVolTenant, Integer xVolSite, final ApiCallback<ResourcesOfShipment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShipmentsInPickWaveUsingGETValidateBeforeCall(pickWaveNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourcesOfShipment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
