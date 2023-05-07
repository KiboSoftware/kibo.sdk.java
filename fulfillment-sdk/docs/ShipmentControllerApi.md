# ShipmentControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backorderItemsUpdateUsingPUT**](ShipmentControllerApi.md#backorderItemsUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItemsUpdate
[**backorderItemsUsingPOST**](ShipmentControllerApi.md#backorderItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItems
[**backorderShipmentUsingPOST**](ShipmentControllerApi.md#backorderShipmentUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backordered | backorderShipment
[**cancelItemsUsingPUT**](ShipmentControllerApi.md#cancelItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | cancelItems
[**cancelShipmentUsingPUT**](ShipmentControllerApi.md#cancelShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | cancelShipment
[**cancelShipmentsUsingPUT**](ShipmentControllerApi.md#cancelShipmentsUsingPUT) | **PUT** /commerce/shipments/order/{orderId}/canceled | cancelShipments
[**customerAtCurbsideUsingPUT**](ShipmentControllerApi.md#customerAtCurbsideUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtCurbside | customerAtCurbside
[**customerAtStoreUsingPUT**](ShipmentControllerApi.md#customerAtStoreUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtStore | customerAtStore
[**customerCareItemsUsingPOST**](ShipmentControllerApi.md#customerCareItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/customerCaredItems | customerCareItems
[**customerCareShipmentUsingPUT**](ShipmentControllerApi.md#customerCareShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerCared | customerCareShipment
[**customerInTransitUsingPUT**](ShipmentControllerApi.md#customerInTransitUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerInTransit | customerInTransit
[**deleteShipmentUsingDELETE**](ShipmentControllerApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | deleteShipment
[**destinationUpdateUsingPUT**](ShipmentControllerApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | destinationUpdate
[**executeUsingPUT**](ShipmentControllerApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/completed | execute
[**fulfillShipmentUsingPUT**](ShipmentControllerApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | fulfillShipment
[**getDashboardUsingGET**](ShipmentControllerApi.md#getDashboardUsingGET) | **GET** /commerce/shipments/dashboard | getDashboard
[**getLocationSummaryReportUsingGET**](ShipmentControllerApi.md#getLocationSummaryReportUsingGET) | **GET** /commerce/shipments/locationSummaryReport | getLocationSummaryReport
[**getShipmentStepCountByShipmentTypeUsingGET**](ShipmentControllerApi.md#getShipmentStepCountByShipmentTypeUsingGET) | **GET** /commerce/shipments/countsByStep | getShipmentStepCountByShipmentType
[**getShipmentUsingGET**](ShipmentControllerApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | getShipment
[**getShipmentsUsingGET**](ShipmentControllerApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | getShipments
[**getTasksUsingGET**](ShipmentControllerApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | getTasks
[**newShipmentUsingPOST**](ShipmentControllerApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | newShipment
[**newShipmentsUsingPOST**](ShipmentControllerApi.md#newShipmentsUsingPOST) | **POST** /commerce/shipments/bulk | newShipments
[**pickupItemsUsingPOST**](ShipmentControllerApi.md#pickupItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/pickedUpItems | pickupItems
[**reassignItemsUsingPUT**](ShipmentControllerApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | reassignItems
[**reassignShipmentUsingPUT**](ShipmentControllerApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | reassignShipment
[**receiveTransferUsingPUT**](ShipmentControllerApi.md#receiveTransferUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/received | receiveTransfer
[**refreshShipmentUsingPUT**](ShipmentControllerApi.md#refreshShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/refresh | refreshShipment
[**rejectItemsUsingPUT**](ShipmentControllerApi.md#rejectItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejectedItems | rejectItems
[**rejectShipmentUsingPUT**](ShipmentControllerApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | rejectShipment
[**replaceShipmentUsingPUT**](ShipmentControllerApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | replaceShipment
[**retryFulfillingShipmentUsingPUT**](ShipmentControllerApi.md#retryFulfillingShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/retried | retryFulfillingShipment
[**revertUsingPUT**](ShipmentControllerApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/reverted | revert
[**searchAndReceiveTransferUsingPUT**](ShipmentControllerApi.md#searchAndReceiveTransferUsingPUT) | **PUT** /commerce/shipments/received/{search} | searchAndReceiveTransfer
[**skipTaskUsingPUT**](ShipmentControllerApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/skipped | skipTask
[**transferItemsUsingPUT**](ShipmentControllerApi.md#transferItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferredItems | transferItems
[**transferShipmentUsingPUT**](ShipmentControllerApi.md#transferShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferred | transferShipment
[**workflowDefinitionImageUsingGET**](ShipmentControllerApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | workflowDefinitionImage
[**workflowInstanceImageUsingGET**](ShipmentControllerApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | workflowInstanceImage


<a name="backorderItemsUpdateUsingPUT"></a>
# **backorderItemsUpdateUsingPUT**
> EntityModelOfShipment backorderItemsUpdateUsingPUT(shipmentNumber, xVolTenant, backorderItemsUpdateRequest, xVolSite)

backorderItemsUpdate

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
BackorderItemsUpdateRequest backorderItemsUpdateRequest = new BackorderItemsUpdateRequest(); // BackorderItemsUpdateRequest | backorderItemsUpdateRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.backorderItemsUpdateUsingPUT(shipmentNumber, xVolTenant, backorderItemsUpdateRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#backorderItemsUpdateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **backorderItemsUpdateRequest** | [**BackorderItemsUpdateRequest**](BackorderItemsUpdateRequest.md)| backorderItemsUpdateRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="backorderItemsUsingPOST"></a>
# **backorderItemsUsingPOST**
> EntityModelOfShipment backorderItemsUsingPOST(shipmentNumber, xVolTenant, backorderItemsRequest, xVolSite)

backorderItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
BackorderItemsRequest backorderItemsRequest = new BackorderItemsRequest(); // BackorderItemsRequest | backorderItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.backorderItemsUsingPOST(shipmentNumber, xVolTenant, backorderItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#backorderItemsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **backorderItemsRequest** | [**BackorderItemsRequest**](BackorderItemsRequest.md)| backorderItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="backorderShipmentUsingPOST"></a>
# **backorderShipmentUsingPOST**
> EntityModelOfShipment backorderShipmentUsingPOST(shipmentNumber, xVolTenant, backorderShipmentRequest, xVolSite)

backorderShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
BackorderShipmentRequest backorderShipmentRequest = new BackorderShipmentRequest(); // BackorderShipmentRequest | backorderShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.backorderShipmentUsingPOST(shipmentNumber, xVolTenant, backorderShipmentRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#backorderShipmentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **backorderShipmentRequest** | [**BackorderShipmentRequest**](BackorderShipmentRequest.md)| backorderShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="cancelItemsUsingPUT"></a>
# **cancelItemsUsingPUT**
> EntityModelOfShipment cancelItemsUsingPUT(shipmentNumber, xVolTenant, cancelItemsRequest, xVolSite)

cancelItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
CancelItemsRequest cancelItemsRequest = new CancelItemsRequest(); // CancelItemsRequest | cancelItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.cancelItemsUsingPUT(shipmentNumber, xVolTenant, cancelItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#cancelItemsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **cancelItemsRequest** | [**CancelItemsRequest**](CancelItemsRequest.md)| cancelItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="cancelShipmentUsingPUT"></a>
# **cancelShipmentUsingPUT**
> EntityModelOfShipment cancelShipmentUsingPUT(shipmentNumber, xVolTenant, cancelShipment, xVolSite)

cancelShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
CancelShipment cancelShipment = new CancelShipment(); // CancelShipment | cancelShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.cancelShipmentUsingPUT(shipmentNumber, xVolTenant, cancelShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#cancelShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **cancelShipment** | [**CancelShipment**](CancelShipment.md)| cancelShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="cancelShipmentsUsingPUT"></a>
# **cancelShipmentsUsingPUT**
> CollectionModelOfShipment cancelShipmentsUsingPUT(orderId, xVolTenant, cancelShipment, xVolSite)

cancelShipments

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
String orderId = "orderId_example"; // String | orderId
Integer xVolTenant = 56; // Integer | 
CancelShipment cancelShipment = new CancelShipment(); // CancelShipment | cancelShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfShipment result = apiInstance.cancelShipmentsUsingPUT(orderId, xVolTenant, cancelShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#cancelShipmentsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| orderId |
 **xVolTenant** | **Integer**|  |
 **cancelShipment** | [**CancelShipment**](CancelShipment.md)| cancelShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="customerAtCurbsideUsingPUT"></a>
# **customerAtCurbsideUsingPUT**
> EntityModelOfShipment customerAtCurbsideUsingPUT(shipmentNumber, xVolTenant, requestBody, xVolSite)

customerAtCurbside

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Map<String, Object> requestBody = null; // Map<String, Object> | pickupInfo
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.customerAtCurbsideUsingPUT(shipmentNumber, xVolTenant, requestBody, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#customerAtCurbsideUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| pickupInfo |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="customerAtStoreUsingPUT"></a>
# **customerAtStoreUsingPUT**
> EntityModelOfShipment customerAtStoreUsingPUT(shipmentNumber, xVolTenant, xVolSite)

customerAtStore

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.customerAtStoreUsingPUT(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#customerAtStoreUsingPUT");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="customerCareItemsUsingPOST"></a>
# **customerCareItemsUsingPOST**
> EntityModelOfShipment customerCareItemsUsingPOST(shipmentNumber, xVolTenant, rejectItemsRequest, xVolSite)

customerCareItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
RejectItemsRequest rejectItemsRequest = new RejectItemsRequest(); // RejectItemsRequest | rejectItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.customerCareItemsUsingPOST(shipmentNumber, xVolTenant, rejectItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#customerCareItemsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **rejectItemsRequest** | [**RejectItemsRequest**](RejectItemsRequest.md)| rejectItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="customerCareShipmentUsingPUT"></a>
# **customerCareShipmentUsingPUT**
> EntityModelOfShipment customerCareShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite)

customerCareShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
RejectShipment rejectShipment = new RejectShipment(); // RejectShipment | rejectShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.customerCareShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#customerCareShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **rejectShipment** | [**RejectShipment**](RejectShipment.md)| rejectShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="customerInTransitUsingPUT"></a>
# **customerInTransitUsingPUT**
> EntityModelOfShipment customerInTransitUsingPUT(shipmentNumber, xVolTenant, xVolSite)

customerInTransit

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.customerInTransitUsingPUT(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#customerInTransitUsingPUT");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="deleteShipmentUsingDELETE"></a>
# **deleteShipmentUsingDELETE**
> deleteShipmentUsingDELETE(shipmentNumber, xVolTenant, xVolSite)

deleteShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    apiInstance.deleteShipmentUsingDELETE(shipmentNumber, xVolTenant, xVolSite);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#deleteShipmentUsingDELETE");
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

<a name="destinationUpdateUsingPUT"></a>
# **destinationUpdateUsingPUT**
> EntityModelOfShipment destinationUpdateUsingPUT(shipmentNumber, xVolTenant, destination, xVolSite)

destinationUpdate

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Destination destination = new Destination(); // Destination | destinationDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.destinationUpdateUsingPUT(shipmentNumber, xVolTenant, destination, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#destinationUpdateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **destination** | [**Destination**](Destination.md)| destinationDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="executeUsingPUT"></a>
# **executeUsingPUT**
> EntityModelOfShipment executeUsingPUT(shipmentNumber, taskName, xVolTenant, taskComplete, xVolSite)

execute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskName = "taskName_example"; // String | taskName
Integer xVolTenant = 56; // Integer | 
TaskComplete taskComplete = new TaskComplete(); // TaskComplete | taskCompleteDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.executeUsingPUT(shipmentNumber, taskName, xVolTenant, taskComplete, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#executeUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **taskName** | **String**| taskName |
 **xVolTenant** | **Integer**|  |
 **taskComplete** | [**TaskComplete**](TaskComplete.md)| taskCompleteDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="fulfillShipmentUsingPUT"></a>
# **fulfillShipmentUsingPUT**
> EntityModelOfShipment fulfillShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite)

fulfillShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.fulfillShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#fulfillShipmentUsingPUT");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getDashboardUsingGET"></a>
# **getDashboardUsingGET**
> CollectionModelOfDashboardResponse getDashboardUsingGET(xVolTenant, fulfillmentLocationCodes, xVolSite)

getDashboard

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer xVolTenant = 56; // Integer | 
List<String> fulfillmentLocationCodes = Arrays.asList(); // List<String> | fulfillmentLocationCodes
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfDashboardResponse result = apiInstance.getDashboardUsingGET(xVolTenant, fulfillmentLocationCodes, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getDashboardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **fulfillmentLocationCodes** | [**List&lt;String&gt;**](String.md)| fulfillmentLocationCodes | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfDashboardResponse**](CollectionModelOfDashboardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getLocationSummaryReportUsingGET"></a>
# **getLocationSummaryReportUsingGET**
> CollectionModelOfLocationSummary getLocationSummaryReportUsingGET(locationCodes, startDateTime, xVolTenant, xVolSite)

getLocationSummaryReport

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
List<String> locationCodes = Arrays.asList(); // List<String> | locationCodes
OffsetDateTime startDateTime = new OffsetDateTime(); // OffsetDateTime | startDateTime
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfLocationSummary result = apiInstance.getLocationSummaryReportUsingGET(locationCodes, startDateTime, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getLocationSummaryReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationCodes** | [**List&lt;String&gt;**](String.md)| locationCodes |
 **startDateTime** | **OffsetDateTime**| startDateTime |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfLocationSummary**](CollectionModelOfLocationSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentStepCountByShipmentTypeUsingGET"></a>
# **getShipmentStepCountByShipmentTypeUsingGET**
> EntityModelOfDashboardResponse getShipmentStepCountByShipmentTypeUsingGET(shipmentType, xVolTenant, assignedLocations, xVolSite)

getShipmentStepCountByShipmentType

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
String shipmentType = "shipmentType_example"; // String | shipmentType
Integer xVolTenant = 56; // Integer | 
List<String> assignedLocations = Arrays.asList(); // List<String> | assignedLocations
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfDashboardResponse result = apiInstance.getShipmentStepCountByShipmentTypeUsingGET(shipmentType, xVolTenant, assignedLocations, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getShipmentStepCountByShipmentTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentType** | **String**| shipmentType |
 **xVolTenant** | **Integer**|  |
 **assignedLocations** | [**List&lt;String&gt;**](String.md)| assignedLocations | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfDashboardResponse**](EntityModelOfDashboardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentUsingGET"></a>
# **getShipmentUsingGET**
> EntityModelOfShipment getShipmentUsingGET(shipmentNumber, xVolTenant, xVolSite)

getShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.getShipmentUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getShipmentUsingGET");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentsUsingGET"></a>
# **getShipmentsUsingGET**
> PagedModelOfEntityModelOfShipment getShipmentsUsingGET(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite)

getShipments

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
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
    PagedModelOfEntityModelOfShipment result = apiInstance.getShipmentsUsingGET(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getShipmentsUsingGET");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getTasksUsingGET"></a>
# **getTasksUsingGET**
> CollectionModelOfTask getTasksUsingGET(shipmentNumber, xVolTenant, xVolSite)

getTasks

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfTask result = apiInstance.getTasksUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getTasksUsingGET");
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

[**CollectionModelOfTask**](CollectionModelOfTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="newShipmentUsingPOST"></a>
# **newShipmentUsingPOST**
> EntityModelOfShipment newShipmentUsingPOST(xVolTenant, shipment, xVolSite)

newShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer xVolTenant = 56; // Integer | 
Shipment shipment = new Shipment(); // Shipment | newShipment
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.newShipmentUsingPOST(xVolTenant, shipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#newShipmentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **shipment** | [**Shipment**](Shipment.md)| newShipment |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="newShipmentsUsingPOST"></a>
# **newShipmentsUsingPOST**
> CollectionModelOfEntityModelOfShipment newShipmentsUsingPOST(xVolTenant, shipment, xVolSite)

newShipments

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer xVolTenant = 56; // Integer | 
List<Shipment> shipment = Arrays.asList(null); // List<Shipment> | newShipments
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfEntityModelOfShipment result = apiInstance.newShipmentsUsingPOST(xVolTenant, shipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#newShipmentsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **shipment** | [**List&lt;Shipment&gt;**](List.md)| newShipments |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfEntityModelOfShipment**](CollectionModelOfEntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="pickupItemsUsingPOST"></a>
# **pickupItemsUsingPOST**
> EntityModelOfShipment pickupItemsUsingPOST(shipmentNumber, xVolTenant, pickupItemsRequest, xVolSite)

pickupItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
PickupItemsRequest pickupItemsRequest = new PickupItemsRequest(); // PickupItemsRequest | pickupItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.pickupItemsUsingPOST(shipmentNumber, xVolTenant, pickupItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#pickupItemsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **pickupItemsRequest** | [**PickupItemsRequest**](PickupItemsRequest.md)| pickupItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="reassignItemsUsingPUT"></a>
# **reassignItemsUsingPUT**
> EntityModelOfShipment reassignItemsUsingPUT(shipmentNumber, xVolTenant, reassignItemsRequest, xVolSite)

reassignItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ReassignItemsRequest reassignItemsRequest = new ReassignItemsRequest(); // ReassignItemsRequest | reassignItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.reassignItemsUsingPUT(shipmentNumber, xVolTenant, reassignItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#reassignItemsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **reassignItemsRequest** | [**ReassignItemsRequest**](ReassignItemsRequest.md)| reassignItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="reassignShipmentUsingPUT"></a>
# **reassignShipmentUsingPUT**
> EntityModelOfShipment reassignShipmentUsingPUT(shipmentNumber, xVolTenant, reassignShipment, xVolSite)

reassignShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ReassignShipment reassignShipment = new ReassignShipment(); // ReassignShipment | reassignShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.reassignShipmentUsingPUT(shipmentNumber, xVolTenant, reassignShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#reassignShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **reassignShipment** | [**ReassignShipment**](ReassignShipment.md)| reassignShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="receiveTransferUsingPUT"></a>
# **receiveTransferUsingPUT**
> EntityModelOfShipment receiveTransferUsingPUT(shipmentNumber, xVolTenant, xVolSite)

receiveTransfer

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.receiveTransferUsingPUT(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#receiveTransferUsingPUT");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="refreshShipmentUsingPUT"></a>
# **refreshShipmentUsingPUT**
> EntityModelOfShipment refreshShipmentUsingPUT(shipmentNumber, xVolTenant, shouldLog, xVolSite)

refreshShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Boolean shouldLog = true; // Boolean | shouldLog
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.refreshShipmentUsingPUT(shipmentNumber, xVolTenant, shouldLog, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#refreshShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **shouldLog** | **Boolean**| shouldLog | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="rejectItemsUsingPUT"></a>
# **rejectItemsUsingPUT**
> EntityModelOfShipment rejectItemsUsingPUT(shipmentNumber, xVolTenant, rejectItemsRequest, xVolSite)

rejectItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
RejectItemsRequest rejectItemsRequest = new RejectItemsRequest(); // RejectItemsRequest | rejectItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.rejectItemsUsingPUT(shipmentNumber, xVolTenant, rejectItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#rejectItemsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **rejectItemsRequest** | [**RejectItemsRequest**](RejectItemsRequest.md)| rejectItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="rejectShipmentUsingPUT"></a>
# **rejectShipmentUsingPUT**
> EntityModelOfShipment rejectShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite)

rejectShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
RejectShipment rejectShipment = new RejectShipment(); // RejectShipment | rejectShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.rejectShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#rejectShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **rejectShipment** | [**RejectShipment**](RejectShipment.md)| rejectShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="replaceShipmentUsingPUT"></a>
# **replaceShipmentUsingPUT**
> EntityModelOfShipment replaceShipmentUsingPUT(shipmentNumber, xVolTenant, shipment, updateFields, xVolSite)

replaceShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Shipment shipment = new Shipment(); // Shipment | newShipment
List<String> updateFields = Arrays.asList(); // List<String> | updateFields
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.replaceShipmentUsingPUT(shipmentNumber, xVolTenant, shipment, updateFields, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#replaceShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **shipment** | [**Shipment**](Shipment.md)| newShipment |
 **updateFields** | [**List&lt;String&gt;**](String.md)| updateFields | [optional]
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="retryFulfillingShipmentUsingPUT"></a>
# **retryFulfillingShipmentUsingPUT**
> EntityModelOfShipment retryFulfillingShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite)

retryFulfillingShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.retryFulfillingShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#retryFulfillingShipmentUsingPUT");
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
 - **Accept**: application/xml, application/json, application/hal+json

<a name="revertUsingPUT"></a>
# **revertUsingPUT**
> EntityModelOfShipment revertUsingPUT(shipmentNumber, taskName, xVolTenant, xVolSite)

revert

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskName = "taskName_example"; // String | taskName
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.revertUsingPUT(shipmentNumber, taskName, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#revertUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **taskName** | **String**| taskName |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="searchAndReceiveTransferUsingPUT"></a>
# **searchAndReceiveTransferUsingPUT**
> EntityModelOfShipment searchAndReceiveTransferUsingPUT(search, xVolTenant, xVolSite)

searchAndReceiveTransfer

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
String search = "search_example"; // String | search
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.searchAndReceiveTransferUsingPUT(search, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#searchAndReceiveTransferUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| search |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="skipTaskUsingPUT"></a>
# **skipTaskUsingPUT**
> EntityModelOfShipment skipTaskUsingPUT(shipmentNumber, taskName, xVolTenant, xVolSite)

skipTask

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskName = "taskName_example"; // String | taskName
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.skipTaskUsingPUT(shipmentNumber, taskName, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#skipTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **taskName** | **String**| taskName |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="transferItemsUsingPUT"></a>
# **transferItemsUsingPUT**
> EntityModelOfShipment transferItemsUsingPUT(shipmentNumber, xVolTenant, transferItemsRequest, xVolSite)

transferItems

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
TransferItemsRequest transferItemsRequest = new TransferItemsRequest(); // TransferItemsRequest | transferItemsRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.transferItemsUsingPUT(shipmentNumber, xVolTenant, transferItemsRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#transferItemsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **transferItemsRequest** | [**TransferItemsRequest**](TransferItemsRequest.md)| transferItemsRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="transferShipmentUsingPUT"></a>
# **transferShipmentUsingPUT**
> EntityModelOfShipment transferShipmentUsingPUT(shipmentNumber, xVolTenant, transferShipment, xVolSite)

transferShipment

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
TransferShipment transferShipment = new TransferShipment(); // TransferShipment | transferShipmentRequestDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfShipment result = apiInstance.transferShipmentUsingPUT(shipmentNumber, xVolTenant, transferShipment, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#transferShipmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **transferShipment** | [**TransferShipment**](TransferShipment.md)| transferShipmentRequestDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="workflowDefinitionImageUsingGET"></a>
# **workflowDefinitionImageUsingGET**
> String workflowDefinitionImageUsingGET(shipmentNumber, xVolTenant, xVolSite)

workflowDefinitionImage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.workflowDefinitionImageUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#workflowDefinitionImageUsingGET");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, image/svg+xml

<a name="workflowInstanceImageUsingGET"></a>
# **workflowInstanceImageUsingGET**
> String workflowInstanceImageUsingGET(shipmentNumber, xVolTenant, xVolSite)

workflowInstanceImage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.workflowInstanceImageUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#workflowInstanceImageUsingGET");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, image/svg+xml

