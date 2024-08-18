package com.ironhack.microservicesgrades.repository;

import com.ironhack.microservicesgrades.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, String> {
}
