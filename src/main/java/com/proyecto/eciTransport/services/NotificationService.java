package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.NotificationRepository;
import com.proyecto.eciTransport.repositories.ReportRepository;
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
     * @return List notifications
     */
    public List<NotificationModel> consultNotificationsUserForEmai(String email) {
        return notificationRepository.findAll().stream().filter(r -> Objects.equals(r.getUser().getEmail(), email)).collect(Collectors.toList());
    }

    /**
     * get all notifications
     * @return List notifications
     */
    public List<NotificationModel> consultAllNotifications() {
        return notificationRepository.findAll();
    }

    /**
     * Delete Notification
     * @param id Id notification
     */
    public void deleteNotification(long id) {
        notificationRepository.deleteById(id);
    }
}
