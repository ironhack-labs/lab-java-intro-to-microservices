package com.example.Microlab.service;

import com.example.Microlab.DTO.CourseGrade;
import com.example.Microlab.model.Grade;
import com.example.Microlab.repository.CourseRepository;
import com.example.Microlab.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CourseService implements CourseServiceInterface {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    GradeRepository gradeRepository;

    public CourseGrade getCourseGrades int userId){
        Optional<Course> userFromDb =  courseRepository.findById(courseId);
        if(courseFromDb.isPresent()){
            List<Grade> courseGrades = courseFromDb.get().getGrades();
            return new CourseGrade(courseId,courseGrades);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Course not found");
        }
    }

    public void addGradeToCourse(Integer gradeId, Integer courseId) {
        Course course = courseRepository.findById(courseId).get();
        Grade rating = gradeRepository.findById(courseId).get();
        course.getGrades().add(grade);
        courseRepository.save(course);
    }
}
