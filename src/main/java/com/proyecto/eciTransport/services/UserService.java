package com.proyecto.eciTransport.services;




import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.repositories.UserRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@EnableMongoRepositories
@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    public List<UserModel> getUsers() {
        return  userRespository.findAll();
    }
}
