package com.ironhack.student_catalog_service.controllers;

import com.ironhack.student_catalog_service.dto.CourseGrade;
import com.ironhack.student_catalog_service.models.Catalog;
import com.ironhack.student_catalog_service.models.StudentGrade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class CatalogController {


     @Autowired
     private RestTemplate restTemplate;
    // Add your endpoints here
    // For example:
     @GetMapping("/{courseCode}")
     @ResponseStatus(HttpStatus.OK)
     public Catalog getCatalogByCoursecode(@PathVariable String courseCode) {


         CourseGrade[] courseGrades = restTemplate.getForObject("http://grades-data-service/courses/" + courseCode + "/grades", CourseGrade[].class);
         List<StudentGrade> studentGrades = new ArrayList<>();
            if (courseGrades == null || courseGrades.length == 0) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Catalog not found");

            } else {
                Catalog catalog = new Catalog();
                catalog.setCourseName(courseGrades[0].getCourseName());

                for (CourseGrade courseGrade : courseGrades) {
                    StudentGrade studentGrade = new StudentGrade();
                    studentGrade.setName(courseGrade.getName());
                    studentGrade.setAge(courseGrade.getAge());
                    studentGrade.setGrade(courseGrade.getGrade());
                    studentGrades.add(studentGrade);

                }
                catalog.setStudentGrades(studentGrades);
                return catalog;
            }
     }
}
