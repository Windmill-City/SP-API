/*
 * Selling Partner API for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package city.windmill.sp.model;

import java.util.Objects;
import java.util.Arrays;
import city.windmill.sp.model.Address;
import city.windmill.sp.model.FulfillmentAction;
import city.windmill.sp.model.FulfillmentPolicy;
import city.windmill.sp.model.NotificationEmailList;
import city.windmill.sp.model.ShippingSpeedCategory;
import city.windmill.sp.model.UpdateFulfillmentOrderItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateFulfillmentOrderRequest
 */




public class UpdateFulfillmentOrderRequest {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("DisplayableOrderId")
  private String displayableOrderId = null;

  @SerializedName("DisplayableOrderDateTime")
  private String displayableOrderDateTime = null;

  @SerializedName("DisplayableOrderComment")
  private String displayableOrderComment = null;

  @SerializedName("ShippingSpeedCategory")
  private ShippingSpeedCategory shippingSpeedCategory = null;

  @SerializedName("DestinationAddress")
  private Address destinationAddress = null;

  @SerializedName("FulfillmentAction")
  private FulfillmentAction fulfillmentAction = null;

  @SerializedName("FulfillmentPolicy")
  private FulfillmentPolicy fulfillmentPolicy = null;

  @SerializedName("FulfillmentMethod")
  private String fulfillmentMethod = null;

  @SerializedName("ShipFromCountryCode")
  private String shipFromCountryCode = null;

  @SerializedName("NotificationEmailList")
  private NotificationEmailList notificationEmailList = null;

  @SerializedName("Items")
  private UpdateFulfillmentOrderItemList items = null;

  public UpdateFulfillmentOrderRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace the fulfillment order is placed against.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The marketplace the fulfillment order is placed against.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public UpdateFulfillmentOrderRequest displayableOrderId(String displayableOrderId) {
    this.displayableOrderId = displayableOrderId;
    return this;
  }

   /**
   * A fulfillment order identifier that the seller creates. This value displays as the order identifier in recipient-facing materials such as the outbound shipment packing slip. The value of DisplayableOrderId should match the order identifier that the seller provides to the recipient. The seller can use the SellerFulfillmentOrderId for this value or they can specify an alternate value if they want the recipient to reference an alternate order identifier.
   * @return displayableOrderId
  **/
  @ApiModelProperty(value = "A fulfillment order identifier that the seller creates. This value displays as the order identifier in recipient-facing materials such as the outbound shipment packing slip. The value of DisplayableOrderId should match the order identifier that the seller provides to the recipient. The seller can use the SellerFulfillmentOrderId for this value or they can specify an alternate value if they want the recipient to reference an alternate order identifier.")
  public String getDisplayableOrderId() {
    return displayableOrderId;
  }

  public void setDisplayableOrderId(String displayableOrderId) {
    this.displayableOrderId = displayableOrderId;
  }

  public UpdateFulfillmentOrderRequest displayableOrderDateTime(String displayableOrderDateTime) {
    this.displayableOrderDateTime = displayableOrderDateTime;
    return this;
  }

   /**
   * The date of the fulfillment order. Displays as the order date in recipient-facing materials such as the outbound shipment packing slip.
   * @return displayableOrderDateTime
  **/
  @ApiModelProperty(value = "The date of the fulfillment order. Displays as the order date in recipient-facing materials such as the outbound shipment packing slip.")
  public String getDisplayableOrderDateTime() {
    return displayableOrderDateTime;
  }

  public void setDisplayableOrderDateTime(String displayableOrderDateTime) {
    this.displayableOrderDateTime = displayableOrderDateTime;
  }

  public UpdateFulfillmentOrderRequest displayableOrderComment(String displayableOrderComment) {
    this.displayableOrderComment = displayableOrderComment;
    return this;
  }

   /**
   * Order-specific text that appears in recipient-facing materials such as the outbound shipment packing slip.
   * @return displayableOrderComment
  **/
  @ApiModelProperty(value = "Order-specific text that appears in recipient-facing materials such as the outbound shipment packing slip.")
  public String getDisplayableOrderComment() {
    return displayableOrderComment;
  }

  public void setDisplayableOrderComment(String displayableOrderComment) {
    this.displayableOrderComment = displayableOrderComment;
  }

  public UpdateFulfillmentOrderRequest shippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
    return this;
  }

   /**
   * Get shippingSpeedCategory
   * @return shippingSpeedCategory
  **/
  @ApiModelProperty(value = "")
  public ShippingSpeedCategory getShippingSpeedCategory() {
    return shippingSpeedCategory;
  }

  public void setShippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
  }

  public UpdateFulfillmentOrderRequest destinationAddress(Address destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * The destination address for the fulfillment order.
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "The destination address for the fulfillment order.")
  public Address getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(Address destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public UpdateFulfillmentOrderRequest fulfillmentAction(FulfillmentAction fulfillmentAction) {
    this.fulfillmentAction = fulfillmentAction;
    return this;
  }

   /**
   * Get fulfillmentAction
   * @return fulfillmentAction
  **/
  @ApiModelProperty(value = "")
  public FulfillmentAction getFulfillmentAction() {
    return fulfillmentAction;
  }

  public void setFulfillmentAction(FulfillmentAction fulfillmentAction) {
    this.fulfillmentAction = fulfillmentAction;
  }

  public UpdateFulfillmentOrderRequest fulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
    this.fulfillmentPolicy = fulfillmentPolicy;
    return this;
  }

   /**
   * Get fulfillmentPolicy
   * @return fulfillmentPolicy
  **/
  @ApiModelProperty(value = "")
  public FulfillmentPolicy getFulfillmentPolicy() {
    return fulfillmentPolicy;
  }

  public void setFulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
    this.fulfillmentPolicy = fulfillmentPolicy;
  }

  public UpdateFulfillmentOrderRequest fulfillmentMethod(String fulfillmentMethod) {
    this.fulfillmentMethod = fulfillmentMethod;
    return this;
  }

   /**
   * Indicates the intended recipient channel for the order.
   * @return fulfillmentMethod
  **/
  @ApiModelProperty(value = "Indicates the intended recipient channel for the order.")
  public String getFulfillmentMethod() {
    return fulfillmentMethod;
  }

  public void setFulfillmentMethod(String fulfillmentMethod) {
    this.fulfillmentMethod = fulfillmentMethod;
  }

  public UpdateFulfillmentOrderRequest shipFromCountryCode(String shipFromCountryCode) {
    this.shipFromCountryCode = shipFromCountryCode;
    return this;
  }

   /**
   * The two-character country code for the country from which the fulfillment order ships. Must be in ISO 3166-1 alpha-2 format.
   * @return shipFromCountryCode
  **/
  @ApiModelProperty(value = "The two-character country code for the country from which the fulfillment order ships. Must be in ISO 3166-1 alpha-2 format.")
  public String getShipFromCountryCode() {
    return shipFromCountryCode;
  }

  public void setShipFromCountryCode(String shipFromCountryCode) {
    this.shipFromCountryCode = shipFromCountryCode;
  }

  public UpdateFulfillmentOrderRequest notificationEmailList(NotificationEmailList notificationEmailList) {
    this.notificationEmailList = notificationEmailList;
    return this;
  }

   /**
   * Get notificationEmailList
   * @return notificationEmailList
  **/
  @ApiModelProperty(value = "")
  public NotificationEmailList getNotificationEmailList() {
    return notificationEmailList;
  }

  public void setNotificationEmailList(NotificationEmailList notificationEmailList) {
    this.notificationEmailList = notificationEmailList;
  }

  public UpdateFulfillmentOrderRequest items(UpdateFulfillmentOrderItemList items) {
    this.items = items;
    return this;
  }

   /**
   * A list of items to include in the fulfillment order preview, including quantity.
   * @return items
  **/
  @ApiModelProperty(value = "A list of items to include in the fulfillment order preview, including quantity.")
  public UpdateFulfillmentOrderItemList getItems() {
    return items;
  }

  public void setItems(UpdateFulfillmentOrderItemList items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFulfillmentOrderRequest updateFulfillmentOrderRequest = (UpdateFulfillmentOrderRequest) o;
    return Objects.equals(this.marketplaceId, updateFulfillmentOrderRequest.marketplaceId) &&
        Objects.equals(this.displayableOrderId, updateFulfillmentOrderRequest.displayableOrderId) &&
        Objects.equals(this.displayableOrderDateTime, updateFulfillmentOrderRequest.displayableOrderDateTime) &&
        Objects.equals(this.displayableOrderComment, updateFulfillmentOrderRequest.displayableOrderComment) &&
        Objects.equals(this.shippingSpeedCategory, updateFulfillmentOrderRequest.shippingSpeedCategory) &&
        Objects.equals(this.destinationAddress, updateFulfillmentOrderRequest.destinationAddress) &&
        Objects.equals(this.fulfillmentAction, updateFulfillmentOrderRequest.fulfillmentAction) &&
        Objects.equals(this.fulfillmentPolicy, updateFulfillmentOrderRequest.fulfillmentPolicy) &&
        Objects.equals(this.fulfillmentMethod, updateFulfillmentOrderRequest.fulfillmentMethod) &&
        Objects.equals(this.shipFromCountryCode, updateFulfillmentOrderRequest.shipFromCountryCode) &&
        Objects.equals(this.notificationEmailList, updateFulfillmentOrderRequest.notificationEmailList) &&
        Objects.equals(this.items, updateFulfillmentOrderRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, displayableOrderId, displayableOrderDateTime, displayableOrderComment, shippingSpeedCategory, destinationAddress, fulfillmentAction, fulfillmentPolicy, fulfillmentMethod, shipFromCountryCode, notificationEmailList, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFulfillmentOrderRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    displayableOrderId: ").append(toIndentedString(displayableOrderId)).append("\n");
    sb.append("    displayableOrderDateTime: ").append(toIndentedString(displayableOrderDateTime)).append("\n");
    sb.append("    displayableOrderComment: ").append(toIndentedString(displayableOrderComment)).append("\n");
    sb.append("    shippingSpeedCategory: ").append(toIndentedString(shippingSpeedCategory)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    fulfillmentAction: ").append(toIndentedString(fulfillmentAction)).append("\n");
    sb.append("    fulfillmentPolicy: ").append(toIndentedString(fulfillmentPolicy)).append("\n");
    sb.append("    fulfillmentMethod: ").append(toIndentedString(fulfillmentMethod)).append("\n");
    sb.append("    shipFromCountryCode: ").append(toIndentedString(shipFromCountryCode)).append("\n");
    sb.append("    notificationEmailList: ").append(toIndentedString(notificationEmailList)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
