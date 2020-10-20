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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Item information for a shipment in a fulfillment order.
 */
@ApiModel(description = "Item information for a shipment in a fulfillment order.")




public class FulfillmentShipmentItem {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("SellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("PackageNumber")
  private Integer packageNumber = null;

  public FulfillmentShipmentItem sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public FulfillmentShipmentItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public FulfillmentShipmentItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public FulfillmentShipmentItem packageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
    return this;
  }

   /**
   * An identifier for the package that contains the item quantity.
   * @return packageNumber
  **/
  @ApiModelProperty(value = "An identifier for the package that contains the item quantity.")
  public Integer getPackageNumber() {
    return packageNumber;
  }

  public void setPackageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentShipmentItem fulfillmentShipmentItem = (FulfillmentShipmentItem) o;
    return Objects.equals(this.sellerSKU, fulfillmentShipmentItem.sellerSKU) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, fulfillmentShipmentItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.quantity, fulfillmentShipmentItem.quantity) &&
        Objects.equals(this.packageNumber, fulfillmentShipmentItem.packageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, sellerFulfillmentOrderItemId, quantity, packageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentShipmentItem {\n");
    
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
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

