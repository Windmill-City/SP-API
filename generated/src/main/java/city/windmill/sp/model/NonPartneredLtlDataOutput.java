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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment shipped by a carrier that has not partnered with Amazon.
 */
@ApiModel(description = "Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment shipped by a carrier that has not partnered with Amazon.")




public class NonPartneredLtlDataOutput {
  @SerializedName("CarrierName")
  private String carrierName = null;

  @SerializedName("ProNumber")
  private String proNumber = null;

  public NonPartneredLtlDataOutput carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The carrier that you are using for the inbound shipment.
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The carrier that you are using for the inbound shipment.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public NonPartneredLtlDataOutput proNumber(String proNumber) {
    this.proNumber = proNumber;
    return this;
  }

   /**
   * Get proNumber
   * @return proNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProNumber() {
    return proNumber;
  }

  public void setProNumber(String proNumber) {
    this.proNumber = proNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonPartneredLtlDataOutput nonPartneredLtlDataOutput = (NonPartneredLtlDataOutput) o;
    return Objects.equals(this.carrierName, nonPartneredLtlDataOutput.carrierName) &&
        Objects.equals(this.proNumber, nonPartneredLtlDataOutput.proNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, proNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonPartneredLtlDataOutput {\n");
    
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    proNumber: ").append(toIndentedString(proNumber)).append("\n");
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

