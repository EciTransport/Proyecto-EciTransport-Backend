package com.proyecto.eciTransport.models;

import com.proyecto.eciTransport.models.dto.CommentModelDto;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document("Comment")
public class CommentModel {

    @Id
    private ObjectId id;
    private String idReport;
    private UserModel user;
    private Date hour;
    private String comment;
    private String idString;

    public CommentModel(String idReport, UserModel user, Date hour, String comment) {
        this.idReport = idReport;
        this.user = user;
        this.hour = hour;
        this.comment = comment;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "id=" + id +
                ", idReport='" + idReport + '\'' +
                ", user=" + user +
                ", hour=" + hour +
                ", comment='" + comment + '\'' +
                ", idString='" + idString + '\'' +
                '}';
    }
}
