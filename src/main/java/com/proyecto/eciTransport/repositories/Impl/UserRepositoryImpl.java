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
        //Image Profile
        String image1 = "https://i.pinimg.com/736x/91/b6/50/91b6505aaac2759622421993ad1de8f5.jpg";
        String image2 = "https://i.pinimg.com/originals/f3/4b/64/f34b64bccb514d7a3a9b3449444d6b38.jpg";
        String image3 = "https://i.pinimg.com/736x/98/4b/a4/984ba4eafd168286f4e840de24f2976b.jpg";
        //CreateUser
        UsuarioModel user1 = new UsuarioModel(1, "Carlos Orduz", "carlos.orduz@escuelaing.co", "12345", image1);
        UsuarioModel user2 = new UsuarioModel(2, "Valentina Alvarado", "valentina.alvarado@escuelaing.co", "12345", image2);
        UsuarioModel user3 = new UsuarioModel(3, "Yesid Mora", "yesid.mora@escuelaing.co", "12345", image3);
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

    @Override
    public UsuarioModel consultUserName(String name) throws ECITransportException {
        for (UsuarioModel u: userList) {
            if (u.getNombre() == name) return u;
        }
        throw new ECITransportException("the usuer doesn't exist");
    }
}
