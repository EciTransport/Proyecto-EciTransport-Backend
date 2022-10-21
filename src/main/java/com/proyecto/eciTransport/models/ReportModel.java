package com.proyecto.eciTransport.models;

import java.sql.Timestamp;
import java.util.ArrayList;

public class ReportModel {

    private long id;
    private UsuarioModel author;
    private String description;
    private Timestamp hourReport;
    private String sentido;
    private String ubicacion;
    private long numberlikes;
    private ArrayList<ImagesReportModel> imagesReport;

    public ReportModel(long id, UsuarioModel author, String description, Timestamp hourReport, String sentido,
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

    public UsuarioModel getAuthor() {
        return author;
    }

    public void setAuthor(UsuarioModel author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getHourReport() {
        return hourReport;
    }

    public void setHourReport(Timestamp hourReport) {
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
}
