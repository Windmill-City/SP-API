/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package city.windmill.sp.model;

import java.util.Objects;
import java.util.Arrays;
import city.windmill.sp.model.ReportOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateReportScheduleSpecification
 */




public class CreateReportScheduleSpecification {
  @SerializedName("reportType")
  private String reportType = null;

  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = new ArrayList<>();

  @SerializedName("reportOptions")
  private ReportOptions reportOptions = null;

  /**
   * One of a set of predefined ISO 8601 periods that specifies how often a report should be created.
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    PT5M("PT5M"),
    
    PT15M("PT15M"),
    
    PT30M("PT30M"),
    
    PT1H("PT1H"),
    
    PT2H("PT2H"),
    
    PT4H("PT4H"),
    
    PT8H("PT8H"),
    
    PT12H("PT12H"),
    
    P1D("P1D"),
    
    P2D("P2D"),
    
    P3D("P3D"),
    
    PT84H("PT84H"),
    
    P7D("P7D"),
    
    P14D("P14D"),
    
    P15D("P15D"),
    
    P18D("P18D"),
    
    P30D("P30D"),
    
    P1M("P1M");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period")
  private PeriodEnum period = null;

  @SerializedName("nextReportCreationTime")
  private OffsetDateTime nextReportCreationTime = null;

  public CreateReportScheduleSpecification reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * The report type.
   * @return reportType
  **/
  @ApiModelProperty(required = true, value = "The report type.")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public CreateReportScheduleSpecification marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public CreateReportScheduleSpecification addMarketplaceIdsItem(String marketplaceIdsItem) {
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * A list of marketplace identifiers for the report schedule.
   * @return marketplaceIds
  **/
  @ApiModelProperty(required = true, value = "A list of marketplace identifiers for the report schedule.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public CreateReportScheduleSpecification reportOptions(ReportOptions reportOptions) {
    this.reportOptions = reportOptions;
    return this;
  }

   /**
   * Get reportOptions
   * @return reportOptions
  **/
  @ApiModelProperty(value = "")
  public ReportOptions getReportOptions() {
    return reportOptions;
  }

  public void setReportOptions(ReportOptions reportOptions) {
    this.reportOptions = reportOptions;
  }

  public CreateReportScheduleSpecification period(PeriodEnum period) {
    this.period = period;
    return this;
  }

   /**
   * One of a set of predefined ISO 8601 periods that specifies how often a report should be created.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "One of a set of predefined ISO 8601 periods that specifies how often a report should be created.")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public CreateReportScheduleSpecification nextReportCreationTime(OffsetDateTime nextReportCreationTime) {
    this.nextReportCreationTime = nextReportCreationTime;
    return this;
  }

   /**
   * The date and time when the schedule will create its next report, in ISO 8601 date time format.
   * @return nextReportCreationTime
  **/
  @ApiModelProperty(value = "The date and time when the schedule will create its next report, in ISO 8601 date time format.")
  public OffsetDateTime getNextReportCreationTime() {
    return nextReportCreationTime;
  }

  public void setNextReportCreationTime(OffsetDateTime nextReportCreationTime) {
    this.nextReportCreationTime = nextReportCreationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReportScheduleSpecification createReportScheduleSpecification = (CreateReportScheduleSpecification) o;
    return Objects.equals(this.reportType, createReportScheduleSpecification.reportType) &&
        Objects.equals(this.marketplaceIds, createReportScheduleSpecification.marketplaceIds) &&
        Objects.equals(this.reportOptions, createReportScheduleSpecification.reportOptions) &&
        Objects.equals(this.period, createReportScheduleSpecification.period) &&
        Objects.equals(this.nextReportCreationTime, createReportScheduleSpecification.nextReportCreationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, marketplaceIds, reportOptions, period, nextReportCreationTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportScheduleSpecification {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    reportOptions: ").append(toIndentedString(reportOptions)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    nextReportCreationTime: ").append(toIndentedString(nextReportCreationTime)).append("\n");
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

