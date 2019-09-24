# PublicAdminAuthTicketApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserAuthTicket**](PublicAdminAuthTicketApi.md#createUserAuthTicket) | **POST** /platform/adminuser/authtickets/tenants | 
[**deleteUserAuthTicket**](PublicAdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/adminuser/authtickets | 
[**refreshAuthTicket**](PublicAdminAuthTicketApi.md#refreshAuthTicket) | **PUT** /platform/adminuser/authtickets/tenants | 


<a name="createUserAuthTicket"></a>
# **createUserAuthTicket**
> TenantAdminUserAuthTicket createUserAuthTicket(xVolTenant, tenantId, xVolSite, userAuthInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminAuthTicketApi;

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

PublicAdminAuthTicketApi apiInstance = new PublicAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
Integer tenantId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | 
try {
    TenantAdminUserAuthTicket result = apiInstance.createUserAuthTicket(xVolTenant, tenantId, xVolSite, userAuthInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminAuthTicketApi#createUserAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **tenantId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **userAuthInfo** | [**UserAuthInfo**](UserAuthInfo.md)|  | [optional]

### Return type

[**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="deleteUserAuthTicket"></a>
# **deleteUserAuthTicket**
> deleteUserAuthTicket(xVolTenant, refreshToken, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminAuthTicketApi;

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

PublicAdminAuthTicketApi apiInstance = new PublicAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
String refreshToken = "refreshToken_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteUserAuthTicket(xVolTenant, refreshToken, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminAuthTicketApi#deleteUserAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **refreshToken** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="refreshAuthTicket"></a>
# **refreshAuthTicket**
> TenantAdminUserAuthTicket refreshAuthTicket(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminAuthTicketApi;

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

PublicAdminAuthTicketApi apiInstance = new PublicAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
Integer tenantId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
TenantAdminUserAuthTicket tenantAdminUserAuthTicket = new TenantAdminUserAuthTicket(); // TenantAdminUserAuthTicket | 
try {
    TenantAdminUserAuthTicket result = apiInstance.refreshAuthTicket(xVolTenant, tenantId, xVolSite, tenantAdminUserAuthTicket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminAuthTicketApi#refreshAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **tenantId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **tenantAdminUserAuthTicket** | [**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)|  | [optional]

### Return type

[**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

