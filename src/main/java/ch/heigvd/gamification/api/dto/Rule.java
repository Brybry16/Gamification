package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import ch.heigvd.gamification.api.dto.Action;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Rule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-12T14:16:38.271+01:00")

public class Rule  implements Serializable {
  private String id = null;

  private String eventType = null;

  private Action action = null;

  public Rule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific rules
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific rules")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rule eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of event
   * @return eventType
  **/
  @ApiModelProperty(value = "Type of event")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Rule action(Action action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.eventType, rule.eventType) &&
        Objects.equals(this.action, rule.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

