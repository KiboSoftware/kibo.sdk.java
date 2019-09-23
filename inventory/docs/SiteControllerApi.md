# SiteControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSite**](SiteControllerApi.md#createSite) | **POST** /v1/site/ | 
[**deleteSite**](SiteControllerApi.md#deleteSite) | **DELETE** /v1/site | 


<a name="createSite"></a>
# **createSite**
> Integer createSite(createSiteRequest)



Creates a site

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.SiteControllerApi;


SiteControllerApi apiInstance = new SiteControllerApi();
CreateSiteRequest createSiteRequest = new CreateSiteRequest(); // CreateSiteRequest | Request to create a new site
try {
    Integer result = apiInstance.createSite(createSiteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteControllerApi#createSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSiteRequest** | [**CreateSiteRequest**](CreateSiteRequest.md)| Request to create a new site |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSite"></a>
# **deleteSite**
> Boolean deleteSite(xVolTenant, xVolSite)



Deletes a site

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.SiteControllerApi;


SiteControllerApi apiInstance = new SiteControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer xVolSite = 56; // Integer | Site ID
try {
    Boolean result = apiInstance.deleteSite(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteControllerApi#deleteSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **xVolSite** | **Integer**| Site ID |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

