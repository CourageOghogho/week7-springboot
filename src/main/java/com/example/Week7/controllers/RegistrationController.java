package com.example.Week7.controllers;

import com.example.Week7.pojos.ApiResponse;
import com.example.Week7.pojos.RegistrationRequest;
import com.example.Week7.services.RegistrationService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/api/v1/register")
    public ApiResponse<String> registerUser(@RequestBody RegistrationRequest request){
        return registrationService.createUser(request);
    }
}
