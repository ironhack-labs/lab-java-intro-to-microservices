package com.ironhack.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
        private int grade;
        private String studentId;
    }
