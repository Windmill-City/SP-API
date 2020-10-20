/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
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
import city.windmill.sp.model.CarrierWillPickUpOption;
import city.windmill.sp.model.DeliveryExperienceOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Filter for use when requesting eligible shipping services.
 */
@ApiModel(description = "Filter for use when requesting eligible shipping services.")




public class ShippingOfferingFilter {
  @SerializedName("IncludePackingSlipWithLabel")
  private Boolean includePackingSlipWithLabel = null;

  @SerializedName("IncludeComplexShippingOptions")
  private Boolean includeComplexShippingOptions = null;

  @SerializedName("CarrierWillPickUp")
  private CarrierWillPickUpOption carrierWillPickUp = null;

  @SerializedName("DeliveryExperience")
  private DeliveryExperienceOption deliveryExperience = null;

  public ShippingOfferingFilter includePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
    this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    return this;
  }

   /**
   * When true, include a packing slip with the label.
   * @return includePackingSlipWithLabel
  **/
  @ApiModelProperty(value = "When true, include a packing slip with the label.")
  public Boolean isIncludePackingSlipWithLabel() {
    return includePackingSlipWithLabel;
  }

  public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
    this.includePackingSlipWithLabel = includePackingSlipWithLabel;
  }

  public ShippingOfferingFilter includeComplexShippingOptions(Boolean includeComplexShippingOptions) {
    this.includeComplexShippingOptions = includeComplexShippingOptions;
    return this;
  }

   /**
   * When true, include complex shipping options.
   * @return includeComplexShippingOptions
  **/
  @ApiModelProperty(value = "When true, include complex shipping options.")
  public Boolean isIncludeComplexShippingOptions() {
    return includeComplexShippingOptions;
  }

  public void setIncludeComplexShippingOptions(Boolean includeComplexShippingOptions) {
    this.includeComplexShippingOptions = includeComplexShippingOptions;
  }

  public ShippingOfferingFilter carrierWillPickUp(CarrierWillPickUpOption carrierWillPickUp) {
    this.carrierWillPickUp = carrierWillPickUp;
    return this;
  }

   /**
   * Get carrierWillPickUp
   * @return carrierWillPickUp
  **/
  @ApiModelProperty(value = "")
  public CarrierWillPickUpOption getCarrierWillPickUp() {
    return carrierWillPickUp;
  }

  public void setCarrierWillPickUp(CarrierWillPickUpOption carrierWillPickUp) {
    this.carrierWillPickUp = carrierWillPickUp;
  }

  public ShippingOfferingFilter deliveryExperience(DeliveryExperienceOption deliveryExperience) {
    this.deliveryExperience = deliveryExperience;
    return this;
  }

   /**
   * Get deliveryExperience
   * @return deliveryExperience
  **/
  @ApiModelProperty(value = "")
  public DeliveryExperienceOption getDeliveryExperience() {
    return deliveryExperience;
  }

  public void setDeliveryExperience(DeliveryExperienceOption deliveryExperience) {
    this.deliveryExperience = deliveryExperience;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOfferingFilter shippingOfferingFilter = (ShippingOfferingFilter) o;
    return Objects.equals(this.includePackingSlipWithLabel, shippingOfferingFilter.includePackingSlipWithLabel) &&
        Objects.equals(this.includeComplexShippingOptions, shippingOfferingFilter.includeComplexShippingOptions) &&
        Objects.equals(this.carrierWillPickUp, shippingOfferingFilter.carrierWillPickUp) &&
        Objects.equals(this.deliveryExperience, shippingOfferingFilter.deliveryExperience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePackingSlipWithLabel, includeComplexShippingOptions, carrierWillPickUp, deliveryExperience);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOfferingFilter {\n");
    
    sb.append("    includePackingSlipWithLabel: ").append(toIndentedString(includePackingSlipWithLabel)).append("\n");
    sb.append("    includeComplexShippingOptions: ").append(toIndentedString(includeComplexShippingOptions)).append("\n");
    sb.append("    carrierWillPickUp: ").append(toIndentedString(carrierWillPickUp)).append("\n");
    sb.append("    deliveryExperience: ").append(toIndentedString(deliveryExperience)).append("\n");
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

