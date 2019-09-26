# AppAuthTicketsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAuthenticateApp**](AppAuthTicketsApi.md#oauthAuthenticateApp) | **POST** /platform/applications/authtickets/oauth | 


<a name="oauthAuthenticateApp"></a>
# **oauthAuthenticateApp**
> MozuAppDevContractsOAuthAccessTokenResponse oauthAuthenticateApp(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest)



### Example
```java
// Import classes:
//import com.kibocommerce.sdk.auth.ApiClient;
//import com.kibocommerce.sdk.auth.ApiException;
//import com.kibocommerce.sdk.auth.Configuration;
//import com.kibocommerce.sdk.auth.auth.*;
//import com.kibocommerce.sdk.auth.api.AppAuthTicketsApi;

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

AppAuthTicketsApi apiInstance = new AppAuthTicketsApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest = new MozuAppDevContractsOauthAuthRequest(); // MozuAppDevContractsOauthAuthRequest | 
try {
    MozuAppDevContractsOAuthAccessTokenResponse result = apiInstance.oauthAuthenticateApp(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppAuthTicketsApi#oauthAuthenticateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]
 **mozuAppDevContractsOauthAuthRequest** | [**MozuAppDevContractsOauthAuthRequest**](MozuAppDevContractsOauthAuthRequest.md)|  | [optional]

### Return type

[**MozuAppDevContractsOAuthAccessTokenResponse**](MozuAppDevContractsOAuthAccessTokenResponse.md)

### Authorization

[x-vol-app-claims](../README.md#x-vol-app-claims), [x-vol-user-claims](../README.md#x-vol-user-claims)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

