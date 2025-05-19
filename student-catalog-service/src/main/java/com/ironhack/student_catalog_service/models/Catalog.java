package com.ironhack.student_catalog_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Catalog {

    private String courseName;
    private List<StudentGrade> studentGrades;
}
