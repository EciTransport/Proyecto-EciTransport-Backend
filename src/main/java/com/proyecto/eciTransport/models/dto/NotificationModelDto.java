package com.proyecto.eciTransport.models.dto;

import com.proyecto.eciTransport.models.UserModel;
import java.util.Date;

public class NotificationModelDto {

    private UserModel userReceiverDto;
    private UserModel userCreatorDto;
    private Date hourDto;
    private String descriptionDto;

    public NotificationModelDto(UserModel userReceiverDto, UserModel userCreatorDto, Date hourDto, String descriptionDto) {
        this.userReceiverDto = userReceiverDto;
        this.userCreatorDto = userCreatorDto;
        this.hourDto = hourDto;
        this.descriptionDto = descriptionDto;
    }

    public UserModel getUserReceiverDto() {
        return userReceiverDto;
    }

    public void setUserReceiverDto(UserModel userReceiverDto) {
        this.userReceiverDto = userReceiverDto;
    }

    public UserModel getUserCreatorDto() {
        return userCreatorDto;
    }

    public void setUserCreatorDto(UserModel userCreatorDto) {
        this.userCreatorDto = userCreatorDto;
    }

    public Date getHourDto() {
        return hourDto;
    }

    public void setHourDto(Date hourDto) {
        this.hourDto = hourDto;
    }

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
    }
}
