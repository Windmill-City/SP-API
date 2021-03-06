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
 * Item information for a fulfillment order preview.
 */
@ApiModel(description = "Item information for a fulfillment order preview.")




public class GetFulfillmentPreviewItem {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("SellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  public GetFulfillmentPreviewItem sellerSKU(String sellerSKU) {
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

  public GetFulfillmentPreviewItem quantity(Integer quantity) {
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

  public GetFulfillmentPreviewItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * A fulfillment order item identifier that the seller creates to track items in the fulfillment preview.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "A fulfillment order item identifier that the seller creates to track items in the fulfillment preview.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentPreviewItem getFulfillmentPreviewItem = (GetFulfillmentPreviewItem) o;
    return Objects.equals(this.sellerSKU, getFulfillmentPreviewItem.sellerSKU) &&
        Objects.equals(this.quantity, getFulfillmentPreviewItem.quantity) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, getFulfillmentPreviewItem.sellerFulfillmentOrderItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, quantity, sellerFulfillmentOrderItemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentPreviewItem {\n");
    
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
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

