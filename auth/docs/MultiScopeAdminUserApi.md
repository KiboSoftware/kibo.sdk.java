# MultiScopeAdminUserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserRole**](MultiScopeAdminUserApi.md#addUserRole) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/roles/{roleId} | 
[**changePassword**](MultiScopeAdminUserApi.md#changePassword) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/Change-Password | 
[**changeUserPassword**](MultiScopeAdminUserApi.md#changeUserPassword) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/Change-User-Password | 
[**createUser**](MultiScopeAdminUserApi.md#createUser) | **POST** /platform/adminuser/multi-scope/accounts | 
[**createUserAndAuthenticate**](MultiScopeAdminUserApi.md#createUserAndAuthenticate) | **POST** /platform/adminuser/multi-scope/accounts/Create-And-Authenticate | 
[**createUsers**](MultiScopeAdminUserApi.md#createUsers) | **POST** /platform/adminuser/multi-scope/accounts/Create-Many | 
[**deleteUser**](MultiScopeAdminUserApi.md#deleteUser) | **DELETE** /platform/adminuser/multi-scope/accounts/{userId} | 
[**disableUser**](MultiScopeAdminUserApi.md#disableUser) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/disable | 
[**enableUser**](MultiScopeAdminUserApi.md#enableUser) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/enable | 
[**getUser**](MultiScopeAdminUserApi.md#getUser) | **GET** /platform/adminuser/multi-scope/accounts/{userId} | 
[**getUserBehaviors**](MultiScopeAdminUserApi.md#getUserBehaviors) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/behaviors | 
[**getUserRoles**](MultiScopeAdminUserApi.md#getUserRoles) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/roles | 
[**getUserScopeDevAccounts**](MultiScopeAdminUserApi.md#getUserScopeDevAccounts) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/devAccountScopes | 
[**getUserScopeTenants**](MultiScopeAdminUserApi.md#getUserScopeTenants) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/tenantScopes | 
[**getUserScopes**](MultiScopeAdminUserApi.md#getUserScopes) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/scopes | 
[**getUserTenantsByUserAndBehavior**](MultiScopeAdminUserApi.md#getUserTenantsByUserAndBehavior) | **GET** /platform/adminuser/multi-scope/accounts/{userId}/behaviors/{behaviorId} | 
[**getUsers**](MultiScopeAdminUserApi.md#getUsers) | **GET** /platform/adminuser/multi-scope/accounts | 
[**removeUserRole**](MultiScopeAdminUserApi.md#removeUserRole) | **DELETE** /platform/adminuser/multi-scope/accounts/{userId}/roles/{roleId} | 
[**resetPassword**](MultiScopeAdminUserApi.md#resetPassword) | **POST** /platform/adminuser/multi-scope/accounts/Reset-Password | 
[**unlockUser**](MultiScopeAdminUserApi.md#unlockUser) | **POST** /platform/adminuser/multi-scope/accounts/{userId}/unlock | 
[**updateForgottenPassword**](MultiScopeAdminUserApi.md#updateForgottenPassword) | **POST** /platform/adminuser/multi-scope/accounts/Update-Forgotten-Password | 
[**updateUser**](MultiScopeAdminUserApi.md#updateUser) | **PUT** /platform/adminuser/multi-scope/accounts/{userId} | 


<a name="addUserRole"></a>
# **addUserRole**
> addUserRole(userId, roleId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.addUserRole(userId, roleId, xVolTenant, scopeType, scopeId, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#addUserRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
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

<a name="changePassword"></a>
# **changePassword**
> changePassword(userId, xVolTenant, xVolSite, passwordInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
PasswordInfo passwordInfo = new PasswordInfo(); // PasswordInfo | 
try {
    apiInstance.changePassword(userId, xVolTenant, xVolSite, passwordInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **passwordInfo** | [**PasswordInfo**](PasswordInfo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(userId, xVolTenant, xVolSite, changeUserPasswordInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
ChangeUserPasswordInfo changeUserPasswordInfo = new ChangeUserPasswordInfo(); // ChangeUserPasswordInfo | 
try {
    apiInstance.changeUserPassword(userId, xVolTenant, xVolSite, changeUserPasswordInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#changeUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **changeUserPasswordInfo** | [**ChangeUserPasswordInfo**](ChangeUserPasswordInfo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="createUser"></a>
# **createUser**
> User createUser(xVolTenant, xVolSite, user)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    User result = apiInstance.createUser(xVolTenant, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="createUserAndAuthenticate"></a>
# **createUserAndAuthenticate**
> MultiScopeAdminUserAuthTicket createUserAndAuthenticate(xVolTenant, scopeType, scopeId, xVolSite, user)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    MultiScopeAdminUserAuthTicket result = apiInstance.createUserAndAuthenticate(xVolTenant, scopeType, scopeId, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#createUserAndAuthenticate");
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
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**MultiScopeAdminUserAuthTicket**](MultiScopeAdminUserAuthTicket.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="createUsers"></a>
# **createUsers**
> UserCollection createUsers(xVolTenant, xVolSite, userCollection)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
UserCollection userCollection = new UserCollection(); // UserCollection | 
try {
    UserCollection result = apiInstance.createUsers(xVolTenant, xVolSite, userCollection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#createUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **userCollection** | [**UserCollection**](UserCollection.md)|  | [optional]

### Return type

[**UserCollection**](UserCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteUser(userId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="disableUser"></a>
# **disableUser**
> User disableUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    User result = apiInstance.disableUser(userId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#disableUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="enableUser"></a>
# **enableUser**
> User enableUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    User result = apiInstance.enableUser(userId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#enableUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUser"></a>
# **getUser**
> User getUser(userId, xVolTenant, scopeType, scopeId, responseGroups, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
String responseGroups = "responseGroups_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    User result = apiInstance.getUser(userId, xVolTenant, scopeType, scopeId, responseGroups, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **responseGroups** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserBehaviors"></a>
# **getUserBehaviors**
> List&lt;Integer&gt; getUserBehaviors(userId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    List<Integer> result = apiInstance.getUserBehaviors(userId, xVolTenant, scopeType, scopeId, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserBehaviors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserRoles"></a>
# **getUserRoles**
> UserRoleCollection getUserRoles(userId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    UserRoleCollection result = apiInstance.getUserRoles(userId, xVolTenant, scopeType, scopeId, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**UserRoleCollection**](UserRoleCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserScopeDevAccounts"></a>
# **getUserScopeDevAccounts**
> UserScopeCollectionPaged getUserScopeDevAccounts(userId, xVolTenant, pageSize, startIndex, filter, sort, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer pageSize = 56; // Integer | 
Integer startIndex = 56; // Integer | 
String filter = "filter_example"; // String | 
String sort = "sort_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    UserScopeCollectionPaged result = apiInstance.getUserScopeDevAccounts(userId, xVolTenant, pageSize, startIndex, filter, sort, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserScopeDevAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **pageSize** | **Integer**|  | [optional]
 **startIndex** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]
 **sort** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**UserScopeCollectionPaged**](UserScopeCollectionPaged.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserScopeTenants"></a>
# **getUserScopeTenants**
> UserScopeCollectionPaged getUserScopeTenants(userId, xVolTenant, pageSize, startIndex, filter, sort, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer pageSize = 56; // Integer | 
Integer startIndex = 56; // Integer | 
String filter = "filter_example"; // String | 
String sort = "sort_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    UserScopeCollectionPaged result = apiInstance.getUserScopeTenants(userId, xVolTenant, pageSize, startIndex, filter, sort, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserScopeTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **pageSize** | **Integer**|  | [optional]
 **startIndex** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]
 **sort** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**UserScopeCollectionPaged**](UserScopeCollectionPaged.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserScopes"></a>
# **getUserScopes**
> UserScopeWithAdditionalFieldsCollection getUserScopes(userId, xVolTenant, scopeType, scopeId, filter, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
String filter = "filter_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    UserScopeWithAdditionalFieldsCollection result = apiInstance.getUserScopes(userId, xVolTenant, scopeType, scopeId, filter, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserScopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**UserScopeWithAdditionalFieldsCollection**](UserScopeWithAdditionalFieldsCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserTenantsByUserAndBehavior"></a>
# **getUserTenantsByUserAndBehavior**
> List&lt;Integer&gt; getUserTenantsByUserAndBehavior(userId, behaviorId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer behaviorId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    List<Integer> result = apiInstance.getUserTenantsByUserAndBehavior(userId, behaviorId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUserTenantsByUserAndBehavior");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **behaviorId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUsers"></a>
# **getUsers**
> getUsers(xVolTenant, emailAddress, scopeType, scopeId, startIndex, pageSize, sortBy, filter, responseGroups, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
String emailAddress = "emailAddress_example"; // String | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer startIndex = 0; // Integer | 
Integer pageSize = 20; // Integer | 
String sortBy = "sortBy_example"; // String | 
String filter = "filter_example"; // String | 
String responseGroups = "responseGroups_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.getUsers(xVolTenant, emailAddress, scopeType, scopeId, startIndex, pageSize, sortBy, filter, responseGroups, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **emailAddress** | **String**|  | [optional]
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **startIndex** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 20]
 **sortBy** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **responseGroups** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserRole"></a>
# **removeUserRole**
> removeUserRole(userId, roleId, xVolTenant, scopeType, scopeId, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.removeUserRole(userId, roleId, xVolTenant, scopeType, scopeId, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#removeUserRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
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

<a name="resetPassword"></a>
# **resetPassword**
> resetPassword(xVolTenant, xVolSite, resetPasswordInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
ResetPasswordInfo resetPasswordInfo = new ResetPasswordInfo(); // ResetPasswordInfo | 
try {
    apiInstance.resetPassword(xVolTenant, xVolSite, resetPasswordInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#resetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **resetPasswordInfo** | [**ResetPasswordInfo**](ResetPasswordInfo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="unlockUser"></a>
# **unlockUser**
> unlockUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.unlockUser(userId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#unlockUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateForgottenPassword"></a>
# **updateForgottenPassword**
> updateForgottenPassword(xVolTenant, xVolSite, confirmationInfo)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
ConfirmationInfo confirmationInfo = new ConfirmationInfo(); // ConfirmationInfo | 
try {
    apiInstance.updateForgottenPassword(xVolTenant, xVolSite, confirmationInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#updateForgottenPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]
 **confirmationInfo** | [**ConfirmationInfo**](ConfirmationInfo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> User updateUser(userId, xVolTenant, scopeType, scopeId, xVolSite, user)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.MultiScopeAdminUserApi;

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

MultiScopeAdminUserApi apiInstance = new MultiScopeAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String scopeType = "scopeType_example"; // String | 
Integer scopeId = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    User result = apiInstance.updateUser(userId, xVolTenant, scopeType, scopeId, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiScopeAdminUserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **scopeType** | **String**|  | [optional]
 **scopeId** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

