# ShipmentAttributesControllerApi

All URIs are relative to *http://services-tp.dev01.kubedev.kibo-dev.com/kibo.fulfillment.webapi*

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
> Attribute getShipmentAttributeUsingGET(key, shipmentNumber, xVolTenant, xVolSite)

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
    Attribute result = apiInstance.getShipmentAttributeUsingGET(key, shipmentNumber, xVolTenant, xVolSite);
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

[**Attribute**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentAttributesUsingGET"></a>
# **getShipmentAttributesUsingGET**
> List&lt;Attribute&gt; getShipmentAttributesUsingGET(shipmentNumber, xVolTenant, xVolSite)

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
    List<Attribute> result = apiInstance.getShipmentAttributesUsingGET(shipmentNumber, xVolTenant, xVolSite);
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

[**List&lt;Attribute&gt;**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="setShipmentAttributeUsingPUT"></a>
# **setShipmentAttributeUsingPUT**
> Attribute setShipmentAttributeUsingPUT(key, shipmentNumber, xVolTenant, attribute, xVolSite)

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
Attribute attribute = new Attribute(); // Attribute | attribute
Integer xVolSite = 56; // Integer | 
try {
    Attribute result = apiInstance.setShipmentAttributeUsingPUT(key, shipmentNumber, xVolTenant, attribute, xVolSite);
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
 **attribute** | [**Attribute**](Attribute.md)| attribute |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**Attribute**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="setShipmentAttributesUsingPUT"></a>
# **setShipmentAttributesUsingPUT**
> List&lt;Attribute&gt; setShipmentAttributesUsingPUT(shipmentNumber, xVolTenant, attribute, xVolSite)

setShipmentAttributes

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributesControllerApi;


ShipmentAttributesControllerApi apiInstance = new ShipmentAttributesControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
List<Attribute> attribute = Arrays.asList(null); // List<Attribute> | attributes
Integer xVolSite = 56; // Integer | 
try {
    List<Attribute> result = apiInstance.setShipmentAttributesUsingPUT(shipmentNumber, xVolTenant, attribute, xVolSite);
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
 **attribute** | [**List&lt;Attribute&gt;**](List.md)| attributes |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**List&lt;Attribute&gt;**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

