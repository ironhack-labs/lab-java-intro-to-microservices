package com.ironhack.grades_data_service.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeId;
    private Double grade;
    private Long studentId;

    @ManyToOne
    @JoinColumn(name = "course_code")
    @JsonIgnore
    private Course course;
}
