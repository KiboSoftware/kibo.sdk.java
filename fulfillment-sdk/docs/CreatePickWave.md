
# CreatePickWave

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**binRanges** | [**List&lt;PickWaveBinRange&gt;**](PickWaveBinRange.md) |  |  [optional]
**fulfillmentLocationCode** | **String** |  |  [optional]
**includeZeroInventory** | **Boolean** |  |  [optional]
**lockWave** | **Boolean** |  |  [optional]
**maxShipments** | **Integer** |  |  [optional]
**pickWaveType** | [**PickWaveTypeEnum**](#PickWaveTypeEnum) |  |  [optional]
**products** | [**List&lt;PickWaveProductMatch&gt;**](PickWaveProductMatch.md) |  |  [optional]
**shipmentDateEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**shipmentDateStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**shipmentType** | **String** |  |  [optional]
**shippingOption** | [**ShippingOptionEnum**](#ShippingOptionEnum) |  |  [optional]


<a name="PickWaveTypeEnum"></a>
## Enum: PickWaveTypeEnum
Name | Value
---- | -----
SPECIAL | &quot;SPECIAL&quot;
NORMAL | &quot;NORMAL&quot;
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="ShippingOptionEnum"></a>
## Enum: ShippingOptionEnum
Name | Value
---- | -----
STANDARD_ONLY | &quot;STANDARD_ONLY&quot;
EXPRESS_ONLY | &quot;EXPRESS_ONLY&quot;
ALL | &quot;ALL&quot;



