# WorkflowProcessControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDefinitionImageUsingGET**](WorkflowProcessControllerApi.md#getDefinitionImageUsingGET) | **GET** /commerce/processes/definitionImage/{containerIdOrAlias}/{processId} | getDefinitionImage
[**getWorkflowProcessByShipmentTypeLocationCodeUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeLocationCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/location/{locationCode} | getWorkflowProcessByShipmentTypeLocationCode
[**getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/locationGroup/{locationGroupCode} | getWorkflowProcessByShipmentTypeLocationGroupCode
[**getWorkflowProcessByShipmentTypeUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType} | getWorkflowProcessByShipmentType
[**getWorkflowProcessUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerIdOrAlias}/{processId} | getWorkflowProcess
[**getWorkflowProcessesUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | getWorkflowProcesses


<a name="getDefinitionImageUsingGET"></a>
# **getDefinitionImageUsingGET**
> String getDefinitionImageUsingGET(containerIdOrAlias, processId, xVolTenant, xVolSite)

getDefinitionImage

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
String processId = "processId_example"; // String | processId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    String result = apiInstance.getDefinitionImageUsingGET(containerIdOrAlias, processId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getDefinitionImageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerIdOrAlias** | **String**| containerIdOrAlias |
 **processId** | **String**| processId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, image/svg+xml

<a name="getWorkflowProcessByShipmentTypeLocationCodeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeLocationCodeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationCodeUsingGET(locationCode, shipmentType, xVolTenant, xVolSite)

getWorkflowProcessByShipmentTypeLocationCode

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String locationCode = "locationCode_example"; // String | locationCode
String shipmentType = "shipmentType_example"; // String | shipmentType
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationCodeUsingGET(locationCode, shipmentType, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessByShipmentTypeLocationCodeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationCode** | **String**| locationCode |
 **shipmentType** | **String**| shipmentType |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET(locationGroupCode, shipmentType, xVolTenant, xVolSite)

getWorkflowProcessByShipmentTypeLocationGroupCode

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String locationGroupCode = "locationGroupCode_example"; // String | locationGroupCode
String shipmentType = "shipmentType_example"; // String | shipmentType
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET(locationGroupCode, shipmentType, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationGroupCode** | **String**| locationGroupCode |
 **shipmentType** | **String**| shipmentType |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessByShipmentTypeUsingGET"></a>
# **getWorkflowProcessByShipmentTypeUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessByShipmentTypeUsingGET(shipmentType, xVolTenant, xVolSite)

getWorkflowProcessByShipmentType

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String shipmentType = "shipmentType_example"; // String | shipmentType
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessByShipmentTypeUsingGET(shipmentType, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessByShipmentTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentType** | **String**| shipmentType |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessUsingGET"></a>
# **getWorkflowProcessUsingGET**
> EntityModelOfWorkflowProcess getWorkflowProcessUsingGET(containerIdOrAlias, processId, xVolTenant, xVolSite)

getWorkflowProcess

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String containerIdOrAlias = "containerIdOrAlias_example"; // String | containerIdOrAlias
String processId = "processId_example"; // String | processId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessUsingGET(containerIdOrAlias, processId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerIdOrAlias** | **String**| containerIdOrAlias |
 **processId** | **String**| processId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfWorkflowProcess**](EntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessesUsingGET"></a>
# **getWorkflowProcessesUsingGET**
> CollectionModelOfEntityModelOfWorkflowProcess getWorkflowProcessesUsingGET(xVolTenant, xVolSite)

getWorkflowProcesses

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfEntityModelOfWorkflowProcess result = apiInstance.getWorkflowProcessesUsingGET(xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfEntityModelOfWorkflowProcess**](CollectionModelOfEntityModelOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

