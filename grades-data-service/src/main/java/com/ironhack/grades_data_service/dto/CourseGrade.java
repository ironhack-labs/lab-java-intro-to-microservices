package com.ironhack.grades_data_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGrade {
    private String courseName;
    private float grade;
    private String name;
    private int age;
}
