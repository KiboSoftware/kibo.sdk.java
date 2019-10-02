# WorkflowProcessControllerApi

All URIs are relative to *http://services-tp.dev01.kubedev.kibo-dev.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkflowProcessUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerId}/{processId} | getWorkflowProcess
[**getWorkflowProcessUsingGET1**](WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET1) | **GET** /commerce/processes/shipmentType/{shipmentType} | getWorkflowProcess
[**getWorkflowProcessesUsingGET**](WorkflowProcessControllerApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | getWorkflowProcesses


<a name="getWorkflowProcessUsingGET"></a>
# **getWorkflowProcessUsingGET**
> ResourceOfWorkflowProcess getWorkflowProcessUsingGET(containerId, processId, xVolTenant, xVolSite)

getWorkflowProcess

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.WorkflowProcessControllerApi;


WorkflowProcessControllerApi apiInstance = new WorkflowProcessControllerApi();
String containerId = "containerId_example"; // String | containerId
String processId = "processId_example"; // String | processId
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    ResourceOfWorkflowProcess result = apiInstance.getWorkflowProcessUsingGET(containerId, processId, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **processId** | **String**| processId |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**ResourceOfWorkflowProcess**](ResourceOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessUsingGET1"></a>
# **getWorkflowProcessUsingGET1**
> ResourceOfWorkflowProcess getWorkflowProcessUsingGET1(shipmentType, xVolTenant, xVolSite)

getWorkflowProcess

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
    ResourceOfWorkflowProcess result = apiInstance.getWorkflowProcessUsingGET1(shipmentType, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowProcessControllerApi#getWorkflowProcessUsingGET1");
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

[**ResourceOfWorkflowProcess**](ResourceOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getWorkflowProcessesUsingGET"></a>
# **getWorkflowProcessesUsingGET**
> ResourcesOfResourceOfWorkflowProcess getWorkflowProcessesUsingGET(xVolTenant, xVolSite)

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
    ResourcesOfResourceOfWorkflowProcess result = apiInstance.getWorkflowProcessesUsingGET(xVolTenant, xVolSite);
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

[**ResourcesOfResourceOfWorkflowProcess**](ResourcesOfResourceOfWorkflowProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

