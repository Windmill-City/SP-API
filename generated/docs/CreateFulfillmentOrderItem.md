
# CreateFulfillmentOrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerSKU** | **String** | The seller SKU of the item. | 
**sellerFulfillmentOrderItemId** | **String** | A fulfillment order item identifier that the seller creates to track fulfillment order items. Used to disambiguate multiple fulfillment items that have the same seller SKU. For example, the seller might assign different SellerFulfillmentOrderItemId values to two items in a fulfillment order that share the same seller SKU but have different GiftMessage values. | 
**quantity** | **Integer** |  | 
**giftMessage** | **String** | A message to the gift recipient, if applicable. |  [optional]
**displayableComment** | **String** | Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip. |  [optional]
**fulfillmentNetworkSKU** | **String** | Amazon&#39;s fulfillment network SKU of the item. |  [optional]
**perUnitDeclaredValue** | [**Currency**](Currency.md) | The monetary value assigned by the seller to this item. |  [optional]
**perUnitPrice** | [**Currency**](Currency.md) | The amount to be collected from the recipient for this item in a COD (Cash On Delivery) order. |  [optional]
**perUnitTax** | [**Currency**](Currency.md) | The tax on the amount to be collected from the recipient for this item in a COD (Cash On Delivery) order. |  [optional]



