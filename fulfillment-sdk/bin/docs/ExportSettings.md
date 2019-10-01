
# ExportSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Export Settings Name | 
**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Format for the export file | 
**exportType** | [**ExportTypeEnum**](#ExportTypeEnum) | Type of exportGG for the settings | 
**onlySendAvailable** | **Boolean** | Flag for only sending available |  [optional]
**onlySendActiveLocations** | **Boolean** | Flag for only sending from active locations |  [optional]
**ftpInformation** | [**List&lt;ExportSettingsFTP&gt;**](ExportSettingsFTP.md) | List of export FTP settings | 
**s3Information** | [**List&lt;ExportSettingsS3&gt;**](ExportSettingsS3.md) | List of export S3 settings |  [optional]
**exportSingleFile** | **Boolean** | Flag for exporting as a single file |  [optional]
**safetyStock** | [**SafetyStockEnum**](#SafetyStockEnum) | Safety Stock |  [optional]
**floor** | [**FloorEnum**](#FloorEnum) | Floor |  [optional]
**ltd** | [**LtdEnum**](#LtdEnum) | LTD |  [optional]
**fileName** | **String** | Name for the export file |  [optional]
**includeAttributes** | **Boolean** | Flag for including attributes |  [optional]
**zipFiles** | **Boolean** | Flag for zipping the files |  [optional]
**zipFileName** | **String** | Name for the zipped file |  [optional]
**untransformedFileName** | **String** | Untransformed File Name |  [optional]
**untransformedZipFileName** | **String** | Untransformed Zip File Name |  [optional]
**locationGroupIDs** | **List&lt;Integer&gt;** | Location Group Ids associated with the settings |  [optional]
**siteIDs** | **List&lt;Integer&gt;** | Site Ids associated with the settings |  [optional]
**directShip** | **Boolean** | Flag for only using locations with Direct Ship enabled |  [optional]
**pickup** | **Boolean** | Flag for only using locations with In Store Pickup enabled |  [optional]
**transfer** | **Boolean** | Flag for only using locations with Transfer enabled |  [optional]


<a name="FileFormatEnum"></a>
## Enum: FileFormatEnum
Name | Value
---- | -----
XML | &quot;XML&quot;
CSV | &quot;CSV&quot;


<a name="ExportTypeEnum"></a>
## Enum: ExportTypeEnum
Name | Value
---- | -----
AGGREGATE | &quot;AGGREGATE&quot;
LOCATION | &quot;LOCATION&quot;


<a name="SafetyStockEnum"></a>
## Enum: SafetyStockEnum
Name | Value
---- | -----
MAX | &quot;SAFETY_STOCK_MAX&quot;
MIN | &quot;SAFETY_STOCK_MIN&quot;
AVG | &quot;SAFETY_STOCK_AVG&quot;
SUM | &quot;SAFETY_STOCK_SUM&quot;


<a name="FloorEnum"></a>
## Enum: FloorEnum
Name | Value
---- | -----
MAX | &quot;FLOOR_MAX&quot;
MIN | &quot;FLOOR_MIN&quot;
AVG | &quot;FLOOR_AVG&quot;
SUM | &quot;FLOOR_SUM&quot;


<a name="LtdEnum"></a>
## Enum: LtdEnum
Name | Value
---- | -----
MAX | &quot;LTD_MAX&quot;
MIN | &quot;LTD_MIN&quot;
AVG | &quot;LTD_AVG&quot;
SUM | &quot;LTD_SUM&quot;



