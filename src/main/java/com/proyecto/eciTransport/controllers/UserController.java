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
@CrossOrigin(origins = "http://localhost:3000")

public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "id/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@PathVariable long id) {
        Optional<UserModel> usuarioModel = userService.consultUser(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(usuarioModel), HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "name/{name}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUserName(@PathVariable String name) {
        Optional<UserModel> usuarioModel = userService.consultUserName(name);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(usuarioModel), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public List<UserModel> consultUserReports(){
        return userService.getUsers();
    }

}
