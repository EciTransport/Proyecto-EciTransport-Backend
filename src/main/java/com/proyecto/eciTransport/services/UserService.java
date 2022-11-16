package com.proyecto.eciTransport.services;




import com.proyecto.eciTransport.models.NotificationModel;
import com.proyecto.eciTransport.models.UserModel;
import com.proyecto.eciTransport.repositories.UserRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@EnableMongoRepositories
@Service
public class UserService {

    @Autowired
    UserRespository userRespository;

    /**
     * Consult user for Id
     *
     * @param id Id User
     * @return user
     */
    public Optional<UserModel> consultUser(long id) {
        return userRespository.findById(id);
    }

    /**
     * Consult user for Id
     *
     * @param name Name User
     * @return user
     */
    public Optional<UserModel> consultUserName(String name) {
        return userRespository.findAll().stream().filter(u->u.getNombre().equals(name)).findAny();

    }

    /**
     * Consult user for Id
     *

     * @return user
     */
    public Optional<UserModel> consultUserEmail(String email) {
        return userRespository.findAll().stream().filter(u->u.getEmail().equals(email)).findAny();
    }

    /**
     * get all users of eciTransport
     * @return list of users of eciTransport
     */
    public List<UserModel> getUsers() {
        return userRespository.findAll();
    }

}
