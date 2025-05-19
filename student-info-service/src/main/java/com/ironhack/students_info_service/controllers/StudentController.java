package com.ironhack.students_info_service.controllers;

import com.ironhack.students_info_service.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{studentId}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<?> getStudentById(@PathVariable Long studentId){
        return (new ResponseEntity<>(studentRepository.findById(studentId), HttpStatus.OK));
    }


}
