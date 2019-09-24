# MultiScopeInvitationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeInvitation**](MultiScopeInvitationApi.md#completeInvitation) | **POST** /platform/adminuser/multi-scope/invitations/{invitationId}/Complete | 
[**confirmInvitation**](MultiScopeInvitationApi.md#confirmInvitation) | **POST** /platform/adminuser/multi-scope/invitations/{invitationId}/Confirm | 
[**createInvitation**](MultiScopeInvitationApi.md#createInvitation) | **POST** /platform/adminuser/multi-scope/invitations | 
[**declineInvitation**](MultiScopeInvitationApi.md#declineInvitation) | **POST** /platform/adminuser/multi-scope/invitations/{invitationId}/Decline | 
[**deleteInvitation**](MultiScopeInvitationApi.md#deleteInvitation) | **DELETE** /platform/adminuser/multi-scope/invitations/{invitationId} | 
[**getInvitation**](MultiScopeInvitationApi.md#getInvitation) | **GET** /platform/adminuser/multi-scope/invitations/{invitationId} | 
[**getInvitations**](MultiScopeInvitationApi.md#getInvitations) | **GET** /platform/adminuser/multi-scope/invitations | 
[**resubmitInvitation**](MultiScopeInvitationApi.md#resubmitInvitation) | **POST** /platform/adminuser/multi-scope/invitations/{invitationId}/Resubmit | 


<a name="completeInvitation"></a>
# **completeInvitation**
> MultiScopeAdminUserAuthTicket completeInvitation(invitationId, xVolTenant, xVolSite, user)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    MultiScopeAdminUserAuthTicket result = apiInstance.completeInvitation(invitationId, xVolTenant, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#completeInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**MultiScopeAdminUserAuthTicket**](MultiScopeAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="confirmInvitation"></a>
# **confirmInvitation**
> confirmInvitation(invitationId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.confirmInvitation(invitationId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#confirmInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createInvitation"></a>
# **createInvitation**
> Invitation createInvitation(xVolTenant, xVolSite, invitation)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
Invitation invitation = new Invitation(); // Invitation | 
try {
    Invitation result = apiInstance.createInvitation(xVolTenant, xVolSite, invitation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#createInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **invitation** | [**Invitation**](Invitation.md)|  | [optional]

### Return type

[**Invitation**](Invitation.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="declineInvitation"></a>
# **declineInvitation**
> declineInvitation(invitationId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.declineInvitation(invitationId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#declineInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInvitation"></a>
# **deleteInvitation**
> deleteInvitation(invitationId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteInvitation(invitationId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#deleteInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInvitation"></a>
# **getInvitation**
> Invitation getInvitation(invitationId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    Invitation result = apiInstance.getInvitation(invitationId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#getInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**Invitation**](Invitation.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getInvitations"></a>
# **getInvitations**
> InvitationCollection getInvitations(xVolTenant, scopeType, scopeId, filter, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
String filter = "filter_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    InvitationCollection result = apiInstance.getInvitations(xVolTenant, scopeType, scopeId, filter, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#getInvitations");
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

[**InvitationCollection**](InvitationCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="resubmitInvitation"></a>
# **resubmitInvitation**
> resubmitInvitation(invitationId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeInvitationApi;

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

MultiScopeInvitationApi apiInstance = new MultiScopeInvitationApi();
String invitationId = "invitationId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.resubmitInvitation(invitationId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeInvitationApi#resubmitInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

