package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.services.ReportService;
import com.proyecto.eciTransport.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("v1/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping
    public List<UserModel> consultReports(){
        return userService.getUsers();
    }

}
