# AuditControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelAudit**](AuditControllerApi.md#cancelAudit) | **POST** /v1/audit/{audit_id}/cancel/ | 
[**completeAudit**](AuditControllerApi.md#completeAudit) | **POST** /v1/audit/{audit_id}/complete/ | 
[**createAudit**](AuditControllerApi.md#createAudit) | **POST** /v1/audit/ | 
[**getAuditDetails**](AuditControllerApi.md#getAuditDetails) | **GET** /v1/audit/{audit_id}/ | 
[**getOpenAudits**](AuditControllerApi.md#getOpenAudits) | **GET** /v1/audit/allOpen/{location_code}/ | 
[**searchAudits**](AuditControllerApi.md#searchAudits) | **POST** /v1/audit/search/ | 


<a name="cancelAudit"></a>
# **cancelAudit**
> BaseResponse cancelAudit(xVolTenant, auditId)



Cancel an audit

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long auditId = 56L; // Long | Id of audit
try {
    BaseResponse result = apiInstance.cancelAudit(xVolTenant, auditId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#cancelAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **auditId** | **Long**| Id of audit |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="completeAudit"></a>
# **completeAudit**
> Audit completeAudit(xVolTenant, auditId, loadBinInventoryRequest)



Complete an audit

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long auditId = 56L; // Long | Id of audit
LoadBinInventoryRequest loadBinInventoryRequest = new LoadBinInventoryRequest(); // LoadBinInventoryRequest | Request to load bin inventory
try {
    Audit result = apiInstance.completeAudit(xVolTenant, auditId, loadBinInventoryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#completeAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **auditId** | **Long**| Id of audit |
 **loadBinInventoryRequest** | [**LoadBinInventoryRequest**](LoadBinInventoryRequest.md)| Request to load bin inventory |

### Return type

[**Audit**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAudit"></a>
# **createAudit**
> Audit createAudit(xVolTenant, createAuditRequest)



Create a new audit

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateAuditRequest createAuditRequest = new CreateAuditRequest(); // CreateAuditRequest | Request to create an audit
try {
    Audit result = apiInstance.createAudit(xVolTenant, createAuditRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#createAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createAuditRequest** | [**CreateAuditRequest**](CreateAuditRequest.md)| Request to create an audit |

### Return type

[**Audit**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditDetails"></a>
# **getAuditDetails**
> Audit getAuditDetails(xVolTenant, auditId)



Get details of the specified audit

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long auditId = 56L; // Long | Id of audit
try {
    Audit result = apiInstance.getAuditDetails(xVolTenant, auditId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#getAuditDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **auditId** | **Long**| Id of audit |

### Return type

[**Audit**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpenAudits"></a>
# **getOpenAudits**
> List&lt;Audit&gt; getOpenAudits(xVolTenant, locationId)



Get all of the open   audits at the given location

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Long locationId = 56L; // Long | Id of location
try {
    List<Audit> result = apiInstance.getOpenAudits(xVolTenant, locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#getOpenAudits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationId** | **Long**| Id of location |

### Return type

[**List&lt;Audit&gt;**](Audit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchAudits"></a>
# **searchAudits**
> AuditSearchResponse searchAudits(xVolTenant, auditSearchRequest)



Search for a list of Audits

### Example
```java
// Import classes:
//import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
//import com.kibocommerce.kibo.sdk.java.inventory.AuditControllerApi;


AuditControllerApi apiInstance = new AuditControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
AuditSearchRequest auditSearchRequest = new AuditSearchRequest(); // AuditSearchRequest | Request to search audits
try {
    AuditSearchResponse result = apiInstance.searchAudits(xVolTenant, auditSearchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditControllerApi#searchAudits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **auditSearchRequest** | [**AuditSearchRequest**](AuditSearchRequest.md)| Request to search audits |

### Return type

[**AuditSearchResponse**](AuditSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

