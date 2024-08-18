package com.ironhack.microservicesgrades.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Course {

    @Id
    private Integer courseCode;
    private String courseName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "courses_grades",
            joinColumns = {@JoinColumn(name = "course_code")},
            inverseJoinColumns = {@JoinColumn(name = "grade_id")}
    )
            public abstract List<Grade> getGrades();
}
