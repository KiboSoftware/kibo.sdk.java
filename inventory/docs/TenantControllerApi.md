# TenantControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneTenant**](TenantControllerApi.md#cloneTenant) | **POST** /v1/tenant/clone | 
[**createTenant**](TenantControllerApi.md#createTenant) | **POST** /v1/tenant/ | 
[**deleteTenant**](TenantControllerApi.md#deleteTenant) | **DELETE** /v1/tenant | 


<a name="cloneTenant"></a>
# **cloneTenant**
> Integer cloneTenant(cloneTenantRequest)



Clones a tenant

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.TenantControllerApi;


TenantControllerApi apiInstance = new TenantControllerApi();
CloneTenantRequest cloneTenantRequest = new CloneTenantRequest(); // CloneTenantRequest | Request to clone a tenant
try {
    Integer result = apiInstance.cloneTenant(cloneTenantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantControllerApi#cloneTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloneTenantRequest** | [**CloneTenantRequest**](CloneTenantRequest.md)| Request to clone a tenant |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTenant"></a>
# **createTenant**
> Integer createTenant(createTenantRequest)



Creates a tenant

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.TenantControllerApi;


TenantControllerApi apiInstance = new TenantControllerApi();
CreateTenantRequest createTenantRequest = new CreateTenantRequest(); // CreateTenantRequest | Request to create a tenant
try {
    Integer result = apiInstance.createTenant(createTenantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantControllerApi#createTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTenantRequest** | [**CreateTenantRequest**](CreateTenantRequest.md)| Request to create a tenant |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTenant"></a>
# **deleteTenant**
> Boolean deleteTenant(xVolTenant)



Deletes a tenant

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.TenantControllerApi;


TenantControllerApi apiInstance = new TenantControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    Boolean result = apiInstance.deleteTenant(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantControllerApi#deleteTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

