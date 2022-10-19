package com.proyecto.eciTransport.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


import java.sql.Timestamp;
import java.util.Date;

@Document("Report")
public class ReportModel {

    @Id
    private long id;
    private String author;
    private String description;
    private Date hourReport;

    public ReportModel(long id, String author, String description, Date hourReport) {
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

    public Date getHourReport() {
        return hourReport;
    }

    public void setHourReport(Timestamp hourReport) {
        this.hourReport = hourReport;
    }

    @Override
    public String toString() {
        return "ReportModel{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", hourReport=" + hourReport +
                '}';
    }
}
