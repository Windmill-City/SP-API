/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
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
import city.windmill.sp.model.InboundShipmentPlanList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateInboundShipmentPlanResult
 */




public class CreateInboundShipmentPlanResult {
  @SerializedName("InboundShipmentPlans")
  private InboundShipmentPlanList inboundShipmentPlans = null;

  public CreateInboundShipmentPlanResult inboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
    this.inboundShipmentPlans = inboundShipmentPlans;
    return this;
  }

   /**
   * Get inboundShipmentPlans
   * @return inboundShipmentPlans
  **/
  @ApiModelProperty(value = "")
  public InboundShipmentPlanList getInboundShipmentPlans() {
    return inboundShipmentPlans;
  }

  public void setInboundShipmentPlans(InboundShipmentPlanList inboundShipmentPlans) {
    this.inboundShipmentPlans = inboundShipmentPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInboundShipmentPlanResult createInboundShipmentPlanResult = (CreateInboundShipmentPlanResult) o;
    return Objects.equals(this.inboundShipmentPlans, createInboundShipmentPlanResult.inboundShipmentPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundShipmentPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInboundShipmentPlanResult {\n");
    
    sb.append("    inboundShipmentPlans: ").append(toIndentedString(inboundShipmentPlans)).append("\n");
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
