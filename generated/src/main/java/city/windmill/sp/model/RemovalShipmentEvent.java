/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
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
import city.windmill.sp.model.RemovalShipmentItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A removal shipment event for a removal order.
 */
@ApiModel(description = "A removal shipment event for a removal order.")




public class RemovalShipmentEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("OrderId")
  private String orderId = null;

  @SerializedName("TransactionType")
  private String transactionType = null;

  @SerializedName("RemovalShipmentItemList")
  private RemovalShipmentItemList removalShipmentItemList = null;

  public RemovalShipmentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public RemovalShipmentEvent orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The identifier for the removal shipment order.
   * @return orderId
  **/
  @ApiModelProperty(value = "The identifier for the removal shipment order.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public RemovalShipmentEvent transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION
   * @return transactionType
  **/
  @ApiModelProperty(value = "The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public RemovalShipmentEvent removalShipmentItemList(RemovalShipmentItemList removalShipmentItemList) {
    this.removalShipmentItemList = removalShipmentItemList;
    return this;
  }

   /**
   * A list of removal shipment items.
   * @return removalShipmentItemList
  **/
  @ApiModelProperty(value = "A list of removal shipment items.")
  public RemovalShipmentItemList getRemovalShipmentItemList() {
    return removalShipmentItemList;
  }

  public void setRemovalShipmentItemList(RemovalShipmentItemList removalShipmentItemList) {
    this.removalShipmentItemList = removalShipmentItemList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovalShipmentEvent removalShipmentEvent = (RemovalShipmentEvent) o;
    return Objects.equals(this.postedDate, removalShipmentEvent.postedDate) &&
        Objects.equals(this.orderId, removalShipmentEvent.orderId) &&
        Objects.equals(this.transactionType, removalShipmentEvent.transactionType) &&
        Objects.equals(this.removalShipmentItemList, removalShipmentEvent.removalShipmentItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, orderId, transactionType, removalShipmentItemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovalShipmentEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    removalShipmentItemList: ").append(toIndentedString(removalShipmentItemList)).append("\n");
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

