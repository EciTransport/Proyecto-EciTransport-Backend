package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.UsuarioModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
@RequestMapping("v1/user")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(path = "/{userId}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@PathVariable long user) {
        UsuarioModel usuarioModel = usuarioService.consultUser(user);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(usuarioModel), HttpStatus.ACCEPTED);
    }

}
