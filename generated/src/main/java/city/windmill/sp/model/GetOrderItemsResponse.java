/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
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
import city.windmill.sp.model.ErrorList;
import city.windmill.sp.model.OrderItemsList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getOrderItems operation.
 */
@ApiModel(description = "The response schema for the getOrderItems operation.")




public class GetOrderItemsResponse {
  @SerializedName("payload")
  private OrderItemsList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderItemsResponse payload(OrderItemsList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getOrderItems operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getOrderItems operation.")
  public OrderItemsList getPayload() {
    return payload;
  }

  public void setPayload(OrderItemsList payload) {
    this.payload = payload;
  }

  public GetOrderItemsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getOrderItems operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getOrderItems operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderItemsResponse getOrderItemsResponse = (GetOrderItemsResponse) o;
    return Objects.equals(this.payload, getOrderItemsResponse.payload) &&
        Objects.equals(this.errors, getOrderItemsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderItemsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

