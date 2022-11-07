package com.example.Week7.services;

import com.example.Week7.utils.Mapper;
import com.example.Week7.exceptions.InvalidInputException;
import com.example.Week7.pojos.ApiResponse;
import com.example.Week7.pojos.RegistrationRequest;
import com.example.Week7.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private  final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ApiResponse<String> createUser(RegistrationRequest request){

        //validate if email address is correct
        String email=request.getEmail();
        if(email==null | email.isEmpty()|email.length()<8 )
            throw  new InvalidInputException("Email address not valid");
        //validate if user already exist
        //save user in database if not exist
        userRepository.getByEmail(email).ifPresentOrElse(cashier -> {
            throw new InvalidInputException("Email already exists");
        }, () -> userRepository.save(Mapper.userMapper(request)));

        return  new ApiResponse<String>("Request successful", true, "Signup successful");
    }
}
