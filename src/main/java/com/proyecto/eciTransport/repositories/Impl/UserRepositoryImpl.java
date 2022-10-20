package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.UsuarioModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.UserRespository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRespository {

    private final List<UsuarioModel> userList = new ArrayList<>();

    public UserRepositoryImpl(){
        //CreateUser
        UsuarioModel user1 = new UsuarioModel(1, "carlos", "carlos.orduz@mail.escuelaing.edu.co", "12345");
        UsuarioModel user2 = new UsuarioModel(1, "valentina", "valentina.alvarado@mail.escuelaing.edu.co", "12345");
        UsuarioModel user3 = new UsuarioModel(1, "yesid", "yesid.mora@mail.escuelaing.edu.co", "12345");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    @Override
    public UsuarioModel consultUser(long id) throws ECITransportException {
        for (UsuarioModel u: userList) {
            if (u.getId() == id) return u;
        }
        throw new ECITransportException("the usuer doesn't exist");
    }
}
