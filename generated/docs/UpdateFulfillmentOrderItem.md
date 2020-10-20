
# UpdateFulfillmentOrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerSKU** | **String** | The seller SKU of the item. |  [optional]
**sellerFulfillmentOrderItemId** | **String** | Identifies the fulfillment order item to update. Created with a previous call to the createFulfillmentOrder operation. | 
**quantity** | **Integer** |  | 
**giftMessage** | **String** | A message to the gift recipient, if applicable. |  [optional]
**displayableComment** | **String** | Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip. |  [optional]
**fulfillmentNetworkSKU** | **String** | Amazon&#39;s fulfillment network SKU of the item. |  [optional]
**orderItemDisposition** | **String** | Indicates whether the item is sellable or unsellable. |  [optional]
**perUnitDeclaredValue** | [**Currency**](Currency.md) | The monetary value assigned by the seller to this item. |  [optional]
**perUnitPrice** | [**Currency**](Currency.md) | The amount to be collected from the recipient for this item in a COD (Cash On Delivery) order. |  [optional]
**perUnitTax** | [**Currency**](Currency.md) | The tax on the amount to be collected from the recipient for this item in a COD (Cash On Delivery) order. |  [optional]



