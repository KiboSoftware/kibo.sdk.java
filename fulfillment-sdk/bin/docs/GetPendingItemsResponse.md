
# GetPendingItemsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **Integer** | Total Count of pending items |  [optional]
**page** | **Integer** | Page number |  [optional]
**perPage** | **Integer** | Number per page |  [optional]
**prevPage** | **Integer** | Previous page |  [optional]
**sortBy** | [**SortByEnum**](#SortByEnum) | Field to sort by |  [optional]
**sortAscending** | **Boolean** | Flag to sort by ascending |  [optional]
**pendingItems** | [**List&lt;PendingItem&gt;**](PendingItem.md) | List of pending items |  [optional]


<a name="SortByEnum"></a>
## Enum: SortByEnum
Name | Value
---- | -----
QUANTITY | &quot;QUANTITY&quot;
FROM | &quot;FROM&quot;
TO | &quot;TO&quot;
TYPE | &quot;TYPE&quot;
ORDER_ID | &quot;ORDER_ID&quot;
WEIGHT | &quot;WEIGHT&quot;



