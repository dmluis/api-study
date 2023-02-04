package com.luisd.apistudy.resources;

import com.luisd.apistudy.models.UserModel;
import com.luisd.apistudy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserModel> findById(@PathVariable Integer id) {
        UserModel user = this.service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
