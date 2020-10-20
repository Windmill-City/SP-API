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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * How the seller intends to provide box contents information for a shipment.
 */
@JsonAdapter(IntendedBoxContentsSource.Adapter.class)
public enum IntendedBoxContentsSource {
  
  NONE("NONE"),
  
  FEED("FEED"),
  
  _2D_BARCODE("2D_BARCODE");

  private String value;

  IntendedBoxContentsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntendedBoxContentsSource fromValue(String text) {
    for (IntendedBoxContentsSource b : IntendedBoxContentsSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IntendedBoxContentsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final IntendedBoxContentsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IntendedBoxContentsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IntendedBoxContentsSource.fromValue(String.valueOf(value));
    }
  }
}

