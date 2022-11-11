package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.ContactModel;
import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/notification")
@CrossOrigin()
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @RequestMapping(path = "/All",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllNotifications() {
        List<NotificationModel> notificationModels = notificationService.getAllNotifications();
        return new ResponseEntity<>(notificationModels, HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "/{email}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getNotificationsUserForEmail(@PathVariable String email) {
        List<NotificationModel> notificationModels = notificationService.consultNotificationsUserForEmail(email);
        return new ResponseEntity<>(notificationModels, HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteNotification(@PathVariable long id) {
        notificationService.deleteNotification(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postReport(@RequestBody NotificationModel notification) {
        notificationService.addNotification(notification);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
