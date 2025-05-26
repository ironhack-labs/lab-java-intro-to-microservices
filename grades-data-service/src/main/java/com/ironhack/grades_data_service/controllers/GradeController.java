package com.ironhack.grades_data_service.controllers;

import com.ironhack.grades_data_service.models.Grade;
import com.ironhack.grades_data_service.repositories.GradeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {


    @Autowired
    private GradeRepository gradeRepository;

    // Add your endpoints here
    // For example:
     @GetMapping()
     public List<Grade> getAll() {
         return gradeRepository.findAll();
     }
}
