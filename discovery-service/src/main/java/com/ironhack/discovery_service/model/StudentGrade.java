package com.ironhack.discovery_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentGrade {
    private Integer studentId;
    private List<Grade> grades;
}
