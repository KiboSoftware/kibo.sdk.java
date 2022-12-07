# FutureDateControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustFutureDate**](FutureDateControllerApi.md#adjustFutureDate) | **PUT** /adjustFutureDate/{futureInventoryID}/ | 


<a name="adjustFutureDate"></a>
# **adjustFutureDate**
> JobQueueResponse adjustFutureDate(xVolTenant, futureInventoryID)



Adjust future_date of future inventory

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.FutureDateControllerApi;


FutureDateControllerApi apiInstance = new FutureDateControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long futureInventoryID = 56L; // Long | id of the future_inventory row in db
try {
    JobQueueResponse result = apiInstance.adjustFutureDate(xVolTenant, futureInventoryID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FutureDateControllerApi#adjustFutureDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **futureInventoryID** | **Long**| id of the future_inventory row in db |

### Return type

[**JobQueueResponse**](JobQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

