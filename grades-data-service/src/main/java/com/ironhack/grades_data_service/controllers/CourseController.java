package com.ironhack.grades_data_service.controllers;

import com.ironhack.grades_data_service.dto.CourseGrade;
import com.ironhack.grades_data_service.dto.StudentDto;
import com.ironhack.grades_data_service.models.Course;
import com.ironhack.grades_data_service.models.Grade;
import com.ironhack.grades_data_service.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CourseService courseService;
    // Add your endpoints here
    // For example:
     @GetMapping("/{courseCode}/grades")
     @ResponseStatus(HttpStatus.OK)
     public List<CourseGrade> getGradesByCourseCode(@PathVariable String courseCode) {

         List<CourseGrade> grades =  courseService.getGradesByCourseCode(courseCode);




         return grades;
     }

     @GetMapping("/{courseCode}")
     @ResponseStatus(HttpStatus.OK)
     public Course getCourseByCode(@PathVariable String courseCode) {
         return courseService.getCourseByCode(courseCode).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));
     }
}
