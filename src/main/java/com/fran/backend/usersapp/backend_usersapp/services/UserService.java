package com.fran.backend.usersapp.backend_usersapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fran.backend.usersapp.backend_usersapp.models.dto.UserDto;
import com.fran.backend.usersapp.backend_usersapp.models.entities.User;
import com.fran.backend.usersapp.backend_usersapp.models.request.UserRequest;

public interface UserService {
    
    List<UserDto> findAll();

    Page<UserDto> findAll(Pageable pageable);

    Optional<UserDto> findById(Long id);

    UserDto save(User user);
    Optional<UserDto> update(UserRequest user, Long id);

    void remove(Long id);
}
   