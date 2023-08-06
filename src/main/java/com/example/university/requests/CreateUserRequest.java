package com.example.university.requests;


import lombok.Getter;
import lombok.Setter;

public class CreateUserRequest {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String roles;

    public CreateUserRequest(String name, String username, String password, String roles) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }


}