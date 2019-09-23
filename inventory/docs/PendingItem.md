
# PendingItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pendingItemID** | **Integer** | Pending Item Identifier |  [optional]
**orderID** | **Integer** | Order Identifier |  [optional]
**shipmentID** | **Integer** | Shipment Identifier |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Pending Item type |  [optional]
**quantity** | **Integer** | The number of items affected for this log entry |  [optional]
**partNumber** | **String** | Part/Product Number |  [optional]
**upc** | **String** | Universal Product Code |  [optional]
**sku** | **String** | Stock Keeping Unit |  [optional]
**productID** | **Integer** | Product Identifier |  [optional]
**toBin** | **String** | To Bin ID |  [optional]
**toBinID** | **Integer** | To Bin ID |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BIN | &quot;TYPE_BIN&quot;
DC | &quot;TYPE_DC&quot;
AUDIT | &quot;TYPE_AUDIT&quot;
RESTOCK | &quot;TYPE_RESTOCK&quot;



