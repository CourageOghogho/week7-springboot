package com.example.Week7.services;

import com.example.Week7.pojos.ApiResponse;
import com.example.Week7.pojos.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public ApiResponse<String> createUser(RegistrationRequest request){

        //validate if email address if correct
        //validate if user already exist
        //save user in database if not exist
        return  new ApiResponse<String>("Request successful", true, "Signup successful");
    }
}
