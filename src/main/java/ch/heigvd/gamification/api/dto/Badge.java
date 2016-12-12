package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Badge
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-07T15:18:35.727+01:00")

public class Badge  implements Serializable {
  private String id = null;

  private String name = null;

  private String description = null;

  private String image = null;

  public Badge id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific badge
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific badge")
  public String getId() {
    return id;
  }

  public void setId(String id) {
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

  public Badge description(String description) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Badge badge = (Badge) o;
    return Objects.equals(this.id, badge.id) &&
        Objects.equals(this.name, badge.name) &&
        Objects.equals(this.description, badge.description) &&
        Objects.equals(this.image, badge.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Badge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

