package com.ironhack.student_catalog_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalog {
    private String courseName;
    private List<StudentGrade> studentGrades;
}
