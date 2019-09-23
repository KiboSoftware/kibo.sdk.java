
# RequestLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | [**UnitEnum**](#UnitEnum) | Unit of distance used for radius |  [optional]
**radius** | [**BigDecimal**](BigDecimal.md) | Distance from location |  [optional]
**postalCode** | **String** | Postal Code of this location |  [optional]
**latitude** | [**BigDecimal**](BigDecimal.md) | Latitude coordinate of this location |  [optional]
**longitude** | [**BigDecimal**](BigDecimal.md) | Longitude coordinate of this location |  [optional]
**countryCode** | **String** | Country Code for this location |  [optional]
**locationCode** | **String** | Location Code for this location. This being set will trigger GetInventoryByLocation |  [optional]


<a name="UnitEnum"></a>
## Enum: UnitEnum
Name | Value
---- | -----
MILES | &quot;MILES&quot;
KM | &quot;KM&quot;



