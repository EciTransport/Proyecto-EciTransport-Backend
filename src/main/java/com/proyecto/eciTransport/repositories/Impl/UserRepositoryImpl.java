package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.repositories.UserRespository;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRespository {
    private final List<User> userList = new ArrayList<>();

    public UserRepositoryImpl(){

    }

    @Override
    public long consultUser(long id) {
        return 0;
    }
}
