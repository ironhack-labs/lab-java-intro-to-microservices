package com.example.Microlab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String courseCode;
    private String courseName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (
            name= "course_grade",
            joinColumns = { @JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "grade_id")}
    )
    private List<Grade> grades;
}
