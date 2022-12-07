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

    //Reportes
    @MessageMapping("/addReport")
    public void addReport(ArrayList<ReportModel> reports) {
        System.out.println("Funcion Add Report");
        msgt.convertAndSend("/topic/addReport", reports);
    }

    @MessageMapping("/delReport")
    public void delReport(ArrayList<ReportModel> reports) {
        System.out.println("Funcion Del Report");
        msgt.convertAndSend("/topic/delReport", reports);
    }

    //Notifications
    @MessageMapping("/addNotification")
    public void addNotification(ArrayList<NotificationModel> notifications) {
        System.out.println("Funcion Add Notification");
        msgt.convertAndSend("/topic/addNotification", notifications);
    }

    @MessageMapping("/delNotification")
    public void delNotification(ArrayList<NotificationModel> notifications) {
        System.out.println("Funcion Del Notifications");
        msgt.convertAndSend("/topic/delNotification", notifications);
    }

    //Comments
    @MessageMapping("/addComment")
    public void addComment(ArrayList<CommentModel> comments) {
        System.out.println("Funcion Add Comment");
        msgt.convertAndSend("/topic/addComment", comments);
    }

    @MessageMapping("/delComment")
    public void delComment(ArrayList<CommentModel> comments) {
        System.out.println("Funcion Del Comment");
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
