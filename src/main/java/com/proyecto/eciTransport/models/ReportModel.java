package com.proyecto.eciTransport.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Date;
import java.util.ArrayList;

@Document("Report")
public class ReportModel {

    @Id
    private long id;

    @DocumentReference
    private UserModel author;
    private String description;
    private Date hourReport;
    private String sentido;
    private String ubicacion;
    private long numberlikes;
    private ArrayList<ImagesReportModel> imagesReport;

    public ReportModel(long id, UserModel author, String description, Date hourReport, String sentido,
                       String ubicacion, long numberlikes, ArrayList imagesReport) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.hourReport = hourReport;
        this.sentido = sentido;
        this.ubicacion = ubicacion;
        this.numberlikes = numberlikes;
        this.imagesReport = imagesReport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        ubicacion = ubicacion;
    }

    public long getNumberlikes() {
        return numberlikes;
    }

    public void setNumberlikes(long numberlikes) {
        this.numberlikes = numberlikes;
    }

    public ArrayList<ImagesReportModel> getImagesReport() {
        return imagesReport;
    }

    public void setImagesReport(ArrayList<ImagesReportModel> imagesReport) {
        this.imagesReport = imagesReport;
    }

    @Override
    public String toString() {
        return "ReportModel{" +
                "id=" + id +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", hourReport=" + hourReport +
                ", sentido='" + sentido + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", numberlikes=" + numberlikes +
                ", imagesReport=" + imagesReport +
                '}';
    }
}
