package com.proyecto.eciTransport.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.UsuarioRespository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRespository usuarioRespository;

}
