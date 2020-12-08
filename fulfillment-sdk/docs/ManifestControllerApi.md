# ManifestControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManifestUsingPOST**](ManifestControllerApi.md#createManifestUsingPOST) | **POST** /commerce/fulfillment/shipping/manifests | createManifest
[**getEligibleShipmentsUsingGET**](ManifestControllerApi.md#getEligibleShipmentsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/eligibleShipments | getEligibleShipments
[**getManifestUsingGET**](ManifestControllerApi.md#getManifestUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/{manifestId} | getManifest
[**getManifestsUsingGET**](ManifestControllerApi.md#getManifestsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests | getManifests


<a name="createManifestUsingPOST"></a>
# **createManifestUsingPOST**
> EntityModelOfManifest createManifestUsingPOST(xVolTenant, manifestRequest, xVolSite)

createManifest

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ManifestControllerApi;


ManifestControllerApi apiInstance = new ManifestControllerApi();
Integer xVolTenant = 56; // Integer | 
ManifestRequest manifestRequest = new ManifestRequest(); // ManifestRequest | manifestRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfManifest result = apiInstance.createManifestUsingPOST(xVolTenant, manifestRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestControllerApi#createManifestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **manifestRequest** | [**ManifestRequest**](ManifestRequest.md)| manifestRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfManifest**](EntityModelOfManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getEligibleShipmentsUsingGET"></a>
# **getEligibleShipmentsUsingGET**
> CollectionModelOfShipment getEligibleShipmentsUsingGET(carrier, fulfillmentLocationCode, xVolTenant, fromDays, xVolSite)

getEligibleShipments

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ManifestControllerApi;


ManifestControllerApi apiInstance = new ManifestControllerApi();
String carrier = "carrier_example"; // String | carrier
String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
Integer xVolTenant = 56; // Integer | 
Integer fromDays = 56; // Integer | fromDays
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfShipment result = apiInstance.getEligibleShipmentsUsingGET(carrier, fulfillmentLocationCode, xVolTenant, fromDays, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestControllerApi#getEligibleShipmentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carrier** | **String**| carrier |
 **fulfillmentLocationCode** | **String**| fulfillmentLocationCode |
 **xVolTenant** | **Integer**|  |
 **fromDays** | **Integer**| fromDays | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getManifestUsingGET"></a>
# **getManifestUsingGET**
> EntityModelOfManifest getManifestUsingGET(manifestId, xVolTenant, xVolSite)

getManifest

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ManifestControllerApi;


ManifestControllerApi apiInstance = new ManifestControllerApi();
String manifestId = "manifestId_example"; // String | manifestId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfManifest result = apiInstance.getManifestUsingGET(manifestId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestControllerApi#getManifestUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manifestId** | **String**| manifestId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfManifest**](EntityModelOfManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getManifestsUsingGET"></a>
# **getManifestsUsingGET**
> CollectionModelOfManifest getManifestsUsingGET(fulfillmentLocationCode, xVolTenant, fromDays, xVolSite)

getManifests

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ManifestControllerApi;


ManifestControllerApi apiInstance = new ManifestControllerApi();
String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
Integer xVolTenant = 56; // Integer | 
Integer fromDays = 56; // Integer | fromDays
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfManifest result = apiInstance.getManifestsUsingGET(fulfillmentLocationCode, xVolTenant, fromDays, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManifestControllerApi#getManifestsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLocationCode** | **String**| fulfillmentLocationCode |
 **xVolTenant** | **Integer**|  |
 **fromDays** | **Integer**| fromDays | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfManifest**](CollectionModelOfManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

