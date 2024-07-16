package com.ironhack.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentGrade {
    private String name;
    private Integer age;
    private int grade;
}
