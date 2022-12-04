package com.proyecto.eciTransport.controllers.stomp;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.models.ReportModel;
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

    @MessageMapping("/addReport")
    public void addReport(@RequestBody ReportModel report) {
        System.out.println("Funcion Add Report");
        msgt.convertAndSend("/topic/addReport", report);
    }

    @MessageMapping("/delReport")
    public void addReport(ArrayList<ReportModel> reports) {
        System.out.println("Funcion Del Report");
        msgt.convertAndSend("/topic/delReport", reports);
    }

    @MessageMapping("/addNotification")
    public void addNotification(@RequestBody NotificationModel notification) {
        System.out.println("Funcion Add Notification");
        msgt.convertAndSend("/topic/addNotification", notification);
    }

    @MessageMapping("/delNotification")
    public void delNotification(ArrayList<NotificationModel> notifications) {
        System.out.println("Funcion Del Notifications");
        msgt.convertAndSend("/topic/delNotification", notifications);
    }

    @MessageMapping("/addComment")
    public void addComment(@RequestBody CommentModel comment) {
        System.out.println("Funcion Add Comment");
        msgt.convertAndSend("/topic/addComment", comment);
    }

    @MessageMapping("/delComment")
    public void delComment(ArrayList<CommentModel> comments) {
        System.out.println("Funcion Del Comment");
        msgt.convertAndSend("/topic/delComment", comments);
    }

    @MessageMapping("/updateReport")
    public void updComment() {
        System.out.println("Funcion Update Report");
        List<ReportModel> reports = reportService.getAllReports();
        msgt.convertAndSend("/topic/updateReport", reports);
    }

}
