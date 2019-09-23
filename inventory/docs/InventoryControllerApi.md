# InventoryControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregate**](InventoryControllerApi.md#aggregate) | **POST** /v5/inventory/aggregate/ | 
[**getInventory**](InventoryControllerApi.md#getInventory) | **GET** /v5/inventory/ | 
[**postQueryInventory**](InventoryControllerApi.md#postQueryInventory) | **POST** /v5/inventory/ | 


<a name="aggregate"></a>
# **aggregate**
> List&lt;AggregateResponse&gt; aggregate(xVolTenant, aggregateRequest, xVolSite)



Aggregates Inventory

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.InventoryControllerApi;


InventoryControllerApi apiInstance = new InventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AggregateRequest aggregateRequest = new AggregateRequest(); // AggregateRequest | Request to aggregate inventory
Integer xVolSite = 56; // Integer | Site ID
try {
    List<AggregateResponse> result = apiInstance.aggregate(xVolTenant, aggregateRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryControllerApi#aggregate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **aggregateRequest** | [**AggregateRequest**](AggregateRequest.md)| Request to aggregate inventory |
 **xVolSite** | **Integer**| Site ID | [optional]

### Return type

[**List&lt;AggregateResponse&gt;**](AggregateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInventory"></a>
# **getInventory**
> List&lt;InventoryResponse&gt; getInventory(xVolTenant, type, xVolSite, items, requestLocation, locationWhitelist, locationBlacklist, limit, ignoreSafetyStock, includeNegativeInventory, shippingLocation, transferEnabled, pickup, includeInAggregate, includeAttributes)



Get inventory from specified location

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.InventoryControllerApi;


InventoryControllerApi apiInstance = new InventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String type = "type_example"; // String | Type of request enum
Integer xVolSite = 56; // Integer | Site ID
List<ItemQuantity> items = Arrays.asList(null); // List<ItemQuantity> | List of Items to search on
RequestLocation requestLocation = new RequestLocation(); // RequestLocation | Location for Request
List<String> locationWhitelist = Arrays.asList(); // List<String> | List of location codes that are allowed to be included in results
List<String> locationBlacklist = Arrays.asList(); // List<String> | List of location codes that are NOT allowed to be included in results
Integer limit = 56; // Integer | The maximum number of results to return, defaults to 100 for most
Boolean ignoreSafetyStock = true; // Boolean | Whether to ignore the safety stock buffer put in place
Boolean includeNegativeInventory = true; // Boolean | Whether to allow items with negative inventory in the results
Boolean shippingLocation = true; // Boolean | Whether to limit results to locations that are shipping enabled
Boolean transferEnabled = true; // Boolean | Filter results by locations that have transfer enabled (true) or don't (false)
Boolean pickup = true; // Boolean | Filter results by locations that are pickup-enabled (true) or not (false)
Boolean includeInAggregate = true; // Boolean | Filter results by locations that have aggregate export enabled (true) or don't (false)
Boolean includeAttributes = true; // Boolean | Flag to include attributes or not
try {
    List<InventoryResponse> result = apiInstance.getInventory(xVolTenant, type, xVolSite, items, requestLocation, locationWhitelist, locationBlacklist, limit, ignoreSafetyStock, includeNegativeInventory, shippingLocation, transferEnabled, pickup, includeInAggregate, includeAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryControllerApi#getInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **type** | **String**| Type of request enum | [enum: ALL, PARTIAL, ANY, ALL_STORES]
 **xVolSite** | **Integer**| Site ID | [optional]
 **items** | [**List&lt;ItemQuantity&gt;**](ItemQuantity.md)| List of Items to search on | [optional]
 **requestLocation** | [**RequestLocation**](.md)| Location for Request | [optional] [default to null]
 **locationWhitelist** | [**List&lt;String&gt;**](String.md)| List of location codes that are allowed to be included in results | [optional]
 **locationBlacklist** | [**List&lt;String&gt;**](String.md)| List of location codes that are NOT allowed to be included in results | [optional]
 **limit** | **Integer**| The maximum number of results to return, defaults to 100 for most | [optional]
 **ignoreSafetyStock** | **Boolean**| Whether to ignore the safety stock buffer put in place | [optional]
 **includeNegativeInventory** | **Boolean**| Whether to allow items with negative inventory in the results | [optional]
 **shippingLocation** | **Boolean**| Whether to limit results to locations that are shipping enabled | [optional]
 **transferEnabled** | **Boolean**| Filter results by locations that have transfer enabled (true) or don&#39;t (false) | [optional]
 **pickup** | **Boolean**| Filter results by locations that are pickup-enabled (true) or not (false) | [optional]
 **includeInAggregate** | **Boolean**| Filter results by locations that have aggregate export enabled (true) or don&#39;t (false) | [optional]
 **includeAttributes** | **Boolean**| Flag to include attributes or not | [optional]

### Return type

[**List&lt;InventoryResponse&gt;**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postQueryInventory"></a>
# **postQueryInventory**
> List&lt;InventoryResponse&gt; postQueryInventory(xVolTenant, inventoryRequest, xVolSite)



Queries for specified inventory at given location

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.InventoryControllerApi;


InventoryControllerApi apiInstance = new InventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
InventoryRequest inventoryRequest = new InventoryRequest(); // InventoryRequest | Request to get inventory
Integer xVolSite = 56; // Integer | Site ID
try {
    List<InventoryResponse> result = apiInstance.postQueryInventory(xVolTenant, inventoryRequest, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryControllerApi#postQueryInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **inventoryRequest** | [**InventoryRequest**](InventoryRequest.md)| Request to get inventory |
 **xVolSite** | **Integer**| Site ID | [optional]

### Return type

[**List&lt;InventoryResponse&gt;**](InventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

