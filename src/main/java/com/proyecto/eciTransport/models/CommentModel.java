package com.proyecto.eciTransport.models;

import java.util.Date;

public class CommentModel {


    private UserModel user;
    private Date hour;
    private String comment;

    public CommentModel(UserModel user, Date hour, String comment) {
        this.user = user;
        this.hour = hour;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ComentarModel{" +
                "user=" + user +
                ", hour=" + hour +
                ", comment='" + comment + '\'' +
                '}';
    }
}
