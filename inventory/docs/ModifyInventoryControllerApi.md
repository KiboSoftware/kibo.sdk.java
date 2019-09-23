# ModifyInventoryControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjust**](ModifyInventoryControllerApi.md#adjust) | **POST** /v5/inventory/adjust/ | 
[**delete**](ModifyInventoryControllerApi.md#delete) | **POST** /v5/inventory/delete/ | 
[**refresh**](ModifyInventoryControllerApi.md#refresh) | **POST** /v5/inventory/refresh/ | 
[**syncAdjust**](ModifyInventoryControllerApi.md#syncAdjust) | **POST** /v5/inventory/sync-adjust/ | 
[**syncRefresh**](ModifyInventoryControllerApi.md#syncRefresh) | **POST** /v5/inventory/sync-refresh/ | 


<a name="adjust"></a>
# **adjust**
> Integer adjust(xVolTenant, adjustRequest)



Adjust Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | Request to adjust inventory
try {
    Integer result = apiInstance.adjust(xVolTenant, adjustRequest);
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

**Integer**

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
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.ModifyInventoryControllerApi;


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

<a name="refresh"></a>
# **refresh**
> Integer refresh(xVolTenant, refreshRequest)



Refresh Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | Request to refresh inventory
try {
    Integer result = apiInstance.refresh(xVolTenant, refreshRequest);
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

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncAdjust"></a>
# **syncAdjust**
> List&lt;InventoryResponse&gt; syncAdjust(xVolTenant, adjustRequest)



Adjust Inventory - synchronous

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AdjustRequest adjustRequest = new AdjustRequest(); // AdjustRequest | Request to adjust inventory
try {
    List<InventoryResponse> result = apiInstance.syncAdjust(xVolTenant, adjustRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#syncAdjust");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **adjustRequest** | [**AdjustRequest**](AdjustRequest.md)| Request to adjust inventory |

### Return type

[**List&lt;InventoryResponse&gt;**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncRefresh"></a>
# **syncRefresh**
> List&lt;InventoryResponse&gt; syncRefresh(xVolTenant, refreshRequest)



Refresh Inventory - synchronous

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.ModifyInventoryControllerApi;


ModifyInventoryControllerApi apiInstance = new ModifyInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | Request to refresh inventory
try {
    List<InventoryResponse> result = apiInstance.syncRefresh(xVolTenant, refreshRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModifyInventoryControllerApi#syncRefresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)| Request to refresh inventory |

### Return type

[**List&lt;InventoryResponse&gt;**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

