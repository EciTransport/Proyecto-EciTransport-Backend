package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.repositories.NotificationRepository;
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
        return notificationRepository.findAll().stream().filter(r -> Objects.equals(r.getUserReceiver().getEmail(), email)).collect(Collectors.toList());
    }


    /**
     * Get All Notifications
     * @return List Notifications
     */
    public List<NotificationModel> getAllNotifications() {
        return notificationRepository.findAll();
    }

    /**
     * Delete Notification
     * @param id Id notification
     */
    public void deleteNotification(long id) {
        notificationRepository.deleteById(id);
    }


    /**
     * Add Notification
     * @param notificationModel notification
     */
    public void addNotification(NotificationModel notificationModel) {
        notificationRepository.save(notificationModel);
    }
}
