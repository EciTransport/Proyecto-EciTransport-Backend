package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ContactModel;
import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@EnableMongoRepositories
@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    /**
     * Consult contacts
     * @return List the contacts
     */
    public List<ContactModel> consultContacts() {
        return contactRepository.findAll();
    }

}

