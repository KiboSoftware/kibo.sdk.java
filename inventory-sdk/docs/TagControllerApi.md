# TagControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagControllerApi.md#createTag) | **POST** /v1/tagCategory/{tag_category_name}/tag | 
[**deleteTag**](TagControllerApi.md#deleteTag) | **DELETE** /v1/tagCategory/{tag_category_name}/tag/{tag_value} | 
[**getTag**](TagControllerApi.md#getTag) | **GET** /v1/tagCategory/{tag_category_name}/tag/{tag_value} | 
[**updateTag**](TagControllerApi.md#updateTag) | **PUT** /v1/tagCategory/{tag_category_name}/tag/{tag_value} | 


<a name="createTag"></a>
# **createTag**
> Tag createTag(xVolTenant, tagCategoryName, tag)



Create a tag

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagControllerApi;


TagControllerApi apiInstance = new TagControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
Tag tag = new Tag(); // Tag | Request create or modify Tag
try {
    Tag result = apiInstance.createTag(xVolTenant, tagCategoryName, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagControllerApi#createTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |
 **tag** | [**Tag**](Tag.md)| Request create or modify Tag |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> DeletedCountResponse deleteTag(xVolTenant, tagCategoryName, tagValue)



Delete a Tag

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagControllerApi;


TagControllerApi apiInstance = new TagControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
String tagValue = "tagValue_example"; // String | Tag Value
try {
    DeletedCountResponse result = apiInstance.deleteTag(xVolTenant, tagCategoryName, tagValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagControllerApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |
 **tagValue** | **String**| Tag Value |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> Tag getTag(xVolTenant, tagCategoryName, tagValue)



Get a tag

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagControllerApi;


TagControllerApi apiInstance = new TagControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
String tagValue = "tagValue_example"; // String | Tag Value
try {
    Tag result = apiInstance.getTag(xVolTenant, tagCategoryName, tagValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagControllerApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |
 **tagValue** | **String**| Tag Value |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTag"></a>
# **updateTag**
> Tag updateTag(xVolTenant, tagCategoryName, tagValue, tag)



Update the designated tag

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.TagControllerApi;


TagControllerApi apiInstance = new TagControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
String tagValue = "tagValue_example"; // String | Tag Value
Tag tag = new Tag(); // Tag | Request create or modify Tag
try {
    Tag result = apiInstance.updateTag(xVolTenant, tagCategoryName, tagValue, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagControllerApi#updateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **tagCategoryName** | **String**| Tag Category Name |
 **tagValue** | **String**| Tag Value |
 **tag** | [**Tag**](Tag.md)| Request create or modify Tag |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

