
# FulfillmentShipment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazonShipmentId** | **String** | A shipment identifier assigned by Amazon. | 
**fulfillmentCenterId** | **String** | An identifier for the fulfillment center that the shipment will be sent from. | 
**fulfillmentShipmentStatus** | [**FulfillmentShipmentStatusEnum**](#FulfillmentShipmentStatusEnum) | The current status of the shipment. | 
**shippingDateTime** | **String** | The meaning of the ShippingDateTime value depends on the current status of the shipment. If the current value of FulfillmentShipmentStatus is:  * Pending - ShippingDateTime represents the estimated time that the shipment will leave the Amazon fulfillment center.  * Shipped - ShippingDateTime represents the date that the shipment left the Amazon fulfillment center. If a shipment includes more than one package, ShippingDateTime applies to all of the packages in the shipment. If the value of FulfillmentShipmentStatus is CancelledByFulfiller or CancelledBySeller, ShippingDateTime is not returned. The value must be in ISO 8601 date time format. |  [optional]
**estimatedArrivalDateTime** | **String** | The estimated arrival date and time of the shipment, in ISO 8601 date time format. Note that this value can change over time. If a shipment includes more than one package, EstimatedArrivalDateTime applies to all of the packages in the shipment. If the shipment has been cancelled, EstimatedArrivalDateTime is not returned. |  [optional]
**fulfillmentShipmentItem** | [**FulfillmentShipmentItemList**](FulfillmentShipmentItemList.md) |  | 
**fulfillmentShipmentPackage** | [**FulfillmentShipmentPackageList**](FulfillmentShipmentPackageList.md) |  |  [optional]


<a name="FulfillmentShipmentStatusEnum"></a>
## Enum: FulfillmentShipmentStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
SHIPPED | &quot;SHIPPED&quot;
CANCELLED_BY_FULFILLER | &quot;CANCELLED_BY_FULFILLER&quot;
CANCELLED_BY_SELLER | &quot;CANCELLED_BY_SELLER&quot;



