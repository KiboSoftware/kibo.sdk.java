
# OrderItemLogResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderID** | **Integer** | Order Identifier |  [optional]
**orderItemID** | **Integer** | Order Item Identifier |  [optional]
**shipmentID** | **Integer** | Shipment Identifier |  [optional]
**inventoryID** | **Integer** | Inventory Identifier |  [optional]
**tenantID** | **Integer** | Tenant Identifier |  [optional]
**locationCode** | **String** | Location Code Identifier |  [optional]
**userID** | **Integer** | User Identifier |  [optional]
**quantity** | **Integer** | The number of items affected for this log entry |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of logs to retrieve |  [optional]
**resolved** | **Boolean** | Whether this event is resolved |  [optional]
**fixed** | **Boolean** | Whether this event has been fixed |  [optional]
**date** | **String** | The date of this log entry |  [optional]
**partNumber** | **String** | Part/Product Number |  [optional]
**upc** | **String** | Universal Product Code |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALLOCATE | &quot;ALLOCATE&quot;
DEALLOCATE | &quot;DEALLOCATE&quot;
FULFILL | &quot;FULFILL&quot;
PICK | &quot;PICK&quot;



