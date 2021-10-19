package com.example.demo.services;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.requests.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public Student createStudent (CreateStudentRequest createStudentRequest) {
        Student student = new Student(createStudentRequest);
        student = studentRepository.save(student);

        return student;

    }
}
