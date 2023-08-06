package com.example.university.dto;


import lombok.Getter;
import lombok.Setter;

public class UserDTO {

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String username;

    @Setter
    @Getter
    private String roles;

    public UserDTO(String name, String username, String roles) {
        this.name = name;
        this.username = username;
        this.roles = roles;
    }


}