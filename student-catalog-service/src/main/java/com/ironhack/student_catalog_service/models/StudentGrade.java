package com.ironhack.student_catalog_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentGrade {

    private String studentName;
    private int studentAge;
    private Double grade;

}
