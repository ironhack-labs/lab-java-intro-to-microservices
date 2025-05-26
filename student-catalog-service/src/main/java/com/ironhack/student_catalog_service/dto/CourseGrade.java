package com.ironhack.student_catalog_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGrade {
    private String courseName;
    private float grade;
    private String name;
    private int age;
}

