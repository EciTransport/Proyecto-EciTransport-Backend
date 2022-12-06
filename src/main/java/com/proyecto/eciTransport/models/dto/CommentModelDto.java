package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.UserModel;

import java.util.Date;

public class CommentModelDto {

    private String idReport;
    private UserModel user;
    private Date hour;
    private String comment;

    public CommentModelDto(String idReport, UserModel user, Date hour, String comment) {
        this.idReport = idReport;
        this.user = user;
        this.hour = hour;
        this.comment = comment;
    }

    public String getIdReport() {
        return idReport;
    }

    public void setIdReport(String idReport) {
        this.idReport = idReport;
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

}
