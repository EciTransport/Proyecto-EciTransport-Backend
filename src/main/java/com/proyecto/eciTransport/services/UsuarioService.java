package com.proyecto.eciTransport.services;



import com.proyecto.eciTransport.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UserRespository userRespository;

}
