package com.example.Week7.utils;

import com.example.Week7.entities.User;
import com.example.Week7.pojos.RegistrationRequest;

public class Mapper {
    public  static User userMapper(RegistrationRequest request){
        return User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }
}
