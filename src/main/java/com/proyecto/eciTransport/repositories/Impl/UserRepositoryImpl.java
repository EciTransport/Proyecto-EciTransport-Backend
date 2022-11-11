package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl{

    private final List<UserModel> userList = new ArrayList<>();

    public UserRepositoryImpl(){
        //Image Profile
        String image1 = "https://i.pinimg.com/736x/91/b6/50/91b6505aaac2759622421993ad1de8f5.jpg";
        String image2 = "https://i.pinimg.com/originals/f3/4b/64/f34b64bccb514d7a3a9b3449444d6b38.jpg";
        String image3 = "https://i.pinimg.com/736x/98/4b/a4/984ba4eafd168286f4e840de24f2976b.jpg";
    }

    public UserModel consultUser(long id) {
        for (UserModel u: userList) {
            if (u.getId() == id) return u;
        }
        return null;
    }

    public UserModel consultUserName(String name) {
        for (UserModel u: userList) {
            if (u.getNombre() == name) return u;
        }
        return null;
    }
}
