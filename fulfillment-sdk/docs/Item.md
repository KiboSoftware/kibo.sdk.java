
# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**allowsBackOrder** | **Boolean** |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  [optional]
**backorderReleaseDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**creditCurrencyCode** | **String** |  |  [optional]
**creditValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**data** | **Map&lt;String, Object&gt;** |  |  [optional]
**duty** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**expectedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**giftCards** | [**List&lt;GiftCard&gt;**](GiftCard.md) |  |  [optional]
**goodsType** | [**GoodsTypeEnum**](#GoodsTypeEnum) |  |  [optional]
**handling** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**handlingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**isTaxable** | **Boolean** |  |  [optional]
**itemDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**itemTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lineId** | **Integer** |  |  [optional]
**lineItemCost** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**name** | **String** |  |  [optional]
**optionAttributeFQN** | **String** |  |  [optional]
**options** | [**List&lt;ProductOption&gt;**](ProductOption.md) |  |  [optional]
**originalOrderItemId** | **String** |  |  [optional]
**overridePrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**parentId** | **String** |  |  [optional]
**partNumber** | **String** |  |  [optional]
**productCode** | **String** |  |  [optional]
**quantity** | **Integer** |  |  [optional]
**readyForPickupQuantity** | **Integer** |  |  [optional]
**shipping** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**sku** | **String** |  |  [optional]
**taxData** | [**Object**](.md) |  |  [optional]
**taxableHandling** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**taxableLineItemCost** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**taxableShipping** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**transferQuantity** | **Integer** |  |  [optional]
**trueTransferQuantity** | **Integer** |  |  [optional]
**unitPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**upc** | **String** |  |  [optional]
**variationProductCode** | **String** |  |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightUnit** | **String** |  |  [optional]
**weightedDutyAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedHandlingAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedHandlingTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedLineItemTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedShipmentAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedShippingAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightedShippingTaxAdjustment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]


<a name="GoodsTypeEnum"></a>
## Enum: GoodsTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;Physical&quot;
DIGITAL | &quot;Digital&quot;
DIGITALCREDIT | &quot;DigitalCredit&quot;
DIGITALGIFTCARD | &quot;DigitalGiftCard&quot;



