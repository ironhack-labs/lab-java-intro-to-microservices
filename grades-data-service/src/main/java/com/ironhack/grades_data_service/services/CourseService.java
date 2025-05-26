package com.ironhack.grades_data_service.services;

import com.ironhack.grades_data_service.dto.CourseGrade;
import com.ironhack.grades_data_service.dto.StudentDto;
import com.ironhack.grades_data_service.models.Course;
import com.ironhack.grades_data_service.models.Grade;
import com.ironhack.grades_data_service.repositories.CourseRepository;
import com.ironhack.grades_data_service.repositories.GradeRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public List<CourseGrade> getGradesByCourseCode(String courseCode) {
        Course course = courseRepository.findById(courseCode).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));
        List<Grade> grades = gradeRepository.findByCourse(course);


        List<StudentDto> students = new ArrayList<>();


        List<CourseGrade> courseGrades = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            CourseGrade courseGrade = new CourseGrade();
            Grade currentGrade = grades.get(i);
            courseGrade.setGrade(currentGrade.getGrade());
            courseGrade.setCourseName(currentGrade.getCourse().getName());

           StudentDto currentStudent = restTemplate.getForObject("http://student-info-service/students/2" , StudentDto.class);
//
            if (currentStudent != null) {
                courseGrade.setAge(currentStudent.getAge());
                courseGrade.setName(currentStudent.getName());
            }

            courseGrades.add(courseGrade);
        }
        return courseGrades;
    }

    public Optional<Course> getCourseByCode(String courseCode) {
        return courseRepository.findById(courseCode);
    }
}
