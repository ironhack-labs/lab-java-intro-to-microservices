package com.ironhack.student_catalog_service.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseGradeDTO {
    private String courseName;
    private List<GradeDTO> grades;
}