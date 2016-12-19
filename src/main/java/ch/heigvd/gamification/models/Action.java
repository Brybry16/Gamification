package ch.heigvd.gamification.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String payload;

    protected Action() {}

    public Action(String type, Object payload) {
        this.type = type;
        try {
            this.payload = new ObjectMapper().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPayload(Object payload) {
        try {
            this.payload = new ObjectMapper().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
