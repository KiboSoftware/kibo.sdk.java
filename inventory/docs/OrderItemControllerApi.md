# OrderItemControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderItemInformation**](OrderItemControllerApi.md#getOrderItemInformation) | **POST** /v5/inventory/getOrderItemInformation/ | 
[**getOrderItemLog**](OrderItemControllerApi.md#getOrderItemLog) | **POST** /v5/inventory/getOrderItemLog/ | 


<a name="getOrderItemInformation"></a>
# **getOrderItemInformation**
> List&lt;OrderItemInformation&gt; getOrderItemInformation(xVolTenant, orderItemInformationRequest)



Get Order Item Information

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.OrderItemControllerApi;


OrderItemControllerApi apiInstance = new OrderItemControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
OrderItemInformationRequest orderItemInformationRequest = new OrderItemInformationRequest(); // OrderItemInformationRequest | Request to retrieve order item information
try {
    List<OrderItemInformation> result = apiInstance.getOrderItemInformation(xVolTenant, orderItemInformationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemControllerApi#getOrderItemInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **orderItemInformationRequest** | [**OrderItemInformationRequest**](OrderItemInformationRequest.md)| Request to retrieve order item information |

### Return type

[**List&lt;OrderItemInformation&gt;**](OrderItemInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderItemLog"></a>
# **getOrderItemLog**
> List&lt;OrderItemLogResponse&gt; getOrderItemLog(xVolTenant, orderItemLogRequest)



Get Order Item Log

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.phps.inventory.OrderItemControllerApi;


OrderItemControllerApi apiInstance = new OrderItemControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
OrderItemLogRequest orderItemLogRequest = new OrderItemLogRequest(); // OrderItemLogRequest | Request to retrieve order item log(s)
try {
    List<OrderItemLogResponse> result = apiInstance.getOrderItemLog(xVolTenant, orderItemLogRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemControllerApi#getOrderItemLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **orderItemLogRequest** | [**OrderItemLogRequest**](OrderItemLogRequest.md)| Request to retrieve order item log(s) |

### Return type

[**List&lt;OrderItemLogResponse&gt;**](OrderItemLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

