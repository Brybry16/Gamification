package ch.heigvd.gamification.dao;
import javax.persistence.*;


@Entity
public class Rule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String eventType = null;

    @OneToOne(cascade = CascadeType.ALL)
    private Action action = null;

    protected Rule() {}

    public Rule(String eventType, Action action) {
        this.eventType = eventType;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                ", action=" + action +
                '}';
    }
}
