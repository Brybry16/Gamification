package ch.heigvd.gamification.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String applicationName = null;
    private String password = null;

    public Registration() {
    }

    public Registration(String applicationName, String password) {
        this.applicationName = applicationName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", applicationName='" + applicationName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
