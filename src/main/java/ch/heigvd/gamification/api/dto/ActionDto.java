package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * ActionDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T17:18:11.530+01:00")

public class ActionDto  implements Serializable {
  private String type = null;

  private Object payload = null;

  public ActionDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of action
   * @return type
  **/
  @ApiModelProperty(value = "type of action")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActionDto payload(Object payload) {
    this.payload = payload;
    return this;
  }

   /**
   * payload for information like numbers points or id of bagde
   * @return payload
  **/
  @ApiModelProperty(value = "payload for information like numbers points or id of bagde")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDto action = (ActionDto) o;
    return Objects.equals(this.type, action.type) &&
        Objects.equals(this.payload, action.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

