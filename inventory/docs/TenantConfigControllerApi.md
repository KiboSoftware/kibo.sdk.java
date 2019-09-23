# TenantConfigControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenantConfig**](TenantConfigControllerApi.md#createTenantConfig) | **POST** /v1/tenantConfig/ | 
[**getTenantConfig**](TenantConfigControllerApi.md#getTenantConfig) | **GET** /v1/tenantConfig/ | 


<a name="createTenantConfig"></a>
# **createTenantConfig**
> Integer createTenantConfig(updateTenantConfigRequest)



Creates or updates tenant config

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.TenantConfigControllerApi;


TenantConfigControllerApi apiInstance = new TenantConfigControllerApi();
UpdateTenantConfigRequest updateTenantConfigRequest = new UpdateTenantConfigRequest(); // UpdateTenantConfigRequest | Request to create tenant config
try {
    Integer result = apiInstance.createTenantConfig(updateTenantConfigRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantConfigControllerApi#createTenantConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTenantConfigRequest** | [**UpdateTenantConfigRequest**](UpdateTenantConfigRequest.md)| Request to create tenant config |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTenantConfig"></a>
# **getTenantConfig**
> TenantConfigModel getTenantConfig(xVolTenant)



Gets tenant config

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.TenantConfigControllerApi;


TenantConfigControllerApi apiInstance = new TenantConfigControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    TenantConfigModel result = apiInstance.getTenantConfig(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantConfigControllerApi#getTenantConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**TenantConfigModel**](TenantConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

