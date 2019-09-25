# ProductMappingControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductMapping**](ProductMappingControllerApi.md#createProductMapping) | **POST** /v1/productMapping | 
[**deleteProductMapping**](ProductMappingControllerApi.md#deleteProductMapping) | **DELETE** /v1/productMapping/{direction} | 
[**getProductMapping**](ProductMappingControllerApi.md#getProductMapping) | **GET** /v1/productMapping | 


<a name="createProductMapping"></a>
# **createProductMapping**
> ProductMapping createProductMapping(xVolTenant, productMappingRequest)



Creates a Product Mapping

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ProductMappingControllerApi;


ProductMappingControllerApi apiInstance = new ProductMappingControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
ProductMappingRequest productMappingRequest = new ProductMappingRequest(); // ProductMappingRequest | Request to work with Product Mappings
try {
    ProductMapping result = apiInstance.createProductMapping(xVolTenant, productMappingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductMappingControllerApi#createProductMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **productMappingRequest** | [**ProductMappingRequest**](ProductMappingRequest.md)| Request to work with Product Mappings |

### Return type

[**ProductMapping**](ProductMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductMapping"></a>
# **deleteProductMapping**
> Boolean deleteProductMapping(xVolTenant, direction, productMappingRequest)



Delete a Product Mapping

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ProductMappingControllerApi;


ProductMappingControllerApi apiInstance = new ProductMappingControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String direction = "direction_example"; // String | Direction
ProductMappingRequest productMappingRequest = new ProductMappingRequest(); // ProductMappingRequest | Request to work with Product Mappings
try {
    Boolean result = apiInstance.deleteProductMapping(xVolTenant, direction, productMappingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductMappingControllerApi#deleteProductMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **direction** | **String**| Direction |
 **productMappingRequest** | [**ProductMappingRequest**](ProductMappingRequest.md)| Request to work with Product Mappings |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductMapping"></a>
# **getProductMapping**
> ProductMappingResponse getProductMapping(xVolTenant)



Gets a list Product Mappings for the specified tenant

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ProductMappingControllerApi;


ProductMappingControllerApi apiInstance = new ProductMappingControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    ProductMappingResponse result = apiInstance.getProductMapping(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductMappingControllerApi#getProductMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**ProductMappingResponse**](ProductMappingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

