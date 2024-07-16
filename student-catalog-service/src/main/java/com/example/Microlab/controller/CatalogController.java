package com.example.Microlab.controller;


import com.example.Microlab.model.Catalog;
import com.example.Microlab.model.StudentGrade;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/catalogs/course/{courseId}")
    @ResponseStatus(HttpStastus.OK)
    public Catalog getCatalog(@PathVariable String courseId) {
        Course course = restTemplate.getForObject("http://grades-data-service/api/catalogs/course/" + courseId, Course.class );
        CourseGrade courseGrades = restTemplate.getForObject("http://grades-data-service/api/course/" + courseId, "/grades", CourseGrades.class);

        Catalog catalog = new Catalog();
        catalog.setCoursename(course.getCoursename());
        List<StudentGrade> studentGrades = new ArrayList<>();

        for (Grade grade : courseGrades.getGrades()) {
            Student student = restTemplate.getForObject("http://student-info-service/api/students/" + grades.getStudentId(), Student.class);
            studentGrades.add(new StudentGrade(student.getName(), student.getDescription(), grade.getGrade()));
        }

        catalog.setStudentGrades(studentGrades);
        return catalog;
    }
}
