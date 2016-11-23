package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * Event
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-23T16:28:00.838+01:00")

public class Event   {
  private BigDecimal id = null;

  private String type = null;

  private Object actor = null;

  private Object payload = null;

  private DateTime createDate = null;

  public Event id(BigDecimal id) {
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

  public Event actor(Object actor) {
    this.actor = actor;
    return this;
  }

   /**
   * User who triggers the event
   * @return actor
  **/
  @ApiModelProperty(value = "User who triggers the event")
  public Object getActor() {
    return actor;
  }

  public void setActor(Object actor) {
    this.actor = actor;
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

  public Event createDate(DateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * date of the creation
   * @return createDate
  **/
  @ApiModelProperty(value = "date of the creation")
  public DateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(DateTime createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.actor, event.actor) &&
        Objects.equals(this.payload, event.payload) &&
        Objects.equals(this.createDate, event.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, actor, payload, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

