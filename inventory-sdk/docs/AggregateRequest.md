
# AggregateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List&lt;Item&gt;**](Item.md) | List of Items to search on | 
**ignoreSafetyStock** | **Boolean** | Whether to ignore the safety stock buffer put in place |  [optional]
**includeNegativeInventory** | **Boolean** | Whether to allow items with negative inventory in the results |  [optional]
**directShip** | **Boolean** | Whether to limit results to locations that are shipping enabled |  [optional]
**transferEnabled** | **Boolean** | Filter results by locations that apply tax (true) or don&#39;t (false) |  [optional]
**pickup** | **Boolean** | Filter results by pickup enabled (true) or not (false) |  [optional]
**tags** | **Map&lt;String, String&gt;** | Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName |  [optional]
**includeFutureInventory** | [**IncludeFutureInventoryEnum**](#IncludeFutureInventoryEnum) | Include future inventory or not |  [optional]
**includeNegativeFutureInventory** | **Boolean** | Whether to allow items with negative future inventory in the results |  [optional]
**futureStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | Future start Date at which the inventory should be allocated against. |  [optional]
**futureEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | Future end Date at which the inventory should be allocated against. |  [optional]


<a name="IncludeFutureInventoryEnum"></a>
## Enum: IncludeFutureInventoryEnum
Name | Value
---- | -----
ONLY | &quot;FUTURE_ONLY&quot;
AND_CURRENT | &quot;FUTURE_AND_CURRENT&quot;



