package com.proyecto.ecitransport.repositories;

import com.proyecto.ecitransport.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("userRepository")
public interface UserRespository extends MongoRepository<UserModel, Long> {
}
