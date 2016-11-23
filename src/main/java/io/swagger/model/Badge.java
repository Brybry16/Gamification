package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * Badge
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

public class Badge   {
  private BigDecimal id = null;

  private String name = null;

  private String image = null;

  public Badge id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific badge
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific badge")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Badge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of badge
   * @return name
  **/
  @ApiModelProperty(value = "name of badge")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Badge image(String image) {
    this.image = image;
    return this;
  }

   /**
   * path of the image
   * @return image
  **/
  @ApiModelProperty(value = "path of the image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Badge badge = (Badge) o;
    return Objects.equals(this.id, badge.id) &&
        Objects.equals(this.name, badge.name) &&
        Objects.equals(this.image, badge.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Badge {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

