package ch.heigvd.gamification.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String applicationName = null;

    public RegistrationSummary() {
    }

    public RegistrationSummary(String applicationName) {
        this.applicationName = applicationName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public String toString() {
        return "RegistrationSummary{" +
                "id=" + id +
                ", applicationName='" + applicationName + '\'' +
                '}';
    }
}
