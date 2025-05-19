package com.fran.backend.usersapp.backend_usersapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fran.backend.usersapp.backend_usersapp.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    

}
