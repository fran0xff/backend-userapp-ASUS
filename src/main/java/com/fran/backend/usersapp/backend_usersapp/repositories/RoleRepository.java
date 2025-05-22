package com.fran.backend.usersapp.backend_usersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fran.backend.usersapp.backend_usersapp.models.entities.Role;

public interface RoleRepository
        extends CrudRepository<Role, Long> {

        Optional<Role> findByName(String name);
}

