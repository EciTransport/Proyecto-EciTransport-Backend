package com.proyecto.eciTransport.models;

import java.sql.Timestamp;

public class ReportModel {

    private long id;
    private String author;
    private String description;
    private Timestamp hourReport;

    public ReportModel(long id, String author, String description, Timestamp hourReport) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.hourReport = hourReport;
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
}
