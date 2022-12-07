package com.proyecto.eciTransport.controllers.stomp;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.CommentService;
import com.proyecto.eciTransport.services.NotificationService;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;


@Controller
public class
STOMPMessagesHandler {

    @Autowired
    SimpMessagingTemplate msgt;

    @Autowired
    ReportService reportService;

    @Autowired
    CommentService commentService;

    @Autowired
    NotificationService notificationService;


    //Reportes
    @MessageMapping("/addReport")
    public void addReport() {
        System.out.println("Funcion Add Report");
        List<ReportModel> reports = reportService.getAllReports();
        msgt.convertAndSend("/topic/addReport", reports);
    }

    @MessageMapping("/delReport")
    public void delReport() {
        System.out.println("Funcion Del Report");
        List<ReportModel> reports = reportService.getAllReports();
        msgt.convertAndSend("/topic/delReport", reports);
    }

    //Notifications
    @MessageMapping("/addNotification")
    public void addNotification() {
        System.out.println("Funcion Add Notification");
        List<NotificationModel> notifications = notificationService.getAllNotifications();
        msgt.convertAndSend("/topic/addNotification", notifications);
    }

    @MessageMapping("/delNotification")
    public void delNotification() {
        System.out.println("Funcion Del Notifications");
        List<NotificationModel> notifications = notificationService.getAllNotifications();
        msgt.convertAndSend("/topic/delNotification", notifications);
    }

    //Comments
    @MessageMapping("/addComment")
    public void addComment() {
        System.out.println("Funcion Add Comment");
        List<CommentModel> comments = commentService.getAllComments();
        msgt.convertAndSend("/topic/addComment", comments);
    }

    @MessageMapping("/delComment")
    public void delComment() {
        List<CommentModel> comments = commentService.getAllComments();
        msgt.convertAndSend("/topic/delComment", comments);
    }

    //EXTRA
    @MessageMapping("/updateReport")
    public void updReports() {
        System.out.println("Funcion Update Report");
        List<ReportModel> reports = reportService.getAllReports();
        msgt.convertAndSend("/topic/updateReport", reports);
    }

}