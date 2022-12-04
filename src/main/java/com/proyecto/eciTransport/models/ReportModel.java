package com.proyecto.eciTransport.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.ArrayList;

@Document("Report")
public class ReportModel {

    @Id
    private ObjectId id;
    private UserModel author;
    private String description;
    private Date hourReport;
    private String sentido;
    private String ubicacion;
    private String latlng;
    private ArrayList<String> imagesReport;
    private ArrayList<CommentModel> comments;
    private ArrayList<Long> idUserLikes;
    private String idString;

    public ReportModel(UserModel author, String description, Date hourReport, String sentido,
                       String ubicacion, String latlng, ArrayList<String> imagesReport, ArrayList<CommentModel> comments, ArrayList<Long> idUserLikes) {
        this.author = author;
        this.description = description;
        this.hourReport = hourReport;
        this.sentido = sentido;
        this.ubicacion = ubicacion;
        this.imagesReport = imagesReport;
        this.comments = comments;
        this.idUserLikes = idUserLikes;
        this.latlng = latlng;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public String getLatlng() {
        return latlng;
    }

    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    @Override
    public String toString() {
        return "ReportModel{" +
                "id=" + id +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", hourReport=" + hourReport +
                ", sentido='" + sentido + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", imagesReport=" + imagesReport +
                ", comments=" + comments +
                ", latIlong=" + latlng +
                ", idUserLikes=" + idUserLikes +
                '}';
    }
}

