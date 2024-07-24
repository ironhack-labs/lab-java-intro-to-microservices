package com.ironhack.microservice.Service;

import com.ironhack.microservice.Model.Course;
import com.ironhack.microservice.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course getCourseByCode(String courseCode) {
        return courseRepository.findById(courseCode).orElse(null);
    }
}
