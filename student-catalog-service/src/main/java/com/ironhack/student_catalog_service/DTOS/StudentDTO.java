package com.ironhack.student_catalog_service.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
    private Long studentId;
    private String studentName;
    private int studentAge;
}