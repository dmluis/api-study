package com.luisd.apistudy.services;

import com.luisd.apistudy.models.UserModel;
import com.luisd.apistudy.repositories.UserRepository;
import com.luisd.apistudy.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserModel findById(Integer id) {
        Optional<UserModel> obj = repository.findById(id);
        return obj.orElseThrow(
                ()-> new ObjectNotFoundException("Objeto não encontrado! id: "
                + id + " tipo " +
                UserModel.class.getName()));
    }
}
