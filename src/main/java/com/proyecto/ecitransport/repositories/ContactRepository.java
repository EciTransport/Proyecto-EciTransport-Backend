package com.proyecto.ecitransport.repositories;

import com.proyecto.ecitransport.models.ContactModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("contactRepository")
public interface ContactRepository extends MongoRepository<ContactModel, Long> {
}
