package com.fran.backend.usersapp.backend_usersapp.models.dto.mapper;

public class DtoMapperUser {

    private static DtoMapperUser mapper;
    private DtoMapperUser() {
        
    }

    public static DtoMapperUser getInstance() {
        mapper = new DtoMapperUser();
        return mapper;
    }
}
