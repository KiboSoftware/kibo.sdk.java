# MultiScopeRoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](MultiScopeRoleApi.md#createRole) | **POST** /platform/adminuser/multi-scope/roles | 
[**deleteRole**](MultiScopeRoleApi.md#deleteRole) | **DELETE** /platform/adminuser/multi-scope/roles/{roleId} | 
[**getRole**](MultiScopeRoleApi.md#getRole) | **GET** /platform/adminuser/multi-scope/roles/{roleId} | 
[**getRoles**](MultiScopeRoleApi.md#getRoles) | **GET** /platform/adminuser/multi-scope/roles | 
[**updateRole**](MultiScopeRoleApi.md#updateRole) | **PUT** /platform/adminuser/multi-scope/roles/{roleId} | 


<a name="createRole"></a>
# **createRole**
> Role createRole(xVolTenant, scopeType, scopeId, xVolSite, role)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeRoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-vol-app-claims
ApiKeyAuth x-vol-app-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-app-claims");
x-vol-app-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-app-claims.setApiKeyPrefix("Token");

// Configure API key authorization: x-vol-user-claims
ApiKeyAuth x-vol-user-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-user-claims");
x-vol-user-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-user-claims.setApiKeyPrefix("Token");

MultiScopeRoleApi apiInstance = new MultiScopeRoleApi();
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
Role role = new Role(); // Role | 
try {
    Role result = apiInstance.createRole(xVolTenant, scopeType, scopeId, xVolSite, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeRoleApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **role** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="deleteRole"></a>
# **deleteRole**
> deleteRole(roleId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeRoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-vol-app-claims
ApiKeyAuth x-vol-app-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-app-claims");
x-vol-app-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-app-claims.setApiKeyPrefix("Token");

// Configure API key authorization: x-vol-user-claims
ApiKeyAuth x-vol-user-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-user-claims");
x-vol-user-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-user-claims.setApiKeyPrefix("Token");

MultiScopeRoleApi apiInstance = new MultiScopeRoleApi();
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteRole(roleId, xVolTenant, scopeType, scopeId, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeRoleApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRole"></a>
# **getRole**
> Role getRole(roleId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeRoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-vol-app-claims
ApiKeyAuth x-vol-app-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-app-claims");
x-vol-app-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-app-claims.setApiKeyPrefix("Token");

// Configure API key authorization: x-vol-user-claims
ApiKeyAuth x-vol-user-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-user-claims");
x-vol-user-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-user-claims.setApiKeyPrefix("Token");

MultiScopeRoleApi apiInstance = new MultiScopeRoleApi();
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    Role result = apiInstance.getRole(roleId, xVolTenant, scopeType, scopeId, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeRoleApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getRoles"></a>
# **getRoles**
> RoleCollection getRoles(xVolTenant, scopeType, scopeId, filter, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeRoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-vol-app-claims
ApiKeyAuth x-vol-app-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-app-claims");
x-vol-app-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-app-claims.setApiKeyPrefix("Token");

// Configure API key authorization: x-vol-user-claims
ApiKeyAuth x-vol-user-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-user-claims");
x-vol-user-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-user-claims.setApiKeyPrefix("Token");

MultiScopeRoleApi apiInstance = new MultiScopeRoleApi();
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
String filter = "filter_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    RoleCollection result = apiInstance.getRoles(xVolTenant, scopeType, scopeId, filter, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeRoleApi#getRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**RoleCollection**](RoleCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="updateRole"></a>
# **updateRole**
> Role updateRole(roleId, xVolTenant, scopeType, scopeId, xVolSite, role)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeRoleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x-vol-app-claims
ApiKeyAuth x-vol-app-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-app-claims");
x-vol-app-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-app-claims.setApiKeyPrefix("Token");

// Configure API key authorization: x-vol-user-claims
ApiKeyAuth x-vol-user-claims = (ApiKeyAuth) defaultClient.getAuthentication("x-vol-user-claims");
x-vol-user-claims.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x-vol-user-claims.setApiKeyPrefix("Token");

MultiScopeRoleApi apiInstance = new MultiScopeRoleApi();
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
Role role = new Role(); // Role | 
try {
    Role result = apiInstance.updateRole(roleId, xVolTenant, scopeType, scopeId, xVolSite, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeRoleApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **role** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

