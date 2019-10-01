
# CreateWaveRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of wave |  [optional]
**maxOrders** | **Integer** | Maximum number of orders |  [optional]
**includeZeroInventory** | **Boolean** | Flag for including zero inventory items |  [optional]
**binRanges** | [**List&lt;BinRange&gt;**](BinRange.md) | List of Bin Ranges |  [optional]
**orderDateRange** | [**DateRange**](DateRange.md) |  |  [optional]
**products** | **String** | Part/Product Number |  [optional]
**shippingOptions** | [**ShippingOptionsEnum**](#ShippingOptionsEnum) | Shipping Options |  [optional]
**customOrderItemData** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | Custom order item data |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
SPECIAL | &quot;SPECIAL&quot;
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="ShippingOptionsEnum"></a>
## Enum: ShippingOptionsEnum
Name | Value
---- | -----
STANDARD_ONLY | &quot;STANDARD_ONLY&quot;
EXPRESS_ONLY | &quot;EXPRESS_ONLY&quot;
ALL | &quot;ALL&quot;



