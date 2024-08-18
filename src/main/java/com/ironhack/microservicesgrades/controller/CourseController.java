//package com.ironhack.microservicesgrades.controller;
//
//import com.ironhack.microservicesgrades.model.Course;
//import com.ironhack.microservicesgrades.model.Grade;
//import com.ironhack.microservicesgrades.service.impl.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/courses")
//public class CourseController {
//
//        @Autowired
//        private CourseService courseService;
//
//        @GetMapping("/{courseCode}")
//        public Course getCourseByCode(@PathVariable String courseCode) {
//            return courseService.getCourseByCode(courseCode);
//        }
//
//        @GetMapping("/{courseCode}/grades")
//        public List<Grade> getGradesByCourseCode(@PathVariable String courseCode) {
//            return courseService.getGradesByCourseCode(courseCode);
//        }
//    }
