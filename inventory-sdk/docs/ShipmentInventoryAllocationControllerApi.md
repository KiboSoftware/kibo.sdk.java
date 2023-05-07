# ShipmentInventoryAllocationControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShipmentInventoryAllocations**](ShipmentInventoryAllocationControllerApi.md#getShipmentInventoryAllocations) | **POST** /v5/inventory/shipmentInventoryAllocations | 


<a name="getShipmentInventoryAllocations"></a>
# **getShipmentInventoryAllocations**
> ShipmentInventoryAllocationResponse getShipmentInventoryAllocations(xVolTenant, shipmentInventoryAllocationRequest)



Get future Inventory Allocations by shipment Ids

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ShipmentInventoryAllocationControllerApi;


ShipmentInventoryAllocationControllerApi apiInstance = new ShipmentInventoryAllocationControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
ShipmentInventoryAllocationRequest shipmentInventoryAllocationRequest = new ShipmentInventoryAllocationRequest(); // ShipmentInventoryAllocationRequest | Request to future and current inventory allocations of item
try {
    ShipmentInventoryAllocationResponse result = apiInstance.getShipmentInventoryAllocations(xVolTenant, shipmentInventoryAllocationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentInventoryAllocationControllerApi#getShipmentInventoryAllocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **shipmentInventoryAllocationRequest** | [**ShipmentInventoryAllocationRequest**](ShipmentInventoryAllocationRequest.md)| Request to future and current inventory allocations of item |

### Return type

[**ShipmentInventoryAllocationResponse**](ShipmentInventoryAllocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

