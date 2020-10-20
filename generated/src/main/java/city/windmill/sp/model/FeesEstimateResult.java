/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
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
import city.windmill.sp.model.FeesEstimate;
import city.windmill.sp.model.FeesEstimateError;
import city.windmill.sp.model.FeesEstimateIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item identifier and the estimated fees for the item.
 */
@ApiModel(description = "An item identifier and the estimated fees for the item.")




public class FeesEstimateResult {
  @SerializedName("Status")
  private String status = null;

  @SerializedName("FeesEstimateIdentifier")
  private FeesEstimateIdentifier feesEstimateIdentifier = null;

  @SerializedName("FeesEstimate")
  private FeesEstimate feesEstimate = null;

  @SerializedName("Error")
  private FeesEstimateError error = null;

  public FeesEstimateResult status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the fee request. Possible values: Success, ClientError, ServiceError.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the fee request. Possible values: Success, ClientError, ServiceError.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FeesEstimateResult feesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
    this.feesEstimateIdentifier = feesEstimateIdentifier;
    return this;
  }

   /**
   * Information used to identify a fees estimate request.
   * @return feesEstimateIdentifier
  **/
  @ApiModelProperty(value = "Information used to identify a fees estimate request.")
  public FeesEstimateIdentifier getFeesEstimateIdentifier() {
    return feesEstimateIdentifier;
  }

  public void setFeesEstimateIdentifier(FeesEstimateIdentifier feesEstimateIdentifier) {
    this.feesEstimateIdentifier = feesEstimateIdentifier;
  }

  public FeesEstimateResult feesEstimate(FeesEstimate feesEstimate) {
    this.feesEstimate = feesEstimate;
    return this;
  }

   /**
   * The total estimated fees for an item and a list of details.
   * @return feesEstimate
  **/
  @ApiModelProperty(value = "The total estimated fees for an item and a list of details.")
  public FeesEstimate getFeesEstimate() {
    return feesEstimate;
  }

  public void setFeesEstimate(FeesEstimate feesEstimate) {
    this.feesEstimate = feesEstimate;
  }

  public FeesEstimateResult error(FeesEstimateError error) {
    this.error = error;
    return this;
  }

   /**
   * An error object with a type, code, and message.
   * @return error
  **/
  @ApiModelProperty(value = "An error object with a type, code, and message.")
  public FeesEstimateError getError() {
    return error;
  }

  public void setError(FeesEstimateError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesEstimateResult feesEstimateResult = (FeesEstimateResult) o;
    return Objects.equals(this.status, feesEstimateResult.status) &&
        Objects.equals(this.feesEstimateIdentifier, feesEstimateResult.feesEstimateIdentifier) &&
        Objects.equals(this.feesEstimate, feesEstimateResult.feesEstimate) &&
        Objects.equals(this.error, feesEstimateResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, feesEstimateIdentifier, feesEstimate, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesEstimateResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feesEstimateIdentifier: ").append(toIndentedString(feesEstimateIdentifier)).append("\n");
    sb.append("    feesEstimate: ").append(toIndentedString(feesEstimate)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

