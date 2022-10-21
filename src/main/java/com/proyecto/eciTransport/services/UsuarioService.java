package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.UsuarioModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UserRespository userRespository;

    /**
     * Consult user for Id
     * @param id Id User
     * @return user
     */
    public UsuarioModel consultUser(long id) {
        try {
            return userRespository.consultUser(id);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Consult user for Id
     * @param name Name User
     * @return user
     */
    public UsuarioModel consultUserName(String name) {
        try {
            return userRespository.consultUserName(name);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

}
