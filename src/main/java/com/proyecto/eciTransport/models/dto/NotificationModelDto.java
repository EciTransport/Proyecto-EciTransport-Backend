package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.UserModel;
import java.util.Date;

public class NotificationModelDto {

    private UserModel userReceiver;
    private UserModel userCreator;
    private Date hour;
    private String description;

    public NotificationModelDto(UserModel userReceiver, UserModel userCreator, Date hour, String description) {
        this.userReceiver = userReceiver;
        this.userCreator = userCreator;
        this.hour = hour;
        this.description = description;
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

}
