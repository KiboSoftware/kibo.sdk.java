# CustomerSurveyControllerApi

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSurveyUsingPOST**](CustomerSurveyControllerApi.md#createSurveyUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/surveys | createSurvey
[**getSurveyUsingGET**](CustomerSurveyControllerApi.md#getSurveyUsingGET) | **GET** /commerce/shipments/surveys/{id} | getSurvey
[**getSurveysUsingGET**](CustomerSurveyControllerApi.md#getSurveysUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/surveys | getSurveys


<a name="createSurveyUsingPOST"></a>
# **createSurveyUsingPOST**
> EntityModelOfCustomerSurvey createSurveyUsingPOST(shipmentNumber, xVolTenant, customerSurvey, xVolSite)

createSurvey

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyControllerApi;


CustomerSurveyControllerApi apiInstance = new CustomerSurveyControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
CustomerSurvey customerSurvey = new CustomerSurvey(); // CustomerSurvey | customerSurveyDto
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfCustomerSurvey result = apiInstance.createSurveyUsingPOST(shipmentNumber, xVolTenant, customerSurvey, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSurveyControllerApi#createSurveyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **customerSurvey** | [**CustomerSurvey**](CustomerSurvey.md)| customerSurveyDto |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfCustomerSurvey**](EntityModelOfCustomerSurvey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getSurveyUsingGET"></a>
# **getSurveyUsingGET**
> EntityModelOfCustomerSurvey getSurveyUsingGET(id, xVolTenant, xVolSite)

getSurvey

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyControllerApi;


CustomerSurveyControllerApi apiInstance = new CustomerSurveyControllerApi();
String id = "id_example"; // String | id
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    EntityModelOfCustomerSurvey result = apiInstance.getSurveyUsingGET(id, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSurveyControllerApi#getSurveyUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**EntityModelOfCustomerSurvey**](EntityModelOfCustomerSurvey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

<a name="getSurveysUsingGET"></a>
# **getSurveysUsingGET**
> CollectionModelOfEntityModelOfCustomerSurvey getSurveysUsingGET(shipmentNumber, xVolTenant, xVolSite)

getSurveys

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.fulfillment.ApiException;
//import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyControllerApi;


CustomerSurveyControllerApi apiInstance = new CustomerSurveyControllerApi();
Integer shipmentNumber = 56; // Integer | shipmentNumber
Integer xVolTenant = 56; // Integer | 
Integer xVolSite = 56; // Integer | 
try {
    CollectionModelOfEntityModelOfCustomerSurvey result = apiInstance.getSurveysUsingGET(shipmentNumber, xVolTenant, xVolSite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSurveyControllerApi#getSurveysUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **Integer**| shipmentNumber |
 **xVolTenant** | **Integer**|  |
 **xVolSite** | **Integer**|  | [optional]

### Return type

[**CollectionModelOfEntityModelOfCustomerSurvey**](CollectionModelOfEntityModelOfCustomerSurvey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, application/hal+json

