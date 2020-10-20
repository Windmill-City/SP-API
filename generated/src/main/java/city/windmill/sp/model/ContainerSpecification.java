/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
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
import city.windmill.sp.model.Dimensions;
import city.windmill.sp.model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Container specification for checking the service rate.
 */
@ApiModel(description = "Container specification for checking the service rate.")




public class ContainerSpecification {
  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("weight")
  private Weight weight = null;

  public ContainerSpecification dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * The length, width, and height of the container.
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "The length, width, and height of the container.")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public ContainerSpecification weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the container.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The weight of the container.")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSpecification containerSpecification = (ContainerSpecification) o;
    return Objects.equals(this.dimensions, containerSpecification.dimensions) &&
        Objects.equals(this.weight, containerSpecification.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSpecification {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
