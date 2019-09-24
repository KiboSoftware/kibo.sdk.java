
# OrderItemInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderID** | **Integer** | Order Identifier |  [optional]
**orderItemID** | **Integer** | Order Item Identifier |  [optional]
**locationID** | **Integer** | Location Identifier |  [optional]
**locationActive** | **Boolean** | Flag for whether the location is active |  [optional]
**locationCode** | **Integer** | External Store Identifier |  [optional]
**locationName** | **String** | Location Name |  [optional]
**binID** | **Integer** | Bin Identifier |  [optional]
**partNumber** | **String** | Part/Product Number |  [optional]
**upc** | **String** | Universal Product Code |  [optional]
**sku** | **String** | Stock Keeping Unit |  [optional]
**ltd** | **String** | Custom field used for store prioritization |  [optional]
**floor** | **Integer** | Absolute minimum quantity of this item that should be in stock at any time |  [optional]
**safetyStock** | **Integer** | Quantity of this item the location wants to keep in stock to ensure stock isn&#39;t completely depleted |  [optional]
**onHand** | **Integer** | The quantity the location has in its possession |  [optional]
**available** | **Integer** | The quantity the location has that are available for purchase |  [optional]
**allocated** | **Integer** | The quantity the location has that are allocated |  [optional]
**allocates** | **Integer** | Total number of allocations |  [optional]
**deallocates** | **Integer** | Total number of deallocations |  [optional]
**fulfills** | **Integer** | Total number of fulfillments. Should never be greater than 1. |  [optional]
**picks** | **Integer** | Total number of picks (WMS only) |  [optional]
**pendingQuantity** | **Integer** | Pending quantity (WMS only) |  [optional]
**events** | [**List&lt;OrderItemInformationEvent&gt;**](OrderItemInformationEvent.md) | Order Identifier |  [optional]



