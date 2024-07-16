package com.microservice.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {
    private String courseName;
    private List<StudentGrade> studentsGrades;
}
