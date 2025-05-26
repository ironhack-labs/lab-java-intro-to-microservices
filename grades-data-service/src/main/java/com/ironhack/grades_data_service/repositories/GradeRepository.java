package com.ironhack.grades_data_service.repositories;

import com.ironhack.grades_data_service.models.Course;
import com.ironhack.grades_data_service.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {

    List<Grade> findByCourse(Course course);

}
