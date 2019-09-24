# MultiScopeAdminAuthTicketApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserAuthTicket**](MultiScopeAdminAuthTicketApi.md#createUserAuthTicket) | **POST** /platform/adminuser/multi-scope/authtickets | 
[**deleteUserAuthTicket**](MultiScopeAdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/adminuser/multi-scope/authtickets | 
[**getTokenInfo**](MultiScopeAdminAuthTicketApi.md#getTokenInfo) | **POST** /platform/adminuser/multi-scope/authtickets/tokeninfo | 
[**refreshUserAuthTicket**](MultiScopeAdminAuthTicketApi.md#refreshUserAuthTicket) | **PUT** /platform/adminuser/multi-scope/authtickets | 


<a name="createUserAuthTicket"></a>
# **createUserAuthTicket**
> MultiScopeAdminUserAuthTicket createUserAuthTicket(xVolTenant, scopeType, scopeId, autoAssignScope, xVolSite, userAuthInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminAuthTicketApi;

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

MultiScopeAdminAuthTicketApi apiInstance = new MultiScopeAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Boolean autoAssignScope = true; // Boolean | 
Integer xVolSite = 56; // Integer | 
UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | 
try {
    MultiScopeAdminUserAuthTicket result = apiInstance.createUserAuthTicket(xVolTenant, scopeType, scopeId, autoAssignScope, xVolSite, userAuthInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminAuthTicketApi#createUserAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **autoAssignScope** | **Boolean**|  | [optional] [default to true]
 **xVolSite** | **Integer**|  | [optional]
 **userAuthInfo** | [**UserAuthInfo**](UserAuthInfo.md)|  | [optional]

### Return type

[**MultiScopeAdminUserAuthTicket**](MultiScopeAdminUserAuthTicket.md)

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
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminAuthTicketApi;

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

MultiScopeAdminAuthTicketApi apiInstance = new MultiScopeAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
String refreshToken = "refreshToken_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteUserAuthTicket(xVolTenant, refreshToken, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminAuthTicketApi#deleteUserAuthTicket");
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

<a name="getTokenInfo"></a>
# **getTokenInfo**
> TokenInfo getTokenInfo(xVolTenant, xVolSite, body)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminAuthTicketApi;

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

MultiScopeAdminAuthTicketApi apiInstance = new MultiScopeAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
String body = "body_example"; // String | 
try {
    TokenInfo result = apiInstance.getTokenInfo(xVolTenant, xVolSite, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminAuthTicketApi#getTokenInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

[**TokenInfo**](TokenInfo.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="refreshUserAuthTicket"></a>
# **refreshUserAuthTicket**
> MultiScopeAdminUserAuthTicket refreshUserAuthTicket(xVolTenant, refreshToken, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminAuthTicketApi;

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

MultiScopeAdminAuthTicketApi apiInstance = new MultiScopeAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
String refreshToken = "refreshToken_example"; // String | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    MultiScopeAdminUserAuthTicket result = apiInstance.refreshUserAuthTicket(xVolTenant, refreshToken, scopeType, scopeId, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminAuthTicketApi#refreshUserAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **refreshToken** | **String**|  | [optional]
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**MultiScopeAdminUserAuthTicket**](MultiScopeAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json
