# AllocationControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateInventory**](AllocationControllerApi.md#allocateInventory) | **POST** /v5/inventory/allocate/ | 
[**deallocateInventory**](AllocationControllerApi.md#deallocateInventory) | **POST** /v5/inventory/deallocate/ | 
[**fulfillInventory**](AllocationControllerApi.md#fulfillInventory) | **POST** /v5/inventory/fulfill/ | 


<a name="allocateInventory"></a>
# **allocateInventory**
> JobQueueResponse allocateInventory(xVolTenant, allocateInventoryRequest)



Allocates inventory based on the given request

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.AllocationControllerApi;


AllocationControllerApi apiInstance = new AllocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
try {
    JobQueueResponse result = apiInstance.allocateInventory(xVolTenant, allocateInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationControllerApi#allocateInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deallocateInventory"></a>
# **deallocateInventory**
> BaseResponse deallocateInventory(xVolTenant, allocateInventoryRequest)



Deallocates inventory based on the given request

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.AllocationControllerApi;


AllocationControllerApi apiInstance = new AllocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
try {
    BaseResponse result = apiInstance.deallocateInventory(xVolTenant, allocateInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationControllerApi#deallocateInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fulfillInventory"></a>
# **fulfillInventory**
> BaseResponse fulfillInventory(xVolTenant, allocateInventoryRequest)



Fulfills inventory based on the given request

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.AllocationControllerApi;


AllocationControllerApi apiInstance = new AllocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AllocateInventoryRequest allocateInventoryRequest = new AllocateInventoryRequest(); // AllocateInventoryRequest | Request to allocate inventory
try {
    BaseResponse result = apiInstance.fulfillInventory(xVolTenant, allocateInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllocationControllerApi#fulfillInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **allocateInventoryRequest** | [**AllocateInventoryRequest**](AllocateInventoryRequest.md)| Request to allocate inventory |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

