package ch.heigvd.gamification.dao;

import javax.persistence.*;

@Entity
public class InlineResponse200 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Badge data = null;

    public InlineResponse200() {
    }

    public InlineResponse200(Long id, Badge data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Badge getData() {
        return data;
    }

    public void setData(Badge data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "InlineResponse200{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }
}
