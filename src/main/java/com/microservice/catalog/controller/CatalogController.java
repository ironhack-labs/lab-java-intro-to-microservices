package com.microservice.catalog.controller;

import com.microservice.catalog.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/catalog/students/{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Catalog getCatalog(@PathVariable String courseCode){

        Course course = restTemplate.getForObject("http://grades-data-service/api/courses/" + courseCode, Course.class);
        GradeList gradeList = restTemplate.getForObject("http://grades-data-service/api/courses/"+courseCode+"/grades", GradeList.class);

        Catalog catalog = new Catalog();
        catalog.setCourseName(course.getCourseName());
        List<StudentGrade> studentGrades = new ArrayList<>();

        for(Grade grade : gradeList.getGrades()){
            Student student = restTemplate.getForObject("http://student-info-service/api/students/"+grade.getStudentId(), Student.class);
            studentGrades.add(new StudentGrade(student.getName(), student.getAge(), grade.getGrade()));
        }

        catalog.setStudentsGrades(studentGrades);
        return catalog;

    }

}
