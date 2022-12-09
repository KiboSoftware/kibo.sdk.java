# ModifyInventoryControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjust**](ModifyInventoryControllerApi.md#adjust) | **POST** /v5/inventory/adjust/ | 
[**delete**](ModifyInventoryControllerApi.md#delete) | **POST** /v5/inventory/delete/ | 
[**deleteFutureInventory**](ModifyInventoryControllerApi.md#deleteFutureInventory) | **POST** /v5/inventory/deleteFutureInventory/ | 
[**deleteItems**](ModifyInventoryControllerApi.md#deleteItems) | **POST** /v5/inventory/deleteItems/ | 
[**refresh**](ModifyInventoryControllerApi.md#refresh) | **POST** /v5/inventory/refresh/ | 


<a name="adjust"></a>
# **adjust**
> JobIDResponse adjust(xVolTenant, adjustRequest)



Adjust Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | Request to adjust inventory
try {
    JobIDResponse result = apiInstance.adjust(xVolTenant, adjustRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#adjust");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **adjustRequest** | [**AdjustRequest**](AdjustRequest.md)| Request to adjust inventory |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteItemResponse delete(xVolTenant, deleteItemRequest, xVolSite)



Delete Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
DeleteItemRequest deleteItemRequest = new DeleteItemRequest(); // DeleteItemRequest | Request to delete item(s)
Integer xVolSite = 56; // Integer | Site ID
try {
    DeleteItemResponse result = apiInstance.delete(xVolTenant, deleteItemRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **deleteItemRequest** | [**DeleteItemRequest**](DeleteItemRequest.md)| Request to delete item(s) |
 **xVolSite** | **Integer**| Site ID | [optional]

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFutureInventory"></a>
# **deleteFutureInventory**
> DeleteFutureItemResponse deleteFutureInventory(xVolTenant, deleteFutureItemRequest, xVolSite)



Delete Future Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
DeleteFutureItemRequest deleteFutureItemRequest = new DeleteFutureItemRequest(); // DeleteFutureItemRequest | Request to delete future item(s)
Integer xVolSite = 56; // Integer | Site ID
try {
    DeleteFutureItemResponse result = apiInstance.deleteFutureInventory(xVolTenant, deleteFutureItemRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#deleteFutureInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **deleteFutureItemRequest** | [**DeleteFutureItemRequest**](DeleteFutureItemRequest.md)| Request to delete future item(s) |
 **xVolSite** | **Integer**| Site ID | [optional]

### Return type

[**DeleteFutureItemResponse**](DeleteFutureItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItems"></a>
# **deleteItems**
> DeleteItemResponse deleteItems(xVolTenant, deleteItemsRequest, xVolSite)



Delete Multiple Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
DeleteItemsRequest deleteItemsRequest = new DeleteItemsRequest(); // DeleteItemsRequest | Request to batch delete items
Integer xVolSite = 56; // Integer | Site ID
try {
    DeleteItemResponse result = apiInstance.deleteItems(xVolTenant, deleteItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#deleteItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **deleteItemsRequest** | [**DeleteItemsRequest**](DeleteItemsRequest.md)| Request to batch delete items |
 **xVolSite** | **Integer**| Site ID | [optional]

### Return type

[**DeleteItemResponse**](DeleteItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refresh"></a>
# **refresh**
> JobIDResponse refresh(xVolTenant, refreshRequest)



Refresh Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | Request to refresh inventory
try {
    JobIDResponse result = apiInstance.refresh(xVolTenant, refreshRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#refresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)| Request to refresh inventory |

### Return type

[**JobIDResponse**](JobIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

