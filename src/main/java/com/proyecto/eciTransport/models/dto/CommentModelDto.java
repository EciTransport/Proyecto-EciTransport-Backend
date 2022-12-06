package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.UserModel;
import java.util.Date;

public class CommentModelDto {

    private String idReportDto;
    private UserModel userDto;
    private Date hourDto;
    private String commentDto;

    public CommentModelDto(String idReportDto, UserModel userDto, Date hourDto, String commentDto) {
        this.idReportDto = idReportDto;
        this.userDto = userDto;
        this.hourDto = hourDto;
        this.commentDto = commentDto;
    }

    public String getIdReportDto() {
        return idReportDto;
    }

    public void setIdReportDto(String idReportDto) {
        this.idReportDto = idReportDto;
    }

    public UserModel getUserDto() {
        return userDto;
    }

    public void setUserDto(UserModel userDto) {
        this.userDto = userDto;
    }

    public Date getHourDto() {
        return hourDto;
    }

    public void setHourDto(Date hourDto) {
        this.hourDto = hourDto;
    }

    public String getCommentDto() {
        return commentDto;
    }

    public void setCommentDto(String commentDto) {
        this.commentDto = commentDto;
    }
}
