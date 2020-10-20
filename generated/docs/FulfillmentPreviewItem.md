
# FulfillmentPreviewItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerSKU** | **String** | The seller SKU of the item. | 
**quantity** | **Integer** | The item quantity. | 
**sellerFulfillmentOrderItemId** | **String** | A fulfillment order item identifier that the seller created with a call to the createFulfillmentOrder operation. | 
**estimatedShippingWeight** | [**Weight**](Weight.md) | The estimated shipping weight of the item quantity for a single item, as identified by sellerSKU, in a shipment. |  [optional]
**shippingWeightCalculationMethod** | [**ShippingWeightCalculationMethodEnum**](#ShippingWeightCalculationMethodEnum) | The method used to calculate EstimatedShippingWeight. |  [optional]


<a name="ShippingWeightCalculationMethodEnum"></a>
## Enum: ShippingWeightCalculationMethodEnum
Name | Value
---- | -----
PACKAGE | &quot;Package&quot;
DIMENSIONAL | &quot;Dimensional&quot;



