# LocationControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocationGroups**](LocationControllerApi.md#getLocationGroups) | **GET** /v1/location/{locationGroupCode} | 
[**getLocations**](LocationControllerApi.md#getLocations) | **GET** /v1/location/ | 
[**getLocations_0**](LocationControllerApi.md#getLocations_0) | **GET** /v1/location/{locationCode} | 
[**saveLocation**](LocationControllerApi.md#saveLocation) | **POST** /v1/location/ | 


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups(xVolTenant, locationGroupCode)



Get LocationGroups

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.LocationControllerApi;


LocationControllerApi apiInstance = new LocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String locationGroupCode = "locationGroupCode_example"; // String | Location Group Code of the location to get
try {
    List<LocationGroupResponse> result = apiInstance.getLocationGroups(xVolTenant, locationGroupCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationControllerApi#getLocationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationGroupCode** | **String**| Location Group Code of the location to get |

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocations"></a>
# **getLocations**
> List&lt;LocationResponse&gt; getLocations(xVolTenant)



Get Locations

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.LocationControllerApi;


LocationControllerApi apiInstance = new LocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    List<LocationResponse> result = apiInstance.getLocations(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationControllerApi#getLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocations_0"></a>
# **getLocations_0**
> List&lt;LocationResponse&gt; getLocations_0(xVolTenant, locationCode)



Get Locations

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.LocationControllerApi;


LocationControllerApi apiInstance = new LocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String locationCode = "locationCode_example"; // String | Location Code of the location to get
try {
    List<LocationResponse> result = apiInstance.getLocations_0(xVolTenant, locationCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationControllerApi#getLocations_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationCode** | **String**| Location Code of the location to get |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveLocation"></a>
# **saveLocation**
> List&lt;LocationResponse&gt; saveLocation(xVolTenant, locationRequest)



Save Location

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.LocationControllerApi;


LocationControllerApi apiInstance = new LocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
LocationRequest locationRequest = new LocationRequest(); // LocationRequest | Location Request Object
try {
    List<LocationResponse> result = apiInstance.saveLocation(xVolTenant, locationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationControllerApi#saveLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationRequest** | [**LocationRequest**](LocationRequest.md)| Location Request Object |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

