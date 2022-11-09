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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/contacts/")
@CrossOrigin()
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping(path = "consultContacts/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllContacts() {
        List<ContactModel> contactModels = contactService.consultContacts();
        Gson gson = new Gson();
        return new ResponseEntity<>(contactModels, HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "consultContacts/{name}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getContactsForName(@PathVariable String name) {
        List<ContactModel> contactModels = contactService.consultContactsForName(name);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(contactModels), HttpStatus.ACCEPTED);
    }


}
