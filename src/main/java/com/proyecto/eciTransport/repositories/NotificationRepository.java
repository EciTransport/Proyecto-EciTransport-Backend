package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.NotificationModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("notificationRepository")
public interface NotificationRepository extends MongoRepository<NotificationModel, Long> {
}
