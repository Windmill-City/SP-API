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
import city.windmill.sp.model.FulfillmentOrder;
import city.windmill.sp.model.FulfillmentOrderItemList;
import city.windmill.sp.model.FulfillmentShipmentList;
import city.windmill.sp.model.ReturnAuthorizationList;
import city.windmill.sp.model.ReturnItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetFulfillmentOrderResult
 */




public class GetFulfillmentOrderResult {
  @SerializedName("FulfillmentOrder")
  private FulfillmentOrder fulfillmentOrder = null;

  @SerializedName("FulfillmentOrderItem")
  private FulfillmentOrderItemList fulfillmentOrderItem = null;

  @SerializedName("FulfillmentShipment")
  private FulfillmentShipmentList fulfillmentShipment = null;

  @SerializedName("ReturnItemList")
  private ReturnItemList returnItemList = null;

  @SerializedName("ReturnAuthorizationList")
  private ReturnAuthorizationList returnAuthorizationList = null;

  public GetFulfillmentOrderResult fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
    return this;
  }

   /**
   * Get fulfillmentOrder
   * @return fulfillmentOrder
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  public GetFulfillmentOrderResult fulfillmentOrderItem(FulfillmentOrderItemList fulfillmentOrderItem) {
    this.fulfillmentOrderItem = fulfillmentOrderItem;
    return this;
  }

   /**
   * Get fulfillmentOrderItem
   * @return fulfillmentOrderItem
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentOrderItemList getFulfillmentOrderItem() {
    return fulfillmentOrderItem;
  }

  public void setFulfillmentOrderItem(FulfillmentOrderItemList fulfillmentOrderItem) {
    this.fulfillmentOrderItem = fulfillmentOrderItem;
  }

  public GetFulfillmentOrderResult fulfillmentShipment(FulfillmentShipmentList fulfillmentShipment) {
    this.fulfillmentShipment = fulfillmentShipment;
    return this;
  }

   /**
   * Get fulfillmentShipment
   * @return fulfillmentShipment
  **/
  @ApiModelProperty(value = "")
  public FulfillmentShipmentList getFulfillmentShipment() {
    return fulfillmentShipment;
  }

  public void setFulfillmentShipment(FulfillmentShipmentList fulfillmentShipment) {
    this.fulfillmentShipment = fulfillmentShipment;
  }

  public GetFulfillmentOrderResult returnItemList(ReturnItemList returnItemList) {
    this.returnItemList = returnItemList;
    return this;
  }

   /**
   * Get returnItemList
   * @return returnItemList
  **/
  @ApiModelProperty(required = true, value = "")
  public ReturnItemList getReturnItemList() {
    return returnItemList;
  }

  public void setReturnItemList(ReturnItemList returnItemList) {
    this.returnItemList = returnItemList;
  }

  public GetFulfillmentOrderResult returnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
    this.returnAuthorizationList = returnAuthorizationList;
    return this;
  }

   /**
   * Get returnAuthorizationList
   * @return returnAuthorizationList
  **/
  @ApiModelProperty(required = true, value = "")
  public ReturnAuthorizationList getReturnAuthorizationList() {
    return returnAuthorizationList;
  }

  public void setReturnAuthorizationList(ReturnAuthorizationList returnAuthorizationList) {
    this.returnAuthorizationList = returnAuthorizationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentOrderResult getFulfillmentOrderResult = (GetFulfillmentOrderResult) o;
    return Objects.equals(this.fulfillmentOrder, getFulfillmentOrderResult.fulfillmentOrder) &&
        Objects.equals(this.fulfillmentOrderItem, getFulfillmentOrderResult.fulfillmentOrderItem) &&
        Objects.equals(this.fulfillmentShipment, getFulfillmentOrderResult.fulfillmentShipment) &&
        Objects.equals(this.returnItemList, getFulfillmentOrderResult.returnItemList) &&
        Objects.equals(this.returnAuthorizationList, getFulfillmentOrderResult.returnAuthorizationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, fulfillmentOrderItem, fulfillmentShipment, returnItemList, returnAuthorizationList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentOrderResult {\n");
    
    sb.append("    fulfillmentOrder: ").append(toIndentedString(fulfillmentOrder)).append("\n");
    sb.append("    fulfillmentOrderItem: ").append(toIndentedString(fulfillmentOrderItem)).append("\n");
    sb.append("    fulfillmentShipment: ").append(toIndentedString(fulfillmentShipment)).append("\n");
    sb.append("    returnItemList: ").append(toIndentedString(returnItemList)).append("\n");
    sb.append("    returnAuthorizationList: ").append(toIndentedString(returnAuthorizationList)).append("\n");
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

