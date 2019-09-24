# PublicAdminUserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserRole**](PublicAdminUserApi.md#addUserRole) | **POST** /platform/adminuser/accounts/{userId}/roles/{roleId} | 
[**changePassword**](PublicAdminUserApi.md#changePassword) | **POST** /platform/adminuser/accounts/{userId}/Change-Password | 
[**changeUserPassword**](PublicAdminUserApi.md#changeUserPassword) | **POST** /platform/adminuser/accounts/{userId}/Change-User-Password | 
[**createUser**](PublicAdminUserApi.md#createUser) | **POST** /platform/adminuser/accounts | 
[**deleteUser**](PublicAdminUserApi.md#deleteUser) | **DELETE** /platform/adminuser/accounts/{userId} | 
[**getTenantScopesForUser**](PublicAdminUserApi.md#getTenantScopesForUser) | **GET** /platform/adminuser/accounts/{userId}/tenants | 
[**getUser**](PublicAdminUserApi.md#getUser) | **GET** /platform/adminuser/accounts/{userId} | 
[**getUserById**](PublicAdminUserApi.md#getUserById) | **GET** /platform/adminuser/accounts/{userId}/userbyid | 
[**getUserRoles**](PublicAdminUserApi.md#getUserRoles) | **GET** /platform/adminuser/accounts/{userId}/roles | 
[**getUsers**](PublicAdminUserApi.md#getUsers) | **GET** /platform/adminuser/accounts | 
[**removeUserRole**](PublicAdminUserApi.md#removeUserRole) | **DELETE** /platform/adminuser/accounts/{userId}/roles/{roleId} | 
[**updateUser**](PublicAdminUserApi.md#updateUser) | **PUT** /platform/adminuser/accounts/{userId} | 


<a name="addUserRole"></a>
# **addUserRole**
> addUserRole(userId, roleId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.addUserRole(userId, roleId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#addUserRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **roleId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
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
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
PasswordInfo passwordInfo = new PasswordInfo(); // PasswordInfo | 
try {
    apiInstance.changePassword(userId, xVolTenant, xVolSite, passwordInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#changePassword");
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
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
ChangeUserPasswordInfo changeUserPasswordInfo = new ChangeUserPasswordInfo(); // ChangeUserPasswordInfo | 
try {
    apiInstance.changeUserPassword(userId, xVolTenant, xVolSite, changeUserPasswordInfo);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#changeUserPassword");
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
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    User result = apiInstance.createUser(xVolTenant, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#createUser");
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
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteUser(userId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#deleteUser");
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

<a name="getTenantScopesForUser"></a>
# **getTenantScopesForUser**
> TenantCollection getTenantScopesForUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    TenantCollection result = apiInstance.getTenantScopesForUser(userId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#getTenantScopesForUser");
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

[**TenantCollection**](TenantCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUser"></a>
# **getUser**
> User getUser(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    User result = apiInstance.getUser(userId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#getUser");
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

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId, xVolTenant, responseGroups, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
String responseGroups = "responseGroups_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    User result = apiInstance.getUserById(userId, xVolTenant, responseGroups, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **xVolTenant** | **Integer**|  |
 **responseGroups** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUserRoles"></a>
# **getUserRoles**
> UserRoleCollection getUserRoles(userId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    UserRoleCollection result = apiInstance.getUserRoles(userId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#getUserRoles");
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

[**UserRoleCollection**](UserRoleCollection.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUsers"></a>
# **getUsers**
> getUsers(xVolTenant, emailAddress, startIndex, pageSize, sortBy, filter, responseGroups, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
Integer xVolTenant = 56; // Integer | 
String emailAddress = "emailAddress_example"; // String | 
Integer startIndex = 0; // Integer | 
Integer pageSize = 20; // Integer | 
String sortBy = "sortBy_example"; // String | 
String filter = "filter_example"; // String | 
String responseGroups = "responseGroups_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.getUsers(xVolTenant, emailAddress, startIndex, pageSize, sortBy, filter, responseGroups, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **emailAddress** | **String**|  | [optional]
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
> removeUserRole(userId, roleId, xVolTenant, xVolSite)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer roleId = 56; // Integer | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.removeUserRole(userId, roleId, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#removeUserRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **roleId** | **Integer**|  |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> User updateUser(userId, xVolTenant, xVolSite, user)



### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.auth.ApiClient;
//import com.kibocommerce.kibo.sdk.java.auth.ApiException;
//import com.kibocommerce.kibo.sdk.java.auth.Configuration;
//import com.kibocommerce.kibo.sdk.java.auth.auth.*;
//import com.kibocommerce.kibo.sdk.java.auth.PublicAdminUserApi;

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

PublicAdminUserApi apiInstance = new PublicAdminUserApi();
String userId = "userId_example"; // String | 
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
User user = new User(); // User | 
try {
    User result = apiInstance.updateUser(userId, xVolTenant, xVolSite, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicAdminUserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
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

