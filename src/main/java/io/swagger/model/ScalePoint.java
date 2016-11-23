package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * ScalePoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

public class ScalePoint   {
  private BigDecimal id = null;

  private String name = null;

  public ScalePoint id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific scale point
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific scale point")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public ScalePoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of scale point
   * @return name
  **/
  @ApiModelProperty(value = "name of scale point")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalePoint scalePoint = (ScalePoint) o;
    return Objects.equals(this.id, scalePoint.id) &&
        Objects.equals(this.name, scalePoint.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalePoint {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

