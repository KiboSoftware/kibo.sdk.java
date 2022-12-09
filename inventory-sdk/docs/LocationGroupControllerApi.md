# LocationGroupControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocationGroups**](LocationGroupControllerApi.md#getLocationGroups) | **GET** /v1/locationGroup/ | 


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups(xVolTenant)



Get LocationGroups

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.LocationGroupControllerApi;


LocationGroupControllerApi apiInstance = new LocationGroupControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    List<LocationGroupResponse> result = apiInstance.getLocationGroups(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationGroupControllerApi#getLocationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

