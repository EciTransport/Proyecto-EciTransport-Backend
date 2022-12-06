package com.proyecto.ecitransport.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Contact")
public class ContactModel {
    @Id
    private long id;
    private String name;
    private String urlImageProfile;
    private String urlBackground;
    private String email;
    private String numberWhatsapp;
    private String numerPhone;

    public ContactModel() {
        super();
    }

    public ContactModel(long id, String name, String urlImageProfile, String urlBackground, String email, String numberWhatsapp, String numerPhone) {
        this.id = id;
        this.name = name;
        this.urlImageProfile = urlImageProfile;
        this.urlBackground = urlBackground;
        this.email = email;
        this.numberWhatsapp = numberWhatsapp;
        this.numerPhone = numerPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlImageProfile() {
        return urlImageProfile;
    }

    public void setUrlImageProfile(String urlImageProfile) {
        this.urlImageProfile = urlImageProfile;
    }

    public String getUrlBackground() {
        return urlBackground;
    }

    public void setUrlBackground(String urlBackground) {
        this.urlBackground = urlBackground;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberWhatsapp() {
        return numberWhatsapp;
    }

    public void setNumberWhatsapp(String numberWhatsapp) {
        this.numberWhatsapp = numberWhatsapp;
    }

    public String getNumerPhone() {
        return numerPhone;
    }

    public void setNumerPhone(String numerPhone) {
        this.numerPhone = numerPhone;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "id=" + id +
                ", urlImageProfile='" + urlImageProfile + '\'' +
                ", urlBackground='" + urlBackground + '\'' +
                ", email='" + email + '\'' +
                ", numberWhatsapp='" + numberWhatsapp + '\'' +
                ", numerPhone='" + numerPhone + '\'' +
                '}';
    }
}

