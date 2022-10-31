package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.ContactModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.services.ContactService;
import com.proyecto.eciTransport.services.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/contacts/")
@CrossOrigin()
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<?> getAllReports() {
        List<ContactModel> contactModels = contactService.consultContacts();
        Gson gson = new Gson();
        return new ResponseEntity<>(contactModels, HttpStatus.ACCEPTED);
    }

}
