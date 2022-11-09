package com.proyecto.eciTransport.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document("Notification")
public class NotificationModel {

    @Id
    private long id;
    private UserModel user;
    private Date hour;
    private String description;

    public NotificationModel(long id, UserModel user, Date hour, String description) {
        this.id = id;
        this.user = user;
        this.hour = hour;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NotificationModel{" +
                "id=" + id +
                ", user=" + user +
                ", hour=" + hour +
                ", description='" + description + '\'' +
                '}';
    }
}
