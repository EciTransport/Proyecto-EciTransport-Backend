package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ContactModel;
import com.proyecto.eciTransport.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import java.util.List;

@EnableMongoRepositories
@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    /**
     * get All contacts
     * @return List the contacts
     */
    public List<ContactModel> consultContacts() {
        return contactRepository.findAll();
    }

}

