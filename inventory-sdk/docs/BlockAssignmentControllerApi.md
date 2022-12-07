# BlockAssignmentControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockAssignment**](BlockAssignmentControllerApi.md#blockAssignment) | **POST** /v5/inventory/blockAssignment/ | 


<a name="blockAssignment"></a>
# **blockAssignment**
> BaseResponse blockAssignment(xVolTenant, blockAssignmentRequest)



Setting the blockAssignment flag to true for the product based on the given request

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.BlockAssignmentControllerApi;


BlockAssignmentControllerApi apiInstance = new BlockAssignmentControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
BlockAssignmentRequest blockAssignmentRequest = new BlockAssignmentRequest(); // BlockAssignmentRequest | Request to block assignment on the product
try {
    BaseResponse result = apiInstance.blockAssignment(xVolTenant, blockAssignmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockAssignmentControllerApi#blockAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **blockAssignmentRequest** | [**BlockAssignmentRequest**](BlockAssignmentRequest.md)| Request to block assignment on the product |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

