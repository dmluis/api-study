package com.luisd.apistudy.repositories;

import com.luisd.apistudy.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<UserModel, Integer> {
}
