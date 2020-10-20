/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
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
import city.windmill.sp.model.MoneyType;
import city.windmill.sp.model.Points;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BuyBoxPriceType
 */




public class BuyBoxPriceType {
  @SerializedName("condition")
  private String condition = null;

  @SerializedName("LandedPrice")
  private MoneyType landedPrice = null;

  @SerializedName("ListingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("Shipping")
  private MoneyType shipping = null;

  @SerializedName("Points")
  private Points points = null;

  public BuyBoxPriceType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public BuyBoxPriceType landedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
    return this;
  }

   /**
   * The value calculated by adding ListingPrice + Shipping - Points.
   * @return landedPrice
  **/
  @ApiModelProperty(required = true, value = "The value calculated by adding ListingPrice + Shipping - Points.")
  public MoneyType getLandedPrice() {
    return landedPrice;
  }

  public void setLandedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
  }

  public BuyBoxPriceType listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * The price of the item.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "The price of the item.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public BuyBoxPriceType shipping(MoneyType shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * The shipping cost.
   * @return shipping
  **/
  @ApiModelProperty(required = true, value = "The shipping cost.")
  public MoneyType getShipping() {
    return shipping;
  }

  public void setShipping(MoneyType shipping) {
    this.shipping = shipping;
  }

  public BuyBoxPriceType points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item.
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item.")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyBoxPriceType buyBoxPriceType = (BuyBoxPriceType) o;
    return Objects.equals(this.condition, buyBoxPriceType.condition) &&
        Objects.equals(this.landedPrice, buyBoxPriceType.landedPrice) &&
        Objects.equals(this.listingPrice, buyBoxPriceType.listingPrice) &&
        Objects.equals(this.shipping, buyBoxPriceType.shipping) &&
        Objects.equals(this.points, buyBoxPriceType.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, landedPrice, listingPrice, shipping, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyBoxPriceType {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    landedPrice: ").append(toIndentedString(landedPrice)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

