package com.fran.backend.usersapp.backend_usersapp.models.dto;

public class UserDto {

    private Long Id;
    private String username;
    private String email;
    
    public UserDto() {
    }

    
    public UserDto(Long id, String username, String email) {
        Id = id;
        this.username = username;
        this.email = email;
    }


    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    


}
