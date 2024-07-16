package com.example.Microlab.controller;


import com.example.Microlab.model.Grade;
import com.example.Microlab.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GradeController {
    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/grades")
    @ResponseStatus(HttpStatus.OK)
    public List<Grade> getGrades(@RequestParam Optional<String> studentId) {
        if (studentId.isPresent()){
            return gradeRepository.findByStudentId(studentId.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong student id")));
        }
        return gradeRepository.findAll();
    }
}
