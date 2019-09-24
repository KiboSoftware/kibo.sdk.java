
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



