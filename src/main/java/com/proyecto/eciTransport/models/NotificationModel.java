package com.proyecto.eciTransport.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document("Notification")
public class NotificationModel {

    @Id
    private long id;
    private UserModel userReceiver;
    private UserModel userCreator;
    private Date hour;
    private String description;

    public NotificationModel(long id, UserModel userReceiver, UserModel userCreator, Date hour, String description) {
        this.id = id;
        this.userReceiver = userReceiver;
        this.userCreator = userCreator;
        this.hour = hour;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUserReceiver() {
        return userReceiver;
    }

    public void setUserReceiver(UserModel userReceiver) {
        this.userReceiver = userReceiver;
    }

    public UserModel getUserCreator() {
        return userCreator;
    }

    public void setUserCreator(UserModel userCreator) {
        this.userCreator = userCreator;
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
                ", userReceiver=" + userReceiver +
                ", userCreator=" + userCreator +
                ", hour=" + hour +
                ", description='" + description + '\'' +
                '}';
    }
}
