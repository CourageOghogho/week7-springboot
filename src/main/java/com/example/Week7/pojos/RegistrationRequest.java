package com.example.Week7.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RegistrationRequest {
    private String name;
    private String email;
    private String password;
}
