# PublicDeveloperAdminAuthTicketApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeveloperUserAuthTicket**](PublicDeveloperAdminAuthTicketApi.md#createDeveloperUserAuthTicket) | **POST** /platform/developer/authtickets | 
[**deleteUserAuthTicket**](PublicDeveloperAdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/developer/authtickets | 
[**refreshDeveloperAuthTicket**](PublicDeveloperAdminAuthTicketApi.md#refreshDeveloperAuthTicket) | **PUT** /platform/developer/authtickets | 


<a name="createDeveloperUserAuthTicket"></a>
# **createDeveloperUserAuthTicket**
> DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(xVolTenant, developerAccountId, xVolSite, userAuthInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicDeveloperAdminAuthTicketApi;

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

PublicDeveloperAdminAuthTicketApi apiInstance = new PublicDeveloperAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
Integer developerAccountId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | 
try {
    DeveloperAdminUserAuthTicket result = apiInstance.createDeveloperUserAuthTicket(xVolTenant, developerAccountId, xVolSite, userAuthInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicDeveloperAdminAuthTicketApi#createDeveloperUserAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **developerAccountId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **userAuthInfo** | [**UserAuthInfo**](UserAuthInfo.md)|  | [optional]

### Return type

[**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)

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
//import com.kibocommerce.kibo.sdk.java.auth.PublicDeveloperAdminAuthTicketApi;

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

PublicDeveloperAdminAuthTicketApi apiInstance = new PublicDeveloperAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
String refreshToken = "refreshToken_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteUserAuthTicket(xVolTenant, refreshToken, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicDeveloperAdminAuthTicketApi#deleteUserAuthTicket");
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

<a name="refreshDeveloperAuthTicket"></a>
# **refreshDeveloperAuthTicket**
> DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(xVolTenant, developerAccountId, xVolSite, developerAdminUserAuthTicket)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicDeveloperAdminAuthTicketApi;

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

PublicDeveloperAdminAuthTicketApi apiInstance = new PublicDeveloperAdminAuthTicketApi();
Integer xVolTenant = 56; // Integer | 
Integer developerAccountId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = new DeveloperAdminUserAuthTicket(); // DeveloperAdminUserAuthTicket | 
try {
    DeveloperAdminUserAuthTicket result = apiInstance.refreshDeveloperAuthTicket(xVolTenant, developerAccountId, xVolSite, developerAdminUserAuthTicket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicDeveloperAdminAuthTicketApi#refreshDeveloperAuthTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **developerAccountId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **developerAdminUserAuthTicket** | [**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)|  | [optional]

### Return type

[**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

