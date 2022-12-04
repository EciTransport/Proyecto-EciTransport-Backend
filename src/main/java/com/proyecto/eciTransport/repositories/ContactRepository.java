package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ContactModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("contactRepository")
public interface ContactRepository extends MongoRepository<ContactModel, Long> {
}
