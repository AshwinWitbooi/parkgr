package za.co.ashtech.parkgr.controller.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RandomResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-06T14:52:13.057490747Z[GMT]")


public class RandomResource   {
  @JsonProperty("txId")
  private UUID txId = null;

  @JsonProperty("senderId")
  private String senderId = null;

  @JsonProperty("externalRef")
  private String externalRef = null;

  @JsonProperty("parkrun")
  private Parkrun parkrun = null;

  public RandomResource txId(UUID txId) {
    this.txId = txId;
    return this;
  }

  /**
   * Transaction ID
   * @return txId
   **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "Transaction ID")
      @NotNull

    @Valid
    public UUID getTxId() {
    return txId;
  }

  public void setTxId(UUID txId) {
    this.txId = txId;
  }

  public RandomResource senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

  /**
   * Sender ID
   * @return senderId
   **/
  @Schema(example = "Widget Adapter", required = true, description = "Sender ID")
      @NotNull

    public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public RandomResource externalRef(String externalRef) {
    this.externalRef = externalRef;
    return this;
  }

  /**
   * External reference for consuming client
   * @return externalRef
   **/
  @Schema(example = "241012366XX", required = true, description = "External reference for consuming client")
      @NotNull

    public String getExternalRef() {
    return externalRef;
  }

  public void setExternalRef(String externalRef) {
    this.externalRef = externalRef;
  }

  public RandomResource parkrun(Parkrun parkrun) {
    this.parkrun = parkrun;
    return this;
  }

  /**
   * Get parkrun
   * @return parkrun
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Parkrun getParkrun() {
    return parkrun;
  }

  public void setParkrun(Parkrun parkrun) {
    this.parkrun = parkrun;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RandomResource randomResource = (RandomResource) o;
    return Objects.equals(this.txId, randomResource.txId) &&
        Objects.equals(this.senderId, randomResource.senderId) &&
        Objects.equals(this.externalRef, randomResource.externalRef) &&
        Objects.equals(this.parkrun, randomResource.parkrun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId, senderId, externalRef, parkrun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RandomResource {\n");
    
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
    sb.append("    parkrun: ").append(toIndentedString(parkrun)).append("\n");
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
