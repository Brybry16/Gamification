package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;


/**
 * ScalePoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-12T14:16:38.271+01:00")

public class ScalePoint  implements Serializable {
  private String id = null;

  private String description = null;

  private String name = null;

  private BigDecimal points = null;

  public ScalePoint id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific scale point
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific scale point")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScalePoint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the ScalePoint
   * @return description
  **/
  @ApiModelProperty(value = "description of the ScalePoint")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public ScalePoint points(BigDecimal points) {
    this.points = points;
    return this;
  }

   /**
   * Points
   * @return points
  **/
  @ApiModelProperty(value = "Points")
  public BigDecimal getPoints() {
    return points;
  }

  public void setPoints(BigDecimal points) {
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
    ScalePoint scalePoint = (ScalePoint) o;
    return Objects.equals(this.id, scalePoint.id) &&
        Objects.equals(this.description, scalePoint.description) &&
        Objects.equals(this.name, scalePoint.name) &&
        Objects.equals(this.points, scalePoint.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, name, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalePoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

