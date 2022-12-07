# ExportInventoryControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExportSettings**](ExportInventoryControllerApi.md#createExportSettings) | **POST** /v1/export/create | 
[**createExportSettingsFTP**](ExportInventoryControllerApi.md#createExportSettingsFTP) | **POST** /v1/export/ftp/create | 
[**createExportSettingsS3**](ExportInventoryControllerApi.md#createExportSettingsS3) | **POST** /v1/export/s3/create | 
[**deleteExportSettings**](ExportInventoryControllerApi.md#deleteExportSettings) | **DELETE** /v1/export/{exportSettingsName} | 
[**deleteExportSettingsFTP**](ExportInventoryControllerApi.md#deleteExportSettingsFTP) | **DELETE** /v1/export/ftp/{exportSettingsName}/{exportSettingsFTPName} | 
[**deleteExportSettingsS3**](ExportInventoryControllerApi.md#deleteExportSettingsS3) | **DELETE** /v1/export/s3/{exportSettingsName}/{exportSettingsS3Name} | 
[**getExportSettings**](ExportInventoryControllerApi.md#getExportSettings) | **GET** /v1/export | 
[**runExport**](ExportInventoryControllerApi.md#runExport) | **POST** /v1/export/ | 
[**updateExportSettings**](ExportInventoryControllerApi.md#updateExportSettings) | **POST** /v1/export/update | 
[**updateExportSettingsFTP**](ExportInventoryControllerApi.md#updateExportSettingsFTP) | **POST** /v1/export/ftp/update | 
[**updateExportSettingsS3**](ExportInventoryControllerApi.md#updateExportSettingsS3) | **POST** /v1/export/s3/update | 


<a name="createExportSettings"></a>
# **createExportSettings**
> ExportSettingsResponse createExportSettings(xVolTenant, createExportSettingsRequest)



Create an Export Settings

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateExportSettingsRequest createExportSettingsRequest = new CreateExportSettingsRequest(); // CreateExportSettingsRequest | Request to create a new Export Settings
try {
    ExportSettingsResponse result = apiInstance.createExportSettings(xVolTenant, createExportSettingsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#createExportSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createExportSettingsRequest** | [**CreateExportSettingsRequest**](CreateExportSettingsRequest.md)| Request to create a new Export Settings |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createExportSettingsFTP"></a>
# **createExportSettingsFTP**
> ExportSettingsResponse createExportSettingsFTP(xVolTenant, createExportSettingsFTPRequest)



Create an Export Settings FTP

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateExportSettingsFTPRequest createExportSettingsFTPRequest = new CreateExportSettingsFTPRequest(); // CreateExportSettingsFTPRequest | Request to create a new Export Settings FTP
try {
    ExportSettingsResponse result = apiInstance.createExportSettingsFTP(xVolTenant, createExportSettingsFTPRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#createExportSettingsFTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createExportSettingsFTPRequest** | [**CreateExportSettingsFTPRequest**](CreateExportSettingsFTPRequest.md)| Request to create a new Export Settings FTP |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createExportSettingsS3"></a>
# **createExportSettingsS3**
> ExportSettingsResponse createExportSettingsS3(xVolTenant, createExportSettingsS3Request)



Create an Export Settings S3

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateExportSettingsS3Request createExportSettingsS3Request = new CreateExportSettingsS3Request(); // CreateExportSettingsS3Request | Request to create a new Export Settings S3
try {
    ExportSettingsResponse result = apiInstance.createExportSettingsS3(xVolTenant, createExportSettingsS3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#createExportSettingsS3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createExportSettingsS3Request** | [**CreateExportSettingsS3Request**](CreateExportSettingsS3Request.md)| Request to create a new Export Settings S3 |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExportSettings"></a>
# **deleteExportSettings**
> DeletedCountResponse deleteExportSettings(xVolTenant, exportSettingsName)



Deletes an Export Settings

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
try {
    DeletedCountResponse result = apiInstance.deleteExportSettings(xVolTenant, exportSettingsName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#deleteExportSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **exportSettingsName** | **String**| Export Settings Name |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExportSettingsFTP"></a>
# **deleteExportSettingsFTP**
> DeletedCountResponse deleteExportSettingsFTP(xVolTenant, exportSettingsName, exportSettingsFTPName)



Deletes an Export Settings FTP. Not specifying exportSettingsFTPID deletes ALL ftp settings for the specified export settings.

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
String exportSettingsFTPName = "exportSettingsFTPName_example"; // String | Export Settings FTP Name
try {
    DeletedCountResponse result = apiInstance.deleteExportSettingsFTP(xVolTenant, exportSettingsName, exportSettingsFTPName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#deleteExportSettingsFTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **exportSettingsName** | **String**| Export Settings Name |
 **exportSettingsFTPName** | **String**| Export Settings FTP Name |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExportSettingsS3"></a>
# **deleteExportSettingsS3**
> DeletedCountResponse deleteExportSettingsS3(xVolTenant, exportSettingsName, exportSettingsS3Name)



Deletes an Export Settings S3. Not specifying exportSettingsS3ID deletes ALL s3 settings for the specified export settings.

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
String exportSettingsS3Name = "exportSettingsS3Name_example"; // String | Export Settings S3 Name
try {
    DeletedCountResponse result = apiInstance.deleteExportSettingsS3(xVolTenant, exportSettingsName, exportSettingsS3Name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#deleteExportSettingsS3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **exportSettingsName** | **String**| Export Settings Name |
 **exportSettingsS3Name** | **String**| Export Settings S3 Name |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExportSettings"></a>
# **getExportSettings**
> List&lt;GetExportSettingsResponse&gt; getExportSettings(xVolTenant, exportSettingsName)



Get an export settings

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
try {
    List<GetExportSettingsResponse> result = apiInstance.getExportSettings(xVolTenant, exportSettingsName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#getExportSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **exportSettingsName** | **String**| Export Settings Name |

### Return type

[**List&lt;GetExportSettingsResponse&gt;**](GetExportSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runExport"></a>
# **runExport**
> ExportInventoryResponse runExport(xVolTenant, exportInventoryRequest)



Run Export Settings Job

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
ExportInventoryRequest exportInventoryRequest = new ExportInventoryRequest(); // ExportInventoryRequest | Request to run an inventory export
try {
    ExportInventoryResponse result = apiInstance.runExport(xVolTenant, exportInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#runExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **exportInventoryRequest** | [**ExportInventoryRequest**](ExportInventoryRequest.md)| Request to run an inventory export |

### Return type

[**ExportInventoryResponse**](ExportInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExportSettings"></a>
# **updateExportSettings**
> UpdateExportSettingsResponse updateExportSettings(xVolTenant, updateExportSettingsRequest)



Update an Export Settings

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
UpdateExportSettingsRequest updateExportSettingsRequest = new UpdateExportSettingsRequest(); // UpdateExportSettingsRequest | Request to update an existing Export Settings
try {
    UpdateExportSettingsResponse result = apiInstance.updateExportSettings(xVolTenant, updateExportSettingsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#updateExportSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **updateExportSettingsRequest** | [**UpdateExportSettingsRequest**](UpdateExportSettingsRequest.md)| Request to update an existing Export Settings |

### Return type

[**UpdateExportSettingsResponse**](UpdateExportSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExportSettingsFTP"></a>
# **updateExportSettingsFTP**
> UpdateExportSettingsFTPResponse updateExportSettingsFTP(xVolTenant, updateExportSettingsFTPRequest)



Update an Export Settings FTP

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
UpdateExportSettingsFTPRequest updateExportSettingsFTPRequest = new UpdateExportSettingsFTPRequest(); // UpdateExportSettingsFTPRequest | Request to update an existing Export Settings FTP
try {
    UpdateExportSettingsFTPResponse result = apiInstance.updateExportSettingsFTP(xVolTenant, updateExportSettingsFTPRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#updateExportSettingsFTP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **updateExportSettingsFTPRequest** | [**UpdateExportSettingsFTPRequest**](UpdateExportSettingsFTPRequest.md)| Request to update an existing Export Settings FTP |

### Return type

[**UpdateExportSettingsFTPResponse**](UpdateExportSettingsFTPResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExportSettingsS3"></a>
# **updateExportSettingsS3**
> UpdateExportSettingsS3Response updateExportSettingsS3(xVolTenant, updateExportSettingsS3Request)



Update an Export Settings S3

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.ExportInventoryControllerApi;


ExportInventoryControllerApi apiInstance = new ExportInventoryControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
UpdateExportSettingsS3Request updateExportSettingsS3Request = new UpdateExportSettingsS3Request(); // UpdateExportSettingsS3Request | Request to update an existing Export Settings S3
try {
    UpdateExportSettingsS3Response result = apiInstance.updateExportSettingsS3(xVolTenant, updateExportSettingsS3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportInventoryControllerApi#updateExportSettingsS3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **updateExportSettingsS3Request** | [**UpdateExportSettingsS3Request**](UpdateExportSettingsS3Request.md)| Request to update an existing Export Settings S3 |

### Return type

[**UpdateExportSettingsS3Response**](UpdateExportSettingsS3Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

