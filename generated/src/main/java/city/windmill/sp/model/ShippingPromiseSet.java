/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package city.windmill.sp.model;

import java.util.Objects;
import java.util.Arrays;
import city.windmill.sp.model.TimeRange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The promised delivery time and pickup time.
 */
@ApiModel(description = "The promised delivery time and pickup time.")




public class ShippingPromiseSet {
  @SerializedName("deliveryWindow")
  private TimeRange deliveryWindow = null;

  @SerializedName("receiveWindow")
  private TimeRange receiveWindow = null;

  public ShippingPromiseSet deliveryWindow(TimeRange deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
    return this;
  }

   /**
   * The time window in which the shipment will be delivered.
   * @return deliveryWindow
  **/
  @ApiModelProperty(value = "The time window in which the shipment will be delivered.")
  public TimeRange getDeliveryWindow() {
    return deliveryWindow;
  }

  public void setDeliveryWindow(TimeRange deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
  }

  public ShippingPromiseSet receiveWindow(TimeRange receiveWindow) {
    this.receiveWindow = receiveWindow;
    return this;
  }

   /**
   * The time window in which Amazon Shipping will pick up the shipment.
   * @return receiveWindow
  **/
  @ApiModelProperty(value = "The time window in which Amazon Shipping will pick up the shipment.")
  public TimeRange getReceiveWindow() {
    return receiveWindow;
  }

  public void setReceiveWindow(TimeRange receiveWindow) {
    this.receiveWindow = receiveWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingPromiseSet shippingPromiseSet = (ShippingPromiseSet) o;
    return Objects.equals(this.deliveryWindow, shippingPromiseSet.deliveryWindow) &&
        Objects.equals(this.receiveWindow, shippingPromiseSet.receiveWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryWindow, receiveWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingPromiseSet {\n");
    
    sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
    sb.append("    receiveWindow: ").append(toIndentedString(receiveWindow)).append("\n");
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

