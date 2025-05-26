package com.ironhack.grades_data_service.repositories;

import com.ironhack.grades_data_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
    // Custom query methods can be defined here if needed
    // For example, findByName(String name) or findByCredits(int credits)
}
