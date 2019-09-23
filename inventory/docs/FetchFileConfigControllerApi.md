# FetchFileConfigControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFetchConfig**](FetchFileConfigControllerApi.md#getFetchConfig) | **GET** /v1/config/fetchfile/ | 
[**saveFetchConfig**](FetchFileConfigControllerApi.md#saveFetchConfig) | **POST** /v1/config/fetchfile/ | 


<a name="getFetchConfig"></a>
# **getFetchConfig**
> MFetchFileConfig getFetchConfig(xVolTenant)



Get the Fetch File Configs for the current tenant

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.FetchFileConfigControllerApi;


FetchFileConfigControllerApi apiInstance = new FetchFileConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    MFetchFileConfig result = apiInstance.getFetchConfig(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FetchFileConfigControllerApi#getFetchConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**MFetchFileConfig**](MFetchFileConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveFetchConfig"></a>
# **saveFetchConfig**
> Boolean saveFetchConfig(xVolTenant, fetchFileConfigRequest)



Save a new Fetch File Config

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.FetchFileConfigControllerApi;


FetchFileConfigControllerApi apiInstance = new FetchFileConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
FetchFileConfigRequest fetchFileConfigRequest = new FetchFileConfigRequest(); // FetchFileConfigRequest | Request to fetch file configs
try {
    Boolean result = apiInstance.saveFetchConfig(xVolTenant, fetchFileConfigRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FetchFileConfigControllerApi#saveFetchConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **fetchFileConfigRequest** | [**FetchFileConfigRequest**](FetchFileConfigRequest.md)| Request to fetch file configs |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

