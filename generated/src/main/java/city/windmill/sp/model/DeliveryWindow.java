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
 * The time range within which a Scheduled Delivery fulfillment order should be delivered.
 */
@ApiModel(description = "The time range within which a Scheduled Delivery fulfillment order should be delivered.")




public class DeliveryWindow {
  @SerializedName("StartDateTime")
  private String startDateTime = null;

  @SerializedName("EndDateTime")
  private String endDateTime = null;

  public DeliveryWindow startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * The date and time of the start of the Scheduled Delivery window, in ISO 8601 date time format.
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "The date and time of the start of the Scheduled Delivery window, in ISO 8601 date time format.")
  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  public DeliveryWindow endDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * The date and time of the end of the Scheduled Delivery window, in ISO 8601 date time format.
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "The date and time of the end of the Scheduled Delivery window, in ISO 8601 date time format.")
  public String getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryWindow deliveryWindow = (DeliveryWindow) o;
    return Objects.equals(this.startDateTime, deliveryWindow.startDateTime) &&
        Objects.equals(this.endDateTime, deliveryWindow.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryWindow {\n");
    
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

