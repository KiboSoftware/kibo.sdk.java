# ShipmentPackagesControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteShipmentPackageUsingDELETE**](ShipmentPackagesControllerApi.md#deleteShipmentPackageUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/{packageId} | deleteShipmentPackage
[**newPackageUsingPOST**](ShipmentPackagesControllerApi.md#newPackageUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages | newPackage
[**updatePackageUsingPUT**](ShipmentPackagesControllerApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | updatePackage


<a name="deleteShipmentPackageUsingDELETE"></a>
# **deleteShipmentPackageUsingDELETE**
> deleteShipmentPackageUsingDELETE(packageId, shipmentNumber, xVolTenant, xVolSite)

deleteShipmentPackage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesControllerApi;


ShipmentPackagesControllerApi apiInstance = new ShipmentPackagesControllerApi();
String packageId = "packageId_example"; // String | packageId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteShipmentPackageUsingDELETE(packageId, shipmentNumber, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentPackagesControllerApi#deleteShipmentPackageUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| packageId |
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

<a name="newPackageUsingPOST"></a>
# **newPackageUsingPOST**
> EntityModelOfShipment newPackageUsingPOST(shipmentNumber, xVolTenant, modelPackage, xVolSite)

newPackage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesControllerApi;


ShipmentPackagesControllerApi apiInstance = new ShipmentPackagesControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ModelPackage modelPackage = new ModelPackage(); // ModelPackage | packageDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.newPackageUsingPOST(shipmentNumber, xVolTenant, modelPackage, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentPackagesControllerApi#newPackageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **modelPackage** | [**ModelPackage**](ModelPackage.md)| packageDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="updatePackageUsingPUT"></a>
# **updatePackageUsingPUT**
> EntityModelOfShipment updatePackageUsingPUT(packageId, shipmentNumber, xVolTenant, modelPackage, xVolSite)

updatePackage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesControllerApi;


ShipmentPackagesControllerApi apiInstance = new ShipmentPackagesControllerApi();
String packageId = "packageId_example"; // String | packageId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ModelPackage modelPackage = new ModelPackage(); // ModelPackage | packageDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.updatePackageUsingPUT(packageId, shipmentNumber, xVolTenant, modelPackage, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentPackagesControllerApi#updatePackageUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**| packageId |
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **modelPackage** | [**ModelPackage**](ModelPackage.md)| packageDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

