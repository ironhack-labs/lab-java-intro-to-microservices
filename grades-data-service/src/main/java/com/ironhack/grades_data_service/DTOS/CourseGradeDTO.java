package com.ironhack.grades_data_service.DTOS;

import com.ironhack.grades_data_service.models.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseGradeDTO {
    private String courseName;
    private List<Grade> grades;


}
