package com.example.Microlab.DTO;

import com.example.Microlab.model.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseGrade {
    private Integer gradeId;
    private List<Grade> grades;

}
