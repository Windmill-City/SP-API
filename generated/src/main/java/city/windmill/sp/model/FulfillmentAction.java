/*
 * Selling Partner API for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies whether the fulfillment order should ship now or have an order hold put on it.
 */
@JsonAdapter(FulfillmentAction.Adapter.class)
public enum FulfillmentAction {
  
  SHIP("Ship"),
  
  HOLD("Hold");

  private String value;

  FulfillmentAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FulfillmentAction fromValue(String text) {
    for (FulfillmentAction b : FulfillmentAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FulfillmentAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final FulfillmentAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FulfillmentAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FulfillmentAction.fromValue(String.valueOf(value));
    }
  }
}

