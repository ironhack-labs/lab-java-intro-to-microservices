package com.ironhack.discovery_service.controller;

import com.ironhack.discovery_service.model.Catalog;
import com.ironhack.discovery_service.model.Grade;
import com.ironhack.discovery_service.model.Student;
import com.ironhack.discovery_service.model.StudentGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogController  {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/catalogs/student/{studentId}")
    @ResponseStatus(HttpStatus.OK)
    public Catalog getCatalog(@PathVariable int studentId) {
        Student student = restTemplate.getForObject("http://localhost:8082/api/students/" + studentId, Student.class);

        Catalog catalog = new Catalog();
        catalog.setStudentName(student.getName());
        List<StudentGrade> studentGrades = new ArrayList<>();


        for (Grade grade : student.getGrades()) {
            Grade gradeDetails = restTemplate.getForObject("http://localhost:8083/api/courses/{courseCode}/grades" + grade.getId(), Grade.class);
            List<Grade> gradeList = new ArrayList<>();
            studentGrades.add(new StudentGrade(gradeDetails.getId(), gradeList));
        }

        catalog.setStudentGrades(studentGrades);
        return catalog;
    }
}
