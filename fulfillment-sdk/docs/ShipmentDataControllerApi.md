# ShipmentDataControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteShipmentAttributeUsingDELETE1**](ShipmentDataControllerApi.md#deleteShipmentAttributeUsingDELETE1) | **DELETE** /commerce/shipments/{shipmentNumber}/data | deleteShipmentAttribute
[**deleteShipmentAttributeUsingDELETE2**](ShipmentDataControllerApi.md#deleteShipmentAttributeUsingDELETE2) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | deleteShipmentAttribute
[**getShipmentDataUsingGET**](ShipmentDataControllerApi.md#getShipmentDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/data | getShipmentData
[**getShipmentDataUsingGET1**](ShipmentDataControllerApi.md#getShipmentDataUsingGET1) | **GET** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | getShipmentData
[**replaceShipmentDataUsingPUT**](ShipmentDataControllerApi.md#replaceShipmentDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/data | replaceShipmentData
[**replaceShipmentItemDataUsingPUT**](ShipmentDataControllerApi.md#replaceShipmentItemDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | replaceShipmentItemData


<a name="deleteShipmentAttributeUsingDELETE1"></a>
# **deleteShipmentAttributeUsingDELETE1**
> deleteShipmentAttributeUsingDELETE1(shipmentNumber, xVolTenant, xVolSite)

deleteShipmentAttribute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteShipmentAttributeUsingDELETE1(shipmentNumber, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#deleteShipmentAttributeUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteShipmentAttributeUsingDELETE2"></a>
# **deleteShipmentAttributeUsingDELETE2**
> deleteShipmentAttributeUsingDELETE2(lineId, shipmentNumber, xVolTenant, xVolSite)

deleteShipmentAttribute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer lineId = 56; // Integer | lineId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteShipmentAttributeUsingDELETE2(lineId, shipmentNumber, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#deleteShipmentAttributeUsingDELETE2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineId** | **Integer**| lineId |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getShipmentDataUsingGET"></a>
# **getShipmentDataUsingGET**
> Map&lt;String, Object&gt; getShipmentDataUsingGET(shipmentNumber, xVolTenant, xVolSite)

getShipmentData

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    Map<String, Object> result = apiInstance.getShipmentDataUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#getShipmentDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentDataUsingGET1"></a>
# **getShipmentDataUsingGET1**
> Map&lt;String, Object&gt; getShipmentDataUsingGET1(lineId, shipmentNumber, xVolTenant, xVolSite)

getShipmentData

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer lineId = 56; // Integer | lineId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    Map<String, Object> result = apiInstance.getShipmentDataUsingGET1(lineId, shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#getShipmentDataUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineId** | **Integer**| lineId |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="replaceShipmentDataUsingPUT"></a>
# **replaceShipmentDataUsingPUT**
> Map&lt;String, Object&gt; replaceShipmentDataUsingPUT(shipmentNumber, xVolTenant, requestBody, xVolSite)

replaceShipmentData

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Map<String, Object> requestBody = null; // Map<String, Object> | data
Integer xVolSite = 56; // Integer | 
try {
    Map<String, Object> result = apiInstance.replaceShipmentDataUsingPUT(shipmentNumber, xVolTenant, requestBody, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#replaceShipmentDataUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| data |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="replaceShipmentItemDataUsingPUT"></a>
# **replaceShipmentItemDataUsingPUT**
> Map&lt;String, Object&gt; replaceShipmentItemDataUsingPUT(lineId, shipmentNumber, xVolTenant, requestBody, xVolSite)

replaceShipmentItemData

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentDataControllerApi;


ShipmentDataControllerApi apiInstance = new ShipmentDataControllerApi();
Integer lineId = 56; // Integer | lineId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Map<String, Object> requestBody = null; // Map<String, Object> | data
Integer xVolSite = 56; // Integer | 
try {
    Map<String, Object> result = apiInstance.replaceShipmentItemDataUsingPUT(lineId, shipmentNumber, xVolTenant, requestBody, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentDataControllerApi#replaceShipmentItemDataUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lineId** | **Integer**| lineId |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| data |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

