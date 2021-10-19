package com.example.demo.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class CreateStudentRequest {


    @NotBlank(message = "First name required ")
    private String firstName;

    private String lastName;

    private String email;

}
