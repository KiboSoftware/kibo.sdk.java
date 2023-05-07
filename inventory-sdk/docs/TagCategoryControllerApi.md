# TagCategoryControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTagCategory**](TagCategoryControllerApi.md#createTagCategory) | **POST** /v1/tagCategory | 
[**deleteTagCategory**](TagCategoryControllerApi.md#deleteTagCategory) | **DELETE** /v1/tagCategory/{tag_category_name} | 
[**getTagCategory**](TagCategoryControllerApi.md#getTagCategory) | **GET** /v1/tagCategory/{tag_category_name} | 
[**getTagCategoryAll**](TagCategoryControllerApi.md#getTagCategoryAll) | **GET** /v1/tagCategory/ | 
[**updateTagCategory**](TagCategoryControllerApi.md#updateTagCategory) | **PUT** /v1/tagCategory/{tag_category_name} | 


<a name="createTagCategory"></a>
# **createTagCategory**
> TagCategory createTagCategory(xVolTenant, tagCategory)



Create a tag category

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagCategoryControllerApi;


TagCategoryControllerApi apiInstance = new TagCategoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
TagCategory tagCategory = new TagCategory(); // TagCategory | Request create or modify Tag Categories
try {
    TagCategory result = apiInstance.createTagCategory(xVolTenant, tagCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagCategoryControllerApi#createTagCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategory** | [**TagCategory**](TagCategory.md)| Request create or modify Tag Categories |

### Return type

[**TagCategory**](TagCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagCategory"></a>
# **deleteTagCategory**
> DeletedCountResponse deleteTagCategory(xVolTenant, tagCategoryName)



Delete a Tag category

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagCategoryControllerApi;


TagCategoryControllerApi apiInstance = new TagCategoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
try {
    DeletedCountResponse result = apiInstance.deleteTagCategory(xVolTenant, tagCategoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagCategoryControllerApi#deleteTagCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagCategory"></a>
# **getTagCategory**
> TagCategory getTagCategory(xVolTenant, tagCategoryName)



Get a tag category

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagCategoryControllerApi;


TagCategoryControllerApi apiInstance = new TagCategoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
try {
    TagCategory result = apiInstance.getTagCategory(xVolTenant, tagCategoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagCategoryControllerApi#getTagCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |

### Return type

[**TagCategory**](TagCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagCategoryAll"></a>
# **getTagCategoryAll**
> List&lt;TagCategory&gt; getTagCategoryAll(xVolTenant)



Get all tag categories for a tenant

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagCategoryControllerApi;


TagCategoryControllerApi apiInstance = new TagCategoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
try {
    List<TagCategory> result = apiInstance.getTagCategoryAll(xVolTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagCategoryControllerApi#getTagCategoryAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |

### Return type

[**List&lt;TagCategory&gt;**](TagCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTagCategory"></a>
# **updateTagCategory**
> TagCategory updateTagCategory(xVolTenant, tagCategoryName, tagCategory)



Update the designated tag category

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagCategoryControllerApi;


TagCategoryControllerApi apiInstance = new TagCategoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
TagCategory tagCategory = new TagCategory(); // TagCategory | Request create or modify Tag Categories
try {
    TagCategory result = apiInstance.updateTagCategory(xVolTenant, tagCategoryName, tagCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagCategoryControllerApi#updateTagCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |
 **tagCategory** | [**TagCategory**](TagCategory.md)| Request create or modify Tag Categories |

### Return type

[**TagCategory**](TagCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

