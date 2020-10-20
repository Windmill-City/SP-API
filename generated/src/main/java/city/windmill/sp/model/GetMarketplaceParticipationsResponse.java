/*
 * Selling Partner API for Sellers
 * The Selling Partner API for Sellers lets you retrieve information on behalf of sellers about their seller account, such as the marketplaces they participate in. Along with listing the marketplaces that a seller can sell in, the API also provides additional information about the marketplace such as the default language and the default currency. The API also provides seller-specific information such as whether the seller has suspended listings in that marketplace.
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
import city.windmill.sp.model.ErrorList;
import city.windmill.sp.model.MarketplaceParticipationList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getMarketplaceParticipations operation.
 */
@ApiModel(description = "The response schema for the getMarketplaceParticipations operation.")




public class GetMarketplaceParticipationsResponse {
  @SerializedName("payload")
  private MarketplaceParticipationList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetMarketplaceParticipationsResponse payload(MarketplaceParticipationList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getMarketplaceParticipations operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getMarketplaceParticipations operation.")
  public MarketplaceParticipationList getPayload() {
    return payload;
  }

  public void setPayload(MarketplaceParticipationList payload) {
    this.payload = payload;
  }

  public GetMarketplaceParticipationsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Encountered errors for the getMarketplaceParticipations operation.
   * @return errors
  **/
  @ApiModelProperty(value = "Encountered errors for the getMarketplaceParticipations operation.")
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
    GetMarketplaceParticipationsResponse getMarketplaceParticipationsResponse = (GetMarketplaceParticipationsResponse) o;
    return Objects.equals(this.payload, getMarketplaceParticipationsResponse.payload) &&
        Objects.equals(this.errors, getMarketplaceParticipationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketplaceParticipationsResponse {\n");
    
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

