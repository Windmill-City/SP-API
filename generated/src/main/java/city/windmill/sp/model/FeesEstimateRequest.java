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
import city.windmill.sp.model.PriceToEstimateFees;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FeesEstimateRequest
 */




public class FeesEstimateRequest {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("IsAmazonFulfilled")
  private Boolean isAmazonFulfilled = null;

  @SerializedName("PriceToEstimateFees")
  private PriceToEstimateFees priceToEstimateFees = null;

  @SerializedName("Identifier")
  private String identifier = null;

  public FeesEstimateRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FeesEstimateRequest isAmazonFulfilled(Boolean isAmazonFulfilled) {
    this.isAmazonFulfilled = isAmazonFulfilled;
    return this;
  }

   /**
   * When true, the offer is fulfilled by Amazon.
   * @return isAmazonFulfilled
  **/
  @ApiModelProperty(value = "When true, the offer is fulfilled by Amazon.")
  public Boolean isIsAmazonFulfilled() {
    return isAmazonFulfilled;
  }

  public void setIsAmazonFulfilled(Boolean isAmazonFulfilled) {
    this.isAmazonFulfilled = isAmazonFulfilled;
  }

  public FeesEstimateRequest priceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
    this.priceToEstimateFees = priceToEstimateFees;
    return this;
  }

   /**
   * The product price that the fee estimate is based on.
   * @return priceToEstimateFees
  **/
  @ApiModelProperty(required = true, value = "The product price that the fee estimate is based on.")
  public PriceToEstimateFees getPriceToEstimateFees() {
    return priceToEstimateFees;
  }

  public void setPriceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
    this.priceToEstimateFees = priceToEstimateFees;
  }

  public FeesEstimateRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The product price on which the fee estimate is based.
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "The product price on which the fee estimate is based.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesEstimateRequest feesEstimateRequest = (FeesEstimateRequest) o;
    return Objects.equals(this.marketplaceId, feesEstimateRequest.marketplaceId) &&
        Objects.equals(this.isAmazonFulfilled, feesEstimateRequest.isAmazonFulfilled) &&
        Objects.equals(this.priceToEstimateFees, feesEstimateRequest.priceToEstimateFees) &&
        Objects.equals(this.identifier, feesEstimateRequest.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, isAmazonFulfilled, priceToEstimateFees, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesEstimateRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    isAmazonFulfilled: ").append(toIndentedString(isAmazonFulfilled)).append("\n");
    sb.append("    priceToEstimateFees: ").append(toIndentedString(priceToEstimateFees)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

