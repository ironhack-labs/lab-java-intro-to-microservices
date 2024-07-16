package com.microservice.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeList {

    private Integer gradeId;
    private List<Grade> grades = new ArrayList<>();

}

