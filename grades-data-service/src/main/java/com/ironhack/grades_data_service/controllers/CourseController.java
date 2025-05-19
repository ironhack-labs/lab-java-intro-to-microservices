package com.ironhack.grades_data_service.controllers;

import com.ironhack.grades_data_service.DTOS.CourseGradeDTO;
import com.ironhack.grades_data_service.models.Course;
import com.ironhack.grades_data_service.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/{courseCode}")
    public ResponseEntity<Course> getCourse(@PathVariable Long courseCode) {
        Course course = courseService.getCourseByCode(courseCode);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/{courseCode}/grade")
    public ResponseEntity<CourseGradeDTO> getGradesForCourse(@PathVariable Long courseCode) {
        CourseGradeDTO grades = courseService.getCourseGrade(courseCode);
        return new ResponseEntity<>(grades, HttpStatus.OK);
    }

}


