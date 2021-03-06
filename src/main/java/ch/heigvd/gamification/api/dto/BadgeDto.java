package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * BadgeDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T19:02:38.829+01:00")

public class BadgeDto  implements Serializable {
  private Long id = null;

  private String name = null;

  private String description = null;

  private String image = null;

  public BadgeDto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific badge
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific badge")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BadgeDto name(String name) {
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

  public BadgeDto description(String description) {
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

  public BadgeDto image(String image) {
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
    BadgeDto badge = (BadgeDto) o;
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
    sb.append("class BadgeDto {\n");
    
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

