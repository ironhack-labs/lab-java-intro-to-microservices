package com.ironhack.microservicesgrades.controller;

import com.ironhack.microservicesgrades.model.Grade;
import com.ironhack.microservicesgrades.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

        @Autowired
        private GradeRepository gradeRepository;

        @GetMapping("/api")
        public List<Grade> getAllGrades() {
            return gradeRepository.findAll();
        }

}
