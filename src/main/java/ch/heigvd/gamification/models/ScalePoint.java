package ch.heigvd.gamification.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ScalePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id = null;
    private String description = null;
    private String name = null;
    private BigDecimal points = null;

    public ScalePoint() {
    }

    public ScalePoint(String description, String name, BigDecimal points) {
        this.description = description;
        this.name = name;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "ScalePoint{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
