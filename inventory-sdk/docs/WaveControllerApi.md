# WaveControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closePickWave**](WaveControllerApi.md#closePickWave) | **POST** /v1/wave/{wave_id}/close/ | 
[**createPickWave**](WaveControllerApi.md#createPickWave) | **POST** /v1/wave/ | 
[**getOpenPickWaves**](WaveControllerApi.md#getOpenPickWaves) | **GET** /v1/wave/open/{location_id}/ | 
[**getWaveDetails**](WaveControllerApi.md#getWaveDetails) | **GET** /v1/wave/{wave_id}/ | 
[**queryWaveSuggestion**](WaveControllerApi.md#queryWaveSuggestion) | **POST** /v1/wave/suggestion/ | 


<a name="closePickWave"></a>
# **closePickWave**
> CreateWaveResponse closePickWave(xVolTenant, waveId, waveCompletion)



Close Pick Wave (Complete)

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.WaveControllerApi;


WaveControllerApi apiInstance = new WaveControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer waveId = 56; // Integer | Wave Identifier
WaveCompletion waveCompletion = new WaveCompletion(); // WaveCompletion | Request to complete a wave
try {
    CreateWaveResponse result = apiInstance.closePickWave(xVolTenant, waveId, waveCompletion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaveControllerApi#closePickWave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **waveId** | **Integer**| Wave Identifier |
 **waveCompletion** | [**WaveCompletion**](WaveCompletion.md)| Request to complete a wave |

### Return type

[**CreateWaveResponse**](CreateWaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPickWave"></a>
# **createPickWave**
> CreateWaveResponse createPickWave(xVolTenant, createWaveRequest)



Create Pick Wave

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.WaveControllerApi;


WaveControllerApi apiInstance = new WaveControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
CreateWaveRequest createWaveRequest = new CreateWaveRequest(); // CreateWaveRequest | Request to create a new pick wave(s)
try {
    CreateWaveResponse result = apiInstance.createPickWave(xVolTenant, createWaveRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaveControllerApi#createPickWave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **createWaveRequest** | [**CreateWaveRequest**](CreateWaveRequest.md)| Request to create a new pick wave(s) |

### Return type

[**CreateWaveResponse**](CreateWaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOpenPickWaves"></a>
# **getOpenPickWaves**
> List&lt;Wave&gt; getOpenPickWaves(xVolTenant, locationId)



Get Open Pick Waves

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.WaveControllerApi;


WaveControllerApi apiInstance = new WaveControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer locationId = 56; // Integer | Location Identifier
try {
    List<Wave> result = apiInstance.getOpenPickWaves(xVolTenant, locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaveControllerApi#getOpenPickWaves");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **locationId** | **Integer**| Location Identifier |

### Return type

[**List&lt;Wave&gt;**](Wave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWaveDetails"></a>
# **getWaveDetails**
> Wave getWaveDetails(xVolTenant, waveId)



Get Wave Details

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.WaveControllerApi;


WaveControllerApi apiInstance = new WaveControllerApi();
Integer xVolTenant = 56; // Integer | Tenant ID
Integer waveId = 56; // Integer | Wave Identifier
try {
    Wave result = apiInstance.getWaveDetails(xVolTenant, waveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaveControllerApi#getWaveDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xVolTenant** | **Integer**| Tenant ID |
 **waveId** | **Integer**| Wave Identifier |

### Return type

[**Wave**](Wave.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryWaveSuggestion"></a>
# **queryWaveSuggestion**
> WaveSuggestionResponse queryWaveSuggestion(waveSuggestionRequest)



Query Wave Suggestion (as a post)

### Example
```java
// Import classes:
//import com.kibocommerce.sdk.inventory.ApiException;
//import com.kibocommerce.sdk.inventory.api.WaveControllerApi;


WaveControllerApi apiInstance = new WaveControllerApi();
WaveSuggestionRequest waveSuggestionRequest = new WaveSuggestionRequest(); // WaveSuggestionRequest | Request to query for a pick wave suggestion
try {
    WaveSuggestionResponse result = apiInstance.queryWaveSuggestion(waveSuggestionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaveControllerApi#queryWaveSuggestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waveSuggestionRequest** | [**WaveSuggestionRequest**](WaveSuggestionRequest.md)| Request to query for a pick wave suggestion |

### Return type

[**WaveSuggestionResponse**](WaveSuggestionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

