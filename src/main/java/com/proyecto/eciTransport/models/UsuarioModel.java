package com.proyecto.eciTransport.models;

public class UsuarioModel {

    private long id;
    private String nombre;
    private String email;
    private String password;
    private String imageProfile;

    public UsuarioModel(long id, String nombre, String email, String password, String imageProfile) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imageProfile = imageProfile;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
