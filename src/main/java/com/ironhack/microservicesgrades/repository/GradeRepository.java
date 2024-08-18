package com.ironhack.microservicesgrades.repository;

import com.ironhack.microservicesgrades.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findByStudentId(Integer studentId);
    List<Grade> findByCourseCode(String courseCode);
}
