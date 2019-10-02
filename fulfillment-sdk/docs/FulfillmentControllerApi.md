# FulfillmentControllerApi

All URIs are relative to *http://services-tp.dev01.kubedev.kibo-dev.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fulfillmentUsingGET**](FulfillmentControllerApi.md#fulfillmentUsingGET) | **GET** /commerce/fulfillment | fulfillment
[**getAuthorizedUserNameUsingGET**](FulfillmentControllerApi.md#getAuthorizedUserNameUsingGET) | **GET** /commerce/fulfillment/user/username | getAuthorizedUserName
[**getAuthorizedUserRolesUsingGET**](FulfillmentControllerApi.md#getAuthorizedUserRolesUsingGET) | **GET** /commerce/fulfillment/user/behaviors | getAuthorizedUserRoles
[**getPrincipalUsingGET**](FulfillmentControllerApi.md#getPrincipalUsingGET) | **GET** /commerce/fulfillment/user/principal | getPrincipal
[**homeUsingGET**](FulfillmentControllerApi.md#homeUsingGET) | **GET** /commerce/fulfillment/user/hello | home
[**storeAssociateUsingGET**](FulfillmentControllerApi.md#storeAssociateUsingGET) | **GET** /commerce/fulfillment/associate | storeAssociate
[**storeManagerUsingGET**](FulfillmentControllerApi.md#storeManagerUsingGET) | **GET** /commerce/fulfillment/manager | storeManager


<a name="fulfillmentUsingGET"></a>
# **fulfillmentUsingGET**
> String fulfillmentUsingGET(xVolTenant, xVolSite)

fulfillment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.fulfillmentUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#fulfillmentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getAuthorizedUserNameUsingGET"></a>
# **getAuthorizedUserNameUsingGET**
> String getAuthorizedUserNameUsingGET(xVolTenant, xVolSite)

getAuthorizedUserName

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.getAuthorizedUserNameUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#getAuthorizedUserNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getAuthorizedUserRolesUsingGET"></a>
# **getAuthorizedUserRolesUsingGET**
> List&lt;String&gt; getAuthorizedUserRolesUsingGET(xVolTenant, xVolSite)

getAuthorizedUserRoles

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    List<String> result = apiInstance.getAuthorizedUserRolesUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#getAuthorizedUserRolesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getPrincipalUsingGET"></a>
# **getPrincipalUsingGET**
> Principal getPrincipalUsingGET(xVolTenant, name, xVolSite)

getPrincipal

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
String name = "name_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    Principal result = apiInstance.getPrincipalUsingGET(xVolTenant, name, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#getPrincipalUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **name** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**Principal**](Principal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="homeUsingGET"></a>
# **homeUsingGET**
> String homeUsingGET(xVolTenant, xVolSite)

home

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.homeUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#homeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="storeAssociateUsingGET"></a>
# **storeAssociateUsingGET**
> String storeAssociateUsingGET(xVolTenant, xVolSite)

storeAssociate

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.storeAssociateUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#storeAssociateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="storeManagerUsingGET"></a>
# **storeManagerUsingGET**
> String storeManagerUsingGET(xVolTenant, xVolSite)

storeManager

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;


FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.storeManagerUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentControllerApi#storeManagerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

