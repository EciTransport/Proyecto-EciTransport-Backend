package com.proyecto.eciTransport.models;

import java.sql.Timestamp;

public class ReportModel {

    private long id;
    private String author;
    private String description;
    private Timestamp hourReport;

    private String sentido;

    private String Ubicacion;

    private long numberlikes;

    public ReportModel(long id, String author, String description, Timestamp hourReport, String sentido, String ubicacion, long numberlikes) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.hourReport = hourReport;
        this.sentido = sentido;
        this.Ubicacion = ubicacion;
        this.numberlikes = numberlikes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public long getNumberlikes() {
        return numberlikes;
    }

    public void setNumberlikes(long numberlikes) {
        this.numberlikes = numberlikes;
    }
}
