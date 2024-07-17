package com.ironhack.student_catalog_service.controller;

import com.ironhack.student_catalog_service.model.*;
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

    @GetMapping("/course/{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Catalog getCatalogByCourseCode(@PathVariable String courseCode) {
        // Retrieve the course information based on course code
        Course course = restTemplate.getForObject("http://grades-data-service/courses/" + courseCode, Course.class);
        if (course == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found");
        }

        // Retrieve all grades for the specified course
        Grade[] grades = restTemplate.getForObject("http://grades-data-service/grades/course/" + courseCode, Grade[].class);
        if (grades == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Grades not found for course");
        }

        // Retrieve all students
        Student[] students = restTemplate.getForObject("http://student-info-service/students", Student[].class);
        if (students == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Students not found");
        }

        // Map each grade to a student and compile into StudentGrade objects
        List<StudentGrade> studentGrades = new ArrayList<>();
        for (Grade grade : grades) {
            Student student = findStudentById(students, grade.getStudentId());
            if (student != null) {
                studentGrades.add(new StudentGrade(student.getName(), student.getAge(), grade.getGrade()));
            }
        }
        // Return a catalog containing the course name and the list of student grades
        return new Catalog(course.getCourseName(), studentGrades);
    }

    private Student findStudentById(Student[] students, String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

}
