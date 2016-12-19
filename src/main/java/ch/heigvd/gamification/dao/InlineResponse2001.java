package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.api.dto.*;

import javax.persistence.*;

@Entity
public class InlineResponse2001 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private ScalePoint data = null;

    public InlineResponse2001() {
    }

    public InlineResponse2001(ScalePoint data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScalePoint getData() {
        return data;
    }

    public void setData(ScalePoint data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "InlineResponse2001{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }
}
