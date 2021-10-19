package com.example.demo.controllers;

import com.example.demo.entity.Student;
import com.example.demo.requests.CreateStudentRequest;
import com.example.demo.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.StudentService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/getAll")
    public List<StudentResponse> getAllStudent() {

        List<Student> students = studentService.getAllStudents();
        List<StudentResponse> studentsResponse = new ArrayList<>();

        students.stream().forEach(stud ->
                studentsResponse.add(new StudentResponse(stud)));




        return studentsResponse;
    }


    @PostMapping("/create")
    public StudentResponse addStudent(@Valid @RequestBody CreateStudentRequest createStudentRequest) {

        Student student = studentService.createStudent(createStudentRequest);

        return new StudentResponse(student);



    }


}
