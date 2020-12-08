# StorefrontControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShipmentUsingGET1**](StorefrontControllerApi.md#getShipmentUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments/{shipmentNumber} | getShipment
[**getShipmentsUsingGET1**](StorefrontControllerApi.md#getShipmentsUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments | getShipments


<a name="getShipmentUsingGET1"></a>
# **getShipmentUsingGET1**
> EntityModelOfShipment getShipmentUsingGET1(shipmentNumber, xVolTenant, xVolSite)

getShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.StorefrontControllerApi;


StorefrontControllerApi apiInstance = new StorefrontControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.getShipmentUsingGET1(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontControllerApi#getShipmentUsingGET1");
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

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getShipmentsUsingGET1"></a>
# **getShipmentsUsingGET1**
> PagedModelOfEntityModelOfShipment getShipmentsUsingGET1(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite)

getShipments

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.StorefrontControllerApi;


StorefrontControllerApi apiInstance = new StorefrontControllerApi();
Integer xVolTenant = 56; // Integer | 
String filter = "filter_example"; // String | 
Boolean isLate = true; // Boolean | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
String quickSearch = "quickSearch_example"; // String | 
String sort = "sort_example"; // String | 
String workflowTaskName = "workflowTaskName_example"; // String | 
Integer xVolSite = 56; // Integer | 
try {
    PagedModelOfEntityModelOfShipment result = apiInstance.getShipmentsUsingGET1(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontControllerApi#getShipmentsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **filter** | **String**|  | [optional]
 **isLate** | **Boolean**|  | [optional]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **quickSearch** | **String**|  | [optional]
 **sort** | **String**|  | [optional]
 **workflowTaskName** | **String**|  | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**PagedModelOfEntityModelOfShipment**](PagedModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

