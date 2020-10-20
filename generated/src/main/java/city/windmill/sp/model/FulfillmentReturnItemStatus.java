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
 * Indicates if the return item has been processed by a fulfillment center.
 */
@JsonAdapter(FulfillmentReturnItemStatus.Adapter.class)
public enum FulfillmentReturnItemStatus {
  
  NEW("New"),
  
  PROCESSED("Processed");

  private String value;

  FulfillmentReturnItemStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FulfillmentReturnItemStatus fromValue(String text) {
    for (FulfillmentReturnItemStatus b : FulfillmentReturnItemStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FulfillmentReturnItemStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final FulfillmentReturnItemStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FulfillmentReturnItemStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FulfillmentReturnItemStatus.fromValue(String.valueOf(value));
    }
  }
}

