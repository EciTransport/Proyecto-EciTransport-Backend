package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.UsuarioModel;

public interface UserRespository {

    /**
     * Consult user for Id
     * @param id Id User
     * @return user
     */
    public UsuarioModel consultUser(long id) throws ECITransportException;
}
