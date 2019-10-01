
# Shipment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  [optional]
**canceledItems** | [**List&lt;CanceledItem&gt;**](CanceledItem.md) |  |  [optional]
**changeMessages** | [**List&lt;ChangeMessage&gt;**](ChangeMessage.md) |  |  [optional]
**childShipmentNumbers** | **List&lt;Integer&gt;** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**customerAccountId** | **Integer** |  |  [optional]
**customerAddressId** | **Integer** |  |  [optional]
**customerTaxId** | **String** |  |  [optional]
**data** | [**Object**](.md) |  |  [optional]
**destination** | [**Destination**](Destination.md) |  |  [optional]
**dutyAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**dutyTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**email** | **String** |  |  [optional]
**externalShipmentId** | **String** |  |  [optional]
**fulfillmentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**fulfillmentLocationCode** | **String** |  |  [optional]
**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  |  [optional]
**handlingAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingSubtotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingTaxTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**items** | [**List&lt;Item&gt;**](Item.md) |  |  [optional]
**lineItemSubtotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lineItemTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lineItemTaxTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lineItemTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**orderId** | **String** |  |  [optional]
**orderNumber** | **Integer** |  |  [optional]
**orderSubmitDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**originalOrderId** | **String** |  |  [optional]
**originalShipmentNumber** | **Integer** |  |  [optional]
**packages** | [**List&lt;ModelPackage&gt;**](ModelPackage.md) |  |  [optional]
**parentShipmentNumber** | **Integer** |  |  [optional]
**pickStatus** | [**PickStatusEnum**](#PickStatusEnum) |  |  [optional]
**pickType** | [**PickTypeEnum**](#PickTypeEnum) |  |  [optional]
**readyForPickup** | **Boolean** |  |  [optional]
**readyForPickupDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**shipmentAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shipmentNumber** | **Integer** |  |  [optional]
**shipmentStatus** | [**ShipmentStatusEnum**](#ShipmentStatusEnum) |  |  [optional]
**shipmentType** | **String** |  |  [optional]
**shippingAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingMethodCode** | **String** |  |  [optional]
**shippingMethodName** | **String** |  |  [optional]
**shippingSubtotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingTaxTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**signatureRequired** | **Boolean** |  |  [optional]
**siteId** | **Integer** |  |  [optional]
**taxData** | [**Object**](.md) |  |  [optional]
**tenantId** | **Integer** |  |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**trackingNumbers** | **List&lt;String&gt;** |  |  [optional]
**workflowState** | [**WorkflowState**](WorkflowState.md) |  |  [optional]


<a name="FulfillmentStatusEnum"></a>
## Enum: FulfillmentStatusEnum
Name | Value
---- | -----
NOTFULFILLED | &quot;NotFulfilled&quot;
FULFILLED | &quot;Fulfilled&quot;


<a name="PickStatusEnum"></a>
## Enum: PickStatusEnum
Name | Value
---- | -----
AVAILABLE | &quot;AVAILABLE&quot;
IN_WAVE | &quot;IN_WAVE&quot;
PICKED | &quot;PICKED&quot;
TRANSFER | &quot;TRANSFER&quot;
COMPLETE | &quot;COMPLETE&quot;


<a name="PickTypeEnum"></a>
## Enum: PickTypeEnum
Name | Value
---- | -----
SPECIAL | &quot;SPECIAL&quot;
NORMAL | &quot;NORMAL&quot;
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="ShipmentStatusEnum"></a>
## Enum: ShipmentStatusEnum
Name | Value
---- | -----
READY | &quot;READY&quot;
REASSIGNED | &quot;REASSIGNED&quot;
BACKORDER | &quot;BACKORDER&quot;
CANCELED | &quot;CANCELED&quot;
FULFILLED | &quot;FULFILLED&quot;
CUSTOMER_CARE | &quot;CUSTOMER_CARE&quot;



