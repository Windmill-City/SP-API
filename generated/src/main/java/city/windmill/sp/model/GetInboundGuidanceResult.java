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
import city.windmill.sp.model.ASINInboundGuidanceList;
import city.windmill.sp.model.InvalidASINList;
import city.windmill.sp.model.InvalidSKUList;
import city.windmill.sp.model.SKUInboundGuidanceList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetInboundGuidanceResult
 */




public class GetInboundGuidanceResult {
  @SerializedName("SKUInboundGuidanceList")
  private SKUInboundGuidanceList skUInboundGuidanceList = null;

  @SerializedName("InvalidSKUList")
  private InvalidSKUList invalidSKUList = null;

  @SerializedName("ASINInboundGuidanceList")
  private ASINInboundGuidanceList asINInboundGuidanceList = null;

  @SerializedName("InvalidASINList")
  private InvalidASINList invalidASINList = null;

  public GetInboundGuidanceResult skUInboundGuidanceList(SKUInboundGuidanceList skUInboundGuidanceList) {
    this.skUInboundGuidanceList = skUInboundGuidanceList;
    return this;
  }

   /**
   * Get skUInboundGuidanceList
   * @return skUInboundGuidanceList
  **/
  @ApiModelProperty(value = "")
  public SKUInboundGuidanceList getSkUInboundGuidanceList() {
    return skUInboundGuidanceList;
  }

  public void setSkUInboundGuidanceList(SKUInboundGuidanceList skUInboundGuidanceList) {
    this.skUInboundGuidanceList = skUInboundGuidanceList;
  }

  public GetInboundGuidanceResult invalidSKUList(InvalidSKUList invalidSKUList) {
    this.invalidSKUList = invalidSKUList;
    return this;
  }

   /**
   * Get invalidSKUList
   * @return invalidSKUList
  **/
  @ApiModelProperty(value = "")
  public InvalidSKUList getInvalidSKUList() {
    return invalidSKUList;
  }

  public void setInvalidSKUList(InvalidSKUList invalidSKUList) {
    this.invalidSKUList = invalidSKUList;
  }

  public GetInboundGuidanceResult asINInboundGuidanceList(ASINInboundGuidanceList asINInboundGuidanceList) {
    this.asINInboundGuidanceList = asINInboundGuidanceList;
    return this;
  }

   /**
   * Get asINInboundGuidanceList
   * @return asINInboundGuidanceList
  **/
  @ApiModelProperty(value = "")
  public ASINInboundGuidanceList getAsINInboundGuidanceList() {
    return asINInboundGuidanceList;
  }

  public void setAsINInboundGuidanceList(ASINInboundGuidanceList asINInboundGuidanceList) {
    this.asINInboundGuidanceList = asINInboundGuidanceList;
  }

  public GetInboundGuidanceResult invalidASINList(InvalidASINList invalidASINList) {
    this.invalidASINList = invalidASINList;
    return this;
  }

   /**
   * Get invalidASINList
   * @return invalidASINList
  **/
  @ApiModelProperty(value = "")
  public InvalidASINList getInvalidASINList() {
    return invalidASINList;
  }

  public void setInvalidASINList(InvalidASINList invalidASINList) {
    this.invalidASINList = invalidASINList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInboundGuidanceResult getInboundGuidanceResult = (GetInboundGuidanceResult) o;
    return Objects.equals(this.skUInboundGuidanceList, getInboundGuidanceResult.skUInboundGuidanceList) &&
        Objects.equals(this.invalidSKUList, getInboundGuidanceResult.invalidSKUList) &&
        Objects.equals(this.asINInboundGuidanceList, getInboundGuidanceResult.asINInboundGuidanceList) &&
        Objects.equals(this.invalidASINList, getInboundGuidanceResult.invalidASINList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skUInboundGuidanceList, invalidSKUList, asINInboundGuidanceList, invalidASINList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInboundGuidanceResult {\n");
    
    sb.append("    skUInboundGuidanceList: ").append(toIndentedString(skUInboundGuidanceList)).append("\n");
    sb.append("    invalidSKUList: ").append(toIndentedString(invalidSKUList)).append("\n");
    sb.append("    asINInboundGuidanceList: ").append(toIndentedString(asINInboundGuidanceList)).append("\n");
    sb.append("    invalidASINList: ").append(toIndentedString(invalidASINList)).append("\n");
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

