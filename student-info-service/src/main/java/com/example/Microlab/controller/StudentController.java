package com.example.Microlab.controller;

import com.example.Microlab.model.Student;
import com.example.Microlab.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/student/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudent(@PathVariable String studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Student not found"));
    }

}
