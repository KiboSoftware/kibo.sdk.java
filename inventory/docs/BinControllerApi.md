# BinControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBin**](BinControllerApi.md#createBin) | **POST** /v1/bin/ | 
[**deleteBin**](BinControllerApi.md#deleteBin) | **DELETE** /v1/bin/{bin_id} | 
[**getBin**](BinControllerApi.md#getBin) | **GET** /v1/bin/{bin_id} | 
[**getBinStatuses**](BinControllerApi.md#getBinStatuses) | **GET** /v1/bin/binStatuses/ | 
[**getBinTypes**](BinControllerApi.md#getBinTypes) | **GET** /v1/bin/binTypes/ | 
[**getBins**](BinControllerApi.md#getBins) | **GET** /v1/bin/ | 
[**loadInventory**](BinControllerApi.md#loadInventory) | **POST** /v1/bin/loadInventory/ | 
[**searchBins**](BinControllerApi.md#searchBins) | **POST** /v1/bin/searchInventory/ | 
[**updateBin**](BinControllerApi.md#updateBin) | **POST** /v1/bin/{bin_id}/ | 
[**updateBins**](BinControllerApi.md#updateBins) | **POST** /v1/bin/updateBins/ | 


<a name="createBin"></a>
# **createBin**
> Integer createBin(xVolTenant, createBinRequest)



Create a bin

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateBinRequest createBinRequest = new CreateBinRequest(); // CreateBinRequest | Request to create a new bin
try {
    Integer result = apiInstance.createBin(xVolTenant, createBinRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#createBin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createBinRequest** | [**CreateBinRequest**](CreateBinRequest.md)| Request to create a new bin |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBin"></a>
# **deleteBin**
> BaseResponse deleteBin(xVolTenant, binId, binName, locationCode)



Delete a bin

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long binId = 56L; // Long | Id of bin to get
Integer binName = 56; // Integer | Bin Name
String locationCode = "locationCode_example"; // String | Location Code
try {
    BaseResponse result = apiInstance.deleteBin(xVolTenant, binId, binName, locationCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#deleteBin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **binId** | **Long**| Id of bin to get |
 **binName** | **Integer**| Bin Name |
 **locationCode** | **String**| Location Code |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBin"></a>
# **getBin**
> Bin getBin(xVolTenant, binId)



Get a bin

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long binId = 56L; // Long | Id of bin to get
try {
    Bin result = apiInstance.getBin(xVolTenant, binId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#getBin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **binId** | **Long**| Id of bin to get |

### Return type

[**Bin**](Bin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBinStatuses"></a>
# **getBinStatuses**
> List&lt;BinStatusModel&gt; getBinStatuses(xVolTenant)



Get list of bin statuses

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    List<BinStatusModel> result = apiInstance.getBinStatuses(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#getBinStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**List&lt;BinStatusModel&gt;**](BinStatusModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBinTypes"></a>
# **getBinTypes**
> List&lt;BinTypeModel&gt; getBinTypes(xVolTenant)



Get list of bin types

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    List<BinTypeModel> result = apiInstance.getBinTypes(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#getBinTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**List&lt;BinTypeModel&gt;**](BinTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBins"></a>
# **getBins**
> BinResponseModel getBins(xVolTenant, locationID, searchTerm, perPage, page)



Get a list of bins

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long locationID = 56L; // Long | Id of location
Long searchTerm = 56L; // Long | Term to match in bins
Long perPage = 56L; // Long | Results per page
Long page = 56L; // Long | Page to show
try {
    BinResponseModel result = apiInstance.getBins(xVolTenant, locationID, searchTerm, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#getBins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationID** | **Long**| Id of location |
 **searchTerm** | **Long**| Term to match in bins |
 **perPage** | **Long**| Results per page | [optional]
 **page** | **Long**| Page to show | [optional]

### Return type

[**BinResponseModel**](BinResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadInventory"></a>
# **loadInventory**
> LoadBinInventoryResponse loadInventory(xVolTenant, loadBinInventoryRequest)



Loads bin inventory for designated bins

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
LoadBinInventoryRequest loadBinInventoryRequest = new LoadBinInventoryRequest(); // LoadBinInventoryRequest | Request to load bin inventory
try {
    LoadBinInventoryResponse result = apiInstance.loadInventory(xVolTenant, loadBinInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#loadInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **loadBinInventoryRequest** | [**LoadBinInventoryRequest**](LoadBinInventoryRequest.md)| Request to load bin inventory |

### Return type

[**LoadBinInventoryResponse**](LoadBinInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchBins"></a>
# **searchBins**
> BinSearchResponse searchBins(xVolTenant, binSearchRequest)



Search bins for a inventory by bin name or any product identifier

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
BinSearchRequest binSearchRequest = new BinSearchRequest(); // BinSearchRequest | Request to allocate inventory
try {
    BinSearchResponse result = apiInstance.searchBins(xVolTenant, binSearchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#searchBins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **binSearchRequest** | [**BinSearchRequest**](BinSearchRequest.md)| Request to allocate inventory |

### Return type

[**BinSearchResponse**](BinSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBin"></a>
# **updateBin**
> Bin updateBin(xVolTenant, binId, updateBinRequest)



Update the designated bin

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long binId = 56L; // Long | Id of bin to update
UpdateBinRequest updateBinRequest = new UpdateBinRequest(); // UpdateBinRequest | Request to update a bin
try {
    Bin result = apiInstance.updateBin(xVolTenant, binId, updateBinRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#updateBin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **binId** | **Long**| Id of bin to update |
 **updateBinRequest** | [**UpdateBinRequest**](UpdateBinRequest.md)| Request to update a bin |

### Return type

[**Bin**](Bin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBins"></a>
# **updateBins**
> UpdateBinsResponse updateBins(xVolTenant, updateBinsRequest)



Update the designated bins

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.BinControllerApi;


BinControllerApi apiInstance = new BinControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
UpdateBinsRequest updateBinsRequest = new UpdateBinsRequest(); // UpdateBinsRequest | Request to update multiple bins
try {
    UpdateBinsResponse result = apiInstance.updateBins(xVolTenant, updateBinsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BinControllerApi#updateBins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **updateBinsRequest** | [**UpdateBinsRequest**](UpdateBinsRequest.md)| Request to update multiple bins |

### Return type

[**UpdateBinsResponse**](UpdateBinsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

