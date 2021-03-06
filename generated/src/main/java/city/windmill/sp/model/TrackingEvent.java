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
import city.windmill.sp.model.EventCode;
import city.windmill.sp.model.TrackingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information for tracking package deliveries.
 */
@ApiModel(description = "Information for tracking package deliveries.")




public class TrackingEvent {
  @SerializedName("EventDate")
  private String eventDate = null;

  @SerializedName("EventAddress")
  private TrackingAddress eventAddress = null;

  @SerializedName("EventCode")
  private EventCode eventCode = null;

  public TrackingEvent eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date and time that the delivery event took place, in ISO 8601 date time format.
   * @return eventDate
  **/
  @ApiModelProperty(required = true, value = "The date and time that the delivery event took place, in ISO 8601 date time format.")
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public TrackingEvent eventAddress(TrackingAddress eventAddress) {
    this.eventAddress = eventAddress;
    return this;
  }

   /**
   * The city where the delivery event took place.
   * @return eventAddress
  **/
  @ApiModelProperty(required = true, value = "The city where the delivery event took place.")
  public TrackingAddress getEventAddress() {
    return eventAddress;
  }

  public void setEventAddress(TrackingAddress eventAddress) {
    this.eventAddress = eventAddress;
  }

  public TrackingEvent eventCode(EventCode eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * The event code for the delivery event.
   * @return eventCode
  **/
  @ApiModelProperty(required = true, value = "The event code for the delivery event.")
  public EventCode getEventCode() {
    return eventCode;
  }

  public void setEventCode(EventCode eventCode) {
    this.eventCode = eventCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingEvent trackingEvent = (TrackingEvent) o;
    return Objects.equals(this.eventDate, trackingEvent.eventDate) &&
        Objects.equals(this.eventAddress, trackingEvent.eventAddress) &&
        Objects.equals(this.eventCode, trackingEvent.eventCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventAddress, eventCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingEvent {\n");
    
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventAddress: ").append(toIndentedString(eventAddress)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
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

