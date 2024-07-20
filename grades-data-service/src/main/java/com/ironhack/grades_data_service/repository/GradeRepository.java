package com.ironhack.grades_data_service.repository;

import java.util.List;
import com.ironhack.grades_data_service.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByCourseCode(String courseCode);
}