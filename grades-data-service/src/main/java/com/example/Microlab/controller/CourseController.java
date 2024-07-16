package com.example.Microlab.controller;

import com.example.Microlab.DTO.CourseGrade;
import com.example.Microlab.model.Course;
import com.example.Microlab.repository.CourseRepository;
import com.example.Microlab.service.CourseService;
import com.example.Microlab.service.CourseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class CourseController {
    @Autowired
    CourseServiceInterface courseService;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/course/{courseId}")
    @ResponseStatus(HttpStatus.OK)
    public Course getCourseById(@PathVariable Integer courseId) {
        return courseRepository.findById(Long.valueOf(courseId)).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong course id"));
    }
    @GetMapping("/users/{courseId}/grades")
    @ResponseStatus(HttpStatus.OK)
    public CourseGrade getCourseGrades(@PathVariable Integer courseId) {
        return courseService.getCourseGrade(Integer, courseId);
    }

