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


import com.kibocommerce.sdk.fulfillment.model.CollectionModelOfEntityModelOfCustomerSurvey;
import com.kibocommerce.sdk.fulfillment.model.CustomerSurvey;
import com.kibocommerce.sdk.fulfillment.model.EntityModelOfCustomerSurvey;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSurveyControllerApi {
    private ApiClient apiClient;

    public CustomerSurveyControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerSurveyControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSurveyUsingPOST
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param customerSurvey customerSurveyDto (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSurveyUsingPOSTCall(Integer shipmentNumber, Integer xVolTenant, CustomerSurvey customerSurvey, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = customerSurvey;

        // create path and map variables
        String localVarPath = "/commerce/shipments/{shipmentNumber}/surveys"
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
    private com.squareup.okhttp.Call createSurveyUsingPOSTValidateBeforeCall(Integer shipmentNumber, Integer xVolTenant, CustomerSurvey customerSurvey, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentNumber' is set
        if (shipmentNumber == null) {
            throw new ApiException("Missing the required parameter 'shipmentNumber' when calling createSurveyUsingPOST(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling createSurveyUsingPOST(Async)");
        }
        
        // verify the required parameter 'customerSurvey' is set
        if (customerSurvey == null) {
            throw new ApiException("Missing the required parameter 'customerSurvey' when calling createSurveyUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = createSurveyUsingPOSTCall(shipmentNumber, xVolTenant, customerSurvey, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * createSurvey
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param customerSurvey customerSurveyDto (required)
     * @param xVolSite  (optional)
     * @return EntityModelOfCustomerSurvey
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityModelOfCustomerSurvey createSurveyUsingPOST(Integer shipmentNumber, Integer xVolTenant, CustomerSurvey customerSurvey, Integer xVolSite) throws ApiException {
        ApiResponse<EntityModelOfCustomerSurvey> resp = createSurveyUsingPOSTWithHttpInfo(shipmentNumber, xVolTenant, customerSurvey, xVolSite);
        return resp.getData();
    }

    /**
     * createSurvey
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param customerSurvey customerSurveyDto (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;EntityModelOfCustomerSurvey&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityModelOfCustomerSurvey> createSurveyUsingPOSTWithHttpInfo(Integer shipmentNumber, Integer xVolTenant, CustomerSurvey customerSurvey, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = createSurveyUsingPOSTValidateBeforeCall(shipmentNumber, xVolTenant, customerSurvey, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<EntityModelOfCustomerSurvey>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * createSurvey (asynchronously)
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param customerSurvey customerSurveyDto (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSurveyUsingPOSTAsync(Integer shipmentNumber, Integer xVolTenant, CustomerSurvey customerSurvey, Integer xVolSite, final ApiCallback<EntityModelOfCustomerSurvey> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createSurveyUsingPOSTValidateBeforeCall(shipmentNumber, xVolTenant, customerSurvey, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityModelOfCustomerSurvey>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSurveyUsingGET
     * @param id id (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSurveyUsingGETCall(String id, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/shipments/surveys/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getSurveyUsingGETValidateBeforeCall(String id, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSurveyUsingGET(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getSurveyUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getSurveyUsingGETCall(id, xVolTenant, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getSurvey
     * 
     * @param id id (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return EntityModelOfCustomerSurvey
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityModelOfCustomerSurvey getSurveyUsingGET(String id, Integer xVolTenant, Integer xVolSite) throws ApiException {
        ApiResponse<EntityModelOfCustomerSurvey> resp = getSurveyUsingGETWithHttpInfo(id, xVolTenant, xVolSite);
        return resp.getData();
    }

    /**
     * getSurvey
     * 
     * @param id id (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;EntityModelOfCustomerSurvey&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityModelOfCustomerSurvey> getSurveyUsingGETWithHttpInfo(String id, Integer xVolTenant, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getSurveyUsingGETValidateBeforeCall(id, xVolTenant, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<EntityModelOfCustomerSurvey>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getSurvey (asynchronously)
     * 
     * @param id id (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSurveyUsingGETAsync(String id, Integer xVolTenant, Integer xVolSite, final ApiCallback<EntityModelOfCustomerSurvey> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSurveyUsingGETValidateBeforeCall(id, xVolTenant, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityModelOfCustomerSurvey>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSurveysUsingGET
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSurveysUsingGETCall(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/commerce/shipments/{shipmentNumber}/surveys"
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
    private com.squareup.okhttp.Call getSurveysUsingGETValidateBeforeCall(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentNumber' is set
        if (shipmentNumber == null) {
            throw new ApiException("Missing the required parameter 'shipmentNumber' when calling getSurveysUsingGET(Async)");
        }
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getSurveysUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getSurveysUsingGETCall(shipmentNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getSurveys
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return CollectionModelOfEntityModelOfCustomerSurvey
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionModelOfEntityModelOfCustomerSurvey getSurveysUsingGET(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        ApiResponse<CollectionModelOfEntityModelOfCustomerSurvey> resp = getSurveysUsingGETWithHttpInfo(shipmentNumber, xVolTenant, xVolSite);
        return resp.getData();
    }

    /**
     * getSurveys
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @return ApiResponse&lt;CollectionModelOfEntityModelOfCustomerSurvey&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionModelOfEntityModelOfCustomerSurvey> getSurveysUsingGETWithHttpInfo(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite) throws ApiException {
        com.squareup.okhttp.Call call = getSurveysUsingGETValidateBeforeCall(shipmentNumber, xVolTenant, xVolSite, null, null);
        Type localVarReturnType = new TypeToken<CollectionModelOfEntityModelOfCustomerSurvey>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getSurveys (asynchronously)
     * 
     * @param shipmentNumber shipmentNumber (required)
     * @param xVolTenant  (required)
     * @param xVolSite  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSurveysUsingGETAsync(Integer shipmentNumber, Integer xVolTenant, Integer xVolSite, final ApiCallback<CollectionModelOfEntityModelOfCustomerSurvey> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSurveysUsingGETValidateBeforeCall(shipmentNumber, xVolTenant, xVolSite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionModelOfEntityModelOfCustomerSurvey>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}