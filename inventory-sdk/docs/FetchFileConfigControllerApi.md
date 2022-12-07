# FetchFileConfigControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFetchConfig**](FetchFileConfigControllerApi.md#deleteFetchConfig) | **DELETE** /v1/config/fetchfile/{fetchFileConfigID} | 
[**getFetchConfig**](FetchFileConfigControllerApi.md#getFetchConfig) | **GET** /v1/config/fetchfile/ | 
[**saveFetchConfig**](FetchFileConfigControllerApi.md#saveFetchConfig) | **POST** /v1/config/fetchfile/ | 
[**testConnection**](FetchFileConfigControllerApi.md#testConnection) | **GET** /v1/config/fetchfile/testConnection/{fetchFileConfigID} | 


<a name="deleteFetchConfig"></a>
# **deleteFetchConfig**
> DeletedResponse deleteFetchConfig(xVolTenant, fetchFileConfigID)



Deletes a fetch file config

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.FetchFileConfigControllerApi;


FetchFileConfigControllerApi apiInstance = new FetchFileConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long fetchFileConfigID = 56L; // Long | Id of fetch file config
try {
    DeletedResponse result = apiInstance.deleteFetchConfig(xVolTenant, fetchFileConfigID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FetchFileConfigControllerApi#deleteFetchConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **fetchFileConfigID** | **Long**| Id of fetch file config |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFetchConfig"></a>
# **getFetchConfig**
> MFetchFileConfig getFetchConfig(xVolTenant)



Get the Fetch File Configs for the current tenant

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.FetchFileConfigControllerApi;


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
> BaseResponse saveFetchConfig(xVolTenant, fetchFileConfigRequest)



Save a new Fetch File Config

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.FetchFileConfigControllerApi;


FetchFileConfigControllerApi apiInstance = new FetchFileConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
FetchFileConfigRequest fetchFileConfigRequest = new FetchFileConfigRequest(); // FetchFileConfigRequest | Request to fetch file configs
try {
    BaseResponse result = apiInstance.saveFetchConfig(xVolTenant, fetchFileConfigRequest);
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

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testConnection"></a>
# **testConnection**
> FetchFileConnectionResponse testConnection(xVolTenant, fetchFileConfigID)



Attempts to connect to a fetch file endpoint and lists current files if successful

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.FetchFileConfigControllerApi;


FetchFileConfigControllerApi apiInstance = new FetchFileConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long fetchFileConfigID = 56L; // Long | Id of fetch file config
try {
    FetchFileConnectionResponse result = apiInstance.testConnection(xVolTenant, fetchFileConfigID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FetchFileConfigControllerApi#testConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **fetchFileConfigID** | **Long**| Id of fetch file config |

### Return type

[**FetchFileConnectionResponse**](FetchFileConnectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

