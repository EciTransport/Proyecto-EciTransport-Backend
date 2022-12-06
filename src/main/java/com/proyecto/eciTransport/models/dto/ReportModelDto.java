package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.UserModel;

import java.util.ArrayList;
import java.util.Date;

public class ReportModelDto {

    private UserModel authorDto;
    private String descriptionDto;
    private Date hourReportDto;
    private String sentidoDto;
    private String ubicacionDto;
    private String latlngDto;
    private ArrayList<String> imagesReportDto;
    private ArrayList<CommentModel> commentsDto;
    private ArrayList<Long> idUserLikesDto;

    public ReportModelDto(UserModel authorDto, String descriptionDto, Date hourReportDto, String sentidoDto, String ubicacionDto,
                          String latlngDto, ArrayList<String> imagesReportDto, ArrayList<CommentModel> commentsDto,
                          ArrayList<Long> idUserLikesDto) {
        this.authorDto = authorDto;
        this.descriptionDto = descriptionDto;
        this.hourReportDto = hourReportDto;
        this.sentidoDto = sentidoDto;
        this.ubicacionDto = ubicacionDto;
        this.latlngDto = latlngDto;
        this.imagesReportDto = imagesReportDto;
        this.commentsDto = commentsDto;
        this.idUserLikesDto = idUserLikesDto;
    }

    public UserModel getAuthorDto() {
        return authorDto;
    }

    public void setAuthorDto(UserModel authorDto) {
        this.authorDto = authorDto;
    }

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
    }

    public Date getHourReportDto() {
        return hourReportDto;
    }

    public void setHourReportDto(Date hourReportDto) {
        this.hourReportDto = hourReportDto;
    }

    public String getSentidoDto() {
        return sentidoDto;
    }

    public void setSentidoDto(String sentidoDto) {
        this.sentidoDto = sentidoDto;
    }

    public String getUbicacionDto() {
        return ubicacionDto;
    }

    public void setUbicacionDto(String ubicacionDto) {
        this.ubicacionDto = ubicacionDto;
    }

    public String getLatlngDto() {
        return latlngDto;
    }

    public void setLatlngDto(String latlngDto) {
        this.latlngDto = latlngDto;
    }

    public ArrayList<String> getImagesReportDto() {
        return imagesReportDto;
    }

    public void setImagesReportDto(ArrayList<String> imagesReportDto) {
        this.imagesReportDto = imagesReportDto;
    }

    public ArrayList<CommentModel> getCommentsDto() {
        return commentsDto;
    }

    public void setCommentsDto(ArrayList<CommentModel> commentsDto) {
        this.commentsDto = commentsDto;
    }

    public ArrayList<Long> getIdUserLikesDto() {
        return idUserLikesDto;
    }

    public void setIdUserLikesDto(ArrayList<Long> idUserLikesDto) {
        this.idUserLikesDto = idUserLikesDto;
    }
}
