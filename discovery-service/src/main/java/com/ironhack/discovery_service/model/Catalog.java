package com.ironhack.discovery_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {
    private String studentName;
    private List<StudentGrade> studentGrades;

}
