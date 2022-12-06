package com.proyecto.ecitransport.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document("Notification")
public class NotificationModel {

    @Id
    private ObjectId id;
    private UserModel userReceiver;
    private UserModel userCreator;
    private Date hour;
    private String description;
    private String idString;

    public NotificationModel(UserModel userReceiver, UserModel userCreator, Date hour, String description) {
        this.userReceiver = userReceiver;
        this.userCreator = userCreator;
        this.hour = hour;
        this.description = description;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
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
