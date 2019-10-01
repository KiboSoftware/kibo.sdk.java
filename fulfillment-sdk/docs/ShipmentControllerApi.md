# ShipmentControllerApi

All URIs are relative to *http://services-tp.dev01.kubedev.kibo-dev.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backorderItemsUpdateUsingPUT**](ShipmentControllerApi.md#backorderItemsUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItemsUpdate
[**backorderItemsUsingPOST**](ShipmentControllerApi.md#backorderItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItems
[**backorderShipmentUsingPOST**](ShipmentControllerApi.md#backorderShipmentUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backordered | backorderShipment
[**cancelItemsUsingPUT**](ShipmentControllerApi.md#cancelItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | cancelItems
[**cancelShipmentUsingPUT**](ShipmentControllerApi.md#cancelShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | cancelShipment
[**deleteShipmentUsingDELETE**](ShipmentControllerApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | deleteShipment
[**destinationUpdateUsingPUT**](ShipmentControllerApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | destinationUpdate
[**executeUsingPUT**](ShipmentControllerApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/completed | execute
[**fulfillShipmentUsingPUT**](ShipmentControllerApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | fulfillShipment
[**getDashboardUsingGET**](ShipmentControllerApi.md#getDashboardUsingGET) | **GET** /commerce/shipments/dashboard | getDashboard
[**getShipmentUsingGET**](ShipmentControllerApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | getShipment
[**getShipmentsUsingGET**](ShipmentControllerApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | getShipments
[**getTasksUsingGET**](ShipmentControllerApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | getTasks
[**newShipmentUsingPOST**](ShipmentControllerApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | newShipment
[**reassignItemsUsingPUT**](ShipmentControllerApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | reassignItems
[**reassignShipmentUsingPUT**](ShipmentControllerApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | reassignShipment
[**rejectShipmentUsingPUT**](ShipmentControllerApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | rejectShipment
[**replaceShipmentUsingPUT**](ShipmentControllerApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | replaceShipment
[**revertUsingPUT**](ShipmentControllerApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/reverted | revert
[**skipTaskUsingPUT**](ShipmentControllerApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/skipped | skipTask
[**updatePackageUsingPUT**](ShipmentControllerApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | updatePackage
[**workflowDefinitionImageUsingGET**](ShipmentControllerApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | workflowDefinitionImage
[**workflowInstanceImageUsingGET**](ShipmentControllerApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | workflowInstanceImage


<a name="backorderItemsUpdateUsingPUT"></a>
# **backorderItemsUpdateUsingPUT**
> ResourceOfShipment backorderItemsUpdateUsingPUT(shipmentNumber, xVolTenant, backorderItemsUpdateRequest, xVolSite)

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
    ResourceOfShipment result = apiInstance.backorderItemsUpdateUsingPUT(shipmentNumber, xVolTenant, backorderItemsUpdateRequest, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="backorderItemsUsingPOST"></a>
# **backorderItemsUsingPOST**
> ResourceOfShipment backorderItemsUsingPOST(shipmentNumber, xVolTenant, backorderItemsRequest, xVolSite)

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
    ResourceOfShipment result = apiInstance.backorderItemsUsingPOST(shipmentNumber, xVolTenant, backorderItemsRequest, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="backorderShipmentUsingPOST"></a>
# **backorderShipmentUsingPOST**
> ResourceOfShipment backorderShipmentUsingPOST(shipmentNumber, xVolTenant, backorderShipmentRequest, xVolSite)

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
    ResourceOfShipment result = apiInstance.backorderShipmentUsingPOST(shipmentNumber, xVolTenant, backorderShipmentRequest, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="cancelItemsUsingPUT"></a>
# **cancelItemsUsingPUT**
> ResourceOfShipment cancelItemsUsingPUT(shipmentNumber, xVolTenant, cancelItemsRequest, xVolSite)

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
    ResourceOfShipment result = apiInstance.cancelItemsUsingPUT(shipmentNumber, xVolTenant, cancelItemsRequest, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="cancelShipmentUsingPUT"></a>
# **cancelShipmentUsingPUT**
> ResourceOfShipment cancelShipmentUsingPUT(shipmentNumber, xVolTenant, cancelShipment, xVolSite)

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
    ResourceOfShipment result = apiInstance.cancelShipmentUsingPUT(shipmentNumber, xVolTenant, cancelShipment, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
> ResourceOfShipment destinationUpdateUsingPUT(shipmentNumber, xVolTenant, destination, xVolSite)

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
    ResourceOfShipment result = apiInstance.destinationUpdateUsingPUT(shipmentNumber, xVolTenant, destination, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="executeUsingPUT"></a>
# **executeUsingPUT**
> ResourceOfShipment executeUsingPUT(shipmentNumber, taskId, xVolTenant, taskComplete, xVolSite)

execute

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskId = "taskId_example"; // String | taskId
Integer xVolTenant = 56; // Integer | 
TaskComplete taskComplete = new TaskComplete(); // TaskComplete | taskCompleteDto
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfShipment result = apiInstance.executeUsingPUT(shipmentNumber, taskId, xVolTenant, taskComplete, xVolSite);
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
 **taskId** | **String**| taskId |
 **xVolTenant** | **Integer**|  |
 **taskComplete** | [**TaskComplete**](TaskComplete.md)| taskCompleteDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="fulfillShipmentUsingPUT"></a>
# **fulfillShipmentUsingPUT**
> ResourceOfShipment fulfillShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite)

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
    ResourceOfShipment result = apiInstance.fulfillShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getDashboardUsingGET"></a>
# **getDashboardUsingGET**
> ResourcesOfDashboardResponse getDashboardUsingGET(fulfillmentLocationCodes, xVolTenant, xVolSite)

getDashboard

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
List<String> fulfillmentLocationCodes = Arrays.asList(); // List<String> | fulfillmentLocationCodes
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    ResourcesOfDashboardResponse result = apiInstance.getDashboardUsingGET(fulfillmentLocationCodes, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#getDashboardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fulfillmentLocationCodes** | [**List&lt;String&gt;**](String.md)| fulfillmentLocationCodes |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourcesOfDashboardResponse**](ResourcesOfDashboardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentUsingGET"></a>
# **getShipmentUsingGET**
> ResourceOfShipment getShipmentUsingGET(shipmentNumber, xVolTenant, xVolSite)

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
    ResourceOfShipment result = apiInstance.getShipmentUsingGET(shipmentNumber, xVolTenant, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getShipmentsUsingGET"></a>
# **getShipmentsUsingGET**
> PagedResourcesOfResourceOfShipment getShipmentsUsingGET(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite)

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
    PagedResourcesOfResourceOfShipment result = apiInstance.getShipmentsUsingGET(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite);
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

[**PagedResourcesOfResourceOfShipment**](PagedResourcesOfResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getTasksUsingGET"></a>
# **getTasksUsingGET**
> ResourcesOfTask getTasksUsingGET(shipmentNumber, xVolTenant, xVolSite)

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
    ResourcesOfTask result = apiInstance.getTasksUsingGET(shipmentNumber, xVolTenant, xVolSite);
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

[**ResourcesOfTask**](ResourcesOfTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="newShipmentUsingPOST"></a>
# **newShipmentUsingPOST**
> ResourceOfShipment newShipmentUsingPOST(xVolTenant, shipment, xVolSite)

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
    ResourceOfShipment result = apiInstance.newShipmentUsingPOST(xVolTenant, shipment, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="reassignItemsUsingPUT"></a>
# **reassignItemsUsingPUT**
> ResourceOfShipment reassignItemsUsingPUT(shipmentNumber, xVolTenant, reassignItemsRequest, xVolSite)

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
    ResourceOfShipment result = apiInstance.reassignItemsUsingPUT(shipmentNumber, xVolTenant, reassignItemsRequest, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="reassignShipmentUsingPUT"></a>
# **reassignShipmentUsingPUT**
> ResourceOfShipment reassignShipmentUsingPUT(shipmentNumber, xVolTenant, reassignShipment, xVolSite)

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
    ResourceOfShipment result = apiInstance.reassignShipmentUsingPUT(shipmentNumber, xVolTenant, reassignShipment, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="rejectShipmentUsingPUT"></a>
# **rejectShipmentUsingPUT**
> ResourceOfShipment rejectShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite)

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
    ResourceOfShipment result = apiInstance.rejectShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite);
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

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="replaceShipmentUsingPUT"></a>
# **replaceShipmentUsingPUT**
> ResourceOfShipment replaceShipmentUsingPUT(shipmentNumber, xVolTenant, shipment, xVolSite)

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
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfShipment result = apiInstance.replaceShipmentUsingPUT(shipmentNumber, xVolTenant, shipment, xVolSite);
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
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="revertUsingPUT"></a>
# **revertUsingPUT**
> ResourceOfShipment revertUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite)

revert

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskId = "taskId_example"; // String | taskId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfShipment result = apiInstance.revertUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite);
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
 **taskId** | **String**| taskId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="skipTaskUsingPUT"></a>
# **skipTaskUsingPUT**
> ResourceOfShipment skipTaskUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite)

skipTask

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
String taskId = "taskId_example"; // String | taskId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfShipment result = apiInstance.skipTaskUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite);
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
 **taskId** | **String**| taskId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourceOfShipment**](ResourceOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="updatePackageUsingPUT"></a>
# **updatePackageUsingPUT**
> ResourceOfShipment updatePackageUsingPUT(packageId, shipmentNumber, xVolTenant, modelPackage, xVolSite)

updatePackage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.ShipmentControllerApi;


ShipmentControllerApi apiInstance = new ShipmentControllerApi();
String packageId = "packageId_example"; // String | packageId
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
ModelPackage modelPackage = new ModelPackage(); // ModelPackage | packageDto
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfShipment result = apiInstance.updatePackageUsingPUT(packageId, shipmentNumber, xVolTenant, modelPackage, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentControllerApi#updatePackageUsingPUT");
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

[**ResourceOfShipment**](ResourceOfShipment.md)

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
 - **Accept**: application/xml

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
 - **Accept**: application/xml

