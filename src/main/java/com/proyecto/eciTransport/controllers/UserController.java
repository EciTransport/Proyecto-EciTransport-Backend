package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/user/")
@CrossOrigin()

public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "email/{email}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUserEmail(@PathVariable String email) {
        Optional<UserModel> usuarioModel = userService.consultUserEmail(email);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(usuarioModel), HttpStatus.ACCEPTED);
    }

}
