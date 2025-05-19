package com.ironhack.grades_data_service.repositories;

import com.ironhack.grades_data_service.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByCourse_CourseCode(Long courseCode);

}
