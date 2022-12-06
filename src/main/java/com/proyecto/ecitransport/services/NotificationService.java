package com.proyecto.ecitransport.services;

import com.proyecto.ecitransport.models.NotificationModel;
import com.proyecto.ecitransport.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@EnableMongoRepositories
@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    /**
     * get all notifications the user
     *
     * @return List notifications
     */
    public List<NotificationModel> consultNotificationsUserForEmail(String email) {
        List<NotificationModel> notifications = notificationRepository.findAll().stream().filter(r -> Objects.equals(r.getUserReceiver().getEmail(), email)).collect(Collectors.toList());
        for(NotificationModel n: notifications) {
            n.setIdString(n.getId().toString());
        }
        return notifications;
    }


    /**
     * Get All Notifications
     * @return List Notifications
     */
    public List<NotificationModel> getAllNotifications() {
        List<NotificationModel> notifications = notificationRepository.findAll();
        for(NotificationModel n: notifications) {
            n.setIdString(n.getId().toString());
        }
        return notifications;
    }

    /**
     * Delete Notification
     * @param id Id notification
     */
    public void deleteNotification(String id) {
        NotificationModel notification = notificationRepository.findAll().stream().filter(n -> n.getId().toString().equals(id)).collect(Collectors.toList()).get(0);
        notificationRepository.delete(notification);
    }

    /**
     * Add Notification
     * @param notificationModel notification
     */
    public NotificationModel addNotification(NotificationModel notificationModel) {
        notificationRepository.save(notificationModel);
        notificationModel.setIdString(notificationModel.getId().toString());
        return notificationModel;
    }
}
