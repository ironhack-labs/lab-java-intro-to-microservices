package com.example.Microlab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentGrade {
    private String studentName;
    private Integer studentGrade;
    private int studentAge;

}
