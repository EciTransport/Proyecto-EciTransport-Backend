package com.proyecto.eciTransport.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository {
    long consultUser(long id);
}
