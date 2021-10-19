package com.example.demo.response;

import com.example.demo.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponse {

    //@JsonIgnore
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    public StudentResponse(Student student) {
       this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
    }
}
