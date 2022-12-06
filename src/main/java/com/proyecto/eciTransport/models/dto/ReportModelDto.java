package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.UserModel;

import java.util.ArrayList;
import java.util.Date;

public class ReportModelDto {

    private UserModel author;
    private String description;
    private Date hourReport;
    private String sentido;
    private String ubicacion;
    private String latlng;
    private ArrayList<String> imagesReport;
    private ArrayList<CommentModel> comments;
    private ArrayList<Long> idUserLikes;

    public ReportModelDto(UserModel author, String description, Date hourReport, String sentido, String ubicacion,
                          String latlng, ArrayList<String> imagesReport, ArrayList<CommentModel> comments,
                          ArrayList<Long> idUserLikes) {
        this.author = author;
        this.description = description;
        this.hourReport = hourReport;
        this.sentido = sentido;
        this.ubicacion = ubicacion;
        this.latlng = latlng;
        this.imagesReport = imagesReport;
        this.comments = comments;
        this.idUserLikes = idUserLikes;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getHourReport() {
        return hourReport;
    }

    public void setHourReport(Date hourReport) {
        this.hourReport = hourReport;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getLatlng() {
        return latlng;
    }

    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    public ArrayList<String> getImagesReport() {
        return imagesReport;
    }

    public void setImagesReport(ArrayList<String> imagesReport) {
        this.imagesReport = imagesReport;
    }

    public ArrayList<CommentModel> getComments() {
        return comments;
    }

    public void setComments(ArrayList<CommentModel> comments) {
        this.comments = comments;
    }

    public ArrayList<Long> getIdUserLikes() {
        return idUserLikes;
    }

    public void setIdUserLikes(ArrayList<Long> idUserLikes) {
        this.idUserLikes = idUserLikes;
    }
}
