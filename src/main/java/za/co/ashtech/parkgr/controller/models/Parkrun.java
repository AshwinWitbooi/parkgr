package za.co.ashtech.parkgr.controller.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * Parkrun
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-06T14:52:13.057490747Z[GMT]")


public class Parkrun   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("streetNumber")
  private String streetNumber = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("suburb")
  private String suburb = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("province")
  private String province = null;

  public Parkrun name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of park run
   * @return name
   **/
  @Schema(example = "Bellville", required = true, description = "Name of park run")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parkrun streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * Street number of park run
   * @return streetNumber
   **/
  @Schema(example = "3", required = true, description = "Street number of park run")
      @NotNull

    public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Parkrun streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Street name of park run
   * @return streetName
   **/
  @Schema(example = "Voortrekker Road", required = true, description = "Street name of park run")
      @NotNull

    public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Parkrun suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

  /**
   * Suurb where park run located
   * @return suburb
   **/
  @Schema(example = "Bellville", description = "Suurb where park run located")
      @NotNull

    public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Parkrun city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City where park run located
   * @return city
   **/
  @Schema(example = "Cape town", required = true, description = "City where park run located")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Parkrun province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Province where park run located
   * @return province
   **/
  @Schema(example = "Cape town", description = "Province where park run located")
      @NotNull

    public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parkrun parkrun = (Parkrun) o;
    return Objects.equals(this.name, parkrun.name) &&
        Objects.equals(this.streetNumber, parkrun.streetNumber) &&
        Objects.equals(this.streetName, parkrun.streetName) &&
        Objects.equals(this.suburb, parkrun.suburb) &&
        Objects.equals(this.city, parkrun.city) &&
        Objects.equals(this.province, parkrun.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streetNumber, streetName, suburb, city, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parkrun {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
