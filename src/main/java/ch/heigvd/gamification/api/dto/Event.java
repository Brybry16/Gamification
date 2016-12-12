package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import java.io.Serializable;


/**
 * Event
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-12T14:16:38.271+01:00")

public class Event  implements Serializable {
  private String type = null;

  private String user = null;

  private Object payload = null;

  private OffsetDateTime createDate = null;

  public Event type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of event
   * @return type
  **/
  @ApiModelProperty(value = "type of event")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Event user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Id user who triggers the event
   * @return user
  **/
  @ApiModelProperty(value = "Id user who triggers the event")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Event payload(Object payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Informations of the event
   * @return payload
  **/
  @ApiModelProperty(value = "Informations of the event")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

  public Event createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * date of the creation
   * @return createDate
  **/
  @ApiModelProperty(value = "date of the creation")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.type, event.type) &&
        Objects.equals(this.user, event.user) &&
        Objects.equals(this.payload, event.payload) &&
        Objects.equals(this.createDate, event.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, user, payload, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

