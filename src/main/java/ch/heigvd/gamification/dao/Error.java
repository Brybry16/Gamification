package ch.heigvd.gamification.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Error {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer code = null;
    private String message = null;
    private String fields = null;

    public Error() {
    }

    public Error(Integer code, String message, String fields) {
        this.code = code;
        this.message = message;
        this.fields = fields;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Error{" +
                "id=" + id +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", fields='" + fields + '\'' +
                '}';
    }
}
