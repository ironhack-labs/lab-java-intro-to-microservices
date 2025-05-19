package com.ironhack.student_catalog_service.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GradeDTO {
    private Long gradeId;
    private Double grade;
    private Long studentId;
}