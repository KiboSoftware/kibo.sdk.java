
# ProductMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantID** | **Integer** | Tenant Identifier |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Enum for direction of the mapping |  [optional]
**mapping** | [**MappingEnum**](#MappingEnum) | Enum for mapping rule |  [optional]


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
INBOUND | &quot;INBOUND&quot;
OUTBOUND | &quot;OUTBOUND&quot;
SKIP | &quot;SKIP&quot;


<a name="MappingEnum"></a>
## Enum: MappingEnum
Name | Value
---- | -----
DEFAULT_MAPPING | &quot;DEFAULT_MAPPING&quot;
CUSTOM_MAPPING_PART_TO_ALL | &quot;CUSTOM_MAPPING_PART_TO_ALL&quot;
CUSTOM_MAPPING_PART_TO_SKU | &quot;CUSTOM_MAPPING_PART_TO_SKU&quot;
CUSTOM_MAPPING_ONLY_UPC | &quot;CUSTOM_MAPPING_ONLY_UPC&quot;
CUSTOM_MAPPING_PART_TO_UPC_IF_EMPTY | &quot;CUSTOM_MAPPING_PART_TO_UPC_IF_EMPTY&quot;
CUSTOM_MAPPING_SKU_TO_PART_UPC_SKU | &quot;CUSTOM_MAPPING_SKU_TO_PART_UPC_SKU&quot;
CUSTOM_MAPPING_SKU_TO_PART | &quot;CUSTOM_MAPPING_SKU_TO_PART&quot;



