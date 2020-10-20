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
 * The currency code.
 */
@JsonAdapter(CurrencyCode.Adapter.class)
public enum CurrencyCode {
  
  USD("USD"),
  
  GBP("GBP");

  private String value;

  CurrencyCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CurrencyCode fromValue(String text) {
    for (CurrencyCode b : CurrencyCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CurrencyCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CurrencyCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CurrencyCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CurrencyCode.fromValue(String.valueOf(value));
    }
  }
}

