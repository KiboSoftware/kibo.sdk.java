# JobControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJob**](JobControllerApi.md#getJob) | **GET** /v1/queue/{jobID}/ | 
[**getJobs**](JobControllerApi.md#getJobs) | **GET** /v1/queue/ | 


<a name="getJob"></a>
# **getJob**
> JobQueueResponse getJob(xVolTenant, jobID)



Get the specified job

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.JobControllerApi;


JobControllerApi apiInstance = new JobControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long jobID = 56L; // Long | Id of bin to get
try {
    JobQueueResponse result = apiInstance.getJob(xVolTenant, jobID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **jobID** | **Long**| Id of bin to get |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJobs"></a>
# **getJobs**
> List&lt;JobQueueResponse&gt; getJobs(xVolTenant, locationCode, limit, owner, types, originalFilename)



Get the requested jobs

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.JobControllerApi;


JobControllerApi apiInstance = new JobControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String locationCode = "locationCode_example"; // String | Tenant specified unique Identifier of the owning location
Integer limit = 56; // Integer | The maximum number of results to return, defaults to 100 for most
String owner = "owner_example"; // String | User that owns the job
List<String> types = Arrays.asList(); // List<String> | Type of the Job Queue Request
String originalFilename = "originalFilename_example"; // String | The full name of the file that was picked up at the secure droppoint server before being split up by location.
try {
    List<JobQueueResponse> result = apiInstance.getJobs(xVolTenant, locationCode, limit, owner, types, originalFilename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#getJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationCode** | **String**| Tenant specified unique Identifier of the owning location | [optional]
 **limit** | **Integer**| The maximum number of results to return, defaults to 100 for most | [optional]
 **owner** | **String**| User that owns the job | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Type of the Job Queue Request | [optional] [enum: REFRESH, ADJUST, RELEASE_SHIPMENTS, CREATE_PICK_WAVE, CLOSE_PICK_WAVE, PUT_AWAY_FILE, SHORT_PICK_ERROR, BIN_AUDIT_START, BIN_AUDIT_COMPLETION, CREATE_BIN_AUDIT, RELEASE_PENDING_ITEMS]
 **originalFilename** | **String**| The full name of the file that was picked up at the secure droppoint server before being split up by location. | [optional]

### Return type

[**List&lt;JobQueueResponse&gt;**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

