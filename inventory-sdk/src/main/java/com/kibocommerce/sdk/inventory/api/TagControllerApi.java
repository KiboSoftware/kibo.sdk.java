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
import com.kibocommerce.sdk.inventory.model.DeletedCountResponse;
import com.kibocommerce.sdk.inventory.model.Tag;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagControllerApi {
    private ApiClient apiClient;

    public TagControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tag Request create or modify Tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTagCall(Integer xVolTenant, String tagCategoryName, Tag tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tag;

        // create path and map variables
        String localVarPath = "/v1/tagCategory/{tag_category_name}/tag";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tagCategoryName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

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
    private com.squareup.okhttp.Call createTagValidateBeforeCall(Integer xVolTenant, String tagCategoryName, Tag tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling createTag(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling createTag(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling createTag(Async)");
        }
        

        com.squareup.okhttp.Call call = createTagCall(xVolTenant, tagCategoryName, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Create a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tag Request create or modify Tag (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag createTag(Integer xVolTenant, String tagCategoryName, Tag tag) throws ApiException {
        ApiResponse<Tag> resp = createTagWithHttpInfo(xVolTenant, tagCategoryName, tag);
        return resp.getData();
    }

    /**
     * 
     * Create a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tag Request create or modify Tag (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> createTagWithHttpInfo(Integer xVolTenant, String tagCategoryName, Tag tag) throws ApiException {
        com.squareup.okhttp.Call call = createTagValidateBeforeCall(xVolTenant, tagCategoryName, tag, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tag Request create or modify Tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTagAsync(Integer xVolTenant, String tagCategoryName, Tag tag, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTagValidateBeforeCall(xVolTenant, tagCategoryName, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTagCall(Integer xVolTenant, String tagCategoryName, String tagValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/tagCategory/{tag_category_name}/tag/{tag_value}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tagCategoryName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

        if (tagValue != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagValue", tagValue));
        }

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
    private com.squareup.okhttp.Call deleteTagValidateBeforeCall(Integer xVolTenant, String tagCategoryName, String tagValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling deleteTag(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling deleteTag(Async)");
        }
        
        // verify the required parameter 'tagValue' is set
        if (tagValue == null) {
            throw new ApiException("Missing the required parameter 'tagValue' when calling deleteTag(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteTagCall(xVolTenant, tagCategoryName, tagValue, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Delete a Tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @return DeletedCountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedCountResponse deleteTag(Integer xVolTenant, String tagCategoryName, String tagValue) throws ApiException {
        ApiResponse<DeletedCountResponse> resp = deleteTagWithHttpInfo(xVolTenant, tagCategoryName, tagValue);
        return resp.getData();
    }

    /**
     * 
     * Delete a Tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @return ApiResponse&lt;DeletedCountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedCountResponse> deleteTagWithHttpInfo(Integer xVolTenant, String tagCategoryName, String tagValue) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, null, null);
        Type localVarReturnType = new TypeToken<DeletedCountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete a Tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagAsync(Integer xVolTenant, String tagCategoryName, String tagValue, final ApiCallback<DeletedCountResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedCountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTagCall(Integer xVolTenant, String tagCategoryName, String tagValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/tagCategory/{tag_category_name}/tag/{tag_value}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tagCategoryName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

        if (tagValue != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagValue", tagValue));
        }

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
    private com.squareup.okhttp.Call getTagValidateBeforeCall(Integer xVolTenant, String tagCategoryName, String tagValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling getTag(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling getTag(Async)");
        }
        
        // verify the required parameter 'tagValue' is set
        if (tagValue == null) {
            throw new ApiException("Missing the required parameter 'tagValue' when calling getTag(Async)");
        }
        

        com.squareup.okhttp.Call call = getTagCall(xVolTenant, tagCategoryName, tagValue, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag getTag(Integer xVolTenant, String tagCategoryName, String tagValue) throws ApiException {
        ApiResponse<Tag> resp = getTagWithHttpInfo(xVolTenant, tagCategoryName, tagValue);
        return resp.getData();
    }

    /**
     * 
     * Get a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> getTagWithHttpInfo(Integer xVolTenant, String tagCategoryName, String tagValue) throws ApiException {
        com.squareup.okhttp.Call call = getTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagAsync(Integer xVolTenant, String tagCategoryName, String tagValue, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param tag Request create or modify Tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTagCall(Integer xVolTenant, String tagCategoryName, String tagValue, Tag tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tag;

        // create path and map variables
        String localVarPath = "/v1/tagCategory/{tag_category_name}/tag/{tag_value}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tagCategoryName != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagCategoryName", tagCategoryName));
        }

        if (tagValue != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("tagValue", tagValue));
        }

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTagValidateBeforeCall(Integer xVolTenant, String tagCategoryName, String tagValue, Tag tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xVolTenant' is set
        if (xVolTenant == null) {
            throw new ApiException("Missing the required parameter 'xVolTenant' when calling updateTag(Async)");
        }
        
        // verify the required parameter 'tagCategoryName' is set
        if (tagCategoryName == null) {
            throw new ApiException("Missing the required parameter 'tagCategoryName' when calling updateTag(Async)");
        }
        
        // verify the required parameter 'tagValue' is set
        if (tagValue == null) {
            throw new ApiException("Missing the required parameter 'tagValue' when calling updateTag(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling updateTag(Async)");
        }
        

        com.squareup.okhttp.Call call = updateTagCall(xVolTenant, tagCategoryName, tagValue, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Update the designated tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param tag Request create or modify Tag (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag updateTag(Integer xVolTenant, String tagCategoryName, String tagValue, Tag tag) throws ApiException {
        ApiResponse<Tag> resp = updateTagWithHttpInfo(xVolTenant, tagCategoryName, tagValue, tag);
        return resp.getData();
    }

    /**
     * 
     * Update the designated tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param tag Request create or modify Tag (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> updateTagWithHttpInfo(Integer xVolTenant, String tagCategoryName, String tagValue, Tag tag) throws ApiException {
        com.squareup.okhttp.Call call = updateTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, tag, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update the designated tag
     * @param xVolTenant Tenant ID (required)
     * @param tagCategoryName Tag Category Name (required)
     * @param tagValue Tag Value (required)
     * @param tag Request create or modify Tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagAsync(Integer xVolTenant, String tagCategoryName, String tagValue, Tag tag, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTagValidateBeforeCall(xVolTenant, tagCategoryName, tagValue, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
