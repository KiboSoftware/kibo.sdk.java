# PendingItemsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePendingItems**](PendingItemsControllerApi.md#deletePendingItems) | **DELETE** /v1/pendingItem/{pendingItemID} | 
[**getPendingItems**](PendingItemsControllerApi.md#getPendingItems) | **GET** /v1/pendingItem/ | 
[**releaseAllPendingItems**](PendingItemsControllerApi.md#releaseAllPendingItems) | **POST** /v1/pendingItem/release/ | 
[**releasePendingItems**](PendingItemsControllerApi.md#releasePendingItems) | **POST** /v1/pendingItem/release/{tenantID} | 


<a name="deletePendingItems"></a>
# **deletePendingItems**
> DeletedResponse deletePendingItems(xVolTenant, pendingItemID)



Delete Pending Items

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.PendingItemsControllerApi;


PendingItemsControllerApi apiInstance = new PendingItemsControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer pendingItemID = 56; // Integer | Pending Item ID
try {
    DeletedResponse result = apiInstance.deletePendingItems(xVolTenant, pendingItemID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PendingItemsControllerApi#deletePendingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **pendingItemID** | **Integer**| Pending Item ID |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPendingItems"></a>
# **getPendingItems**
> GetPendingItemsResponse getPendingItems(xVolTenant, locationName, locationID, currentPage, numberPerPage, sortBy, shipmentID)



Get Pending Items

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.PendingItemsControllerApi;


PendingItemsControllerApi apiInstance = new PendingItemsControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String locationName = "locationName_example"; // String | Location Name
Integer locationID = 56; // Integer | Location Identifier
Integer currentPage = 56; // Integer | Current display page
Integer numberPerPage = 56; // Integer | Number of items shown per page
String sortBy = "sortBy_example"; // String | Field to sort by (enum = {'QUANTITY', 'FROM', 'TO', 'TYPE', 'ORDER_ID', 'WEIGHT'})
Integer shipmentID = 56; // Integer | Shipment ID
try {
    GetPendingItemsResponse result = apiInstance.getPendingItems(xVolTenant, locationName, locationID, currentPage, numberPerPage, sortBy, shipmentID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PendingItemsControllerApi#getPendingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationName** | **String**| Location Name | [optional]
 **locationID** | **Integer**| Location Identifier | [optional]
 **currentPage** | **Integer**| Current display page | [optional]
 **numberPerPage** | **Integer**| Number of items shown per page | [optional]
 **sortBy** | **String**| Field to sort by (enum &#x3D; {&#39;QUANTITY&#39;, &#39;FROM&#39;, &#39;TO&#39;, &#39;TYPE&#39;, &#39;ORDER_ID&#39;, &#39;WEIGHT&#39;}) | [optional]
 **shipmentID** | **Integer**| Shipment ID | [optional]

### Return type

[**GetPendingItemsResponse**](GetPendingItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="releaseAllPendingItems"></a>
# **releaseAllPendingItems**
> BaseResponse releaseAllPendingItems(xVolTenant)



Release All Pending Items

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.PendingItemsControllerApi;


PendingItemsControllerApi apiInstance = new PendingItemsControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    BaseResponse result = apiInstance.releaseAllPendingItems(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PendingItemsControllerApi#releaseAllPendingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="releasePendingItems"></a>
# **releasePendingItems**
> BaseResponse releasePendingItems(xVolTenant, tenantID)



Release Pending Items

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.PendingItemsControllerApi;


PendingItemsControllerApi apiInstance = new PendingItemsControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer tenantID = 56; // Integer | Tenant ID to release
try {
    BaseResponse result = apiInstance.releasePendingItems(xVolTenant, tenantID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PendingItemsControllerApi#releasePendingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tenantID** | **Integer**| Tenant ID to release |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

