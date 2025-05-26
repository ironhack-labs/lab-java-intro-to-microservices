package com.ironhack.student_info_service.repositories;

import com.ironhack.student_info_service.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface will automatically provide CRUD operations for the Student entity
    // You can add custom query methods if needed
}
