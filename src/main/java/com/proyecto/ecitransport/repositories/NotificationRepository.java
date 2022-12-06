package com.proyecto.ecitransport.repositories;

import com.proyecto.ecitransport.models.NotificationModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("notificationRepository")
public interface NotificationRepository extends MongoRepository<NotificationModel, Long> {
}
