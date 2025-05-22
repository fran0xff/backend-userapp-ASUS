package com.fran.backend.usersapp.backend_usersapp.models.dto.mapper;

import com.fran.backend.usersapp.backend_usersapp.models.dto.UserDto;
import com.fran.backend.usersapp.backend_usersapp.models.entities.User;

public class DtoMapperUser {

    private static DtoMapperUser mapper;

    private User user;

    private DtoMapperUser() {
        
    }

    public static DtoMapperUser builder() {
        mapper = new DtoMapperUser();
        return mapper;
    }

    public DtoMapperUser setUser(User user) {
        this.user = user;
        return mapper;
    }

    public UserDto build() {

        if(user == null) {
            throw new RuntimeException("Debe pasar el entity user!");
        }

        UserDto userDto = new UserDto(this.user.getId(), this.user.getUsername(), this.user.getEmail());
        return userDto;
    }
    
}
