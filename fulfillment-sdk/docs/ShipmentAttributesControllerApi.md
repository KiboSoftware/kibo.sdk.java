# ShipmentAttributesControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteShipmentAttributeUsingDELETE**](ShipmentAttributesControllerApi.md#deleteShipmentAttributeUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/attributes/{key} | deleteShipmentAttribute
[**getShipmentAttributeUsingGET**](ShipmentAttributesControllerApi.md#getShipmentAttributeUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes/{key} | getShipmentAttribute
[**getShipmentAttributesUsingGET**](ShipmentAttributesControllerApi.md#getShipmentAttributesUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes | getShipmentAttributes
[**setShipmentAttributeUsingPUT**](ShipmentAttributesControllerApi.md#setShipmentAttributeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes/{key} | setShipmentAttribute
[**setShipmentAttributesUsingPUT**](ShipmentAttributesControllerApi.md#setShipmentAttributesUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes | setShipmentAttributes


<a name="deleteShipmentAttributeUsingDELETE"></a>
# **deleteShipmentAttributeUsingDELETE**
> deleteShipmentAttributeUsingDELETE(key, shipmentNumber, xVolTenant, xVolSite)

deleteShipmentAttribute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
String key = "key_example"; // String | key
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteShipmentAttributeUsingDELETE(key, shipmentNumber, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentAttributesControllerApi#deleteShipmentAttributeUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
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

<a name="getShipmentAttributeUsingGET"></a>
# **getShipmentAttributeUsingGET**
> ShipmentAttribute getShipmentAttributeUsingGET(key, shipmentNumber, xVolTenant, xVolSite)

getShipmentAttribute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
String key = "key_example"; // String | key
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    ShipmentAttribute result = apiInstance.getShipmentAttributeUsingGET(key, shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentAttributesControllerApi#getShipmentAttributeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ShipmentAttribute**](ShipmentAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentAttributesUsingGET"></a>
# **getShipmentAttributesUsingGET**
> List&lt;ShipmentAttribute&gt; getShipmentAttributesUsingGET(shipmentNumber, xVolTenant, xVolSite)

getShipmentAttributes

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    List<ShipmentAttribute> result = apiInstance.getShipmentAttributesUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentAttributesControllerApi#getShipmentAttributesUsingGET");
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

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="setShipmentAttributeUsingPUT"></a>
# **setShipmentAttributeUsingPUT**
> ShipmentAttribute setShipmentAttributeUsingPUT(key, shipmentNumber, xVolTenant, shipmentAttribute, xVolSite)

setShipmentAttribute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
String key = "key_example"; // String | key
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ShipmentAttribute shipmentAttribute = new ShipmentAttribute(); // ShipmentAttribute | attribute
Integer xVolSite = 56; // Integer | 
try {
    ShipmentAttribute result = apiInstance.setShipmentAttributeUsingPUT(key, shipmentNumber, xVolTenant, shipmentAttribute, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentAttributesControllerApi#setShipmentAttributeUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **shipmentAttribute** | [**ShipmentAttribute**](ShipmentAttribute.md)| attribute |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ShipmentAttribute**](ShipmentAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="setShipmentAttributesUsingPUT"></a>
# **setShipmentAttributesUsingPUT**
> List&lt;ShipmentAttribute&gt; setShipmentAttributesUsingPUT(shipmentNumber, xVolTenant, shipmentAttribute, xVolSite)

setShipmentAttributes

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
List<ShipmentAttribute> shipmentAttribute = Arrays.asList(null); // List<ShipmentAttribute> | attributes
Integer xVolSite = 56; // Integer | 
try {
    List<ShipmentAttribute> result = apiInstance.setShipmentAttributesUsingPUT(shipmentNumber, xVolTenant, shipmentAttribute, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentAttributesControllerApi#setShipmentAttributesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **shipmentAttribute** | [**List&lt;ShipmentAttribute&gt;**](List.md)| attributes |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**List&lt;ShipmentAttribute&gt;**](ShipmentAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

