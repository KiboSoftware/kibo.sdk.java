
# CanceledItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**auditInfo** | [**AuditInfo**](AuditInfo.md) |  |  [optional]
**backorderReleaseDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**canceledReason** | [**CanceledReason**](CanceledReason.md) |  |  [optional]
**data** | [**Object**](.md) |  |  [optional]
**duty** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**fulfillmentItemType** | [**FulfillmentItemTypeEnum**](#FulfillmentItemTypeEnum) |  |  [optional]
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
**shipping** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**sku** | **String** |  |  [optional]
**taxData** | [**Object**](.md) |  |  [optional]
**unitPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**upc** | **String** |  |  [optional]
**variationProductCode** | **String** |  |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**weightUnit** | **String** |  |  [optional]


<a name="FulfillmentItemTypeEnum"></a>
## Enum: FulfillmentItemTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;Physical&quot;
DIGITAL | &quot;Digital&quot;
DIGITALCREDIT | &quot;DigitalCredit&quot;



