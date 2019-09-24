
# Wave

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**waveID** | **Integer** | Wave Identifier |  [optional]
**locationID** | **Integer** | Location Identifier |  [optional]
**created** | **String** | When the wave was created |  [optional]
**userID** | **Integer** | User Identifier for the wave creator |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Order Type of the wave |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of wave |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the wave |  [optional]
**contents** | [**List&lt;WaveContent&gt;**](WaveContent.md) | List of Wave Contents |  [optional]
**recoveryWaveID** | **Integer** | Wave Recovery Identifier |  [optional]


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
ISPU | &quot;ISPU&quot;
STH | &quot;STH&quot;
TISPU | &quot;TISPU&quot;
TRANSFER | &quot;TRANSFER&quot;
DELIVERY | &quot;DELIVERY&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
SPECIAL | &quot;SPECIAL&quot;
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
PENDING | &quot;PENDING&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
CLOSED | &quot;CLOSED&quot;
PENDING_RECOVERY | &quot;PENDING_RECOVERY&quot;



