# InventoryJobControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllOldInventory**](InventoryJobControllerApi.md#deleteAllOldInventory) | **DELETE** /v1/deleteOldInventory/allSilo/{months} | 
[**deleteOldInventory**](InventoryJobControllerApi.md#deleteOldInventory) | **DELETE** /v1/deleteOldInventory/{months} | 


<a name="deleteAllOldInventory"></a>
# **deleteAllOldInventory**
> List&lt;JobIDResponse&gt; deleteAllOldInventory(xVolTenant, months)



Deletes older records from inventory table of all silos

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.InventoryJobControllerApi;


InventoryJobControllerApi apiInstance = new InventoryJobControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer months = 56; // Integer | The x months before which we want the records to get deleted
try {
    List<JobIDResponse> result = apiInstance.deleteAllOldInventory(xVolTenant, months);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryJobControllerApi#deleteAllOldInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **months** | **Integer**| The x months before which we want the records to get deleted |

### Return type

[**List&lt;JobIDResponse&gt;**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOldInventory"></a>
# **deleteOldInventory**
> JobIDResponse deleteOldInventory(xVolTenant, months)



Deletes older records from inventory table

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.InventoryJobControllerApi;


InventoryJobControllerApi apiInstance = new InventoryJobControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer months = 56; // Integer | The x months before which we want the records to get deleted
try {
    JobIDResponse result = apiInstance.deleteOldInventory(xVolTenant, months);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryJobControllerApi#deleteOldInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **months** | **Integer**| The x months before which we want the records to get deleted |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

