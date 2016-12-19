package ch.heigvd.gamification.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type = null;
    private String user = null;
    private Object payload = null;
    private OffsetDateTime createDate = null;


    public Event() {
    }

    public Event(String type, String user, Object payload, OffsetDateTime createDate) {
        this.type = type;
        this.user = user;
        this.payload = payload;
        this.createDate = createDate;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", payload=" + payload +
                ", createDate=" + createDate +
                '}';
    }
}
