package com.proyecto.ecitransport.services;
import com.proyecto.ecitransport.models.UserModel;
import com.proyecto.ecitransport.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.Optional;


@EnableMongoRepositories
@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    /**
     * Consult user for Id
     * @return user
     */
    public Optional<UserModel> consultUserEmail(String email) {
        return userRespository.findAll().stream().filter(u->u.getEmail().equals(email)).findAny();
    }

}
