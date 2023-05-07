# PickWaveControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closePickWaveUsingPUT**](PickWaveControllerApi.md#closePickWaveUsingPUT) | **PUT** /commerce/pickwaves/{pickWaveNumber}/closed | closePickWave
[**createPickWaveUsingPOST**](PickWaveControllerApi.md#createPickWaveUsingPOST) | **POST** /commerce/pickwaves | createPickWave
[**getOpenPickWavesUsingGET**](PickWaveControllerApi.md#getOpenPickWavesUsingGET) | **GET** /commerce/pickwaves/open/{fulfillmentLocationCode} | getOpenPickWaves
[**getPickWaveUsingGET**](PickWaveControllerApi.md#getPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber} | getPickWave
[**getShipmentsInPickWaveUsingGET**](PickWaveControllerApi.md#getShipmentsInPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/shipments | getShipmentsInPickWave


<a name="closePickWaveUsingPUT"></a>
# **closePickWaveUsingPUT**
> EntityModelOfPickWave closePickWaveUsingPUT(pickWaveNumber, xVolTenant, closePickWave, xVolSite)

closePickWave

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.PickWaveControllerApi;


PickWaveControllerApi apiInstance = new PickWaveControllerApi();
Integer pickWaveNumber = 56; // Integer | pickWaveNumber
Integer xVolTenant = 56; // Integer | 
ClosePickWave closePickWave = new ClosePickWave(); // ClosePickWave | closePickWaveDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfPickWave result = apiInstance.closePickWaveUsingPUT(pickWaveNumber, xVolTenant, closePickWave, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickWaveControllerApi#closePickWaveUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickWaveNumber** | **Integer**| pickWaveNumber |
 **xVolTenant** | **Integer**|  |
 **closePickWave** | [**ClosePickWave**](ClosePickWave.md)| closePickWaveDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="createPickWaveUsingPOST"></a>
# **createPickWaveUsingPOST**
> EntityModelOfPickWave createPickWaveUsingPOST(xVolTenant, createPickWave, xVolSite)

createPickWave

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.PickWaveControllerApi;


PickWaveControllerApi apiInstance = new PickWaveControllerApi();
Integer xVolTenant = 56; // Integer | 
CreatePickWave createPickWave = new CreatePickWave(); // CreatePickWave | createPickWaveDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfPickWave result = apiInstance.createPickWaveUsingPOST(xVolTenant, createPickWave, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickWaveControllerApi#createPickWaveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **createPickWave** | [**CreatePickWave**](CreatePickWave.md)| createPickWaveDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getOpenPickWavesUsingGET"></a>
# **getOpenPickWavesUsingGET**
> CollectionModelOfPickWave getOpenPickWavesUsingGET(fulfillmentLocationCode, xVolTenant, shipmentType, userDisplayName, userId, xVolSite)

getOpenPickWaves

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.PickWaveControllerApi;


PickWaveControllerApi apiInstance = new PickWaveControllerApi();
String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
Integer xVolTenant = 56; // Integer | 
String shipmentType = "shipmentType_example"; // String | shipmentType
String userDisplayName = "userDisplayName_example"; // String | userDisplayName
String userId = "userId_example"; // String | userId
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfPickWave result = apiInstance.getOpenPickWavesUsingGET(fulfillmentLocationCode, xVolTenant, shipmentType, userDisplayName, userId, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickWaveControllerApi#getOpenPickWavesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLocationCode** | **String**| fulfillmentLocationCode |
 **xVolTenant** | **Integer**|  |
 **shipmentType** | **String**| shipmentType | [optional]
 **userDisplayName** | **String**| userDisplayName | [optional]
 **userId** | **String**| userId | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfPickWave**](CollectionModelOfPickWave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getPickWaveUsingGET"></a>
# **getPickWaveUsingGET**
> EntityModelOfPickWave getPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite)

getPickWave

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.PickWaveControllerApi;


PickWaveControllerApi apiInstance = new PickWaveControllerApi();
Integer pickWaveNumber = 56; // Integer | pickWaveNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfPickWave result = apiInstance.getPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickWaveControllerApi#getPickWaveUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickWaveNumber** | **Integer**| pickWaveNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentsInPickWaveUsingGET"></a>
# **getShipmentsInPickWaveUsingGET**
> CollectionModelOfShipment getShipmentsInPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite)

getShipmentsInPickWave

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.PickWaveControllerApi;


PickWaveControllerApi apiInstance = new PickWaveControllerApi();
Integer pickWaveNumber = 56; // Integer | pickWaveNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfShipment result = apiInstance.getShipmentsInPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PickWaveControllerApi#getShipmentsInPickWaveUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickWaveNumber** | **Integer**| pickWaveNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

