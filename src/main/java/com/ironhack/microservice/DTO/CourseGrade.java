package com.ironhack.microservice.DTO;


import com.ironhack.microservice.Model.Course;
import com.ironhack.microservice.Model.Grade;

import java.util.List;

public class CourseGrade {
    private Course course;
    private List<Grade> grades;

    // Default constructor
    public CourseGrade() {
    }

    // Parameterized constructor
    public CourseGrade(Course course, List<Grade> grades) {
        this.course = course;
        this.grades = grades;
    }

    // Getters and Setters
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}

