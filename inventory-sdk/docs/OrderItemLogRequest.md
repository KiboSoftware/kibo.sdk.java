
# OrderItemLogRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**List&lt;OrderItemLogIdentifier&gt;**](OrderItemLogIdentifier.md) | A list of order item log identifiers to search for |  [optional]
**orderBy** | [**OrderByEnum**](#OrderByEnum) | Order Identifier |  [optional]
**limit** | **Integer** | The maximum number of results to return |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of logs to retrieve |  [optional]
**sortAscending** | **Boolean** | Whether to sort results ascending, based on orderBy |  [optional]


<a name="OrderByEnum"></a>
## Enum: OrderByEnum
Name | Value
---- | -----
ORDER_ID | &quot;ORDER_ID&quot;
ORDER_ITEM_ID | &quot;ORDER_ITEM_ID&quot;
INVENTORY_ID | &quot;INVENTORY_ID&quot;
TENANT_ID | &quot;TENANT_ID&quot;
LOCATION_ID | &quot;LOCATION_ID&quot;
USER_ID | &quot;USER_ID&quot;
QUANTITY | &quot;QUANTITY&quot;
TYPE | &quot;TYPE&quot;
RESOLVED | &quot;RESOLVED&quot;
FIXED | &quot;FIXED&quot;
DATE | &quot;DATE&quot;
SHIPMENT_ID | &quot;SHIPMENT_ID&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALLOCATE | &quot;ALLOCATE&quot;
DEALLOCATE | &quot;DEALLOCATE&quot;
FULFILL | &quot;FULFILL&quot;
PICK | &quot;PICK&quot;



