package com.ironhack.grades_data_service.repositories;

import com.ironhack.grades_data_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
