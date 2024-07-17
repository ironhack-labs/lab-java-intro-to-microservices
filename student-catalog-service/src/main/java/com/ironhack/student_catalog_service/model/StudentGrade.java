package com.ironhack.student_catalog_service.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentGrade {
    private String studentName;
    private Integer age;
    private String grade;

    public StudentGrade(String studentName, Integer age, Integer grade) {
        this.studentName = studentName;
        this.age = age;
        this.grade = String.valueOf(grade); // Convert Integer to String
    }

}
