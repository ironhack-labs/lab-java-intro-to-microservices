package com.ironhack.microservice.Controller;



import com.ironhack.microservice.Model.Grade;
import com.ironhack.microservice.Repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/grades")
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }
}
