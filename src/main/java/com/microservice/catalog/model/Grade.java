package com.microservice.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    private Integer id;
    private Integer grade;
    private String studentId;
}
