package com.ironhack.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    //private int id;
    private String courseCode;
    private String courseName;
    private Set<Grade> grades;
}